package optiim.steps.api.customermanagement;

import optiim.api.testauto.TestAutoApi;
import optiim.framework.helpers.ApiHelper;
import optiim.framework.helpers.WorldHelper;
import optiim.framework.utils.log;
import optiim.models.api.customermanagement.*;
import optiim.models.api.customermanagement.RelatedParty;
import optiim.models.data.api.ApiData;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CustomerManagementSteps extends ApiHelper {

    private final WorldHelper worldHelper;
    private final ApiData apiData;

    public CustomerManagementSteps(WorldHelper worldHelper, ApiData apiData) {
        this.worldHelper = worldHelper;
        this.apiData = apiData;
    }


    @When("I Land Customer Management Page {string}")
    public void landingPage(String page) throws IOException {
        int responseCode = TestAutoApi.landPage(page);
        Assert.assertEquals(responseCode, 200, "Api did not work successfully. Incoming Status Code:" + responseCode);
        log.info("Api worked successfully.");
    }

    @When("I Customer List Offset {string}")
    public void getCustomerList(String offset) throws IOException {
        int responseCode = TestAutoApi.getCustomerList(offset);
        Assert.assertEquals(responseCode, 206, "Api did not work successfully. Incoming Status Code:" + responseCode);
        log.info("Api worked successfully.");
    }

    @When("I Customer Search via New Customer Creation {string}")
    public void customerSearchViaNewCustomerCreation(String customerNumber) throws IOException {
        int responseCode = TestAutoApi.customerSearchViaNewCustomerCreation(customerNumber);
        Assert.assertEquals(responseCode, 200, "Api did not work successfully. Incoming Status Code:" + responseCode);
        log.info("Api worked successfully.");
    }

    @When("I Get Related Party {string}")
    public void getPartySearch(String relatedParty) throws IOException {
        PartyManagementResponse partyManagementResponse;
        if (relatedParty.isEmpty()) {
            relatedParty = worldHelper.getNewCreateIndividualCustomerRequest().getPartyOperations().get(1).getValue().getIndividualIdentification().get(0).getIdentificationId();
            log.info(relatedParty);
            partyManagementResponse = TestAutoApi.customerSearchViaNewCustomerCreationExt(relatedParty);
        } else {
            partyManagementResponse = TestAutoApi.customerSearchViaNewCustomerCreationExt(relatedParty);
        }
        log.info("Api worked successfully.");
    }

    @When("I Get Billing Account {string}")
    public void getBillingAccount(String relatedParty) throws IOException {
        List<AccountManagementResponse> accountManagementResponseList;

        if (relatedParty.isEmpty()) {
            accountManagementResponseList = TestAutoApi.getBillingAccount(worldHelper.getNewCreateIndividualCustomerRequest().getPartyOperations().get(1).getValue().getIndividualIdentification().get(0).getIdentificationId());
        } else {
            accountManagementResponseList = TestAutoApi.getBillingAccount(relatedParty);
        }
        worldHelper.setAccountManagementResponseList(accountManagementResponseList);

        log.info("Api worked successfully.");
    }

    @When("I Customer Search via 360 Screen with CustomerName {string}")
    public void customerSearchVia360ScreenwithCustomerName(String customerNumber) throws IOException {
        int responseCode = 0;
        if (customerNumber.isEmpty()) {
            responseCode = TestAutoApi.customerSearchVia360ScreenwithCustomerName(worldHelper.getCustomerName());
        } else {
            responseCode = TestAutoApi.customerSearchVia360ScreenwithCustomerName(customerNumber);
        }
        Assert.assertEquals(responseCode, 200, "Api did not work successfully. Incoming Status Code:" + responseCode);
        log.info("Api worked successfully.");
    }

    @When("I Customer Search via 360 Screen with PersonelNumber {string}")
    public void customerSearchVia360ScreenwithPersonelNumber(String customerNumber) throws IOException {
        int responseCode = TestAutoApi.customerSearchVia360ScreenwithPersonelNumber(customerNumber);
        Assert.assertEquals(responseCode, 200, "Api did not work successfully. Incoming Status Code:" + responseCode);
        log.info("Api worked successfully.");
    }

    @When("I Customer Details {string}")
    public void customerDetails(String customerNumber) throws IOException {
        int responseCode = TestAutoApi.customerDetails(customerNumber);
        Assert.assertEquals(responseCode, 200, "Api did not work successfully. Incoming Status Code:" + responseCode);
        log.info("Api worked successfully.");
    }

    @When("I Create Customer {string}")
    public void createResidentialOrForeignerCustomer(String customerType) throws IOException {
        Random ran = new Random();
        long customerPostfix = ran.nextInt(10000);
        String name = "TESTRESIDENTIAL" + customerPostfix;
        worldHelper.setCustomerName(name);
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random r = new Random();
        char letter1 = abc.charAt(r.nextInt(abc.length()));
        long number = r.nextInt(100000000);
        char letter2 = abc.charAt(r.nextInt(abc.length()));
        String customerNumber = "" + letter1 + number + letter2;

        if (customerType.equals("F")) {
            long numberF = r.nextInt(900000000);
            customerNumber = "" + numberF;
        }

        AttachmentRequest attachmentRequest = new AttachmentRequest();
        attachmentRequest.setAttachmentType("ID_CARD");
        attachmentRequest.setDescription("ID_CARD - " + customerNumber);
        attachmentRequest.setName("serdar.txt");
        attachmentRequest.setUrl(customerNumber + "/serdar.txt");
        attachmentRequest.setMimeType("DOCUMENT");

        Size size = new Size();
        size.setAmount(1);
        size.setUnits("1");
        attachmentRequest.setSize(size);

        AttachmentResponse attachmentResponse = new AttachmentResponse();
        attachmentResponse = TestAutoApi.createAttachment(attachmentRequest);
        worldHelper.setAttachmentResponse(attachmentResponse);

        PartyManagementRequest pm = new PartyManagementRequest();
        pm.setGender("MALE");
        pm.setPlaceOfBirth("BERAT");
        pm.setCountryOfBirth("ALBANIA");
        if (customerType.equals("F")) {
            pm.setNationality("DANISH");
        } else {
            pm.setNationality("ALBANIAN");
        }
        pm.setBirthDate("2003-05-01T00:00:00.000Z");
        pm.setGivenName(name);
        pm.setFamilyName("KAYİS");
        pm.setMiddleName("");


        List<PartyCharacteristic> partyCharacteristicList = new ArrayList<PartyCharacteristic>();
        PartyCharacteristic partyCharacteristic = new PartyCharacteristic();
        partyCharacteristic.setName("IsCustomerInBlacklist");
        partyCharacteristic.setValue("NO");
        partyCharacteristic.setValueType("string");
        partyCharacteristicList.add(partyCharacteristic);
        pm.setPartyCharacteristic(partyCharacteristicList);

        //individual list
        List<IndividualIdentification> individualIdentificationList = new ArrayList<IndividualIdentification>();
        IndividualIdentification individualIdentification = new IndividualIdentification();
        individualIdentification.setIdentificationId(customerNumber);
        individualIdentification.setIssuingDate("2021-05-01T00:00:00.000Z");

        Attachment attachment = new Attachment();
        attachment.setId(attachmentResponse.getId());
        attachment.setHref(attachmentResponse.getHref());
        attachment.setName("serdar.txt");
        attachment.setDescription("ID_CARD - " + customerNumber);

        individualIdentification.setAttachment(attachment);
        individualIdentification.setIdentificationType("ID_CARD");
        individualIdentificationList.add(individualIdentification);
        pm.setIndividualIdentification(individualIdentificationList);

        //contact medium list
        List<ContactMedium> contactMediumList = new ArrayList<ContactMedium>();
        ContactMedium contactMedium1 = new ContactMedium();
        contactMedium1.setMediumType("EMAIL");
        Characteristic characteristic1 = new Characteristic();
        characteristic1.setEmailAddress("SERDARKAYIS@GMAIL.COM");
        characteristic1.setContactType("PERSONAL_EMAIL");
        contactMedium1.setCharacteristic(characteristic1);

        ContactMedium contactMedium2 = new ContactMedium();
        contactMedium2.setMediumType("MOBILE_PHONE");
        Characteristic characteristic2 = new Characteristic();
        characteristic2.setPhoneNumber("905309000000");
        characteristic2.setContactType("MOBILE_NUMBER");
        contactMedium2.setCharacteristic(characteristic2);

        contactMediumList.add(contactMedium1);
        contactMediumList.add(contactMedium2);
        pm.setContactMedium(contactMediumList);
        PartyManagementResponse partyManagementResponse = TestAutoApi.createPartyManagement(pm);
        worldHelper.setPartyManagementResponse(partyManagementResponse);
//        partyManagementResponse.indexOf("\"id\": ");
//        JSONObject jsonObject = new JSONObject(partyManagementResponse);
//        String partyID = jsonObject.get("id").toString();
        String partyID = partyManagementResponse.getId();
        worldHelper.setRelatedPartyID(partyID);
        CustomerManagementRequest cmr = new CustomerManagementRequest();
        cmr.setName(name + " KAYİS");
        cmr.setStatus("Prospect");

        EngagedParty engagedParty = new EngagedParty();
        engagedParty.setReferredType("Individual");
        engagedParty.setId(partyID);
        engagedParty.setHref("/api/partyManagement/v4/individual/" + partyID);
        engagedParty.setName(name + " KAYİS");
//        engagedParty.setRole("Customer");
        cmr.setEngagedParty(engagedParty);

        List<Characteristic> characteristicList = new ArrayList<Characteristic>();
        Characteristic characteristic = new Characteristic();
        characteristic.setName("customerType");
        characteristic.setValue("Residential");
        characteristic.setValueType("string");
        characteristicList.add(characteristic);
        cmr.setCharacteristic(characteristicList);

        List<ContactMedium> contactMediumList1 = new ArrayList<ContactMedium>();
        ContactMedium contactMediumCustomer1 = new ContactMedium();
        contactMediumCustomer1.setMediumType("POSTAL_ADDRESS");
        contactMediumCustomer1.setPreferred(false);
        Characteristic characteristic3 = new Characteristic();
        characteristic3.setStreet1("TEMA ADDRESS");
        characteristic3.setStreet2("");
        characteristic3.setCountry("ALBANIA");
        characteristic3.setCity("BERAT");
        characteristic3.setContactType("BILLING_ADDRESS");
        contactMediumCustomer1.setCharacteristic(characteristic3);

        ContactMedium contactMediumCustomer2 = new ContactMedium();
        contactMediumCustomer2.setMediumType("POSTAL_ADDRESS");
        contactMediumCustomer2.setPreferred(false);
        Characteristic characteristic4 = new Characteristic();
        characteristic4.setStreet1("TEMA ADDRESS");
        characteristic4.setStreet2("");
        characteristic4.setCountry("ALBANIA");
        characteristic4.setCity("BERAT");
        characteristic4.setContactType("SERVICE_ADDRESS");
        contactMediumCustomer2.setCharacteristic(characteristic4);

        contactMediumList1.add(contactMediumCustomer1);
        contactMediumList1.add(contactMediumCustomer2);
        cmr.setContactMedium(contactMediumList1);

        CustomerManagementResponse customerManagementResponse = TestAutoApi.createCustomerManagement(cmr);
        worldHelper.setCustomerManagementResponse(customerManagementResponse);
        AccountManagementRequest amr = new AccountManagementRequest();
//        amr.setName(name + " KAYİS");
        amr.setName(name);
        amr.setAccountType("InvoiceAccount");
        amr.setState("Defined");
        List<RelatedParty> relatedPartyList = new ArrayList<RelatedParty>();
        RelatedParty relatedParty = new RelatedParty();
        relatedParty.setId(customerManagementResponse.getId());
        relatedParty.setName(name);
        relatedParty.setReferredType("Customer");
        relatedParty.setRole("Customer");
        relatedParty.setHref("https://dev.dnext-vfal.com/api/customerManagement/v4/customer/" + customerManagementResponse.getId());
        relatedPartyList.add(relatedParty);
        //amr.setRelatedParty(relatedPartyList);

        AccountManagementResponse accountManagementResponse = TestAutoApi.createAccountManagement(amr);
        worldHelper.setAccountManagementResponse(accountManagementResponse);
        log.info("Api worked.");
    }


    @When("I Create Corporate Customer {string}")
    public void createCorporateCustomer(String customerType) throws IOException {
        Random ran = new Random();
        String name = "";
        long customerPostfix = ran.nextInt(10000);
        if (customerType.equals("I")) {
            name = "TESTINSTITUTE" + customerPostfix;

        } else {
            name = "TESTCORPORATE" + customerPostfix;
        }
        worldHelper.setCustomerName(name);
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random r = new Random();
        char letter1 = abc.charAt(r.nextInt(abc.length()));
        long number = r.nextInt(100000000);
        char letter2 = abc.charAt(r.nextInt(abc.length()));
        String customerNumber = "" + letter1 + number + letter2;

        AttachmentRequest attachmentRequest = new AttachmentRequest();
        attachmentRequest.setAttachmentType("ID_CARD");
        attachmentRequest.setDescription("ID_CARD - " + customerNumber);
        attachmentRequest.setName("serdar.txt");
        attachmentRequest.setUrl(customerNumber + "/serdar.txt");
        attachmentRequest.setMimeType("DOCUMENT");

        Size size = new Size();
        size.setAmount(1);
        size.setUnits("1");
        attachmentRequest.setSize(size);

        AttachmentResponse attachmentResponse = new AttachmentResponse();
        attachmentResponse = TestAutoApi.createAttachment(attachmentRequest);
        worldHelper.setAttachmentResponse(attachmentResponse);

        PartyManagementRequest pm = new PartyManagementRequest();
        pm.setGender("MALE");
        pm.setPlaceOfBirth("BERAT");
        pm.setCountryOfBirth("ALBANIA");
        pm.setNationality("ALBANIAN");
        pm.setBirthDate("2003-05-01T00:00:00.000Z");
        pm.setGivenName(name);
        pm.setFamilyName("KAYİS");
        pm.setMiddleName("");

        List<PartyCharacteristic> partyCharacteristicListNew = new ArrayList<PartyCharacteristic>();
        PartyCharacteristic partyCharacteristic = new PartyCharacteristic();
        partyCharacteristic.setName("IsCustomerInBlacklist");
        partyCharacteristic.setValue("NO");
        partyCharacteristic.setValueType("string");
        partyCharacteristicListNew.add(partyCharacteristic);
        pm.setPartyCharacteristic(partyCharacteristicListNew);

        //individual list
        List<IndividualIdentification> individualIdentificationList = new ArrayList<IndividualIdentification>();
        IndividualIdentification individualIdentification = new IndividualIdentification();
        individualIdentification.setIdentificationId(customerNumber);
        individualIdentification.setIssuingDate("2021-05-01T00:00:00.000Z");

        Attachment attachment = new Attachment();
        attachment.setId(attachmentResponse.getId());
        attachment.setHref(attachmentResponse.getHref());
        attachment.setName("serdar.txt");
        attachment.setDescription("ID_CARD - " + customerNumber);

        individualIdentification.setAttachment(attachment);
        individualIdentification.setIdentificationType("ID_CARD");
        individualIdentificationList.add(individualIdentification);
        pm.setIndividualIdentification(individualIdentificationList);

        //contact medium list
        List<ContactMedium> contactMediumList = new ArrayList<ContactMedium>();
        ContactMedium contactMedium1 = new ContactMedium();
        contactMedium1.setMediumType("EMAIL");
        Characteristic characteristic1 = new Characteristic();
        characteristic1.setEmailAddress("SERDARKAYIS@GMAIL.COM");
        characteristic1.setContactType("PERSONAL_EMAIL");
        contactMedium1.setCharacteristic(characteristic1);

        ContactMedium contactMedium2 = new ContactMedium();
        contactMedium2.setMediumType("MOBILE_PHONE");
        Characteristic characteristic2 = new Characteristic();
        characteristic2.setPhoneNumber("905309000000");
        characteristic2.setContactType("MOBILE_NUMBER");
        contactMedium2.setCharacteristic(characteristic2);

        ContactMedium contactMedium3 = new ContactMedium();
        contactMedium3.setMediumType("communicationMethod");
        Characteristic characteristicX = new Characteristic();
        characteristicX.setContactType("phone");
        contactMedium3.setCharacteristic(characteristicX);

        contactMediumList.add(contactMedium1);
        contactMediumList.add(contactMedium2);
        contactMediumList.add(contactMedium3);
        pm.setContactMedium(contactMediumList);
        PartyManagementResponse partyManagementResponse = TestAutoApi.createPartyManagement(pm);
        worldHelper.setPartyManagementResponse(partyManagementResponse);
//        partyManagementResponse.indexOf("\"id\": ");
//        JSONObject jsonObject = new JSONObject(partyManagementResponse);
//        String partyID = jsonObject.get("id").toString();
        String partyID = partyManagementResponse.getId();
        worldHelper.setRelatedPartyID(partyID);

        //Organization Create
        OrganizationRequest organizationRequest = new OrganizationRequest();
        organizationRequest.setName(name + " KAYİS");
        organizationRequest.setTradingName(name + " KAYİS");

        List<ContactMedium> contactMediumListOrg = new ArrayList<ContactMedium>();
        ContactMedium contactMediumOrg1 = new ContactMedium();
        contactMediumOrg1.setMediumType("POSTAL_ADDRESS");
        contactMediumOrg1.setPreferred(false);
        Characteristic characteristicOrg1 = new Characteristic();
        characteristicOrg1.setStreet1("TESTADDRESS1");
        characteristicOrg1.setStreet2("TESTADDRESS2");
        characteristicOrg1.setCountry("ALBANIA");
        characteristicOrg1.setCity("Berat");
        characteristicOrg1.setContactType("BILLING_ADDRESS");
        contactMediumOrg1.setCharacteristic(characteristicOrg1);
        ContactMedium contactMediumOrg2 = new ContactMedium();
        contactMediumOrg2.setMediumType("POSTAL_ADDRESS");
        contactMediumOrg2.setPreferred(false);
        Characteristic characteristicOrg2 = new Characteristic();
        characteristicOrg2.setStreet1("TESTADDRESS1");
        characteristicOrg2.setStreet2("TESTADDRESS2");
        characteristicOrg2.setCountry("ALBANIA");
        characteristicOrg2.setCity("Berat");
        characteristicOrg2.setContactType("SERVICE_ADDRESS");
        contactMediumOrg2.setCharacteristic(characteristicOrg2);

        contactMediumListOrg.add(contactMediumOrg1);
        contactMediumListOrg.add(contactMediumOrg2);
        organizationRequest.setContactMedium(contactMediumListOrg);

        List<OrganizationIdentification> organizationIdentificationList = new ArrayList<OrganizationIdentification>();
        OrganizationIdentification organizationIdentification = new OrganizationIdentification();
        organizationIdentification.setIdentificationId(customerNumber);
        organizationIdentification.setIdentificationType("CORPORATE");
        organizationIdentificationList.add(organizationIdentification);
        organizationRequest.setOrganizationIdentification(organizationIdentificationList);

        List<PartyCharacteristic> partyCharacteristicList = new ArrayList<PartyCharacteristic>();
        PartyCharacteristic partyCharacteristic1 = new PartyCharacteristic();
        PartyCharacteristic partyCharacteristic2 = new PartyCharacteristic();
        partyCharacteristic1.setName("BILLMEDIA");
        partyCharacteristic1.setValue("PAPTER");
        partyCharacteristic1.setValueType("string");
        partyCharacteristic2.setName("INDUSTRY");
        if (customerType.equals("I")) {
            partyCharacteristic2.setValue("GOVERNMENT_EDUCATION");
        } else {
            partyCharacteristic2.setValue("CONSTRUCTION");
        }
        partyCharacteristic2.setValueType("string");
        partyCharacteristicList.add(partyCharacteristic1);
        partyCharacteristicList.add(partyCharacteristic2);
        organizationRequest.setPartyCharacteristic(partyCharacteristicList);

        List<RelatedParty> relatedPartyOrgList = new ArrayList<RelatedParty>();
        RelatedParty relatedPartyOrg = new RelatedParty();
        relatedPartyOrg.setId(partyID);
        relatedPartyOrg.setName(name);
        relatedPartyOrg.setReferredType("Organization");
        relatedPartyOrg.setRole("Admin");
        relatedPartyOrgList.add(relatedPartyOrg);
        organizationRequest.setRelatedParty(relatedPartyOrgList);
        OrganizationResponse organizationResponse = TestAutoApi.createOrganizationManagement(organizationRequest);
        worldHelper.setOrganizationResponse(organizationResponse);

        CustomerManagementRequest cmr = new CustomerManagementRequest();
        cmr.setName(name + " KAYİS");
        cmr.setStatus("Prospect");

        EngagedParty engagedParty = new EngagedParty();
        engagedParty.setReferredType("Organization");
        engagedParty.setId(organizationResponse.getId());
        engagedParty.setHref("/api/partyManagement/v4/organization/" + organizationResponse.getId());
        engagedParty.setName(name + " KAYİS");
//        engagedParty.setRole("Customer");
        cmr.setEngagedParty(engagedParty);

        List<Characteristic> characteristicList = new ArrayList<Characteristic>();
        Characteristic characteristic = new Characteristic();
        characteristic.setName("customerType");
        characteristic.setValue("Corporate");
        characteristic.setValueType("string");
        characteristicList.add(characteristic);
        cmr.setCharacteristic(characteristicList);


        CustomerManagementResponse customerManagementResponse = TestAutoApi.createCustomerManagement(cmr);
        worldHelper.setCustomerManagementResponse(customerManagementResponse);
        AccountManagementRequest amr = new AccountManagementRequest();
        amr.setName(name + " KAYİS");
        amr.setAccountType("InvoiceAccount");
        amr.setState("Defined");
        List<RelatedParty> relatedPartyList = new ArrayList<RelatedParty>();
        RelatedParty relatedParty = new RelatedParty();
        relatedParty.setId(customerManagementResponse.getId());
        relatedParty.setName(name);
        relatedParty.setReferredType("Customer");
        relatedParty.setRole("Customer");
        relatedParty.setHref("https://dev.dnext-vfal.com/api/customerManagement/v4/customer/" + customerManagementResponse.getId());
        relatedPartyList.add(relatedParty);
       // amr.setRelatedParty(relatedPartyList);

        AccountManagementResponse accountManagementResponse = TestAutoApi.createAccountManagement(amr);
        worldHelper.setAccountManagementResponse(accountManagementResponse);
        log.info("Api worked.");
    }

    @And("I get Migration Customer {string}, {string}, {string}")
    public void ıGetMigrationCustomer(String customerType, String limitValue, String fieldName) throws IOException {
        List<PartyManagementIdResponse> response = TestAutoApi.getMigrationCustomer(customerType, limitValue, fieldName);

        Object getrow = response.get(0);
        String migrationCustomerId = getrow.toString().split(",")[0].split("=")[1];

        worldHelper.setMigrationCustomerId(migrationCustomerId);
    }

    @When("I get Order Completed Customer")
    public void ıGetOrderCompletedCustomer() throws IOException {
        List<PartyManagementIdResponse> response = TestAutoApi.getOrderCompletedCustomer();

        Object getrow = response.get(0);
        String orderCompletedCustomerId = getrow.toString().split(",")[2].split("=")[2].replace("}","");

        worldHelper.setMigrationCustomerId(orderCompletedCustomerId);

        log.info(worldHelper.getMigrationCustomerId());
    }
}
