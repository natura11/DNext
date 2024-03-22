package dnext.com.step_definitions.gui.createIndividualCustomerStepDefinition;

import com.utilities.Utils;
import dnext.com.pages.BasePage;
import dnext.com.pages.createIndividualCustomer.ContactInformationIndividualPage;
import dnext.com.pages.createIndividualCustomer.InvoiceAccountIndividualPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import org.openqa.selenium.By;

import java.util.Map;

@AllArgsConstructor
public class ContactInformationIndividualStepDefinition extends BasePage {
    ContactInformationIndividualPage contactInformationIndividualPage;
    InvoiceAccountIndividualPage invoiceAccountIndividualPage;
//    AddressInformationIndividualPage addressInformationIndividualPage;

    @Given("User clicks the Contact Information button for Individual")
    public void userClicksTheContactInformationButton() {
        clickField(contactInformationIndividualPage.contactInformationButton);
    }

    @Given("User is on the Individual Contact Information page")
    public void userIsOnTheIndividualContactInformationPage() {
        contactInformationIndividualPage.verifyUserIsOnContactInformationPage();
    }

    @And("User clicks Next button on Individual Contact Information Page")
    public void userClicksNextButtonOnIndividualContactInformationPage() {
        clickField(contactInformationIndividualPage.nextButtonOnContactInformationPage);
    }

    @Then("User is on the Individual Invoice Account page")
    public void userIsOnTheIndividualInvoiceAccountPage() {
        invoiceAccountIndividualPage.verifyUserIsOnInvoiceAccountPage();
    }

    @And("User clicks Back button on Individual Contact Information Page")
    public void userClicksBackButtonOnIndividualContactInformationPage() {
        clickField(contactInformationIndividualPage.backButtonOnContactInformationPage);
    }

    @Then("User should see the Individual Address Information Page")
    public void userShouldSeeTheIndividualAddressInformationPage() {
//        addressInformationIndividualPage.verifyUserIsOnAddressInformationPage();
    }

    @Given("User should see the Type of Authorization dropdown on Individual Contact Information Page")
    public void userShouldSeeTheTypeOfAuthorizationDropdown() {
        elementDisplayed(contactInformationIndividualPage.typeOfAuthorizationDropdown);
    }

    @And("User clicks Type of Authorization dropdown on Individual Contact Information Page")
    public void userClicksTypeOfAuthorizationDropdown() {
        clickField(contactInformationIndividualPage.typeOfAuthorizationDropdown);
    }

    @Then("User should ensure each options in Type of Authorization dropdown are selectable on Individual Contact Information Page")
    public void userShouldEnsureEachOptionsInTypeOfAuthorizationDropdownAreSelectable() {
        isDropdownSelectableOne();
    }

    @Then("User should see Identification Number textbox on Individual Contact Information Page")
    public void userShouldSeeIdentificationNumberTextbox() {
        elementDisplayed(contactInformationIndividualPage.identificationNumberInput);
    }

    @Then("User should see that background is red for the Identification Number textbox on Individual Contact Information Page")
    public void userShouldSeeThatBackgroundIsRedForTheIdentificationNumberTextbox() {
        warningBackgroundRedColorOne(contactInformationIndividualPage.identificationNumberInputDiv, true);
    }

    @Then("User should see First Name textbox on Individual Contact Information Page")
    public void userShouldSeeFirstNameTextbox() {
        elementDisplayed(contactInformationIndividualPage.firstNameInput);
    }

    @Then("User should see that background is red for the First Name textbox on Individual Contact Information Page")
    public void userShouldSeeThatBackgroundIsRedForTheFirstNameTextbox() {
        warningBackgroundRedColorOne(contactInformationIndividualPage.firstNameInputDiv, true);
    }

    @Then("User should see Last Name textbox on Individual Contact Information Page")
    public void userShouldSeeLastNameTextbox() {
        elementDisplayed(contactInformationIndividualPage.lastNameInput);
    }

    @Then("User should see that background is red for the Last Name textbox on Individual Contact Information Page")
    public void userShouldSeeThatBackgroundIsRedForTheLastNameTextbox() {
        warningBackgroundRedColorOne(contactInformationIndividualPage.lastNameInputDiv, true);
    }

