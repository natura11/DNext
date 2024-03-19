package dnext.com.step_definitions.gui.createBusinessCustomerStepDefinition;

import com.utilities.Utils;
import dnext.com.pages.BasePage;
import dnext.com.pages.createBusinnesCustomerPages.AddressInformationPage;
import dnext.com.pages.createBusinnesCustomerPages.AdminInformationPage;
import dnext.com.pages.createBusinnesCustomerPages.ContactInformationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.Keys;

@AllArgsConstructor
@Log4j2
public class ContactInformationStepDefinition extends BasePage {
    ContactInformationPage contactInformationPage;
    AdminInformationPage adminInformationPage;

    @Given("User clicks the Contact Information button")
    public void userClicksTheContactInformationButton() {
        clickField(contactInformationPage.contactInformationButton);
    }

    @Given("User is on the Contact Information page")
    public void userIsOnTheContactInformationPage() {
        contactInformationPage.verifyUserIsOnContactInformationPage();
    }

    @And("User clicks Next button on Contact Information Page")
    public void userClicksNextButtonOnContactInformationPage() {
        clickField(contactInformationPage.nextButtonOnAddressInformationPage);
    }

    @And("User clicks Back button on Contact Information Page")
    public void userClicksBackButtonOnContactInformationPage() {
        clickField(contactInformationPage.backButtonOnAddressInformationPage);
    }

    @Then("User should see the Admin Information Page")
    public void userShouldSeeTheAdminInformationPage() {
        adminInformationPage.verifyUserIsOnAdminInformationPage();
    }

    @Given("User should see the Type of Contact dropdown on Contact Information Page")
    public void userShouldSeeTheTypeOfContactDropdown() {
        elementDisplayed(contactInformationPage.typeOfContactDropdown);
    }

    @And("User clicks Type of Contact dropdown on Contact Information Page")
    public void userClicksTypeOfContactDropdown() {
        clickField(contactInformationPage.typeOfContactDropdown);
    }

    @Then("User should see Country Code dropdown on Contact Information Page")
    public void userShouldSeeCountryCodeDropdown() {
        elementDisplayed(contactInformationPage.countryCodeDropdown);
    }

    @Then("User should see Mobile Phone Number textbox on Contact Information Page")
    public void userShouldSeeMobilePhoneNumberTextbox() {
        elementDisplayed(contactInformationPage.phoneNumberInput);
    }

    @Given("User clicks Country Code dropdown Contact Information Page")
    public void userClicksCountryCodeDropdown() {
        clickField(contactInformationPage.countryCodeDropdown);
    }

    @Then("User should ensure each options in Country Code dropdown are selectable on Contact Information Page")
    public void userShouldEnsureEachOptionsInCountryCodeDropdownAreSelectable() {
        isDropdownSelectableOne();
    }
    @When("User selects {string} option in the Country Code dropdown on Contact Information page")
    public void userSelectsOptionInTheCountryCodeDropdown(String countryCode) {
        selectSpecificOptionFromDropdown(countryCode);
    }

    @And("User clicks mobile phone number field on Contact Information page")
    public void userClicksMobilePhoneNumberField() {
        clickField(contactInformationPage.phoneNumberInput);
    }

    @And("User leaves blank mobile phone number field on Contact Information page")
    public void userLeavesBlankMobilePhoneNumberField() {
        Utils.sendKeys(contactInformationPage.phoneNumberInput,"" + Keys.TAB);
    }

    @Then("User should see {string} warning message on phone field on Contact Information page")
    public void userShouldSeeWarningMessageOnPhoneField(String errorMessage) {
        contactInformationPage.verifyEmptyInputErrorMessage(errorMessage);
    }

    @And("User enters mobile phone number {string} with other country code except Albania on Contact Information page")
    public void userEntersMobilePhoneNumberWithOtherCountryCodeExceptAlbania(String phoneNumber) {
        contactInformationPage
                .fillInput(contactInformationPage.phoneNumberInput, phoneNumber);
    }

