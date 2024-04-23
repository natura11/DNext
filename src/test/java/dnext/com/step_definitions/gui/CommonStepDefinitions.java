package dnext.com.step_definitions.gui;

import com.utilities.Utils;
import dnext.com.pages.BasePage;
import dnext.com.pages.CustomerCommonPage;
import dnext.com.pages.customer360Pages.CustomerMainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CommonStepDefinitions extends BasePage {

    CustomerCommonPage customerCommonPage;
    CustomerMainPage customerMainPage;


    @And("I refresh the page")
    public void iRefreshThePage() {
        refreshPage();
    }

    @Then("User should see the {string} tab is opened")
    public void userShouldSeeTheTabIsActive(String header) {
        customerCommonPage.verifyInCorrectTab(header);
    }

    @Given("User opens Create Business Customer page on Home page")
    public void user_opens_create_business_customer_page_on_home_page() {
        customerCommonPage.openCreateCustomerPages("Business");
    }

    @Given("User clicks Create Individual Customer on Home page")
    public void user_opens_create_ındividual_customer_on_home_page() {
        customerCommonPage.openCreateCustomerPages("Individual");
    }

    @Given("User opens Create Government Customer page on Home page")
    public void userOpensCreateGovernmentCustomerPageOnHomePage() {
        customerCommonPage.openCreateCustomerPages("Government");
    }

    @Given("User should see the {string} header on screen on Create Customer page")
    public void user_should_see_the_header_on_screen_on_create_business_customer_page(String header) {
        customerCommonPage.verificationCustomerHeader(header);
    }

    @Then("User is on the Customer360 page")
    public void user_is_on_the_customer360_page() {
        elementDisplayed(customerCommonPage.customerSearchIcon);
    }

    @Given("User clicks select Search Type field on Customer360 search page")
    public void userClicksSelectSearchTypeFieldOnCustomerSearchPage() {
        clickField(customerCommonPage.selectSearchTypeBtn);
    }

    @And("User selects Customer Name option from dropdown on Customer360 search page")
    public void userSelectsCustomerNameOptionFromDropdownOnCustomerSearchPage() {
        clickField(customerCommonPage.selectSearchTypeWithCostomerName);
    }

    @And("User fills in enter Customer name field with valid name as {string} on Customer360 search page")
    public void userFillsInEnterCustomerNameFieldWithValidNameAsOnCustomerSearchPage(String name) {
        sendKeys(customerCommonPage.enterCustomerNamefield, name);
    }

    @Given("User clicks Search Button on Customer360 search page")
    public void user_clicks_search_button_on_customer360_search_page() {
        clickField(customerCommonPage.searchBtnOnCustomerSearch);
    }

    @And("User selects opened name of searched name on Customer360 search page")
    public void userSelectsOpenedNameOfSearchedNameOnCustomerSearchPage() {
        clickField(customerCommonPage.searchedNameField);
    }


    @When("User clicks the New Order button for {string} account")
    public void userClicksTheNewOrderButtonForAccount(String orderType) {
        customerCommonPage.clickNewOrderButton(orderType);
    }

    @And("User clicks the {string} button on Customer360 search page")
    public void userClicksTheOrderButtonOnCustomerSearchPage(String tabName) {
       customerCommonPage.clickSpecificTabOnCustomer360(tabName);
    }

    @When("User should be  General part  under  Main page  button on Customer360 search page")
    public void userShouldBeGeneralPartUnderMainPageButtonOnCustomerSearchPage() {
        isElementDisplayed(customerMainPage.customerInformationTxtOnGeneral);
    }

}
