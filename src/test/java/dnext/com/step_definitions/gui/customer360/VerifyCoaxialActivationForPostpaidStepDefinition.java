package dnext.com.step_definitions.gui.customer360;

import com.utilities.Utils;
import dnext.com.pages.BasePage;
import dnext.com.pages.customer360.VerifyCoaxialActivationForPostpaidPage;
import dnext.com.pages.customer360.VtvActivationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

import static dnext.com.pages.customer360.FiberActivationForPrepaidPage.orderStatus;
import static dnext.com.pages.customer360.FiberActivationForPrepaidPage.verifyTheOrderStatusIsCompleted;


@Log4j2
@AllArgsConstructor
public class VerifyCoaxialActivationForPostpaidStepDefinition extends BasePage {
VerifyCoaxialActivationForPostpaidPage verifyCoaxialActivationForPostpaidPage;
VtvActivationPage vtvActivationPage;
    @Then("User selects the Recurring Products on Customer360 search page")
    public void user_selects_the_recurring_products_on_customer360_search_page() {
        clickField(verifyCoaxialActivationForPostpaidPage.recurringProductsOption);
    }
    @When("User selects Internet option from products for caoxial on Customer360 search page")
    public void user_selects_internet_option_from_products_for_caoxial_on_customer360_search_page() {
        Utils.scrollToElement(verifyCoaxialActivationForPostpaidPage.internetOptionForCoaxial);
       clickField(verifyCoaxialActivationForPostpaidPage.internetOptionForCoaxial);
    }
    @Then("User selects {int} X ALL2000 as Contract Duration on Customer360 search page")
    public void user_selects_x_all2000_as_contract_duration_on_customer360_search_page(Integer int1) {
        clickField(verifyCoaxialActivationForPostpaidPage.option12XALL2000ContractDurationForForCoaxial);
    }
    @Then("User selects the Coaxial as Infrustructure on Customer360 search page")
    public void user_selects_the_coaxial_as_infrustructure_on_customer360_search_page() {
     clickField(verifyCoaxialActivationForPostpaidPage.coaxialOptionForForCoaxial);

    }
    @Then("User selects {int} X ALL012XALL0 Contract Duration from Akses Fee per Modem Basic on Customer360 search page")
    public void user_selects_x_all012xall0_contract_duration_from_akses_fee_per_modem_basic_on_customer360_search_page(Integer int1) {
    clickField(verifyCoaxialActivationForPostpaidPage.option12XALL0ContractDurationForBasicMEnterpriseModem);
    }
    @Then("User enters  serial number into the MACadress  field on Customer360 search page")
    public void user_enters_serial_number_into_the_ma_cadress_field_on_customer360_search_page() {
       verifyCoaxialActivationForPostpaidPage.numbersCreationForMacAdreess();
       Utils.waitFor(10);
    }
    @Then("User should see the Order Status Coaxial Activation turned to completed  on Customer360 search page")
    public void user_should_see_the_order_status_coaxial_activation_turned_to_completed_on_customer360_search_page() {
        Utils.waitFor(3);
        verifyCoaxialActivationForPostpaidPage.verifyTheOrderStatusIsCompleted();
    }

    @Then("User clicks Order id of the selected product on Customer360 search page")
    public void user_clicks_order_id_of_the_selected_product_on_customer360_search_page() {
        clickField(vtvActivationPage.orderIdField);
    }


    @And("User clicks Order status button on Customer{int} search page")
    public void userClicksOrderStatusButtonOnCustomerSearchPage(int arg0) {
        clickField(verifyCoaxialActivationForPostpaidPage.orderStatus);
    }
}