    @Then("User should see Birth Date input on Individual Contact Information Page")
    public void userShouldSeeBirthDateInput() {
        elementDisplayed(contactInformationIndividualPage.birthDateInput);
    }

    @Then("User should see that background is red for the Birth Date input on Individual Contact Information Page")
    public void userShouldSeeThatBackgroundIsRedForTheBirthDateInput() {
        warningBackgroundRedColorOne(contactInformationIndividualPage.birthDateInputDiv, true);
    }

    @Then("User should see Gender dropdown on Individual Contact Information Page")
    public void userShouldSeeGenderDropdown() {
        elementDisplayed(contactInformationIndividualPage.genderDropdown);
    }

    @Then("User should see that background is red for the Gender dropdown on Individual Contact Information Page")
    public void userShouldSeeThatBackgroundIsRedForTheGenderDropdown() {
        warningBackgroundRedColorOne(contactInformationIndividualPage.genderDropdownDiv, true);
    }

    @Then("User should see that Citizenship dropdown on Individual Contact Information Page")
    public void userShouldSeeThatCitizenshipDropdown() {
        elementDisplayed(contactInformationIndividualPage.citizenshipDropdown);
    }

    @Then("User should see that Citizenship dropdown is disabled on Individual Contact Information Page")
    public void userShouldSeeThatCitizenshipDropdownIsDisabled() {
        contactInformationIndividualPage.verifyCitizenshipStatus(false);
    }

    @Then("User should see Document Type dropdown on Individual Contact Information Page")
    public void userShouldSeeDocumentTypeDropdown() {
        elementDisplayed(contactInformationIndividualPage.documentTypeDropdown);
    }

    @Then("User should see Add button on Individual Contact Information Page")
    public void userShouldSeeAddButton() {
        elementDisplayed(contactInformationIndividualPage.documentAddButton);
    }

    @Then("User should see the document {string} warning message on Individual Contact Information Page")
    public void userShouldSeeTheWarningMessage(String message) {
        contactInformationIndividualPage
                .verifyErrorMessage(contactInformationIndividualPage.documentErrorText, message);
    }

    @When("User clicks Identification Number textbox on Contact Information Page")
    public void userClicksIdentificationNumberTextbox() {
        clickField(contactInformationIndividualPage.identificationNumberInput);
    }

    @And("User enters {string} for the Identification Number textbox on Individual Contact Information Page")
    public void userEntersForTheIdentificationNumberTextbox(String text) {
        contactInformationIndividualPage
                .fillInput(contactInformationIndividualPage.identificationNumberInput, text);
    }

    @And("User clicks search button on Individual Contact Information Page")
    public void userClicksSearchButton() {
        clickField(contactInformationIndividualPage.identificationNumberSearchIcon);
    }

    @Then("User should see the person is shown in the list on Individual Contact Information Page")
    public void userShouldSeeThePersonIsShownInTheList() {
        Utils.waitForVisibility(contactInformationIndividualPage.idPersonOptionInList, 3);
        elementDisplayed(contactInformationIndividualPage.idPersonOptionInList);
    }

    @When("User clicks the displayed Customer on Individual Contact Information Page")
    public void userClicksTheDisplayedCustomer() {
        clickField(contactInformationIndividualPage.idPersonOptionInList);
    }

    @Then("User should see some ID related information were autofilled with person data on Individual Contact Information Page")
    public void userShouldSeeSomeIDRelatedInformationWereAutofilledWithPersonData(Map<String, String> table) {
        Utils.waitFor(2);
        contactInformationIndividualPage.verifyFetchedPersonData(table);
    }

    @Then("User should see that Citizenship dropdown is enabled on Individual Contact Information Page")
    public void userShouldSeeThatCitizenshipDropdownIsEnabled() {
        contactInformationIndividualPage.verifyCitizenshipStatus(true);
    }

    @And("User adds a valid {string} document for Letter of Attorney on Individual Contact Information Page")
    public void userAddsAValidDocumentForLetterOfAttorney(String fileName) {
        contactInformationIndividualPage.uploadLetterOfAttorneyDocument(fileName);
    }

