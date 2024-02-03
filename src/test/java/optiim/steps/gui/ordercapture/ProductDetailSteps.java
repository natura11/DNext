package optiim.steps.gui.ordercapture;

import optiim.framework.UrlBuilder;
import optiim.framework.helpers.WebDriverHelper;
import optiim.pages.ordercapture.ProductDetailPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

//import javax.rmi.PortableRemoteObject;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class ProductDetailSteps {

    private final WebDriverHelper webDriverHelper;
    private final UrlBuilder urlBuilder;
    private final ProductDetailPage productDetailPage;

    @Then("I should be seeing that the Product Configuration UI is opened")
    public void I_should_be_seeing_that_the_Product_Configuration_UI_is_opened() {
        productDetailPage
                .controlProductDetailPageTitle();
    }

    @When("I click Products button")
    public void ıClickProductsButton() throws Throwable {
        productDetailPage
                .clickProductsButton();
    }


    @And("I should be seeing that {string}, {string} are displayed")
    public void ıShouldBeSeeingThatAreDisplayed(String colour, String storage) {
        productDetailPage
                .controlIphoneField(colour, storage);
    }

    @When("I select a value {string} in the Case Size field")
    public void ıSelectAValueInTheCaseSizeField(String caseSizeType) throws Throwable {
        productDetailPage
                .selectCaseSizeType(caseSizeType);
    }

    @And("I select a value {string} in the Connectivity field")
    public void ıSelectAValueInTheConnectivityField(String connectivityType) throws Throwable {
        productDetailPage
                .selectConnectivityType(connectivityType);
    }

    @And("I select a value {string} in the Band Size field")
    public void ıSelectAValueInTheBandSizeField(String bandSizeType) throws Throwable {
        productDetailPage
                .selectBandSizeType(bandSizeType);
    }


    @Then("I should be seeing that {string}, {string}")
    public void ıShouldBeSeeingThat(String predefinedTitleOne, String predefinedTitleTwo) throws Throwable {
        productDetailPage
                .controlPredefinedField(predefinedTitleOne, predefinedTitleTwo);
    }

    @And("I should be seeing that {string}, {string} for Product Term")
    public void ıShouldBeSeeingThatForProductTerm(String productTermOne, String productTermTwo) throws Throwable {
        productDetailPage
                .controlProductTermField(productTermOne, productTermTwo);
    }

    @When("I leave the {string} in Serial Number fields for the selected product are empty")
    public void ıLeaveTheInSerialNumberFieldsForTheSelectedProductAreEmpty(String serialNumber) throws Throwable {
        productDetailPage
                .enterSerialNumber(serialNumber);
    }

    @Then("I should be seeing that the {string} in Configuration Parameters fields for the selected product is required")
    public void ıShouldBeSeeingThatTheInConfigurationParametersFieldsForTheSelectedProductIsRequired(String fieldName) {
        productDetailPage
                .controlErrorMessage(fieldName);
    }

    @When("I select a value {string} in TVInfrastructure field")
    public void ıLeaveTheInTVInfrastructureFieldsForTheSelectedProductAreEmpty(String tvInfrastructureType) throws Throwable {
        productDetailPage
                .selectTVInfrastructureType(tvInfrastructureType);
    }

    @When("I select Cash in the Product Term")
    public void ıSelectCashInTheProductTerm() throws Throwable {
        productDetailPage
                .clickCash();
    }

    @Then("I should be seeing that Payment Plan section will be filtered according to the selected offering term")
    public void ıShouldBeSeeingThatPaymentPlanSectionWillBeFilteredAccordingToTheSelectedOfferingTerm() {
        productDetailPage
                .controlPaymentPlan();
    }


    @And("I should be seeing that {string} for Product Detail page")
    public void ıShouldBeSeeingThat(String fieldName) {
        productDetailPage
                .controlFieldName(fieldName);
    }

    @And("I enter a value {string} in the Serial Number field")
    public void ıEnterAValueInTheSerialNumberField(String serialNumber) throws Throwable {
        productDetailPage
                .enterSerialNumber(serialNumber);
    }

    @And("I enter a value {string} in the SipPassword field")
    public void ıEnterAValueInTheSipPasswordField(String sipPassword) throws Throwable {
        productDetailPage
                .enterSipPassword(sipPassword);
    }

    @And("I enter a value {string} in the Phone Number field")
    public void ıEnterAValueInThePhoneNumberField(String phoneNumber) throws Throwable {
        productDetailPage
                .enterPhoneNumber(phoneNumber);
    }

    @Then("I should be seeing that a value is selected and Add to Card button becomes visible")
    public void ıShouldBeSeeingThatAValueIsSelectedAndButtonBecomesVisible() throws Throwable {
        productDetailPage
                .controlAddToCartButton();
    }

    @When("I click the Add to Cart button")
    public void ıClickTheAddToCartButton() throws Throwable {
        productDetailPage
                .clickAddToCartButton();
    }

    @Then("I should be seeing that a value is selected and Add to Card button becomes not visible")
    public void ıShouldBeSeeingThatAValueIsSelectedAndAddToCardButtonBecomesNotVisible() {
        productDetailPage
                .controlAddToCartButtonDeactive();
    }

    @Then("I should be seeing that {string}, {string} and {string} fields are displayed")
    public void ıShouldBeSeeingThatAndFieldsAreDisplayed(String serialNumber, String sipPassword, String phoneNumber) {
        productDetailPage
                .controlConfigurableCharacteristicField(serialNumber, sipPassword, phoneNumber);
    }

    @And("I select a value {string} Product Term field")
    public void ıSelectAValueProductTermField(String productTermType) throws Throwable {
        productDetailPage
                .clickProductTerm(productTermType);
    }

    @Then("I should be seeing that {string} in the Payment Plan field")
    public void ıShouldBeSeeingThatInThePaymentPlanField(String expectedPaymentPlan) throws Throwable {
        productDetailPage
                .controlPaymentPlanTitle(expectedPaymentPlan);
    }

    @Then("I should be seeing that {string} Offer product is selected")
    public void ıShouldBeSeeingThatOfferProductIsSelected(String productName) throws Throwable {
        productDetailPage
                .controlSelectedProduct(productName);
    }

    @And("I enter a value {string} in the Phone Number Two field")
    public void ıEnterAValueInThePhoneNumberTwoField(String phoneNumberTwo) throws Throwable {
        productDetailPage
                .enterPhoneNumberTwo(phoneNumberTwo);
    }

    @And("I should be seeing that {string}, {string}, {string}, {string}, {string} fields are displayed")
    public void ıShouldBeSeeingThatFieldsAreDisplayed(String arg0, String arg1, String arg2, String arg3, String arg4) {
        productDetailPage
                .controlVodafoneTVPredefinedField(arg0, arg1, arg2, arg3, arg4);
    }

    @And("I enter a value {string} in the SipUser field")
    public void ıEnterAValueInTheSipUserField(String sipUser) throws Throwable {
        productDetailPage
                .enterSipUser(sipUser);
    }

    @And("I should be seeing Prices of Products calculated correctly on Shopping Card")
    public void ıShouldBeSeeingPricesOfProductsCalculatedCorrectlyOnShoppingCard() throws Throwable {
        productDetailPage
                .controlProductPrice();
    }

    @When("I select a value {string} in the Colour field")
    public void ıSelectAValueInTheColourField(String colour) throws Throwable {
        productDetailPage
                .selectColour(colour);
    }

    @And("I select a value {string} in the Storage field")
    public void ıSelectAValueInTheStorageField(String storage) throws Throwable {
        productDetailPage
                .selectStorage(storage);
    }

    @When("I select a value {string} in the InternetInfrastructure field")
    public void ıSelectAValueInTheInternetInfrastructureField(String internetInfrastructure) throws Throwable {
        productDetailPage
                .selectInternetInfrastructureType(internetInfrastructure);
    }

    @And("I enter a value {string} in the MacAddress field")
    public void ıEnterAValueInTheMacAddressField(String macAddress) throws Throwable {
        productDetailPage
                .enterMacAddress(macAddress);
    }

    @And("I enter a value {string} in the Static IP field")
    public void ıEnterAValueInTheStaticIPField(String staticIP) throws Throwable {
        productDetailPage
                .enterStaticIP(staticIP);
    }

    @Then("I should be seeing that {string} is displayed related with the main product")
    public void ıShouldBeSeeingThatIsDisplayedRelatedWithTheMainProduct(String addOnProduct) {
        productDetailPage
                .controlAddOnProduct(addOnProduct);
    }

    @When("I click  the {string} Add-on product")
    public void ıClickTheAddOnProduct(String addOnProduct) throws Throwable {
        productDetailPage
                .clickAddOnProduct(addOnProduct);
    }

    @And("I select a value {string} TVInfrastructure field")
    public void ıSelectAValueTVInfrastructureField(String tvInfrastructureType) throws Throwable {
        productDetailPage
                .selectAddOnTVInfrastructureType(tvInfrastructureType);
    }

    @When("I click the Add-on product and click edit button")
    public void ıClickTheAddOnProductAndClickEditButton() throws Throwable {
        productDetailPage
                .clickAddOnProductEditButton();
    }

    @And("I click Edit button for Product Detail Page")
    public void ıClickEditButtonForProductDetailPage() throws Throwable {
        productDetailPage
                .clickEditButton();
    }

    @When("I select a value {string} in the InternetInfrastructure field for Bundle Product")
    public void ıSelectAValueInTheInternetInfrastructureFieldForBundleProduct(String internetInfrastructure) throws Throwable {
        productDetailPage
                .selectBundleInternetInfrastructureType(internetInfrastructure);
    }

    @And("I enter a value {string} in the MacAddress field for Bundle Product")
    public void ıEnterAValueInTheMacAddressFieldForBundleProduct(String macAddress) throws Throwable {
        productDetailPage
                .enterBundleMacAddress(macAddress);
    }

    @And("I enter a value {string} in the Static IP field for Bundle Product")
    public void ıEnterAValueInTheStaticIPFieldForBundleProduct(String staticIP) throws Throwable {
        productDetailPage
                .enterBundleStaticIP(staticIP);
    }

    @And("I should be seeing that {string} updated value.")
    public void ıShouldBeSeeingThatUpdatedValue(String updatedValue) {
        productDetailPage
                .controlUpdatedValue(updatedValue);
    }

    @When("I select a value {string} in the Phone Number field")
    public void ıSelectAValueInThePhoneNumberField(String phoneNumber) throws Throwable {
        productDetailPage
                .selectPhoneNumber(phoneNumber);
    }

    @When("I select a value {string} Product Term field for Add-on product")
    public void ıSelectAValueProductTermFieldForAddOnProduct(String fieldName) throws Throwable {
        productDetailPage
                .selectCharacteristicField(fieldName);
    }

    @When("I select a value {string} Product Term field for Bundle product")
    public void ıSelectAValueProductTermFieldForBundleProduct(String fieldName) throws Throwable {
        productDetailPage
                .selectBundleCharacteristicField(fieldName);
    }


    @And("I switch to new window tab")
    public void ıSwitchToNewWindowTab() throws Throwable {
        productDetailPage
                .switchNewWindowTab();
    }

    @When("I click {string} button for Product Details Page")
    public void ıClickButtonForProductDetailsPage(String buttonName) throws Throwable {
        productDetailPage
                .clickButton(buttonName);
    }

    @Then("I should be seeing that {string} popup is opened")
    public void ıShouldBeSeeingThatPopUpIsOpened(String popupName) throws Throwable {
        productDetailPage
                .controlPopupTitle(popupName);
    }

    @Then("I should be seeing that {string} for Authorize Edit Dialog")
    public void ıShouldBeSeeingThatForAuthorizeEditDialog(String fieldName) {
        productDetailPage
                .controlAuhorizeEditDialogField(fieldName);
    }

    @When("I enter a value {string} Price field for Authorize Edit Dialog")
    public void ıEnterAValuePriceFieldForAuthorizeEditDialog(String price) throws Throwable {
        productDetailPage
                .enterPrice(price);
    }

    @When("I enter a value {string} Amount field for Authorize Edit Dialog")
    public void ıEnterAValueAmountFieldForAuthorizeEditDialog(String amount) throws Throwable {
        productDetailPage
                .enterAmount(amount);
    }

    @When("I enter a value {string} Description field for Authorize Edit Dialog")
    public void ıEnterAValueDescriptionFieldForAuthorizeEditDialog(String description) throws Throwable {
        productDetailPage
                .enterDescription(description);
    }

    @When("I enter a value {string} Address Line 1 field for Authorize Edit Dialog")
    public void ıEnterAValueAddressLineOneFieldForAuthorizeEditDialog(String addressLineOne) throws Throwable {
        productDetailPage
                .enterAddressLineOne(addressLineOne);
    }

    @When("I enter a value {string} Address Line 2 field for Authorize Edit Dialog")
    public void ıEnterAValueAddressLineTwoFieldForAuthorizeEditDialog(String addressLineTwo) throws Throwable {
        productDetailPage
                .enterAddressLineTwo(addressLineTwo);
    }

    @When("I select a value {string} City field for Authorize Edit Dialog")
    public void ıSelectAValueCityFieldForAuthorizeEditDialog(String city) throws Throwable {
        productDetailPage
                .selectCity(city);
    }

    @Then("I should see that the price field will be read-only since it doesn't have the price_overwrite role.")
    public void ıShouldSeeThatThePriceFieldWillBeReadOnlySinceItDoesnTHaveThePrice_overwriteRole() throws Throwable {
        productDetailPage
                .controlPriceField();
    }

    @And("I enter a value {string} in the PPPoEUser field")
    public void ıEnterAValueInThePPPoEUserField(String pppoeUser) throws Throwable {
        productDetailPage
                .enterPPPoEUser(pppoeUser);
    }

    @When("I select a value {string} Product Term field for Purchasable Resources")
    public void ıSelectAValueProductTermFieldForPurchasableResources(String purchasableResources) throws Throwable {
        productDetailPage
                .selectPurchasableResources(purchasableResources);
    }

    @When("I select a value {string} Product Term field for Purchasable  Addons")
    public void ıSelectAValueProductTermFieldForPurchasableAddons(String purchasableAddons ) throws Throwable {
        productDetailPage
                .selectPurchasableAddons(purchasableAddons);
    }

    @And("I click New Adress Button for Authorize Edit Page")
    public void ıClickNewAdressButtonForAuthorizeEditPage() throws Throwable {
        productDetailPage
                .clickNewAddressButtonForAuthorizeEdit();
    }

    @When("I click  the {string} Add-on product for Purchasable Resources")
    public void ıClickTheAddOnProductForPurchasableResources(String productName) throws Throwable {
        productDetailPage
                .clickAddOnProductForPurchasableResources(productName);
    }
}