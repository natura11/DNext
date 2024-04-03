package dnext.com.step_definitions.gui.createBusinessCustomerStepDefinition;

import dnext.com.pages.BasePage;
import dnext.com.pages.createBusinessCustomerPages.InvoiceAccountBusinessPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import org.openqa.selenium.Keys;

@AllArgsConstructor
public class InvoiceAccountBusinessStepDefinition extends BasePage {
    InvoiceAccountBusinessPage invoiceAccountBusinessPage;

    @Given("User clicks the Invoice Account button")
    public void userClicksTheInvoiceAccountButton() {
        clickField(invoiceAccountBusinessPage.invoiceAccountButton);
    }

    @Given("User is on the Invoice Account page")
    public void userIsOnTheInvoiceAccountPage() {
        invoiceAccountBusinessPage.verifyUserIsOnInvoiceAccountPage();
    }

    @And("User clicks Next button on Invoice Account page")
    public void userClicksNextButtonOnInvoiceAccountPage() {
        clickField(invoiceAccountBusinessPage.nextButtonOnInvoiceAccountPage);
    }

    @And("User clicks Back button on Invoice Account page")
    public void userClicksBackButtonOnInvoiceAccountPage() {
        clickField(invoiceAccountBusinessPage.backButtonOnInvoiceAccountPage);
    }

    @Then("User sees the Ebill Email is required on Invoice Account page")
    public void userSeesTheEbillEmailIsRequiredOnInvoiceAccountPage() {
        warningBackgroundRedColorOne(invoiceAccountBusinessPage.eBillEmailInputDiv, true);
    }

    @Then("User sees the Ebill Mobile Number is required on Invoice Account page")
    public void userSeesTheEbillMobileNumberIsRequiredOnInvoiceAccountPage() {
        warningBackgroundRedColorOne(invoiceAccountBusinessPage.eBillMobileNumberInputDiv, true);
    }

    @Given("User should see the Currency dropdown on Invoice Account page")
    public void userShouldSeeTheCurrencyDropdown() {
        elementDisplayed(invoiceAccountBusinessPage.postpaidCurrencyDropdown);
    }

    @Given("User clicks Currency dropdown on Invoice Account page")
    public void userClicksCurrencyDropdown() {
        clickField(invoiceAccountBusinessPage.postpaidCurrencyDropdown);
    }

    @And("User should ensure each options in Currency dropdown are selectable on Invoice Account page")
    public void userShouldEnsureEachOptionsInCurrencyDropdownAreSelectable() {
        isDropdownSelectable();
    }

    @Then("User should selects any option in the Currency dropdown on Invoice Account page")
    public void userShouldSelectsAnyOptionInTheCurrencyDropdown() {
        randomOptionFromDropdown();
    }

    @Given("User should see the Description textbox on Invoice Account page")
    public void userShouldSeeTheDescriptionTextbox() {
        elementDisplayed(invoiceAccountBusinessPage.postpaidDescriptionInput);
    }

    @And("User clicks Description Field on Invoice Account page")
    public void userClicksDescriptionField() {
        clickField(invoiceAccountBusinessPage.postpaidDescriptionInput);
    }

    @Then("User enters a value {string} in the Description textbox on Invoice Account page")
    public void userEntersAValueInTheDescriptionTextbox(String description) {
        fillInput(invoiceAccountBusinessPage.postpaidDescriptionInput, description);
    }

    @Given("User should see the Payment Method dropdown on Invoice Account page")
    public void userShouldSeeThePaymentMethodDropdown() {
        elementDisplayed(invoiceAccountBusinessPage.paymentMethodDropdown);
    }

    @Given("User clicks Payment Method dropdown on Invoice Account page")
    public void userClicksPaymentMethodDropdown() {
        clickField(invoiceAccountBusinessPage.paymentMethodDropdown);
    }

    @When("User should ensure each options in Payment Method dropdown are selectable on Invoice Account page")
    public void userShouldEnsureEachOptionsInPaymentMethodDropdownAreSelectable() {
        isDropdownSelectable();
    }

    @And("User should select {string} option in the Payment Method dropdown on Invoice Account page")
    public void userShouldSelectOptionsInThePaymentMethodDropdownOnInvoiceAccountPage(String paymentMethod) {
        invoiceAccountBusinessPage.selectAnOptionFromDropdown(paymentMethod);
    }

    @Then("User should not see the Bank Name and Bank Account No fields")
    public void userShouldNotSeeTheBankNameAndBankAccountNoFields() {
        invoiceAccountBusinessPage.bankNameAndBankAccountNotDisplayed();
    }

    @Then("User should see the Bank Name and Bank Account No fields")
    public void userShouldSeeTheBankNameAndBankAccountNoFields() {
        invoiceAccountBusinessPage.bankNameAndBankAccountDisplayed();
    }

    @When("User clicks Bank Name dropdown on Invoice Account page")
    public void userClicksBankNameDropdown() {
        clickField(invoiceAccountBusinessPage.bankNameDropdown);
    }

    @Then("User should selects any option in the Bank Name dropdown on Invoice Account page")
    public void userShouldSelectsAnyOptionInTheBankNameDropdown() {
        randomOptionFromDropdown();
    }

    @When("User clicks Bank Account No textbox on Invoice Account page")
    public void userClicksBankAccountNoTextbox() {
        clickField(invoiceAccountBusinessPage.bankAccountNoInput);
    }

