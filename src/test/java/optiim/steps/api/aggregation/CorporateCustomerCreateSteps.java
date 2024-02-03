package optiim.steps.api.aggregation;

import com.github.javafaker.Faker;
import optiim.framework.helpers.WorldHelper;
import optiim.models.api.aggregation.CustomerObject;
import optiim.models.api.aggregation.IndividualIdentification;
import optiim.models.api.aggregation.Place;
import optiim.models.api.aggregation.corporate.*;
import optiim.models.data.api.ApiData;
import io.cucumber.java.DataTableType;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class CorporateCustomerCreateSteps {

    private final WorldHelper worldHelper;
    private final ApiData apiData;

    public CorporateCustomerCreateSteps(WorldHelper worldHelper, ApiData apiData) {
        this.worldHelper = worldHelper;
        this.apiData = apiData;
    }

    @DataTableType
    public CreateAggCorporateRequest createCustomerRequest(Map<String, String> entry) {

        Faker faker = new Faker();
        int ramdomN = faker.number().numberBetween(0, 1);
        String sex;
        if (ramdomN == 0) {
            sex = "MALE";
        } else {
            sex = "FEMALE";
        }

        String letter1 = "";
        if (sex.equals("MALE")) {
            letter1 = "J20602";
        } else {
            letter1 = "J25602";
        }

        String number = RandomStringUtils.randomNumeric(3);
        String letter2 = RandomStringUtils.random(1, "ABCDEFGHIJKLMNOPQRSTUVW");
        String customerNumber = "" + letter1 + number + letter2;

        String letter1NIPT = RandomStringUtils.randomAlphabetic(1).toUpperCase().replace("İ", "I");
        String numberNIPT = RandomStringUtils.randomNumeric(8);
        String letter2NIPT = RandomStringUtils.randomAlphabetic(1).toUpperCase().replace("İ", "I");
        String customerNumberNIPT = "" + letter1NIPT + numberNIPT + letter2NIPT;

        CreateAggCorporateRequest createAggCorporateRequest = new CreateAggCorporateRequest();

        //*******************-relatedPartyObject-*******************//
        List<RelatedPartyObject> relatedPartyObjectList = new ArrayList<RelatedPartyObject>();
        RelatedPartyObject relatedPartyObject = new RelatedPartyObject();
        IndividualObject individualObject = new IndividualObject();
        individualObject.setGender(sex);
        individualObject.setPlaceOfBirth("BERAT");
        individualObject.setCountryOfBirth("ALBANIA");
        individualObject.setNationality("ALBANIAN");
        individualObject.setBirthDate("1992-06-02T00:00:00.000Z");
        individualObject.setGivenName(faker.name().firstName().toUpperCase().replace("İ", "I"));
        individualObject.setFamilyName(faker.name().lastName().toUpperCase().replace("İ", "I"));
        individualObject.setMiddleName("");

        worldHelper.setCustomerName(individualObject.getGivenName() + " " + individualObject.getFamilyName());

        List<IndividualIdentification> individualIdentificationList = new ArrayList<IndividualIdentification>();
        IndividualIdentification individualIdentification = new IndividualIdentification();
        individualIdentification.setIdentificationId(customerNumber);
        individualIdentification.setIssuingDate("2021-08-04T00:00:00.000Z");
        individualIdentification.setIdentificationType("AdminDoc");
        individualIdentificationList.add(individualIdentification);
        individualObject.setIndividualIdentification(individualIdentificationList);

//        List<ContactMedium> contactMediumList = new ArrayList<ContactMedium>();
//
//        ContactMedium contactMedium1 = new ContactMedium();
//        contactMedium1.setMediumType("EMAIL");
//        Characteristic characteristicEmail = new Characteristic();
//        characteristicEmail.setEmailAddress(faker.name().username() + "@yandex.com".toUpperCase());
//        characteristicEmail.setContactType("PERSONAL_EMAIL");
//        contactMedium1.setCharacteristic(characteristicEmail);
//        contactMediumList.add(contactMedium1);
//
//        ContactMedium contactMedium2 = new ContactMedium();
//        contactMedium2.setMediumType("MOBILE_PHONE");
//        Characteristic characteristicMobilePhone = new Characteristic();
//        characteristicMobilePhone.setPhoneNumber("600000000");
//        characteristicMobilePhone.setContactType("MOBILE_NUMBER");
//        contactMedium2.setCharacteristic(characteristicMobilePhone);
//        contactMediumList.add(contactMedium2);
//
//        ContactMedium contactMedium3 = new ContactMedium();
//        contactMedium3.setMediumType("communicationMethod");
//        Characteristic characteristicCEmail = new Characteristic();
//        characteristicCEmail.setContactType("Email");
//        contactMedium3.setCharacteristic(characteristicCEmail);
//        contactMediumList.add(contactMedium3);
//
//        individualObject.setContactMedium(contactMediumList);
        relatedPartyObject.setIndividualObject(individualObject);

        PartyRoleObject partyRoleObject = new PartyRoleObject();
        List<Attachment> attachmentList = new ArrayList<Attachment>();
        Attachment attachmentA = new Attachment();
        attachmentA.setAttachmentType("AdminDoc");
        attachmentA.setDescription("AdminDoc Test");
        Size sizeA = new Size();
        sizeA.setAmount(1.0);
        sizeA.setUnits("KB");
        attachmentA.setSize(sizeA);
        attachmentA.setName("addtochart.PNG");
        attachmentA.setUrl(customerNumber + "/addtochart.PNG");
        attachmentA.setMimeType("DOCUMENT");
        attachmentList.add(attachmentA);
        partyRoleObject.setAttachment(attachmentList);
        relatedPartyObject.setPartyRoleObject(partyRoleObject);

        relatedPartyObjectList.add(relatedPartyObject);
        createAggCorporateRequest.setRelatedPartyObject(relatedPartyObjectList);

        //*******************-organizationObject-*******************//
        OrganizationObject organizationObject = new OrganizationObject();
        //organizationObject.setName("TESTCORP");
        //organizationObject.setTradingName("TESTCORP");
        if (entry.get("name").equals("Institute")) {
            organizationObject.setName("TESTINS");
            organizationObject.setTradingName("TESTINS");
        } else {
            organizationObject.setName("TESTCORP");
            organizationObject.setTradingName("TESTCORP");
        }

//        List<ContactMedium> contactMediumListOB = new ArrayList<ContactMedium>();
//        ContactMedium contactMediumO1 = new ContactMedium();
//        contactMediumO1.setMediumType("POSTAL_ADDRESS");
//        Characteristic characteristicPostalO = new Characteristic();
//        characteristicPostalO.setStreet1("TEMA");
//        characteristicPostalO.setStreet2("");
//        characteristicPostalO.setCountry("ALBANIA");
//        characteristicPostalO.setCity("BERAT");
//        characteristicPostalO.setContactType("BILLING_ADDRESS");
//        contactMediumO1.setCharacteristic(characteristicPostalO);
//        contactMediumO1.setPreferred(false);
//        contactMediumListOB.add(contactMediumO1);

//        ContactMedium contactMediumO2 = new ContactMedium();
//        contactMediumO2.setMediumType("POSTAL_ADDRESS");
//        Characteristic characteristicPostalOS = new Characteristic();
//        characteristicPostalOS.setStreet1("TEMA");
//        characteristicPostalOS.setStreet2(" ");
//        characteristicPostalOS.setCountry("ALBANIA");
//        characteristicPostalOS.setCity("BERAT");
//        characteristicPostalOS.setContactType("SERVICE_ADDRESS");
//        contactMediumO2.setCharacteristic(characteristicPostalOS);
//        contactMediumO2.setPreferred(false);
//        contactMediumListOB.add(contactMediumO2);
//        organizationObject.setContactMedium(contactMediumListOB);

//        ContactMedium contactMediumO3 = new ContactMedium();
//        contactMediumO3.setMediumType("EMAIL");
//        Characteristic characteristicEmailOS = new Characteristic();
//        characteristicEmailOS.setStreet1("TEMA");
//        characteristicEmailOS.setStreet2(" ");
//        characteristicEmailOS.setCountry("ALBANIA");
//        characteristicEmailOS.setCity("BERAT");
//        characteristicEmailOS.setEmailAddress("serdar.kayis@yandex.com");
//        characteristicEmailOS.setContactType("Work Email");
//        contactMediumO3.setCharacteristic(characteristicEmailOS);
//        contactMediumO3.setPreferred(false);
//        contactMediumListOB.add(contactMediumO3);
//        organizationObject.setContactMedium(contactMediumListOB);

        List<OrganizationIdentification> organizationIdentificationList = new ArrayList<OrganizationIdentification>();
        OrganizationIdentification organizationIdentification = new OrganizationIdentification();
        organizationIdentification.setIdentificationId(customerNumberNIPT);
        organizationIdentification.setIdentificationType("NIPT");
        Attachment attachmentOI = new Attachment();
        attachmentOI.setAttachmentType("DOCUMENT");
        attachmentOI.setDescription("NIPT");
        Size sizeOI = new Size();
        sizeOI.setAmount(1.0);
        sizeOI.setUnits("KB");
        attachmentOI.setSize(sizeOI);
        attachmentOI.setName("addtochart.PNG");
        attachmentOI.setUrl(customerNumberNIPT + "/addtochart.PNG");
        attachmentOI.setMimeType("DOCUMENT");
        organizationIdentification.setAttachment(attachmentOI);
        organizationIdentificationList.add(organizationIdentification);
        organizationObject.setOrganizationIdentification(organizationIdentificationList);

        List<PartyCharacteristic> partyCharacteristicList = new ArrayList<PartyCharacteristic>();
        PartyCharacteristic characteristicBillMedia = new PartyCharacteristic();
        PartyCharacteristic characteristicIndustry = new PartyCharacteristic();
        PartyCharacteristic characteristicJuridicalInfo = new PartyCharacteristic();

        characteristicBillMedia.setName("BILLMEDIA");
        characteristicBillMedia.setValue("PAPER");
        //characteristicBillMedia.setValueType("string");

        characteristicJuridicalInfo.setName("juridicalInfo");
        //characteristicJuridicalInfo.setValue("LEGAL ENTITY- ORGANIZATION");
        //characteristicJuridicalInfo.setValueType("string");
        if (entry.get("name").equals("Institute")) {
            characteristicJuridicalInfo.setValue("PUBLIC AND OTHER INSTITUTIONS");
        } else {
            characteristicJuridicalInfo.setValue("LEGAL ENTITY- ORGANIZATION");
        }

        characteristicIndustry.setName("INDUSTRY");
        //characteristicIndustry.setValue("Construction");
        //characteristicIndustry.setValueType("string");
        if (entry.get("name").equals("Institute")) {
            characteristicIndustry.setValue("Govt & Education");
        } else {
            String[] corporateIndustryValueList = new String[]{"Finance & Insurance", "Manufacturing", "Construction", "Mining & Agriculture", "Retail & Wholesale", "Professional Services", "Accommodation & Leisure", "Transport & Logistics", "Media", "Telecoms", "Utilities", "Healthcare"};
            Random corporateIndustryRnd = new Random();
            characteristicIndustry.setValue(corporateIndustryValueList[corporateIndustryRnd.nextInt(corporateIndustryValueList.length)]);
        }

        partyCharacteristicList.add(characteristicBillMedia);
        partyCharacteristicList.add(characteristicIndustry);
        partyCharacteristicList.add(characteristicJuridicalInfo);
        organizationObject.setPartyCharacteristic(partyCharacteristicList);
        createAggCorporateRequest.setOrganizationObject(organizationObject);

        //*******************-accountObject-*******************//
        List<AccountObject> accountObjectList = new ArrayList<AccountObject>();

        AccountObject accountObjectPrepaid = new AccountObject();
        accountObjectPrepaid.setRatingType("Prepaid");
        accountObjectPrepaid.setDescription("Prepaid Description");
        List<Characteristic> characteristicPrepaidList = new ArrayList<Characteristic>();
        Characteristic characteristicPrepaid = new Characteristic();
        characteristicPrepaid.setValue("ALL");
        characteristicPrepaid.setName("Currency");
        characteristicPrepaidList.add(characteristicPrepaid);
        accountObjectPrepaid.setCharacteristic(characteristicPrepaidList);

        Contact contactPrepaid = new Contact();
        List<ContactMedium> contactMediumPrepaidList = new ArrayList<ContactMedium>();
        ContactMedium contactMediumPrepaid = new ContactMedium();
        contactMediumPrepaid.setMediumType("POSTAL_ADDRESS");
        Characteristic characteristicContactPrepaid = new Characteristic();
        //characteristicContactPrepaid.setStreet1("TEMA");
        //characteristicContactPrepaid.setStreet2(" ");
        //characteristicContactPrepaid.setCity("BERAT");
        //characteristicContactPrepaid.setCountry("ALBANIA");
        characteristicContactPrepaid.setContactType("DEFAULT_BILLING_ADDRESS");

        Place placeBillingPrepaid = new Place();

        //String geoAddressId = "0cf37eda-1dd1-4472-96f1-c33f7d36d004";
        String geoAddressId = "afceebac-a044-4789-bffc-d7e8808abe82";

        placeBillingPrepaid.setId(geoAddressId);
        //placeBillingPrepaid.setHref("https://dgeo-api.sit2.dnext.al.vodafone.com/api/geographicAddressManagement/v4geographicAddress/03cc51ea-7291-46ed-b6c7-cd7639603328");
        placeBillingPrepaid.setHref("/api/geographicAddressManagement/v4/geographicAddress/"+ geoAddressId);
        placeBillingPrepaid.setName("DEFAULT_BILLING_ADDRESS");
        placeBillingPrepaid.setRole("DEFAULT_BILLING_ADDRESS");
        List<Place> placeListBillingPrepaid = new ArrayList<Place>();
        placeListBillingPrepaid.add(placeBillingPrepaid);
        characteristicContactPrepaid.setPlace(placeListBillingPrepaid);

        contactMediumPrepaid.setCharacteristic(characteristicContactPrepaid);
        //contactMediumPrepaid.setPreferred(false);
        contactMediumPrepaidList.add(contactMediumPrepaid);
        contactPrepaid.setContactMedium(contactMediumPrepaidList);
        accountObjectPrepaid.setContact(contactPrepaid);

        AccountObject accountObjectPostpaid = new AccountObject();
        accountObjectPostpaid.setRatingType("Postpaid");
        accountObjectPostpaid.setDescription("Postpaid Description");
        BillStructure billStructure = new BillStructure();

        List<PresentationMedium> presentationMediumList = new ArrayList<PresentationMedium>();
        PresentationMedium presentationMedium = new PresentationMedium();
        presentationMedium.setName("Paper");
        presentationMediumList.add(presentationMedium);
        billStructure.setPresentationMedia(presentationMediumList);
        accountObjectPostpaid.setBillStructure(billStructure);

        List<Characteristic> characteristicList = new ArrayList<Characteristic>();
        Characteristic characteristic = new Characteristic();
        characteristic.setValue("ALL");
        characteristic.setName("Currency");
        characteristicList.add(characteristic);
        accountObjectPostpaid.setCharacteristic(characteristicList);

        Contact contactPostpaid = new Contact();
        List<ContactMedium> contactMediumPostpaidList = new ArrayList<ContactMedium>();
        ContactMedium contactMediumPostpaid = new ContactMedium();
        contactMediumPostpaid.setMediumType("POSTAL_ADDRESS");
        Characteristic characteristicPostpaid = new Characteristic();
        characteristicPostpaid.setContactType("DEFAULT_BILLING_ADDRESS");
        //characteristicPostpaid.setStreet1("TEMA");
        //characteristicPostpaid.setStreet2(" ");
        //characteristicPostpaid.setCity("BERAT");
        //characteristicPostpaid.setCountry("ALBANIA");
        Place placeBillingPostpaid = new Place();
        placeBillingPostpaid.setId(geoAddressId);
        //placeBillingPostpaid.setHref("https://dgeo-api.sit2.dnext.al.vodafone.com/api/geographicAddressManagement/v4geographicAddress/03cc51ea-7291-46ed-b6c7-cd7639603328");
        placeBillingPostpaid.setHref("/api/geographicAddressManagement/v4/geographicAddress/"+ geoAddressId);
        placeBillingPostpaid.setName("DEFAULT_BILLING_ADDRESS");
        placeBillingPostpaid.setRole("DEFAULT_BILLING_ADDRESS");
        List<Place> placeListBillingPostpaid = new ArrayList<Place>();
        placeListBillingPostpaid.add(placeBillingPostpaid);
        characteristicPostpaid.setPlace(placeListBillingPostpaid);

        contactMediumPostpaid.setCharacteristic(characteristicPostpaid);
        //contactMediumPostpaid.setPreferred(false);
        contactMediumPostpaidList.add(contactMediumPostpaid);
        contactPostpaid.setContactMedium(contactMediumPostpaidList);
        accountObjectPostpaid.setContact(contactPostpaid);

        accountObjectList.add(accountObjectPrepaid);
        accountObjectList.add(accountObjectPostpaid);
        createAggCorporateRequest.setAccountObject(accountObjectList);

        //*******************-paymentMethodObject-*******************//
        PaymentMethodObject paymentMethodObject = new PaymentMethodObject();
        paymentMethodObject.setType("bankAccountDebit");
        Details details = new Details();
        details.setAccountNumberType("IBAN");
        details.setAccountNumber("56565555555");
        details.setOwner("TESTCORP");
        details.setBank("BERAT");
        paymentMethodObject.setDetails(details);
        createAggCorporateRequest.setPaymentMethodObject(paymentMethodObject);

        //*******************-customerObject-*******************//
        CustomerObject customerObject = new CustomerObject();
        List<optiim.models.api.aggregation.ContactMedium> contactMediumCustomerObjectList = new ArrayList<optiim.models.api.aggregation.ContactMedium>();
        optiim.models.api.aggregation.ContactMedium contactMediumServiceAdress = new optiim.models.api.aggregation.ContactMedium();
        contactMediumServiceAdress.setMediumType("POSTAL_ADDRESS");
        optiim.models.api.aggregation.Characteristic characteristicServiceAdress = new optiim.models.api.aggregation.Characteristic();
        characteristicServiceAdress.setContactType("DEFAULT_SERVICE_ADDRESS");
        //characteristicCustomerObject.setStreet1("TEMA");
        //characteristicCustomerObject.setStreet2(" ");
        //characteristicCustomerObject.setCity("BERAT");
        //characteristicCustomerObject.setCountry("ALBANIA");
        Place placeService = new Place();
        placeService.setId(geoAddressId);
        //placeService.setHref("https://dgeo-api.sit2.dnext.al.vodafone.com/api/geographicAddressManagement/v4geographicAddress/0493e2e1-241c-42b6-8743-f6895886ce74");
        placeService.setHref("/api/geographicAddressManagement/v4/geographicAddress/"+ geoAddressId);
        placeService.setName("DEFAULT_SERVICE_ADDRESS");
        placeService.setRole("DEFAULT_SERVICE_ADDRESS");
        List<Place> placeListService = new ArrayList<Place>();
        placeListService.add(placeService);
        characteristicServiceAdress.setPlace(placeListService);

        contactMediumServiceAdress.setCharacteristic(characteristicServiceAdress);
        //contactMediumCustomerObject.setPreferred(false);
        contactMediumCustomerObjectList.add(contactMediumServiceAdress);

        optiim.models.api.aggregation.ContactMedium contactMediumEmail = new optiim.models.api.aggregation.ContactMedium();
        contactMediumEmail.setMediumType("EMAIL");
        optiim.models.api.aggregation.Characteristic characteristicEmail = new optiim.models.api.aggregation.Characteristic();
        characteristicEmail.setEmailAddress(faker.name().username().toUpperCase() + "@yandex.com".toUpperCase());
        characteristicEmail.setContactType("PERSONAL_EMAIL");
        contactMediumEmail.setCharacteristic(characteristicEmail);
        //contactMediumEmail.setPreferred(false);
        contactMediumCustomerObjectList.add(contactMediumEmail);

        optiim.models.api.aggregation.ContactMedium contactMediumMobilePhone = new optiim.models.api.aggregation.ContactMedium();
        contactMediumMobilePhone.setMediumType("PHONE");
        optiim.models.api.aggregation.Characteristic characteristicMobilePhone = new optiim.models.api.aggregation.Characteristic();
        characteristicMobilePhone.setPhoneNumber("666666666");
        characteristicMobilePhone.setCountry("+355");
        characteristicMobilePhone.setContactType("MOBILE_NUMBER");
        contactMediumMobilePhone.setCharacteristic(characteristicMobilePhone);
        contactMediumCustomerObjectList.add(contactMediumMobilePhone);

        optiim.models.api.aggregation.ContactMedium contactMediumCommunication = new optiim.models.api.aggregation.ContactMedium();
        contactMediumCommunication.setMediumType("communicationMethod");
        optiim.models.api.aggregation.Characteristic characteristicComminication = new optiim.models.api.aggregation.Characteristic();
        //characteristicComminication.setContactType("Wireless Message");

        String[] comminicationMethodValueList = new String[]{"Sales Visit", "MOBILE_PHONE", "Direct Mail", "Email", "Wireless Message", "SMS", "Fax"};
        Random comminicationMethodRnd = new Random();
        characteristicComminication.setContactType(comminicationMethodValueList[comminicationMethodRnd.nextInt(comminicationMethodValueList.length)]);

        contactMediumCommunication.setCharacteristic(characteristicComminication);
        contactMediumCustomerObjectList.add(contactMediumCommunication);

        optiim.models.api.aggregation.ContactMedium contactMediumWorkPhone = new optiim.models.api.aggregation.ContactMedium();
        contactMediumWorkPhone.setMediumType("PHONE");
        optiim.models.api.aggregation.Characteristic characteristicWorkPhone = new optiim.models.api.aggregation.Characteristic();
        characteristicWorkPhone.setPhoneNumber("666666666");
        characteristicWorkPhone.setCountry("+355");
        characteristicWorkPhone.setContactType("WORK_NUMBER");
        contactMediumWorkPhone.setCharacteristic(characteristicWorkPhone);
        contactMediumCustomerObjectList.add(contactMediumWorkPhone);

        customerObject.setContactMedium(contactMediumCustomerObjectList);

        List<optiim.models.api.aggregation.response.Characteristic> characteristicCOList = new ArrayList<optiim.models.api.aggregation.response.Characteristic>();
        optiim.models.api.aggregation.response.Characteristic characteristicCO1 = new optiim.models.api.aggregation.response.Characteristic();
        optiim.models.api.aggregation.response.Characteristic characteristicCO2 = new optiim.models.api.aggregation.response.Characteristic();

        //characteristicCO2.setBaseType("Characteristic");
        //characteristicCO2.setSchemaLocation("/api/customerManagement/v4/schema/characteristic.json");
        //characteristicCO2.setType("Characteristic");
        //characteristicCO2.setValueType("string");
        characteristicCO2.setName("customerType");
        //characteristicCO2.setValue("Business");
        if (entry.get("name").equals("Institute")) {
            characteristicCO2.setValue("Government");
        } else {
            characteristicCO2.setValue("Business");
        }

        //characteristicCO1.setBaseType("Characteristic");
        //characteristicCO1.setSchemaLocation("/api/customerManagement/v4/schema/characteristic.json");
        //characteristicCO1.setType("Characteristic");
        //characteristicCO1.setValueType("string");
        characteristicCO1.setName("segment");
        //characteristicCO1.setValue("SOHO");
        if (entry.get("name").equals("Institute")) {
            //String[] instituteSegmentValueList = new String[]{"Diplomatic Courp", "Public Institution", "Central State Agencies", "Army", "State Police", "Religious Foundations", "Other"};
            //Random instituteSegmentRnd = new Random();
            characteristicCO1.setValue("Public Institution");
        } else {
            //String[] corporateSegmentValueList = new String[]{"Corporate", "SME", "SOHO", "Test"};
            //hata çözüldükten sonra aşağıdaki liste işleme alınabilir.
            //String[] corporateSegmentValueList = new String[]{"Corporate", "SME", "SOHO", "Test", "VIP","Vodafone Partners", "Other Business"};
            //Random corporateSegmentRnd = new Random();
            characteristicCO1.setValue("Corporate");
        }

        characteristicCOList.add(characteristicCO2);
        characteristicCOList.add(characteristicCO1);
        //customerObject.setCharacteristic(characteristicCOList);
        createAggCorporateRequest.setCustomerObject(customerObject);

        return createAggCorporateRequest;
    }

//    @When("I Create Aggregated Corporate Customer")
//    public void createAggregatedCorporateCustomer(CreateAggCorporateRequest createAggCorporateRequest) throws IOException {
//        CreateAggCorporateResponse createAggCorporateResponse = TestAutoApi.createAggregatedCorporate(createAggCorporateRequest);
//        worldHelper.setCreateAggCorporateRequest(createAggCorporateRequest);
//        worldHelper.setCreateAggCorporateResponse(createAggCorporateResponse);
//        Assert.assertEquals(false, Objects.isNull(createAggCorporateResponse.getId()));
//        log.info("Api worked.");
//    }

//    @When("I Create Aggregated Institute Customer")
//    public void createAggregatedInstituteCustomer(CreateAggCorporateRequest createAggCorporateRequest) throws IOException {
//        CreateAggCorporateResponse createAggCorporateResponse = TestAutoApi.createAggregatedCorporate(createAggCorporateRequest);
//        worldHelper.setCreateAggCorporateRequest(createAggCorporateRequest);
//        worldHelper.setCreateAggCorporateResponse(createAggCorporateResponse);
//        Assert.assertEquals(false, Objects.isNull(createAggCorporateResponse.getId()));
//        log.info("Api worked.");
//    }
}