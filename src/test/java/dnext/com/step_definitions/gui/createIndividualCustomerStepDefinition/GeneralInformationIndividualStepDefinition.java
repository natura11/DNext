package dnext.com.step_definitions.gui.createIndividualCustomerStepDefinition;

import com.utilities.Utils;
import dnext.com.pages.BasePage;
import dnext.com.pages.createIndividualCustomerPages.GeneralInformationIndividualPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import static org.junit.Assert.assertEquals;

@AllArgsConstructor
@Log4j2
public class GeneralInformationIndividualStepDefinition extends BasePage {
    GeneralInformationIndividualPage generalInformationIndividualPage;

    @Given("I click General Information on new business customer page")
    public void i_click_general_information_on_new_business_customer_page() {
        clickField(generalInformationIndividualPage.generalInformationLabel);
    }

    @Given("User wants to enter {string} as firstname on New Individual Customer page")
    public void userWantsToEnterAsFirstnameOnNewIndividualCustomerPage(String firstname) {
        generalInformationIndividualPage.firstNameFieldOn.clear();
        sendKeys(generalInformationIndividualPage.firstNameFieldOn, firstname);
    }

    @Then("User should see that the entered  numbers  are not seen on  firstname field on New Individual Customer page")
    public void userShouldSeeThatTheEnteredNumbersAreNotSeenOnFirstnameFieldOnNewIndividualCustomerPage() {
        Assert.assertFalse("1235Ali", Boolean.parseBoolean(generalInformationIndividualPage.firstNameFieldOn.getText()));
    }

    @And("User wants to enter {string} as lastname into the lastname field on New Individual Customer page")
    public void userWantsToEnterAsLastnameIntoTheLastnameFieldOnNewIndividualCustomerPage(String lastname) {
        generalInformationIndividualPage.lastNameField.clear();
        sendKeys(generalInformationIndividualPage.lastNameField, lastname);
    }

    @Then("User should see that the entered  numbers  are not seen  in the lastname field on New Individual Customer page")
    public void userShouldSeeThatTheEnteredNumbersAreNotSeenInTheLastnameFieldOnNewIndividualCustomerPage() {
        Assert.assertFalse("Sunal25", Boolean.parseBoolean(generalInformationIndividualPage.lastNameField.getText()));
    }

    @Then("User should see that background is red of the firstname picture on New Individual Customer page")
    public void userShouldSeeThatBackgroundIsRedOfTheFirstnamePictureOnNewIndividualCustomerPage() {
        warningBackgroundRedColorOne(generalInformationIndividualPage.firstNamePicture,true);
    }

    @Then("User should see that background is red of the lastname picture on New Individual Customer page")
    public void userShouldSeeThatBackgroundIsRedOfTheLastnamePictureOnNewIndividualCustomerPage() {
        warningBackgroundRedColorOne(generalInformationIndividualPage.lastNamePicture,true);
    }

    @Then("User should see the left space at the beginning of firstname is eliminated on New Individual Customer page")
    public void userShouldSeeTheLeftSpaceAtTheBeginningOfFirstnameIsEliminatedOnNewIndividualCustomerPage() {
        performKeyboardAction(Keys.TAB);
        assertEquals("ALI", getValueByJS("firstName"));
    }

    @Then("User should see the left space at the beginning of  lastname is eliminated on New Individual Customer page")
    public void userShouldSeeTheLeftSpaceAtTheBeginningOfLastnameIsEliminatedOnNewIndividualCustomerPage() {
        performKeyboardAction(Keys.TAB);
        assertEquals("SUNAL", getValueByJS("lastName"));

    }

    @Then("User should not be allowed to write more than one spaced firstname nouns into the firstname field on New Individual Customer page")
    public void userShouldNotBeAllowedToWriteMoreThanOneSpacedFirstnameNounsIntoTheFirstnameFieldOnNewIndividualCustomerPage() {
        assertEquals("ALI KEMAL", getValueByJS("firstName"));
    }

    @Then("User should not be allowed to write more than one spaced lastname nouns into the lastname field on New Individual Customer page")
    public void userShouldNotBeAllowedToWriteMoreThanOneSpacedLastnameNounsIntoTheLastnameFieldOnNewIndividualCustomerPage() {
        assertEquals("KOMIK SUNAL", getValueByJS("lastName"));
    }

    @And("User enters {string} as middle name into the middle name field on New Individual Customer page")
    public void userEntersAsMiddleNameIntoTheMiddleNameFieldOnNewIndividualCustomerPage(String middleName) {
        generalInformationIndividualPage.middleNameField.clear();
        sendKeys(generalInformationIndividualPage.middleNameField, middleName);
    }

