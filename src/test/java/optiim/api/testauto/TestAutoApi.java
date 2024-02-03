package optiim.api.testauto;

import optiim.framework.Props;
import optiim.framework.utils.log;
import optiim.models.api.aggregation.CreateAggResidentialRequest;
import optiim.models.api.aggregation.corporate.CreateAggCorporateRequest;
import optiim.models.api.aggregation.corporate.response.CreateAggCorporateResponse;
import optiim.models.api.aggregation.response.CreateAggResidentialResponse;
import optiim.models.api.customermanagement.*;
import optiim.models.api.login.JIRALoginRequest;
import optiim.models.api.newagg.corporate.NewCreateCorporateCustomerRequest;
import optiim.models.api.newagg.individual.NewCreateIndividualCustomerRequest;
import optiim.models.api.newagg.corporate.reponse.NewCorporateCreateResponse;
import optiim.models.api.newagg.individual.response.NewIndividualCreateResponse;
import optiim.models.api.shoppingcartactive.ShoppingCartActive;
import optiim.models.api.shoppingcartactive.ShoppingCartActiveResponse;
import optiim.models.api.tickets.*;
import optiim.models.api.troubleticketmanagement.IssueTypeRequest;
import optiim.models.api.troubleticketmanagement.response.RetrieveTroubleTicketResponse;
import optiim.models.api.troubleticketmanagement.response.TroubleTicketResponse;
import optiim.models.api.troubleticketmanagement.response.TroubleTicketSpecificationResponse;

import java.io.IOException;
import java.util.List;

import static optiim.framework.helpers.ApiHelper.*;

public class TestAutoApi {

    //Ticket APIs
    public static List<ListTroubleTicketsResponse> listAllTroubleTickets() throws IOException {
        return getResponseGET(getMethodName(), "https://dcase-api." + Props.getProp("api.env") + ".dnext.al.vodafone.com/api/troubleTicketManagement/v4/troubleTicket", ListTroubleTicketsResponse.class);
    }

    public static TroubleTicketResponse createTicket(IssueTypeRequest issueTypeRequest) throws IOException {
        return postResponseSingleTicket(getMethodName(), "https://dcase-api." + Props.getProp("api.env") + ".dnext.al.vodafone.com/api/troubleTicketManagement/v4/troubleTicket", issueTypeRequest, TroubleTicketResponse.class);
    }

    public static List<AccountManagementResponse> getBillingAccount(String relatedParty) throws IOException {
        return getResponseList(getMethodName(), "https://dacm-api." + Props.getProp("api.env") + ".dnext.al.vodafone.com/api/accountManagement/v4/billingAccount?relatedParty.id=" + relatedParty, AccountManagementResponse.class);
    }

    public static RetrieveTroubleTicketResponse retrieveTicket(String ticketNumber) throws IOException {
        return getTicket(getMethodName(), "https://dcase-api." + Props.getProp("api.env") + ".dnext.al.vodafone.com/api/troubleTicketManagement/v4/troubleTicket/" + ticketNumber + "?fields=name,priority,severity,ticketType,status,resolutionDate,expectedResolutionDate,description,externalId,creationDate,statusChange,note,piaExtension", RetrieveTroubleTicketResponse.class);
    }

    public static String deleteTicket(String ticketNumber) throws IOException {
        return removeTicket(getMethodName(), "/api/troubleTicketManagement/v4/troubleTicket/", ticketNumber);
    }

    public static List<TroubleTicketSpecificationResponse> troubleTicketSpecification() throws IOException {
        return getResponseGET(getMethodName(), "https://dcase-api." + Props.getProp("api.env") + ".dnext.al.vodafone.com/api/troubleTicketManagement/v4//troubleTicketSpecification", TroubleTicketSpecificationResponse.class);
    }

    //customer APIs
    public static int landPage(String landPage) throws IOException {
        return landingPageAPI(getMethodName(), landPage);
    }

    public static int getCustomerList(String offset) throws IOException {
        return getCustomerListAPI(getMethodName(), "https://dcm-api." + Props.getProp("api.env") + ".dnext.al.vodafone.com/api/customerManagement/v4/customer?fields=id,name&offset=" + offset + "&limit=10");
    }

    public static int customerSearchViaNewCustomerCreation(String customerNumber) throws IOException {
        return customerSearchViaNewCustomerCreationAPI(getMethodName(), "https://dpam-api." + Props.getProp("api.env") + ".dnext.al.vodafone.com/api/partyManagement/v4/individual?fields=id,givenName,familyName,middleName,birthDate,countryOfBirth,placeOfBirth,gender,nationality,contactMedium,relatedParty,individualIdentification&individualIdentification.identificationId*=%" + customerNumber);
    }