    @Then("User should see the name of {string} added pdf document on Individual Contact Information Page")
    public void userShouldSeeTheNameOfAddedPdfDocument(String fileName) {
        contactInformationIndividualPage.verifyUploadedLetterOfAttorneyDocument(fileName);
    }

    @And("User selects {string} option in the Authorization dropdown on Individual Contact Information Page")
    public void userSelectsOptionInTheAuthorizationDropdown(String authorizationType) {
        selectSpecificOptionFromDropdown(authorizationType);
    }

    @Then("User should see the entered person is new party on Individual Contact Information Page")
    public void userShouldSeeTheEnteredPersonIsNewParty() {
        contactInformationIndividualPage.verifyPersonIsNewParty();
    }

    @Then("User should see that background is not red for the Identification Number textbox on Individual Contact Information Page")
    public void userShouldSeeThatBackgroundIsNotRedForTheIdentificationNumberTextbox() {
        warningBackgroundRedColorOne(contactInformationIndividualPage.identificationNumberInputDiv, false);
    }

    @When("User clicks First Name textbox on Individual Contact Information Page")
    public void userClicksFirstNameTextbox() {
        clickField(contactInformationIndividualPage.firstNameInput);
    }

    @And("User enters {string} for the First Name textbox on Individual Contact Information Page")
    public void userEntersForTheFirstNameTextbox(String firstName) {
        contactInformationIndividualPage
                .fillInput(contactInformationIndividualPage.firstNameInput, firstName);
    }

    @Then("User should see that background is not red for the First Name textbox on Individual Contact Information Page")
    public void userShouldSeeThatBackgroundIsNotRedForTheFirstNameTextbox() {
        warningBackgroundRedColorOne(contactInformationIndividualPage.firstNameInputDiv, false);
    }

    @When("User clicks Last Name textbox on Individual Contact Information Page")
    public void userClicksLastNameTextbox() {
        clickField(contactInformationIndividualPage.lastNameInput);
    }

    @And("User enters {string} for the Last Name textbox on Individual Contact Information Page")
    public void userEntersForTheLastNameTextbox(String lastName) {
        contactInformationIndividualPage
                .fillInput(contactInformationIndividualPage.lastNameInput, lastName);
    }

    @Then("User should see that background is not red for the Last Name textbox on Individual Contact Information Page")
    public void userShouldSeeThatBackgroundIsNotRedForTheLastNameTextbox() {
        warningBackgroundRedColorOne(contactInformationIndividualPage.lastNameInputDiv, false);
    }

    @When("User clicks Birth Date input on Individual Contact Information Page")
    public void userClicksBirthDateInput() {
        clickField(contactInformationIndividualPage.birthDateInput);
    }

    @And("User enters {string} for the Birth Date input on Individual Contact Information Page")
    public void userEntersForTheBirthDateInput(String birthDate) {
        contactInformationIndividualPage
                .fillInput(contactInformationIndividualPage.birthDateInput, birthDate);
    }

    @Then("User should see that background is not red for the Birth Date input on Individual Contact Information Page")
    public void userShouldSeeThatBackgroundIsNotRedForTheBirthDateInput() {
        warningBackgroundRedColorOne(contactInformationIndividualPage.birthDateInputDiv, false);
    }

    @When("User clicks Gender dropdown on Individual Contact Information Page")
    public void userClicksGenderDropdown() {
        clickField(contactInformationIndividualPage.genderDropdown);
    }

    @And("User selects {string} for the Gender dropdown on Individual Contact Information Page")
    public void userSelectsForTheGenderDropdown(String gender) {
        contactInformationIndividualPage.selectSpecificGenderFromDropdown(gender);
    }

    @Then("User should see that background is red for the Citizenship dropdown on Individual Contact Information Page")
    public void userShouldSeeThatBackgroundIsRedForTheCitizenshipDropdown() {
        warningBackgroundRedColorOne(contactInformationIndividualPage.citizenshipDropdownDiv, true);
    }

