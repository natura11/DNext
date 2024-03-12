package dnext.com.step_definitions.gui.createBusinessCustomerStepDefinition;

import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import dnext.com.pages.BasePage;
import dnext.com.pages.createBusinnesCustomerPages.InvoiceAccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import org.junit.Assert;

@AllArgsConstructor
public class InvoiceAccountStepDefinition extends BasePage {
    InvoiceAccountPage invoiceAccountPage;

    @Given("User clicks the Invoice Account button")
    public void userClicksTheInvoiceAccountButton() {
        invoiceAccountPage.clickAdminInformationIcon();
    }

    @Given("User is on the Invoice Account page")
    public void userIsOnTheInvoiceAccountPage() {
        invoiceAccountPage.verifyUserIsOnInvoiceAccountPage();
    }

    @Given("User should see the Currency dropdown on Invoice Account page")
    public void userShouldSeeTheCurrencyDropdown() {
        invoiceAccountPage.postpaidCurrencyDropdownDisplayed();
    }

    @Given("User clicks Currency dropdown on Invoice Account page")
    public void userClicksCurrencyDropdown() {
        clickField(invoiceAccountPage.postpaidCurrencyDropdown);
    }

    @And("User should ensure each options in Currency dropdown are selectable on Invoice Account page")
    public void userShouldEnsureEachOptionsInCurrencyDropdownAreSelectable() {
        invoiceAccountPage.currencyDropdownSelectable();
    }

    @Then("User should selects any option in the Currency dropdown on Invoice Account page")
    public void userShouldSelectsAnyOptionInTheCurrencyDropdown() {
        invoiceAccountPage.optionFromCurrencyDropdown();
    }

    @Given("User should see the Description textbox on Invoice Account page")
    public void userShouldSeeTheDescriptionTextbox() {
        invoiceAccountPage.postpaidDescriptionDisplayed();
    }

    @And("User clicks Description Field on Invoice Account page")
    public void userClicksDescriptionField() {
        clickField(invoiceAccountPage.postpaidDescriptionInput);
    }

    @Then("User enters a value {string} in the Description textbox on Invoice Account page")
    public void userEntersAValueInTheDescriptionTextbox(String description) {
        invoiceAccountPage.fillDescriptionField(description);
    }

    @Given("User should see the Payment Method dropdown on Invoice Account page")
    public void userShouldSeeThePaymentMethodDropdown() {
        invoiceAccountPage.paymentMethodDropdownDisplayed();
    }

    @Given("User clicks Payment Method dropdown on Invoice Account page")
    public void userClicksPaymentMethodDropdown() {
        clickField(invoiceAccountPage.paymentMethodDropdown);
    }

    @When("User should ensure each options in Payment Method dropdown are selectable on Invoice Account page")
    public void userShouldEnsureEachOptionsInPaymentMethodDropdownAreSelectable() {
        invoiceAccountPage.paymentMethodDropdownSelectable();
    }

    @And("User should select {string} option in the Payment Method dropdown on Invoice Account page")
    public void userShouldSelectOptionsInThePaymentMethodDropdownOnInvoiceAccountPage(String paymentMethod) {
        invoiceAccountPage.selectAnOptionFromDropdown(paymentMethod);
    }

    @Then("User should not see the Bank Name and Bank Account No fields")
    public void userShouldNotSeeTheBankNameAndBankAccountNoFields() {
        invoiceAccountPage.bankNameAndBankAccountNotDisplayed();
    }

    @Then("User should see the Bank Name and Bank Account No fields")
    public void userShouldSeeTheBankNameAndBankAccountNoFields() {
        invoiceAccountPage.bankNameAndBankAccountDisplayed();
    }

    @When("User clicks Bank Name dropdown on Invoice Account page")
    public void userClicksBankNameDropdown() {
        clickField(invoiceAccountPage.bankNameDropdown);
    }

    @Then("User should selects any option in the Bank Name dropdown on Invoice Account page")
    public void userShouldSelectsAnyOptionInTheBankNameDropdown() {
        invoiceAccountPage.optionFromBankNameDropdown();
    }

    @When("User clicks Bank Account No textbox on Invoice Account page")
    public void userClicksBankAccountNoTextbox() {
        clickField(invoiceAccountPage.bankAccountNoInput);
    }