    @Then("User should not see the warning message on phone field on Contact Information page")
    public void userShouldNotSeeWarningMessageOnPhoneField() {
        elementNotDisplayed(contactInformationPage.phoneNumberErrorText);
    }

    @And("User enters invalid {string} phone numbers on Contact Information Page")
    public void userEntersInvalidPhoneNumbers(String phoneNumber){
        contactInformationPage
                .fillInput(contactInformationPage.phoneNumberInput, phoneNumber);
    }

    @Then("User should see {string} message under mobile phone number field on Contact Information page")
    public void userShouldSeeMessageUnderMobilePhoneNumberField(String errorMessage) {
        contactInformationPage.verifyEmptyInputErrorMessage(errorMessage);
    }

    @And("User enters valid {string} into the phone number field on Contact Information page")
    public void userEntersValidIntoThePhoneNumberField(String phoneNumber) {
        contactInformationPage
                .fillInput(contactInformationPage.phoneNumberInput, phoneNumber);
    }

    @Then("User should see Email textbox on Contact Information Page")
    public void userShouldSeeEmailTextbox() {
        elementDisplayed(contactInformationPage.emailInput);
    }

    @When("User clicks Email textbox on Contact Information Page")
    public void userClicksEmailTextbox() {
        clickField(contactInformationPage.emailInput);
    }

    @And("User enters invalid emails {string} on Contact Information Page")
    public void userEntersInvalidEmails(String email) {
        contactInformationPage
                .fillInput(contactInformationPage.emailInput, email);
    }

    @Then("User should see that background is red for the email field on Contact Information Page")
    public void userShouldSeeThatBackgroundIsRedForEmailField() {
        warningBackgroundRedColorOne(contactInformationPage.emailInputDiv, true);
    }

    @And("User enters valid {string} in to the email field on Contact Information Page")
    public void userEntersValidInToTheEmailField(String email) {
        contactInformationPage
                .fillInput(contactInformationPage.emailInput, email);
    }

    @Then("User should see {string} and {string} and {string} inside of email structure on Contact Information Page")
    public void userShouldSeeAndAndInsideOfEmailStructure(String dotSign, String tagSign, String email) {
        verifyValidFormatEmail(dotSign, tagSign, email);
    }

    @Then("User should see that background is not red for the email field on Contact Information Page")
    public void userShouldSeeThatBackgroundIsNotRedForEmailField() {
        warningBackgroundRedColorOne(contactInformationPage.emailInputDiv, false);
    }

    @Then("User should ensure each options in Type of Contact dropdown are selectable on Contact Information Page")
    public void userShouldEnsureEachOptionsInTypeOfContactDropdownAreSelectable() {
        isDropdownSelectableOne();
    }

    @And("User selects {string} option in the Contact dropdown on Contact Information Page")
    public void userSelectsOptionInTheContactDropdown(String contactType) {
        selectSpecificOptionFromDropdown(contactType);
    }

    @Then("User should not see the warning background on phone field on Contact Information page")
    public void userShouldNotSeeTheWarningBackgroundOnPhoneFieldOnContactInformationPage() {
        warningBackgroundRedColorOne(contactInformationPage.phoneNumberInputDiv, false);
    }

    @And("User clicks Add+ button to add Additional Contact on Contact Information Page")
    public void userClicksAddButtonToAddAdditionalContact() {
        clickField(contactInformationPage.addAdditionalContactButton);
    }

    @Then("User should see the new Contact Type section")
    public void userShouldSeeTheNewContactTypeSection() {
        elementDisplayed(contactInformationPage.removeAdditionalContactButton);
    }

    @Given("User should see the additional Type of Contact dropdown on Contact Information Page")
    public void userShouldSeeTheAdditionalTypeOfContactDropdown() {
        elementDisplayed(contactInformationPage.additionalTypeOfContactDropdown);
    }

    @And("User clicks additional Type of Contact dropdown on Contact Information Page")
    public void userClicksAdditionalTypeOfContactDropdown() {
        clickField(contactInformationPage.additionalTypeOfContactDropdown);
    }

