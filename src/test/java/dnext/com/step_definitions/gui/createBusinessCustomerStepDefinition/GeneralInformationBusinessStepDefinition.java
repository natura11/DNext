package dnext.com.step_definitions.gui.createBusinessCustomerStepDefinition;
import dnext.com.pages.BasePage;
import dnext.com.pages.createBusinessCustomerPages.GeneralInformationBusinessPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import lombok.AllArgsConstructor;
import org.junit.Assert;

@AllArgsConstructor
public class GeneralInformationBusinessStepDefinition extends BasePage {
    GeneralInformationBusinessPage generalInformationBusinessPage;

    @And("User clicks the Next button on general information page")
    public void userClicksTheNextButtonOnGeneralInformationPage() {
        generalInformationBusinessPage.nextBtnClickGeneralInformation();
    }

    @Given("User should see the Name box on the general information page on general information page")
    public void user_should_see_the_box_on_the_general_information_page() {
        generalInformationBusinessPage.verificationOfNameBox();
    }

    @Given("User clicks Name Field on general information page")
    public void user_clicks_name_field() {
        clickField(generalInformationBusinessPage.nameBox);

    }

    @Then("User enters a value {string} consisting of letters and special characters in the name box on general information page")
    public void user_enters_a_value_consisting_of_letters_and_special_characters_in_the_name_box(String validFormatName) {
        generalInformationBusinessPage.usingValidFormatName(validFormatName);
    }

    @Given("User clicks Industry dropdown on general information page")
    public void user_clicks_ındustry_dropdown() {
        clickField(generalInformationBusinessPage.industryDropdown);
    }

    @Given("User should ensure each options in industry dropdown are selectable on general information page")
    public void user_should_ensure_each_options_in_industry_dropdown_ara_selectable() {
        generalInformationBusinessPage.industryDropdownSelectable();
    }

    @Then("User should selects any option in the Industry dropdown on general information page")
    public void userShouldSelectsAnyOptionInTheIndustryDropdown() {
        generalInformationBusinessPage.optionFromIndustryDropdown();
    }

    @Given("User clicks Segment dropdown on general information page")
    public void userClicksSegmentDropdown() {
        clickField(generalInformationBusinessPage.segmentDropdownBox);
    }

    @And("User should ensure each options in Segment dropdown are selectable on general information page")
    public void userShouldEnsureEachOptionsInSegmentDropdownAreSelectable() {
        generalInformationBusinessPage.segmentDropdownSelectable();
    }

    @Then("User should selects any options in the Segment dropdown on general information page")
    public void userShouldSelectsAnyOptionsInTheSegmentDropdown() {
        generalInformationBusinessPage.segmentOptionFromDropdown();
    }

    @Given("User clicks Tax Exempt dropdown on general information page")
    public void userClicksTaxExemptDropdown() {
        clickField(generalInformationBusinessPage.taxExemptDropdownBox);

    }

    @And("User should ensure each options in Tax Exempt dropdown are selectable on general information page")
    public void userShouldEnsureEachOptionsInTaxExemptDropdownAreSelectable() {
        generalInformationBusinessPage.taxExemptDropdownSelectable();
    }

    @Then("User should selects any option in the Tax Exempt dropdown on general information page")
    public void userShouldSelectsAnyOptionInTheTaxExemptDropdown() {
        generalInformationBusinessPage.taxExemptOptionFromDropdown();
    }

    @Given("User clicks email field on general information page")
    public void user_clicks_email_field() {
        clickField(generalInformationBusinessPage.emailBtnOnGeneralInformationPage);
    }

    @Given("User should see that background is red")
    public void user_should_see_that_background_is_red() {
        generalInformationBusinessPage.warningBackgroundRedColor();
    }

    @And("User enters {string} on general information page")
    public void userEnters(String invalidEmail) {

        generalInformationBusinessPage.enterInvalidFormatEmails(invalidEmail);
    }

    @Given("User enters valid {string} in to the email field on general information page")
    public void userEntersValidInToTheEmailField(String email) {
        generalInformationBusinessPage.enterValidFormatEmail(email);
    }

    @Then("User should see {string} and {string} and {string} inside of email structure on general information page")
    public void userShouldSeeAndAndInsideOfEmailStructure(String dotSign, String tagSign, String email) {
        generalInformationBusinessPage.verifyValidFormatEmail(dotSign, tagSign, email);
    }

    @Given("User clicks Communication Method dropdown on general information page")
    public void userClicksCommunicationMethodDropdown() {
        clickField(generalInformationBusinessPage.communicationMethodDropDown);
    }

    @And("User should ensure each options in Communication Method dropdown ara selectable on general information page")
    public void userShouldEnsureEachOptionsInCommunicationMethodDropdownAraSelectable() {
        generalInformationBusinessPage.communicationMethodDropdownSelectable();
    }

    @Then("User should selects SMS option in the Tax Exempt dropdown on general information page")
    public void userShouldSelectsSMSOptionInTheTaxExemptDropdown() {
        generalInformationBusinessPage.communicationMethodOptionFromDropdown();
    }

    @Given("User clicks Country Code dropdown on general information page")
    public void user_clicks_country_code_dropdown() {
        clickField(generalInformationBusinessPage.countryCodeDropdownBox);
    }

