package dnext.com.step_definitions.gui;

import com.utilities.Utils;
import dnext.com.pages.BasePage;
import dnext.com.pages.CustomerCommonPage;
import dnext.com.pages.DSalesCommonPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CommonDSalesStepDefinitions extends BasePage {

    CustomerCommonPage customerCommonPage;
    DSalesCommonPage dSalesCommonPage;

    @Then("User is redirected to the  product catalog on DSales page")
    public void userIsRedirectedToTheProductCatalogOnDSalesPage() {
        dSalesCommonPage.waitForProductPage();
    }

    @And("User clicks the {string} on on DSales Products page")
    public void userClicksTheOnOnDSalesProductsPage(String productType) {
        dSalesCommonPage.filterByOnceOffRecurring(productType);
    }

    @When("User selects {string} category option on DSales Products page")
    public void userSelectsCategoryOptionOnDSalesProductsPage(String filterOption) {
        dSalesCommonPage.filterByCategory(filterOption);
    }

    @And("User clicks the search button under product list on DSales Product page")
    public void userClicksTheSearchButtonUnderProductListOnCustomerSearchPage() {
        Utils.waitFor(2);
        clickField(dSalesCommonPage.searchBtnForCategoryOption);
    }

    @When("User selects random product on the filtered Product List")
    public void userSelectsRandomProductOnTheFilteredProductList() {
        dSalesCommonPage.selectARandomProduct();
    }

    @When("User selects the {string} product on DSales Product page")
    public void userSelectsTheProductOnDSalesProductPage(String productName) {
        dSalesCommonPage.selectSpecificProduct(productName);
    }

    @Then("User should see the Product Detail page is opened")
    public void userShouldSeeTheProductDetailPageIsOpened() {
        elementDisplayed(dSalesCommonPage.productNameOnProductDetail);
    }

    @When("User selects random Cash price on Product Detail page")
    public void userSelectsRandomCashPriceOnProductDetailPage() {
        dSalesCommonPage.selectARandomChipPrice();
    }

    @And("User clicks the TV Infrusructure dropdown on Product Detail page")
    public void userClicksTheTVInfrusructureDropdownOnProductDetailPage() {
        clickField(dSalesCommonPage.tvInfrastructureDropdown);
    }

    @And("User clicks the Internet Infrusructure dropdown on Product Detail page")
    public void userClicksTheInternetInfrusructureDropdownOnProductDetailPage() {
        clickField(dSalesCommonPage.internetInfrastructureDropdown);
    }

    @And("User selects the {string} as infrastructure on Product Detail page")
    public void userSelectsTheAsInfrastructureOnProductDetailPage(String infraName) {
        dSalesCommonPage.selectSpecificInfrastructure(infraName);
    }

    @And("User selects {string} as resource and its price on Product Detail page")
    public void userSelectsAsResourceOnProductDetailPage(String resourceName) {
        dSalesCommonPage.selectSpecificResourceAndPrice(resourceName);
    }

    @And("User adds {string} from Purchasable Addons and its price on Product Detail page")
    public void userAddsFromPurchasableAddonsAndItsPriceOnProductDetailPage(String addonName) {
        dSalesCommonPage.selectSpecificAddOnAndPrice(addonName);
    }

    @And("User clicks the Add to Cart button on Product Detail page")
    public void userClicksTheADDToCartButtonOnCustomerSearchPage() {
        clickField(dSalesCommonPage.addToCartBtn);
    }

    @Then("User should see the  Number is available with success message for Sale on Product Offering Page")
    public void userShouldSeeTheNumberIsAvailableForSaleOnProductOfferingPage() {
        dSalesCommonPage.verifyShoppingCartIsCreated();
    }

    @When("User clicks the Shopping Cart icon on DSales Product page")
    public void userClicksTheShoppingCartIconOnCustomerSearchPage() {
        Utils.waitFor(2);
        clickField(dSalesCommonPage.shoppingCartIcon);
    }

    @Then("User should see the Shopping Cart Products number is correct on Shopping Cart Page")
    public void userShouldSeeTheShoppingCartProductsNumberIsCorrectOnShoppingCartPage() {
        dSalesCommonPage.verifyShoppingCartIsCreatedWithCorrectNumber();
    }

    @Then("User should see the {string} product is added on Shopping Cart Page")
    public void userShouldSeeTheProductIsAddedOnShoppingCartPage(String productName) {
        dSalesCommonPage.verifyProductIsAddedOnShoppingCart(productName);
    }

    @When("User clicks the CHECKOUT button on Shopping Cart Page")
    public void userClicksTheCHECKOUTButtonOnCustomerSearchPage() {
        clickField(dSalesCommonPage.checkoutButton);
    }

    @When("User clicks the save button after checkout action on Shopping Cart Page")
    public void clicksSaveButtonOnContactPopupPage() {
        elementDisplayed(dSalesCommonPage.saveButtonAfterCheckout);
        clickField(dSalesCommonPage.saveButtonAfterCheckout);
        Utils.waitFor(3);
    }
    @And("User clicks the Collected radio button on Shopping Cart Page")
    public void userClicksTheCollectedRadioButtonOnCustomerSearchPage() {
        Utils.waitFor(5);
        elementDisplayed(dSalesCommonPage.collectedTickBeforeCompleteCheckout);
        Utils.isElementSelected(dSalesCommonPage.collectedTickBeforeCompleteCheckout);
        Utils.clickWithJS(dSalesCommonPage.collectedTickBeforeCompleteCheckout);

    }

    @When("User clicks the activation form on top of the opened screen on Before Checkout Popup")
    public void user_clicks_the_activation_form_on_top_of_the_opened_screen_on_customer360_search_page(){
        Utils.waitForClickablility(dSalesCommonPage.activationFormButtonAfterCheckout);
        Utils.waitForVisibility(dSalesCommonPage.activationFormButtonAfterCheckout,30);
        clickField(dSalesCommonPage.activationFormButtonAfterCheckout);
    }

    @And("User clicks the Complete Checkout button on Before Checkout Page")
    public void userClicksTheCOMPLATECHECKOUTButtonOnCustomerSearchPage() {
        Utils.waitForClickablility(dSalesCommonPage.completeCheckoutButton);
        clickField(dSalesCommonPage.completeCheckoutButton);
    }

    @Then("User sees one pop up warning as {string} on Customer360 search page")
    public void userSeesOnePopUpWarningAsOnCustomerSearchPage(String message) {
        dSalesCommonPage.verifyTheSuccessfulCheckoutMessage(message);
    }

    @And("User clicks the create receipt button")
    public void userClicksTheCreateReceiptButton() {
        Utils.waitFor(1);
        dSalesCommonPage.receipCreationForABCOM();
    }

    @When("User clicks the Go Back to Customer360 button on Customer360 search page")
    public void userClicksTheGoBackToCustomerButtonOnCustomerSearchPage() {
        clickField(dSalesCommonPage.goBackToCustomer360Btn);
    }


    @Then("User should see the Activation Form open in a new window on Before Checkout Popup")
    public void userShouldSeeTheActivationFormOpenInANewWindowOnBeforeCheckoutPopup() {
        dSalesCommonPage.verifyActivationFormInNewTab();
    }

    @When("User go back to Shopping Cart Page on Before Checkout Popup")
    public void userGoBackToShoppingCartPageOnBeforeCheckoutPopup() {
        dSalesCommonPage.switchToDSalesPage();
    }
}
