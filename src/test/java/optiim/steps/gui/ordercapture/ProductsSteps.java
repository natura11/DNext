package optiim.steps.gui.ordercapture;

import optiim.framework.UrlBuilder;
import optiim.framework.helpers.WebDriverHelper;
import optiim.pages.ordercapture.ProductsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class ProductsSteps {

    private final WebDriverHelper webDriverHelper;
    private final UrlBuilder urlBuilder;
    private final ProductsPage productsPage;

    @Then("I should be seeing that New Order page is opened")
    public void I_should_be_seeing_that_New_Order_page_is_opened() throws Throwable {
        productsPage
                .controlNewOrderPage();
    }

    @When("I select a product and click")
    public void ıSelectAProductAndClick() throws Throwable {
        productsPage
                .clickFirstProduct();
    }

    @When("I select Iphone7 Internet product and click")
    public void ıSelectIphoneSevenInternetProductAndClick() throws Throwable {
        productsPage
                .clickIphoneSeven();
    }

    @Then("I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address")
    public void ıShouldBeSeeingThatTheSystemRetrievesTheListOfProductsRelatedToTheCustomerSServiceAddress() throws Throwable {
        productsPage
                .controlProductList();
    }


    @When("I select FAMILYTV product and click")
    public void ıSelectFAMILYTVProductAndClick() throws Throwable {
        productsPage
                .clickFamilyTV();
    }

    @Then("I should be seeing the products are filtered with CATALOGUEs and CATEGORIEs")
    public void ıShouldBeSeeingTheProductsAreFilteredWithCATALOGUEsAndCATEGORIEs() throws Throwable {
        productsPage
                .controlCatalogSearchFilter();
    }


    @When("I click the Edit button to update customer Service Address")
    public void ıClickTheEditButtonToUpdateCustomerServiceAddress() throws Throwable {
        productsPage
                .clickEditServiceAddressButton();
    }

    @When("I enter a value {string} in the Search Product field")
    public void ıEnterAValueInTheSearchProductField(String productName) throws Throwable {
        productsPage
                .enterSearchProduct(productName);

    }

    @Then("I should be seeing that {string} in the Search Product list")
    public void ıShouldBeSeeingThatInTheSearchProductList(String productName) throws Throwable {
        productsPage
                .controlSearchProductName(productName);
    }

    @When("I select a value {string} category")
    public void ıSelectTheProductWithTheCategory(String categoryName) throws Throwable {
        productsPage
                .selectCategory(categoryName);
    }

    @When("I click Chevron Right Button")
    public void ıClickChevronRightButton() throws Throwable {
        productsPage
                .clickChevronRight();
    }

    @When("I select {string} product and click")
    public void ıSelectProductAndClick(String productName) throws Throwable {
        productsPage
                .clickProduct(productName);
    }

    @And("I click Close button for Product Page")
    public void ıClickSearchCloseButton() throws Throwable {
        productsPage
                .clickCloseButton();
    }

    @Then("I should be seeing the popup alert message {string} for Products Page")
    public void ıShouldBeSeeingThePopupAlertMessageForProductsPage(String popupMessage) throws Throwable {
        productsPage
                .controlPopupMessage(popupMessage);
    }

    @Then("I should be seeing that the Edit Service Address of the Customer page can be opened")
    public void ıShouldBeSeeingThatTheEditServiceAddressOfTheCustomerPageCanBeOpened() {
        productsPage
                .controlEditServiceAddressPage();
    }

    @And("I should be seeing that {string}, {string}, {string}, {string} fields are displayed")
    public void ıShouldBeSeeingThatFieldsAreDisplayed(String addressLineOne, String addressLineTwo, String country, String city) {
        productsPage
                .controlEditServiceAddressPageField(addressLineOne, addressLineTwo, country, city);
    }

    @Then("I should be seeing that the {string} product of category is true selected")
    public void ıShouldBeSeeingThatTheProductOfCategoryAreTrueSelected(String categoryName) {
        productsPage
                .controlCategoryTrueSelected(categoryName);
    }

    @Then("I should be seeing that the {string} product of category is mix selected")
    public void ıShouldBeSeeingThatTheProductOfCategoryAreMixSelected(String categoryName) {
        productsPage
                .controlCategoryMixSelected(categoryName);
    }

    @And("I should be seeing that the {string} product of category is not selected")
    public void ıShouldBeSeeingThatTheProductOfCategoryIsNotSelected(String categoryName) {
        productsPage
                .controlCategoryNotSelected(categoryName);
    }

    @Then("I should be seeing that CartItem RelationshipType value is generated on the BE side and it is kept as {string}")
    public void ıShouldBeSeeingThatCartItemRelationshipTypeValueIsGeneratedOnTheBESideAndItIsKeptAs(String relationshipType) {
        productsPage
                .controlRelationshipType(relationshipType);
    }

    @And("I click Shopping Cart Button")
    public void ıClickShoppingCartButton() throws Throwable {
        productsPage
                .clickShoppingCartButton();
    }

    @Then("I should be seeing that Note value is generated in the Billing Account on the BE side")
    public void ıShouldBeSeeingThatNoteValueIsGeneratedInTheBillingAccountOnTheBESide() {
        productsPage
                .controlBillingAccount();
    }

    @When("I click the update button")
    public void ıClickTheUpdateButton() throws Throwable {
        productsPage
                .clickUpdateButton();
    }

    @Then("I should be seeing that the product price is displayed")
    public void ıShouldBeSeeingThatTheProductPriceIsDisplayed() {
        productsPage
                .controlProductPrice();
    }

    @When("I click {string} Category button")
    public void ıClickCategoryButton(String categoryName) throws Throwable {
        productsPage
                .clickCategory(categoryName);
    }

    @When("I click the Customer360 link button")
    public void ıClickTheCustomerLinkButton() throws Throwable {
        productsPage
                .clickCustomer360Button();
    }

    @When("I select a value {string} category for Bundle Product")
    public void ıSelectAValueCategoryForBundleProduct(String productName) throws Throwable {
        productsPage
                .selecProduct(productName);
    }

    @And("I click Search Product button for Product Page")
    public void ıClickSearchProductButtonForProductPage() throws Throwable {
        productsPage
                .clickProductSearchButton();
    }

    @When("I have log out into the system for Product Page")
    public void ıHaveLogOutIntoTheSystemForProductPage() throws Throwable {
        productsPage
                .clickLogoutButton();
    }
}