    @Then("User enters a value {string} Bank Account No textbox on Invoice Account page")
    public void userEntersAValueBankAccountNoTextbox(String accountNo) {
        fillInput(invoiceAccountBusinessPage.bankAccountNoInput, accountNo);
    }

    @Given("User should see the E-Bill email textbox on Invoice Account page")
    public void userShouldSeeTheEBillEmailTextbox() {
        elementDisplayed(invoiceAccountBusinessPage.eBillEmailInput);
    }

    @Given("User clicks email field on Invoice Account page")
    public void userClicksEmailField() {
        clickField(invoiceAccountBusinessPage.eBillEmailInput);
    }

    @And("User enters invalid emails {string} on Invoice Account Page")
    public void userEntersInvalidEmailsOnInvoiceAccountPage(String email) {
        fillInputWithTab(invoiceAccountBusinessPage.eBillEmailInput, email);
    }

    @Then("User should see {string} message under email field on Invoice Account page")
    public void userShouldSeeMessageUnderEmailFieldOnInvoiceAccountPage(String message) {
        verifyInputErrorMessage(invoiceAccountBusinessPage.eBillEmailErrorText, message);
    }

    @Then("User should see that background is red for the email field on Invoice Account page")
    public void userShouldSeeThatBackgroundIsRedForTheEmailFieldOnInvoiceAccountPage() {
        warningBackgroundRedColorOne(invoiceAccountBusinessPage.eBillEmailInputDiv, true);
    }

    @Given("User enters valid {string} in to the email field on Invoice Account page")
    public void userEntersValidInToTheEmailFieldOnInvoiceAccountPage(String email) {
        fillInputWithTab(invoiceAccountBusinessPage.eBillEmailInput, email);
    }

    @Then("User should see {string} and {string} and {string} inside of email structure on Invoice Account page")
    public void userShouldSeeAndAndInsideOfEmailStructure(String dotSign, String tagSign, String email) {
        verifyValidFormatEmail(dotSign, tagSign, email);
    }

    @Then("User should see that background is not red for the email field on Invoice Account Page")
    public void userShouldSeeThatBackgroundIsNotRedForTheEmailFieldOnInvoiceAccountPage() {
        warningBackgroundRedColorOne(invoiceAccountBusinessPage.eBillEmailInputDiv, false);
    }

    @Given("User should see Country Code dropdown on Invoice Account Page")
    public void userShouldSeeCountryCodeDropdownOnInvoiceAccountPage() {
        elementDisplayed(invoiceAccountBusinessPage.eBillCountryCodeDropdown);
    }

    @Given("User should see the E-Bill mobile number textbox on Invoice Account page")
    public void userShouldSeeTheEBillMobileNumberTextbox() {
        elementDisplayed(invoiceAccountBusinessPage.eBillMobileNumberInput);
    }

    @When("User clicks Country Code dropdown on Invoice Account page")
    public void userClicksCountryCodeDropdown() {
        clickField(invoiceAccountBusinessPage.eBillCountryCodeDropdown);
    }

    @Then("User should ensure each options in Country Code dropdown are selectable on Invoice Account page")
    public void userShouldEnsureEachOptionsInCountryCodeDropdownAreSelectableOnInvoiceAccountPage() {
        isDropdownSelectable();
    }

    @When("User selects {string} option in the Country Code dropdown on Invoice Account page")
    public void userSelectsOptionInTheCountryCodeDropdownOnInvoiceAccountPage(String countryCode) {
        selectSpecificOptionFromDropdown(countryCode);
    }

    @And("User clicks mobile phone number field on Invoice Account page")
    public void userClicksMobilePhoneNumberFieldOnInvoiceAccountPage() {
        clickField(invoiceAccountBusinessPage.eBillMobileNumberInput);
    }

    @And("User leaves blank mobile phone number field on Invoice Account page")
    public void userLeavesBlankMobilePhoneNumberFieldOnInvoiceAccountPage() {
        fillInputWithTab(invoiceAccountBusinessPage.eBillMobileNumberInput, "" + Keys.TAB);
    }

    @And("User enters mobile phone number {string} with other country code except Albania on Invoice Account page")
    public void userEntersMobilePhoneNumberWithOtherCountryCodeExceptAlbaniaOnInvoiceAccountPage(String phoneNumber) {
        fillInputWithTab(invoiceAccountBusinessPage.eBillMobileNumberInput, phoneNumber);
    }

    @And("User enters invalid {string} phone numbers on Invoice Account page")
    public void userEntersInvalidPhoneNumbersOnInvoiceAccountPage(String phoneNumber) {
        fillInputWithTab(invoiceAccountBusinessPage.eBillMobileNumberInput, phoneNumber);
    }

    @Then("User should see {string} message under mobile phone number field on Invoice Account page")
    public void userShouldSeeMessageUnderMobilePhoneNumberFieldOnInvoiceAccountPage(String message) {
        verifyInputErrorMessage(invoiceAccountBusinessPage.phoneNumberErrorText, message);
    }

    @And("User enters valid {string} into the phone number field on Invoice Account page")
    public void userEntersValidIntoThePhoneNumberFieldOnInvoiceAccountPage(String phoneNumber) {
        fillInputWithTab(invoiceAccountBusinessPage.eBillMobileNumberInput, phoneNumber);
    }

    @Then("User should not see the warning message on phone field on Invoice Account page")
    public void userShouldNotSeeTheWarningMessageOnPhoneFieldOnInvoiceAccountPage() {
        elementNotDisplayed(invoiceAccountBusinessPage.phoneNumberErrorText);
    }
}