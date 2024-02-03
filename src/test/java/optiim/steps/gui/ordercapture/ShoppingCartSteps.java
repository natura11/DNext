package optiim.steps.gui.ordercapture;

import optiim.framework.UrlBuilder;
import optiim.framework.helpers.WebDriverHelper;
import optiim.pages.ordercapture.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class ShoppingCartSteps {

    private final WebDriverHelper webDriverHelper;
    private final UrlBuilder urlBuilder;
    private final ShoppingCartPage shoppingCartPage;


    @Then("I should be seeing that Shopping Cart screen is opened and my selected product is displayed")
    public void I_should_be_seeing_that_Shopping_Cart_screen_is_opened_and_my_selected_VOIP_Offer_product_is_displayed() throws Throwable {
        shoppingCartPage
                .controlProduct();
    }

    @When("I click Products button for Shopping Cart Page")
    public void ıClickProductsButtonForShoppingCartPage() throws Throwable {
        shoppingCartPage
                .clickProductsButton();
    }

    @When("I select the product and delete for Shopping Cart Page")
    public void ıSelectTheProductAndDeleteForShoppingCartPage() throws Throwable {
        shoppingCartPage
                .clickDeleteButton();
    }

    @Then("I should be seeing that {string} in case the product was deleted")
    public void ıShouldBeSeeingThatTheDummyProductIsDeletedInCaseTheProductWasDeleted(String deleteMessage) throws Throwable {
        shoppingCartPage
                .controlDeleteProductMessage(deleteMessage);
    }

    @When("I click the Checkout button")
    public void ıClickTheCheckoutButton() throws Throwable {
        shoppingCartPage
                .clickCheckoutButton();
    }

    @Then("I should be seeing that {string} my selected additional product is displayed")
    public void ıShouldBeSeeingThatMySelectedAdditionalProductIsDisplayed(String productName) throws Throwable {
        shoppingCartPage
                .controlAdditionalProduct(productName);
    }

    @Then("I should be seeing that {string} message is displayed")
    public void ıShouldBeSeeingThatMessageIsDisplayed(String deleteMessage) throws InterruptedException {
        shoppingCartPage
                .controlDeleteMessage(deleteMessage);
    }

    @When("I click the Confirm button")
    public void ıClickTheConfirmButton() throws Throwable {
        shoppingCartPage
                .clickConfirmButton();
    }

    @Then("I should be seeing that the Shopping Cart Page")
    public void ıShouldBeSeeingThatTheShoppingCartPage() throws Throwable {
        shoppingCartPage
                .controlShoppingPage();
    }

    @And("I should be seeing that Future Date field is displayed")
    public void ıShouldBeSeeingThatFutureDateFieldIsDisplayed() {
        shoppingCartPage
                .controlFutureDate();
    }

    @When("I enter a value that is after than the current date value in the Future Date field")
    public void ıEnterAValueThatIsAfterThanTheCurrentDateValueInTheFutureDateField() throws Throwable {
        shoppingCartPage
                .enterFutureDate();
    }

    @When("I click the Proceed button")
    public void ıClickTheProceedButton() throws Throwable {
        shoppingCartPage
                .clickProceedButton();
    }

    @When("I click the Add Document button")
    public void ıClickTheAddDocumentButton() throws Throwable {
        shoppingCartPage
                .clickAddDocumentButton();
    }

    @And("I add file in the Document File field for Shopping Cart Page")
    public void ıAddFileInTheDocumentFileFieldForShoppingCartPage() throws Throwable {
        shoppingCartPage
                .enterAddFile();
    }

    @Then("I should be seeing that uploaded files")
    public void ıShouldBeSeeingThatUploadedFiles() throws Throwable {
        shoppingCartPage
                .controlUploadedFiles();
    }

    @When("I click the {string} Document Form")
    public void ıClickTheDocumentForm(String documentForm) throws Throwable {
        shoppingCartPage
                .clickDocumentForm(documentForm);
    }

    @Then("I should be seeing that print option")
    public void ıShouldBeSeeingThatPrintOption() throws Throwable {
        shoppingCartPage
                .controlPrintOption();
    }

    @And("I select a value {string} in the Payment Method field for Collect Payment & Confirm")
    public void ıSelectAValueInThePaymentMethodFieldForCollectPaymentConfirm(String paymentMethod) throws Throwable {
        shoppingCartPage
                .selectPaymentMethod(paymentMethod);
    }

    @And("I click the Payment Collected")
    public void ıClickThePaymentCollected() throws Throwable {
        shoppingCartPage
                .clickPaymentCollected();
    }

    @When("I click the {string} button")
    public void ıClickTheButton(String buttonName) throws Throwable {
        shoppingCartPage
                .clickButton(buttonName);
    }

    @When("I click the OK button")
    public void ıClickTheOKButton() throws Throwable {
        shoppingCartPage
                .clickOkButton();
    }

    @Then("I should be seeing that the {string} come as a drop-down list")
    public void ıShouldBeSeeingThatTheComeAsADropDownList(String fieldName) {
        shoppingCartPage
                .controlShoppingCartField(fieldName);
    }

    @Then("I should be seeing {string}")
    public void ıShouldBeSeeing(String paymentMethodValue) throws Throwable {
        shoppingCartPage
                .controlPaymentMethodValue(paymentMethodValue);
    }

    @And("I should not seeing checkout button because it doesn't have the create_agreement role")
    public void ıShouldNotSeeingCheckoutButtonBecauseItDoesnTHaveTheCreate_agreementRole() throws Throwable {
        shoppingCartPage
                .controlCheckoutButton();
    }

    @When("I select a value {string} in the Documents field")
    public void ıSelectAValueInTheDocumentsField(String documentType) throws Throwable {
        shoppingCartPage
                .selectDocumentType(documentType);
    }
}

