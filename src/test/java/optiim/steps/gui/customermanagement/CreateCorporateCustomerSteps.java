package optiim.steps.gui.customermanagement;

import optiim.framework.UrlBuilder;
import optiim.framework.helpers.WebDriverHelper;
import optiim.pages.customermanagement.CreateCorporateCustomerPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class CreateCorporateCustomerSteps {
    private final WebDriverHelper webDriverHelper;
    private final UrlBuilder urlBuilder;
    private final CreateCorporateCustomerPage createCorporateCustomerPage;


    @Then("I should be seeing that the {string} page for Corporate Customer")
    public void I_should_be_seeing_that_the_page_for_Corporate_Customer(String pageNameText) throws Throwable {
        createCorporateCustomerPage
                .controlNewCorporateCustomerPage(pageNameText);
    }

    @When("I should be seeing {string} tab for Corporate Customer")
    public void ıShouldBeSeeingTabForCorporateCustomer(String tabName) {
        createCorporateCustomerPage
                .controlTab(tabName);
    }

    @When("I enter a value {string} in the NIPT field and click the Search button")
    public void ıEnterAValueInTheNIPTFieldAndClickTheSearchButton(String niptNumber) throws Throwable {
        createCorporateCustomerPage
                .enterNIPTNumber(niptNumber);
    }

    @When("I click the Next button")
    public void ıClickTheNextButton() throws Throwable {
        createCorporateCustomerPage
                .clickNextButton();
    }

    @And("I should be seeing that 5 area :{string},{string},{string},{string} and {string} for General Information tab in the Corporate Customer Page")
    public void ıShouldBeSeeingThatAreaForGeneralInformationTabInTheCorporateCustomerPage(String organizationNumber, String name, String industry, String billMedia, String accountManager) {
        createCorporateCustomerPage
                .controlGeneralInformationField(organizationNumber, name, industry, billMedia, accountManager);
    }

    @When("I enter a value {string} in the Name field")
    public void ıEnterAValueInTheNameField(String name) throws Throwable {
        createCorporateCustomerPage
                .enterName(name);
    }

    @Then("I should be seeing that {string} {string} value characters are uppercase for Corporate Customer Page")
    public void ıShouldBeSeeingThatValueCharactersAreUppercaseForCorporateCustomerPage(String value, String field) throws Throwable {
        createCorporateCustomerPage
                .controlValueField(value, field);
    }

    @And("I should be seeing {string} default field in the Bill Media Dropdown list.")
    public void ıShouldBeSeeingFieldInTheBillMediaDropdownList(String billMediaType) {
        createCorporateCustomerPage
                .controlDefaultBillMedia(billMediaType);
    }

    @Then("I should be seeing that {string} {string} {string} values is displayed in the Bill Media field")
    public void ıShouldBeSeeingThatValuesIsDisplayedInTheBillMediaField(String fieldOne, String fieldTwo, String fieldThree) throws Throwable {
        createCorporateCustomerPage
                .controlBillMediaAllField(fieldOne, fieldTwo, fieldThree);
    }

    @When("I select a value {string} from Dropdown List in the Bill Media field")
    public void ıSelectAValueFromDropdownListInTheBillMediaField(String billMediaType) throws Throwable {
        createCorporateCustomerPage
                .selectBillMediaType(billMediaType);
    }

    @Then("I should be seeing that {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} values is displayed in the Industry field")
    public void ıShouldBeSeeingThatValuesIsDisplayedInTheIndustryField(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10, String arg11) throws Throwable {
        createCorporateCustomerPage
                .controlIndustryAllField(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
    }

    @When("I select a value {string} from Dropdown List in the Industry field")
    public void ıSelectAValueFromDropdownListInTheIndustryField(String industryType) throws Throwable {
        createCorporateCustomerPage
                .selectIndustryType(industryType);
    }

    @When("I click the Next Button for Admin Information")
    public void ıClickTheNextButtonForAdminInformation() throws Throwable {
        createCorporateCustomerPage
                .clickNextButtonGeneralInformation();
    }

    @Then("I should be seeing that {string} field is mandatory and not leaved empty")
    public void ıShouldBeSeeingThatFieldIsMandatoryAndNotLeavedEmpty(String fieldName) {
        createCorporateCustomerPage
                .controlFieldErrorMessage(fieldName);
    }


    @When("I click the Admin Information tab")
    public void ıClickTheAdminInformationTab() throws Throwable {
        createCorporateCustomerPage
                .clickAdminInformationTab();
    }

    @When("I enter a value {string} in the First Name field for Corporate Customer")
    public void ıEnterAValueInTheFirstNameFieldForCorporateCustomer(String firstName) throws Throwable {
        createCorporateCustomerPage
                .enterFirstName(firstName);
    }

    @When("I enter a value {string} in the Last Name field for Corporate Customer")
    public void ıEnterAValueInTheLastNameFieldForCorporateCustomer(String lastName) throws Throwable {
        createCorporateCustomerPage
                .enterLastName(lastName);
    }

    @When("I enter a value {string} in the Secondary Name field for Corporate Customer")
    public void ıEnterAValueInTheSecondaryNameFieldForCorporateCustomer(String secondaryName) throws Throwable {
        createCorporateCustomerPage
                .enterSecondaryName(secondaryName);
    }

    @And("I should be seeing that 11 area : {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string} for Admin Information tab in the Corporate Customer Page")
    public void ıShouldBeSeeingThatAreaForAdminInformationTabInTheCorporateCustomerPage(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10, String arg11) {
        createCorporateCustomerPage
                .controlAdminInformationField(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
    }

    @When("I enter a value {string} in the BirthDate field for Corporate Customer")
    public void ıEnterAValueInTheBirthDateFieldForCorporateCustomer(String birthDate) throws Throwable {
        createCorporateCustomerPage
                .enterBirthDate(birthDate);
    }

    @Then("I should be seeing that Country Of Birth field as {string} for Corporate Customer")
    public void ıShouldBeSeeingThatCountryOfBirthFieldAsForCorporateCustomer(String cobName) {
        createCorporateCustomerPage
                .controlDefaultCountryOfBirth(cobName);
    }

    @When("I select a value {string} from Dropdown List in Place Of Birth field for Corporate Customer")
    public void ıSelectAValueFromDropdownListInPlaceOfBirthFieldForCorporateCustomer(String pobName) throws Throwable {
        createCorporateCustomerPage
                .selectPlaceOfBirth(pobName);
    }

    @When("I select a value {string} from Dropdownlist in the Country Of Birth field for Corporate Customer")
    public void ıSelectAValueFromDropdownlistInTheCountryOfBirthFieldForCorporateCustomer(String cobName) throws Throwable {
        createCorporateCustomerPage
                .selectCountryOfBirth(cobName);
    }

    @Then("I should be seeing that Citizenship field default value is {string} for Corporate Customer")
    public void ıShouldBeSeeingThatCitizenshipFieldDefaultValueIsForCorporateCustomer(String citizenshipName) {
        createCorporateCustomerPage
                .controlDefaultCitizenship(citizenshipName);
    }

    @When("I select a value {string} from Dropdownlist in the Citizenship field for Corporate Customer")
    public void ıSelectAValueFromDropdownlistInTheCitizenshipFieldForCorporateCustomer(String citizenshipName) throws Throwable {
        createCorporateCustomerPage
                .selectCitizenship(citizenshipName);
    }

    @When("I select a value {string} in the Gender field for Corporate Customer")
    public void ıSelectAValueInTheGenderFieldForCorporateCustomer(String genderType) throws Throwable {
        createCorporateCustomerPage
                .selectGender(genderType);
    }

    @When("I select {string} in the Document Type field for Corporate Customer")
    public void ıSelectInTheDocumentTypeFieldForCorporateCustomer(String documentType) throws Throwable {
        createCorporateCustomerPage
                .selectDocumentType(documentType);
    }

    @And("I enter a value {string} in the Issuing Date for Corporate Customer")
    public void I_enter_a_value_in_the_Issuing_Date_for_Corporate_Customer(String issuingDate) throws Throwable {
        createCorporateCustomerPage
                .enterIssuingDate(issuingDate);
    }


    @And("I add file in the Document File field for Corporate Customer")
    public void I_add_file_in_the_Document_File_field_for_Corporate_Customer() throws Throwable {
        createCorporateCustomerPage
                .enterDocumentFile();
    }


    @When("I enter a value {string} in the Identification Number field for Corporate Customer")
    public void ıEnterAValueInTheIdentificationNumberFieldForCorporateCustomer(String identificationNumber) throws Throwable {
        createCorporateCustomerPage
                .enterIdentificationNumber(identificationNumber);
    }

    @When("I enter a value {string} in the Email field for Corporate Customer")
    public void ıEnterAValueInTheEmailFieldForCorporateCustomer(String email) throws Throwable {
        createCorporateCustomerPage
                .enterEmail(email);
    }

    @When("I enter a value {string} in the Mobile Number field for Corporate Customer")
    public void ıEnterAValueInTheMobileNumberFieldForCorporateCustomer(String phoneNumber) throws Throwable {
        createCorporateCustomerPage
                .enterPhoneNumber(phoneNumber);
    }

    @When("I click the Address Information tab")
    public void ıClickTheAddressInformationTab() throws Throwable {
        createCorporateCustomerPage
                .clickAddressInformationTab();
    }

    @When("I enter a value {string} in the Address Line One field for Corporate Customer")
    public void ıEnterAValueInTheAddressLineOneFieldForCorporateCustomer(String addressLineOne) throws Throwable {
        createCorporateCustomerPage
                .enterAddressLineOne(addressLineOne);
    }

    @When("I click the Next Button for Address Information")
    public void ıClickTheNextButtonForAddressInformation() throws Throwable {
        createCorporateCustomerPage
                .clickNextButtonAdminInformation();
    }

    @Then("I should be seeing that {string},{string},{string},{string},{string},{string}  fields are displayed  for Address Information tab in the Corporate Customer Page")
    public void ıShouldBeSeeingThatFieldsAreDisplayedForAddressInformationTabInTheCorporateCustomerPage(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
        createCorporateCustomerPage
                .controlAddressInformationField(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @Then("I should be seeing that the default value of the Medium Type Field is {string} is displayed for Corporate Customer")
    public void ıShouldBeSeeingThatTheDefaultValueOfTheMediumTypeFieldIsIsDisplayedForCorporateCustomer(String mediumTypeValue) {
        createCorporateCustomerPage
                .controlDefaultMediumType(mediumTypeValue);
    }

    @And("I should be seeing that Contact Type Field default value of the Contact Type Field is {string} is displayed for Corporate Customer")
    public void ıShouldBeSeeingThatContactTypeFieldDefaultValueOfTheContactTypeFieldIsIsDisplayedForCorporateCustomer(String contactTypeValue) throws Throwable {
        createCorporateCustomerPage
                .controlDefaultContactType(contactTypeValue);
    }

    @When("I select a value {string} in the Country field for Corporate Customer")
    public void ıSelectAValueInTheCountryFieldForCorporateCustomer(String countryName) throws Throwable {
        createCorporateCustomerPage
                .selectCountry(countryName);
    }

    @Then("I should be seeing that City field is displayed as Textarea for Corporate Customer")
    public void ıShouldBeSeeingThatCityFieldIsDisplayedAsTextareaForCorporateCustomer() {
        createCorporateCustomerPage
                .controlCityFieldTextArea();
    }

    @When("I enter a value {string} in the City field for Corporate Customer")
    public void ıEnterAValueInTheCityFieldForCorporateCustomer(String cityName) throws Throwable {
        createCorporateCustomerPage
                .enterCity(cityName);
    }

    @Then("I should be seeing that City field is displayed as Dropdownlist for Corporate Customer")
    public void ıShouldBeSeeingThatCityFieldIsDisplayedAsDropdownlistForCorporateCustomer() {
        createCorporateCustomerPage
                .controlCityFieldDropdownlist();
    }

    @And("I should be seeing that Country field as {string} for Address Information tab in the Corporate Customer Page")
    public void ıShouldBeSeeingThatCountryOfBirthFieldAsForAddressInformationTabInTheCorporateCustomerPage(String countryName) {
        createCorporateCustomerPage
                .controlDefaultCountry(countryName);
    }

    @When("I select a value {string} in the City field for Corporate Customer")
    public void ıSelectAValueInTheCityFieldForCorporateCustomer(String cityName) throws Throwable {
        createCorporateCustomerPage
                .selectCity(cityName);
    }

    @Then("I should be seeing that City field as {string} for Address Information tab in the Corporate Customer Page")
    public void ıShouldBeSeeingThatCityFieldAsForAddressInformationTabInTheCorporateCustomerPage(String cityName) {
        createCorporateCustomerPage
                .controlCityFieldValue(cityName);
    }

    @When("I create New Corporate Customer")
    public void ıCreateNewCorporateCustomer() throws Throwable {
        createCorporateCustomerPage
                .createCorporateCustomer();
    }

    @And("I should be seeing New Contact Medium panel for Corporate Customer")
    public void ıShouldBeSeeingNewContactMediumPanelForCorporateCustomer() {
        createCorporateCustomerPage
                .controlMediumPanel();
    }

    @When("I click add button on New Contact Medium panel for Corporate Customer")
    public void ıClickAddButtonOnNewContactMediumPanelForCorporateCustomer() throws Throwable {
        createCorporateCustomerPage
                .clickAddNewContactMediumButton();
    }

    @Then("I should be seeing that is area : {string} DropdownList for Corporate Customer")
    public void ıShouldBeSeeingThatIsAreaDropdownListForCorporateCustomer(String fieldName) {
        createCorporateCustomerPage
                .controlField(fieldName);
    }

    @When("I select the {string} value from Medium Type DropdownList for Corporate Customer")
    public void ıSelectTheValueFromMediumTypeDropdownListForCorporateCustomer(String mediumType) throws Throwable {
        createCorporateCustomerPage
                .selectMediumType(mediumType);
    }

    @When("I select the {string} value from Contact Type DropdownList for Corporate Customer")
    public void ıSelectTheValueFromContactTypeDropdownListForCorporateCustomer(String contactType) throws Throwable {
        createCorporateCustomerPage
                .selectContactType(contactType);
    }

    @When("I enter a value {string} in the Email Address field for Corporate Customer")
    public void ıEnterAValueInTheEmailAddressFieldForCorporateCustomer(String email) throws Throwable {
        createCorporateCustomerPage
                .enterEmailAddress(email);
    }

    @When("I enter a value {string} in the Telephone Number Address field for Corporate Customer")
    public void ıEnterAValueInTheTelephoneNumberAddressFieldForCorporateCustomer(String phoneNumber) {
        createCorporateCustomerPage
                .enterPhoneNumberMediumContact(phoneNumber);
    }

    @When("I click Delete button for Corporate Customer")
    public void ıClickDeleteButtonForCorporateCustomer() throws InterruptedException {
        createCorporateCustomerPage
                .clickDeleteButton();
    }

    @Then("I should be seeing the popup alert message for Medium Contact {string} for Corporate Customer")
    public void ıShouldBeSeeingThePopupAlertMessageForMediumContactForCorporateCustomer(String expectedMessage) throws Throwable {
        createCorporateCustomerPage
                .controlAlertMessage(expectedMessage);
    }

    @When("I click Next button for Contact Information in the Corporate Customer Page")
    public void ıClickNextButtonForContactInformationInTheCorporateCustomerPage() throws Throwable {
        createCorporateCustomerPage
                .clickNextButtonAddressInformation();
    }

    @When("I click Add button for Corporate Customer")
    public void I_click_Add_button_for_Corporate_Customer() throws Throwable {
        createCorporateCustomerPage
                .clickAddButton();
    }

    @When("I select a value {string} in the Communication Method for Corporate Customer")
    public void I_select_a_value_in_the_Communication_Method_for_Corporate_Customer(String communicationType) throws Throwable {
        createCorporateCustomerPage
                .selectCommunicationType(communicationType);
    }

    @Then("I should be seeing that values are {string} {string} {string} {string} {string} {string} {string} in the Communication Method field")
    public void ıShouldBeSeeingThatValuesAreInTheCommunicationMethodField(String salesVisit, String phone, String directMail, String email, String wirelessMessage, String sms, String fax) throws Throwable {
        createCorporateCustomerPage
                .controlCommunicationMethodField(salesVisit, phone, directMail, email, wirelessMessage, sms, fax);
    }

    @And("I enter a value {string} in the Identification Number Two field for Corporate Customer")
    public void ıEnterAValueInTheIdentificationNumberTwoFieldForCorporateCustomer(String identificationNumber) throws Throwable {
        createCorporateCustomerPage
                .enterIdentificationNumberTwo(identificationNumber);
    }

    @Then("I should be seeing that 2 area : {string},{string} for Admin Information tab in the Create Corporate Customer page")
    public void ıShouldBeSeeingThatAreaForAdminInformationTabInTheCreateCorporateCustomerPage(String issuingDate, String documentNumber) {
        createCorporateCustomerPage
                .controlDocumentCollection(issuingDate, documentNumber);
    }

    @And("I should be seeing that Document Type field as {string} for Corporate Customer")
    public void ıShouldBeSeeingThatDocumentTypeFieldAsForCorporateCustomer(String documentType) {
        createCorporateCustomerPage
                .controlDefaultDocumentType(documentType);
    }

    @And("I click Cancel File button for Corporate Customer")
    public void ıClickCancelFileButtonForCorporateCustomer() throws Throwable {
        createCorporateCustomerPage
                .clickCancelFileButton();
    }

    @Then("I should be seeing the message {string} for Corporate Customer")
    public void ıShouldBeSeeingTheMessageForCorporateCustomer(String fileDeleteMessage) throws Throwable {
        createCorporateCustomerPage
                .controlFileDeleteMessage(fileDeleteMessage);
    }

    @When("I add file greater than 5MB in the Document File field for Corporate Customer")
    public void ıAddFileGreaterThanMBInTheDocumentFileFieldForCorporateCustomer() throws Throwable {
        createCorporateCustomerPage
                .enterGreaterThanFiveMBDocumentFile();
    }

    @And("I enter a value {string} in the Address Line Two field for Corporate Customer")
    public void ıEnterAValueInTheAddressLineTwoFieldForCorporateCustomer(String addressLineTwo) throws Throwable {
        createCorporateCustomerPage
                .enterAddressLineTwo(addressLineTwo);
    }

    @When("I enter a value {string} in the NIPT field and choose registered user")
    public void ıEnterAValueInTheNIPTFieldAndChooseRegisteredUser(String niptNumber) throws Throwable {
        createCorporateCustomerPage
                .enterNIPTNumberRegisteredUser(niptNumber);
    }

    @When("I click Save button for Corporate Customer")
    public void ıClickSaveButtonForCorporateCustomer() {
        createCorporateCustomerPage
                .clickSaveButton();
    }

    @When("I enter a value {string} from Dropdown List in Place Of Birth field for Corporate Customer")
    public void ıEnterAValueFromDropdownListInPlaceOfBirthFieldForCorporateCustomer(String placeOfBirth) throws Throwable {
        createCorporateCustomerPage
                .enterPlaceOfBirth(placeOfBirth);
    }

    @When("I click the Document Add button for Corporate Customer")
    public void ıClickTheDocumentAddButton() throws Throwable {
        createCorporateCustomerPage
                .clickDocumentAddButton();
    }

    @Then("I click Service Address switch for Corporate Customer")
    public void iClickandDeactivateAlsoServiceAddressSlider() throws Throwable {
        createCorporateCustomerPage
                .clickandDeactivateAlsoServiceAddressButton();
    }

    @Then("I should be seeing that {string},{string},{string},{string},{string},{string}  fields are displayed for Also Service Address Button")
    public void iShouldBeSeeingThatFieldsAreDisplayedForAlsoServiceAddressButton(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5) {
        createCorporateCustomerPage
                .controlAlsoServiceAddressInformationField(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @And("I should be seeing that the default value of the Medium Type Field is {string} is displayed for Also Service Address")
    public void iShouldBeSeeingThatTheDefaultValueOfTheMediumTypeFieldIsIsDisplayedForAlsoServiceAddress(String serviceMediumTypeValue) throws Throwable {
        createCorporateCustomerPage
                .controlAlsoServiceAddressDefaultMediumType(serviceMediumTypeValue);
    }

    @And("I should be seeing that Contact Type Field default value of the Contact Type Field is {string} is displayed for Also Service Address")
    public void iShouldBeSeeingThatContactTypeFieldDefaultValueOfTheContactTypeFieldIsIsDisplayedForAlsoServiceAddress(String serviceContactTypeValue) {
        createCorporateCustomerPage
                .controlAlsoServiceAddressServiceContactTypeValue(serviceContactTypeValue);
    }

    @And("I should be seeing that Country field as {string} for Also Service Address")
    public void iShouldBeSeeingThatCountryFieldAsForAlsoServiceAddress(String serviceCountryValue) throws Throwable {
        createCorporateCustomerPage
                .controlAlsoServiceCountryValue(serviceCountryValue);
    }

    @When("I enter a value {string} in the Address Line One field for Also Service Address")
    public void iEnterAValueInTheAddressLineOneFieldForAlsoServiceAddress(String serviceAddressLineOne) throws Throwable {
        createCorporateCustomerPage
                .enterServiceAddressLineOne(serviceAddressLineOne);
    }

    @Then("I should be seeing that City field is displayed as Dropdownlist for Also Service Address")
    public void iShouldBeSeeingThatCityFieldIsDisplayedAsDropdownlistForAlsoServiceAddress() {
        createCorporateCustomerPage
                .controlAlsoServiceAddressCity();
    }

    @When("I select a value {string} in the City field for Also Service Address")
    public void iSelectAValueInTheCityFieldForAlsoServiceAddress(String serviceCity) throws Throwable {
        createCorporateCustomerPage
                .selectServiceCity(serviceCity);
    }

    @Then("I should be seeing that City field as {string} for Also Service Address")
    public void iShouldBeSeeingThatCityFieldAsForAlsoServiceAddress(String serviceCity) {
        createCorporateCustomerPage
                .controlAlsoServiceAddressCityValue(serviceCity);
    }

    @And("I enter a value {string} in the Address Line Two field for Also Service Address")
    public void iEnterAValueInTheAddressLineTwoFieldForAlsoServiceAddress(String address) throws Throwable {
        createCorporateCustomerPage
                .enterServiceAddressLineTwo(address);
    }

    @When("I enter a new value {string} in the Work Number field for Corporate Customer")
    public void ıEnterANewValueInTheWorkNumberFieldForCorporateCustomer(String workNumber) throws Throwable {
        createCorporateCustomerPage
                .enterWorkNumber(workNumber);
    }

    @When("I click Birth Date close button for Corporate Customer")
    public void ıClickBirthDateCloseButtonForCorporateCustomer() throws Throwable {
        createCorporateCustomerPage
                .clickBirthDateCloseButton();
    }

    @When("I click the Invoice Account Information tab")
    public void ıClickTheInvoiceAccountInformationTab() throws Throwable {
        createCorporateCustomerPage
                .clickInvoiceAccountInformationTab();
    }

    @And("I should be seeing that {string} field is displayed for Invoice Account Information tab")
    public void ıShouldBeSeeingThatFieldIsDisplayedForInvoiceAccountInformationTab(String fieldName) {
        createCorporateCustomerPage
                .controlInvoiceAccountField(fieldName);
    }

    @When("I select a value {string} in the Bill Media field")
    public void ıSelectAValueInTheBillMediaField(String billMedia) throws Throwable {
        createCorporateCustomerPage
                .selectBillMedia(billMedia);
    }

    @When("I select a value {string} in the Currency field")
    public void ıSelectAValueInTheCurrencyField(String currency) throws Throwable {
        createCorporateCustomerPage
                .selectCurrency(currency);
    }

    @When("I select a value {string} in the Payment Type field")
    public void ıSelectAValueInThePaymentTypeField(String paymentType) throws Throwable {
        createCorporateCustomerPage
                .selectPaymentType(paymentType);
    }

    @When("I enter a value {string} in the Description field")
    public void ıEnterAValueInTheDescriptionField(String description) throws Throwable {
        createCorporateCustomerPage
                .enterDescription(description);
    }

    @When("I select a value {string} in the Payment Method field")
    public void ıSelectAValueInThePaymentMethodField(String paymentMethod) throws Throwable {
        createCorporateCustomerPage
                .selectPaymentMethod(paymentMethod);
    }

    @When("I select a value {string} in the Bank Name field")
    public void ıSelectAValueInTheBankNameField(String bankName) throws Throwable {
        createCorporateCustomerPage
                .selectBankName(bankName);
    }

    @When("I enter a value {string} in the Bank Account No field")
    public void ıEnterAValueInTheBankAccountNoField(String bankAccountNo) throws InterruptedException {
        createCorporateCustomerPage
                .enterBankAccountNo(bankAccountNo);
    }

    @When("I select a value {string} in the Owner field")
    public void ıSelectAValueInTheOwnerField(String owner) throws Throwable {
        createCorporateCustomerPage
                .enterOwner(owner);
    }

    @When("I click the Next Button for Invoice Account Information")
    public void ıClickTheNextButtonForInvoiceAccountInformation() throws Throwable {
        createCorporateCustomerPage
                .clickNextButtonForInvoiceAccountInformation();
    }

    @Then("I should be seeing that values of Currency field are {string}, {string}, {string}")
    public void ıShouldBeSeeingThatValueOfCurrencyFieldIs(String fieldNameOne,String fieldNameTwo,String fieldNameThree) throws Throwable {
        createCorporateCustomerPage
                .controlCurrencyField(fieldNameOne,fieldNameTwo,fieldNameThree);
    }

    @And("I should be seeing that values of Bill Media field are {string}, {string}, {string}")
    public void ıShouldBeSeeingThatValuesOfBillMediaFieldAre(String fieldNameOne, String fieldNameTwo, String fieldNameThree) throws Throwable {
        createCorporateCustomerPage
                .controlBillMediaFieldInvoiceTab(fieldNameOne,fieldNameTwo,fieldNameThree);
    }

    @Then("I should be seeing that values of Payment Type field are {string}, {string}")
    public void ıShouldBeSeeingThatValuesOfPaymentTypeFieldAre(String fieldNameOne, String fieldNameTwo) throws Throwable {
        createCorporateCustomerPage
                .controlPaymentTypeField(fieldNameOne,fieldNameTwo);
    }

    @Then("I should be seeing that values of Payment Method field are {string}, {string}")
    public void ıShouldBeSeeingThatValuesOfPaymentMethodFieldAre(String fieldNameOne, String fieldNameTwo) throws Throwable {
        createCorporateCustomerPage
                .controlPaymentMethodField(fieldNameOne,fieldNameTwo);
    }

    @And("I click Issuing Date close button for Corporate Customer")
    public void ıClickIssuingDateCloseButtonForCorporateCustomer() throws Throwable {
        createCorporateCustomerPage
                .clickIssuingDateCloseButton();
    }

    @Then("I should be seeing that {string} field is displayed for Admin Information Tab")
    public void ıShouldBeSeeingThatFieldIsDisplayedForAdminInformationTab(String fieldName) throws Throwable {
        createCorporateCustomerPage
                .controlAdminInformationFieldTwo(fieldName);
    }

    @And("I add file in the Document File field for Corporate Customer for General information TAB")
    public void ıAddFileInTheDocumentFileFieldForCorporateCustomerForGeneralInformationTAB() throws Throwable {
        createCorporateCustomerPage
                .enterDocumentFileGeneral();
    }

    @And("I select {string} in the Document Type field for Corporate Customer for General TAB")
    public void ıSelectInTheDocumentTypeFieldForCorporateCustomerForGeneralTAB(String documentType) throws Throwable {
        createCorporateCustomerPage
                .selectDocumentTypeGeneral(documentType);
    }

    @And("I enter a value {string} in the Issuing Date for Corporate Customer for General TAB")
    public void ıEnterAValueInTheIssuingDateForCorporateCustomerForGeneralTAB(String issuingDate) throws Throwable{
        createCorporateCustomerPage
                .enterIssuingDateGeneral(issuingDate);
    }


    @When("I select one of the Country {string} from list different corporate from Albenia")
    public void ıSelectOneOfTheCountryFromListDifferentCorporateFromAlbenia(String countryPhoneCode) throws Throwable{
        createCorporateCustomerPage
                .selectCorporateCountryPhoneCode(countryPhoneCode);
    }

    @When("I select one of the Work Phone Country {string} from list different corporate from Albenia")
    public void ıSelectOneOfTheWorkPhoneCountryFromListDifferentCorporateFromAlbenia(String countryWorkPhoneCode) throws Throwable {
        createCorporateCustomerPage
                .selectCorporateWorkCountryPhoneCode(countryWorkPhoneCode);
    }

    @And("I enter a value {string} in the Mobile Work Number field for Corporate Customer")
    public void ıEnterAValueInTheMobileWorkNumberFieldForCorporateCustomer(String workPhoneNumber) throws Throwable {
        createCorporateCustomerPage
                .enterWorkPhoneNumber(workPhoneNumber);
    }

    @And("I should be seeing that values of Currency Prepaid field are {string}, {string}, {string}")
    public void ıShouldBeSeeingThatValuesOfCurrencyPrepaidFieldAre(String fieldNameOne,String fieldNameTwo,String fieldNameThree) throws Throwable {
        createCorporateCustomerPage
                .controlCurrencyPrepaidField(fieldNameOne,fieldNameTwo,fieldNameThree);
    }

    @When("I select a value {string} in the Currency Prepaid field")
    public void ıSelectAValueInTheCurrencyPrepaidField(String currencyPrepaid) throws Throwable {
        createCorporateCustomerPage
                .selectCurrencyPrepaid(currencyPrepaid);
    }

    @And("I enter a value {string} in the Description Prepaid field")
    public void ıEnterAValueInTheDescriptionPrepaidField(String description) throws Throwable {
        createCorporateCustomerPage
                .enterDescriptionPrepaid(description);
    }

    @And("I select a value {string} from Dropdown List in the Customer Type field")
    public void ıSelectAValueFromDropdownListInTheCustomerTypeField(String customerType) throws Throwable {
        createCorporateCustomerPage
                .selectCustomerType(customerType);
    }

    @And("I select a value {string} from Dropdown List in the Segment field")
    public void ıSelectAValueFromDropdownListInTheSegmentField(String segment) throws Throwable {
        createCorporateCustomerPage
                .selectSegment(segment);
    }

    @Then("I should be seeing {string},{string}, {string},{string},{string},{string} and {string} in the Segment field")
    public void ıShouldBeSeeingAndInTheSegmentField(String titleOne, String titleTwo, String titleThree, String titleFour, String titleFive, String titleSix, String titleSeven) throws Throwable {
        createCorporateCustomerPage
                .controlSegmentField(titleOne,titleTwo,titleThree,titleFour,titleFive,titleSix,titleSeven);
    }

    @Then("I should be seeing JuridicalInfo field is populated as {string}")
    public void ıShouldBeSeeingJuridicalInfoFieldIsPopulatedAs(String expectedValue) {
        createCorporateCustomerPage
                .controlJuridicalInfoFieldValue(expectedValue);
    }

    @And("I add file in the Document File field in the Corporate Customer for One AddDocumentButton")
    public void ıAddFileInTheDocumentFileFieldInTheCorporateCustomerForOneAddDocumentButton() throws Throwable {
        createCorporateCustomerPage
                .enterDocumentFileForOneAddDocumentButton();
    }

    @And("I click Cancel File button for Corporate Customer for General information TAB")
    public void ıClickCancelFileButtonForCorporateCustomerForGeneralInformationTAB() throws Throwable {
        createCorporateCustomerPage
                .clickCancelFileButtonForGeneralInformationTab();
    }

    @When("I add png file in the Document File field for Corporate Customer for General information TAB")
    public void ıAddPngFileInTheDocumentFileFieldForCorporateCustomerForGeneralInformationTAB() throws Throwable {
        createCorporateCustomerPage
                .enterDocumentFileGeneralForPngFile();
    }

    @When("I add pdf file in the Document File field for Corporate Customer for General information TAB")
    public void ıAddPdfFileInTheDocumentFileFieldForCorporateCustomerForGeneralInformationTAB() throws Throwable {
        createCorporateCustomerPage
                .enterDocumentFileGeneralForPdfFile();
    }

    @When("I add file greater than 5MB in the Document File field for Corporate Customer for General information TAB")
    public void ıAddFileGreaterThanMBInTheDocumentFileFieldForCorporateCustomerForGeneralInformationTAB() throws Throwable {
        createCorporateCustomerPage
                .enterDocumentFileGeneralForThan5MB();
    }

    @When("I add png file greater than 5MB in the Document File field for Corporate Customer for General information TAB")
    public void ıAddPngFileGreaterThanMBInTheDocumentFileFieldForCorporateCustomerForGeneralInformationTAB() throws Throwable {
        createCorporateCustomerPage
                .enterDocumentFileGeneralForThan5MBPngFile();
    }

    @When("I add txt file in the Document File field for Corporate Customer for General information TAB")
    public void ıAddTxtFileInTheDocumentFileFieldForCorporateCustomerForGeneralInformationTAB() throws Throwable {
        createCorporateCustomerPage
                .enterDocumentFileGeneralForTxtFile();
    }

    @When("I add pdf file greater than 5MB in the Document File field for Corporate Customer for General information TAB")
    public void ıAddPdfFileGreaterThanMBInTheDocumentFileFieldForCorporateCustomerForGeneralInformationTAB() throws Throwable {
        createCorporateCustomerPage
                .enterDocumentFileGeneralForThan5MBPdfFile();
    }

    @And("I should be seeing that Place Of Birth city list value")
    public void ıShouldBeSeeingThatPlaceOfBirthCityListValue() throws Throwable {
        createCorporateCustomerPage
                .controlPlaceOfBirthDropdownListValue();
    }

    @And("I should be seeing that Address City list value")
    public void ıShouldBeSeeingThatAddressCityListValue() throws Throwable {
        createCorporateCustomerPage
                .controlAddressCityDropdownListValue();
    }

    @Then("I should be seeing that Tax Exemption field is selected")
    public void ıShouldBeSeeingThatTaxExemptionFieldIsSelected() {
        createCorporateCustomerPage
                .controlTaxExemptionFieldValue();
    }

    @And("I click the Next Button for Other Information")
    public void ıClickTheNextButtonForOtherInformation() throws Throwable {
        createCorporateCustomerPage
                .clickNextButtonInvoiceInformation();
    }

    @And("I enter a value {string} in the Email field for Corporate Customer for General TAB")
    public void ıEnterAValueInTheEmailFieldForCorporateCustomerForGeneralTAB(String email) throws Throwable {
        createCorporateCustomerPage
                .enterEmailForGeneralInformation(email);
    }

    @When("I enter a value {string} in the Mobile Number field for Corporate Customer for General TAB")
    public void ıEnterAValueInTheMobileNumberFieldForCorporateCustomerForGeneralTAB(String mobileNumber) throws Throwable {
        createCorporateCustomerPage
                .enterMobileNumberForGeneralTab(mobileNumber);
    }

    @And("I click Send Pin button for Corporate Customer for General TAB")
    public void ıClickSendPinButtonForCorporateCustomerForGeneralTAB() throws Throwable {
        createCorporateCustomerPage
                .clickSendPinButton();
    }

    @And("I enter a value {string} Pin field for Corporate Customer for General TAB")
    public void ıEnterAValuePinFieldForCorporateCustomerForGeneralTAB(String pinValue) throws Throwable {
        createCorporateCustomerPage
                .enterPinValue(pinValue);
    }

    @And("I click Validate Pin button for Corporate Customer for General TAB")
    public void ıClickValidatePinButtonForCorporateCustomerForGeneralTAB() throws Throwable {
        createCorporateCustomerPage
                .clickValidatePinButton();
    }

    @And("I click Send Pin button for Corporate Customer for Admin TAB")
    public void ıClickSendPinButtonForCorporateCustomerForAdminTAB() throws Throwable {
        createCorporateCustomerPage
                .clickSendPinButtonForAdminTab();
    }

    @And("I enter a value {string} Pin field for Corporate Customer for Admin TAB")
    public void ıEnterAValuePinFieldForCorporateCustomerForAdminTAB(String pinValue) throws Throwable {
        createCorporateCustomerPage
                .enterPinValueForAdminTab(pinValue);
    }

    @And("I click Validate Pin button for Corporate Customer for Admin TAB")
    public void ıClickValidatePinButtonForCorporateCustomerForAdminTAB() throws Throwable {
        createCorporateCustomerPage
                .clickValidatePinButtonForAdminTab();
    }

    @When("I click the Next Button for Contact Information")
    public void ıClickTheNextButtonForContactInformation() throws Throwable {
        createCorporateCustomerPage
                .clickNextButtonForContacInformation();
    }

    @And("I click the Next Button for Other Information for Corporate Customer")
    public void ıClickTheNextButtonForOtherInformationForCorporateCustomer() throws Throwable {
        createCorporateCustomerPage
                .clickNextButtonForOtherInformation();
    }

    @When("I click the Contact Information tab")
    public void ıClickTheContactInformationTab() throws Throwable {
        createCorporateCustomerPage
                .clickContactInformation();
    }

    @And("I enter a value {string} in the Mobile Number field for Corporate Contact Tab")
    public void ıEnterAValueInTheMobileNumberFieldForCorporateContactTab(String mobileNumber) throws Throwable {
        createCorporateCustomerPage
                .enterMobileNumberForContactTab(mobileNumber);
    }

    @And("I enter a value {string} in the Email field for Corporate Contact Tab")
    public void ıEnterAValueInTheEmailFieldForCorporateContactTab(String email) throws Throwable {
        createCorporateCustomerPage
                .enterEmailForContactTab(email);
    }
}

