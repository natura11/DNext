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

    @And("User enters {string} as middle name into the middle name field   on New Individual Customer page")
    public void userEntersAsMiddleNameIntoTheMiddleNameFieldOnNewIndividualCustomerPage(String middleName) {
        sendKeys(generalInformationNewIndividualCustomerPage.middleNameFieldOnGeneralInformationForNewIndividualCustomer,middleName);
    }

    @Then("User should see that the entered  numbers  are not seen on middle name field on New Individual Customer page")
    public void userShouldSeeThatTheEnteredNumbersAreNotSeenOnMiddleNameFieldOnNewIndividualCustomerPage() {
        assertEquals("BILGE", getValueByJS("secondaryName"));
    }
    @And("User deletes the entered middle name as {string}  on New Individual Customer page")
    public void userDeletesTheEnteredMiddleNameAsOnNewIndividualCustomerPage(String middleName) {
        clearEnterText(generalInformationNewIndividualCustomerPage.middleNameFieldOnGeneralInformationForNewIndividualCustomer,middleName);
    }

    @And("User enters {string} as middle name into the middle name field with characters  on New Individual Customer page")
    public void userEntersAsMiddleNameIntoTheMiddleNameFieldWithCharactersOnNewIndividualCustomerPage(String middleName) {
        sendKeys(generalInformationNewIndividualCustomerPage.middleNameFieldOnGeneralInformationForNewIndividualCustomer,middleName);
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
        sendKeys(generalInformationNewIndividualCustomerPage.middleNameFieldOnGeneralInformationForNewIndividualCustomer,middleName+Keys.TAB);
    }

    @Then("User should see the left space at the beginning of middle name is eliminated on New Individual Customer page")
    public void userShouldSeeTheLeftSpaceAtTheBeginningOfMiddleNameIsEliminatedOnNewIndividualCustomerPage() {
        assertEquals("BILGE", getValueByJS("secondaryName"));
    }



}
