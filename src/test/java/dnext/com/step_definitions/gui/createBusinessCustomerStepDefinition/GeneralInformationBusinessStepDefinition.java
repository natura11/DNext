package dnext.com.step_definitions.gui.createBusinessCustomerStepDefinition;
import com.utilities.Utils;
import dnext.com.pages.BasePage;
import dnext.com.pages.createBusinessCustomerPages.GeneralInformationBusinessPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import org.openqa.selenium.Keys;

@AllArgsConstructor
public class GeneralInformationBusinessStepDefinition extends BasePage {
    GeneralInformationBusinessPage generalInformationBusinessPage;

    @And("User clicks the Next button on general information page")
    public void userClicksTheNextButtonOnGeneralInformationPage() {
        Utils.click(generalInformationBusinessPage.nextBtnOnGeneralInformation);
    }

    @Given("User should see the Name box on the general information page on general information page")
    public void user_should_see_the_box_on_the_general_information_page() {
        generalInformationBusinessPage.verificationOfNameBox();
    }

    @Given("User clicks Name Field on general information page")
    public void user_clicks_name_field() {
        clickField(generalInformationBusinessPage.organizationNameInput);

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
        isDropdownSelectable();
    }

    @Then("User should selects any option in the Industry dropdown on general information page")
    public void userShouldSelectsAnyOptionInTheIndustryDropdown() {
        randomOptionFromDropdown();
    }

    @Given("User clicks Segment dropdown on general information page")
    public void userClicksSegmentDropdown() {
        clickField(generalInformationBusinessPage.segmentDropdownBox);
    }

    @And("User should ensure each options in Segment dropdown are selectable on general information page")
    public void userShouldEnsureEachOptionsInSegmentDropdownAreSelectable() {
        isDropdownSelectable();
    }

    @Then("User should selects any options in the Segment dropdown on general information page")
    public void userShouldSelectsAnyOptionsInTheSegmentDropdown() {
        randomOptionFromDropdown();
    }

    @Given("User clicks Tax Exempt dropdown on general information page")
    public void userClicksTaxExemptDropdown() {
        clickField(generalInformationBusinessPage.taxExemptDropdownBox);

    }

    @And("User should ensure each options in Tax Exempt dropdown are selectable on general information page")
    public void userShouldEnsureEachOptionsInTaxExemptDropdownAreSelectable() {
        isDropdownSelectable();
    }

    @Then("User should selects any option in the Tax Exempt dropdown on general information page")
    public void userShouldSelectsAnyOptionInTheTaxExemptDropdown() {
        randomOptionFromDropdown();
    }

    @Given("User clicks email field on general information page")
    public void user_clicks_email_field() {
        clickField(generalInformationBusinessPage.emailFieldOnGeneral);
    }

    @Given("User should see that background is red for email field")
    public void user_should_see_that_background_is_red() {
        warningBackgroundRedColorOne(
                generalInformationBusinessPage.emailPictureBtnOnGeneralInformationPage, true);
    }

    @And("User enters {string} on general information page")
    public void userEnters(String invalidEmail) {
        Utils.sendKeys(generalInformationBusinessPage
                .emailFieldOnGeneral, invalidEmail + Keys.TAB);
    }

    @Given("User enters valid {string} in to the email field on general information page")
    public void userEntersValidInToTheEmailField(String email) {
        Utils.sendKeys(generalInformationBusinessPage
                .emailFieldOnGeneral, email);
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
        isDropdownSelectable();
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
    public void userEntersMobilePhoneNumberWithOtherCountryCodeExceptAlbania(String number) {
        Utils.sendKeys(generalInformationBusinessPage
                .mobilePhoneNumberBox, "number");
    }

    @And("User enters mobile valid phone number {string} on general information page")
    public void userEntersMobileValidPhoneNumber(String phoneNumber) {
        Utils.sendKeys(generalInformationBusinessPage
                .mobilePhoneNumberBox, phoneNumber);
    }

    @Given("User clicks Issuing Date field and enters invalid date on General Information page")
    public void userClicksIssuingDateFieldAndUserSelectsFromCalendarOnGeneralInformationPage() {
        generalInformationBusinessPage.verifyDateFromCalendarOnGeneralInfo();
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
        generalInformationBusinessPage.verifyUploadedExtractQkrDocument(fileName);
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


    @When("User enters random organization name on Business General Information page")
    public void userEntersRandomOrganizationName() {
        generalInformationBusinessPage.fillOrganizationNameWithRandomString();
    }

    @Then("User should see the Company Name is autofilled with organization name on Business General Information page")
    public void userShouldSeeTheCompanyNameIsAutofilledWithOrganizationNameOnBusinessGeneralInformationPage() {
        generalInformationBusinessPage.verifyTheCompanyNameIsSame();
    }

    @Then("User should selects {string} option in the Segment dropdown on general information page")
    public void userShouldSelectsOptionInTheSegmentDropdown(String segment) {
        selectSpecificOptionFromDropdown(segment);
    }

    @And("User enters random email on Business General Information page")
    public void userEntersRandomEmail() {
        generalInformationBusinessPage.fillEmailWithRandomEmail();
    }

    @And("User enters random mobile phone number on Business General Information page")
    public void userEntersRandomMobilePhoneNumber() {
        generalInformationBusinessPage.fillPhoneNumberWithRandomNumber();
    }

    @And("User enters random valid issuing date on Business General Information page")
    public void userEntersRandomValidIssuingDate() {
        generalInformationBusinessPage.fillIssuingDateWithRandomValidDate();
    }

    @When("User clicks the General Information button for Business")
    public void userClicksTheGeneralInformationButtonForBusiness() {
        clickField(generalInformationBusinessPage.generalInformationButtonSelectedLabel);
    }

    @And("User selects any communication option on General Information Page")
    public void userSelectsAnyCommunicationOptionOnGeneralInformationPage() {
        randomOptionFromDropdown();
    }
}