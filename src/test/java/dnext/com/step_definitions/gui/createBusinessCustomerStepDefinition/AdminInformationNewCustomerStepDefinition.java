package dnext.com.step_definitions.gui.createBusinessCustomerStepDefinition;

import com.utilities.Utils;
import dnext.com.pages.BasePage;
import dnext.com.pages.createBusinessCustomerPages.AdminInformationBusinessPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.Keys;

@AllArgsConstructor
@Log4j2
public class AdminInformationNewCustomerStepDefinition extends BasePage {
    AdminInformationBusinessPage adminInformationBusinessPage;

    @Given("User  clicks the First Name field and enters the  first name as {string} into the First Name field on Admin Information Page")
    public void user_clicks_the_first_name_field_and_enters_the_first_name_as_into_the_first_name_field_on_admin_information_page(String firstName) {
        sendKeys(adminInformationBusinessPage.firstName, firstName);
    }

    @And("User  clicks the Last Name field and enters the  first name as {string} into the First Name field on Admin Information Page")
    public void userClicksTheLastNameFieldAndEntersTheFirstNameAsIntoTheFirstNameFieldOnAdminInformationPage(String lastName) {
        sendKeys(adminInformationBusinessPage.lastName, lastName);
    }

    @Then("User cannot see the red warning background colour after entering the the name into the name field on Admin Information Page")
    public void userCannotSeeTheRedWarningBackgroundColourAfterEnteringTheTheNameIntoTheNameFieldOnAdminInformationPage() {
        warningBackgroundRedColorOne(adminInformationBusinessPage.firstNamePictureBtnOnAdminInformationPage, false);
    }

    @Given("User clicks email field on  Admin Information Page")
    public void userClicksEmailFieldOnAdminInformationPage() {
        clickField(adminInformationBusinessPage.emailField);
    }

    @And("User enters {string} on on Admin Information Page")
    public void userEntersOnOnAdminInformationPage(String invalidEmail) {
        fillInputWithTab(adminInformationBusinessPage.emailField, invalidEmail);
    }

    @And("User should see that background is red on on Admin Information Page")
    public void userShouldSeeThatBackgroundIsRedOnOnAdminInformationPage() {
        warningBackgroundRedColorOne(adminInformationBusinessPage.emailPictureBtnAdminInformationPage, true);
    }

    @Given("User enters valid {string} in to the email field on  Admin Information Page")
    public void userEntersValidInToTheEmailFieldOnAdminInformationPage(String validEmail) {
        enterValidFormatEmail(validEmail, adminInformationBusinessPage.emailField);
    }

    @Then("User should see {string} and {string} and {string} inside of email structure on Admin Information Page")
    public void userShouldSeeAndAndInsideOfEmailStructureOnAdminInformationPage(String dotSign, String tagSign, String email) {
        verifyValidFormatEmail(dotSign, tagSign, email);
    }

    @Given("User Male option from gender on Admin Information Page")
    public void userMaleOptionFromGenderOnAdminInformationPage() {
        adminInformationBusinessPage.selectMaleOptionFromGenderDropdown();
    }

    @And("User selects of invalid birth date as {string} on Admin Information Page")
    public void userSelectsOfBirthDateAsOnAdminInformationPage(String invalidDate) {
        adminInformationBusinessPage.selectDateOfBirth(invalidDate);
    }

    @And("User selects the country as Albania as country of birth on Admin Information Page")
    public void userSelectsTheCountryAsAlbaniaAsCountryOfBirthOnAdminInformationPage() {
        adminInformationBusinessPage.selectAlbaniaFromDropdown();
    }

    @And("User selects Berat as place of birth on Admin Information Page")
    public void userSelectsBeratAsPlaceOfBirthOnAdminInformationPage() {
        adminInformationBusinessPage.selectPlaceOfBirthFromDropdown();
    }

    @And("User fills {string} the work number into the work phone number on Admin Information Page")
    public void userFillsTheWorkNumberIntoTheWorkPhoneNumberOnAdminInformationPage(String workPhoneNumber) {
        sendKeys(adminInformationBusinessPage.workPhoneNumberField, workPhoneNumber);
    }

    @When("User enters one non existing valid {string} ID number into the Identification Number field on Admin Information page")
    public void userEntersOneNonExistingValidIDNumberIntoTheIdentificationNumberFieldOnAdminInformationPage(String nonExistenceNiptNumber) {
        sendKeys(adminInformationBusinessPage.identificationNumberField, nonExistenceNiptNumber);
    }

    @Then("User sees the search icon turns into the cancel icon")
    public void user_sees_the_search_icon_turns_into_the_cancel_icon() {
        elementDisplayed(adminInformationBusinessPage.cancelIconInIdentificationFieldAfterOrganizationSearch);
    }

    @And("User adds {string} the Mobile Phone  Number into the Mobile Phone Number on Admin Information Page")
    public void userAddsTheMobilePhoneNumberIntoTheMobilePhoneNumberOnAdminInformationPage(String mobilePhoneNumber) {
        sendKeys(adminInformationBusinessPage.mobilePhoneNumberField, mobilePhoneNumber);
    }

    @And("User selects of valid birth date as {string} on Admin Information Page")
    public void userSelectsOfValidBirthDateAsOnAdminInformationPage(String validDate) {
        adminInformationBusinessPage.selectDateOfBirth(validDate);
    }

    @And("User deletes the already entered invalid date of birth on Admin Information Page")
    public void userDeletesTheAlreadyEnteredInvalidDateOfBirthOnAdminInformationPage() {
        adminInformationBusinessPage.cancelButtonOnDateOfbirthField.click();
    }

}