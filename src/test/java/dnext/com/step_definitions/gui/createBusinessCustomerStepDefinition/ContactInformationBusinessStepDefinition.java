package dnext.com.step_definitions.gui.createBusinessCustomerStepDefinition;

import com.utilities.Utils;
import dnext.com.pages.BasePage;
import dnext.com.pages.createBusinessCustomerPages.AdminInformationBusinessPage;
import dnext.com.pages.createBusinessCustomerPages.ContactInformationBusinessPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.Keys;

@AllArgsConstructor
@Log4j2
public class ContactInformationBusinessStepDefinition extends BasePage {
    ContactInformationBusinessPage contactInformationBusinessPage;
    AdminInformationBusinessPage adminInformationBusinessPage;

    @Given("User clicks the Contact Information button")
    public void userClicksTheContactInformationButton() {
        clickField(contactInformationBusinessPage.contactInformationButton);
    }

    @Given("User is on the Contact Information page")
    public void userIsOnTheContactInformationPage() {
        contactInformationBusinessPage.verifyUserIsOnContactInformationPage();
    }

    @And("User clicks Next button on Contact Information Page")
    public void userClicksNextButtonOnContactInformationPage() {
        clickField(contactInformationBusinessPage.nextButtonOnContactInformationPage);
    }

    @And("User clicks Back button on Contact Information Page")
    public void userClicksBackButtonOnContactInformationPage() {
        clickField(contactInformationBusinessPage.backButtonOnContactInformationPage);
    }

    @Then("User should see the Admin Information Page")
    public void userShouldSeeTheAdminInformationPage() {
        adminInformationBusinessPage.verifyUserIsOnAdminInformationPage();
    }

    @Given("User should see the Type of Contact dropdown on Contact Information Page")
    public void userShouldSeeTheTypeOfContactDropdown() {
        elementDisplayed(contactInformationBusinessPage.typeOfContactDropdown);
    }

    @And("User clicks Type of Contact dropdown on Contact Information Page")
    public void userClicksTypeOfContactDropdown() {
        clickField(contactInformationBusinessPage.typeOfContactDropdown);
    }

    @Then("User should see Country Code dropdown on Contact Information Page")
    public void userShouldSeeCountryCodeDropdown() {
        elementDisplayed(contactInformationBusinessPage.countryCodeDropdown);
    }

    @Then("User should see Mobile Phone Number textbox on Contact Information Page")
    public void userShouldSeeMobilePhoneNumberTextbox() {
        elementDisplayed(contactInformationBusinessPage.phoneNumberInput);
    }

    @Given("User clicks Country Code dropdown Contact Information Page")
    public void userClicksCountryCodeDropdown() {
        clickField(contactInformationBusinessPage.countryCodeDropdown);
    }

    @Then("User should ensure each options in Country Code dropdown are selectable on Contact Information Page")
    public void userShouldEnsureEachOptionsInCountryCodeDropdownAreSelectable() {
        isDropdownSelectable();
    }

    @When("User selects {string} option in the Country Code dropdown on Contact Information page")
    public void userSelectsOptionInTheCountryCodeDropdown(String countryCode) {
        selectSpecificOptionFromDropdown(countryCode);
    }

    @And("User clicks mobile phone number field on Contact Information page")
    public void userClicksMobilePhoneNumberField() {
        clickField(contactInformationBusinessPage.phoneNumberInput);
    }

    @And("User leaves blank mobile phone number field on Contact Information page")
    public void userLeavesBlankMobilePhoneNumberField() {
        Utils.sendKeys(contactInformationBusinessPage.phoneNumberInput, "" + Keys.TAB);
    }

    @Then("User should see {string} warning message on phone field on Contact Information page")
    public void userShouldSeeWarningMessageOnPhoneField(String errorMessage) {
        verifyInputErrorMessage(contactInformationBusinessPage.phoneNumberErrorText, errorMessage);
    }

    @And("User enters mobile phone number {string} with other country code except Albania on Contact Information page")
    public void userEntersMobilePhoneNumberWithOtherCountryCodeExceptAlbania(String phoneNumber) {
        fillInputWithTab(contactInformationBusinessPage.phoneNumberInput, phoneNumber);
    }

    @Then("User should not see the warning message on phone field on Contact Information page")
    public void userShouldNotSeeWarningMessageOnPhoneField() {
        elementNotDisplayed(contactInformationBusinessPage.phoneNumberErrorText);
    }

