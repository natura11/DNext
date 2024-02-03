package optiim.framework.helpers;

import optiim.framework.utils.log;
import optiim.models.api.aggregation.CreateAggResidentialRequest;
import optiim.models.api.aggregation.corporate.CreateAggCorporateRequest;
import optiim.models.api.aggregation.corporate.response.CreateAggCorporateResponse;
import optiim.models.api.aggregation.response.CreateAggResidentialResponse;
import optiim.models.api.customermanagement.*;
import optiim.models.api.jira.XRAYExecutionResults;
import optiim.models.api.newagg.corporate.NewCreateCorporateCustomerRequest;
import optiim.models.api.newagg.individual.NewCreateIndividualCustomerRequest;
import optiim.models.api.newagg.corporate.reponse.NewCorporateCreateResponse;
import optiim.models.api.newagg.individual.response.NewIndividualCreateResponse;
import optiim.models.api.shoppingcartactive.ShoppingCartActiveResponse;
import optiim.models.api.tickets.ListTroubleTicketsResponse;
import optiim.models.api.troubleticketmanagement.response.TroubleTicketResponse;
import optiim.models.api.troubleticketmanagement.response.TroubleTicketSpecificationResponse;
import optiim.models.data.api.ApiData;
import optiim.models.data.gui.MusteriPageData;
import optiim.models.data.gui.customercasemanagement.CustomerCaseManagementData;
import optiim.models.data.gui.customermanegement.CustomerManagementData;
import io.restassured.response.Response;
import lombok.Getter;
import org.testng.Assert;

import java.util.List;

@Getter
public class WorldHelper {
    public String environment;
    private Boolean success;
    private String message;
    private int statusCode;


    private String frontEndURL;
    private Response responseRest;

//    //Stok Repo
//    private MusteriOlusturResponse musteriOlusturResponse;
//    private MusteriOlusturResponse musteriOlustur2Response;
//    private TcknOlusturResponse tcknOlusturResponse;
//    private TcknOlusturResponse tcknOlustur2Response;




    //Shopping Cart Active
    private String ticketId;
    private ShoppingCartActiveResponse shoppingCartActiveResponse;

    //Customer Management
    private String identificationNumberResidential;
    private String identificationNumberResidentialContact;
    private String identificationNumberForeigner;
    private String niptNumber;
    private PartyManagementIdResponse partyManagementIdResponse;
    private String migrationCustomerId;



    private String serviceActivationDate;
    private List<AccountManagementResponse> accountManagementResponseList;
    private AccountManagementResponse accountManagementResponse;
    private AttachmentResponse attachmentResponse;
    private CustomerManagementResponse customerManagementResponse;
    private CreateAggResidentialResponse createAggResidentialResponse;
    private CreateAggResidentialRequest createAggResidentialRequest;



    private CreateAggCorporateRequest createAggCorporateRequest;
    private CreateAggCorporateResponse createAggCorporateResponse;
    private PartyManagementResponse partyManagementResponse;
    private OrganizationResponse organizationResponse;
    private String identificationNumberCorporate;
    private String customerName;
    private String relatedPartyID;

//----------------------
    public NewCreateIndividualCustomerRequest getNewCreateIndividualCustomerRequest() {
        return newCreateIndividualCustomerRequest;
    }

    public void setNewCreateIndividualCustomerRequest(NewCreateIndividualCustomerRequest newCreateIndividualCustomerRequest) {
        this.newCreateIndividualCustomerRequest = newCreateIndividualCustomerRequest;
    }

    private NewCreateIndividualCustomerRequest newCreateIndividualCustomerRequest;

    public NewIndividualCreateResponse getNewIndividualCreateResponse() {
        return newIndividualCreateResponse;
    }

    public void setNewIndividualCreateResponse(NewIndividualCreateResponse newIndividualCreateResponse) {
        this.newIndividualCreateResponse = newIndividualCreateResponse;
    }

    private NewIndividualCreateResponse newIndividualCreateResponse;

