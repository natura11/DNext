package dnext.com.step_definitions.createBusinessCustomerStepDefinition;

import com.github.javafaker.Faker;
import com.utilities.Utils;
import dnext.com.pages.BasePage;
import dnext.com.pages.HomePage;
import dnext.com.pages.createBusinnesCustomerPages.CreateBusinessCustomerCommonPage;
import dnext.com.pages.createBusinnesCustomerPages.SearchOrganizationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchOrganizationStepDefinition extends BasePage {

    HomePage homePage=new HomePage();
    SearchOrganizationPage searchOrganizationPage=new SearchOrganizationPage();
    CreateBusinessCustomerCommonPage createBusinessCustomerCommonPage=new CreateBusinessCustomerCommonPage();
    Faker faker=new Faker();

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
        createBusinessCustomerCommonPage.newBusinessCustomerHeaderVerification(header);
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
        searchOrganizationPage.searchBtnOnSearchOrganizationPage.click();
    }
    @Then("One {string} is displayed on the screen on Search Organization page")
    public void one_is_displayed_on_the_screen_on_search_organization_page(String popUpWarning) {
      searchOrganizationPage.popUpWarningValidationOfExistenceNumber(popUpWarning);
    }

}