    @Then("User should see that the entered  numbers  are not seen on middle name field on New Individual Customer page")
    public void userShouldSeeThatTheEnteredNumbersAreNotSeenOnMiddleNameFieldOnNewIndividualCustomerPage() {
        assertEquals("BILGE", getValueByJS("secondaryName"));
    }

    @Then("User should see that background is red of middle name  picture on New Individual Customer page")
    public void userShouldSeeThatBackgroundIsRedOfMiddleNamePictureOnNewIndividualCustomerPage() {
        warningBackgroundRedColorOne(generalInformationIndividualPage.middleNamePicture,true);
    }

    @Then("User should see the left space at the beginning of middle name is eliminated on New Individual Customer page")
    public void userShouldSeeTheLeftSpaceAtTheBeginningOfMiddleNameIsEliminatedOnNewIndividualCustomerPage() {
        performKeyboardAction(Keys.TAB);
        assertEquals("BILGE", getValueByJS("secondaryName"));
    }

    @Given("User clicks email field on New Individual Customer page")
    public void userClicksEmailFieldOnNewIndividualCustomerPage() {
        clickField(generalInformationIndividualPage.emailFieldOnIndividual);
    }

    @And("User enters {string} on New Individual Customer page")
    public void userEntersOnNewIndividualCustomerPage(String invalidEmail) {
        generalInformationIndividualPage.enterInvalidFormatEmailsOnIndividual(invalidEmail);
    }

    @And("User should see that background is red on email field on New Individual Customer page")
    public void userShouldSeeThatBackgroundIsRedOnEmailFieldOnNewIndividualCustomerPage() {
        warningBackgroundRedColorOne(generalInformationIndividualPage.emailFieldPicture,true);
    }

    @Given("User enters valid {string} in to the email field on New Individual Customer page")
    public void userEntersValidInToTheEmailFieldOnNewIndividualCustomerPage(String validEmail) {
        enterValidFormatEmail(validEmail, generalInformationIndividualPage.emailFieldOnIndividual);
    }

    @Then("User should see {string} and {string} and {string} inside of email structure on New Individual Customer page")
    public void userShouldSeeAndAndInsideOfEmailStructureOnNewIndividualCustomerPage(String dotSign, String tagSign, String email) {
        verifyValidFormatEmail(dotSign, tagSign, email);
    }

    @Given("User Male option from gender on New Individual Customer page")
    public void userMaleOptionFromGenderOnNewIndividualCustomerPage() {
        generalInformationIndividualPage.selectMaleOptionFromGenderDropdownOnIndividual();
    }

    @And("User selects of invalid birth date as {string} on New Individual Customer page")
    public void userSelectsOfInvalidBirthDateAsOnNewIndividualCustomerPage(String invalidDate) {
        generalInformationIndividualPage.selectDateOfBirthOnIndividual(invalidDate);
    }

    @And("User should see that background is red on birth date on New Individual Customer page")
    public void userShouldSeeThatBackgroundIsRedOnBirthDateOnNewIndividualCustomerPage() {
        warningBackgroundRedColorOne(generalInformationIndividualPage.birthDateFieldPicture,true);
    }

    @And("User deletes the already entered invalid date of birth on New Individual Customer page")
    public void userDeletesTheAlreadyEnteredInvalidDateOfBirthOnNewIndividualCustomerPage() {
        generalInformationIndividualPage.cancelButtonOnDateOfBirthField.click();
    }

    @And("User selects of valid birth date as {string} on New Individual Customer page")
    public void userSelectsOfValidBirthDateAsOnNewIndividualCustomerPage(String validDate) {
        generalInformationIndividualPage.selectDateOfBirthOnIndividual(validDate);
    }

    @And("User selects the country as Albania as country of birth on New Individual Customer page")
    public void userSelectsTheCountryAsAlbaniaAsCountryOfBirthOnNewIndividualCustomerPage() {
        generalInformationIndividualPage.selectAlbaniaFromDropdownOnIndividual();
    }

    @And("User selects Berat as place of birth on New Individual Customer page")
    public void userSelectsBeratAsPlaceOfBirthOnNewIndividualCustomerPage() {
        generalInformationIndividualPage.selectPlaceOfBirthFromDropdownOnIndividual();
    }

    @And("User adds {string} the Mobile Phone Number into the Mobile Phone Number on New Individual Customer page")
    public void userAddsTheMobilePhoneNumberIntoTheMobilePhoneNumberOnNewIndividualCustomerPage(String mobilePhoneNumber) {
        sendKeys(generalInformationIndividualPage.mobilePhoneNumberField,mobilePhoneNumber);
    }

