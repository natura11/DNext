package dnext.com.step_definitions.gui.customer360;

import com.utilities.Utils;
import dnext.com.pages.BasePage;
import dnext.com.pages.customer360.FiberActivationForPrepaidPage;
import dnext.com.pages.customer360.VtvActivationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;

@Log4j2
@AllArgsConstructor
public class FiberActivationForPrepaidStepDefinition extends BasePage {

    FiberActivationForPrepaidPage fiberActivationForPrepaidPage;
    VtvActivationPage vtvActivationPage;

    @When("User selects Internet option from products on Customer360 search page")
    public void user_selects_internet_option_from_products_on_customer360_search_page() {
        clickField(fiberActivationForPrepaidPage.internetCheckBoxButton);
    }

    @When("User selects the Vodafone Gigafibra {int} Mbps on Customer360 search page")
    public void user_selects_the_vodafone_gigafibra_mbps_on_customer360_search_page(Integer int1) {
        clickField(fiberActivationForPrepaidPage.vodafoneGigaFibra200MbpsOption);
    }

    @Then("User is directed to the Vodafone GigaFibra {int} Mbps page for details of equipments on Customer360 search page")
    public void user_is_directed_to_the_vodafone_giga_fibra_mbps_page_for_details_of_equipments_on_customer360_search_page(Integer int1) {
        Assert.assertEquals("Vodafone GigaFibra 200 Mbps", fiberActivationForPrepaidPage.vodafoneGigaFibra200MbpsTextOnProducts.getText());
    }

    @When("User selects cash methods as ALL12600 6Month for Vodafone Gigafibra {int} Mbpson Customer360 search page")
    public void user_selects_cash_methods_as_all12600_6month_for_vodafone_gigafibra_mbpson_customer360_search_page(Integer int1) {
        clickField(fiberActivationForPrepaidPage.aLL126006MonthCashOption);
    }

    @When("User clicks the Infrusructure dropdown button  Customer360 search page")
    public void user_clicks_the_infrusructure_dropdown_button_customer360_search_page() {
        clickField(fiberActivationForPrepaidPage.dropdownForFiberOptions);
    }

    @When("User selects the FIBER as Infrustructure on Customer360 search page")
    public void user_selects_the_fiber_as_infrustructure_on_customer360_search_page() {
        clickField(fiberActivationForPrepaidPage.optionFiber);
    }

    @When("User selects Basic Enterprise Modem on Customer360 search page")
    public void user_selects_basic_enterprise_modem_on_customer360_search_page() {
        clickField(fiberActivationForPrepaidPage.basicEnterpriseModemAddButton);
    }

    @When("User selects ALL0 6Month  cash method from Akses Fee per Modem Basic on Customer360 search page")
    public void user_selects_all0_6month_cash_method_from_akses_fee_per_modem_basic_on_customer360_search_page() {
        clickField(fiberActivationForPrepaidPage.aLL06MonthCashOption);
    }

    @And("User enters PPPoEUser and ONTSerialNumber  into the PPPoEUser and ONTSerialNumber field on Customer{int} search page")
    public void userEntersPPPoEUserAndONTSerialNumberIntoThePPPoEUserAndONTSerialNumberFieldOnCustomerSearchPage(int arg0) {
        fiberActivationForPrepaidPage.numbersCreationForSerialNumbers();
    }

    @When("User clicks the save button after checkout action on Customer360 search page")
    public void user_clicks_the_save_button_after_checkout_action_on_customer360_search_page() {
        clickField(fiberActivationForPrepaidPage.saveButtonAfterCheckout);
        Utils.waitFor(3);
    }

    @When("User clicks the activation form on top of the opened screen on Customer360 search page")
    public void user_clicks_the_activation_form_on_top_of_the_opened_screen_on_customer360_search_page() throws AWTException {
       fiberActivationForPrepaidPage.activationFormClicking();
    }
    @Then("User sees the name of {string} which was selected product on Fiber is in the Shopping Cart on Customer{int} search page")
    public void userSeesTheNameOfWhichWasSelectedProductOnFiberIsInTheShoppingCartOnCustomerSearchPage(String warningMessage, int arg1) {
    warningMessage(warningMessage,fiberActivationForPrepaidPage.selectedProductInShoppingCart);
    }


    @Then("User should see the Order Status OF Fiber Activation turned to completed  on Customer{int} search page")
    public void userShouldSeeTheOrderStatusOFFiberActivationTurnedToCompletedOnCustomerSearchPage(int arg0) {
        fiberActivationForPrepaidPage.verifyTheOrderStatusIsCompleted();
    }


    @And("User compares the AgreementId on Order with AgreementId on Fiscalization Receipts on Customer{int} search page")
    public void userComparesTheAgreementIdOnOrderWithAgreementIdOnFiscalizationReceiptsOnCustomerSearchPage(int arg0) {
        fiberActivationForPrepaidPage.verificationOfFiscalisationWithOrder();
    }

    @And("User click the detail button")
    public void userClickTheDetailButton() {
        clickField(fiberActivationForPrepaidPage.detailFirstButtonOnFiscalization);
    }

    @When("User clicks the New Order for prepaid rating for the customer type on Customer{int} search page")
    public void userClicksTheNewOrderForPrepaidRatingForTheCustomerTypeOnCustomerSearchPage(int arg0) {
        clickField(fiberActivationForPrepaidPage.newOrderBtnOnPrepaid);
    }
}
