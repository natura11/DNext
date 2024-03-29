package dnext.com.step_definitions.gui.createIndividualCustomerStepDefinition;

import com.utilities.Driver;
import com.utilities.Utils;
import dnext.com.pages.BasePage;
import dnext.com.pages.createIndividualCustomer.GeneralInformationNewIndividualCustomerPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.junit.Assert.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

@AllArgsConstructor
@Log4j2
public class GeneralInformationNewIndividualCustomerStepDefinitions extends BasePage {
    GeneralInformationNewIndividualCustomerPage generalInformationNewIndividualCustomerPage;

    @Given("I click General Information on new business customer page")
    public void i_click_general_information_on_new_business_customer_page() {
        clickField(generalInformationNewIndividualCustomerPage.generalInformationOnNewIndividualCustomer);
    }

    @Given("User wants to enter {string} as firstname on New Individual Customer page")
    public void userWantsToEnterAsFirstnameOnNewIndividualCustomerPage(String firstname) {
        sendKeys(generalInformationNewIndividualCustomerPage.firstNameFieldOnGeneralInformationForNewIndividualCustomer, firstname);
    }

    @Then("User should see that the entered  numbers  are not seen on  firstname field on New Individual Customer page")
    public void userShouldSeeThatTheEnteredNumbersAreNotSeenOnFirstnameFieldOnNewIndividualCustomerPage() {
        Assert.assertFalse("1235Ali", Boolean.parseBoolean(generalInformationNewIndividualCustomerPage.firstNameFieldOnGeneralInformationForNewIndividualCustomer.getText()));
    }

    @And("User deletes the entered the firstname field on New Individual Customer page")
    public void userDeletesTheEnteredTheFirstnameFieldOnNewIndividualCustomerPage() {
        generalInformationNewIndividualCustomerPage.firstNameFieldOnGeneralInformationForNewIndividualCustomer.clear();
    }

    @And("User wants to enter {string} as lastname into the lastname field on New Individual Customer page")
    public void userWantsToEnterAsLastnameIntoTheLastnameFieldOnNewIndividualCustomerPage(String lastname) {
        sendKeys(generalInformationNewIndividualCustomerPage.lastNameFieldOnGeneralInformationForNewIndividualCustomer, lastname);
    }

    @Then("User should see that the entered  numbers  are not seen  in the lastname field on New Individual Customer page")
    public void userShouldSeeThatTheEnteredNumbersAreNotSeenInTheLastnameFieldOnNewIndividualCustomerPage() {
        Assert.assertFalse("Sunal25", Boolean.parseBoolean(generalInformationNewIndividualCustomerPage.lastNameFieldOnGeneralInformationForNewIndividualCustomer.getText()));
    }

    @And("User deletes the entered the lastname field on New Individual Customer page")
    public void userDeletesTheEnteredTheLastnameFieldOnNewIndividualCustomerPage() {
        generalInformationNewIndividualCustomerPage.lastNameFieldOnGeneralInformationForNewIndividualCustomer.clear();
    }

    @And("User wants to enter {string} as firstname with characters  into the firstname field on New Individual Customer page")
    public void userWantsToEnterAsFirstnameWithCharactersIntoTheFirstnameFieldOnNewIndividualCustomerPage(String characters) {
        sendKeys(generalInformationNewIndividualCustomerPage.firstNameFieldOnGeneralInformationForNewIndividualCustomer, characters);
    }

    @Then("User should see that background is red of the firstname picture on New Individual Customer page")
    public void userShouldSeeThatBackgroundIsRedOfTheFirstnamePictureOnNewIndividualCustomerPage() {
        warningBackgroundRedColor("#f44336", "color", generalInformationNewIndividualCustomerPage.firstNamePicture);
    }

    @And("User wants to enter {string} as surname with characters in to the lastname  field on New Individual Customer page")
    public void userWantsToEnterAsSurnameWithCharactersInToTheLastnameFieldOnNewIndividualCustomerPage(String lastname) {
        sendKeys(generalInformationNewIndividualCustomerPage.lastNameFieldOnGeneralInformationForNewIndividualCustomer, lastname);
    }