    @Given("User clicks Communication Method dropdown on New Individual Customer page")
    public void userClicksCommunicationMethodDropdownOnNewIndividualCustomerPage() {
        clickField(generalInformationIndividualPage.communicationMethodDropDown);
    }

    @And("User should ensure each options in Communication Method dropdown ara selectable on New Individual Customer page")
    public void userShouldEnsureEachOptionsInCommunicationMethodDropdownAraSelectableOnNewIndividualCustomerPage() {
        isDropdownSelectable();
    }

    @And("User clicks next Button in General Information on New Individual Customer page")
    public void userClicksNextButtonInGeneralInformationOnNewIndividualCustomerPage() {
        Utils.click(generalInformationIndividualPage.nextButtonOnGeneralInformation);
    }

    @Given("User clicks Segment dropdown on New Individual Customer page")
    public void userClicksSegmentDropdownOnNewIndividualCustomerPage() {
        clickField(generalInformationIndividualPage.segmentDropdownBoxOnIndividual);
    }

    @And("User should ensure each options in Segment dropdown are selectable on New Individual Customer page")
    public void userShouldEnsureEachOptionsInSegmentDropdownAreSelectableOnNewIndividualCustomerPage() {
        isDropdownSelectable();
    }

    @Then("User should selects any options in the Segment dropdown on New Individual Customer page")
    public void userShouldSelectsAnyOptionsInTheSegmentDropdownOnNewIndividualCustomerPage() {
        randomOptionFromDropdown();
    }

    @Then("User is on the Individual General Information page")
    public void userIsOnTheIndividualGeneralInformationPage() {
        generalInformationIndividualPage.verifyUserIsOnGeneralInformationPage();
    }

    @When("User enters random firstname on Individual General Information page")
    public void userEntersRandomFirstnameOnIndividualGeneralInformationPage() {
        generalInformationIndividualPage.fillFirstNameWithRandomString();
    }

    @And("User enters random lastname on Individual General Information page")
    public void userEntersRandomLastnameOnIndividualGeneralInformationPage() {
        generalInformationIndividualPage.fillLastNameWithRandomString();
    }

    @And("User enters random email on Individual General Information page")
    public void userEntersRandomEmailOnIndividualGeneralInformationPage() {
        generalInformationIndividualPage.fillEmailWithRandomEmail();
    }

    @And("User enters random birthdate on Individual General Information page")
    public void userEntersRandomBirthdateOnIndividualGeneralInformationPage() {
        generalInformationIndividualPage.fillBirthDateWithRandomDate();
    }

    @And("User selects random gender on Individual General Information page")
    public void userSelectsRandomGenderOnIndividualGeneralInformationPage() {
        generalInformationIndividualPage.selectRandomGender();
    }

    @And("User selects {string} as country of birth on Individual General Information page")
    public void userSelectsAsCountryOfBirthOnIndividualGeneralInformationPage(String country) {
        clickField(generalInformationIndividualPage.countryOfBirthField);
        selectSpecificOptionFromDropdown(country);
    }

    @And("User selects random place of birth on Individual General Information page")
    public void userSelectsRandomPlaceOfBirthOnIndividualGeneralInformationPage() {
        clickField(generalInformationIndividualPage.placeOfBirthField);
        randomOptionFromDropdown();
    }

    @And("User enters random mobile phone number on Individual General Information page")
    public void userEntersRandomMobilePhoneNumberOnIndividualGeneralInformationPage() {
        generalInformationIndividualPage.fillPhoneNumberWithRandomNumber();
    }

    @And("User clicks Next button on Individual General Information Page")
    public void userClicksNextButtonOnIndividualGeneralInformationPage() {
        clickField(generalInformationIndividualPage.nextButtonOnGeneralInformation);
    }

    @When("User clicks the General Information button for Individual")
    public void userClicksTheGeneralInformationButtonForIndividual() {
        clickField(generalInformationIndividualPage.generalInformationButtonSelectedLabel);
    }

    @And("User selects random Communication Method on Individual General Information page")
    public void userSelectsRandomCommunicationMethod() {
        randomOptionFromDropdown();
    }

    @Then("User should see that background is red for the Citizenship dropdown")
    public void userShouldSeeThatBackgroundIsRedForTheCitizenshipDropdown() {
        warningBackgroundRedColorOne(generalInformationIndividualPage.citizenShipFieldBackground, true);
    }
}