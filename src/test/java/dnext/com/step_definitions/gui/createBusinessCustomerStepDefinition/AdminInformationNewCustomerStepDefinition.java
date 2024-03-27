package dnext.com.step_definitions.gui.createBusinessCustomerStepDefinition;

import dnext.com.pages.BasePage;
import dnext.com.pages.createBusinnesCustomerPages.AdminInformationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;

@AllArgsConstructor
@Log4j2
public class AdminInformationNewCustomerStepDefinition extends BasePage {
    AdminInformationPage adminInformationPage;

    @Given("User  clicks the First Name field and enters the  first name as {string} into the First Name field on Admin Information Page")
    public void user_clicks_the_first_name_field_and_enters_the_first_name_as_into_the_first_name_field_on_admin_information_page(String firstName) {
        sendKeys(adminInformationPage.firstName, firstName);
    }

    @And("User  clicks the Last Name field and enters the  first name as {string} into the First Name field on Admin Information Page")
    public void userClicksTheLastNameFieldAndEntersTheFirstNameAsIntoTheFirstNameFieldOnAdminInformationPage(String lastName) {
        sendKeys(adminInformationPage.lastName, lastName);
    }

    @Then("User cannot see the red warning background colour after entering the the name into the name field on Admin Information Page")
    public void userCannotSeeTheRedWarningBackgroundColourAfterEnteringTheTheNameIntoTheNameFieldOnAdminInformationPage() {
        adminInformationPage.warningBackgroundIsNotRedColor();
    }

    @Given("User clicks email field on  Admin Information Page")
    public void userClicksEmailFieldOnAdminInformationPage() {
        clickField(adminInformationPage.emailField);
    }

    @And("User enters {string} on on Admin Information Page")
    public void userEntersOnOnAdminInformationPage(String invalidEmail) {
        adminInformationPage.enterInvalidFormatEmails(invalidEmail);
    }

    @And("User should see that background is red on on Admin Information Page")
    public void userShouldSeeThatBackgroundIsRedOnOnAdminInformationPage() {
        adminInformationPage.warningBackgroundRedColor();
    }

    @Given("User enters valid {string} in to the email field on  Admin Information Page")
    public void userEntersValidInToTheEmailFieldOnAdminInformationPage(String validEmail) {
        enterValidFormatEmail(validEmail, adminInformationPage.emailField);
    }

    @Then("User should see {string} and {string} and {string} inside of email structure on Admin Information Page")
    public void userShouldSeeAndAndInsideOfEmailStructureOnAdminInformationPage(String dotSign, String tagSign, String email) {
        adminInformationPage.verifyValidFormatEmail(dotSign, tagSign, email);
    }

    @Given("User Male option from gender on Admin Information Page")
    public void userMaleOptionFromGenderOnAdminInformationPage() {
        adminInformationPage.selectMaleOptionFromGenderDropdown();
    }

    @And("User selects of invalid birth date as {string} on Admin Information Page")
    public void userSelectsOfBirthDateAsOnAdminInformationPage(String invalidDate) {
        adminInformationPage.selectDateOfBirth(invalidDate);

    }

    @And("User selects the country as Albania as country of birth on Admin Information Page")
    public void userSelectsTheCountryAsAlbaniaAsCountryOfBirthOnAdminInformationPage() {
        adminInformationPage.selectAlbaniaFromDropdown();
    }

    @And("User selects Berat as place of birth on Admin Information Page")
    public void userSelectsBeratAsPlaceOfBirthOnAdminInformationPage() {
        adminInformationPage.selectPlaceOfBirthFromDropdown();
    }

    @And("User fills {string} the work number into the work phone number on Admin Information Page")
    public void userFillsTheWorkNumberIntoTheWorkPhoneNumberOnAdminInformationPage(String workPhoneNumber) {
        sendKeys(adminInformationPage.workPhoneNumberField, workPhoneNumber);
    }

    @When("User enters one non existing valid {string} ID number into the Identification Number field on Admin Information page")
    public void userEntersOneNonExistingValidIDNumberIntoTheIdentificationNumberFieldOnAdminInformationPage(String nonExistenceNiptNumber) {
        sendKeys(adminInformationPage.identificationNumberField, nonExistenceNiptNumber);
    }

    @Then("User sees the search icon turns into the cancel icon")
    public void user_sees_the_search_icon_turns_into_the_cancel_icon() {
        elementDisplayed(adminInformationPage.cancelIconInIdentificationField);
    }

    @And("User adds {string} the Mobile Phone  Number into the Mobile Phone Number on Admin Information Page")
    public void userAddsTheMobilePhoneNumberIntoTheMobilePhoneNumberOnAdminInformationPage(String mobilePhoneNumber) {
        sendKeys(adminInformationPage.mobilePhoneNumberField,mobilePhoneNumber);
    }

    @And("User selects of valid birth date as {string} on Admin Information Page")
    public void userSelectsOfValidBirthDateAsOnAdminInformationPage(String validDate) {
        adminInformationPage.selectDateOfBirth(validDate);
    }

    @And("User deletes the already entered invalid date of birth on Admin Information Page")
    public void userDeletesTheAlreadyEnteredInvalidDateOfBirthOnAdminInformationPage() {
        adminInformationPage.cancelButtonOnDateOfbirthField.click();
    }

    @And("User clicks the search icon in Identification Number field after Organization Search on Admin Information page")
    public void userClicksTheSearchIconInIdentificationNumberFieldAfterOrganizationSearchOnAdminInformationPage() {
        clickField(adminInformationPage.searchIconInIdentificationFieldAfterOrganizationSearch);
    }
}