    @Then("User should see that background is red of the lastname picture on New Individual Customer page")
    public void userShouldSeeThatBackgroundIsRedOfTheLastnamePictureOnNewIndividualCustomerPage() {
        warningBackgroundRedColor("#f44336", "color", generalInformationNewIndividualCustomerPage.lastNamePicture);
    }

    @Given("User wants to enter {string} as firstname with one space at the beginning on New Individual Customer page")
    public void userWantsToEnterAsFirstnameWithOneSpaceAtTheBeginningOnNewIndividualCustomerPage(String firstname) {
        sendKeys(generalInformationNewIndividualCustomerPage.firstNameFieldOnGeneralInformationForNewIndividualCustomer, firstname + Keys.TAB);
    }

    @Then("User should see the left space at the beginning of firstname is eliminated on New Individual Customer page")
    public void userShouldSeeTheLeftSpaceAtTheBeginningOfFirstnameIsEliminatedOnNewIndividualCustomerPage() {
        assertEquals("ALI", getValueByJS("firstName"));
    }

    @And("User wants to enter{string} as lastname with one space at the beginning  on New Individual Customer page")
    public void userWantsToEnterAsLastnameWithOneSpaceAtTheBeginningOnNewIndividualCustomerPage(String lastname) {
        sendKeys(generalInformationNewIndividualCustomerPage.lastNameFieldOnGeneralInformationForNewIndividualCustomer, lastname + Keys.TAB);
    }

    @Then("User should see the left space at the beginning of  lastname is eliminated on New Individual Customer page")
    public void userShouldSeeTheLeftSpaceAtTheBeginningOfLastnameIsEliminatedOnNewIndividualCustomerPage() {
        assertEquals("SUNAL", getValueByJS("lastName"));

    }

    @Given("User wants to enter {string} as firstname into the firstname field on New Individual Customer page")
    public void userWantsToEnterAsFirstnameIntoTheFirstnameFieldOnNewIndividualCustomerPage(String firstname) {
        sendKeys(generalInformationNewIndividualCustomerPage.firstNameFieldOnGeneralInformationForNewIndividualCustomer, firstname + Keys.TAB);
    }

    @Then("User should not be allowed to write more than one spaced firstname nouns into the firstname field on New Individual Customer page")
    public void userShouldNotBeAllowedToWriteMoreThanOneSpacedFirstnameNounsIntoTheFirstnameFieldOnNewIndividualCustomerPage() {
        assertEquals("ALI KEMAL", getValueByJS("firstName"));
    }

    @Given("User wants to enter {string} as a lastname into the lastname field on New Individual Customer page")
    public void userWantsToEnterAsALastnameIntoTheLastnameFieldOnNewIndividualCustomerPage(String lastname) {
        sendKeys(generalInformationNewIndividualCustomerPage.lastNameFieldOnGeneralInformationForNewIndividualCustomer, lastname + Keys.TAB);
    }

    @Then("User should not be allowed to write more than one spaced lastname nouns into the lastname field on New Individual Customer page")
    public void userShouldNotBeAllowedToWriteMoreThanOneSpacedLastnameNounsIntoTheLastnameFieldOnNewIndividualCustomerPage() {
        assertEquals("KOMIK SUNAL", getValueByJS("lastName"));
    }

    @And("User enters {string} as middle name into the middle name field on New Individual Customer page")
    public void userEntersAsMiddleNameIntoTheMiddleNameFieldOnNewIndividualCustomerPage(String middleName) {
        sendKeys(generalInformationNewIndividualCustomerPage.middleNameFieldOnGeneralInformationForNewIndividualCustomer, middleName);
    }

    @Then("User should see that the entered  numbers  are not seen on middle name field on New Individual Customer page")
    public void userShouldSeeThatTheEnteredNumbersAreNotSeenOnMiddleNameFieldOnNewIndividualCustomerPage() {
        assertEquals("BILGE", getValueByJS("secondaryName"));
    }

