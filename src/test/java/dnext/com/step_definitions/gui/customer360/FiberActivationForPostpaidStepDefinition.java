package dnext.com.step_definitions.gui.customer360;

import com.utilities.Utils;
import dnext.com.pages.BasePage;
import dnext.com.pages.customer360.FiberActivationForPostpaidPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@AllArgsConstructor
public class FiberActivationForPostpaidStepDefinition extends BasePage {
    FiberActivationForPostpaidPage fiberActivationForPostpaidPage;

    @When("User clicks the New Order for postpaid rating for the customer type on Customer360 search page")
    public void user_clicks_the_new_order_for_postpaid_rating_for_the_customer_type_on_customer360_search_page() {
        clickField(fiberActivationForPostpaidPage.newOrderBtnOnPostpaidOnFiber);
    }
    @Then("User clicks the Recurring Products on Customer360 search page")
    public void user_clicks_the_recurring_products_on_customer360_search_page() {
        Utils.waitFor(1);
        clickField(fiberActivationForPostpaidPage.RecurringProductsOnFiber);
    }
    @When("User selects Contract Duration as  {int} X ALL2000  for Vodafone Gigafibra {int} Mbpson Customer360 search page")
    public void user_selects_contract_duration_as_x_all2000_for_vodafone_gigafibra_mbpson_customer360_search_page(Integer int1, Integer int2) {
        clickField(fiberActivationForPostpaidPage.contractDurationOf12XALL2000ForVodafoneGigaFibra200Mbps);
    }
    @When("User selects {int} X ALL0  Contract Duration for Basic Enterprise Modem on Customer360 search page")
    public void user_selects_x_all0_contract_duration_for_basic_enterprise_modem_on_customer360_search_page(Integer int1) {
        clickField(fiberActivationForPostpaidPage.contractDurationOf12XALLForBasicEnterpriseModem);
    }
    @Then("User sees the name of {string} which was selected product on Fiber for postpaid in the Shopping Cart on Customer360 search page")
    public void user_sees_the_name_of_which_was_selected_product_on_fiber_for_postpaid_in_the_shopping_cart_on_customer360_search_page(String text) {
    warningMessage(text,fiberActivationForPostpaidPage.selectedProductInShoppingCart);
    }


    @When("User selects Internet option from products for Postpaid on Customer{int} search page")
    public void userSelectsInternetOptionFromProductsForPostpaidOnCustomerSearchPage(int arg0) {
        clickField(fiberActivationForPostpaidPage.internetOptionOnFiberForPostpaid);
    }

    @When("User selects the Vodafone Gigafibra {int} Mbps for Postpaid on Customer{int} search page")
    public void userSelectsTheVodafoneGigafibraMbpsForPostpaidOnCustomerSearchPage(int arg0, int arg1) {
    Utils.clickWithJS(fiberActivationForPostpaidPage.vodafoneGigaFibra200MbpsOptionForPostpaid);

    }
}