    @Then("User should ensure each options in additional Type of Contact dropdown are selectable on Contact Information Page")
    public void userShouldEnsureEachOptionsInAdditionalTypeOfContactDropdownAreSelectable() {
        isDropdownSelectableOne();
    }

    @Then("User should see the same contact type error message on Contact Information Page")
    public void userShouldSeeTheSameContactTypeErrorMessage() {
        elementDisplayed(contactInformationPage.sameContactTypeErrorText);
    }

    @Then("User should not see the same contact type error message on Contact Information Page")
    public void userShouldNotSeeTheSameContactTypeErrorMessage() {
        elementNotDisplayed(contactInformationPage.sameContactTypeErrorText);
    }

    @Then("User should see additional Country Code dropdown on Contact Information Page")
    public void userShouldSeeAdditionalCountryCodeDropdown() {
        elementDisplayed(contactInformationPage.additionalCountryCodeDropdown);
    }

    @Then("User should see additional Mobile Phone Number textbox on Contact Information Page")
    public void userShouldSeeAdditionalMobilePhoneNumberTextbox() {
        elementDisplayed(contactInformationPage.additionalPhoneNumberInput);
    }

    @Then("User should see additional Email textbox on Contact Information Page")
    public void userShouldSeeAdditionalEmailTextbox() {
        elementDisplayed(contactInformationPage.additionalEmailInput);
    }

    @And("User clicks additional Country Code dropdown Contact Information Page")
    public void userClicksAdditionalCountryCodeDropdown() {
        clickField(contactInformationPage.additionalCountryCodeDropdown);
    }

    @When("User selects {string} option in the additional Country Code dropdown on Contact Information page")
    public void userSelectsOptionInTheAdditionalCountryCodeDropdown(String countryCode) {
        selectSpecificOptionFromDropdown(countryCode);
    }

    @And("User clicks additional mobile phone number field on Contact Information page")
    public void userClicksAdditionalMobilePhoneNumberField() {
        clickField(contactInformationPage.additionalPhoneNumberInput);
    }

    @And("User enters valid {string} into the additional phone number field on Contact Information page")
    public void userEntersValidIntoTheAdditionalPhoneNumberField(String phoneNumber) {
        contactInformationPage
                .fillInput(contactInformationPage.additionalPhoneNumberInput, phoneNumber);
    }

    @Then("User should not see the additional warning message on phone field on Contact Information page")
    public void userShouldNotSeeAdditionalWarningMessageOnPhoneField() {
        elementNotDisplayed(contactInformationPage.additionalPhoneNumberErrorText);
    }

    @When("User clicks additional Email textbox on Contact Information Page")
    public void userClicksAdditionalEmailTextbox() {
        clickField(contactInformationPage.additionalEmailInput);
    }

    @And("User enters valid {string} in to the additional email field on Contact Information Page")
    public void userEntersValidInToTheAdditionalEmailField(String email) {
        contactInformationPage
                .fillInput(contactInformationPage.additionalEmailInput, email);
    }

    @Then("User should see {string} and {string} and {string} inside of additional email structure on Contact Information Page")
    public void userShouldSeeAndAndInsideOfAdditionalEmailStructure(String dotSign, String tagSign, String email) {
        verifyValidFormatEmail(dotSign, tagSign, email);
    }

    @Then("User should see that additional background is not red for the email field on Contact Information Page")
    public void userShouldSeeThatAdditionalBackgroundIsNotRedForEmailField() {
        warningBackgroundRedColorOne(contactInformationPage.additionalEmailInputDiv, false);
    }


    @Then("User should not see the additional warning background on phone field on Contact Information page")
    public void userShouldNotSeeTheAdditionalWarningBackgroundOnPhoneFieldOnContactInformationPage() {
        warningBackgroundRedColorOne(contactInformationPage.additionalPhoneNumberInputDiv, false);
    }
}