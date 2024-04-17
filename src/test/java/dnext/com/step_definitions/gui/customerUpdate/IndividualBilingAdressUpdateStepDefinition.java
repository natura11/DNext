package dnext.com.step_definitions.gui.customerUpdate;
import com.utilities.Utils;
import dnext.com.pages.BasePage;
import dnext.com.pages.customerUpdatePages.GovermentDefaultBillingAdressUpdatePage;
import dnext.com.pages.customerUpdatePages.IndividualBilingAdressUpdatePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@AllArgsConstructor
public class IndividualBilingAdressUpdateStepDefinition extends BasePage {
    GovermentDefaultBillingAdressUpdatePage govermentDefaultBillingAdressUpdatePage;
    IndividualBilingAdressUpdatePage individualBilingAdressUpdatePage;

    @Given("User selects Customer name options on Customer360 search page")
    public void user_selects_customer_name_options_on_customer360_search_page() {
        clickField(govermentDefaultBillingAdressUpdatePage.selectSearchTypeWithCostomerName);
    }

    @Given("User fills in enter Customer name field with valid {string}  on Customer360 search page")
    public void user_fills_in_enter_customer_name_field_with_valid_on_customer360_search_page(String name) {
        sendKeys(individualBilingAdressUpdatePage.enterCustomerNamefield, name);
    }

    @Given("User selects opened name on Customer360 search page")
    public void user_selects_opened_name_on_customer360_search_page() {
        clickField(individualBilingAdressUpdatePage.selectEnteredName);
    }

    @And("User clicks the city dropdown on Customer{int} search page")
    public void userClicksTheCityDropdownOnCustomerSearchPage(int arg0) {
        clickField(govermentDefaultBillingAdressUpdatePage.cityDropdownButtonOnAddressPage);
    }

    @When("User selects City as BERAT on Customer360 search page")
    public void user_selects_city_as_berat_on_customer360_search_page() {
        clickField(govermentDefaultBillingAdressUpdatePage.cityBeratButtonOnAddressPage);
    }

    @And("User cleans the field of post code on Customer{int} search page")
    public void userCleansTheFieldOfPostCodeOnCustomerSearchPage(int arg0) {
        govermentDefaultBillingAdressUpdatePage.editPostCodeOnBillingAdress.clear();
    }

    @And("User update Post Code by entering new one on Customer{int} search page")
    public void userUpdatePostCodeByEnteringNewOneOnCustomerSearchPage(int arg0) {
        individualBilingAdressUpdatePage.randomPostCodeCreation();

    }

    @And("User rewrites Post Code as {string} on Customer{int} search page")
    public void userRewritesPostCodeAsOnCustomerSearchPage(String postcode, int arg1) {
        sendKeys(govermentDefaultBillingAdressUpdatePage.editPostCodeOnBillingAdress, postcode);
    }

    @And("User clicks the cancel button on Address page")
    public void userClicksTheCancelButtonOnAddressPage() {
        clickField(govermentDefaultBillingAdressUpdatePage.cancelButtonOnAddressPage);
    }

    @Then("User should see Address Line one as {string} on Address page")
    public void userShouldSeeAddressLineOneAsOnAddressPage(String addressName1) {
        warningMessage(addressName1,individualBilingAdressUpdatePage.addressLine1OnDefoultAddressPage);
        Utils.waitFor(1);
    }

    @Then("User should see Address Line two as {string} on Address page")
    public void userShouldSeeAddressLineTwoAsOnAddressPage(String addressName2) {
        warningMessage(addressName2,individualBilingAdressUpdatePage.addressLine2OnDefoultAddressPage);
    }

    @Then("User should see City  as BERAT on Address page")
    public void userShouldSeeCityAsBERATOnAddressPage() {
        warningMessage("BERAT", individualBilingAdressUpdatePage.addressLineCityNameOnDefoultAddressPage);
    }

}