    @And("User enters invalid {string} phone numbers on Contact Information Page")
    public void userEntersInvalidPhoneNumbers(String phoneNumber) {
        fillInputWithTab(contactInformationBusinessPage.phoneNumberInput, phoneNumber);
    }

    @Then("User should see {string} message under mobile phone number field on Contact Information page")
    public void userShouldSeeMessageUnderMobilePhoneNumberField(String errorMessage) {
        verifyInputErrorMessage(contactInformationBusinessPage.phoneNumberErrorText, errorMessage);
    }

    @And("User enters valid {string} into the phone number field on Contact Information page")
    public void userEntersValidIntoThePhoneNumberField(String phoneNumber) {
        fillInputWithTab(contactInformationBusinessPage.phoneNumberInput, phoneNumber);
    }

    @Then("User should see Email textbox on Contact Information Page")
    public void userShouldSeeEmailTextbox() {
        elementDisplayed(contactInformationBusinessPage.emailInput);
    }

    @When("User clicks Email textbox on Contact Information Page")
    public void userClicksEmailTextbox() {
        clickField(contactInformationBusinessPage.emailInput);
    }

    @And("User enters invalid emails {string} on Contact Information Page")
    public void userEntersInvalidEmails(String email) {
        fillInputWithTab(contactInformationBusinessPage.emailInput, email);
    }

    @Then("User should see that background is red for the email field on Contact Information Page")
    public void userShouldSeeThatBackgroundIsRedForEmailField() {
        warningBackgroundRedColorOne(contactInformationBusinessPage.emailInputDiv, true);
    }

    @And("User enters valid {string} in to the email field on Contact Information Page")
    public void userEntersValidInToTheEmailField(String email) {
        fillInputWithTab(contactInformationBusinessPage.emailInput, email);
    }

    @Then("User should see {string} and {string} and {string} inside of email structure on Contact Information Page")
    public void userShouldSeeAndAndInsideOfEmailStructure(String dotSign, String tagSign, String email) {
        verifyValidFormatEmail(dotSign, tagSign, email);
    }

    @Then("User should see that background is not red for the email field on Contact Information Page")
    public void userShouldSeeThatBackgroundIsNotRedForEmailField() {
        warningBackgroundRedColorOne(contactInformationBusinessPage.emailInputDiv, false);
    }

    @Then("User should ensure each options in Type of Contact dropdown are selectable on Contact Information Page")
    public void userShouldEnsureEachOptionsInTypeOfContactDropdownAreSelectable() {
        isDropdownSelectable();
    }

    @And("User selects {string} option in the Contact dropdown on Contact Information Page")
    public void userSelectsOptionInTheContactDropdown(String contactType) {
        selectSpecificOptionFromDropdown(contactType);
    }

    @Then("User should not see the warning background on phone field on Contact Information page")
    public void userShouldNotSeeTheWarningBackgroundOnPhoneFieldOnContactInformationPage() {
        warningBackgroundRedColorOne(contactInformationBusinessPage.phoneNumberInputDiv, false);
    }

    @And("User clicks Add+ button to add Additional Contact on Contact Information Page")
    public void userClicksAddButtonToAddAdditionalContact() {
        clickField(contactInformationBusinessPage.addAdditionalContactButton);
    }

    @Then("User should see the new Contact Type section")
    public void userShouldSeeTheNewContactTypeSection() {
        elementDisplayed(contactInformationBusinessPage.removeAdditionalContactButton);
    }

    @Given("User should see the additional Type of Contact dropdown on Contact Information Page")
    public void userShouldSeeTheAdditionalTypeOfContactDropdown() {
        elementDisplayed(contactInformationBusinessPage.additionalTypeOfContactDropdown);
    }

    @And("User clicks additional Type of Contact dropdown on Contact Information Page")
    public void userClicksAdditionalTypeOfContactDropdown() {
        clickField(contactInformationBusinessPage.additionalTypeOfContactDropdown);
    }

    @Then("User should ensure each options in additional Type of Contact dropdown are selectable on Contact Information Page")
    public void userShouldEnsureEachOptionsInAdditionalTypeOfContactDropdownAreSelectable() {
        isDropdownSelectable();
    }

