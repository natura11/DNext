package dnext.com.step_definitions.gui.activation;

import com.utilities.Utils;
import dnext.com.pages.BasePage;
import dnext.com.pages.activationPages.VerifyCoaxialActivationForPostpaidPage;
import dnext.com.pages.activationPages.VerifyCoaxialActivationForPrepaidPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@AllArgsConstructor
public class VerifyCoaxialActivationForPrepaidStepDefinition extends BasePage {
    VerifyCoaxialActivationForPrepaidPage verifyCoaxialActivationForPrepaidPage;
    VerifyCoaxialActivationForPostpaidPage verifyCoaxialActivationForPostpaidPage;

    @When("User selects the first option from products  on Customer360 search page")
    public void user_selects_the_first_option_from_products_on_customer360_search_page() {
        Utils.clickWithJS(verifyCoaxialActivationForPrepaidPage.firstOptionFromProducts);
//        clickField(verifyCoaxialActivationForPrepaidPage.firstOptionFromProducts);
    }

    @Then("User selects first option as cash method on Customer360 search page")
    public void user_selects_first_option_as_cash_method_on_customer360_search_page() {
        clickField(verifyCoaxialActivationForPrepaidPage.firstOptionfromTheSelectedProductForCash);
    }

    @When("User enters random Coaxial Mac number for prepaid to Smart Card field on Product Offering Page")
    public void user_enters_random_coaxial_mac_number_for_prepaid_to_smart_card_field_on_product_offering_page() {
        verifyCoaxialActivationForPostpaidPage.numbersCreationForMacAdreess();
    }

    @When("User checks the  Coaxial Mac Number for prepaid is available for Sale on Product Offering Page")
    public void user_checks_the_coaxial_mac_number_for_prepaid_is_available_for_sale_on_product_offering_page() {
        verifyCoaxialActivationForPostpaidPage.checkCoaxialMacNumberIsAvailableOrNot();
    }


    @When("User selects Internet option from products for caoxial prepaid on Customer{int} search page")
    public void userSelectsInternetOptionFromProductsForCaoxialPrepaidOnCustomerSearchPage(int arg0) {
        clickField(verifyCoaxialActivationForPrepaidPage.internetCheckBoxButtonForCoaxPrepaid);
    }


    @Then("User is directed to the Vodafone {string} page for details of equipments on Customer{int} search page")
    public void userIsDirectedToTheVodafonePageForDetailsOfEquipmentsOnCustomerSearchPage(String text, int arg1) {
        Utils.waitForVisibility(verifyCoaxialActivationForPrepaidPage.GigaFibraPro50_20MbpsText,15);
        warningMessage(text, verifyCoaxialActivationForPrepaidPage.GigaFibraPro50_20MbpsText);
    }

    @And("User selects first option from Basic Enterprise Modem for cash on Customer{int} search page")
    public void userSelectsFirstOptionFromBasicEnterpriseModemForCashOnCustomerSearchPage(int arg0) {
        clickField(verifyCoaxialActivationForPrepaidPage.firstOptionFromBasicEnterpriseModemForCash);
    }
}