    @And("User deletes the entered middle name as {string}  on New Individual Customer page")
    public void userDeletesTheEnteredMiddleNameAsOnNewIndividualCustomerPage(String middleName) {
        clearEnterText(generalInformationNewIndividualCustomerPage.middleNameFieldOnGeneralInformationForNewIndividualCustomer, middleName);
    }

    @And("User enters {string} as middle name into the middle name field with characters  on New Individual Customer page")
    public void userEntersAsMiddleNameIntoTheMiddleNameFieldWithCharactersOnNewIndividualCustomerPage(String middleName) {
        sendKeys(generalInformationNewIndividualCustomerPage.middleNameFieldOnGeneralInformationForNewIndividualCustomer, middleName);
    }

    @Then("User should see that background is red of middle name  picture on New Individual Customer page")
    public void userShouldSeeThatBackgroundIsRedOfMiddleNamePictureOnNewIndividualCustomerPage() {
        warningBackgroundRedColor("#f44336", "color", generalInformationNewIndividualCustomerPage.middleNamePicture);
    }

    @And("User deletes the entered middle name with characters {string}  on New Individual Customer page")
    public void userDeletesTheEnteredMiddleNameWithCharactersOnNewIndividualCustomerPage(String middlename) {
        generalInformationNewIndividualCustomerPage.middleNameFieldOnGeneralInformationForNewIndividualCustomer.clear();

    }

    @Given("User wants to enter {string} as middle name with one space at the beginning on New Individual Customer page")
    public void userWantsToEnterAsMiddleNameWithOneSpaceAtTheBeginningOnNewIndividualCustomerPage(String middleName) {
        sendKeys(generalInformationNewIndividualCustomerPage.middleNameFieldOnGeneralInformationForNewIndividualCustomer, middleName + Keys.TAB);
    }

    @Then("User should see the left space at the beginning of middle name is eliminated on New Individual Customer page")
    public void userShouldSeeTheLeftSpaceAtTheBeginningOfMiddleNameIsEliminatedOnNewIndividualCustomerPage() {
        assertEquals("BILGE", getValueByJS("secondaryName"));
    }

    @Given("User clicks email field on New Individual Customer page")
    public void userClicksEmailFieldOnNewIndividualCustomerPage() {
        clickField(generalInformationNewIndividualCustomerPage.emailFieldOnIndividual);
    }

    @And("User enters {string} on New Individual Customer page")
    public void userEntersOnNewIndividualCustomerPage(String invalidEmail) {
        generalInformationNewIndividualCustomerPage.enterInvalidFormatEmailsOnIndividual(invalidEmail);
    }

    @And("User should see that background is red on email field on New Individual Customer page")
    public void userShouldSeeThatBackgroundIsRedOnEmailFieldOnNewIndividualCustomerPage() {
        //warningBackgroundRedColor("#f44336", "color", generalInformationNewIndividualCustomerPage.emailFieldPicture);
        warningBackgroundRedColorOne(generalInformationNewIndividualCustomerPage.emailFieldPicture,true);
    }

    @Given("User enters valid {string} in to the email field on New Individual Customer page")
    public void userEntersValidInToTheEmailFieldOnNewIndividualCustomerPage(String validEmail) {
        enterValidFormatEmail(validEmail, generalInformationNewIndividualCustomerPage.emailFieldOnIndividual);
    }

    @Then("User should see {string} and {string} and {string} inside of email structure on New Individual Customer page")
    public void userShouldSeeAndAndInsideOfEmailStructureOnNewIndividualCustomerPage(String dotSign, String tagSign, String email) {
        verifyValidFormatEmail(dotSign, tagSign, email);
    }

    @Given("User Male option from gender on New Individual Customer page")
    public void userMaleOptionFromGenderOnNewIndividualCustomerPage() {
        generalInformationNewIndividualCustomerPage.selectMaleOptionFromGenderDropdownOnIndividual();
    }

    @And("User selects of invalid birth date as {string} on New Individual Customer page")
    public void userSelectsOfInvalidBirthDateAsOnNewIndividualCustomerPage(String invalidDate) {
        generalInformationNewIndividualCustomerPage.selectDateOfBirthOnIndividual(invalidDate);
    }

