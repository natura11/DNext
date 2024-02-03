package optiim.steps.api.tickets;

import optiim.api.testauto.TestAutoApi;
import optiim.framework.helpers.ApiHelper;
import optiim.framework.helpers.WorldHelper;
import optiim.framework.utils.log;
import optiim.models.api.tickets.ListTroubleTicketsResponse;
import optiim.models.api.troubleticketmanagement.CustomFieldValuePair;
import optiim.models.api.troubleticketmanagement.IssueTypeRequest;
import optiim.models.api.troubleticketmanagement.PiaExtension;
import optiim.models.api.troubleticketmanagement.response.RelatedParty;
import optiim.models.api.troubleticketmanagement.response.TroubleTicketResponse;
import optiim.models.data.api.ApiData;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TicketSteps extends ApiHelper{

    private final WorldHelper worldHelper;
    private final ApiData apiData;

    public TicketSteps(WorldHelper worldHelper, ApiData apiData) {
        this.worldHelper = worldHelper;
        this.apiData = apiData;
    }


    @DataTableType
    public IssueTypeRequest createFixLineSalesTypeRequest(Map<String, String> entry) {
        IssueTypeRequest issueTypeRequest = new IssueTypeRequest();
        issueTypeRequest.setName(entry.get("name"));
        issueTypeRequest.setDescription(entry.get("description"));
        issueTypeRequest.setSeverity(entry.get("severity"));
        issueTypeRequest.setPriority(entry.get("priority"));
        issueTypeRequest.setTicketType(entry.get("ticketType"));

        PiaExtension piaExtension = new PiaExtension();
        List<CustomFieldValuePair> customFieldValuePairList = new ArrayList<>();

        if(entry.get("custom1Value")!=null) {
            CustomFieldValuePair customFieldValuePair1 = new CustomFieldValuePair();
            List<String> valueList1 = new ArrayList<>();
            valueList1.add(entry.get("custom1Value"));
            customFieldValuePair1.setId(entry.get("custom1ID"));
            customFieldValuePair1.setValue(valueList1);
            customFieldValuePairList.add(customFieldValuePair1);
        }
        if(entry.get("custom2Value")!=null) {
            CustomFieldValuePair customFieldValuePair2 = new CustomFieldValuePair();
            List<String> valueList2 = new ArrayList<>();
            valueList2.add(entry.get("custom2Value"));
            customFieldValuePair2.setId(entry.get("custom2ID"));
            customFieldValuePair2.setValue(valueList2);
            customFieldValuePairList.add(customFieldValuePair2);
        }
        if(entry.get("custom3Value")!=null) {
            CustomFieldValuePair customFieldValuePair3 = new CustomFieldValuePair();
            List<String> valueList3 = new ArrayList<>();
            valueList3.add(entry.get("custom3Value"));
            customFieldValuePair3.setId(entry.get("custom3ID"));
            customFieldValuePair3.setValue(valueList3);
            customFieldValuePairList.add(customFieldValuePair3);
        }
        if(entry.get("custom4Value")!=null) {
            CustomFieldValuePair customFieldValuePair4 = new CustomFieldValuePair();
            List<String> valueList4 = new ArrayList<>();
            valueList4.add(entry.get("custom4Value"));
            customFieldValuePair4.setId(entry.get("custom4ID"));
            customFieldValuePair4.setValue(valueList4);
            customFieldValuePairList.add(customFieldValuePair4);
        }

        piaExtension.setCustomFieldValuePair(customFieldValuePairList);
        issueTypeRequest.setPiaExtension(piaExtension);

        List<RelatedParty> relatedPartyList = new ArrayList<>();
        RelatedParty relatedParty = new RelatedParty();
//        worldHelper.getRelatedPartyID();
        if(!(worldHelper.getCreateAggResidentialResponse() ==null) ) {
            relatedParty.setId(worldHelper.getCreateAggResidentialResponse().getId());
        }
        if(!(worldHelper.getNewCorporateCreateResponse() == null) ) {
            relatedParty.setId(worldHelper.getNewCorporateCreateResponse().getId());
        }
        if(!(worldHelper.getNewIndividualCreateResponse() ==null) ) {
            relatedParty.setId(worldHelper.getNewIndividualCreateResponse().getId());
        }
        relatedParty.setRole("customer");
        relatedParty.setReferredType("Customer");
        relatedPartyList.add(relatedParty);
        issueTypeRequest.setRelatedParty(relatedPartyList);

        return issueTypeRequest;
    }


    @When("I List Trouble Tickets")
    public void getTroubleTicketList() throws IOException {
        List<ListTroubleTicketsResponse> lttr = TestAutoApi.listAllTroubleTickets();
        worldHelper.setListTroubleTicketsResponse(lttr);
        log.info("Api worked.");
    }

    @When("I Create Ticket")
    public void createTicket(IssueTypeRequest issueTypeRequest) throws IOException {
        TroubleTicketResponse troubleTicketResponse = TestAutoApi.createTicket(issueTypeRequest);
        worldHelper.setTroubleTicketResponse(troubleTicketResponse);
        log.info("Api worked.");
    }

    @When("I Retrieve Ticket {string}")
    public void getAfterSalesIssueCaseType(String ticketNumber) throws IOException {
        if(ticketNumber.isEmpty()){
            log.info(worldHelper.getTroubleTicketResponse().getId());
            TestAutoApi.retrieveTicket(worldHelper.getTroubleTicketResponse().getId());
        }else {
            TestAutoApi.retrieveTicket(ticketNumber);
        }
        log.info("Api worked.");
    }

    @When("I Delete Ticket {string}")
    public void deleteTroubleTicket(String ticketNumber) throws IOException {
        TestAutoApi.deleteTicket(ticketNumber);
        log.info("Api worked.");
    }

    @When("I Get Trouble Ticket Specification")
    public void getTroubleTicketSpecification() throws IOException {
        TestAutoApi.troubleTicketSpecification();
        log.info("Api worked.");
    }

    @When("I Land Widget Page {string}")
    public void landingPage(String page) throws IOException {
        TestAutoApi.landPage(page);
        log.info("Api worked.");
    }


    @Then("I should expect the result of {string}")
    public void i_should_expect_the_result_of(String statusCode) throws Throwable {
        Assert.assertEquals(responseRest.getStatusCode(), Integer.parseInt(statusCode), "Api did not work successfully. Incoming Status Code:" + responseRest.getStatusCode());
        log.info("Api worked successfully.");
        log.info("Status code:" + responseRest.getStatusCode());
        //Service not active and callable

    }

}
