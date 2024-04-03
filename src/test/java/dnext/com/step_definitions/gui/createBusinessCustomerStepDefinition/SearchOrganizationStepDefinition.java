package dnext.com.step_definitions.gui.createBusinessCustomerStepDefinition;

import dnext.com.pages.BasePage;
import dnext.com.pages.createBusinnesCustomerPages.CreateBusinessCustomerCommonPage;
import dnext.com.pages.createBusinnesCustomerPages.SearchOrganizationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.Keys;

@AllArgsConstructor
@Log4j2
public class SearchOrganizationStepDefinition extends BasePage {
    private SearchOrganizationPage searchOrganizationPage;
    private CreateBusinessCustomerCommonPage createBusinessCustomerCommonPage;

    @Given("User opens Create Business Customer page on Home page")
    public void user_opens_create_business_customer_page_on_home_page() throws InterruptedException {
        searchOrganizationPage.openCreateBusinessCustomerPage();
    }

    @Given("User should see the {string} on Create Business Customer page")
    public void user_should_see_the_on_create_business_customer_page(String pageUrl) throws InterruptedException {
        searchOrganizationPage.getCurrentUrl(pageUrl);
    }

    @Given("User should see the {string} header on screen on Create Business Customer page")
    public void user_should_see_the_header_on_screen_on_create_business_customer_page(String header) {
        createBusinessCustomerCommonPage.VerificationNewBusinessCustomerHeader(header);
    }

    @Given("User selects the Albanian Customer from the dropdown on Search Organization page")
    public void user_selects_the_albanian_customer_from_the_dropdown_on_search_organization_page() {
        searchOrganizationPage.selectOfAlbanianCustomerType();
    }

    @When("User fills in the NIPT field with existing {string} nıpt number on Search Organization page")
    public void userFillsInTheNIPTFieldWithExistingNıptNumberOnSearchOrganizationPage(String value) {
        searchOrganizationPage.usingExistenceNiptNumber(value);
    }

    @When("User clicks the Search button on Search Organization page")
    public void user_clicks_the_search_button_on_search_organization_page() {
        searchOrganizationPage.searchBtnClickOnSearchOrgPage();
    }

    @Then("One {string} is displayed on the screen on Search Organization page")
    public void one_is_displayed_on_the_screen_on_search_organization_page(String popUpWarning) {
        searchOrganizationPage.popUpWarningValidationOfExistenceNumber(popUpWarning);
    }

    @When("User fills in the NIPT field with invalid format  {string} on Search Organization page")
    public void userFillsInTheNIPTFieldWithInvalidFormatOnSearchOrganizationPage(String invalidInput) {
        searchOrganizationPage.negativNiptInput(invalidInput);
    }

    @Then("User sees {string} under the NIPT field on Search Organization page")
    public void userSeesUnderTheNIPTFieldOnSearchOrganizationPage(String warningMsg) {
        searchOrganizationPage.warningMessageOfnegativNiptInput(warningMsg);
    }

    @And("User is not allowed to use the search button on Search Organization page")
    public void userIsNotAllowedToUseTheSearchButtonOnSearchOrganizationPage() {
        searchOrganizationPage.verifySearchBtnEnable();
    }

    @When("User fills in the NIPT field with valid and non-existing  {string} on Search Organization page")
    public void userFillsInTheNIPTFieldWithValidAndNonExistingOnSearchOrganizationPage(String validNonExistenceInput) {
        searchOrganizationPage.usingNonExistenceNiptNumber(validNonExistenceInput);
    }

    @And("User clicks the Next button on Search Organization page")
    public void userClicksTheNextButtonOnSearchOrganizationPage() {
        searchOrganizationPage.nextBtnClickOnSearchPage();
    }

    @Then("User should see the {string} header on General Information  page")
    public void userShouldSeeTheHeaderOnGeneralInformationPage(String header) {
        createBusinessCustomerCommonPage.controlTab(header);
    }

    @Given("User selects the Foreign Customer from the dropdown on Search Organization page")
    public void userSelectsTheForeignCustomerFromTheDropdownOnSearchOrganizationPage() {
        searchOrganizationPage.selectOfForeignCustomerType();
    }

    @When("User fills in the NIPT field with  NIPT numbers on Search Organization page")
    public void userFillsInTheNIPTFieldWithNIPTNumbersOnSearchOrganizationPage() {
        searchOrganizationPage.inputNiptForForeignCustomer();
    }

    @Then("User should see the {string} text on General Information page")
    public void userShouldSeeTheTextOnGeneralInformationPage(String header) {
        createBusinessCustomerCommonPage.controlTab(header);
    }
}