    @And("User should see that background is red on birth date on New Individual Customer page")
    public void userShouldSeeThatBackgroundIsRedOnBirthDateOnNewIndividualCustomerPage() {
        warningBackgroundRedColorOne(generalInformationNewIndividualCustomerPage.birthDateFieldPicture,true);
    }

    @And("User deletes the already entered invalid date of birth on New Individual Customer page")
    public void userDeletesTheAlreadyEnteredInvalidDateOfBirthOnNewIndividualCustomerPage() {
        generalInformationNewIndividualCustomerPage.cancelButtonOnDateOfBirthFieldOnIndividual.click();
    }

    @And("User selects of valid birth date as {string} on New Individual Customer page")
    public void userSelectsOfValidBirthDateAsOnNewIndividualCustomerPage(String validDate) {
        generalInformationNewIndividualCustomerPage.selectDateOfBirthOnIndividual(validDate);
    }

    @And("User selects the country as Albania as country of birth on New Individual Customer page")
    public void userSelectsTheCountryAsAlbaniaAsCountryOfBirthOnNewIndividualCustomerPage() {
        generalInformationNewIndividualCustomerPage.selectAlbaniaFromDropdownOnIndividual();
    }

    @And("User selects Berat as place of birth on New Individual Customer page")
    public void userSelectsBeratAsPlaceOfBirthOnNewIndividualCustomerPage() {
        generalInformationNewIndividualCustomerPage.selectPlaceOfBirthFromDropdownOnIndividual();
    }

    @And("User adds {string} the Mobile Phone Number into the Mobile Phone Number on New Individual Customer page")
    public void userAddsTheMobilePhoneNumberIntoTheMobilePhoneNumberOnNewIndividualCustomerPage(String mobilePhoneNumber) {
        sendKeys(generalInformationNewIndividualCustomerPage.mobilePhoneNumberField,mobilePhoneNumber);
    }

    @Given("User clicks Communication Method dropdown on New Individual Customer page")
    public void userClicksCommunicationMethodDropdownOnNewIndividualCustomerPage() {
        clickField(generalInformationNewIndividualCustomerPage.communicationMethodDropDown);
    }

    @And("User should ensure each options in Communication Method dropdown ara selectable on New Individual Customer page")
    public void userShouldEnsureEachOptionsInCommunicationMethodDropdownAraSelectableOnNewIndividualCustomerPage() {
        generalInformationNewIndividualCustomerPage.communicationMethodDropdownSelectableOnIndividual();
    }

    @Then("User should selects SMS option in the Communication Method dropdown on New Individual Customer page")
    public void userShouldSelectsSMSOptionInTheCommunicationMethodDropdownOnNewIndividualCustomerPage() {
        generalInformationNewIndividualCustomerPage.communicationMethodOptionFromDropdownOnIndividual();
    }

    @And("User clicks next Button in General Information on New Individual Customer page")
    public void userClicksNextButtonInGeneralInformationOnNewIndividualCustomerPage() {
        Utils.click(generalInformationNewIndividualCustomerPage.nextButtonOnGeneralInformation);
    }

    @Given("User clicks Segment dropdown on New Individual Customer page")
    public void userClicksSegmentDropdownOnNewIndividualCustomerPage() {
        clickField(generalInformationNewIndividualCustomerPage.segmentDropdownBoxOnIndividual);
    }

    @And("User should ensure each options in Segment dropdown are selectable on New Individual Customer page")
    public void userShouldEnsureEachOptionsInSegmentDropdownAreSelectableOnNewIndividualCustomerPage() {
        generalInformationNewIndividualCustomerPage.segmentDropdownSelectableOnIndividual();
    }

    @Then("User should selects any options in the Segment dropdown on New Individual Customer page")
    public void userShouldSelectsAnyOptionsInTheSegmentDropdownOnNewIndividualCustomerPage() {
        generalInformationNewIndividualCustomerPage.segmentOptionFromDropdownOnIndividual();
    }

    @Then("User is on the Individual Genaral Information page")
    public void userIsOnTheIndividualGenaralInformationPage() {
        generalInformationNewIndividualCustomerPage.verifyUserIsOnGeneralInformationPage();
    }
}