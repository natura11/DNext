package dnext.com.step_definitions.gui.activation;

import com.utilities.Utils;
import dnext.com.pages.BasePage;
import dnext.com.pages.activationPages.CryptoguardActivationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@AllArgsConstructor
public class CryptoguardActivationStepDefinition extends BasePage {
    CryptoguardActivationPage cryptoguardActivationPage;

    @When("User selects the Cryptoguard  as TVInfrustructure on Customer360 search page")
    public void user_selects_the_cryptoguard_as_tv_infrustructure_on_customer360_search_page() {
        clickField(cryptoguardActivationPage.optionCryptoguard);
    }

    @When("User selects the ALL0 3Month option for Smart Card Contract Duration on Customer360 search page")
    public void user_selects_the_all0_3month_option_for_smart_card_contract_duration_on_customer360_search_page() {
        clickField(cryptoguardActivationPage.all03MonthsOptionForSmartCardCashOption);
    }


    @When("User selects the ALL0 3Month option of Akses Fee per Dekoder Premium as cash option on Customer360 search page")
    public void user_selects_the_all0_3month_option_of_akses_fee_per_dekoder_premium_as_cash_option_on_customer360_search_page() {
        clickField(CryptoguardActivationPage.all03MonnthsForAkesFeePerDokoderBasicOnCryptoguard);
    }

    @When("User selects Tarife Instalimi from Purchasable Addons for Cryptoguard part on Customer360 search page")
    public void user_selects_tarife_instalimi_from_purchasable_addons_for_cryptoguard_part_on_customer360_search_page() {
        clickField(cryptoguardActivationPage.addIconForTarifeInstalimiOnCryptoguard);
    }

    @Then("User sees the name of {string} which was selected product on Cryptoguard is in the Shopping Cart on Customer360 search page")
    public void user_sees_the_name_of_which_was_selected_product_on_cryptoguard_is_in_the_shopping_cart_on_customer360_search_page(String text) {
        Utils.waitFor(2);
        warningMessage(text, cryptoguardActivationPage.selectedProductInShoppingCart);
    }

    @And("User selects Akses Fee per Dekoder Basic add button on Customer{int} search page")
    public void userSelectsAksesFeePerDekoderBasicAddButtonOnCustomerSearchPage(int arg0) {
        clickField(cryptoguardActivationPage.aksesFeePerDekoderBasicAddSign);
    }

    @And("User clicks the Smart Card add button for cryptoguard on Customer{int} search page")
    public void userClicksTheSmartCardAddButtonForCryptoguardOnCustomerSearchPage(int arg0) {
        clickField(cryptoguardActivationPage.smartCardAddSignofCryptoguard);
    }

    @Then("User should see the Order Status turned to completed for the Cryptoguard  on Customer{int} search page")
    public void userShouldSeeTheOrderStatusTurnedToCompletedForTheCryptoguardOnCustomerSearchPage(int arg0) {
        cryptoguardActivationPage.verifyTheOrderStatusIsCompleted();
    }

    @When("User enters random Cryptoguard number to Smart Card field on Product Offering Page")
    public void userEntersRandomCryptoguardNumberToSmartCardFieldOnProductOfferingPage() {
        cryptoguardActivationPage.cryptoguardNumbersCreationForSerialNumbers();
    }

    @And("User checks the Cryptoguard Number is available for Sale on Product Offering Page")
    public void userChecksTheCryptoguardNumberIsAvailableForSaleOnProductOfferingPage() {
        cryptoguardActivationPage.checkCryptoguardNumberIsAvailableOrNot();
    }
}