    @Then("User enters a value {string} Bank Account No textbox on Invoice Account page")
    public void userEntersAValueBankAccountNoTextbox(String accountNo) {
        invoiceAccountPage.fillBankAccountNoField(accountNo);
    }

    @Given("User should see the E-Bill email textbox on Invoice Account page")
    public void userShouldSeeTheEBillEmailTextbox() {
        invoiceAccountPage.eBillEmailTextBoxDisplayed();
    }

    @Given("User clicks email field on Invoice Account page")
    public void userClicksEmailField() {
        clickField(invoiceAccountPage.eBillEmailInput);
    }

    @And("User enters invalid emails {string} and should see {string} under mobile phone number field on Invoice Account page")
    public void userEntersInvalidEmailsAndShouldSeeUnderMobilePhoneNumberField(String invalidEmail, String warningMessage) {
        invoiceAccountPage.verifyEnterInvalidFormatEmail(invalidEmail, warningMessage);
    }

    @Given("User enters valid {string} in to the email field on Invoice Account page")
    public void userEntersValidInToTheEmailField(String email) {
        invoiceAccountPage.enterValidFormatEmail(email);

    }

    @Then("User should see {string} and {string} and {string} inside of email structure on Invoice Account page")
    public void userShouldSeeAndAndInsideOfEmailStructure(String dotSign, String tagSign, String email) {
        invoiceAccountPage.verifyValidFormatEmail(dotSign, tagSign, email);
    }

    @Given("User should see the E-Bill mobile number textbox on Invoice Account page")
    public void userShouldSeeTheEBillMobileNumberTextbox() {
        invoiceAccountPage.eBillMobileNumberTextBoxDisplayed();
    }

    @When("User clicks Country Code dropdown on Invoice Account page")
    public void userClicksCountryCodeDropdown() {
        clickField(invoiceAccountPage.eBillCountryCodeDropdown);
    }

    @Then("User should selects +355 option from country code dropdown on Invoice Account page")
    public void userShouldSelectsOptionFromCountryCodeDropdown() {
        clickField(invoiceAccountPage.albanianCountryCode);
    }

    @And("User clicks E-Bill mobile number field on Invoice Account page")
    public void userClicksEBillMobileNumberField() {
        clickField(invoiceAccountPage.eBillMobileNumberInput);
    }

    @And("User enters invalid {string} phone numbers and should see {string} under mobile phone number field on Invoice Account page")
    public void userEntersInvalidPhoneNumbersAndShouldSeeUnderMobilePhoneNumberField(String invalidMobile, String warningMessage) {
        invoiceAccountPage.verifyEnterInvalidFormatMobilePhoneNumber(invalidMobile, warningMessage);
    }

    @Then("User should selects +213 option from country code dropdown except Albania and clicks mobile phone numbers field on Invoice Account page")
    public void userShouldSelectsOptionFromCountryCodeDropdownExceptAlbaniaAndClicksMobilePhoneNumbersField() {
        clickField(invoiceAccountPage.countryCodeExceptAlbanian);
    }

    @And("User leaves blank mobile phone number field and should see {string} warning message on phone field on Invoice Account page")
    public void userLeavesBlankMobilePhoneNumberFieldAndShouldSeeWarningMessageOnPhoneFieldOnInvoiceAccountPage(String warningMessage) {
        invoiceAccountPage.leaveBlankMobileNumber(warningMessage);
    }

    @And("User enters mobile phone number {string} with other country code except Albania on Invoice Account page")
    public void userEntersMobilePhoneNumberWithOtherCountryCodeExceptAlbania(String phoneNumber) {
        invoiceAccountPage.fillOtherMobilePhoneNumberExceptAlbanian(phoneNumber);
    }


    @And("User enters valid {string} into the phone number field on Invoice Account page")
    public void userEntersValidIntoThePhoneNumberFieldOnInvoiceAccountPage(String phoneNumber) {
        invoiceAccountPage.fillValidMobilePhoneNumber(phoneNumber);
    }

    @Then("User should not see {string} under mobile phone number field on Invoice Account page")
    public void userShouldNotSeeUnderMobilePhoneNumberFieldOnInvoiceAccountPage(String warningMessage) {
        invoiceAccountPage.phoneNumberWarningMessageNotDisplayed(warningMessage);
    }
}
