package optiim.steps.api.aggregation;

import optiim.api.testauto.TestAutoApi;
import optiim.framework.helpers.WorldHelper;
import optiim.framework.utils.log;
import optiim.models.api.aggregation.CreateAggResidentialRequest;
import optiim.models.api.customermanagement.CustomerManagementResponse;
import optiim.models.api.customermanagement.PartyManagementResponse;
import optiim.models.data.api.ApiData;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.io.IOException;

public class SearchCustomerSteps {

    private final WorldHelper worldHelper;
    private final ApiData apiData;

    public SearchCustomerSteps(WorldHelper worldHelper, ApiData apiData) {
        this.worldHelper = worldHelper;
        this.apiData = apiData;
    }

    @When("I Search Residential Customer with ID")
    public void searchResidentialCustomerwithID() throws IOException {
        String searchCriteria  = "id=" + worldHelper.getCustomerManagementResponse().getId();
        Assert.assertNotEquals("[]",TestAutoApi.searchAggCustomer(searchCriteria));
        log.info("Api worked.");
    }

    @When("I Search Residential Customer with Name")
    public void searchResidentialCustomerwithName() throws IOException {
        String searchCriteria  = "name*=" + "%" + worldHelper.getCustomerName() + "%";
        Assert.assertNotEquals("[]",TestAutoApi.searchAggCustomer(searchCriteria));
        log.info("Api worked.");
    }

    @When("I Search Residential Customer with Status")
    public void searchResidentialCustomerwithStatus() throws IOException {
        String searchCriteria  = "status=" + "Prospect";
        Assert.assertNotEquals("[]",TestAutoApi.searchAggCustomer(searchCriteria));
        log.info("Api worked.");
    }

    @When("I Search Residential Customer with HREF")
    public void searchResidentialCustomerwithHREF() throws IOException {
        String searchCriteria  = "href=" + worldHelper.getCustomerManagementResponse().getHref();
        Assert.assertNotEquals("[]",TestAutoApi.searchAggCustomer(searchCriteria));
        log.info("Api worked.");
    }

    @When("I Search Residential Customer with EngagedParty ID")
    public void searchResidentialCustomerwithEngagedPartyID() throws IOException {
        String searchCriteria  = "engagedParty.@referredType=Individual&"+ "engagedParty.id=" +worldHelper.getPartyManagementResponse().getId() ;
        Assert.assertNotEquals("[]",TestAutoApi.searchAggCustomer(searchCriteria));
        log.info("Api worked.");
    }

    @When("I Search Residential Customer with EngagedParty GivenName")
    public void searchResidentialCustomerwithEngagedPartyGivenName() throws IOException {
        String searchCriteria  = "engagedParty.@referredType=Individual&"+ "engagedParty.givenName=" + worldHelper.getCustomerName() ;
        Assert.assertNotEquals("[]",TestAutoApi.searchAggCustomer(searchCriteria));
        log.info("Api worked.");
    }

    @When("I Search Residential Customer with EngagedParty FamilyName")
    public void searchResidentialCustomerwithEngagedPartyFamilyName() throws IOException {
        String searchCriteria  = "name*=" + "%" + worldHelper.getCustomerName() + "%" +"&engagedParty.@referredType=Individual&"+ "engagedParty.familyName=" + worldHelper.getPartyManagementResponse().getFamilyName();
        Assert.assertNotEquals("[]",TestAutoApi.searchAggCustomer(searchCriteria));
        log.info("Api worked.");
    }


}
