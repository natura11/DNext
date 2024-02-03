package optiim.steps.gui.customermanagement;

import optiim.framework.UrlBuilder;
import optiim.framework.helpers.WebDriverHelper;
import optiim.pages.customermanagement.SearchPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class SearchSteps {

    private final WebDriverHelper webDriverHelper;
    private final UrlBuilder urlBuilder;
    private final SearchPage searchPage;

    @Then("I should be seeing that the {string} title for Search Page")
    public void I_should_be_seeing_that_the_title_for_Search_Page(String titleMessage) throws Throwable {
        searchPage.controlSearchCustomer(titleMessage);
    }

    @When("I enter a value {string} in the Identification Number field and click Search button for Search Page")
    public void ıEnterAValueInTheIdentificationNumberFieldAndClickSearchButtonForSearchPage(String identificationNumber) throws Throwable {
        searchPage
                .enterIdentificationNumber(identificationNumber);
    }
}