    @When("User clicks Citizenship dropdown on Individual Contact Information Page")
    public void userClicksCitizenshipDropdown() {
        clickField(contactInformationIndividualPage.citizenshipDropdown);
    }

    @And("User selects {string} for the Citizenship dropdown on Individual Contact Information Page")
    public void userSelectsForTheCitizenshipDropdown(String citizenship) {
        selectSpecificOptionFromDropdown(citizenship);
    }

    @Given("User should see the Type of Contact dropdown on Individual Contact Information Page")
    public void userShouldSeeTheTypeOfContactDropdown() {
        elementDisplayed(contactInformationIndividualPage.typeOfContactDropdown);
    }

    @And("User clicks Type of Contact dropdown on Individual Contact Information Page")
    public void userClicksTypeOfContactDropdown() {
        clickField(contactInformationIndividualPage.typeOfContactDropdown);
    }

    @Then("User should ensure each options in Type of Contact dropdown are selectable on Individual  Contact Information Page")
    public void userShouldEnsureEachOptionsInTypeOfContactDropdownAreSelectable() {
        isDropdownSelectableOne();
    }

    @And("User selects {string} option in the Contact dropdown on Individual Contact Information Page")
    public void userSelectsOptionInTheContactDropdown(String contactType) {
        selectSpecificOptionFromDropdown(contactType);
    }

    @Then("User should see Country Code dropdown on Individual Contact Information Page")
    public void userShouldSeeCountryCodeDropdown() {
        elementDisplayed(contactInformationIndividualPage.countryCodeDropdown);
    }

    @Then("User should see Mobile Phone Number textbox on Individual Contact Information Page")
    public void userShouldSeeMobilePhoneNumberTextbox() {
        elementDisplayed(contactInformationIndividualPage.phoneNumberInput);
    }

    @Then("User should see Email textbox on Individual Contact Information Page")
    public void userShouldSeeEmailTextbox() {
        elementDisplayed(contactInformationIndividualPage.emailInput);
    }

    @And("User clicks Country Code dropdown Individual Contact Information Page")
    public void userClicksCountryCodeDropdown() {
        clickField(contactInformationIndividualPage.countryCodeDropdown);
    }

    @When("User selects {string} option in the Country Code dropdown on Individual Contact Information page")
    public void userSelectsOptionInTheCountryCodeDropdown(String countryCode) {
        selectSpecificOptionFromDropdown(countryCode);
    }

    @And("User clicks mobile phone number field on Individual Contact Information page")
    public void userClicksMobilePhoneNumberField() {
        clickField(contactInformationIndividualPage.phoneNumberInput);
    }

    @And("User enters valid {string} into the phone number field on Individual Contact Information page")
    public void userEntersValidIntoThePhoneNumberField(String phoneNumber) {
        contactInformationIndividualPage
                .fillInput(contactInformationIndividualPage.phoneNumberInput, phoneNumber);
    }

    @Then("User should not see the warning background on phone field on Individual Contact Information page")
    public void userShouldNotSeeTheWarningBackgroundOnPhoneField() {
        warningBackgroundRedColorOne(contactInformationIndividualPage.phoneNumberInputDiv, false);
    }

    @When("User clicks Email textbox on Individual Contact Information Page")
    public void userClicksEmailTextbox() {
        clickField(contactInformationIndividualPage.emailInput);
    }

    @And("User enters valid {string} in to the email field on Individual Contact Information Page")
    public void userEntersValidInToTheEmailField(String email) {
        contactInformationIndividualPage
                .fillInput(contactInformationIndividualPage.emailInput, email);
    }

    @Then("User should see {string} and {string} and {string} inside of email structure on Individual Contact Information Page")
    public void userShouldSeeInsideOfEmailStructure(String dotSign, String tagSign, String email) {
        verifyValidFormatEmail(dotSign, tagSign, email);
    }

    @Then("User should see that background is not red for the email field on Individual Contact Information Page")
    public void userShouldSeeThatBackgroundIsNotRedForTheEmailField() {
        warningBackgroundRedColorOne(contactInformationIndividualPage.emailInputDiv, false);
    }
}