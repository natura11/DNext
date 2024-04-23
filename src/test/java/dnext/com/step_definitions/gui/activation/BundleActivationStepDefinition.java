package dnext.com.step_definitions.gui.activation;

import com.utilities.Driver;
import com.utilities.Utils;
import dnext.com.pages.BasePage;
import dnext.com.pages.activationPages.BundleActivationPage;
import dnext.com.pages.activationPages.VerifyCoaxialActivationForPostpaidPage;
import dnext.com.pages.backofficePage.BackOfficeIpInventoryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.interactions.Actions;


@Log4j2
@AllArgsConstructor
public class BundleActivationStepDefinition extends BasePage {
    BundleActivationPage bundleActivationPage;
    VerifyCoaxialActivationForPostpaidPage verifyCoaxialActivationForPostpaidPage;
    BackOfficeIpInventoryPage backOfficeIpInventoryPage;
    @When("User clicks the Bundle option from the dropdown on Customer360 search page")
    public void user_clicks_the_bundle_option_from_the_dropdown_on_customer360_search_page() {
        Utils.waitForVisibility(bundleActivationPage.bundleOptionFromDropdown,10);
        clickField(bundleActivationPage.bundleOptionFromDropdown);
    }

    @When("User selects the first option of products from opened products page on Customer360 search page")
    public void user_selects_the_first_option_of_products_from_opened_products_page_on_customer360_search_page() {
        Utils.waitForVisibility(bundleActivationPage.productsFirstOptionForVbu,25);
        clickField(bundleActivationPage.productsFirstOptionForVbu);
    }

    @When("User selects first option as cash method for the selected product on Customer360 search page")
    public void user_selects_first_option_as_cash_method_for_the_selected_product_on_customer360_search_page() {
        clickField(bundleActivationPage.cashOptionOfSelectedProductsForFirstOptionForVbu);
    }

    @When("User selects first option as cash method for the selected product for bundle on Customer360 search page")
    public void user_selects_first_option_as_cash_method_for_the_selected_product_for_bundle_on_customer360_search_page() {
        //clickField(bundleActivationPage.cashOptionOfSelectedProductsForBundleForVbu);
        Utils.clickWithJS(bundleActivationPage.cashOptionOfSelectedProductsForBundleForVbu);
    }

    @When("user clicks the Infrusructure dropdown button  Customer360 search page")
    public void user_clicks_the_infrusructure_dropdown_button_customer360_search_page() {
        clickField(bundleActivationPage.infrastructureDropdown);
    }

    @When("User selects the Coaxial  as Infrustructure on Customer360 search page")
    public void user_selects_the_coaxial_as_infrustructure_on_customer360_search_page() {
        clickField(bundleActivationPage.coaxialOptionFromDropdownForVbu);
    }

    @When("User clicks the Basic Enterprise Modem add button on Customer360 search page")
    public void user_clicks_the_basic_enterprise_modem_add_button_on_customer360_search_page() {
        clickField(bundleActivationPage.basicEnterpriseModemAddSignForVbu);
        Utils.waitFor(3);
    }

    @When("User selects the first option as cash method for the Basic Enterprise Modem on Customer360 search page")
    public void user_selects_the_first_option_as_cash_method_for_the_basic_enterprise_modem_on_customer360_search_page() {
        clickField(bundleActivationPage.cashOptionBasicEnterpriseModem);
    }

    @When("User selects the first option as cash method for the Public IP for Bundle  on Customer360 search page")
    public void user_selects_the_first_option_as_cash_method_for_the_public_ip_for_bundle_on_customer360_search_page() {
        Utils.clickWithJS(bundleActivationPage.cashOptionoFPublicIPforBundleForVbu);
    }

    @And("User enters the created IP Address at BackOffice into the IP Address field")
    public void userEntersTheCreatedIPAdreesAtBackOfficIntoTheIPAdressField() {
        bundleActivationPage.usingCreatedIpAddressAtBackOffice();
    }

    @And("User slides the New Devices Button")
    public void userSlidesTheNewDevicesButton() {
        slidingButton(bundleActivationPage.slideButtonForBundle);
    }
}
