package optiim.steps.api.aggregation;

import com.github.javafaker.Faker;
import optiim.framework.helpers.WorldHelper;
import optiim.models.api.aggregation.*;
import optiim.models.api.aggregation.corporate.BillStructure;
import optiim.models.api.aggregation.corporate.Details;
import optiim.models.api.aggregation.corporate.PaymentMethodObject;
import optiim.models.api.aggregation.corporate.PresentationMedium;
import optiim.models.data.api.ApiData;
import io.cucumber.java.DataTableType;
import org.apache.commons.lang3.RandomStringUtils;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class ResidentialCustomerCreateSteps {

    private final WorldHelper worldHelper;
    private final ApiData apiData;

    public ResidentialCustomerCreateSteps(WorldHelper worldHelper, ApiData apiData) {
        this.worldHelper = worldHelper;
        this.apiData = apiData;
    }

    @DataTableType
    public CreateAggResidentialRequest createCustomerRequest(Map<String, String> entry) throws ParseException {

        Faker faker = new Faker();
        int ramdomN = faker.number().numberBetween(0, 1);
        String sex;
        if (ramdomN == 0) {
            sex = "MALE";
        } else {
            sex = "FEMALE";
        }

        //*****old random version*****
        //String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //Random r = new Random();
        //char letter1 = abc.charAt(r.nextInt(abc.length()));
        //long number = r.nextInt(100000000);
        //char letter2 = abc.charAt(r.nextInt(abc.length()));
        //String customerNumber = ""+letter1+number+letter2;

        //*****new random version*****

        String letter1 = "";
        if(sex.equals("MALE")){
            letter1 = "J20602";
        }
        else{
            letter1 = "J25602";
        }

        String number = RandomStringUtils.randomNumeric(3);
        String letter2 = RandomStringUtils.random(1,"ABCDEFGHIJKLMNOPQRSTUVW");
        String customerNumber = ""+letter1+number+letter2;



//        if(entry.get("name").equals("Foreigner")){
//            long numberF = r.nextInt(900000000);
//            customerNumber = ""+numberF;
//        }

        CreateAggResidentialRequest createAggResidentialRequest = new CreateAggResidentialRequest();
        //*******************-customerObject-*******************//
        CustomerObject customerObject = new CustomerObject();

        List<ContactMedium> contactMediumCustomerObjectList = new ArrayList<ContactMedium>();
        ContactMedium contactMediumCustomerObject = new ContactMedium();
        contactMediumCustomerObject.setMediumType("POSTAL_ADDRESS");

        Characteristic characteristicCMCO = new Characteristic();
        characteristicCMCO.setContactType("DEFAULT_SERVICE_ADDRESS");
        //characteristicCMCO.setStreet1("TEMA");
        //characteristicCMCO.setStreet2(" ");
        //characteristicCMCO.setCity("BERAT");
        //characteristicCMCO.setCountry("ALBANIA");
        Place placeService=new Place();

        //String geoAddressId = "0cf37eda-1dd1-4472-96f1-c33f7d36d004";
        String geoAddressId = "afceebac-a044-4789-bffc-d7e8808abe82";


        placeService.setId(geoAddressId);
        //placeService.setHref("https://dgeo-api.sit2.dnext.al.vodafone.com/api/geographicAddressManagement/v4geographicAddress/0493e2e1-241c-42b6-8743-f6895886ce74");
        placeService.setHref("/api/geographicAddressManagement/v4/geographicAddress/" + geoAddressId);
        placeService.setName("DEFAULT_SERVICE_ADDRESS");
        placeService.setRole("DEFAULT_SERVICE_ADDRESS");
        List<Place> placeListService= new ArrayList<Place>();
        placeListService.add(placeService);
        characteristicCMCO.setPlace(placeListService);
        contactMediumCustomerObject.setCharacteristic(characteristicCMCO);
        //contactMediumCustomerObject.setPreferred(false);
        contactMediumCustomerObjectList.add(contactMediumCustomerObject);

        //List<ContactMedium> contactMediumCustomerObjectListEmail = new ArrayList<ContactMedium>();
        ContactMedium contactMedium1 = new ContactMedium();
        contactMedium1.setMediumType("EMAIL");
        Characteristic characteristicEmail = new Characteristic();
        characteristicEmail.setEmailAddress(faker.name().username() + "@yandex.com".toUpperCase());
        characteristicEmail.setContactType("PERSONAL_EMAIL");
        contactMedium1.setCharacteristic(characteristicEmail);
        contactMediumCustomerObjectList.add(contactMedium1);

        //List<ContactMedium> contactMediumCustomerObjectListPhone = new ArrayList<ContactMedium>();
        ContactMedium contactMedium2 = new ContactMedium();
        contactMedium2.setMediumType("PHONE");
        Characteristic characteristicMobilePhone = new Characteristic();
        characteristicMobilePhone.setPhoneNumber("666666666");
        characteristicMobilePhone.setCountry("+355");
        characteristicMobilePhone.setContactType("MOBILE_NUMBER");
        contactMedium2.setCharacteristic(characteristicMobilePhone);
        contactMediumCustomerObjectList.add(contactMedium2);


        customerObject.setContactMedium(contactMediumCustomerObjectList);

        List<optiim.models.api.aggregation.response.Characteristic> characteristicCOList = new ArrayList<optiim.models.api.aggregation.response.Characteristic>();
        optiim.models.api.aggregation.response.Characteristic characteristicCO = new optiim.models.api.aggregation.response.Characteristic();
        //characteristicCO.setBaseType("Characteristic");
        //characteristicCO.setSchemaLocation("/api/customerManagement/v4/schema/characteristic.json");
        //characteristicCO.setType("Characteristic");
        characteristicCO.setName("segment");
        String[] segmentValueList = new String[]{"Individual", "Vodafone Employee", "Vodafone VIP", "Test", "Vodafone Partners"};
        Random rnd = new Random();
        //int index =rnd.nextInt(segmentValueList.length);
        characteristicCO.setValue(segmentValueList[0]);
        //characteristicCO.setValue("Vodafone Employee");
        //characteristicCO.setValueType("string");
        characteristicCOList.add(characteristicCO);
        //customerObject.setCharacteristic(characteristicCOList);
        createAggResidentialRequest.setCustomerObject(customerObject);

        //*******************-individualObject-*******************//
//        PartyObject partyObject = new PartyObject();
        IndividualObject individualObject = new IndividualObject();
        individualObject.setGender(sex);
        individualObject.setPlaceOfBirth("BERAT");
        individualObject.setCountryOfBirth("ALBANIA");
        if(entry.get("name").equals("Foreigner")){
            individualObject.setNationality("TURKISH");

        }else{
            individualObject.setNationality("ALBANIAN");

        }
        individualObject.setBirthDate("1992-06-02T00:00:00.000Z");


        individualObject.setGivenName(faker.name().firstName().toUpperCase().replace("İ","I"));
        individualObject.setFamilyName(faker.name().lastName().toUpperCase().replace("İ","I"));

        worldHelper.setCustomerName(individualObject.getGivenName() + " " + individualObject.getFamilyName());


        List<IndividualIdentification> individualIdentificationList = new ArrayList<IndividualIdentification>();
        IndividualIdentification individualIdentification = new IndividualIdentification();
        individualIdentification.setIdentificationId(customerNumber);
        individualIdentification.setIssuingDate("2021-08-04T00:00:00.000Z");

        Attachment attachment = new Attachment();
        attachment.setAttachmentType("DOCUMENT");
        attachment.setDescription("ID");
        Size size = new Size();
        size.setAmount(1);
        size.setUnits("1");
        attachment.setSize(size);
        attachment.setName("addtochart.PNG");
        attachment.setUrl(customerNumber + "/addtochart.PNG");
        attachment.setMimeType("DOCUMENT");
        individualIdentification.setAttachment(attachment);

        individualIdentification.setIdentificationType("ID_CARD");
        individualIdentificationList.add(individualIdentification);
        individualObject.setIndividualIdentification(individualIdentificationList);
        createAggResidentialRequest.setIndividualObject(individualObject);

//        List<ContactMedium> contactMediumList = new ArrayList<ContactMedium>();

//        ContactMedium contactMedium1 = new ContactMedium();
//        contactMedium1.setMediumType("EMAIL");
//        Characteristic characteristicEmail = new Characteristic();
//        characteristicEmail.setEmailAddress(faker.name().username() + "@yandex.com".toUpperCase());
//        characteristicEmail.setContactType("PERSONAL_EMAIL");
//        contactMedium1.setCharacteristic(characteristicEmail);
//        contactMediumList.add(contactMedium1);

//        ContactMedium contactMedium2 = new ContactMedium();
//        contactMedium2.setMediumType("MOBILE_PHONE");
//        Characteristic characteristicMobilePhone = new Characteristic();
//        characteristicMobilePhone.setPhoneNumber("600000000");
//        characteristicMobilePhone.setContactType("MOBILE_NUMBER");
//        contactMedium2.setCharacteristic(characteristicMobilePhone);
//        contactMediumList.add(contactMedium2);


//        ContactMedium contactMedium3 = new ContactMedium();
//        contactMedium3.setMediumType("POSTAL_ADDRESS");
//        Characteristic characteristicPostal1 = new Characteristic();
//        characteristicPostal1.setStreet1("TEMA");
//        characteristicPostal1.setStreet2(" ");
//        characteristicPostal1.setCountry("ALBANIA");
//        characteristicPostal1.setCity("BERAT");
//        characteristicPostal1.setContactType("BILLING_ADDRESS");
//        contactMedium3.setCharacteristic(characteristicPostal1);
//        contactMedium3.setPreferred(false);
//        contactMediumList.add(contactMedium3);

//        ContactMedium contactMedium4 = new ContactMedium();
//        contactMedium4.setMediumType("POSTAL_ADDRESS");
//        Characteristic characteristicPostal2 = new Characteristic();
//        characteristicPostal2.setStreet1("TEMA");
//        characteristicPostal2.setStreet2(" ");
//        characteristicPostal2.setCity("BERAT");
//        characteristicPostal2.setCountry("ALBANIA");
//        characteristicPostal2.setContactType("SERVICE_ADDRESS");
//        contactMedium4.setCharacteristic(characteristicPostal2);
//        contactMedium4.setPreferred(false);
//        contactMediumList.add(contactMedium4);

//        individualObject.setContactMedium(contactMediumList);
//        partyObject.setIndividualObject(individualObject);

        //*******************-paymentMethodObject-*******************//
        PaymentMethodObject paymentMethodObject = new PaymentMethodObject();
        paymentMethodObject.setType("bankAccountDebit");
        Details details = new Details();
        details.setAccountNumberType("IBAN");
        details.setAccountNumber("56565555555");
        details.setOwner("TESTRES");
        details.setBank("BERAT");
        paymentMethodObject.setDetails(details);
        createAggResidentialRequest.setPaymentMethodObject(paymentMethodObject);

        //*******************-relatedPartyObject-*******************//
        RelatedPartyObject relatedPartyObject = new RelatedPartyObject();
        List<RelatedPartyObject> relatedPartyObjectList= new ArrayList<RelatedPartyObject>();
        IndividualObject individualObjectR = new IndividualObject();
        individualObjectR.setGivenName("ESER");
        individualObjectR.setFamilyName("ATTAR");

        individualObjectR.setBirthDate("1992-06-02T00:00:00.000Z");
        individualObjectR.setGender(sex);
        individualObjectR.setNationality("ALBANIAN");


        String numberLegal = RandomStringUtils.randomNumeric(3);
        String letter2Legal = RandomStringUtils.random(1,"ABCDEFGHIJKLMNOPQRSTUVW");
        String customerNumberLegal = ""+letter1+numberLegal+letter2Legal;

        List<IndividualIdentification> individualIdentificationListR = new ArrayList<IndividualIdentification>();
        IndividualIdentification individualIdentificationR = new IndividualIdentification();
        individualIdentificationR.setIdentificationId(customerNumberLegal);
        //individualIdentificationR.setIssuingDate("2021-08-04T00:00:00.000Z");
        individualIdentificationR.setIdentificationType("ATTORNEY_LETTER  ");
        individualIdentificationListR.add(individualIdentificationR);
        individualObjectR.setIndividualIdentification(individualIdentificationListR);

        relatedPartyObject.setIndividualObject(individualObjectR);


        PartyRoleObject partyRoleObject = new PartyRoleObject();

        List<Attachment> attachmentList = new ArrayList<Attachment>();
        Attachment attachmentR = new Attachment();
        attachmentR.setAttachmentType("AttorneyLetter");
        attachmentR.setDescription("NIPT");
        Size sizeR = new Size();
        sizeR.setAmount(0);
        sizeR.setUnits("KB");
        attachmentR.setSize(sizeR);
        attachmentR.setName("addtochart.PNG");
        attachmentR.setUrl(customerNumber + "/addtochart.PNG");
        attachmentR.setMimeType("DOCUMENT");
        attachmentList.add(attachmentR);

        partyRoleObject.setAttachment(attachmentList);

        RoleType roleType = new RoleType();
        roleType.setName("Legal_custodian");

        partyRoleObject.setRoleType(roleType);
        relatedPartyObject.setPartyRoleObject(partyRoleObject);
        relatedPartyObjectList.add(relatedPartyObject);
        createAggResidentialRequest.setRelatedPartyObject(relatedPartyObjectList);

        //*******************-accountObject-*******************//
//        AccountObject accountObject = new AccountObject();
//        Contact contact = new Contact();
//        List<ContactMedium> contactMediumAccountList = new ArrayList<ContactMedium>();
//        ContactMedium contactMediumAccountBilling = new ContactMedium();
//        contactMediumAccountBilling.setMediumType("POSTAL_ADDRESS");
//        Characteristic characteristicAccountBilling = new Characteristic();
//        //characteristicAccountBilling.setStreet1("TEMA");
//        //characteristicAccountBilling.setStreet2(" ");
//        //characteristicAccountBilling.setCity("BERAT");
//        //characteristicAccountBilling.setCountry("ALBANIA");
//        characteristicAccountBilling.setContactType("DEFAULT_BILLING_ADDRESS");
//        Place placeBilling =new Place();
//        placeBilling.setId(geoAddressId);
//        //placeBilling.setHref("https://dgeo-api.sit2.dnext.al.vodafone.com/api/geographicAddressManagement/v4geographicAddress/03cc51ea-7291-46ed-b6c7-cd7639603328");
//        placeBilling.setHref("/api/geographicAddressManagement/v4/geographicAddress/" + geoAddressId);
//        placeBilling.setName("DEFAULT_BILLING_ADDRESS");
//        placeBilling.setRole("DEFAULT_BILLING_ADDRESS");
//        List<Place> placeListBilling= new ArrayList<Place>();
//        placeListBilling.add(placeBilling);
//        characteristicAccountBilling.setPlace(placeListBilling);
//        contactMediumAccountBilling.setCharacteristic(characteristicAccountBilling);
//        //contactMediumAccountBilling.setPreferred(false);
//        contactMediumAccountList.add(contactMediumAccountBilling);
//        contact.setContactMedium(contactMediumAccountList);
//        List<Contact> contactList=new ArrayList<Contact>();
//        contactList.add(contact);
//        accountObject.setContact(contactList);
//        createAggResidentialRequest.setAccountObject(accountObject);

        //*******************-accountObject-*******************//
        List<optiim.models.api.aggregation.corporate.AccountObject> accountObjectList = new ArrayList<optiim.models.api.aggregation.corporate.AccountObject>();

        optiim.models.api.aggregation.corporate.AccountObject accountObjectPrepaid = new optiim.models.api.aggregation.corporate.AccountObject();
        accountObjectPrepaid.setRatingType("Prepaid");
        accountObjectPrepaid.setDescription("Prepaid Description");
        List<optiim.models.api.aggregation.corporate.Characteristic> characteristicPrepaidList = new ArrayList<optiim.models.api.aggregation.corporate.Characteristic>();
        optiim.models.api.aggregation.corporate.Characteristic characteristicPrepaid = new optiim.models.api.aggregation.corporate.Characteristic();
        characteristicPrepaid.setValue("ALL");
        characteristicPrepaid.setName("Currency");
        characteristicPrepaidList.add(characteristicPrepaid);
        accountObjectPrepaid.setCharacteristic(characteristicPrepaidList);

        optiim.models.api.aggregation.corporate.Contact contactPrepaid = new optiim.models.api.aggregation.corporate.Contact();
        List<optiim.models.api.aggregation.corporate.ContactMedium> contactMediumPrepaidList = new ArrayList<optiim.models.api.aggregation.corporate.ContactMedium>();
        optiim.models.api.aggregation.corporate.ContactMedium contactMediumPrepaid = new optiim.models.api.aggregation.corporate.ContactMedium();
        contactMediumPrepaid.setMediumType("POSTAL_ADDRESS");
        optiim.models.api.aggregation.corporate.Characteristic characteristicContactPrepaid = new optiim.models.api.aggregation.corporate.Characteristic();
        //characteristicContactPrepaid.setStreet1("TEMA");
        //characteristicContactPrepaid.setStreet2(" ");
        //characteristicContactPrepaid.setCity("BERAT");
        //characteristicContactPrepaid.setCountry("ALBANIA");
        characteristicContactPrepaid.setContactType("DEFAULT_BILLING_ADDRESS");

        Place placeBillingPrepaid = new Place();

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

        optiim.models.api.aggregation.corporate.AccountObject accountObjectPostpaid = new optiim.models.api.aggregation.corporate.AccountObject();
        accountObjectPostpaid.setRatingType("Postpaid");
        accountObjectPostpaid.setDescription("Postpaid Description");
        BillStructure billStructure = new BillStructure();

        List<PresentationMedium> presentationMediumList = new ArrayList<PresentationMedium>();
        PresentationMedium presentationMedium = new PresentationMedium();
        presentationMedium.setName("Paper");
        presentationMediumList.add(presentationMedium);
        billStructure.setPresentationMedia(presentationMediumList);
        accountObjectPostpaid.setBillStructure(billStructure);

        List<optiim.models.api.aggregation.corporate.Characteristic> characteristicList = new ArrayList<optiim.models.api.aggregation.corporate.Characteristic>();
        optiim.models.api.aggregation.corporate.Characteristic characteristic = new optiim.models.api.aggregation.corporate.Characteristic();
        characteristic.setValue("ALL");
        characteristic.setName("Currency");
        characteristicList.add(characteristic);
        accountObjectPostpaid.setCharacteristic(characteristicList);

        optiim.models.api.aggregation.corporate.Contact contactPostpaid = new optiim.models.api.aggregation.corporate.Contact();
        List<optiim.models.api.aggregation.corporate.ContactMedium> contactMediumPostpaidList = new ArrayList<optiim.models.api.aggregation.corporate.ContactMedium>();
        optiim.models.api.aggregation.corporate.ContactMedium contactMediumPostpaid = new optiim.models.api.aggregation.corporate.ContactMedium();
        contactMediumPostpaid.setMediumType("POSTAL_ADDRESS");
        optiim.models.api.aggregation.corporate.Characteristic characteristicPostpaid = new optiim.models.api.aggregation.corporate.Characteristic();
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
        //createAggResidentialRequest.setAccountObject(accountObjectList);

        return createAggResidentialRequest;
    }



//    @When("I Create Aggregated Residential Customer")
//    public void createAggregatedResidentialCustomer(CreateAggResidentialRequest createAggResidentialRequest) throws IOException {
//        CreateAggResidentialResponse createAggResidentialResponse = TestAutoApi.createAggregatedResidential(createAggResidentialRequest);
//        worldHelper.setAggregatedCustomerCreateRequest(createAggResidentialRequest);
//        worldHelper.setAggregatedCustomerCreateResponse(createAggResidentialResponse);
////        if(createAggResidentialResponse)
//        Assert.assertEquals(false,Objects.isNull(createAggResidentialResponse.getId()));
//        log.info("Api worked.");
//    }

//    @When("I Create Aggregated Foreigner Customer")
//    public void createAggregatedForeignerCustomer(CreateAggResidentialRequest createAggResidentialRequest) throws IOException {
//        CreateAggResidentialResponse createAggResidentialResponse = TestAutoApi.createAggregatedResidential(createAggResidentialRequest);
//        worldHelper.setAggregatedCustomerCreateRequest(createAggResidentialRequest);
//        worldHelper.setAggregatedCustomerCreateResponse(createAggResidentialResponse);
//        Assert.assertEquals(false,Objects.isNull(createAggResidentialResponse.getId()));
//
//        log.info("Api worked.");
//    }
}