    public static PartyManagementResponse customerSearchViaNewCustomerCreationExt(String customerNumber) throws IOException {
        return customerSearchViaNewCustomerCreationAPIExt(getMethodName(), "https://dpam-api." + Props.getProp("api.env") + ".dnext.al.vodafone.com/api/partyManagement/v4/individual/" + customerNumber, PartyManagementResponse.class);
    }

    public static int customerSearchVia360ScreenwithCustomerName(String customerNumber) throws IOException {
        return customerSearchViaNewCustomerCreationAPI(getMethodName(), "/api/customerManagement/v4/customer?name*=%" + customerNumber);
    }

    public static int customerSearchVia360ScreenwithPersonelNumber(String customerNumber) throws IOException {
        return customerSearchViaNewCustomerCreationAPI(getMethodName(), "/api/customerManagement/v4/customer?name*=%" + customerNumber);
    }

    public static void searchProductFullName(String productName) throws IOException {
        customerSearchViaNewCustomerCreationAPI(getMethodName(), "/api/productCatalogManagement/v4/productOffering?isSellable=true&lifecycleStatus=launched&place.name=BERAT&name=" + '\'' + productName + '\'');
    }

    public static void searchProductwithCity(String productName) throws IOException {
        customerSearchViaNewCustomerCreationAPI(getMethodName(), "/api/productCatalogManagement/v4/productOffering?isSellable=true&lifecycleStatus=launched&place.name=" + productName);
    }

    public static void filterCatalog(String catalogName) throws IOException {
        customerSearchViaNewCustomerCreationAPI(getMethodName(), "/api/productCatalogManagement/v4/productOffering?isSellable=true&lifecycleStatus=launched&place.name=BERAT&category.name.in(" + catalogName + ")");
    }

    public static void filterMultipleCatalog(String catalogName1, String catalogName2) throws IOException {
        customerSearchViaNewCustomerCreationAPI(getMethodName(), "/api/productCatalogManagement/v4/productOffering?isSellable=true&lifecycleStatus=launched&place.name=BERAT&category.name.in(" + catalogName1 + "," + catalogName2 + ")");
    }


    public static int customerDetails(String customerNumber) throws IOException {
        return customerSearchViaNewCustomerCreationAPI(getMethodName(), "/api/customerManagement/v4/customer/" + customerNumber);
    }

    public static AttachmentResponse createAttachment(AttachmentRequest attachmentRequest) throws IOException {
//        return createCustomerAPI(getMethodName(), "/api/documentManagement/attachment", attachmentRequest,AttachmentResponse.class);
//        return postResponseSingle(getMethodName(), "https://ddms-api.dev.crmfix.gdc-pcs.com/api/documentManagement/v4/attachment", attachmentRequest,AttachmentResponse.class);
        return postResponseSingle(getMethodName(), "/api/documentManagement/v4/attachment", attachmentRequest, AttachmentResponse.class);
    }

    public static PartyManagementResponse createPartyManagement(PartyManagementRequest partyManagementRequest) throws IOException {
//        return createCustomerStringAPI(getMethodName(), "/api/partyManagement/v4/individual", partyManagementRequest);
//        return postResponseSingle(getMethodName(), "https://dpam-api.dev.crmfix.gdc-pcs.com/api/partyManagement/v4/individual", partyManagementRequest,PartyManagementResponse.class);
        return postResponseSingle(getMethodName(), "/api/partyManagement/v4/individual", partyManagementRequest, PartyManagementResponse.class);
    }

    public static OrganizationResponse createOrganizationManagement(OrganizationRequest organizationRequest) throws IOException {
//        return postResponseSingle(getMethodName(), "https://dpam-api.dev.crmfix.gdc-pcs.com/api/partyManagement/v4/organization", organizationRequest,OrganizationResponse.class);
        return postResponseSingle(getMethodName(), "/api/partyManagement/v4/organization", organizationRequest, OrganizationResponse.class);
    }

    public static CustomerManagementResponse createCustomerManagement(CustomerManagementRequest customerManagementRequest) throws IOException {
//        return createCustomerStringAPI(getMethodName(), "/api/customerManagement/v4/customer", customerManagementRequest);
//        return postResponseSingle(getMethodName(), "https://dcm-api.dev.crmfix.gdc-pcs.com/api/customerManagement/v4/customer", customerManagementRequest,CustomerManagementResponse.class);
        return postResponseSingle(getMethodName(), "/api/customerManagement/v4/customer", customerManagementRequest, CustomerManagementResponse.class);
    }

