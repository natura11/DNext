package optiim.steps.api.newagg;

import com.github.javafaker.Faker;
import optiim.api.testauto.TestAutoApi;
import optiim.framework.Props;
import optiim.framework.helpers.WorldHelper;
import optiim.framework.utils.log;
import optiim.models.api.newagg.common.*;
import optiim.models.api.newagg.individual.*;
import optiim.models.api.newagg.individual.response.NewIndividualCreateResponse;
import optiim.models.data.api.ApiData;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class NewIndividualCreateSteps {
    private final WorldHelper worldHelper;
    private final ApiData apiData;

    public NewIndividualCreateSteps(WorldHelper worldHelper, ApiData apiData) {
        this.worldHelper = worldHelper;
        this.apiData = apiData;
    }

    @DataTableType
    public NewCreateIndividualCustomerRequest createIndividulaRequest(Map<String, String> entry) throws ParseException {

        Faker faker = new Faker();
        int ramdomN = faker.number().numberBetween(0, 1);
        String sex;
        if (ramdomN == 0) {
            sex = "MALE";
        } else {
            sex = "FEMALE";
        }

        //*****new random version*****
        String letter = "";
        if (sex.equals("MALE")) {
            letter = "J20602";
        } else {
            letter = "J25602";
        }

        String number0 = RandomStringUtils.randomNumeric(3);
        String letter0 = RandomStringUtils.random(1, "ABCDEFGHIJKLMNOPQRSTUVW");
        String p_id = letter + number0 + letter0;

        String number1 = RandomStringUtils.randomNumeric(3);
        String letter1 = RandomStringUtils.random(1, "ABCDEFGHIJKLMNOPQRSTUVW");
        String auth0_p_id = letter + number1 + letter1;

        String number2 = RandomStringUtils.randomNumeric(3);
        String letter2 = RandomStringUtils.random(1, "ABCDEFGHIJKLMNOPQRSTUVW");
        String auth1_p_id = letter + number2 + letter2;

        String c_number = RandomStringUtils.randomNumeric(8);
        String c_id = "F" + c_number;


        String geoAdressId = Props.getProp("individual.geoAdressId");
        String marketSegmentId = Props.getProp("individual.marketSegmentId");
        String customerSegmentId = Props.getProp("individual.customerSegmentId");
        String billPresentationMediaId = Props.getProp("individual.billPresentationMediaId");
        String billingCycleSpecificationId = Props.getProp("individual.billingCycleSpecificationId");
        String auth0_partyRoleId = Props.getProp("individual.auth0_partyRoleId");
        String auth1_partyRoleId = Props.getProp("individual.auth1_partyRoleId");
        String user_partyRoleId = Props.getProp("individual.user_partyRoleId");
        String user_partnerId = Props.getProp("individual.user_partnerId");
        String creditClassId = Props.getProp("individual.creditClassId");


        String customer_provisionalId = "8raRp";//RandomStringUtils.random(5, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        String document_provisionalId = "iO1X1";//RandomStringUtils.random(5, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        String document_ebill_provisionalId = "0kfYr";//RandomStringUtils.random(5, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        String document_disability_provisionalId = "isNZS";//RandomStringUtils.random(5, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        String document_consentForm_provisionalId = "P3gME";//RandomStringUtils.random(5, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        String document_auth0_provisionalId = "5sSNT";//RandomStringUtils.random(5, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        String document_auth1_provisionalId = "QWupb";//RandomStringUtils.random(5, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        String party_customer_provisionalId = "rrDBE";//RandomStringUtils.random(5, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        String party_auth0_provisionalId = "iPj3Z";//RandomStringUtils.random(5, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        String party_auth1_provisionalId = "MHSO1";//RandomStringUtils.random(5, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        String account_prepaid_provisionalId = "yn7iE";//RandomStringUtils.random(5, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        String account_postpaid_provisionalId = "Rre1V";//RandomStringUtils.random(5, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        String partyRole_auth0_provisionalId = "LXeP9";//RandomStringUtils.random(5, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        String partyRole_auth1_provisionalId = "LxsOn";//RandomStringUtils.random(5, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        String geoAddress_provisionalId = "PDE7o";//RandomStringUtils.random(5, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        String paymentMethod_provisionalId = "Tc4FE";//RandomStringUtils.random(5, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");


        String customerGivenName = faker.name().firstName().toUpperCase().replace("İ", "I");
        String customerMiddleName = faker.name().firstName().toUpperCase().replace("İ", "I");
        String customerFamilyName = faker.name().lastName().toUpperCase().replace("İ", "I").replace("'", "T");

        String customerEMail = faker.name().username().toUpperCase().replace("İ", "I") + "@yandex.com".toUpperCase();

        worldHelper.setCustomerName(customerGivenName + " " + customerFamilyName);

        NewCreateIndividualCustomerRequest newCreateIndividualCustomerRequest = new NewCreateIndividualCustomerRequest();

        //*******************-customerOperations-*******************//
        List<CustomerOperations> customerOperationsList = new ArrayList<CustomerOperations>();
        //customerOperationObject
        CustomerOperations customerOperationsObject = new CustomerOperations();
        customerOperationsObject.setOp("post");
        customerOperationsObject.setPath("/api/customerManagement/v4/customer");
        customerOperationsObject.setProvisionalId(customer_provisionalId);
        //customerOperationObject //customerValueObject
        CustomerValue customerValueObject = new CustomerValue();
        customerValueObject.setName(worldHelper.getCustomerName());
        customerValueObject.setStatus("Prospect");
        //customerOperationObject //customerValueObject //engagedPartyObject
        EngagedParty engagedPartyObject = new EngagedParty();
        engagedPartyObject.setDerivedFrom(party_customer_provisionalId);
        customerValueObject.setEngagedParty(engagedPartyObject);
        //customerOperationObject //customerValueObject //accountList
        List<Account> accountList = new ArrayList<Account>();
        Account accountObjectPrepaid = new Account();
        accountObjectPrepaid.setDerivedFrom(account_prepaid_provisionalId);
        accountList.add(accountObjectPrepaid);
        //customerValueObject.setAccount(accountList);
        Account accountObjectPostpaid = new Account();
        accountObjectPostpaid.setDerivedFrom(account_postpaid_provisionalId);
        accountList.add(accountObjectPostpaid);
        customerValueObject.setAccount(accountList);
        //customerOperationObject //customerValueObject //characteristicList
        //(uygunluktan dolayı PartyCharacteristic kullanıldı)
        List<PartyCharacteristic> characteristicList = new ArrayList<PartyCharacteristic>();
        PartyCharacteristic characteristicObject = new PartyCharacteristic();
        characteristicObject.setName("isCustomerInAlex");
        characteristicObject.setValue("false");
        characteristicList.add(characteristicObject);
        customerValueObject.setCharacteristic(characteristicList);
        //customerOperationObject //customerValueObject //relatedPartyList
        List<RelatedParty> relatedPartyList = new ArrayList<RelatedParty>();
        //customerOperationObject //customerValueObject //relatedPartyList //0
        RelatedParty relatedPartyUserPartyRoleObject = new RelatedParty();
        relatedPartyUserPartyRoleObject.setId(user_partyRoleId);
        relatedPartyUserPartyRoleObject.setName("VATHI  GERTA");
        relatedPartyUserPartyRoleObject.setHref("/api/partyRoleManagement/v4/partyRole/" + user_partyRoleId);
        relatedPartyUserPartyRoleObject.setReferredType("PartyRole");
        relatedPartyUserPartyRoleObject.setRole("Sales Agent");
        relatedPartyList.add(relatedPartyUserPartyRoleObject);
        //customerOperationObject //customerValueObject //relatedPartyList //1
        RelatedParty relatedPartyUserPartnershipObject = new RelatedParty();
        relatedPartyUserPartnershipObject.setId(user_partnerId);
        relatedPartyUserPartnershipObject.setName("VF-Albania-Partnership");
        relatedPartyUserPartnershipObject.setHref("/api/partnershipManagement/v4/partnership/" + user_partnerId);
        relatedPartyUserPartnershipObject.setReferredType("Partner");
        relatedPartyUserPartnershipObject.setRole("Sales Partner");
        relatedPartyList.add(relatedPartyUserPartnershipObject);
        //customerOperationObject //customerValueObject //relatedPartyList //2
        RelatedParty relatedPartyObjectAuth0 = new RelatedParty();
        relatedPartyObjectAuth0.setDerivedFrom(partyRole_auth0_provisionalId);
        relatedPartyList.add(relatedPartyObjectAuth0);
        //customerValueObject.setRelatedParty(relatedPartyList);
        //customerOperationObject //customerValueObject //relatedPartyList //3
        RelatedParty relatedPartyObjectAuth1 = new RelatedParty();
        relatedPartyObjectAuth1.setDerivedFrom(partyRole_auth1_provisionalId);
        relatedPartyList.add(relatedPartyObjectAuth1);
        customerValueObject.setRelatedParty(relatedPartyList);
        //customerOperationObject //customerValueObject //contactMediumList
        List<ContactMedium> contactMediumList = new ArrayList<ContactMedium>();
        //customerOperationObject //customerValueObject //contactMediumList //0 => contactMediumPhoneObject
        ContactMedium contactMediumPhoneObject = new ContactMedium();
        contactMediumPhoneObject.setMediumType("PHONE");
        Characteristic characteristicPhoneObject = new Characteristic();
        characteristicPhoneObject.setPhoneNumber("698933127");
        characteristicPhoneObject.setCountry("+355");
        characteristicPhoneObject.setContactType("MOBILE_NUMBER");
        contactMediumPhoneObject.setCharacteristic(characteristicPhoneObject);
        contactMediumList.add(contactMediumPhoneObject);
        //customerOperationObject //customerValueObject //contactMediumList //1 => contactMediumEmailObject
        ContactMedium contactMediumEmailObject = new ContactMedium();
        contactMediumEmailObject.setMediumType("EMAIL");
        Characteristic characteristicEmailObject = new Characteristic();
        characteristicEmailObject.setEmailAddress(customerEMail);
        characteristicEmailObject.setContactType("PERSONAL_EMAIL");
        contactMediumEmailObject.setCharacteristic(characteristicEmailObject);
        contactMediumList.add(contactMediumEmailObject);
        //customerOperationObject //customerValueObject //contactMediumList //2 => contactMediumCommMethodObject
        ContactMedium contactMediumCommMethodObject = new ContactMedium();
        contactMediumCommMethodObject.setMediumType("communicationMethod");
        Characteristic characteristicCommMethodObject = new Characteristic();
        characteristicCommMethodObject.setContactType("EMAIL_SMS");
        contactMediumCommMethodObject.setCharacteristic(characteristicCommMethodObject);
        contactMediumList.add(contactMediumCommMethodObject);
        //customerOperationObject //customerValueObject //contactMediumList //3 => contactMediumAddressObject
        ContactMedium contactMediumAddressObject = new ContactMedium();
        contactMediumAddressObject.setMediumType("POSTAL_ADDRESS");
        Characteristic characteristicAddressObject = new Characteristic();
        characteristicAddressObject.setContactType("DEFAULT_SERVICE_ADDRESS");
        List<Place> placeList = new ArrayList<Place>();
        Place placeObject = new Place();
        placeObject.setDerivedFrom(geoAddress_provisionalId);
        placeObject.setRole("DEFAULT_SERVICE_ADDRESS");
        placeList.add(placeObject);
        characteristicAddressObject.setPlace(placeList);
        contactMediumAddressObject.setCharacteristic(characteristicAddressObject);
        contactMediumList.add(contactMediumAddressObject);
        customerValueObject.setContactMedium(contactMediumList);
        customerValueObject.setId(c_id);
        //
        customerOperationsObject.setValue(customerValueObject);
        customerOperationsList.add(customerOperationsObject);
        newCreateIndividualCustomerRequest.setCustomerOperations(customerOperationsList);

        //*******************-documentOperations-*******************//
        List<DocumentOperations> documentOperationsList = new ArrayList<DocumentOperations>();
        //documentOperationsList //0 => customerDocumentOperationsObject
        DocumentOperations customerDocumentOperationsObject = new DocumentOperations();
        customerDocumentOperationsObject.setOp("post");
        customerDocumentOperationsObject.setPath("/api/documentManagement/v4/attachment");
        customerDocumentOperationsObject.setProvisionalId(document_provisionalId);
        DocumentValue customerDocumentValueObject = new DocumentValue();
        customerDocumentValueObject.setAttachmentType("DOCUMENT");
        customerDocumentValueObject.setDescription("ID");
        customerDocumentValueObject.setMimeType("image/png");
        customerDocumentValueObject.setName("Turkey.png");
        Size customerDocumentSizeObject = new Size();
        customerDocumentSizeObject.setAmount(1);
        customerDocumentSizeObject.setUnits("1");
        customerDocumentValueObject.setSize(customerDocumentSizeObject);
        customerDocumentValueObject.setUrl(p_id + "/Turkey.png");
        customerDocumentOperationsObject.setValue(customerDocumentValueObject);
        documentOperationsList.add(customerDocumentOperationsObject);
        //documentOperationsList //1 => eBillDocumentOperationsObject
        DocumentOperations eBillDocumentOperationsObject = new DocumentOperations();
        eBillDocumentOperationsObject.setOp("post");
        eBillDocumentOperationsObject.setPath("/api/documentManagement/v4/attachment");
        eBillDocumentOperationsObject.setProvisionalId(document_ebill_provisionalId);
        DocumentValue eBillDocumentValueObject = new DocumentValue();
        eBillDocumentValueObject.setAttachmentType("EBillDocument");
        eBillDocumentValueObject.setDescription("E-Bill Document");
        eBillDocumentValueObject.setMimeType("image/png");
        eBillDocumentValueObject.setName("TURK-bayragi.png");
        Size eBillDocumentSizeObject = new Size();
        eBillDocumentSizeObject.setAmount(1);
        eBillDocumentSizeObject.setUnits("1");
        eBillDocumentValueObject.setSize(eBillDocumentSizeObject);
        eBillDocumentValueObject.setUrl(p_id + "/TURK-bayragi.png");
        eBillDocumentOperationsObject.setValue(eBillDocumentValueObject);
        documentOperationsList.add(eBillDocumentOperationsObject);
        //documentOperationsList //2 => disabilityDocumentOperationsObject
        DocumentOperations disabilityDocumentOperationsObject = new DocumentOperations();
        disabilityDocumentOperationsObject.setOp("post");
        disabilityDocumentOperationsObject.setPath("/api/documentManagement/v4/attachment");
        disabilityDocumentOperationsObject.setProvisionalId(document_disability_provisionalId);
        DocumentValue disabilityDocumentValueObject = new DocumentValue();
        disabilityDocumentValueObject.setAttachmentType("DisabilityForm");
        disabilityDocumentValueObject.setDescription("Disability Form for ID:" + p_id);
        disabilityDocumentValueObject.setMimeType("image/png");
        disabilityDocumentValueObject.setName("TURK-bayragi.png");
        Size disabilityDocumentSizeObject = new Size();
        disabilityDocumentSizeObject.setAmount(1);
        disabilityDocumentSizeObject.setUnits("1");
        disabilityDocumentValueObject.setSize(disabilityDocumentSizeObject);
        disabilityDocumentValueObject.setUrl(p_id + "/TURK-bayragi.png");
        disabilityDocumentOperationsObject.setValue(disabilityDocumentValueObject);
        documentOperationsList.add(disabilityDocumentOperationsObject);
        //documentOperationsList //3 => consentDocumentOperationsObject
        DocumentOperations consentDocumentOperationsObject = new DocumentOperations();
        consentDocumentOperationsObject.setOp("post");
        consentDocumentOperationsObject.setPath("/api/documentManagement/v4/attachment");
        consentDocumentOperationsObject.setProvisionalId(document_consentForm_provisionalId);
        DocumentValue consentDocumentValueObject = new DocumentValue();
        consentDocumentValueObject.setAttachmentType("ConsentForm");
        consentDocumentValueObject.setDescription("Consent Form for ID:" + p_id);
        consentDocumentValueObject.setMimeType("image/png");
        consentDocumentValueObject.setName("Turkey_8kb.png");
        Size consentDocumentSizeObject = new Size();
        consentDocumentSizeObject.setAmount(1);
        consentDocumentSizeObject.setUnits("1");
        consentDocumentValueObject.setSize(consentDocumentSizeObject);
        consentDocumentValueObject.setUrl(p_id + "/Turkey_8kb.png");
        consentDocumentOperationsObject.setValue(consentDocumentValueObject);
        documentOperationsList.add(consentDocumentOperationsObject);
        //documentOperationsList //4 => auth0DocumentOperationsObject
        DocumentOperations auth0DocumentOperationsObject = new DocumentOperations();
        auth0DocumentOperationsObject.setOp("post");
        auth0DocumentOperationsObject.setPath("/api/documentManagement/v4/attachment");
        auth0DocumentOperationsObject.setProvisionalId(document_auth0_provisionalId);
        DocumentValue auth0DocumentValueObject = new DocumentValue();
        auth0DocumentValueObject.setAttachmentType("AttorneyLetter");
        auth0DocumentValueObject.setDescription("Attorney Letter for ID: " + auth0_p_id);
        auth0DocumentValueObject.setMimeType("image/png");
        auth0DocumentValueObject.setName("Flag_of_Turkey.png");
        Size auth0DocumentSizeObject = new Size();
        auth0DocumentSizeObject.setAmount(0);
        auth0DocumentSizeObject.setUnits("KB");
        auth0DocumentValueObject.setSize(auth0DocumentSizeObject);
        auth0DocumentValueObject.setUrl(auth0_p_id + "/Flag_of_Turkey.png");
        auth0DocumentOperationsObject.setValue(auth0DocumentValueObject);
        documentOperationsList.add(auth0DocumentOperationsObject);
        //documentOperationsList //5 => auth1DocumentOperationsObject
        DocumentOperations auth1DocumentOperationsObject = new DocumentOperations();
        auth1DocumentOperationsObject.setOp("post");
        auth1DocumentOperationsObject.setPath("/api/documentManagement/v4/attachment");
        auth1DocumentOperationsObject.setProvisionalId(document_auth1_provisionalId);
        DocumentValue auth1DocumentValueObject = new DocumentValue();
        auth1DocumentValueObject.setAttachmentType("AttorneyLetter");
        auth1DocumentValueObject.setDescription("Attorney Letter for ID: " + auth1_p_id);
        auth1DocumentValueObject.setMimeType("image/png");
        auth1DocumentValueObject.setName("Flag_of_Turkey.png");
        Size auth1DocumentSizeObject = new Size();
        auth1DocumentSizeObject.setAmount(0);
        auth1DocumentSizeObject.setUnits("KB");
        auth1DocumentValueObject.setSize(auth1DocumentSizeObject);
        auth1DocumentValueObject.setUrl(auth1_p_id + "/Flag_of_Turkey.png");
        auth1DocumentOperationsObject.setValue(auth1DocumentValueObject);
        documentOperationsList.add(auth1DocumentOperationsObject);
        //
        newCreateIndividualCustomerRequest.setDocumentOperations(documentOperationsList);

        //*******************-partyOperations-*******************//
        List<PartyOperations> partyOperationsList = new ArrayList<PartyOperations>();
        //partyOperationsList //0 => customerPartyOperationsObject
        PartyOperations customerPartyOperationsObject = new PartyOperations();
        customerPartyOperationsObject.setOp("post");
        customerPartyOperationsObject.setPath("/api/partyManagement/v4/individual");
        customerPartyOperationsObject.setProvisionalId(party_customer_provisionalId);
        //partyOperationsList //0 //customerPartyValueObject
        PartyValue customerPartyValueObject = new PartyValue();
        //customerPartyValueObject.setType("Individual");
        customerPartyValueObject.setGender(sex);
        customerPartyValueObject.setPlaceOfBirth("BERAT");
        customerPartyValueObject.setCountryOfBirth("ALBANIA");

        if (entry.get("name").equals("Foreigner")) {
            customerPartyValueObject.setNationality("TURKISH");

        } else {
            customerPartyValueObject.setNationality("ALBANIAN");
        }
        //customerPartyValueObject.setNationality("ALBANIAN");

        customerPartyValueObject.setBirthDate("1992-06-02T00:00:00.000Z");
        customerPartyValueObject.setFamilyName(customerFamilyName);
        customerPartyValueObject.setGivenName(customerGivenName);
        customerPartyValueObject.setMiddleName(customerMiddleName);
        customerPartyValueObject.setFullName(worldHelper.getCustomerName());
        //partyOperationsList //0 //customerPartyValueObject //customerPartyCharacteristicList
        List<PartyCharacteristic> customerPartyCharacteristicList = new ArrayList<PartyCharacteristic>();
        //partyOperationsList //0 //customerPartyValueObject //customerPartyCharacteristicList // customerPartyCharacteristicObject0
        PartyCharacteristic customerPartyCharacteristicObject0 = new PartyCharacteristic();
        customerPartyCharacteristicObject0.setName("juridicalInfo");
        customerPartyCharacteristicObject0.setValue("INDIVIDUAL");
        customerPartyCharacteristicList.add(customerPartyCharacteristicObject0);
        //partyOperationsList //0 //customerPartyValueObject //customerPartyCharacteristicList // customerPartyCharacteristicObject1
        PartyCharacteristic customerPartyCharacteristicObject1 = new PartyCharacteristic();
        customerPartyCharacteristicObject1.setName("isCustomerInBlackList");
        customerPartyCharacteristicObject1.setValue("NO");
        customerPartyCharacteristicList.add(customerPartyCharacteristicObject1);
        //partyOperationsList //0 //customerPartyValueObject //customerPartyCharacteristicList // customerPartyCharacteristicObject2
        PartyCharacteristic customerPartyCharacteristicObject2 = new PartyCharacteristic();
        customerPartyCharacteristicObject2.setName("disableOrganization");
        customerPartyCharacteristicObject2.setValue("ABCD");
        customerPartyCharacteristicObject2.setValueType("string");
        customerPartyCharacteristicList.add(customerPartyCharacteristicObject2);
        //partyOperationsList //0 //customerPartyValueObject //customerPartyCharacteristicList // customerPartyCharacteristicObject3
        PartyCharacteristic customerPartyCharacteristicObject3 = new PartyCharacteristic();
        customerPartyCharacteristicObject3.setName("disableAgreementDoc");
        customerPartyCharacteristicObject3.setValue("YES_PRINT");
        customerPartyCharacteristicObject3.setValueType("string");
        customerPartyCharacteristicList.add(customerPartyCharacteristicObject3);
        //partyOperationsList //0 //customerPartyValueObject //customerPartyCharacteristicList // customerPartyCharacteristicObject4
        //PartyCharacteristic customerPartyCharacteristicObject4 = new PartyCharacteristic();
        //customerPartyCharacteristicObject4.setName("taxExempt");
        //customerPartyCharacteristicObject4.setValue("NO");
        //customerPartyCharacteristicList.add(customerPartyCharacteristicObject4);
        customerPartyValueObject.setPartyCharacteristic(customerPartyCharacteristicList);
        //partyOperationsList //0 //customerPartyValueObject //customerIndividualIdentificationList
        List<IndividualIdentification> customerIndividualIdentificationList = new ArrayList<IndividualIdentification>();
        //partyOperationsList //0 //customerPartyValueObject //customerIndividualIdentificationList //customerIndividualIdentificationObject
        IndividualIdentification customerIndividualIdentificationObject = new IndividualIdentification();
        customerIndividualIdentificationObject.setIdentificationId(p_id);
        customerIndividualIdentificationObject.setIssuingDate("2022-03-02T00:00:00.000Z");
        customerIndividualIdentificationObject.setIdentificationType("ID_CARD");
        //partyOperationsList //0 //customerPartyValueObject //customerIndividualIdentificationList //customerIndividualIdentificationObject //customerIndividualIdentificationAttachmentObject
        Attachment customerIndividualIdentificationAttachmentObject = new Attachment();
        customerIndividualIdentificationAttachmentObject.setDerivedFrom(document_provisionalId);
        customerIndividualIdentificationObject.setAttachment(customerIndividualIdentificationAttachmentObject);
        customerIndividualIdentificationList.add(customerIndividualIdentificationObject);
        customerPartyValueObject.setIndividualIdentification(customerIndividualIdentificationList);
        //partyOperationsList //0 //customerPartyValueObject //customerContactMediumList
        List<ContactMedium> customerContactMediumList = new ArrayList<ContactMedium>();
        //partyOperationsList //0 //customerPartyValueObject //customerContactMediumList //customerContactMediumObject
        ContactMedium customerContactMediumObject = new ContactMedium();
        customerContactMediumObject.setMediumType("disableCommunicationMethod");
        //partyOperationsList //0 //customerPartyValueObject //customerContactMediumList //customerContactMediumObject //customerContactMediumCharacteristicObject
        Characteristic customerContactMediumCharacteristicObject = new Characteristic();
        customerContactMediumCharacteristicObject.setContactType("MOBILE_PHONE");
        customerContactMediumObject.setCharacteristic(customerContactMediumCharacteristicObject);
        customerContactMediumList.add(customerContactMediumObject);
        customerPartyValueObject.setContactMedium(customerContactMediumList);
        //partyOperationsList //0 //customerPartyValueObject //customerDisabilityList
        List<Disability> customerDisabilityList = new ArrayList<Disability>();
        //partyOperationsList //0 //customerPartyValueObject //customerDisabilityList //customerDisabilityObject
        Disability customerDisabilityObject = new Disability();
        customerDisabilityObject.setDisabilityCode("3");
        customerDisabilityObject.setDisabilityName("WALKING DISABLED");
        customerDisabilityList.add(customerDisabilityObject);
        customerPartyValueObject.setDisability(customerDisabilityList);
        //partyOperationsList //0 //customerPartyValueObject //customerMarketSegmentList
        List<MarketSegment> customerMarketSegmentList = new ArrayList<MarketSegment>();
        //partyOperationsList //0 //customerPartyValueObject //customerMarketSegmentList //0 => customerMarketSegmentObject
        MarketSegment customerMarketSegmentObject = new MarketSegment();
        customerMarketSegmentObject.setId(marketSegmentId);
        customerMarketSegmentObject.setHref("/api/referenceManagement/v4/marketSegment/" + marketSegmentId);
        customerMarketSegmentObject.setName("Individual");
        customerMarketSegmentObject.setReferredType("MarketSegment");
        customerMarketSegmentList.add(customerMarketSegmentObject);
        //partyOperationsList //0 //customerPartyValueObject //customerMarketSegmentList //1 => customerCustomerSegmentObject
        MarketSegment customerCustomerSegmentObject = new MarketSegment();
        customerCustomerSegmentObject.setId(customerSegmentId);
        customerCustomerSegmentObject.setHref("/api/referenceManagement/v4/marketSegment/" + customerSegmentId);
        customerCustomerSegmentObject.setName("Consumer");
        customerCustomerSegmentObject.setReferredType("CustomerSegment");
        customerMarketSegmentList.add(customerCustomerSegmentObject);
        customerPartyValueObject.setMarketSegment(customerMarketSegmentList);
        //partyOperationsList //0 //customerPartyValueObject //customerAttachmentList
        List<Attachment> customerAttachmentList = new ArrayList<Attachment>();
        //partyOperationsList //0 //customerPartyValueObject //customerAttachmentList //0
        Attachment customerAttachmentConsentObject = new Attachment();
        customerAttachmentConsentObject.setDerivedFrom(document_consentForm_provisionalId);
        customerAttachmentList.add(customerAttachmentConsentObject);
        //partyOperationsList //0 //customerPartyValueObject //customerAttachmentList //1
        Attachment customerAttachmentDisabilityObject = new Attachment();
        customerAttachmentDisabilityObject.setDerivedFrom(document_disability_provisionalId);
        customerAttachmentList.add(customerAttachmentDisabilityObject);
        customerPartyValueObject.setAttachment(customerAttachmentList);
        customerPartyOperationsObject.setValue(customerPartyValueObject);
        //
        partyOperationsList.add(customerPartyOperationsObject);
        //partyOperationsList //1 => auth0PartyOperationsObject
        PartyOperations auth0PartyOperationsObject = new PartyOperations();
        auth0PartyOperationsObject.setOp("post");
        auth0PartyOperationsObject.setPath("/api/partyManagement/v4/individual");
        auth0PartyOperationsObject.setProvisionalId(party_auth0_provisionalId);
        //partyOperationsList //1 //auth0PartyValueObject
        PartyValue auth0PartyValueObject = new PartyValue();
        //auth0PartyValueObject.setType("Individual");
        auth0PartyValueObject.setGivenName("ESER");
        auth0PartyValueObject.setFamilyName("ATTAR");
        auth0PartyValueObject.setBirthDate("1992-06-02T00:00:00.000Z");
        auth0PartyValueObject.setGender(sex);
        auth0PartyValueObject.setNationality("ALBANIAN");
        //partyOperationsList //1 //auth0PartyValueObject //auth0IndividualIdentificationList
        List<IndividualIdentification> auth0IndividualIdentificationList = new ArrayList<IndividualIdentification>();
        //partyOperationsList //1 //auth0PartyValueObject //auth0IndividualIdentificationList //auth0IndividualIdentificationObject
        IndividualIdentification auth0IndividualIdentificationObject = new IndividualIdentification();
        auth0IndividualIdentificationObject.setIdentificationId(auth0_p_id);
        auth0IndividualIdentificationObject.setIdentificationType("ATTORNEY_LETTER");
        auth0IndividualIdentificationList.add(auth0IndividualIdentificationObject);
        auth0PartyValueObject.setIndividualIdentification(auth0IndividualIdentificationList);
        auth0PartyOperationsObject.setValue(auth0PartyValueObject);
        //
        partyOperationsList.add(auth0PartyOperationsObject);
        //partyOperationsList //2 => auth1PartyOperationsObject
        PartyOperations auth1PartyOperationsObject = new PartyOperations();
        auth1PartyOperationsObject.setOp("post");
        auth1PartyOperationsObject.setPath("/api/partyManagement/v4/individual");
        auth1PartyOperationsObject.setProvisionalId(party_auth1_provisionalId);
        //partyOperationsList //2 //auth1PartyValueObject
        PartyValue auth1PartyValueObject = new PartyValue();
        //auth1PartyValueObject.setType("Individual");
        auth1PartyValueObject.setGivenName("ENDER");
        auth1PartyValueObject.setFamilyName("LOSE");
        auth1PartyValueObject.setBirthDate("1992-06-02T00:00:00.000Z");
        auth1PartyValueObject.setGender(sex);
        auth1PartyValueObject.setNationality("ALBANIAN");
        //partyOperationsList //2 //auth1PartyValueObject //auth1IndividualIdentificationList
        List<IndividualIdentification> auth1IndividualIdentificationList = new ArrayList<IndividualIdentification>();
        //partyOperationsList //2 //auth1PartyValueObject //auth1IndividualIdentificationList //auth1IndividualIdentificationObject
        IndividualIdentification auth1IndividualIdentificationObject = new IndividualIdentification();
        auth1IndividualIdentificationObject.setIdentificationId(auth1_p_id);
        auth1IndividualIdentificationObject.setIdentificationType("ATTORNEY_LETTER");
        auth1IndividualIdentificationList.add(auth1IndividualIdentificationObject);
        auth1PartyValueObject.setIndividualIdentification(auth1IndividualIdentificationList);
        auth1PartyOperationsObject.setValue(auth1PartyValueObject);
        //
        partyOperationsList.add(auth1PartyOperationsObject);
        ////
        newCreateIndividualCustomerRequest.setPartyOperations(partyOperationsList);

        //*******************-accountOperations-*******************//
        List<AccountOperations> accountOperationsList = new ArrayList<AccountOperations>();
        //accountOperationsList //0 => accountPrepaidOperationsObject
        AccountOperations accountPrepaidOperationsObject = new AccountOperations();
        accountPrepaidOperationsObject.setOp("post");
        accountPrepaidOperationsObject.setPath("/api/accountManagement/v4/billingAccount");
        accountPrepaidOperationsObject.setProvisionalId(account_prepaid_provisionalId);
        //accountOperationsList //0 //accountPrepaidValueObject
        AccountValue accountPrepaidValueObject = new AccountValue();
        accountPrepaidValueObject.setRatingType("Prepaid");
        //accountPrepaidValueObject.setDescription("LOREM");
        //accountOperationsList //0 //accountPrepaidValueObject //accountPrepaidBillStructure
        BillStructure accountPrepaidBillStructure = new BillStructure();
        accountPrepaidBillStructure.setPreferredBillingCurrency("ALL");
        accountPrepaidValueObject.setBillStructure(accountPrepaidBillStructure);
        //accountOperationsList //0 //accountPrepaidValueObject //accountPrepaidCharacteristicList
        //(uygunluktan dolayı PartyCharacteristic kullanıldı)
        List<PartyCharacteristic> accountPrepaidCharacteristicList = new ArrayList<PartyCharacteristic>();
        PartyCharacteristic accountPrepaidCharacteristicObject = new PartyCharacteristic();
        accountPrepaidCharacteristicObject.setName("CreditClassId");
        accountPrepaidCharacteristicObject.setValue(creditClassId);
        accountPrepaidCharacteristicList.add(accountPrepaidCharacteristicObject);
        accountPrepaidValueObject.setCharacteristic(accountPrepaidCharacteristicList);
        accountPrepaidValueObject.setName("Invoice Account");
        accountPrepaidValueObject.setAccountType("InvoiceAccount");
        //accountOperationsList //0 //accountPrepaidValueObject //accountPrepaidRelatedPartyList
        List<RelatedParty> accountPrepaidRelatedPartyList = new ArrayList<RelatedParty>();
        //accountOperationsList //0 //accountPrepaidValueObject //accountPrepaidRelatedPartyList //accountPrepaidRelatedPartyObject
        RelatedParty accountPrepaidRelatedPartyObject = new RelatedParty();
        accountPrepaidRelatedPartyObject.setDerivedFrom(customer_provisionalId);
        accountPrepaidRelatedPartyList.add(accountPrepaidRelatedPartyObject);
        accountPrepaidValueObject.setRelatedParty(accountPrepaidRelatedPartyList);
        //accountOperationsList //0 //accountPrepaidValueObject //accountPrepaidContactList
        List<Contact> accountPrepaidContactList = new ArrayList<Contact>();
        //accountOperationsList //0 //accountPrepaidValueObject //accountContactList //accountPrepaidContactObject
        Contact accountPrepaidContactObject = new Contact();
        accountPrepaidContactObject.setContactType("primary");
        //
        List<ContactMedium> accountPrepaidContactMediumList = new ArrayList<ContactMedium>();
        //
        ContactMedium accountPrepaidContactMediumObject = new ContactMedium();
        accountPrepaidContactMediumObject.setMediumType("POSTAL_ADDRESS");
        //
        Characteristic accountPrepaidContactCharacteristicObject = new Characteristic();
        accountPrepaidContactCharacteristicObject.setContactType("DEFAULT_BILLING_ADDRESS");
        //
        List<Place> accountPrepaidContactPlaceList = new ArrayList<Place>();
        //
        Place accountPrepaidContactPlaceObject = new Place();
        accountPrepaidContactPlaceObject.setDerivedFrom(geoAddress_provisionalId);
        accountPrepaidContactPlaceObject.setRole("DEFAULT_BILLING_ADDRESS");
        accountPrepaidContactPlaceList.add(accountPrepaidContactPlaceObject);
        accountPrepaidContactCharacteristicObject.setPlace(accountPrepaidContactPlaceList);
        accountPrepaidContactMediumObject.setCharacteristic(accountPrepaidContactCharacteristicObject);
        accountPrepaidContactMediumList.add(accountPrepaidContactMediumObject);
        accountPrepaidContactObject.setContactMedium(accountPrepaidContactMediumList);
        //
        ValidFor accountPrepaidContactValidForObject = new ValidFor();
        accountPrepaidContactValidForObject.setStartDateTime("2022-03-23T08:17:14.866Z");
        accountPrepaidContactObject.setValidFor(accountPrepaidContactValidForObject);
        accountPrepaidContactList.add(accountPrepaidContactObject);
        accountPrepaidValueObject.setContact(accountPrepaidContactList);
        //accountOperationsList //0 //accountPrepaidValueObject //accountPrepaidDefaultPaymentMethodObject
        DefaultPaymentMethod accountPrepaidDefaultPaymentMethodObject = new DefaultPaymentMethod();
        accountPrepaidDefaultPaymentMethodObject.setDerivedFrom(paymentMethod_provisionalId);
        accountPrepaidValueObject.setDefaultPaymentMethod(accountPrepaidDefaultPaymentMethodObject);
        accountPrepaidOperationsObject.setValue(accountPrepaidValueObject);
        accountOperationsList.add(accountPrepaidOperationsObject);

        //accountOperationsList //1 => accountPostpaidOperationsObject
        AccountOperations accountPostpaidOperationsObject = new AccountOperations();
        accountPostpaidOperationsObject.setOp("post");
        accountPostpaidOperationsObject.setPath("/api/accountManagement/v4/billingAccount");
        accountPostpaidOperationsObject.setProvisionalId(account_postpaid_provisionalId);
        //accountOperationsList //1 //accountPostpaidValueObject
        AccountValue accountPostpaidValueObject = new AccountValue();
        accountPostpaidValueObject.setRatingType("Postpaid");
        accountPostpaidValueObject.setDescription("LOREM");
        BillStructure accountPostpaidBillStructureObject = new BillStructure();
        List<PresentationMedia> accountPostpaidPresentationMediaList = new ArrayList<PresentationMedia>();
        //
        PresentationMedia accountPostpaidPresentationMediaObject = new PresentationMedia();
        accountPostpaidPresentationMediaObject.setId(billPresentationMediaId);
        accountPostpaidPresentationMediaObject.setHref("/api/accountManagement/v4/billPresentationMedia/" + billPresentationMediaId);
        accountPostpaidPresentationMediaObject.setName("E-Bill");
        accountPostpaidPresentationMediaObject.setIsRef(true);
        accountPostpaidPresentationMediaList.add(accountPostpaidPresentationMediaObject);
        accountPostpaidBillStructureObject.setPresentationMedia(accountPostpaidPresentationMediaList);
        accountPostpaidBillStructureObject.setPreferredBillingCurrency("ALL");
        //
        CycleSpecification accountPostpaidCycleSpecification = new CycleSpecification();
        accountPostpaidCycleSpecification.setId(billingCycleSpecificationId);
        accountPostpaidCycleSpecification.setHref("/api/accountManagement/v4/billingCycleSpecification/" + billingCycleSpecificationId);
        accountPostpaidCycleSpecification.setName("BILLCYCLE_1");
        accountPostpaidCycleSpecification.setIsRef(true);
        accountPostpaidBillStructureObject.setCycleSpecification(accountPostpaidCycleSpecification);
        accountPostpaidValueObject.setBillStructure(accountPostpaidBillStructureObject);
        //accountOperationsList //1 //accountPostpaidValueObject //accountPostpaidCharacteristicList
        //(uygunluktan dolayı PartyCharacteristic kullanıldı)
        List<PartyCharacteristic> accountPostpaidCharacteristicList = new ArrayList<PartyCharacteristic>();
        PartyCharacteristic accountPostpaidCharacteristicObject = new PartyCharacteristic();
        accountPostpaidCharacteristicObject.setName("CreditClassId");
        accountPostpaidCharacteristicObject.setValue(creditClassId);
        accountPostpaidCharacteristicList.add(accountPostpaidCharacteristicObject);
        accountPostpaidValueObject.setCharacteristic(accountPostpaidCharacteristicList);
        accountPostpaidValueObject.setName("Invoice Account");
        accountPostpaidValueObject.setAccountType("InvoiceAccount");
        //
        List<RelatedParty> accountPostpaidRelatedPartyList = new ArrayList<RelatedParty>();
        //
        RelatedParty accountPostpaidRelatedPartyObject = new RelatedParty();
        accountPostpaidRelatedPartyObject.setDerivedFrom(customer_provisionalId);
        accountPostpaidRelatedPartyList.add(accountPostpaidRelatedPartyObject);
        accountPostpaidValueObject.setRelatedParty(accountPostpaidRelatedPartyList);
        //
        List<Contact> accountPostpaidContactList = new ArrayList<Contact>();
        //
        Contact accountPostpaidContactObject = new Contact();
        accountPostpaidContactObject.setContactType("primary");
        //
        List<ContactMedium> accountPostpaidContactMediumList = new ArrayList<ContactMedium>();
        //
        ContactMedium accountPostpaidContactMediumAddressObject = new ContactMedium();
        accountPostpaidContactMediumAddressObject.setMediumType("POSTAL_ADDRESS");
        Characteristic accountPostpaidContactAddressCharacteristicObject = new Characteristic();
        accountPostpaidContactAddressCharacteristicObject.setContactType("DEFAULT_BILLING_ADDRESS");
        List<Place> accountPostpaidContactPlaceList = new ArrayList<Place>();
        Place accountPostpaidContactPlaceObject = new Place();
        accountPostpaidContactPlaceObject.setDerivedFrom(geoAddress_provisionalId);
        accountPostpaidContactPlaceObject.setRole("DEFAULT_BILLING_ADDRESS");
        accountPostpaidContactPlaceList.add(accountPostpaidContactPlaceObject);
        accountPostpaidContactAddressCharacteristicObject.setPlace(accountPostpaidContactPlaceList);
        accountPostpaidContactMediumAddressObject.setCharacteristic(accountPostpaidContactAddressCharacteristicObject);
        accountPostpaidContactMediumList.add(accountPostpaidContactMediumAddressObject);
        //
        ContactMedium accountPostpaidContactMediumEbillPhoneObject = new ContactMedium();
        accountPostpaidContactMediumEbillPhoneObject.setMediumType("PHONE");
        Characteristic accountPostpaidContactPhoneCharacteristicObject = new Characteristic();
        accountPostpaidContactPhoneCharacteristicObject.setPhoneNumber("698933127");
        accountPostpaidContactPhoneCharacteristicObject.setCountry("+355");
        accountPostpaidContactPhoneCharacteristicObject.setContactType("EBILL_NUMBER");
        accountPostpaidContactMediumEbillPhoneObject.setCharacteristic(accountPostpaidContactPhoneCharacteristicObject);
        accountPostpaidContactMediumList.add(accountPostpaidContactMediumEbillPhoneObject);
        //
        ContactMedium accountPostpaidContactMediumEbillEmailObject = new ContactMedium();
        accountPostpaidContactMediumEbillEmailObject.setMediumType("EMAIL");
        Characteristic accountPostpaidContactEmailCharacteristicObject = new Characteristic();
        accountPostpaidContactEmailCharacteristicObject.setEmailAddress(customerEMail);
        accountPostpaidContactEmailCharacteristicObject.setContactType("EBILL_EMAIL");
        accountPostpaidContactMediumEbillEmailObject.setCharacteristic(accountPostpaidContactEmailCharacteristicObject);
        accountPostpaidContactMediumList.add(accountPostpaidContactMediumEbillEmailObject);
        accountPostpaidContactObject.setContactMedium(accountPostpaidContactMediumList);
        //
        ValidFor accountPostpaidContactValidForObject = new ValidFor();
        accountPostpaidContactValidForObject.setStartDateTime("2022-03-16T07:09:43.146Z");
        accountPostpaidContactObject.setValidFor(accountPostpaidContactValidForObject);
        accountPostpaidContactList.add(accountPostpaidContactObject);
        accountPostpaidValueObject.setContact(accountPostpaidContactList);
        //accountOperationsList //1 //accountPostpaidValueObject //accountPostpaidDefaultPaymentMethodObject
        DefaultPaymentMethod accountPostpaidDefaultPaymentMethodObject = new DefaultPaymentMethod();
        accountPostpaidDefaultPaymentMethodObject.setDerivedFrom(paymentMethod_provisionalId);
        accountPostpaidValueObject.setDefaultPaymentMethod(accountPostpaidDefaultPaymentMethodObject);
        //accountOperationsList //1 //accountPostpaidAttachmentList
        List<Attachment> accountPostpaidAttachmentList = new ArrayList<Attachment>();
        Attachment accountPostpaidAttachmentObject = new Attachment();
        accountPostpaidAttachmentObject.setDerivedFrom(document_ebill_provisionalId);
        accountPostpaidAttachmentList.add(accountPostpaidAttachmentObject);
        accountPostpaidValueObject.setAttachment(accountPostpaidAttachmentList);

        accountPostpaidOperationsObject.setValue(accountPostpaidValueObject);
        accountOperationsList.add(accountPostpaidOperationsObject);

        newCreateIndividualCustomerRequest.setAccountOperations(accountOperationsList);

        //*******************-partyRoleOperations-*******************//
        List<PartyRoleOperations> partyRoleOperationsList = new ArrayList<PartyRoleOperations>();
        //partyRoleOperationsList //0 => partyRoleOperationsAuth0Object
        PartyRoleOperations partyRoleOperationsAuth0Object = new PartyRoleOperations();
        partyRoleOperationsAuth0Object.setOp("post");
        partyRoleOperationsAuth0Object.setPath("/api/partyRoleManagement/v4/partyRole");
        partyRoleOperationsAuth0Object.setProvisionalId(partyRole_auth0_provisionalId);
        //
        PartyRoleValue partyRoleValueAuth0Object = new PartyRoleValue();
        //partyRoleValueAuth0Object.setType("PartyRole");
        partyRoleValueAuth0Object.setName("ESER ATTAR");
        //
        RoleType partyRoleAuth0RoleTypeObject = new RoleType();
        partyRoleAuth0RoleTypeObject.setId(auth0_partyRoleId);
        partyRoleAuth0RoleTypeObject.setHref("/api/partyRoleManagement/v4/roleType/" + auth0_partyRoleId);
        partyRoleAuth0RoleTypeObject.setName("Legal_Custodian");
        partyRoleValueAuth0Object.setRoleType(partyRoleAuth0RoleTypeObject);
        //
        List<Attachment> partyRoleAuth0AttachmentList = new ArrayList<Attachment>();
        //
        Attachment partyRoleAuth0AttachmentObject = new Attachment();
        partyRoleAuth0AttachmentObject.setDerivedFrom(document_auth0_provisionalId);
        partyRoleAuth0AttachmentObject.setAttachmentType("AttorneyLetter");
        partyRoleAuth0AttachmentList.add(partyRoleAuth0AttachmentObject);
        partyRoleValueAuth0Object.setAttachment(partyRoleAuth0AttachmentList);
        //
        EngagedParty partyRoleAuth0EngagedPartyObject = new EngagedParty();
        partyRoleAuth0EngagedPartyObject.setDerivedFrom(party_auth0_provisionalId);
        partyRoleValueAuth0Object.setEngagedParty(partyRoleAuth0EngagedPartyObject);
        partyRoleOperationsAuth0Object.setValue(partyRoleValueAuth0Object);
        partyRoleOperationsList.add(partyRoleOperationsAuth0Object);
        //partyRoleOperationsList //1 => partyRoleOperationsAuth1Object
        PartyRoleOperations partyRoleOperationsAuth1Object = new PartyRoleOperations();
        partyRoleOperationsAuth1Object.setOp("post");
        partyRoleOperationsAuth1Object.setPath("/api/partyRoleManagement/v4/partyRole");
        partyRoleOperationsAuth1Object.setProvisionalId(partyRole_auth1_provisionalId);
        //
        PartyRoleValue partyRoleValueAuth1Object = new PartyRoleValue();
        //partyRoleValueAuth1Object.setType("PartyRole");
        partyRoleValueAuth1Object.setName("ENDER LOSE");
        //
        RoleType partyRoleAuth1RoleTypeObject = new RoleType();
        partyRoleAuth1RoleTypeObject.setId(auth1_partyRoleId);
        partyRoleAuth1RoleTypeObject.setHref("/api/partyRoleManagement/v4/roleType/" + auth1_partyRoleId);
        partyRoleAuth1RoleTypeObject.setName("Authorized_Person");
        partyRoleValueAuth1Object.setRoleType(partyRoleAuth1RoleTypeObject);
        //
        List<Attachment> partyRoleAuth1AttachmentList = new ArrayList<Attachment>();
        //
        Attachment partyRoleAuth1AttachmentObject = new Attachment();
        partyRoleAuth1AttachmentObject.setDerivedFrom(document_auth1_provisionalId);
        partyRoleAuth1AttachmentObject.setAttachmentType("AttorneyLetter");
        partyRoleAuth1AttachmentList.add(partyRoleAuth1AttachmentObject);
        partyRoleValueAuth1Object.setAttachment(partyRoleAuth1AttachmentList);
        //
        EngagedParty partyRoleAuth1EngagedPartyObject = new EngagedParty();
        partyRoleAuth1EngagedPartyObject.setDerivedFrom(party_auth1_provisionalId);
        partyRoleValueAuth1Object.setEngagedParty(partyRoleAuth1EngagedPartyObject);

        partyRoleOperationsAuth1Object.setValue(partyRoleValueAuth1Object);
        partyRoleOperationsList.add(partyRoleOperationsAuth1Object);

        newCreateIndividualCustomerRequest.setPartyRoleOperations(partyRoleOperationsList);

        //*******************-geoAddressOperations-*******************//
        List<GeoAddressOperations> geoAddressOperationsList = new ArrayList<GeoAddressOperations>();
        GeoAddressOperations geoAddressOperationObject = new GeoAddressOperations();
        geoAddressOperationObject.setOp("post");
        geoAddressOperationObject.setPath("/api/geographicAddressManagement/v4/geographicAddress");
        geoAddressOperationObject.setProvisionalId(geoAddress_provisionalId);
        GeoAddressValue geoAddressValue = new GeoAddressValue();
        geoAddressValue.setCity("BERAT");
        geoAddressValue.setStreetName("ADR1");
        geoAddressValue.setStreetSuffix("ADR2");
        geoAddressValue.setCountry("ALBANIA");
        List<GeographicSubAddress> geographicSubAddressList = new ArrayList<GeographicSubAddress>();
        geoAddressValue.setGeographicSubAddress(geographicSubAddressList);
        geoAddressValue.setName("CUSTOMER_ADDRESS");
        geoAddressValue.setStreetType("street");
        geoAddressValue.setPostcode("0000");
        geoAddressValue.setType("FieldedAddress");
        geoAddressOperationObject.setValue(geoAddressValue);
        geoAddressOperationsList.add(geoAddressOperationObject);
        newCreateIndividualCustomerRequest.setGeoAddressOperations(geoAddressOperationsList);

        //*******************-paymentMethodOperations-*******************//
        List<PaymentMethodOperations> paymentMethodOperationsList = new ArrayList<PaymentMethodOperations>();
        PaymentMethodOperations paymentMethodObject = new PaymentMethodOperations();
        paymentMethodObject.setOp("post");
        paymentMethodObject.setPath("/api/paymentMethod/v4/paymentMethod");
        paymentMethodObject.setProvisionalId(paymentMethod_provisionalId);
        PaymentMethodValue paymentMethodValue = new PaymentMethodValue();
        paymentMethodValue.setName("Cash");
        paymentMethodValue.setType("Cash");
        paymentMethodValue.setAccountNumberType("IBAN");
        List<Account> paymentMethodAccountList = new ArrayList<Account>();
        Account paymentMethodAccountObject0 = new Account();
        paymentMethodAccountObject0.setDerivedFrom(account_prepaid_provisionalId);
        paymentMethodAccountList.add(paymentMethodAccountObject0);
        Account paymentMethodAccountObject1 = new Account();
        paymentMethodAccountObject1.setDerivedFrom(account_postpaid_provisionalId);
        paymentMethodAccountList.add(paymentMethodAccountObject1);
        paymentMethodValue.setAccount(paymentMethodAccountList);
        paymentMethodValue.setDescription("Default Payment Method");
        paymentMethodValue.setPreferred(true);
        RelatedParty paymentMethodValueRelatedParty = new RelatedParty();
        paymentMethodValueRelatedParty.setDerivedFrom(customer_provisionalId);
        paymentMethodValue.setRelatedParty(paymentMethodValueRelatedParty);

        paymentMethodObject.setValue(paymentMethodValue);
        paymentMethodOperationsList.add(paymentMethodObject);
        newCreateIndividualCustomerRequest.setPaymentMethodOperations(paymentMethodOperationsList);

        return newCreateIndividualCustomerRequest;
    }

    @When("I Create Aggregated Residential Customer")
    public void i_Create_New_Individual_Customer(NewCreateIndividualCustomerRequest newCreateIndividualCustomerRequest) throws IOException {
        NewIndividualCreateResponse newIndividualCreateResponse = TestAutoApi.newIndividualCreate(newCreateIndividualCustomerRequest);
        worldHelper.setNewCreateIndividualCustomerRequest(newCreateIndividualCustomerRequest);
        worldHelper.setNewIndividualCreateResponse(newIndividualCreateResponse);
        Assert.assertEquals(false, Objects.isNull(newIndividualCreateResponse.getId()));

        log.info("Api worked.");
    }

    @When("I Create Aggregated Foreigner Customer")
    public void ıCreateAggregatedForeignerCustomer(NewCreateIndividualCustomerRequest newCreateIndividualCustomerRequest) throws IOException {
        NewIndividualCreateResponse newIndividualCreateResponse = TestAutoApi.newIndividualCreate(newCreateIndividualCustomerRequest);
        worldHelper.setNewCreateIndividualCustomerRequest(newCreateIndividualCustomerRequest);
        worldHelper.setNewIndividualCreateResponse(newIndividualCreateResponse);
        Assert.assertEquals(false, Objects.isNull(newIndividualCreateResponse.getId()));

        log.info("Api worked.");
    }
}