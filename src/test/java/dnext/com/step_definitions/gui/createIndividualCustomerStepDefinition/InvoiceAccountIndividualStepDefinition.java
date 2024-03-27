package dnext.com.step_definitions.gui.createIndividualCustomerStepDefinition;

import dnext.com.pages.BasePage;
import dnext.com.pages.createIndividualCustomer.InvoiceAccountIndividualPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import org.openqa.selenium.By;


@AllArgsConstructor
public class InvoiceAccountIndividualStepDefinition extends BasePage {
    InvoiceAccountIndividualPage invoiceAccountIndividualPage;

    @Given("User clicks the Invoice Account button for Individual")
    public void userClicksTheInvoiceAccountButtonForIndividual() {
        clickField(invoiceAccountIndividualPage.invoiceAccountButton);
    }

    @And("User clicks Next button on Individual Invoice Account page")
    public void userClicksNextButtonOnIndividualInvoiceAccountPage() {
        clickField(invoiceAccountIndividualPage.nextButtonOnInvoiceAccountPage);
    }

    @And("User clicks Back button on Individual Invoice Account page")
    public void userClicksBackButtonOnIndividualInvoiceAccountPage() {
        clickField(invoiceAccountIndividualPage.backButtonOnInvoiceAccountPage);
    }

    @Then("User sees the Ebill Email is required on Individual Invoice Account page")
    public void userSeesTheEbillEmailIsRequired() {
        warningBackgroundRedColorOne(invoiceAccountIndividualPage.eBillEmailInputDiv, true);
    }

    @Then("User sees the Ebill Mobile Number is required on Individual Invoice Account page")
    public void userSeesTheEbillMobileNumberIsRequired() {
        warningBackgroundRedColorOne(invoiceAccountIndividualPage.eBillMobileNumberInputDiv, true);
    }

    @Given("User should see the Currency dropdown on Individual Invoice Account page")
    public void userShouldSeeTheCurrencyDropdown() {
        elementDisplayed(invoiceAccountIndividualPage.postpaidCurrencyDropdown);
    }

    @When("User clicks Currency dropdown on Individual Invoice Account page")
    public void userClicksCurrencyDropdown() {
        clickField(invoiceAccountIndividualPage.postpaidCurrencyDropdown);
    }

    @And("User should ensure each options in Currency dropdown are selectable on Individual Invoice Account page")
    public void userShouldEnsureEachOptionsInCurrencyDropdownAreSelectable() {
        isDropdownSelectableOne();
    }

    @Then("User should selects any option in the Currency dropdown on Individual Invoice Account page")
    public void userShouldSelectsAnyOptionInTheCurrencyDropdown() {
        optionFromDropdown(By.xpath("//*[@class=\"mat-option-text\"]"));
    }

    @Given("User should see the Description textbox on Individual Invoice Account page")
    public void userShouldSeeTheDescriptionTextbox() {
        elementDisplayed(invoiceAccountIndividualPage.postpaidDescriptionInput);
    }

    @And("User clicks Description Field on Individual Invoice Account page")
    public void userClicksDescriptionField() {
        clickField(invoiceAccountIndividualPage.postpaidDescriptionInput);
    }

    @Then("User enters a value {string} in the Description textbox on Individual Invoice Account page")
    public void userEntersAValueInTheDescriptionTextbox(String description) {
        fillInput(invoiceAccountIndividualPage.postpaidDescriptionInput, description);
    }

    @Given("User should see the Payment Method dropdown on Individual Invoice Account page")
    public void userShouldSeeThePaymentMethodDropdown() {
        elementDisplayed(invoiceAccountIndividualPage.paymentMethodDropdown);
    }

    @When("User clicks Payment Method dropdown on Individual Invoice Account page")
    public void userClicksPaymentMethodDropdown() {
        clickField(invoiceAccountIndividualPage.paymentMethodDropdown);
    }

    @And("User should ensure each options in Payment Method dropdown are selectable on Individual Invoice Account page")
    public void userShouldEnsureEachOptionsInPaymentMethodDropdownAreSelectable() {
        isDropdownSelectableOne();
    }

    @And("User should select {string} option in the Payment Method dropdown on Individual Invoice Account page")
    public void userShouldSelectOptionInThePaymentMethodDropdown(String paymentMethod) {
        invoiceAccountIndividualPage.selectAnOptionFromDropdown(paymentMethod);
    }

    @Then("User should not see the Bank Name and Bank Account No fields on Individual Invoice Account page")
    public void userShouldNotSeeTheBankNameAndBankAccountNoFields() {
        invoiceAccountIndividualPage.bankNameAndBankAccountNotDisplayed();
    }

    @Then("User should see the Bank Name and Bank Account No fields on Individual Invoice Account page")
    public void userShouldSeeTheBankNameAndBankAccountNoFields() {
        invoiceAccountIndividualPage.bankNameAndBankAccountDisplayed();
    }

    @Then("User should see the Owner textbox on Individual Invoice Account Page")
    public void userShouldSeeTheOwnerTextbox() {
        elementDisplayed(invoiceAccountIndividualPage.ownerInput);
    }

    @When("User clicks Bank Name dropdown on Individual Invoice Account page")
    public void userClicksBankNameDropdown() {
        clickField(invoiceAccountIndividualPage.bankNameDropdown);
    }