    public static AccountManagementResponse createAccountManagement(AccountManagementRequest accountManagementRequest) throws IOException {
//        return createCustomerStringAPI(getMethodName(), "/api/accountManagement/v4/billingAccount", accountManagementRequest);
//        return postResponseSingle(getMethodName(), "https://dacm-api.dev.crmfix.gdc-pcs.com/api/accountManagement/v4/billingAccount", accountManagementRequest,AccountManagementResponse.class
        return postResponseSingle(getMethodName(), "/api/accountManagement/v4/billingAccount", accountManagementRequest, AccountManagementResponse.class);
    }

    // ******out of use******
    public static CreateAggResidentialResponse createAggregatedResidential(CreateAggResidentialRequest createAggResidentialRequest) throws IOException {
//        return postResponseSingle(getMethodName(), "https://backend-for-ui-api.sit1.dnext.al.vodafone.com/api/backend-for-ui/v1/customer/createIndividualCustomer", createAggResidentialRequest, CreateAggResidentialResponse.class);
        return postResponseSingle(getMethodName(), "https://backend-for-ui-api.uat.dnext.al.vodafone.com/api/backend-for-ui/v1/customer/createIndividualCustomer", createAggResidentialRequest, CreateAggResidentialResponse.class);
    }

    public static NewIndividualCreateResponse newIndividualCreate(NewCreateIndividualCustomerRequest newCreateIndividualCustomerRequest) throws IOException {
        return postResponseSingle(getMethodName(), "https://provision-api." + Props.getProp("api.env") + ".dnext.al.vodafone.com/api/provision/customer/createCustomer", newCreateIndividualCustomerRequest, NewIndividualCreateResponse.class);
    }

    public static NewCorporateCreateResponse newCorporateCreate(NewCreateCorporateCustomerRequest newCreateCorporateCustomerRequest) throws IOException {
        return postResponseSingle(getMethodName(), "https://provision-api." + Props.getProp("api.env") + ".dnext.al.vodafone.com/api/provision/customer/createCustomer", newCreateCorporateCustomerRequest, NewCorporateCreateResponse.class);
    }

    // ******out of use******
    public static CreateAggCorporateResponse createAggregatedCorporate(CreateAggCorporateRequest createAggCorporateRequest) throws IOException {
//        return postResponseSingle(getMethodName(), "https://backend-for-ui-api.sit1.dnext.al.vodafone.com/api/backend-for-ui/v1/customer/createCorporateCustomer", createAggCorporateRequest, CreateAggCorporateResponse.class);
        return postResponseSingle(getMethodName(), "https://backend-for-ui-api.uat.dnext.al.vodafone.com/api/backend-for-ui/v1/customer/createCorporateCustomer", createAggCorporateRequest, CreateAggCorporateResponse.class);
    }

    public static String getToken(JIRALoginRequest request) {
        return getResponseNoMapping(getMethodName(), "/api/v2/authenticate", request);
    }

    public static String getMethodName() {
        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
        return methodName;
    }

    //Aggregated Search
    public static String searchAggCustomer(String searchCriteria) throws IOException {
        String url = "/api/customer-agg/v1/customer?fields=name,engagedParty,relatedParty,agreement,account,paymentMethod,characteristic&expand=engagedParty&" + searchCriteria;
        log.info("url::" + url);
//        return customerSearchViaNewCustomerCreationAPI(getMethodName(), "/api/customer-agg/v1/customer?fields=name,engagedParty,relatedParty,agreement,account,paymentMethod,characteristic&expand=engagedParty&" + searchCriteria + "=" + "%" + searchValue + "%");
        return customerSearchAggregated(getMethodName(), url);
    }

    public static ShoppingCartActiveResponse shoppingCartActive(ShoppingCartActive shoppingCartActive) throws IOException {
        return postResponseSingle(getMethodName(), "https://shoppingcartcheckout-api." + Props.getProp("api.env") + ".dnext.al.vodafone.com/api/shoppingcart-checkout/installationTicket/callback", shoppingCartActive, ShoppingCartActiveResponse.class);
    }


    public static List<PartyManagementIdResponse> getMigrationCustomer(String customerType, String limitValue, String fieldName) throws IOException {
        return getMigrationResponseGET(getMethodName(), "https://dpam-api." + Props.getProp("api.env") + ".dnext.al.vodafone.com/api/partyManagement/v4/individual?externalReference.externalReferenceType=migration&sort=-createdDate&limit=10&fields=id", PartyManagementIdResponse.class);
    }

    public static List<PartyManagementIdResponse> getOrderCompletedCustomer() throws IOException {
        return getOrderCompletedCustomerResponseGET(getMethodName(), "https://dpom-api." + Props.getProp("api.env") + ".dnext.al.vodafone.com/api/productOrderingManagement/v4/productOrder?state=completed&fields=relatedParty.id", PartyManagementIdResponse.class);
    }
}