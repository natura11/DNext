package dnext.com.step_definitions.gui.activation;

import com.utilities.Driver;
import com.utilities.Utils;
import dnext.com.pages.BasePage;
import dnext.com.pages.activationPages.BundleActivationPage;
import dnext.com.pages.activationPages.CoaxialActivationPage;
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

    @When("User selects first option as cash method for the selected product for bundle on Product Detail page")
    public void user_selects_first_option_as_cash_method_for_the_selected_product_for_bundle_on_customer360_search_page() {
        //clickField(bundleActivationPage.cashOptionOfSelectedProductsForBundleForVbu);
        Utils.clickWithJS(bundleActivationPage.cashOptionOfSelectedProductsForBundleForVbu);
    }

    @When("User selects the first option as cash method for the Public IP for Bundle  on Product Detail page")
    public void user_selects_the_first_option_as_cash_method_for_the_public_ip_for_bundle_on_customer360_search_page() {
        Utils.clickWithJS(bundleActivationPage.cashOptionoFPublicIPforBundleForVbu);
    }

    @And("User enters the created IP Address at BackOffice into the IP Address field")
    public void userEntersTheCreatedIPAdreesAtBackOfficIntoTheIPAdressField() {
        bundleActivationPage.usingCreatedIpAddressAtBackOffice();
    }

    @And("User selects {string} as resource and its price for bundle on Product Detail page")
    public void userSelectsAsResourceAndItsPriceForBundleOnProductDetailPage(String resourceName) {
        bundleActivationPage.selectSpecificResourceAndPrice(resourceName);
    }
}
