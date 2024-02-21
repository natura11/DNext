package dnext.com.step_definitions.gui.createBusinessCustomerStepDefinition;

import com.utilities.Driver;
import com.utilities.Utils;
import dnext.com.pages.BasePage;
import dnext.com.pages.createBusinnesCustomerPages.GeneralInformationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import lombok.AllArgsConstructor;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;

@AllArgsConstructor
public class GeneralInformationStepDefinition extends BasePage {
    GeneralInformationPage generalInformationPage;

    @Given("User should see the Name box on the general information page on general information page")
    public void user_should_see_the_box_on_the_general_information_page() {
        generalInformationPage.verificationOfNameBox();
    }

    @Given("User clicks Name Field on general information page")
    public void user_clicks_name_field() {
        clickField(generalInformationPage.nameBox);

    }

    @Then("User enters a value {string} consisting of letters and special characters in the name box on general information page")
    public void user_enters_a_value_consisting_of_letters_and_special_characters_in_the_name_box(String validFormatName) {
        generalInformationPage.usingValidFormatName(validFormatName);
    }

    @Given("User clicks Industry dropdown on general information page")
    public void user_clicks_ındustry_dropdown() {
        clickField(generalInformationPage.industryDropdown);
    }

    @Given("User should ensure each options in industry dropdown are selectable on general information page")
    public void user_should_ensure_each_options_in_industry_dropdown_ara_selectable() {
        generalInformationPage.industryDropdownSelectable();
    }

    @Then("User should selects any option in the Industry dropdown on general information page")
    public void userShouldSelectsAnyOptionInTheIndustryDropdown() {
        generalInformationPage.optionFromIndustryDropdown();
    }

    @Given("User clicks Segment dropdown on general information page")
    public void userClicksSegmentDropdown() {
        clickField(generalInformationPage.segmentDropdownBox);
    }

    @And("User should ensure each options in Segment dropdown are selectable on general information page")
    public void userShouldEnsureEachOptionsInSegmentDropdownAreSelectable() {
        generalInformationPage.segmentDropdownSelectable();
    }

    @Then("User should selects any options in the Segment dropdown on general information page")
    public void userShouldSelectsAnyOptionsInTheSegmentDropdown() {
        generalInformationPage.segmentOptionFromDropdown();
    }

    @Given("User clicks Tax Exempt dropdown on general information page")
    public void userClicksTaxExemptDropdown() {
        clickField(generalInformationPage.taxExemptDropdownBox);

    }

    @And("User should ensure each options in Tax Exempt dropdown are selectable on general information page")
    public void userShouldEnsureEachOptionsInTaxExemptDropdownAreSelectable() {
        generalInformationPage.taxExemptDropdownSelectable();
    }

    @Then("User should selects any option in the Tax Exempt dropdown on general information page")
    public void userShouldSelectsAnyOptionInTheTaxExemptDropdown() {
        generalInformationPage.taxExemptOptionFromDropdown();
    }

    @Given("User clicks email field on general information page")
    public void user_clicks_email_field() {
        clickField(generalInformationPage.emailBtnOnGeneralInformationPage);
    }

    @Given("User should see that background is red on general information page")
    public void user_should_see_that_background_is_red() {
        generalInformationPage.warningBackgroundRedColor();
    }

    @And("User enters {string} on general information page")
    public void userEnters(String invalidEmail) {
        generalInformationPage.enterInvalidFormatEmails(invalidEmail);
    }

    @Given("User enters valid {string} in to the email field on general information page")
    public void userEntersValidInToTheEmailField(String email) {
        generalInformationPage.enterValidFormatEmail(email);
    }

    @Then("User should see {string} and {string} and {string} inside of email structure on general information page")
    public void userShouldSeeAndAndInsideOfEmailStructure(String dotSign, String tagSign, String email) {
        generalInformationPage.verifyValidFormatEmail(dotSign, tagSign, email);
    }

    @Given("User clicks Communication Method dropdown on general information page")
    public void userClicksCommunicationMethodDropdown() {
        clickField(generalInformationPage.communicationMethodDropDown);
    }

    @And("User should ensure each options in Communication Method dropdown ara selectable on general information page")
    public void userShouldEnsureEachOptionsInCommunicationMethodDropdownAraSelectable() {
        generalInformationPage.communicationMethodDropdownSelectable();
    }

    @Then("User should selects SMS option in the Tax Exempt dropdown on general information page")
    public void userShouldSelectsSMSOptionInTheTaxExemptDropdown() {
        generalInformationPage.communicationMethodOptionFromDropdown();
    }

    @Given("User clicks Country Code dropdown on general information page")
    public void user_clicks_country_code_dropdown() {
        clickField(generalInformationPage.countryCodeDropdownBox);
    }