    @Then("User should selects +355 option from country code dropdown on general information page")
    public void userShouldSelectsOptionFromCountryCodeDropdown() {
        clickField(generalInformationBusinessPage.albanianCountryCode);

    }

    @Then("User clicks mobile phone numbers field on general information page")
    public void user_clicks_mobile_phone_numbers_field() {
        clickField(generalInformationBusinessPage.mobilePhoneNumberBox);
    }

    @And("User enters invalid {string} phone numbers and should see {string} under mobile phone number field on general information page")
    public void userEntersInvalidPhoneNumbersAndShouldSeeUnderMobilePhoneNumberField(String invalidMobile, String warningMessage) {
        generalInformationBusinessPage.verifyEnterInvalidFormatMobilePhoneNumber(invalidMobile, warningMessage);

    }

    @Then("User should selects +213 option from country code dropdown except Albania and clicks mobile phone numbers field on general information page")
    public void userShouldSelectsOptionFromCountryCodeDropdownExceptAlbaniaAndClicksMobilePhoneNumbersField() {
        generalInformationBusinessPage.enteringOtherNumbers();
    }

    @And("User enters no number into the mobile phone number field and should see {string} warning message on phone field on general information page")
    public void userEntersNoNumberIntoTheMobilePhoneNumberFieldAndShouldSeeWarningMessageOnPhoneField(String message) {
        generalInformationBusinessPage.verifyEnteringOtherNumbers(message);
    }

    @And("User enters mobile phone number {string} with other country code except Albania on general information page")
    public void userEntersMobilePhoneNumberWithOtherCountryCodeExceptAlbania(String arg0) {
        generalInformationBusinessPage.inputOtherMobilePhoneNumberExceptAlbanian();
    }

    @And("User enters mobile valid phone number {string} on general information page")
    public void userEntersMobileValidPhoneNumber(String arg0) {
        generalInformationBusinessPage.inputValidMobilePhoneNumber(arg0);
    }

    @Given("User clicks Issuing Date field and user selects {string} from calendar on general information page")
    public void userClicksIssuingDateFieldAndUserSelectsFromCalendarOnGeneralInformationPage(String date) {
        generalInformationBusinessPage.verifyDateFromCalendarOnGeneralInfo(date);
    }

    @Given("User should see this {string} warning message near to add button on general information page")
    public void userShouldSeeThisWarningMessageNearToAddButtonOnGeneralInformationPage(String warningMessage) {
        warningMessage(warningMessage, generalInformationBusinessPage.warningOfAddExtractQKRdocumentMessage);
    }

    @And("User adds a {string} of which format is image on general information page")
    public void userAddsAOfWhichFormatIsImageOnGeneralInformationPage(String file) {
        uploadFile(generalInformationBusinessPage.addDocumentButtonOnNewBusinessCustomer, generalInformationBusinessPage.fileInputGeneral, file);
    }

    @And("User should see the name of {string} added jpg document on the screen on general information page")
    public void userShouldSeeTheNameOfAddedJpgDocumentOnTheScreenOnGeneralInformationPage(String fileName) {
        Assert.assertEquals("DOCUMENT-" + fileName, generalInformationBusinessPage.nameOfUploadedFileOnGeneral.getText());
    }

    @And("User deletes added image document on general information page")
    public void userDeletesAddedImageDocumentOnGeneralInformationPage() {
        clickField( generalInformationBusinessPage.deleteDocumentButton);
    }

    @And("User adds a {string} of which format is pdf with bigger five MB should see the {string} warning messageon general information page")
    public void userAddsAOfWhichFormatIsPdfWithBiggerFiveMBShouldSeeTheWarningMessageonGeneralInformationPage(String fileNameOfPdf, String warningMessage) {
        generalInformationBusinessPage.verifyTheUploadedBigger5MbSizeFile(fileNameOfPdf, warningMessage);

    }

    @And("User adds a document of which format is {string} on general information page")
    public void userAddsADocumentOfWhichFormatIsOnGeneralInformationPage(String excelFormat) {
        uploadFile(generalInformationBusinessPage.addDocumentButtonOnNewBusinessCustomer, generalInformationBusinessPage.fileInputGeneral, excelFormat);
    }

    @Then("User should see {string} warning message on top of  the screen for unmatched format on general information page")
    public void userShouldSeeWarningMessageOnTopOfTheScreenForUnmatchedFormatOnGeneralInformationPage(String warningMessage) {
        warningMessage(warningMessage, generalInformationBusinessPage.warningMessageForUnmatchedDocument);
    }


    @And("User adds a valid {string} document  on general information page")
    public void userAddsAValidDocumentOnGeneralInformationPage(String fileValidPdf) {
        uploadFile(generalInformationBusinessPage.addDocumentButtonOnNewBusinessCustomer, generalInformationBusinessPage.fileInputGeneral, fileValidPdf);
    }

    @And("User should see the name of {string} added pdf document on the screen on general information page")
    public void userShouldSeeTheNameOfAddedPdfDocumentOnTheScreenOnGeneralInformationPage(String fileNameOfPdf) {
        elementDisplayed(generalInformationBusinessPage.nameOfUploadedFileOnGeneral);
        Assert.assertEquals("DOCUMENT-" + fileNameOfPdf, generalInformationBusinessPage.nameOfUploadedFileOnGeneral.getText());
    }
}