    public NewCorporateCreateResponse getNewCorporateCreateResponse() {
        return newCorporateCreateResponse;
    }

    public void setNewCorporateCreateResponse(NewCorporateCreateResponse newCorporateCreateResponse) {
        this.newCorporateCreateResponse = newCorporateCreateResponse;
    }

    private NewCorporateCreateResponse newCorporateCreateResponse;

    public NewCreateCorporateCustomerRequest getNewCreateCorporateCustomerRequest() {
        return newCreateCorporateCustomerRequest;
    }

    public void setNewCreateCorporateCustomerRequest(NewCreateCorporateCustomerRequest newCreateCorporateCustomerRequest) {
        this.newCreateCorporateCustomerRequest = newCreateCorporateCustomerRequest;
    }

    private NewCreateCorporateCustomerRequest newCreateCorporateCustomerRequest;
//----------------------

    //Order Capture
    private String productName;

    //
    private List<ListTroubleTicketsResponse> lttr;
    private List<TroubleTicketSpecificationResponse> lttsr;
    private TroubleTicketResponse troubleTicketResponse;

    //JIRA
    private XRAYExecutionResults xrayer;
    //Gui
    private MusteriPageData musteriPageData = new MusteriPageData();
    private CustomerCaseManagementData customerCaseManagementData = new CustomerCaseManagementData();
    private CustomerManagementData customerManagementData;

    //API
    private ApiData apiData = new ApiData();

    public String getFrontEndURL() {
        return frontEndURL;
    }