    @Then("User should see the same contact type error message on Contact Information Page")
    public void userShouldSeeTheSameContactTypeErrorMessage() {
        elementDisplayed(contactInformationBusinessPage.sameContactTypeErrorText);
    }

    @Then("User should not see the same contact type error message on Contact Information Page")
    public void userShouldNotSeeTheSameContactTypeErrorMessage() {
        elementNotDisplayed(contactInformationBusinessPage.sameContactTypeErrorText);
    }

    @Then("User should see additional Country Code dropdown on Contact Information Page")
    public void userShouldSeeAdditionalCountryCodeDropdown() {
        elementDisplayed(contactInformationBusinessPage.additionalCountryCodeDropdown);
    }

    @Then("User should see additional Mobile Phone Number textbox on Contact Information Page")
    public void userShouldSeeAdditionalMobilePhoneNumberTextbox() {
        elementDisplayed(contactInformationBusinessPage.additionalPhoneNumberInput);
    }

    @Then("User should see additional Email textbox on Contact Information Page")
    public void userShouldSeeAdditionalEmailTextbox() {
        elementDisplayed(contactInformationBusinessPage.additionalEmailInput);
    }

    @And("User clicks additional Country Code dropdown Contact Information Page")
    public void userClicksAdditionalCountryCodeDropdown() {
        clickField(contactInformationBusinessPage.additionalCountryCodeDropdown);
    }

    @When("User selects {string} option in the additional Country Code dropdown on Contact Information page")
    public void userSelectsOptionInTheAdditionalCountryCodeDropdown(String countryCode) {
        selectSpecificOptionFromDropdown(countryCode);
    }

    @And("User clicks additional mobile phone number field on Contact Information page")
    public void userClicksAdditionalMobilePhoneNumberField() {
        clickField(contactInformationBusinessPage.additionalPhoneNumberInput);
    }

    @And("User enters valid {string} into the additional phone number field on Contact Information page")
    public void userEntersValidIntoTheAdditionalPhoneNumberField(String phoneNumber) {
        fillInputWithTab(contactInformationBusinessPage.additionalPhoneNumberInput, phoneNumber);
    }

    @Then("User should not see the additional warning message on phone field on Contact Information page")
    public void userShouldNotSeeAdditionalWarningMessageOnPhoneField() {
        elementNotDisplayed(contactInformationBusinessPage.additionalPhoneNumberErrorText);
    }

    @When("User clicks additional Email textbox on Contact Information Page")
    public void userClicksAdditionalEmailTextbox() {
        clickField(contactInformationBusinessPage.additionalEmailInput);
    }

    @And("User enters valid {string} in to the additional email field on Contact Information Page")
    public void userEntersValidInToTheAdditionalEmailField(String email) {
        fillInputWithTab(contactInformationBusinessPage.additionalEmailInput, email);
    }

    @Then("User should see {string} and {string} and {string} inside of additional email structure on Contact Information Page")
    public void userShouldSeeAndAndInsideOfAdditionalEmailStructure(String dotSign, String tagSign, String email) {
        verifyValidFormatEmail(dotSign, tagSign, email);
    }

    @Then("User should see that additional background is not red for the email field on Contact Information Page")
    public void userShouldSeeThatAdditionalBackgroundIsNotRedForEmailField() {
        warningBackgroundRedColorOne(contactInformationBusinessPage.additionalEmailInputDiv, false);
    }


    @Then("User should not see the additional warning background on phone field on Contact Information page")
    public void userShouldNotSeeTheAdditionalWarningBackgroundOnPhoneFieldOnContactInformationPage() {
        warningBackgroundRedColorOne(contactInformationBusinessPage.additionalPhoneNumberInputDiv, false);
    }

    @And("User selects random option in the Contact dropdown on Contact Information Page")
    public void userSelectsRandomOptionInTheContactDropdownOnContactInformationPage() {
        contactInformationBusinessPage.randomTypeOfContactOptionExceptNone();
    }

    @And("User enters random mobile phone number on Contact Information page")
    public void userEntersRandomMobilePhoneNumberOnContactInformationPage() {
        contactInformationBusinessPage.fillPhoneNumberWithRandomNumber();
    }

    @And("User enters random email on Contact Information Page")
    public void userEntersRandomEmailOnContactInformationPage() {
        contactInformationBusinessPage.fillEmailWithRandomEmail();
    }
}