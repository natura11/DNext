package optiim.steps.gui.customermanagement;

import optiim.framework.UrlBuilder;
import optiim.framework.helpers.WebDriverHelper;
import optiim.pages.customermanagement.CreateCustomerPage;
import optiim.pages.customermanagement.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class CreateResidentialCustomerSteps {
    private final WebDriverHelper webDriverHelper;
    private final UrlBuilder urlBuilder;
    private final HomePage homePage;
    private final CreateCustomerPage createCustomerPage;

    @Then("I should be seeing that the {string} page")
    public void I_should_be_seeing_that_the_page(String pageName) throws Throwable {

        createCustomerPage
                .controlNewCustomerPage(pageName);
    }

    @Then("I should be seeing that the Search Individual tab")
    public void I_should_be_seeing_that_the_tab() throws Throwable {
        createCustomerPage
                .controlSearchTab();
    }

    @When("I enter a value {string} in the Identification Number field for Add New User")
    public void I_enter_a_value_in_the_Identification_Number_field_for_Add_New_User(String identificationNumber) throws Throwable {
        createCustomerPage
                .enterIdentificationNumber(identificationNumber);
    }

    @And("I click Next button")
    public void I_click_Next_button() throws Throwable {

        createCustomerPage
                .clickNextButtonSearchTab();
    }

    @Then("I should be seeing General Information tab")
    public void I_should_be_seeing_General_Information_tab() throws Throwable {
        createCustomerPage
                .controlGeneralInformationTab();
    }

    @When("I enter a value {string} in the First Name field")
    public void I_enter_a_value_in_the_First_Name_field(String firstName) throws Throwable {

        createCustomerPage
                .enterFirstName(firstName);

    }

    @Then("I should be seeing that {string} {string} value characters are uppercase")
    public void I_should_be_seeing_that_value_characters_are_uppercase(String value, String field) throws Throwable {

        createCustomerPage
                .controlValueField(value, field);
    }

    @When("I enter a value {string} in the Last Name field")
    public void I_enter_a_value_in_the_Last_Name_field(String lastName) throws Throwable {
        createCustomerPage
                .enterLastName(lastName);

    }

    @When("I enter a value {string} in the Secondary Name field")
    public void I_enter_a_value_in_the_Secondary_Name_field(String secondaryName) throws Throwable {
        createCustomerPage
                .enterSecondaryName(secondaryName);

    }

    @When("I enter a value {string} in the Email field")
    public void I_enter_a_value_in_the_Email_field(String email) throws Throwable {
        createCustomerPage
                .enterEmail(email);
    }

    @When("I enter a value {string} in the Birth field")
    public void I_enter_a_value_in_the_Birth_field(String birthDate) throws Throwable {
        createCustomerPage
                .enterBirthDate(birthDate);
    }

    @Then("I should be seeing that Birth field is be older than 18 years old.")
    public void I_should_be_seeing_that_Birth_field_is_be_older_than_18_years_old() {
        createCustomerPage
                .controlAge();
    }

    @When("I select the {string} value from Gender DropdownList")
    public void I_select_the_value_from_DropdownList(String gender) throws Throwable {
        createCustomerPage
                .selectGender(gender);
    }
    @When("I should be seeing that there is {string} icon beside")
    public void I_should_be_seeing_that_there_is_value_icon_beside(String iconGender) throws Throwable {
        createCustomerPage
                .controlGender(iconGender);
    }


    @Then("I should be seeing that Country Of Birth field as {string}")
    public void I_select_the__as_Albania(String cob) throws Throwable {
        createCustomerPage
                .checkDefaultCountry(cob);
    }

    @When("I select the {string} value from Place Of Birth DropdownList")
    public void I_select_the_value_from_Place_Of_Birth_DropdownList(String pof) throws Throwable {
        createCustomerPage
                .selectPlaceOfBirth(pof);
    }

    @When("I enter the {string} value from Place Of Birth DropdownList")
    public void I_enter_the_value_from_Place_Of_Birth_DropdownList(String pof) throws Throwable {
        createCustomerPage
                .enterPlaceOfBirth(pof);
    }

    @Then("I should be seeing that {string} area is DropdownList")
    public void I_should_be_seeing_that_area_is_DropdownList(String citizenship) {

        createCustomerPage
                .controlCitizenship(citizenship);
    }

    @When("I enter a value {string} in the Mobile Number field")
    public void I_enter_a_value_in_the_Mobile_Number_field(String mobileNumber) throws Throwable {
        createCustomerPage
                .enterMobileNumber(mobileNumber);
    }

    @When("I select a value {string} for the Document Type field")
    public void I_select_a_value_for_the_field(String documentType) throws Throwable {
        createCustomerPage
                .selectDocumentType(documentType);
    }

    @When("I click Next button for Address Information")
    public void I_click_Next_button_for_Address_Information() throws Throwable {
        createCustomerPage
                .clickNextButtonn();
    }

    @Then("I should be seeing that areas : Address Line 1, Address Line 2, City , Country")
    public void I_should_be_seeing_that_areas() {

        createCustomerPage
                .controlAddressInformationTab();
    }

    @When("I enter a value {string} in the Address Line One field")
    public void I_enter_a_value_in_the_Address_Line_One_field(String addressLineOne) throws Throwable {
        createCustomerPage
                .enterAddressLineOne(addressLineOne);
    }

    @When("I enter a value {string} in the Address Line Two field")
    public void I_enter_a_value_in_the_Address_Line_Two_field(String AddressLineTwo) throws Throwable {

        createCustomerPage
                .enterAddressLineTwo(AddressLineTwo);
    }

    @When("I enter a value {string} in the Country field")
    public void I_enter_a_value_in_the_Country_field(String country) throws Throwable {
        createCustomerPage
                .selectCountry(country);
    }

    @When("I select a value {string} in the Country field")
    public void I_select_a_value_in_the_Country_field(String country) throws Throwable {
        createCustomerPage
                .selectCountry(country);
    }

    @When("I select a value {string} in the City field")
    public void I_select_a_value_in_the_City_field(String city) throws Throwable {
        createCustomerPage
                .selectCity(city);
    }

    @When("I enter a value {string} in the City field")
    public void I_enter_a_value_in_the_City_field(String city) throws Throwable {
        createCustomerPage
                .enterCity(city);
    }

    @When("I click Next button for Contact Information")
    public void I_click_Next_button_for_Contact_Information() throws Throwable {
        createCustomerPage
                .clickNextButton();
    }


    @Then("I should be seeing options to choose: {string},{string},{string}")
    public void I_should_be_seeing_options_to_choose(String select, String legalCustodian, String authorizedCustomer) {

    }

    @When("I click Add button")
    public void I_click_Add_button() throws Throwable {
        createCustomerPage
                .clickAddButton();
    }

    @When("I click Address Information tab")
    public void iClickAddressInformationTab() throws Throwable {
        createCustomerPage
                .clickAddressInformationTab();
    }

    @And("I should be seeing country value will be coming default {string}")
    public void iShouldBeSeeingCountryValueWillBeComingDefault(String country) throws InterruptedException {
        createCustomerPage
                .checkDefaultCountryForAddressInformatıon(country);
    }

    @And("I should be seeing that 4 area : {string}, {string}, {string} and {string}")
    public void iShouldBeSeeingThatAreaAnd(String address1, String address2, String country, String city) {
        createCustomerPage
                .checkAddressFilds(address1, address2, country, city);
    }

    @Then("I should be seeing {string} tab")
    public void I_should_be_seeing_tab(String tab) throws Throwable {

        createCustomerPage
                .controlTab(tab);
    }


    @Then("I should be seeing an error message about the {string} mandatory field")
    public void iShouldBeSeeingAnErrorMessageAboutTheMandatoryField(String value) throws InterruptedException {
        createCustomerPage
                .checkMandatoryFields(value);
    }

    @And("I select a value Authorized Type : {string}")
    public void ıShouldBeSeeingThatArea(String authorizationType) throws Throwable {
        createCustomerPage
                .selectAuthorizationFields(authorizationType);

    }


    @When("I select the {string} value from Country Of Birth DropdownList")
    public void ıSelectTheValueFromCountryOfBirthDropdownList(String countryOfBirth) throws Throwable {
        createCustomerPage
                .selectCountryOfBirth(countryOfBirth);
    }

    @When("I select the {string} value from Citizenship DropdownList")
    public void ıSelectTheValueFromCitizenshipDropdownList(String citizenship) throws Throwable {
        createCustomerPage
                .selectCitizenship(citizenship);
    }

    @When("I click {string} tab")
    public void ıClickTab(String tabName) throws Throwable {
        createCustomerPage
                .clickTab(tabName);
    }

    @When("I click General Information tab")
    public void ıClickGeneralInformationTab() throws Throwable {
        createCustomerPage
                .clickGeneralInformationTab();
    }

    @When("I enter a value {string} in the Identification Number field and choose registered user")
    public void ıEnterAValueInTheIdentificationNumberFieldAndChooseRegisteredUser(String identificationNumber) throws Throwable {
        createCustomerPage
                .enterIdentificationNumberUpdateRegister(identificationNumber);
    }

    @Then("I should be seeing that Personal Number field is deactive and not editable")
    public void ıShouldBeSeeingThatPersonalNumberFieldIsDeactiveAndNotEditable() {
        createCustomerPage
                .controlIdentificationDeactive();
    }

    @Then("I should be seeing that {string}, {string}, {string}, {string} field displayed")
    public void ıShouldBeSeeingThatFieldsDisplayed(String firstName, String lastName, String personalNumber, String authorizationDocumentType) throws Throwable {

        createCustomerPage
                .checkAuthorizedCustomerFields(firstName, lastName, personalNumber, authorizationDocumentType);
    }

    @When("I click Save button")
    public void ıClickSaveButton() throws Throwable {
        createCustomerPage
                .clickSaveButton();
    }

    @When("I click Search Identification button")
    public void ıClickSearchIdentificationButton() throws Throwable {
        createCustomerPage
                .clickSearchIdentificationButton();
    }

    @When("I click Birth Date close button")
    public void ıClickBirthDateCloseButton() throws Throwable {

        createCustomerPage
                .clickBirthDateCloseButton();
    }

    @When("I enter a value {string} in the Identification Number field for Contact Information")
    public void ıEnterAValueInTheIdentificationNumberFieldForContactInformation(String identificationNumber) throws Throwable {
        createCustomerPage
                .enterIdentificationNumberContactInformation(identificationNumber);
    }

    @When("I click Search Identification button for Contact Information")
    public void ıClickSearchIdentificationButtonForContactInformation() throws Throwable {
        createCustomerPage
                .clickSearchIdentificationContact();
    }

    //precondition create customer step for other cases(update,delete)
    @When("I create New Customer for {string}")
    public void ıCreateNewCustomerForResidential(String customerType) throws Throwable {
        createCustomerPage
                .createNewCustomer(customerType);
    }

    @When("I enter a value {string} in the Identification Number Field for Contact Tab")
    public void ıEnterAValueInTheIdentificationNumberFieldForContactTab(String identificationNumber) throws Throwable {
        createCustomerPage
                .enterIdentificationNumberContactInformation(identificationNumber);
    }

    @When("I enter a value {string} in the First Name Field")
    public void ıEnterAValueInTheFirstNameField(String firstName) throws Throwable {
        createCustomerPage
                .enterFirstNameContactInformation(firstName);
    }

    @When("I enter a value {string} in the Last Name Field")
    public void ıEnterAValueInTheLastNameField(String lastName) throws Throwable {
        createCustomerPage
                .enterLastNameContactInformation(lastName);
    }

    @When("I select a value {string} in the Document Type field for Contact Tab")
    public void ıSelectAValueInTheDocumentTypeFieldForContactTab(String documentType) throws Throwable {
        createCustomerPage
                .selectDocumentTypeContactInformation(documentType);
    }

    @When("I click add button on New Contact Medium panel")
    public void ıClickAddButtonOnNewContactMediumPanel() throws Throwable {
        createCustomerPage
                .clickNewContactMediumButton();
    }

    @Then("I should be seeing New Contact Medium panel")
    public void ıShouldBeSeeingNewContactMediumPanel() {
        createCustomerPage
                .controlNewMediumContact();
    }

    @Then("I should be seeing that is area : {string} DropdownList")
    public void ıShouldBeSeeingThatIsAreaDropdownList(String dropdownName) {
        createCustomerPage
                .controlMediumType(dropdownName);
    }

    @When("I select the {string} value from Medium Type DropdownList")
    public void ıSelectTheValueFromMediumTypeDropdownList(String mediumType) throws Throwable {
        createCustomerPage
                .selectMediumType(mediumType);
    }

    @When("I select the {string} value from Contact Type DropdownList")
    public void ıSelectTheValueFromContactTypeDropdownList(String contactType) throws Throwable {
        createCustomerPage
                .selectContactType(contactType);
    }

    @When("I enter a value {string} in the Email Address field")
    public void ıEnterAValueInTheEmailAddressField(String emailAddress) throws Throwable {
        createCustomerPage
                .enterEmailAdress(emailAddress);
    }

    @When("I enter a value {string} in the Telephone Number Address field")
    public void ıEnterAValueInTheTelephoneNumberAddressField(String telephoneNumber) throws Throwable {
        createCustomerPage
                .enterTelephoneNumber(telephoneNumber);
    }

    @When("I click Delete button")
    public void ıClickDeleteButton() throws Throwable {
        createCustomerPage
                .clickDeleteButton();
    }

    @When("I click Medium Contact Blank Panel")
    public void ıClickMediumContactBlankPanel() throws Throwable {
        createCustomerPage
                .clickMediumContactBlankPanel();
    }

    @Then("I should be seeing the popup alert message for Create Customer page {string}")
    public void ıShouldBeSeeingThePopupAlertMessageForMediumContact(String message) throws Throwable {
        createCustomerPage
                .controlPopupMessage(message);
    }

    @When("I enter a value {string} in the Issuing Date")
    public void ıEnterAValueInTheIssuingDate(String issuingDate) throws Throwable {
        createCustomerPage
                .enterIssuingDate(issuingDate);
    }

    @When("I add file in the Document File field")
    public void ıEnterAValueInTheDocumentFileField() throws Throwable {
        createCustomerPage
                .enterDocumentFile();
    }

    @When("I select a value {string} for the Document Type field for Contact Tab")
    public void ıSelectAValueForTheDocumentTypeFieldForContactTab(String documentType) throws Throwable {
        createCustomerPage
                .selectDocumentTypeForContact(documentType);
    }

    @When("I enter a value {string} in the Issuing Date for Contact Tab")
    public void ıEnterAValueInTheIssuingDateForContactTab(String issuingDate) {
        createCustomerPage
                .enterIssuingDateForContact(issuingDate);
    }

    @When("I add file in the Document File field for Contact Tab")
    public void ıAddFileInTheDocumentFileFieldForContactTab() throws Throwable {
        createCustomerPage
                .enterDocumentFileForContact();
    }

    @And("I should be seeing that {string} {string} {string} values is displayed in the Document Type field")
    public void ıShouldBeSeeingThatValuesIsDisplayedInTheDocumentTypeField(String idCard, String passport, String other) throws Throwable {
        createCustomerPage
                .controlDocumentTypeAllField(idCard, passport, other);
    }

    @Then("I should be seeing that 3 area :{string},{string},{string} for General Information tab in the Create Customer page")
    public void ıShouldBeSeeingThatTheFormatOfDocumentTypeAsDropDownList(String documentType, String issuingDate, String documentNumber) {
        createCustomerPage
                .controlDocumentCollection(documentType, issuingDate, documentNumber);
    }

    @And("I should be seeing that Document Type field as {string}")
    public void ıShouldBeSeeingThatDocumentTypeFieldAs(String documentType) {
        createCustomerPage
                .controlDefaultDocumentType(documentType);
    }

    @When("I enter a value {string} in the Document Number field")
    public void ıEnterAValueInTheDocumentNumberField(String documentNumber) throws Throwable {
        createCustomerPage
                .enterDocumentNumber(documentNumber);
    }

    @And("I click Cancel File button")
    public void ıClickCancelFileButton() throws Throwable {
        createCustomerPage
                .clickCancelFileButton();
    }

    @Then("I should be seeing the message {string}")
    public void ıShouldBeSeeingThatTheUploadedDocumentIsDeleted(String fileDeleteMessage) throws Throwable {
        createCustomerPage
                .controlFileDeleteMessage(fileDeleteMessage);
    }

    @When("I add file 5MB in the Document File field")
    public void ıAddFileMBInTheDocumentFileField() throws Throwable {
        createCustomerPage
                .enterFiveMBDocumentFile();
    }

    @And("I add file greater than 5MB in the Document File field")
    public void ıAddFileGreaterThanMBInTheDocumentFileField() throws Throwable {
        createCustomerPage
                .enterGreaterThanFiveMBDocumentFile();
    }

    @And("I add file greater than 5MB in the Document File field for Contact Tab")
    public void ıAddFileGreaterThanMBInTheDocumentFileFieldForContactTab() throws Throwable {
        createCustomerPage
                .enterGreaterThanFiveMBDocumentFileForContact();
    }

    @And("I should be seeing that 3 area {string}, {string}, {string} for Contact Information tab in the Create Customer page")
    public void ıShouldBeSeeingThatAreaForContactInformationTabInTheCreateCustomerPage(String documentType, String issuingDate, String documentNumber) {
        createCustomerPage
                .controlDocumentCollectionForContact(documentType, issuingDate, documentNumber);
    }

    @And("I click Cancel File button for Contact Tab")
    public void ıClickCancelFileButtonForContactTab() throws Throwable {
        createCustomerPage
                .clickCancelFileButtonForContact();
    }

    @Then("I should be seeing the message {string} for Contact Tab")
    public void ıShouldBeSeeingTheMessageForContactTab(String fileDeleteMessage) {
        createCustomerPage
                .controlFileDeleteMessageForContact(fileDeleteMessage);
    }

    @When("I enter a value {string} in the Document Number field for Contact Tab")
    public void ıEnterAValueInTheDocumentNumberFieldForContactTab(String documentNumber) throws Throwable {
        createCustomerPage
                .enterDocumentNumberForContact(documentNumber);
    }

    @And("I should be seeing that the value of  the {string} is correct to the related residential customer for Address Tab")
    public void ıShouldBeSeeingThatTheValueOfTheIsCorrectToTheRelatedResidentialCustomerForAddressTab(String fieldName) throws Throwable {
        createCustomerPage
                .controlAddressInformationTabValue(fieldName);
    }

    @Then("I should be seeing Service Address switch value will be coming {string}")
    public void ıShouldBeSeeingServiceAddressSwitchValueWillBeComing(String statusValue) throws Throwable {
        createCustomerPage
                .controlDefaultServiceAddressSwitch(statusValue);
    }

    @When("I click Service Address switch")
    public void ıClickServiceAddressSwitch() throws Throwable {
        createCustomerPage
                .clickServiceAddressSwitch();
    }

    @Then("I should be seeing that 6 area : {string}, {string}, {string}, {string}, {string}, {string}")
    public void ıShouldBeSeeingThatArea(String mediumType, String contactType, String addressLineOne, String addressLineTwo, String country, String city) {
        createCustomerPage
                .controlServiceAddressField(mediumType, contactType, addressLineOne, addressLineTwo, country, city);
    }

    @And("I should be seeing country value will be coming default {string} for Service Address")
    public void ıShouldBeSeeingCountryValueWillBeComingDefaultForServiceAddress(String country) throws Throwable {
        createCustomerPage
                .controlDefaultServiceAddressCountry(country);
    }

    @When("I enter a value {string} in the Address Line One field for Service Address")
    public void ıEnterAValueInTheAddressLineOneFieldForServiceAddress(String addressLineOne) throws Throwable {
        createCustomerPage
                .enterAddressLineOneForServiceAddress(addressLineOne);
    }

    @When("I enter a value {string} in the Address Line Two field for Service Address")
    public void ıEnterAValueInTheAddressLineTwoFieldForServiceAddress(String addressLineTwo) throws Throwable {
        createCustomerPage
                .enterAddressLineTwoForServiceAddress(addressLineTwo);
    }

    @When("I select a value {string} in the City field for Service Address")
    public void ıSelectAValueInTheCityFieldForServiceAddress(String city) throws Throwable {
        createCustomerPage
                .selectCityForServiceAddress(city);
    }

    @When("I click the Document Add button")
    public void ıClickTheDocumentAddButton() throws Throwable {
        createCustomerPage
                .clickDocumentAddButton();
    }

    @When("I click Birth Date close button for Create Residential Customer Page")
    public void ıClickBirthDateCloseButtonForCreateResidentialCustomerPage() throws Throwable {
        createCustomerPage
                .clickBirthDateCloseButtonForCreateResidential();
    }

    @And("I click Issuing Date close button for Create Residential Customer Page")
    public void ıClickIssuingDateCloseButtonForCreateResidentialCustomerPage() throws Throwable {
        createCustomerPage
                .clickIssuingDateCloseButton();
    }

    @When("I add png file in the Document File field")
    public void ıAddJpegFileInTheDocumentFileField() throws Throwable {
        createCustomerPage
                .enterDocumentFilePngFormat();
    }

    @When("I add pdf file in the Document File field")
    public void ıAddPdfFileInTheDocumentFileField() throws Throwable {
        createCustomerPage
                .enterDocumentFilePdfFormat();
    }

    @When("I add jpg file greater than 5MB in the Document File field")
    public void ıAddJpgFileGreaterThanMBInTheDocumentFileField() throws Throwable {
        createCustomerPage
                .enterGreaterThanFiveMBDocumentFileJpgFormat();
    }

    @When("I add png file greater than 5MB in the Document File field")
    public void ıAddPngFileGreaterThanMBInTheDocumentFileField() throws Throwable {
        createCustomerPage
                .enterGreaterThanFiveMBDocumentFilePngFormat();
    }

    @When("I add txt file in the Document File field")
    public void ıAddTxtFileInTheDocumentFileField() throws Throwable {
        createCustomerPage
                .enterDocumentFileTxtFormat();
    }

    @When("I add png file in the Document File field for Contact Tab")
    public void ıAddPngFileInTheDocumentFileFieldForContactTab() throws Throwable {
        createCustomerPage
                .enterDocumentFileForContactPngFormat();
    }

    @When("I add pdf file in the Document File field for Contact Tab")
    public void ıAddPdfFileInTheDocumentFileFieldForContactTab() throws Throwable {
        createCustomerPage
                .enterDocumentFileForContactPdfFormat();
    }

    @When("I add png file greater than 5MB in the Document File field for Contact Tab")
    public void ıAddPngFileGreaterThanMBInTheDocumentFileFieldForContactTab() throws Throwable {
        createCustomerPage
                .enterGreaterThanFiveMBDocumentFileForContactPngFormat();
    }

    @When("I add jpg file greater than 5MB in the Document File field for Contact Tab")
    public void ıAddJpgFileGreaterThanMBInTheDocumentFileFieldForContactTab() throws Throwable {
        createCustomerPage
                .enterGreaterThanFiveMBDocumentFileForContactJpgFormat();
    }

    @When("I add txt file in the Document File field for Contact Tab")
    public void ıAddTxtFileInTheDocumentFileFieldForContactTab() throws Throwable {
        createCustomerPage
                .enterDocumentFileForContactTxtFormat();
    }


    @When("I select one of the Country {string} from list different from Albenia")
    public void ıSelectOneOfTheCountryFromListDifferentFromAlbenia(String countryPhoneCode) throws Throwable {
        createCustomerPage
                .selectCountryPhoneCode(countryPhoneCode);


    }

    @When("I select one of the Country {string} from list New Contact tab different from Albenia")
    public void ıSelectOneOfTheCountryFromListNewContactTabDifferentFromAlbenia(String contactCountryCode) throws Throwable {
        createCustomerPage
                .selectContactCountryPhoneCode(contactCountryCode);
    }

    @When("I enter a value {string} in the Birth field 2nd. version")
    public void ıEnterAValueInTheBirthFieldNdVersion(String birthDate) throws Throwable {
        createCustomerPage
                .enterBirthDate2ndVersion(birthDate);
    }

    @And("I select a value {string} from Dropdown List in the Segment field for Individual Customer")
    public void ıSelectAValueFromDropdownListInTheSegmentFieldForIndividualCustomer(String segment) throws Throwable {
        createCustomerPage
                .selectSegment(segment);
    }

    @When("I enter a value {string} in the Birth field for Contact Tab")
    public void ıEnterAValueInTheBirthFieldForContactTab(String birthDate) throws Throwable {
        createCustomerPage
                .enterBirthDateForContactTab(birthDate);
    }

    @When("I select the {string} value from Gender DropdownList for Contact Tab")
    public void ıSelectTheValueFromGenderDropdownListForContactTab(String gender) throws Throwable {
        createCustomerPage
                .selectGenderForContactTab(gender);
    }

    @And("I select the {string} value from Citizenship DropdownList for Contact Tab")
    public void ıSelectTheValueFromCitizenshipDropdownListForContactTab(String citizenship) throws Throwable {
        createCustomerPage
                .selectCitizenshipForContactTab(citizenship);
    }

    @And("I should be seeing that the value of  the {string} is correct to the related residential customer for General Information Tab")
    public void ıShouldBeSeeingThatTheValueOfTheIsCorrectToTheRelatedResidentialCustomerForGeneralInformationTab(String fieldName) {
        createCustomerPage
                .controlGeneralInformationTabFieldValue(fieldName);
    }

    @When("I click Contact Information tab")
    public void ıClickContactInformationTab() throws Throwable {
        createCustomerPage
                .clickContactInformationTab();
    }

    @Then("I should be not seeing that {string} field")
    public void ıShouldBeNotSeeingThatField(String fieldName) {
        createCustomerPage
                .controlNotSeeingField(fieldName);
    }

    @When("I enter a value {string} in the Identification Number field for Female")
    public void ıEnterAValueInTheIdentificationNumberFieldForFemale(String value) throws Throwable {
        createCustomerPage
                .enterIdentificationNumberForFemale(value);
    }

    @And("I click Send Pin button")
    public void ıClickSendPinButton() throws Throwable {
        createCustomerPage
                .clickSendPinButton();
    }

    @And("I enter a value {string} Pin field")
    public void ıEnterAValuePinField(String pinCode) throws Throwable {
        createCustomerPage
                .enterPinCode(pinCode);
    }

    @And("I click Validate Pin button")
    public void ıClickValidatePinButton() throws Throwable {
        createCustomerPage
                .clickValidatePin();
    }

    @And("I click Search button for Billing Address")
    public void ıClickSearchButtonForBillingAddress() throws Throwable {
        createCustomerPage
                .clickSearchButtonForBillingAddress();
    }

    @And("I click Search button for Service Address")
    public void ıClickSearchButtonForServiceAddress() throws Throwable {
        createCustomerPage
                .clickSearchButtonForServiceAddress();
    }

    @When("I click Cancel File button for Individual Customer for General information TAB")
    public void ıClickCancelFileButtonForIndividualCustomerForGeneralInformationTAB() throws Throwable {
        createCustomerPage
                .clickCancelFileButtonForGeneralInformationTab();
    }

    @When("I enter a value {string} in the Identification Number field with Admin Information id value for Enterprise Customer")
    public void ıEnterAValueInTheIdentificationNumberFieldWithAdminInformationIdValueForEnterpriseCustomer(String identificationNumber) throws Throwable {
        createCustomerPage
                .enterIdentificationNumberWithEnterpriseAdminId(identificationNumber);
    }

    @When("I enter a value {string} in the Identification Number field with Contact Information id value for Individual Customer")
    public void ıEnterAValueInTheIdentificationNumberFieldWithContactInformationIdValueForIndividualCustomer(String identificationNumber ) throws Throwable {
        createCustomerPage
                .enterIdentificationNumberWithContactAuthorizeId(identificationNumber);
    }

    @And("I click the Disability button")
    public void ıClickTheDisabilityButton() throws Throwable {
        createCustomerPage
                .clickDisabilityButton();
    }

    @And("I enter a value {string} in the Disabled Organization field")
    public void ıEnterAValueInTheDisabledOrganizationField(String disabledOrganization) throws Throwable {
        createCustomerPage
                .enterDisabledOrganization(disabledOrganization);
    }

    @And("I select a value {string} in the Disabled Type field")
    public void ıSelectAValueInTheDisabledTypeField(String disabledType) throws Throwable {
        createCustomerPage
                .selectDisabledType(disabledType);
    }

    @And("I select a value {string} in the Preferred Communication Method field")
    public void ıSelectAValueInThePreferredCommunicationMethodField(String preferredComunicationMethod) throws Throwable {
        createCustomerPage
                .selectPreferredCommunicationMethod(preferredComunicationMethod);
    }

    @And("I select a value {string} in the Contract Type field")
    public void ıSelectAValueInTheContractTypeField(String contractType) throws Throwable {
        createCustomerPage
                .selectContractType(contractType);
    }

    @And("I select a value {string} in the Document Type field")
    public void ıSelectAValueInTheDocumentTypeField(String documentType) throws Throwable {
        createCustomerPage
                .selectDocumentTypeOtherInformation(documentType);
    }

    @And("I add file in the Document File field for Other Information")
    public void ıAddFileInTheDocumentFileFieldForOtherInformation() throws Throwable {
        createCustomerPage
                .enterDocumentFileForOtherInformationTab();
    }

    @And("I click the Generate Form")
    public void ıClickTheGenerateForm() throws Throwable {
        createCustomerPage
                .clickGenerateForm();
    }

    @Then("I should be seeing that the Generate Form button is not active")
    public void ıShouldBeSeeingThatTheGenerateFormButtonIsNotActive() {
        createCustomerPage
                .controlGenerateFormNotActive();
    }

    @Then("I should be not seeing that Search button")
    public void ıShouldBeNotSeeingThatSearchButton() throws Throwable {
        createCustomerPage
                .controlSearchButtonNotSeeing();
    }

    @Then("I click the Document View Page button")
    public void ıShouldBeSeeingThatDocumentViewPageIsOpened() throws Throwable {
        createCustomerPage
                .clickDocumentViewPage();
    }

    @When("I add space defined file in the Document File field")
    public void ıAddSpaceDefinedFileInTheDocumentFileField() throws Throwable {
        createCustomerPage
                .enterDocumentFileSpaceDefinedFormat();
    }

    @When("I add - defined file in the Document File field")
    public void ıAddDefinedFileInTheDocumentFileField() throws Throwable {
        createCustomerPage
                .enterDocumentFileOtherFormat();
    }

    @Then("I should not be seeing send pin button in general information field, because it have the sms_validation_bypass role.")
    public void ıShouldNotBeSeeingSendPinButtonInGeneralInformationFieldBecauseItHaveTheSms_validation_bypassRole() throws Throwable {
        createCustomerPage
                .controlSendPinButton();
    }

    @And("I select a value {string} in the Credit Rating field")
    public void ıSelectAValueInTheCreditRatingField(String creditCard) throws Throwable {
        createCustomerPage
                .selectCreditCard(creditCard);
    }

    @And("I select a value {string} in the Credit Rating field for Prepaid Account")
    public void ıSelectAValueInTheCreditRatingFieldForPrepaidAccount(String creditRatingPrepaid) throws Throwable {
        createCustomerPage
                .selectCreditRatingForPrepaid(creditRatingPrepaid);
    }
}