    @Then("User should selects +355 option from country code dropdown on general information page")
    public void userShouldSelectsOptionFromCountryCodeDropdown() {
        clickField(generalInformationPage.albanianCountryCode);

    }

    @Then("User clicks mobile phone numbers field on general information page")
    public void user_clicks_mobile_phone_numbers_field() {
        clickField(generalInformationPage.mobilePhoneNumberBox);
    }

    @And("User enters invalid {string} phone numbers and should see {string} under mobile phone number field on general information page")
    public void userEntersInvalidPhoneNumbersAndShouldSeeUnderMobilePhoneNumberField(String invalidMobile, String warningMessage) {
        generalInformationPage.verifyEnterInvalidFormatMobilePhoneNumber(invalidMobile, warningMessage);

    }

    @Then("User should selects +213 option from country code dropdown except Albania and clicks mobile phone numbers field on general information page")
    public void userShouldSelectsOptionFromCountryCodeDropdownExceptAlbaniaAndClicksMobilePhoneNumbersField() {
        generalInformationPage.enteringOtherNumbers();
    }

    @And("User enters no number into the mobile phone number field and should see {string} warning message on phone field on general information page")
    public void userEntersNoNumberIntoTheMobilePhoneNumberFieldAndShouldSeeWarningMessageOnPhoneField(String message) {
        generalInformationPage.verifyEnteringOtherNumbers(message);
    }

    @And("User enters mobile phone number {string} with other country code except Albania on general information page")
    public void userEntersMobilePhoneNumberWithOtherCountryCodeExceptAlbania(String arg0) {
        generalInformationPage.inputOtherMobilePhoneNumberExceptAlbanian();
    }

    @Given("User clicks Issuing Date field and user selects {string} from calendar on general information page")
    public void userClicksIssuingDateFieldAndUserSelectsFromCalendarOnGeneralInformationPage(String date) {
        generalInformationPage.verifyDateFromCalendarOnGeneralInfo(date);
    }

    @Given("User should see this {string} warning message near to add button on general information page")
    public void userShouldSeeThisWarningMessageNearToAddButtonOnGeneralInformationPage(String warningMessage) {
        warningMessage(warningMessage, generalInformationPage.warningOfAddExtractQKRdocumentMessage);
    }

    @And("User adds a {string} of which format is image on general information page")
    public void userAddsAOfWhichFormatIsImageOnGeneralInformationPage(String file) {
        uploadFile(generalInformationPage.addDocumentButtonOnNewBusinessCustomer, generalInformationPage.fileInputGeneral, file);
    }

    @And("User should see the name of {string} added jpg document on the screen on general information page")
    public void userShouldSeeTheNameOfAddedJpgDocumentOnTheScreenOnGeneralInformationPage(String fileName) {
        Assert.assertEquals("DOCUMENT-" + fileName, generalInformationPage.nameOfUploadedFileOnGeneral.getText());
    }

    @And("User deletes added image document on general information page")
    public void userDeletesAddedImageDocumentOnGeneralInformationPage() {
        clickField( generalInformationPage.deleteDocumentButton);
    }

    @And("User adds a {string} of which format is pdf with bigger five MB should see the {string} warning messageon general information page")
    public void userAddsAOfWhichFormatIsPdfWithBiggerFiveMBShouldSeeTheWarningMessageonGeneralInformationPage(String fileNameOfPdf, String warningMessage) {
        generalInformationPage.verifyTheUploadedBigger5MbSizeFile(fileNameOfPdf, warningMessage);

    }

    @And("User adds a document of which format is {string} on general information page")
    public void userAddsADocumentOfWhichFormatIsOnGeneralInformationPage(String excelFormat) {
        uploadFile(generalInformationPage.addDocumentButtonOnNewBusinessCustomer, generalInformationPage.fileInputGeneral, excelFormat);
    }

    @Then("User should see {string} warning message on top of  the screen for unmatched format on general information page")
    public void userShouldSeeWarningMessageOnTopOfTheScreenForUnmatchedFormatOnGeneralInformationPage(String warningMessage) {
        warningMessage(warningMessage, generalInformationPage.warningMessageForUnmatchedDocument);
    }


    @And("User adds a valid {string} document  on general information page")
    public void userAddsAValidDocumentOnGeneralInformationPage(String fileValidPdf) {
        uploadFile(generalInformationPage.addDocumentButtonOnNewBusinessCustomer, generalInformationPage.fileInputGeneral, fileValidPdf);
    }

    @And("User should see the name of {string} added pdf document on the screen on general information page")
    public void userShouldSeeTheNameOfAddedPdfDocumentOnTheScreenOnGeneralInformationPage(String fileNameOfPdf) {
        Assert.assertEquals("DOCUMENT-" + fileNameOfPdf, generalInformationPage.nameOfUploadedFileOnGeneral.getText());
    }
}