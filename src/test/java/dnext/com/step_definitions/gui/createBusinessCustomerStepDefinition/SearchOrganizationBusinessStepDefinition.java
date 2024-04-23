package dnext.com.step_definitions.gui.createBusinessCustomerStepDefinition;

import dnext.com.pages.BasePage;
import dnext.com.pages.CustomerCommonPage;
import dnext.com.pages.createBusinessCustomerPages.SearchOrganizationBusinessPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@AllArgsConstructor
@Log4j2
public class SearchOrganizationBusinessStepDefinition extends BasePage {
    private SearchOrganizationBusinessPage searchOrganizationBusinessPage;
    private CustomerCommonPage customerCommonPage;

    @Given("User should see the {string} on Create Business Customer page")
    public void user_should_see_the_on_create_business_customer_page(String pageUrl) {
        searchOrganizationBusinessPage.getCurrentUrl(pageUrl);
    }

    @Given("User selects the Albanian Customer from the dropdown on Search Organization page")
    public void user_selects_the_albanian_customer_from_the_dropdown_on_search_organization_page() {
        searchOrganizationBusinessPage.selectOfAlbanianCustomerType();
    }

    @When("User fills in the NIPT field with existing {string} nıpt number on Search Organization page")
    public void userFillsInTheNIPTFieldWithExistingNıptNumberOnSearchOrganizationPage(String value) {
        searchOrganizationBusinessPage.usingExistenceNiptNumber(value);
    }

    @When("User clicks the Search button on Search Organization page")
    public void user_clicks_the_search_button_on_search_organization_page() {
        searchOrganizationBusinessPage.searchBtnClickOnSearchOrgPage();
    }

    @Then("One {string} is displayed on the screen on Search Organization page")
    public void one_is_displayed_on_the_screen_on_search_organization_page(String popUpWarning) {
        searchOrganizationBusinessPage.popUpWarningValidationOfExistenceNumber(popUpWarning);
    }

    @When("User fills in the NIPT field with invalid format  {string} on Search Organization page")
    public void userFillsInTheNIPTFieldWithInvalidFormatOnSearchOrganizationPage(String invalidInput) {
        searchOrganizationBusinessPage.negativNiptInput(invalidInput);
    }

    @Then("User sees {string} under the NIPT field on Search Organization page")
    public void userSeesUnderTheNIPTFieldOnSearchOrganizationPage(String warningMsg) {
        searchOrganizationBusinessPage.warningMessageOfnegativNiptInput(warningMsg);
    }

    @And("User is not allowed to use the search button on Search Organization page")
    public void userIsNotAllowedToUseTheSearchButtonOnSearchOrganizationPage() {
        searchOrganizationBusinessPage.verifySearchBtnEnable();
    }

    @When("User fills in the NIPT field with valid and non-existing  {string} on Search Organization page")
    public void userFillsInTheNIPTFieldWithValidAndNonExistingOnSearchOrganizationPage(String validNonExistenceInput) {
        searchOrganizationBusinessPage.usingNonExistenceNiptNumber(validNonExistenceInput);
    }

    @And("User clicks the Next button on Search Organization page")
    public void userClicksTheNextButtonOnSearchOrganizationPage() {
        searchOrganizationBusinessPage.nextBtnClickOnSearchPage();
    }

    @Given("User selects the Foreign Customer from the dropdown on Search Organization page")
    public void userSelectsTheForeignCustomerFromTheDropdownOnSearchOrganizationPage() {
        searchOrganizationBusinessPage.selectOfForeignCustomerType();
    }

    @When("User fills in the NIPT field with  NIPT numbers on Search Organization page")
    public void userFillsInTheNIPTFieldWithNIPTNumbersOnSearchOrganizationPage() {
        searchOrganizationBusinessPage.fillNIPTFieldWithRandomForeignNumber();
    }

    @When("User enters random NIPT for ALBANIAN to the NIPT number field on Search Organization page")
    public void userEntersRandomNIPTForALBANIANToTheNIPTNumberField() {
        searchOrganizationBusinessPage.fillNIPTFieldWithRandomAlbanianNumber();
    }


    @And("User checks the NIPT is usable or not on Search Business page")
    public void userChecksTheNIPTIsUsableOrNotOnSearchBusinessPage() {
        searchOrganizationBusinessPage.checkNIPTIsAvailableOrNot();
    }

    @Then("User should see the random NIPT is new for ALBANIAN on Search Business page")
    public void userShouldSeeTheRandomNIPTIsNewForALBANIAN() {
        searchOrganizationBusinessPage.verifyOrganizationIsNew();
    }
}