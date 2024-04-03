package dnext.com.step_definitions.gui.customer360;

import com.utilities.Utils;
import dnext.com.pages.BasePage;
import dnext.com.pages.customer360.BusinessCustomerTaxExemptUpdatePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;

@Log4j2
@AllArgsConstructor
public class BusinessCustomerTaxExemptUpdateStepDefinitions extends BasePage {
    BusinessCustomerTaxExemptUpdatePage businessCustomerTaxExemptUpdatePage;

    @When("User clicks General button on Customer360 search page")
    public void user_clicks_general_button_on_customer360_search_page() {
        clickField(businessCustomerTaxExemptUpdatePage.generalButtonOnCustomerSearch);
    }

    @When("User clicks the three dots on Customer Information page")
    public void user_clicks_the_three_dots_on_customer_information_page() {
        clickField(businessCustomerTaxExemptUpdatePage.threeDotToUpdateCustomerInfo);
    }

    @When("User clicks the Edit button on Customer Information page")
    public void user_clicks_the_edit_button_on_customer_information_page() {
        clickField(businessCustomerTaxExemptUpdatePage.editButtonForUpdateCustomerInfo);
    }

    @When("User clicks the Tax Exempt dropdown button on Customer Information page")
    public void user_clicks_the_tax_exempt_dropdown_button_on_customer_information_page() {
        clickField(businessCustomerTaxExemptUpdatePage.taxExemptDropdownBox);
    }

    @When("User clicks the NO option from the dropdown on Customer Information page")
    public void user_clicks_the_no_option_from_the_dropdown_on_customer_information_page() {
        clickField(businessCustomerTaxExemptUpdatePage.taxExemptDropdownNOption);
    }

    @When("User clicks the Save button on Customer Information page")
    public void user_clicks_the_save_button_on_customer_information_page() {
        clickField(businessCustomerTaxExemptUpdatePage.saveButtonForUpdateCustomerInfo);
    }

    @Then("User should see the {string} pop up warning message on Customer Information page")
    public void user_should_see_the_pop_up_warning_message_on_customer_information_page(String warning) {
        Utils.waitForVisibility(businessCustomerTaxExemptUpdatePage.warningMessageAfterUpdatingCustomerInfo, 10);
        warningMessage(warning, businessCustomerTaxExemptUpdatePage.warningMessageAfterUpdatingCustomerInfo);

    }

}