    @Then("User should selects any option in the Bank Name dropdown on Individual Invoice Account page")
    public void userShouldSelectsAnyOptionInTheBankNameDropdown() {
        optionFromDropdown(By.xpath("//*[@class=\"mat-option-text\"]"));
    }

    @When("User clicks Bank Account No textbox on Individual Invoice Account page")
    public void userClicksBankAccountNoTextbox() {
        clickField(invoiceAccountIndividualPage.bankAccountNoInput);
    }

    @Then("User enters a value {string} Bank Account No textbox on Individual Invoice Account page")
    public void userEntersAValueBankAccountNoTextbox(String accountNo) {
        fillInput(invoiceAccountIndividualPage.bankAccountNoInput, accountNo);
    }

    @When("User clicks Owner textbox on Individual Invoice Account page")
    public void userClicksOwnerTextbox() {
        clickField(invoiceAccountIndividualPage.ownerInput);
    }

    @Then("User enters a value {string} Owner textbox on Individual Invoice Account page")
    public void userEntersAValueOwnerTextbox(String ownerName) {
        fillInput(invoiceAccountIndividualPage.ownerInput, ownerName);
    }

    @Then("User should not see the Owner textbox on Individual Invoice Account Page")
    public void userShouldNotSeeTheOwnerTextbox() {
        elementNotDisplayed(invoiceAccountIndividualPage.ownerInput);
    }

    @Given("User should see the E-Bill email textbox on Individual Invoice Account page")
    public void userShouldSeeTheEBillEmailTextbox() {
        elementDisplayed(invoiceAccountIndividualPage.eBillEmailInput);
    }

    @When("User clicks email field on Individual Invoice Account page")
    public void userClicksEmailField() {
        clickField(invoiceAccountIndividualPage.eBillEmailInput);
    }

    @And("User enters invalid emails {string} on Individual Invoice Account Page")
    public void userEntersInvalidEmails(String email) {
        fillInputWithTab(invoiceAccountIndividualPage.eBillEmailInput, email);
    }

    @Then("User should see {string} message under email field on Individual Invoice Account page")
    public void userShouldSeeMessageUnderEmailField(String message) {
        verifyInputErrorMessage(invoiceAccountIndividualPage.eBillEmailErrorText, message);
    }

    @Then("User should see that background is red for the email field on Individual Invoice Account page")
    public void userShouldSeeThatBackgroundIsRedForTheEmailField() {
        warningBackgroundRedColorOne(invoiceAccountIndividualPage.eBillEmailInputDiv, true);
    }

    @Given("User enters valid {string} in to the email field on Individual Invoice Account page")
    public void userEntersValidInToTheEmailField(String email) {
        fillInputWithTab(invoiceAccountIndividualPage.eBillEmailInput, email);
    }

    @Then("User should see {string} and {string} and {string} inside of email structure on Individual Invoice Account page")
    public void userShouldSeeAndAndInsideOfEmailStructure(String dotSign, String tagSign, String email) {
        verifyValidFormatEmail(dotSign, tagSign, email);
    }

    @Then("User should see that background is not red for the email field on Individual Invoice Account Page")
    public void userShouldSeeThatBackgroundIsNotRedForTheEmailField() {
        warningBackgroundRedColorOne(invoiceAccountIndividualPage.eBillEmailInputDiv, false);
    }

    @Given("User should see Country Code dropdown on Individual Invoice Account Page")
    public void userShouldSeeCountryCodeDropdown() {
        elementDisplayed(invoiceAccountIndividualPage.eBillCountryCodeDropdown);
    }

    @Then("User should see the E-Bill mobile number textbox on Individual Invoice Account page")
    public void userShouldSeeTheEBillMobileNumberTextbox() {
        elementDisplayed(invoiceAccountIndividualPage.eBillMobileNumberInput);
    }

    @Then("User should see the Country dropdown is disabled on Individual Invoice Account page")
    public void userShouldSeeTheCountryDropdownIsDisabled() {
        invoiceAccountIndividualPage.verifyCountryCodeStatus(false);
    }

    @And("User clicks mobile phone number field on Individual Invoice Account page")
    public void userClicksMobilePhoneNumberField() {
        clickField(invoiceAccountIndividualPage.eBillMobileNumberInput);
    }

    @And("User enters invalid {string} phone numbers on Individual Invoice Account page")
    public void userEntersInvalidPhoneNumbers(String phoneNumber) {
        fillInputWithTab(invoiceAccountIndividualPage.eBillMobileNumberInput, phoneNumber);
    }

    @Then("User should see {string} message under mobile phone number field on Individual Invoice Account page")
    public void userShouldSeeMessageUnderMobilePhoneNumberField(String message) {
        verifyInputErrorMessage(invoiceAccountIndividualPage.phoneNumberErrorText, message);
    }

    @And("User enters valid {string} into the phone number field on Individual Invoice Account page")
    public void userEntersValidIntoThePhoneNumberField(String phoneNumber) {
        fillInputWithTab(invoiceAccountIndividualPage.eBillMobileNumberInput, phoneNumber);
    }

    @Then("User should not see the warning message on phone field on Individual Invoice Account page")
    public void userShouldNotSeeTheWarningMessageOnPhoneField() {
        elementNotDisplayed(invoiceAccountIndividualPage.phoneNumberErrorText);
    }
}
