package dnext.com.step_definitions.gui.customer360;
import com.utilities.Utils;
import dnext.com.pages.BasePage;
import dnext.com.pages.customer360.GovermentDefaultBillingAdressUpdatePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GovermentDefaultBillingAdressUpdateStepDefination extends BasePage {
    GovermentDefaultBillingAdressUpdatePage govermentDefaultBillingAdressUpdatePage;

    @Given("User clicks select search Type field on Customer360 search page")
    public void user_clicks_select_search_type_field_on_customer360_search_page() {
        clickField(govermentDefaultBillingAdressUpdatePage.selectSearchTypeBtn);
    }
    @Given("User selects Customer Id options on Customer360 search page")
    public void user_selects_customer_ıd_options_on_customer_search_page() {
        clickField(govermentDefaultBillingAdressUpdatePage.selectSearchTypeWithCostomerId);
    }
    @Given("User fills in enter Customer Id field with valid {string} id on Customer360 search page")
    public void user_fills_in_enter_customer_ıd_field_with_valid_id_on_customer360_search_page(String string) {
        govermentDefaultBillingAdressUpdatePage.usingValidCustomerId(string);
    }
    @Given("User clicks Search Button on Customer360 search page")
    public void user_clicks_search_button_on_customer360_search_page() {
        clickField(govermentDefaultBillingAdressUpdatePage.searchBtnOnCustomerSearch);
    }
    @Given("User selects opened name of id on Customer360 search page")
    public void user_selects_opened_name_of_id_on_customer360_search_page() {
        clickField(govermentDefaultBillingAdressUpdatePage.idInfofield);
    }
    @Given("User should  clicks Address button on Customer360 search page")
    public void user_should_clicks_address_button_on_customer360_search_page() {
        Utils.waitFor(5);
        clickField(govermentDefaultBillingAdressUpdatePage.adressFieldOnCustomerSerch);
    }
    @Given("User clicks on the three dots near the DEFAULT_BILLING_ADDRESS on Customer360 search page")
    public void user_clicks_on_the_dots_near_the_default_bıllıng_address_on_customer360_search_page() {
        Utils.waitFor(3);
        clickField(govermentDefaultBillingAdressUpdatePage.editIconForUndateBillingAdress);
    }
    @Given("User clicks Edit Button on DEFAULT_BILLING_ADDRESS Customer360 search page")
    public void user_clicks_edit_button_on_default_bıllıng_address_customer360_search_page() {
        clickField(govermentDefaultBillingAdressUpdatePage.editButtonForUndateBillingAdress);
    }
    @Given("User rewrite Address Line1 as {string}  on Customer360 search page")
    public void user_rewrite_address_line1_as_on_customer360_search_page(String string) {
      govermentDefaultBillingAdressUpdatePage.usingNewDataForAddress1(string);
    }
    @Given("User rewrite Address Line2 as {string} on Customer360 search page")
    public void user_rewrite_address_line2_as_on_customer360_search_page(String string) {
        govermentDefaultBillingAdressUpdatePage.usingNewDataForAddress2(string);
    }
    @Given("User rewrite Post Code as {string} on Customer360 search page")
    public void user_rewrite_post_code_as_on_customer360_search_page(String string) {
        govermentDefaultBillingAdressUpdatePage.usingNewDataForPostCode(string);
    }
    @Given("User clicks Save Button on Customer360 search page")
    public void user_clicks_save_button_on_customer360_search_page() {
       clickField(govermentDefaultBillingAdressUpdatePage.saveBtnOnDefaultBillingAdress);
    }
    @Then("User should see this  {string} pop up message top of screen on Customer360 search page")
    public void user_should_see_this_pop_up_message_top_of_screen_on_customer360_search_page(String string) {
        govermentDefaultBillingAdressUpdatePage.verifyAddressupdatedsuccessfullyMessage(string);
    }

}
