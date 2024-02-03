package optiim.steps.api.newagg;

import com.github.javafaker.Faker;
import optiim.api.testauto.TestAutoApi;
import optiim.framework.Props;
import optiim.framework.helpers.WorldHelper;
import optiim.framework.utils.log;
import optiim.models.api.newagg.common.*;
import optiim.models.api.newagg.common.DocumentValue;
import optiim.models.api.newagg.common.PartyRoleValue;
import optiim.models.api.newagg.common.PartyValue;
import optiim.models.api.newagg.corporate.NewCreateCorporateCustomerRequest;
import optiim.models.api.newagg.corporate.OrganizationIdentification;
import optiim.models.api.newagg.corporate.reponse.NewCorporateCreateResponse;
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

public class NewCorporateCreateSteps {
    private final WorldHelper worldHelper;
    private final ApiData apiData;

    public NewCorporateCreateSteps(WorldHelper worldHelper, ApiData apiData) {
        this.worldHelper = worldHelper;
        this.apiData = apiData;
    }

    @DataTableType
    public NewCreateCorporateCustomerRequest createCorporateRequest(Map<String, String> entry) throws ParseException {

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
        String admin_p_id = letter + number1 + letter1;

        String c_number = RandomStringUtils.randomNumeric(8);
        String c_id = "F" + c_number;


        String geoAdressId = Props.getProp("corporate.geoAdressId");
        String businessMarketSegmentId = Props.getProp("corporate.businessMarketSegmentId");
        String governmentMarketSegmentId = Props.getProp("corporate.governmentMarketSegmentId");
        String businessCustomerSegmentId = Props.getProp("corporate.businessCustomerSegmentId");
        String governmentCustomerSegmentId = Props.getProp("corporate.governmentCustomerSegmentId");
        String billPresentationMediaId = Props.getProp("corporate.billPresentationMediaId");
        String billingCycleSpecificationId = Props.getProp("corporate.billingCycleSpecificationId");
        String admin_partyRoleId = Props.getProp("corporate.admin_partyRoleId");
        String user_partyRoleId = Props.getProp("corporate.user_partyRoleId");
        String user_partnerId = Props.getProp("corporate.user_partnerId");
        String creditClassId = Props.getProp("corporate.creditClassId");


        String customer_provisionalId = "wyeuH";//RandomStringUtils.random(5, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        String party_admin_provisionalId = "oekRh";//RandomStringUtils.random(5, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        String party_org_provisionalId = "0QaRU";//RandomStringUtils.random(5, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        String account_prepaid_provisionalId = "cNJfO";//RandomStringUtils.random(5, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        String account_postpaid_provisionalId = "rNQS6";//RandomStringUtils.random(5, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        String partyRole_provisionalId = "3yS1K";//RandomStringUtils.random(5, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        String document_admin_provisionalId = "3cCBj";//RandomStringUtils.random(5, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        String document_ebill_provisionalId = "74ZpX";//RandomStringUtils.random(5, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        String consentForm_provisionalId = "aXM26";//RandomStringUtils.random(5, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        String document_org_provisionalId = "IVXBa";//RandomStringUtils.random(5, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        String geoAddress_provisionalId = "h5nuQ";//RandomStringUtils.random(5, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        String paymentMethod_provisionalId = "tWbEb";//RandomStringUtils.random(5, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");

        String adminGivenName = faker.name().firstName().toUpperCase().replace("İ", "I");
        String adminMiddleName = faker.name().firstName().toUpperCase().replace("İ", "I");
        String adminFamilyName = faker.name().lastName().toUpperCase().replace("İ", "I").replace("'", "T");

        String orgEMail = faker.name().username().toUpperCase().replace("İ", "I") + "@yandex.com".toUpperCase();
        String adminEmail = faker.name().username().toUpperCase().replace("İ", "I") + "@yandex.com".toUpperCase();

        worldHelper.setCustomerName(adminGivenName + " " + adminFamilyName);


        NewCreateCorporateCustomerRequest newCorporateRequest = new NewCreateCorporateCustomerRequest();
        //*******************-customerOperations-*******************//
        List<CustomerOperations> customerOperationsList = new ArrayList<CustomerOperations>();
        //customerOperationsList //customerOperationsObject
        CustomerOperations customerOperationsObject = new CustomerOperations();
        customerOperationsObject.setOp("post");
        customerOperationsObject.setPath("/api/customerManagement/v4/customer");
        customerOperationsObject.setProvisionalId(customer_provisionalId);

        CustomerValue customerValueObject = new CustomerValue();
        customerValueObject.setName("TESTCORP" + RandomStringUtils.random(5, "ABCDEFGHIJKLMNOPQRSTUVW"));
        customerValueObject.setStatus("Prospect");

        EngagedParty customerEngagedPartyObject = new EngagedParty();
        customerEngagedPartyObject.setDerivedFrom(party_org_provisionalId);
        customerValueObject.setEngagedParty(customerEngagedPartyObject);

        List<Account> customerAccountList = new ArrayList<Account>();
        Account customerPrepaidAccountObject = new Account();
        customerPrepaidAccountObject.setDerivedFrom(account_prepaid_provisionalId);
        customerAccountList.add(customerPrepaidAccountObject);
        Account customerPostpaidAccountObject = new Account();
        customerPostpaidAccountObject.setDerivedFrom(account_postpaid_provisionalId);
        customerAccountList.add(customerPostpaidAccountObject);
        customerValueObject.setAccount(customerAccountList);

        List<PartyCharacteristic> customerCharacteristicList = new ArrayList<PartyCharacteristic>();
        PartyCharacteristic customerCharacteristicObject = new PartyCharacteristic();
        customerCharacteristicObject.setName("isCustomerInAlex");
        customerCharacteristicObject.setValue("false");
        customerCharacteristicList.add(customerCharacteristicObject);
        customerValueObject.setCharacteristic(customerCharacteristicList);

        List<RelatedParty> customerRelatedPartyList = new ArrayList<RelatedParty>();
        //customerRelatedPartyList //0
        RelatedParty customerRelatedPartyUserRole = new RelatedParty();
        customerRelatedPartyUserRole.setId(user_partyRoleId);
        customerRelatedPartyUserRole.setName("VATHI  GERTA");
        customerRelatedPartyUserRole.setHref("/api/partyRoleManagement/v4/partyRole/"+user_partyRoleId);
        customerRelatedPartyUserRole.setReferredType("PartyRole");
        customerRelatedPartyUserRole.setRole("Sales Agent");
        customerRelatedPartyList.add(customerRelatedPartyUserRole);
        //customerRelatedPartyList //1
        RelatedParty customerRelatedPartyPartner = new RelatedParty();
        customerRelatedPartyPartner.setId(user_partnerId);
        customerRelatedPartyPartner.setName("VF-Albania-Partnership");
        customerRelatedPartyPartner.setHref("/api/partnershipManagement/v4/partnership/"+user_partnerId);
        customerRelatedPartyPartner.setReferredType("Partner");
        customerRelatedPartyPartner.setRole("Sales Partner");
        customerRelatedPartyList.add(customerRelatedPartyPartner);
        //customerRelatedPartyList //2
        RelatedParty customerRelatedPartyObject = new RelatedParty();
        customerRelatedPartyObject.setDerivedFrom(partyRole_provisionalId);
        customerRelatedPartyList.add(customerRelatedPartyObject);
        customerValueObject.setRelatedParty(customerRelatedPartyList);

        List<ContactMedium> customerContactMediumList = new ArrayList<ContactMedium>();
        //customerContactMedium //0 => customerEMailContactMediumObject
        ContactMedium customerEMailContactMediumObject = new ContactMedium();
        customerEMailContactMediumObject.setMediumType("EMAIL");
        Characteristic customerEMailCharacteristic = new Characteristic();
        customerEMailCharacteristic.setEmailAddress(orgEMail);
        customerEMailCharacteristic.setContactType("PERSONAL_EMAIL");
        customerEMailContactMediumObject.setCharacteristic(customerEMailCharacteristic);
        customerContactMediumList.add(customerEMailContactMediumObject);

        //customerContactMedium //1 => customerPhoneNumberContactMediumObject
        ContactMedium customerPhoneNumberContactMediumObject = new ContactMedium();
        customerPhoneNumberContactMediumObject.setMediumType("PHONE");
        Characteristic customerPhoneNumberCharacteristic = new Characteristic();
        customerPhoneNumberCharacteristic.setPhoneNumber("698933127");
        customerPhoneNumberCharacteristic.setCountry("+355");
        customerPhoneNumberCharacteristic.setContactType("MOBILE_NUMBER");
        customerPhoneNumberContactMediumObject.setCharacteristic(customerPhoneNumberCharacteristic);
        customerContactMediumList.add(customerPhoneNumberContactMediumObject);

        //customerContactMedium //2 => customerCommMethodContactMediumObject
        ContactMedium customerCommMethodContactMediumObject = new ContactMedium();
        customerCommMethodContactMediumObject.setMediumType("communicationMethod");
        Characteristic customerCommMethodCharacteristic = new Characteristic();
        customerCommMethodCharacteristic.setContactType("EMAIL_SMS");
        customerCommMethodContactMediumObject.setCharacteristic(customerCommMethodCharacteristic);
        customerContactMediumList.add(customerCommMethodContactMediumObject);

        //customerContactMedium //3 => geoAddressContactMediumObject
        ContactMedium customerGeoAddressContactMediumObject = new ContactMedium();
        customerGeoAddressContactMediumObject.setMediumType("POSTAL_ADDRESS");
        Characteristic customerGeoAddressCharacteristic = new Characteristic();
        customerGeoAddressCharacteristic.setContactType("DEFAULT_SERVICE_ADDRESS");
        List<Place> customerPlaceList = new ArrayList<Place>();
        Place customerPlaceObject = new Place();
        customerPlaceObject.setDerivedFrom(geoAddress_provisionalId);
        customerPlaceObject.setRole("DEFAULT_SERVICE_ADDRESS");
        customerPlaceList.add(customerPlaceObject);
        customerGeoAddressCharacteristic.setPlace(customerPlaceList);
        customerGeoAddressContactMediumObject.setCharacteristic(customerGeoAddressCharacteristic);
        customerContactMediumList.add(customerGeoAddressContactMediumObject);
        customerValueObject.setContactMedium(customerContactMediumList);
        customerValueObject.setId(c_id);
        customerOperationsObject.setValue(customerValueObject);
        customerOperationsList.add(customerOperationsObject);
        newCorporateRequest.setCustomerOperations(customerOperationsList);

        //*******************-partyOperations-*******************//
        List<PartyOperations> partyOperationsList = new ArrayList<PartyOperations>();
        //partyOperationsList //0 => adminPartyOperationsObject
        PartyOperations adminPartyOperationsObject = new PartyOperations();
        adminPartyOperationsObject.setOp("post");
        adminPartyOperationsObject.setPath("/api/partyManagement/v4/individual");
        adminPartyOperationsObject.setProvisionalId(party_admin_provisionalId);

        PartyValue adminPartyValueObject = new PartyValue();
        //adminPartyValueObject.setType("Individual");
        adminPartyValueObject.setGender(sex);
        adminPartyValueObject.setPlaceOfBirth("BERAT");
        adminPartyValueObject.setCountryOfBirth("ALBANIA");
        adminPartyValueObject.setNationality("ALBANIAN");
        adminPartyValueObject.setBirthDate("1992-06-02T00:00:00.000Z");
        adminPartyValueObject.setGivenName(adminGivenName);
        adminPartyValueObject.setMiddleName(adminMiddleName);
        adminPartyValueObject.setFamilyName(adminFamilyName);

        List<IndividualIdentification> adminIndividualIdentificationList = new ArrayList<IndividualIdentification>();
        IndividualIdentification adminIndividualIdentificationObject = new IndividualIdentification();
        adminIndividualIdentificationObject.setIdentificationId(admin_p_id);
        adminIndividualIdentificationObject.setIdentificationType("AdminDoc");
        adminIndividualIdentificationList.add(adminIndividualIdentificationObject);
        adminPartyValueObject.setIndividualIdentification(adminIndividualIdentificationList);
        adminPartyOperationsObject.setValue(adminPartyValueObject);
        partyOperationsList.add(adminPartyOperationsObject);

        //partyOperationsList //1 => corpPartyOperationsObject
        PartyOperations corpPartyOperationsObject = new PartyOperations();
        corpPartyOperationsObject.setOp("post");
        corpPartyOperationsObject.setPath("/api/partyManagement/v4/organization");
        corpPartyOperationsObject.setProvisionalId(party_org_provisionalId);
        PartyValue corpPartyValueObject = new PartyValue();
        //corpPartyValueObject.setType("Organization");
        corpPartyValueObject.setName("TESTCORP");
        corpPartyValueObject.setTradingName("TESTCORP");

        List<OrganizationIdentification> corpOrganizationIdentificationList = new ArrayList<OrganizationIdentification>();
        OrganizationIdentification corpOrganizationIdentificationObject = new OrganizationIdentification();
        corpOrganizationIdentificationObject.setIdentificationType("NIPT");
        corpOrganizationIdentificationObject.setIdentificationId(p_id);
        corpOrganizationIdentificationObject.setIssuingDate("2022-03-16T07:39:14.734Z");
        Attachment corpAttachmentObject = new Attachment();
        corpAttachmentObject.setDerivedFrom(document_org_provisionalId);
        corpOrganizationIdentificationObject.setAttachment(corpAttachmentObject);
        corpOrganizationIdentificationList.add(corpOrganizationIdentificationObject);
        corpPartyValueObject.setOrganizationIdentification(corpOrganizationIdentificationList);

        List<PartyCharacteristic> corpPartyCharacteristicList = new ArrayList<PartyCharacteristic>();

        PartyCharacteristic corpPartyCharacteristicJuridicalInfoObject = new PartyCharacteristic();
        corpPartyCharacteristicJuridicalInfoObject.setName("juridicalInfo");
        if (entry.get("name").equals("Institute")) {
            corpPartyCharacteristicJuridicalInfoObject.setValue("PUBLIC AND OTHER INSTITUTIONS");
        } else {
            corpPartyCharacteristicJuridicalInfoObject.setValue("LEGAL ENTITY- ORGANIZATION");
        }
        corpPartyCharacteristicJuridicalInfoObject.setValueType("string");
        corpPartyCharacteristicList.add(corpPartyCharacteristicJuridicalInfoObject);

        PartyCharacteristic corpPartyCharacteristicTaxExemptObject = new PartyCharacteristic();
        corpPartyCharacteristicTaxExemptObject.setName("taxExempt");
        corpPartyCharacteristicTaxExemptObject.setValue("NO");
        corpPartyCharacteristicTaxExemptObject.setValueType("string");
        corpPartyCharacteristicList.add(corpPartyCharacteristicTaxExemptObject);

        PartyCharacteristic corpPartyCharacteristicCustomerGroupingObject = new PartyCharacteristic();
        corpPartyCharacteristicCustomerGroupingObject.setName("customerGrouping");
        corpPartyCharacteristicCustomerGroupingObject.setValue("NO");
        corpPartyCharacteristicCustomerGroupingObject.setValueType("string");
        corpPartyCharacteristicList.add(corpPartyCharacteristicCustomerGroupingObject);

        PartyCharacteristic corpPartyCharacteristicPotentialFraudObject = new PartyCharacteristic();
        corpPartyCharacteristicPotentialFraudObject.setName("potentialFraud");
        corpPartyCharacteristicPotentialFraudObject.setValue("NO");
        corpPartyCharacteristicPotentialFraudObject.setValueType("string");
        corpPartyCharacteristicList.add(corpPartyCharacteristicPotentialFraudObject);

        PartyCharacteristic corpPartyCharacteristicNumberOfEmployeesObject = new PartyCharacteristic();
        corpPartyCharacteristicNumberOfEmployeesObject.setName("numberOfEmployees");
        corpPartyCharacteristicNumberOfEmployeesObject.setValue("0");
        corpPartyCharacteristicNumberOfEmployeesObject.setValueType("number");
        corpPartyCharacteristicList.add(corpPartyCharacteristicNumberOfEmployeesObject);

        PartyCharacteristic corpPartyCharacteristicDunningLevelObject = new PartyCharacteristic();
        corpPartyCharacteristicDunningLevelObject.setName("dunningLevel");
        corpPartyCharacteristicDunningLevelObject.setValue("0");
        corpPartyCharacteristicDunningLevelObject.setValueType("string");
        corpPartyCharacteristicList.add(corpPartyCharacteristicDunningLevelObject);

        PartyCharacteristic corpPartyCharacteristicBlackListObject = new PartyCharacteristic();
        corpPartyCharacteristicBlackListObject.setName("isCustomerInBlackList");
        corpPartyCharacteristicBlackListObject.setValue("NO");
        corpPartyCharacteristicBlackListObject.setValueType("string");
        corpPartyCharacteristicList.add(corpPartyCharacteristicBlackListObject);

        corpPartyValueObject.setPartyCharacteristic(corpPartyCharacteristicList);
        corpPartyValueObject.setIndustry("CONSTRUCTION");

        List<MarketSegment> corpPartyMarketSegmentList = new ArrayList<MarketSegment>();
        MarketSegment corpCustomerSegmentObject = new MarketSegment();
        if (entry.get("name").equals("Institute")) {
            corpCustomerSegmentObject.setName("Government");
            corpCustomerSegmentObject.setId(governmentCustomerSegmentId);
            corpCustomerSegmentObject.setHref("/api/referenceManagement/v4/marketSegment/" + governmentCustomerSegmentId);
        } else {
            corpCustomerSegmentObject.setName("Business");
            corpCustomerSegmentObject.setId(businessCustomerSegmentId);
            corpCustomerSegmentObject.setHref("/api/referenceManagement/v4/marketSegment/" + businessCustomerSegmentId);
        }
        corpCustomerSegmentObject.setReferredType("CustomerSegment");
        corpPartyMarketSegmentList.add(corpCustomerSegmentObject);
        MarketSegment corpMarketSegmentObject = new MarketSegment();
        if (entry.get("name").equals("Institute")) {
            corpMarketSegmentObject.setId(governmentMarketSegmentId);
            corpMarketSegmentObject.setHref("/api/referenceManagement/v4/marketSegment/" + governmentMarketSegmentId);
            corpMarketSegmentObject.setName("Diplomatic Courp");
        } else {
            corpMarketSegmentObject.setId(businessMarketSegmentId);
            corpMarketSegmentObject.setHref("/api/referenceManagement/v4/marketSegment/" + businessMarketSegmentId);
            corpMarketSegmentObject.setName("Corporate");
        }
        corpMarketSegmentObject.setReferredType("MarketSegment");
        corpPartyMarketSegmentList.add(corpMarketSegmentObject);
        corpPartyValueObject.setMarketSegment(corpPartyMarketSegmentList);

        List<Attachment> corpPartyAttachmentList = new ArrayList<Attachment>();
        Attachment corpPartyAttachmentObject = new Attachment();
        corpPartyAttachmentObject.setDerivedFrom(consentForm_provisionalId);
        corpPartyAttachmentList.add(corpPartyAttachmentObject);
        corpPartyValueObject.setAttachment(corpPartyAttachmentList);

        corpPartyOperationsObject.setValue(corpPartyValueObject);
        partyOperationsList.add(corpPartyOperationsObject);

        newCorporateRequest.setPartyOperations(partyOperationsList);

        //*******************-accountOperations-*******************//
        List<AccountOperations> accountOperationsList = new ArrayList<AccountOperations>();
        //accountOperationsList //0 => prepaidAccountOperationsObject
        AccountOperations prepaidAccountOperationsObject = new AccountOperations();
        prepaidAccountOperationsObject.setOp("post");
        prepaidAccountOperationsObject.setPath("/api/accountManagement/v4/billingAccount");
        prepaidAccountOperationsObject.setProvisionalId(account_prepaid_provisionalId);
        AccountValue prepaidAccountValueObject = new AccountValue();
        prepaidAccountValueObject.setRatingType("Prepaid");
        //prepaidAccountValueObject.setDescription("LOREM");

        BillStructure prepaidBillStructureObject = new BillStructure();
        prepaidBillStructureObject.setPreferredBillingCurrency("ALL");
        prepaidAccountValueObject.setBillStructure(prepaidBillStructureObject);

        List<PartyCharacteristic> prepaidCharacteristicList = new ArrayList<PartyCharacteristic>();
        PartyCharacteristic prepaidCharacteristicObject = new PartyCharacteristic();
        prepaidCharacteristicObject.setName("CreditClassId");
        prepaidCharacteristicObject.setValue(creditClassId);
        prepaidCharacteristicList.add(prepaidCharacteristicObject);
        prepaidAccountValueObject.setCharacteristic(prepaidCharacteristicList);

        prepaidAccountValueObject.setName("Invoice Account");
        prepaidAccountValueObject.setAccountType("InvoiceAccount");

        List<RelatedParty> prepaidRelatePartyList = new ArrayList<RelatedParty>();
        RelatedParty prepaidRelatedPartyObject = new RelatedParty();
        prepaidRelatedPartyObject.setDerivedFrom(customer_provisionalId);
        prepaidRelatePartyList.add(prepaidRelatedPartyObject);
        prepaidAccountValueObject.setRelatedParty(prepaidRelatePartyList);

        List<Contact> prepaidContactList = new ArrayList<Contact>();
        Contact prepaidContactObject = new Contact();
        prepaidContactObject.setContactType("primary");
        List<ContactMedium> prepaidContactMediumList = new ArrayList<ContactMedium>();
        ContactMedium prepaidContactMediumObject = new ContactMedium();
        prepaidContactMediumObject.setMediumType("POSTAL_ADDRESS");
        Characteristic prepaidContactCharacteristicObject = new Characteristic();
        prepaidContactCharacteristicObject.setContactType("DEFAULT_BILLING_ADDRESS");
        List<Place> prepaidPlaceList = new ArrayList<Place>();
        Place prepaidPlaceObject = new Place();
        prepaidPlaceObject.setDerivedFrom(geoAddress_provisionalId);
        prepaidPlaceObject.setRole("DEFAULT_BILLING_ADDRESS");
        prepaidPlaceList.add(prepaidPlaceObject);
        prepaidContactCharacteristicObject.setPlace(prepaidPlaceList);
        prepaidContactMediumObject.setCharacteristic(prepaidContactCharacteristicObject);
        prepaidContactMediumList.add(prepaidContactMediumObject);
        prepaidContactObject.setContactMedium(prepaidContactMediumList);
        ValidFor prepaidValidForObject = new ValidFor();
        prepaidValidForObject.setStartDateTime("2022-03-16T07:39:14.734Z");
        prepaidContactObject.setValidFor(prepaidValidForObject);
        prepaidContactList.add(prepaidContactObject);
        prepaidAccountValueObject.setContact(prepaidContactList);

        DefaultPaymentMethod prepaidDefaultPaymentObject = new DefaultPaymentMethod();
        prepaidDefaultPaymentObject.setDerivedFrom(paymentMethod_provisionalId);
        prepaidAccountValueObject.setDefaultPaymentMethod(prepaidDefaultPaymentObject);

        prepaidAccountOperationsObject.setValue(prepaidAccountValueObject);
        accountOperationsList.add(prepaidAccountOperationsObject);

        //accountOperationsList //1 => postpaidAccountOperationsObject
        AccountOperations postpaidAccountOperationsObject = new AccountOperations();
        postpaidAccountOperationsObject.setOp("post");
        postpaidAccountOperationsObject.setPath("/api/accountManagement/v4/billingAccount");
        postpaidAccountOperationsObject.setProvisionalId(account_postpaid_provisionalId);
        AccountValue postpaidAccountValueObject = new AccountValue();
        postpaidAccountValueObject.setRatingType("Postpaid");
        postpaidAccountValueObject.setDescription("LOREM");

        BillStructure postpaidBillStructureObject = new BillStructure();
        List<PresentationMedia> postpaidPresentationMediaList = new ArrayList<PresentationMedia>();
        PresentationMedia postpaidPresentationMediaObject = new PresentationMedia();
        postpaidPresentationMediaObject.setId(billPresentationMediaId);
        postpaidPresentationMediaObject.setHref("/api/accountManagement/v4/billPresentationMedia/" + billPresentationMediaId);
        postpaidPresentationMediaObject.setName("E-Bill");
        postpaidPresentationMediaObject.setIsRef(true);
        postpaidPresentationMediaList.add(postpaidPresentationMediaObject);
        postpaidBillStructureObject.setPresentationMedia(postpaidPresentationMediaList);
        postpaidBillStructureObject.setPreferredBillingCurrency("ALL");
        CycleSpecification postpaidCycleSpecificationObject = new CycleSpecification();
        postpaidCycleSpecificationObject.setId(billingCycleSpecificationId);
        postpaidCycleSpecificationObject.setHref("/api/accountManagement/v4/billingCycleSpecification/" + billingCycleSpecificationId);
        postpaidCycleSpecificationObject.setName("BILLCYCLE_1");
        postpaidCycleSpecificationObject.setIsRef(true);
        postpaidBillStructureObject.setCycleSpecification(postpaidCycleSpecificationObject);
        postpaidAccountValueObject.setBillStructure(postpaidBillStructureObject);

        List<PartyCharacteristic> postpaidAccountCharacteristicList = new ArrayList<PartyCharacteristic>();
        PartyCharacteristic postpaidAccountCharacteristicObject = new PartyCharacteristic();
        postpaidAccountCharacteristicObject.setName("CreditClassId");
        postpaidAccountCharacteristicObject.setValue(creditClassId);
        postpaidAccountCharacteristicList.add(postpaidAccountCharacteristicObject);
        postpaidAccountValueObject.setCharacteristic(postpaidAccountCharacteristicList);

        postpaidAccountValueObject.setName("Invoice Account");
        postpaidAccountValueObject.setAccountType("InvoiceAccount");

        List<RelatedParty> postpaidRelatedPartyList = new ArrayList<RelatedParty>();
        RelatedParty postpaidRelatedPartyObject = new RelatedParty();
        postpaidRelatedPartyObject.setDerivedFrom(customer_provisionalId);
        postpaidRelatedPartyList.add(postpaidRelatedPartyObject);
        postpaidAccountValueObject.setRelatedParty(postpaidRelatedPartyList);

        List<Contact> postpaidContactList = new ArrayList<Contact>();
        Contact postpaidContactObject = new Contact();
        postpaidContactObject.setContactType("primary");
        List<ContactMedium> postpaidContactMediumList = new ArrayList<ContactMedium>();

        ContactMedium postpaidContactMediumAddressObject = new ContactMedium();
        postpaidContactMediumAddressObject.setMediumType("POSTAL_ADDRESS");
        Characteristic postpaidCharacteristicObject = new Characteristic();
        postpaidCharacteristicObject.setContactType("DEFAULT_BILLING_ADDRESS");
        List<Place> postpaidPlaceList = new ArrayList<Place>();
        Place postpaidPlaceObject = new Place();
        postpaidPlaceObject.setDerivedFrom(geoAddress_provisionalId);
        postpaidPlaceObject.setRole("DEFAULT_BILLING_ADDRESS");
        postpaidPlaceList.add(postpaidPlaceObject);
        postpaidCharacteristicObject.setPlace(postpaidPlaceList);
        postpaidContactMediumAddressObject.setCharacteristic(postpaidCharacteristicObject);
        postpaidContactMediumList.add(postpaidContactMediumAddressObject);

        ContactMedium postpaidContactMediumEbillPhoneObject = new ContactMedium();
        postpaidContactMediumEbillPhoneObject.setMediumType("PHONE");
        Characteristic postpaidEbillPhoneCharacteristicObject = new Characteristic();
        postpaidEbillPhoneCharacteristicObject.setPhoneNumber("698933127");
        postpaidEbillPhoneCharacteristicObject.setCountry("+355");
        postpaidEbillPhoneCharacteristicObject.setContactType("EBILL_NUMBER");
        postpaidContactMediumEbillPhoneObject.setCharacteristic(postpaidEbillPhoneCharacteristicObject);
        postpaidContactMediumList.add(postpaidContactMediumEbillPhoneObject);

        ContactMedium postpaidContactMediumEbillEmailObject = new ContactMedium();
        postpaidContactMediumEbillEmailObject.setMediumType("EMAIL");
        Characteristic postpaidEbillEmailCharacteristicObject =new Characteristic();
        postpaidEbillEmailCharacteristicObject.setEmailAddress(orgEMail);
        postpaidEbillEmailCharacteristicObject.setContactType("EBILL_EMAIL");
        postpaidContactMediumEbillEmailObject.setCharacteristic(postpaidEbillEmailCharacteristicObject);
        postpaidContactMediumList.add(postpaidContactMediumEbillEmailObject);

        postpaidContactObject.setContactMedium(postpaidContactMediumList);
        ValidFor postpaidValidForObject = new ValidFor();
        postpaidValidForObject.setStartDateTime("2022-03-16T07:39:14.734Z");
        postpaidContactObject.setValidFor(postpaidValidForObject);
        postpaidContactList.add(postpaidContactObject);
        postpaidAccountValueObject.setContact(postpaidContactList);

        DefaultPaymentMethod postpaidDefaultPaymentObject = new DefaultPaymentMethod();
        postpaidDefaultPaymentObject.setDerivedFrom(paymentMethod_provisionalId);
        postpaidAccountValueObject.setDefaultPaymentMethod(postpaidDefaultPaymentObject);

        List<Attachment> postpaidAttachmentList = new ArrayList<Attachment>();
        Attachment postpaidAttachmentObject = new Attachment();
        postpaidAttachmentObject.setDerivedFrom(document_ebill_provisionalId);
        postpaidAttachmentList.add(postpaidAttachmentObject);
        postpaidAccountValueObject.setAttachment(postpaidAttachmentList);

        postpaidAccountOperationsObject.setValue(postpaidAccountValueObject);
        accountOperationsList.add(postpaidAccountOperationsObject);
        newCorporateRequest.setAccountOperations(accountOperationsList);

        //*******************-partyRoleOperations-*******************//
        List<PartyRoleOperations> partyRoleOperationsList = new ArrayList<PartyRoleOperations>();
        //partyRoleOperationsList //0 => partyRoleOperationsObject
        PartyRoleOperations partyRoleOperationsObject = new PartyRoleOperations();
        partyRoleOperationsObject.setOp("post");
        partyRoleOperationsObject.setPath("/api/partyRoleManagement/v4/partyRole");
        partyRoleOperationsObject.setProvisionalId(partyRole_provisionalId);
        //
        PartyRoleValue partyRoleValueObject = new PartyRoleValue();
        //partyRoleValueObject.setType("PartyRole");
        partyRoleValueObject.setName(worldHelper.getCustomerName());
        //
        RoleType partyRoleRoleTypeObject = new RoleType();
        partyRoleRoleTypeObject.setId(admin_partyRoleId);
        partyRoleRoleTypeObject.setHref("/api/partyRoleManagement/v4/roleType/" + admin_partyRoleId);
        partyRoleRoleTypeObject.setName("Admin");
        partyRoleValueObject.setRoleType(partyRoleRoleTypeObject);
        //
        List<Attachment> partyRoleAttachmentList = new ArrayList<Attachment>();
        //
        Attachment partyRoleAttachmentObject = new Attachment();
        partyRoleAttachmentObject.setDerivedFrom(document_admin_provisionalId);
        partyRoleAttachmentObject.setAttachmentType("AdminDoc");
        partyRoleAttachmentList.add(partyRoleAttachmentObject);
        partyRoleValueObject.setAttachment(partyRoleAttachmentList);
        //
        EngagedParty partyRoleEngagedPartyObject = new EngagedParty();
        partyRoleEngagedPartyObject.setDerivedFrom(party_admin_provisionalId);
        partyRoleValueObject.setEngagedParty(partyRoleEngagedPartyObject);
        //
        List<ContactMedium> partyRoleContactMediumList = new ArrayList<ContactMedium>();
        //
        ContactMedium partyRoleContactMediumEMailObject = new ContactMedium();
        partyRoleContactMediumEMailObject.setMediumType("EMAIL");
        //
        Characteristic eMailCharacteristicObject = new Characteristic();
        eMailCharacteristicObject.setEmailAddress(adminEmail);
        eMailCharacteristicObject.setContactType("PERSONAL_EMAIL");
        partyRoleContactMediumEMailObject.setCharacteristic(eMailCharacteristicObject);
        partyRoleContactMediumList.add(partyRoleContactMediumEMailObject);
        //
        ContactMedium partyRoleContactMediumPhoneObject = new ContactMedium();
        partyRoleContactMediumPhoneObject.setMediumType("PHONE");
        //
        Characteristic phoneCharacteristicObject = new Characteristic();
        phoneCharacteristicObject.setPhoneNumber("698933127");
        phoneCharacteristicObject.setCountry("+355");
        phoneCharacteristicObject.setContactType("MOBILE_NUMBER");
        partyRoleContactMediumPhoneObject.setCharacteristic(phoneCharacteristicObject);
        partyRoleContactMediumList.add(partyRoleContactMediumPhoneObject);
        //
        //ContactMedium partyRoleContactMediumCommunicationMethodObject = new ContactMedium();
        //partyRoleContactMediumCommunicationMethodObject.setMediumType("communicationMethod");
        //Characteristic communicationMethodCharacteristicObject = new Characteristic();
        //communicationMethodCharacteristicObject.setContactType("SMS");
        //partyRoleContactMediumCommunicationMethodObject.setCharacteristic(communicationMethodCharacteristicObject);
        //partyRoleContactMediumList.add(partyRoleContactMediumCommunicationMethodObject);
        partyRoleValueObject.setContactMedium(partyRoleContactMediumList);
        partyRoleOperationsObject.setValue(partyRoleValueObject);
        partyRoleOperationsList.add(partyRoleOperationsObject);
        newCorporateRequest.setPartyRoleOperations(partyRoleOperationsList);

        //*******************-documentOperations-*******************//
        List<DocumentOperations> documentOperationsList = new ArrayList<DocumentOperations>();
        //documentOperationsList //0 => adminDocumentOperationsObject
        DocumentOperations adminDocumentOperationsObject = new DocumentOperations();
        adminDocumentOperationsObject.setOp("post");
        adminDocumentOperationsObject.setPath("/api/documentManagement/v4/attachment");
        adminDocumentOperationsObject.setProvisionalId(document_admin_provisionalId);
        DocumentValue adminDocumentValueObject = new DocumentValue();
        adminDocumentValueObject.setAttachmentType("AdminDoc");
        adminDocumentValueObject.setDescription("Administrator " + worldHelper.getCustomerName() + " Document");
        adminDocumentValueObject.setMimeType("image/png");
        adminDocumentValueObject.setName("Flag_of_Turkey.png");
        Size adminDocumentSizeObject = new Size();
        adminDocumentSizeObject.setAmount(1);
        adminDocumentSizeObject.setUnits("1");
        adminDocumentValueObject.setSize(adminDocumentSizeObject);
        adminDocumentValueObject.setUrl(admin_p_id + "/Flag_of_Turkey.png");
        adminDocumentOperationsObject.setValue(adminDocumentValueObject);
        documentOperationsList.add(adminDocumentOperationsObject);

        //documentOperationsList //1 => orgEbillDocumentOperationsObject
        DocumentOperations orgEbillDocumentOperationsObject = new DocumentOperations();
        orgEbillDocumentOperationsObject.setOp("post");
        orgEbillDocumentOperationsObject.setPath("/api/documentManagement/v4/attachment");
        orgEbillDocumentOperationsObject.setProvisionalId(document_ebill_provisionalId);
        DocumentValue orgEbillValueObject = new DocumentValue();
        orgEbillValueObject.setAttachmentType("EBillDocument");
        orgEbillValueObject.setDescription("E-Bill Document");
        orgEbillValueObject.setMimeType("image/png");
        orgEbillValueObject.setName("TURK-bayragi.png");
        Size orgEbillDocumentSizeObject = new Size();
        orgEbillDocumentSizeObject.setAmount(1);
        orgEbillDocumentSizeObject.setUnits("1");
        orgEbillValueObject.setSize(orgEbillDocumentSizeObject);
        orgEbillValueObject.setUrl(p_id + "/TURK-bayragi.png");
        orgEbillDocumentOperationsObject.setValue(orgEbillValueObject);
        documentOperationsList.add(orgEbillDocumentOperationsObject);

        //documentOperationsList //2 => orgConsentDocumentOperationsObject
        DocumentOperations orgConsentDocumentOperationsObject = new DocumentOperations();
        orgConsentDocumentOperationsObject.setOp("post");
        orgConsentDocumentOperationsObject.setPath("/api/documentManagement/v4/attachment");
        orgConsentDocumentOperationsObject.setProvisionalId(consentForm_provisionalId);
        DocumentValue orgConsentValueObject = new DocumentValue();
        orgConsentValueObject.setAttachmentType("ConsentForm");
        orgConsentValueObject.setDescription("Consent Form for ID:" + p_id);
        orgConsentValueObject.setMimeType("image/png");
        orgConsentValueObject.setName("Turkey_8kb.png");
        Size orgConsentSizeObject = new Size();
        orgConsentSizeObject.setAmount(1);
        orgConsentSizeObject.setUnits("1");
        orgConsentValueObject.setSize(orgConsentSizeObject);
        orgConsentValueObject.setUrl(p_id+"/Turkey_8kb.png");
        orgConsentDocumentOperationsObject.setValue(orgConsentValueObject);
        documentOperationsList.add(orgConsentDocumentOperationsObject);

        //documentOperationsList //3 => orgDocumentOperationsObject
        DocumentOperations orgDocumentOperationsObject = new DocumentOperations();
        orgDocumentOperationsObject.setOp("post");
        orgDocumentOperationsObject.setPath("/api/documentManagement/v4/attachment");
        orgDocumentOperationsObject.setProvisionalId(document_org_provisionalId);
        DocumentValue orgDocumentValueObject = new DocumentValue();
        orgDocumentValueObject.setAttachmentType("DOCUMENT");
        orgDocumentValueObject.setDescription("ExtractQKR");
        orgDocumentValueObject.setMimeType("image/png");
        orgDocumentValueObject.setName("Turkey.png");
        Size orgDocumentSizeObject = new Size();
        orgDocumentSizeObject.setAmount(1);
        orgDocumentSizeObject.setUnits("1");
        orgDocumentValueObject.setSize(orgDocumentSizeObject);
        orgDocumentValueObject.setUrl(p_id + "/Turkey.png");
        orgDocumentOperationsObject.setValue(orgDocumentValueObject);
        documentOperationsList.add(orgDocumentOperationsObject);

        newCorporateRequest.setDocumentOperations(documentOperationsList);

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
        newCorporateRequest.setGeoAddressOperations(geoAddressOperationsList);

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
        newCorporateRequest.setPaymentMethodOperations(paymentMethodOperationsList);

        return newCorporateRequest;
    }

    @When("I Create Aggregated Corporate Customer")
    public void i_Create_New_Corporate_Customer(NewCreateCorporateCustomerRequest newCorporateRequest) throws IOException {
        NewCorporateCreateResponse newCreateCorporateResponse = TestAutoApi.newCorporateCreate(newCorporateRequest);
        worldHelper.setNewCreateCorporateCustomerRequest(newCorporateRequest);
        worldHelper.setNewCorporateCreateResponse(newCreateCorporateResponse);
        Assert.assertEquals(false, Objects.isNull(newCreateCorporateResponse.getId()));

        log.info("Api worked.");
    }

    @When("I Create Aggregated Institute Customer")
    public void ıCreateAggregatedInstituteCustomer(NewCreateCorporateCustomerRequest newCorporateRequest) throws IOException {
        NewCorporateCreateResponse newCreateCorporateResponse = TestAutoApi.newCorporateCreate(newCorporateRequest);
        worldHelper.setNewCreateCorporateCustomerRequest(newCorporateRequest);
        worldHelper.setNewCorporateCreateResponse(newCreateCorporateResponse);
        Assert.assertEquals(false, Objects.isNull(newCreateCorporateResponse.getId()));

        log.info("Api worked.");
    }
}