    public void setFrontEndURL(String frontEndURL) {
        this.frontEndURL = frontEndURL;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public void setResponseRest(Response responseRest) {
        this.responseRest = responseRest;
    }



    public void setListTroubleTicketsResponse(List<ListTroubleTicketsResponse> l) {
        this.lttr = l;
    }

    public void setListTroubleTicketSpecificationResponse(List<TroubleTicketSpecificationResponse> l) {
        this.lttsr = l;
    }

    public void setXRAYER(XRAYExecutionResults xrayer) {
        this.xrayer = xrayer;
    }

    public void setMusteriPageData(MusteriPageData musteriPageData) {
        this.musteriPageData = musteriPageData;
    }

    public void setCustomerCaseManagementData(CustomerCaseManagementData customerCaseManagementData) {
        this.customerCaseManagementData = customerCaseManagementData;
    }

    public void setCustomerManagementData(CustomerManagementData customerManagementData) {
        this.customerManagementData = customerManagementData;
    }

    public void setApiData(ApiData apiData) {
        this.apiData = apiData;
    }


    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static void AssertApiSuccess(Response response) {
        Assert.assertEquals(response.then().extract().path("success").toString(), "true");
    }

    public void AssertApiSuccess() {
        log.info("Response Message: " + getMessage());
        Assert.assertTrue(getSuccess(), "success true bekleniyor ancak true değil");
    }

    public void AssertApiFail() {
        log.info("Response Message: " + getMessage());
        Assert.assertFalse(getSuccess(), "success false bekleniyor ancak false değil");
    }

    public void AssertApiMessage(String message) {
        log.info("Response Message: " + getMessage());
        Assert.assertEquals(getMessage(), message, "Beklenen mesaj: '" + message + "' gelmedi");
    }


    public String getIdentificationNumberResidential() {
        return identificationNumberResidential;
    }

    public void setIdentificationNumberResidential(String identificationNumber) {
        this.identificationNumberResidential = identificationNumber;
    }

    public String getIdentificationNumberForeigner() {
        return identificationNumberForeigner;
    }

    public void setIdentificationNumberForeigner(String identificationNumberForeigner) {
        this.identificationNumberForeigner = identificationNumberForeigner;
    }

    public String getNiptNumber() {
        return niptNumber;
    }

    public void setNiptNumber(String niptNumber) {
        this.niptNumber = niptNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getIdentificationNumberResidentialContact() {
        return identificationNumberResidentialContact;
    }

    public void setIdentificationNumberResidentialContact(String identificationNumberResidentialContact) {
        this.identificationNumberResidentialContact = identificationNumberResidentialContact;
    }

    public String getIdentificationNumberCorporate() {
        return identificationNumberCorporate;
    }

    public void setIdentificationNumberCorporate(String identificationNumberCorporate) {
        this.identificationNumberCorporate = identificationNumberCorporate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    public String getRelatedPartyID() {
        return relatedPartyID;
    }

    public void setRelatedPartyID(String relatedPartyID) {
        this.relatedPartyID = relatedPartyID;
    }

    public List<AccountManagementResponse> getAccountManagementResponseList() {
        return accountManagementResponseList;
    }

    public void setAccountManagementResponseList(List<AccountManagementResponse> accountManagementResponse) {
        this.accountManagementResponseList = accountManagementResponse;
    }

    public AttachmentResponse getAttachmentResponse() {
        return attachmentResponse;
    }

    public void setAttachmentResponse(AttachmentResponse attachmentResponse) {
        this.attachmentResponse = attachmentResponse;
    }

    public CustomerManagementResponse getCustomerManagementResponse() {
        return customerManagementResponse;
    }

    public void setCustomerManagementResponse(CustomerManagementResponse customerManagementResponse) {
        this.customerManagementResponse = customerManagementResponse;
    }

    public AccountManagementResponse getAccountManagementResponse() {
        return accountManagementResponse;
    }

    public void setAccountManagementResponse(AccountManagementResponse accountManagementResponse) {
        this.accountManagementResponse = accountManagementResponse;
    }

    public void setAggregatedCustomerCreateResponse(CreateAggResidentialResponse createAggResidentialResponse) {
        this.createAggResidentialResponse = createAggResidentialResponse;
    }

    public void setAggregatedCustomerCreateRequest(CreateAggResidentialRequest createAggResidentialRequest) {
        this.createAggResidentialRequest = createAggResidentialRequest;
    }


    public void setCreateAggCorporateRequest(CreateAggCorporateRequest createAggCorporateRequest) {
        this.createAggCorporateRequest = createAggCorporateRequest;
    }

    public void setCreateAggCorporateResponse(CreateAggCorporateResponse createAggCorporateResponse) {
        this.createAggCorporateResponse = createAggCorporateResponse;
    }

    public PartyManagementResponse getPartyManagementResponse() {
        return partyManagementResponse;
    }

    public void setPartyManagementResponse(PartyManagementResponse partyManagementResponse) {
        this.partyManagementResponse = partyManagementResponse;
    }
    public TroubleTicketResponse
    getTroubleTicketResponse() {
        return troubleTicketResponse;
    }

    public void setTroubleTicketResponse(TroubleTicketResponse troubleTicketResponse) {
        this.troubleTicketResponse = troubleTicketResponse;
    }

    public OrganizationResponse getOrganizationResponse() {
        return organizationResponse;
    }

    public void setOrganizationResponse(OrganizationResponse organizationResponse) {
        this.organizationResponse = organizationResponse;
    }

    public String getServiceActivationDate() {
        return serviceActivationDate;
    }

    public void setServiceActivationDate(String serviceActivationDate) {
        this.serviceActivationDate = serviceActivationDate;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public ShoppingCartActiveResponse getShoppingCartActiveResponse() {
        return shoppingCartActiveResponse;
    }

    public void setShoppingCartActiveResponse(ShoppingCartActiveResponse shoppingCartActiveResponse) {
        this.shoppingCartActiveResponse = shoppingCartActiveResponse;
    }

    public PartyManagementIdResponse getPartyManagementIdResponse() {
        return partyManagementIdResponse;
    }

    public void setPartyManagementIdResponse(PartyManagementIdResponse partyManagementIdResponse) {
        this.partyManagementIdResponse = partyManagementIdResponse;
    }

    public void setMigrationCustomerId(String migrationCustomerId) {
        this.migrationCustomerId = migrationCustomerId;
    }

    public String getMigrationCustomerId() {
        return migrationCustomerId;
    }
}
