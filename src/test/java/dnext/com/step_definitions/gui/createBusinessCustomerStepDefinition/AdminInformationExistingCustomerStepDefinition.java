package dnext.com.step_definitions.gui.createBusinessCustomerStepDefinition;

import com.utilities.Utils;
import dnext.com.pages.BasePage;
import dnext.com.pages.createBusinnesCustomerPages.AdminInformationPage;
import dnext.com.pages.createBusinnesCustomerPages.SearchOrganizationPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.checkerframework.checker.units.qual.K;

import java.awt.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@Log4j2
public class AdminInformationExistingCustomerStepDefinition extends BasePage {
    AdminInformationPage adminInformationPage;
    SearchOrganizationPage searchOrganizationPage;


    @Given("User clicks the Admin Information button")
    public void userClicksTheAdminInformationButton() {
        adminInformationPage.clickAdminInformationIcon();
    }

    @Given("User is on the Admin Information  page")
    public void user_is_on_the_page() {
        adminInformationPage.verifyUserIsOnAdminInformationPage();
    }

    @And("User clicks on the Identification Number field on Admin Information Page")
    public void userClicksOnTheIdentificationNumberField() {
        adminInformationPage.clickIdentificationNumberField();
    }


    @When("User enters one existing {string} ID number into the Identification Number field on Admin Information page")
    public void user_enters_one_existing_id_number_into_the_identification_number_field_on_admin_information_page(String existingNumber) {
        adminInformationPage.inputExistingNumberToIdentificationNumberField(existingNumber);
    }

    @Then("User should see {string} warning under the Identification Number field on Admin Information Page")
    public void user_should_see_warning_under_the_identification_number_field(String warningMessage) {
        adminInformationPage.warningMessageForSearchIcon(warningMessage);
    }

    @Then("User clicks the search icon in Identification Number field on Admin Information page")
    public void user_clicks_the_search_icon_in_identification_number_field_on_admin_information_page() {
        adminInformationPage.clickSearchIconInIdentificationField();
    }

    @Given("User sees some ID related information were fetched on Admin Information Page")
    public void user_sees_some_id_related_information_were_fetched(Map<String, String> table) {
        adminInformationPage.verifyOfExistenceNumberInformation(table);

    }

    @Then("User should see the {string}warning message  under number field on Admin Information Page")
    public void userShouldSeeTheWarningMessageUnderNumberField(String warningMsg) {
        warningMessage(warningMsg, adminInformationPage.warningOfMobilePhoneNumber);
        Utils.waitFor(5);

    }

    @Given("User should see this {string} warning message near to add button on Admin Information Page")
    public void userShouldSeeThisWarningMessageNearToAddButtonOnAdminInformationPage(String warningMsg) {
        warningMessage(warningMsg, adminInformationPage.warningOfDocCustomerIdDocument);
    }

    @And("User tries to add {string} of which format is out of image or pdf that connat be uploded on Admin Information Page")
    public void userTriesToAddOfWhichFormatIsOutOfImageOrPdfThatConnatBeUplodedOnAdminInformationPage(String fileName) {
        adminInformationPage.verifyUploadingFilesWithDifferentFormats(fileName);
    }

    @And("User adds {string}  which are image or pdf  which is bigger than five MB and should see {string} warning on Admin Information Page")
    public void userAddsWhichAreImageOrPdfWhichIsBiggerThanFiveMBAndShouldSeeWarningOnAdminInformationPage(String fileName, String warning) {
        adminInformationPage.verifyTheUploadedBigger5MbSizeFile(fileName, warning);

    }

    @And("User add {string} and should see the name of {string} on the screen on Admin Information Page")
    public void userAddAndShouldSeeTheNameOfOnTheScreenOnAdminInformationPage(String fileName) {
        adminInformationPage.verifyUploadingFilesWithDifferentFormats(fileName);
    }

    @And("User add {string} and should see the name of file  on the screen on Admin Information Page")
    public void userAddAndShouldSeeTheNameOfFileOnTheScreenOnAdminInformationPage(String file) {
        adminInformationPage.verifyUploadingFilesWithDifferentFormats(file);
    }

    @And("User deletes already added valid prf documentation Admin Information Page")
    public void userDeletesAlreadyAddedValidPrfDocumentationAdminInformationPage() {
        adminInformationPage.cancelButton.click();

    }

    @And("User add the {string} and should see the name of file on the screen on Admin Information Page")
    public void userAddTheAndShouldSeeTheNameOfFileOnTheScreenOnAdminInformationPage(String fileName) {
        adminInformationPage.verifyUploadingFilesWithDifferentFormats(fileName);
    }

    @And("User enters {string} on email field  and {string} to the phone number field")
    public void userEntersOnEmailFieldAndTothePhoneNumberField(String email, String number) {
        adminInformationPage.inputEmailAndMobilePhoneNumberOnAdminInfoPage(email, number);
    }

    @And("User clicks next Button on Admin Information Page")
    public void userClicksNextButtonOnAdminInformationPage() {
        clickField(adminInformationPage.nextButtonOnAdminInfoPage);
    }

    @Then("User should be on the Contact Information Page")
    public void userShouldBeOnTheContactInformationPage() {
    adminInformationPage.verifyContactInfoPageIsOpened();
    }
}