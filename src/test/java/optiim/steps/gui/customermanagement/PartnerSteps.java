package optiim.steps.gui.customermanagement;

import optiim.framework.UrlBuilder;
import optiim.framework.helpers.WebDriverHelper;
import optiim.pages.customermanagement.PartnerPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class PartnerSteps {

    private final WebDriverHelper webDriverHelper;
    private final UrlBuilder urlBuilder;
    private final PartnerPage partnerPage;


    @Then("I should be seeing that the {string} page is opened for Partner Page")
    public void ıShouldBeSeeingThatThePageİsOpenedForPartnerPage(String titleName) throws Throwable {
        partnerPage
                .controlPageTitleName(titleName);
    }


    @When("I click the Select Search Type button")
    public void ıClickTheSelectSearchTypeButton() throws Throwable {
        partnerPage
                .clickSelectSearchTypeButton();
    }

    @Then("I should be seeing that {string} values are displayed")
    public void ıShouldBeSeeingThatValuesAreDisplayed(String fieldName) {
        partnerPage
                .controlSearchTypeField(fieldName);
    }

    @When("I select a value {string} in the Partner Search Type field")
    public void ıSelectAValueInThePartnerSearchTypeField(String searchType) throws Throwable {
        partnerPage
                .selectPartnerSearchType(searchType);
    }

    @And("I enter a value {string} in the Search Text field")
    public void ıEnterAValueInTheSearchTextField(String searchName) throws Throwable {
        partnerPage
                .enterSearchText(searchName);
    }

    @And("I click Partner menu")
    public void ıClickPartnerMenu() throws Throwable {
        partnerPage
                .clickPartnerMenu();
    }
}
