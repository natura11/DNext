package optiim.steps.gui.customermanagement;

import optiim.framework.UrlBuilder;
import optiim.framework.helpers.WebDriverHelper;
import optiim.framework.helpers.WorldHelper;
import optiim.pages.customermanagement.Customer360Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class Customer360Steps {

    private final WebDriverHelper webDriverHelper;
    private final UrlBuilder urlBuilder;
    private final Customer360Page customer360Page;
    private final WorldHelper worldHelper;


    @Then("I should be seeing that the {string} page is opened")
    public void I_should_be_seeing_that_the_page_is_opened(String pageName) throws Throwable {
        customer360Page
                .controlPage(pageName);
    }

    @And("I should be seeing that Select Search Type field is a Dropdown list")
    public void ıShouldBeSeeingThatSelectSearchTypeFieldIsADropdownList() {
        customer360Page
                .controlSearchTypeDropdown();
    }

    @When("I select the {string} value from Select Search Type DropdownList")
    public void ıSelectTheValueFromSelectSearchTypeDropdownList(String searchType) throws Throwable {
        customer360Page
                .selectSearchType(searchType);
    }

    @When("I enter {string} value on Search field and click Search button")
    public void ıEnterValueOnSearchFieldAndClickSearchButton(String searchValue) throws Throwable {

        customer360Page
                .enterSearchValue(searchValue);
    }

    @Then("I should be seeing that a related customer can be displayed")
    public void ıShouldBeSeeingThatARelatedCustomerCanBeDisplayed() throws Throwable {
        customer360Page
                .controlSearchCustomer();
    }

    @When("I click on related customer from search list")
    public void ıClickOnRelatedCustomerFromSearchList() throws Throwable {
        customer360Page
                .clickSearchCustomer();
    }

    @Then("I should be seeing that {string}, {string}, {string}, {string} in the Residential Customer 360 Degree View Page")
    public void ıShouldBeSeeingThatResidentialCustomerDegreeViewPageIsOpened(String mainPage, String product, String order, String hierarchy) throws Throwable {
        customer360Page
                .controlCustomerDetailTab(mainPage, product, order, hierarchy);
    }

    @Then("I should be seeing that Main Page includes {string}, {string} and {string} tabs")
    public void ıShouldBeSeeingThatMainPageIncludesAndTabs(String general, String address, String contact) {
        customer360Page
                .controlMainPageTabField(general, address, contact);
    }

    @Then("I should be seeing that {string}, {string}, {string}, {string}, {string} and {string} widgets are displayed in General tab")
    public void ıShouldBeSeeingThatAndWidgetsAreDisplayedInTab(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5) {
        customer360Page
                .controlGeneralTabField(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @When("I click Product button for Customer360 Page")
    public void ıClickProductButtonForCustomerPage() throws Throwable {
        customer360Page
                .clickProductTabButton();
    }

    @Then("I should be seeing that  {string} widget is displayed in the Tab")
    public void ıShouldBeSeeingThatWidgetIsDisplayedInTab(String tabName) throws Throwable {
        customer360Page
                .controlProductTabField(tabName);
    }

    @When("I click Order button for Customer360 Page")
    public void ıClickOrderButtonForCustomerPage() throws Throwable {
        customer360Page
                .clickOrderTabButton();
    }

    @When("I click Hierarchy button for Customer360 Page")
    public void ıClickHierarchyButtonForCustomerPage() throws Throwable {
        customer360Page
                .clickHierarchyTabButton();
    }

    @And("I should be seeing that {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string} values are displayed")
    public void ıShouldBeSeeingThatValuesAreDisplayed(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8) throws Throwable {
        customer360Page
                .controlSearchTypeDropdownField(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @When("I click Search Customer Close button")
    public void ıClickSearchCustomerCloseButton() throws Throwable {
        customer360Page
                .clickSearchCustomerCloseButton();
    }

    @When("I click the {string} Button")
    public void ıClickTheButton(String buttonName) throws Throwable {
        customer360Page
                .clickButton(buttonName);
    }

    @Then("I should be seeing that Trouble Tickets list that are created before 30 days is displayed for related customer")
    public void ıShouldBeSeeingThatTroubleTicketsListThatAreCreatedBeforeDaysIsDisplayedForRelatedCustomer() throws Throwable {
        customer360Page
                .controlTicketList();
    }

    @When("I click Address button for Customer360 Page")
    public void ıClickAddressButtonForCustomerPage() throws Throwable {
        customer360Page
                .clickAddressTabButton();
    }

    @Then("I should be seeing that {string} for Tab")
    public void ıShouldBeSeeingThatForTab(String fieldName) throws Throwable {
        customer360Page
                .controlTabField(fieldName);
    }

    @When("I click {string} widget")
    public void ıClickWidget(String widgetName) throws Throwable {
        customer360Page
                .clickWidget(widgetName);
    }


    @Then("I should be seeing that the {string} widget is opened")
    public void ıShouldBeSeeingThatTheWidgetIsOpened(String widgetName) {
        customer360Page
                .controlWidget(widgetName);
    }

    @Then("I should be seeing that {string}, {string}, {string}, {string} fields are displayed for Billing Widget")
    public void ıShouldBeSeeingThatFieldsAreDisplayedForBillingWidget(String addressLineOne, String addressLineTwo, String country, String city) {
        customer360Page
                .controlBillingWidgetField(addressLineOne, addressLineTwo, country, city);
    }

    @And("I should be seeing that the value of  the {string} is correct to the related corporate customer for Billing Widget")
    public void ıShouldBeSeeingThatTheValueOfTheIsCorrectToTheRelatedCorporateCustomer(String fieldName) {
        customer360Page
                .controlBillingWidgetValue(fieldName);
    }

    @And("I should be seeing that {string}, {string}, {string}, {string} fields are displayed for Service Widget")
    public void ıShouldBeSeeingThatFieldsAreDisplayedForServiceWidget(String addressLineOne, String addressLineTwo, String country, String city) {
        customer360Page
                .controlServiceWidgetField(addressLineOne, addressLineTwo, country, city);
    }

    @And("I should be seeing that the value of  the {string} is correct to the related corporate customer for Service Widget")
    public void ıShouldBeSeeingThatTheValueOfTheIsCorrectToTheRelatedCorporateCustomerForServiceWidget(String fieldName) {
        customer360Page
                .controlServiceWidgetValue(fieldName);
    }

    @And("I should be seeing that {string} field is displayed for Widget")
    public void ıShouldBeSeeingThatFieldIsDisplayedForWidget(String fieldName) {
        customer360Page
                .controlWidgetField(fieldName);
    }

    @And("I should be seeing that the value of  the {string} is correct to the related residential customer for CustomerParty Related Info Widget")
    public void ıShouldBeSeeingThatTheValueOfTheIsCorrectToTheRelatedResidentialCustomerForCustomerPartyRelatedInfoWidget(String fieldName) throws Throwable {
        customer360Page
                .controlCustomerPartyRelatedInfoWidgetValue(fieldName);
    }

    @And("I should be seeing that the value of  the {string} is correct to the related residential customer for Billing Widget")
    public void ıShouldBeSeeingThatTheValueOfTheIsCorrectToTheRelatedResidentialCustomerForBillingWidget(String fieldName) {
        customer360Page
                .controlResidentialBillingWidgetValue(fieldName);
    }

    @And("I should be seeing that the value of  the {string} is correct to the related residential customer for Service Widget")
    public void ıShouldBeSeeingThatTheValueOfTheIsCorrectToTheRelatedResidentialCustomerForServiceWidget(String fieldName) {
        customer360Page
                .controlResidentialServiceWidgetValue(fieldName);
    }

    @When("I click {string} Tab for Customer360 Page")
    public void ıClickTabForCustomerPage(String tabName) throws Throwable {
        customer360Page
                .clickTab(tabName);
    }

    @And("I should be seeing that the value of  the {string} is correct to the related residential customer for Authorized Widget")
    public void ıShouldBeSeeingThatTheValueOfTheIsCorrectToTheRelatedResidentialCustomerForAuthorizedWidget(String fieldName) throws Throwable {
        customer360Page
                .controlResidentialAuthorizedCustomerWidgetValue(fieldName);
    }

    @And("I should be seeing that {string} field is displayed for Document Info widget")
    public void ıShouldBeSeeingThatFieldIsDisplayedForDocumentInfoWidget(String fieldName) {
        customer360Page
                .controlDocumentInfoWidgetField(fieldName);
    }

    @And("I should be seeing that the value of  the {string} is correct to the related residential customer for Document Info")
    public void ıShouldBeSeeingThatTheValueOfTheIsCorrectToTheRelatedResidentialCustomerForDocumentInfo(String fieldName) {
        customer360Page
                .controlDocumentInfoWidgetValue(fieldName);
    }

    @And("I should be seeing that the value of  the {string} is correct to the related corporate customer for Admin Information Widget")
    public void ıShouldBeSeeingThatTheValueOfTheIsCorrectToTheRelatedCorporateCustomerForAdminInformationWidget(String fieldName) throws Throwable {
        customer360Page
                .controlAdminInformationWidgetValue(fieldName);
    }

    @And("I should be seeing that the value of  the {string} is correct to the related corporate customer for Document Info")
    public void ıShouldBeSeeingThatTheValueOfTheIsCorrectToTheRelatedCorporateCustomerForDocumentInfo(String fieldName) throws Throwable {
        customer360Page
                .controlCorporateDocumentInfoWidgetValue(fieldName);
    }

    @When("I click Edit button for Customer360 Page")
    public void ıClickEditButtonForCustomerPage() throws Throwable {
        customer360Page
                .clickEditButton();
    }

    @Then("I should be seeing that {string} Button is not active")
    public void ıShouldBeSeeingThatButtonIsNotActive(String fieldName) throws Throwable {
        customer360Page
                .controlNotActiveField(fieldName);
    }

    @And("I should be seeing that {string} field is displayed for Billing Account & Products Widget")
    public void ıShouldBeSeeingThatFieldIsDisplayedForBillingAccountProductsWidget(String fieldName) {
        customer360Page
                .controlBillingAccountAndProductsWidgetField(fieldName);
    }

    @Then("I should be seeing that {string} for Product Tab")
    public void ıShouldBeSeeingThatForProductTab(String productName) {
        customer360Page
                .controlProductTabListField(productName);
    }

    @When("I click {string} for Product widget")
    public void ıClickForProductWidget(String productName) throws Throwable {
        customer360Page
                .clickProduct(productName);
    }

    @Then("I should be seeing that {string} field is displayed for Product Widget")
    public void ıShouldBeSeeingThatFieldIsDisplayedForProductWidget(String fieldName) throws Throwable {
        customer360Page
                .controlProductField(fieldName);
    }

    @When("I click {string} button for Product Widget")
    public void ıClickButtonForProductWidget(String buttonName) throws Throwable {
        customer360Page
                .clickProductButton(buttonName);
    }

    @Then("I should be seeing that an Icon which contains the URL Link at the top of Customer page")
    public void ıShouldBeSeeingThatAnIconWhichContainsTheURLLinkAtTheTopOfCustomerPage() {
        customer360Page
                .controlCopyUrlLink();
    }

    @When("I click Icon to copy URL link")
    public void ıClickIconToCopyURLLink() throws Throwable {
        customer360Page
                .clickCopyUrlLink();
    }

    @Then("I should be seeing the popup alert message {string} for Customer360 Page")
    public void ıShouldBeSeeingThePopupAlertMessageForCustomerPage(String alertPopupMessage) throws Throwable {
        customer360Page
                .controlAlertPopupMessage(alertPopupMessage);
    }

    @And("I should be seeing that the related customer is displayed")
    public void ıShouldBeSeeingThatTheRelatedCustomerIsDisplayed() throws Throwable {
        customer360Page
                .controlNewTabCopyUrlLink();
    }


    @When("I click the New Order button")
    public void I_click_the_New_Order_button() throws Throwable {
        customer360Page
                .clickNewOrderButton();
    }

    @Then("I should be seeing that {string} {string} value updated for Widget")
    public void ıShouldBeSeeingThatValueUpdatedForWidget(String expectedValue, String fieldName) throws Throwable {
        customer360Page
                .controlBillingAddresWidgetValue(expectedValue, fieldName);
    }

    @And("I should be seeing that the value of  the {string} is correct to the related corporate customer for CustomerParty Related Info Widget")
    public void ıShouldBeSeeingThatTheValueOfTheIsCorrectToTheRelatedCorporateCustomerForCustomerPartyRelatedInfoWidget(String fieldName) throws Throwable {
        customer360Page
                .controlCustomerPartyRelatedInfoForCorporateWidgetValue(fieldName);
    }

    @And("I should be seeing that baseType and type are displayed as {string}")
    public void ıShouldBeSeeingThatBaseTypeAndTypeAreDisplayedAs(String expectedValue) {
        customer360Page
                .controlBaseTypeAndTypeFieldValue(expectedValue);
    }

    @Then("I should be seeing that the Name field is displayed as Full Name")
    public void ıShouldBeSeeingThatTheNameFieldIsDisplayedAsFullName() {
        customer360Page
                .controlFullName();
    }

    @Then("I should be seeing that status Button is displayed as {string} colour")
    public void ıShouldBeSeeingThatStatusButtonIsDisplayedAsColour(String colour) {
        customer360Page
                .controlProspectColour(colour);
    }

    @And("I should be seeing that {string} {string} value updated for Document Info Widget")
    public void ıShouldBeSeeingThatValueUpdatedForDocumentInfoWidget(String expectedValue, String fieldName) {
        customer360Page
                .controlDocumentInfoWidgetValueTwo(expectedValue, fieldName);
    }


    @Then("I should be seeing that {string} is displayed as {string}")
    public void ıShouldBeSeeingThatIsDisplayedAs(String fieldName, String expectedValue) {
        customer360Page
                .controlAddressFieldForBackendSide(fieldName,expectedValue);
    }

    @Then("I should be seeing that {string} value is displayed on the BE side for Characteristic field")
    public void ıShouldBeSeeingThatValueIsDisplayedOnTheBESideForCharacteristicField(String fieldName) {
        customer360Page
                .controlCharacteristicFieldForBackendSide(fieldName);
    }

    @When("I click on the Invoice button")
    public void ıClickOnTheInvoiceButton() throws InterruptedException {
        customer360Page
                .clickInvoiceButton();
    }

    @Then("I should be seeing that {string} field is displayed for Invoice Account Page")
    public void ıShouldBeSeeingThatFieldIsDisplayedForInvoicePage(String fieldName) {
        customer360Page
                .controlInvoicePageField(fieldName);
    }

    @Then("I should be seeing that {string} is displayed as {string} for Corporate Customer")
    public void ıShouldBeSeeingThatIsDisplayedAsForCorporateCustomer(String fieldName, String expectedValue) {
        customer360Page
                .controlAddressFieldBackendSideForCorporateCustomer(fieldName,expectedValue);
    }

    @Then("I should be seeing that {string} value is displayed on the BE side for Engaged Party field")
    public void ıShouldBeSeeingThatValueIsDisplayedOnTheBESideForEngagedPartyField(String fieldName) {
        customer360Page
                .controlEngagedPartyField(fieldName);
    }

    @Then("I should be seeing that Select Invoice Account dropdown is displayed for Product Tab")
    public void ıShouldBeSeeingThatSelectInvoiceAccountDropdownIsDisplayedForProductTab() {
        customer360Page
                .controlSelectInvoiceAccount();
    }

    @Then("I should be seeing that New Order button is displayed {string}")
    public void ıShouldBeSeeingThatNewOrderButtonIsDisplayed(String disabledStatus) throws Throwable {
        customer360Page
                .controlNewOrderButtonDisplayed(disabledStatus);
    }

    @When("I select a value {string} in Invoice Account field")
    public void ıSelectAValueInInvoiceAccountField(String invoiceAccount) throws Throwable {
        customer360Page
                .selectInvoiceAccount(invoiceAccount);
    }


    @When("I send {string} the agreement Id in the Agreement ID test box")
    public void ıSendTheAgreementIdInTheAgreementIDTestBox(String agreementıd) throws Throwable {
        customer360Page
                .sendagreementıd(agreementıd);
    }

    @When("I click Reprchase button")
    public void ıClickReprchaseButton() throws Throwable{
        customer360Page
                .clickRePurchase();
    }


    @Then("I should be seeing that starting F and 8 digit number for corporate customer number")
    public void ıShouldBeSeeingThatStartingFAndDigitNumberForCorporateCustomerNumber() {
        customer360Page
                .controlCorporateCustomerNumber();
    }

    @Then("I should be seeing that starting F and 8 digit number for Individual customer number")
    public void ıShouldBeSeeingThatStartingFAndDigitNumberForIndividualCustomerNumber() {
        customer360Page
                .controlIndividualCustomerNumber();
    }

    @Then("I should be seeing that starting F and 8 digit number for Individual and Corporate customer number for customer360 page")
    public void ıShouldBeSeeingThatStartingFAndDigitNumberForIndividualCustomerNumberForCustomerPage() throws Throwable {
        customer360Page
                .controlIndividualAndCorporateCustomerNumberFor360Page();
    }

    @When("I click the New Attachment button")
    public void ıClickTheNewAttachmentButton() throws Throwable {
        customer360Page
                .clickNewAttachmentButton();
    }

    @Then("I should be seeing that the values are {string}, {string} in the Document Type field")
    public void ıShouldBeSeeingThatTheValuesAreInTheDocumentTypeField(String fieldOne, String fieldTwo) throws Throwable {
        customer360Page
                .controlDocumentTypeField(fieldOne,fieldTwo);
    }

    @When("I select a value {string} in the Document Type field for Customer360 page")
    public void ıSelectAValueInTheDocumentTypeFieldForCustomerPage(String documentType) throws Throwable {
        customer360Page
                .selectDocumentType(documentType);
    }

    @When("I select a value {string} in the Document Issue Date field for Customer360 page")
    public void ıSelectAValueInTheDocumentIssueDateFieldForCustomerPage(String issuingDate) throws Throwable {
        customer360Page
                .selectIssuingDate(issuingDate);
    }

    @When("I enter a value {string} in the Document Number field for Customer360 page")
    public void ıEnterAValueInTheDocumentNumberFieldForCustomerPage(String documentNumber) throws Throwable {
        customer360Page
                .enterDocumentNumber(documentNumber);
    }

    @And("I add file in the Document File field for Customer360 page")
    public void ıAddFileInTheDocumentFileFieldForCustomerPage() throws Throwable {
        customer360Page
                .enterDocumentFile();
    }

    @And("I click the Done button")
    public void ıClickTheDoneButton() throws Throwable {
        customer360Page
                .clickDoneButton();
    }

    @Then("I should be seeing that the values are {string}, {string}, {string} for residential customer in the Document Type field")
    public void ıShouldBeSeeingThatTheValuesAreForResidentialCustomerInTheDocumentTypeField(String fieldOne, String fieldTwo, String fieldThree) throws Throwable {
        customer360Page
                .controlDocumentTypeFieldForResidential(fieldOne,fieldTwo,fieldThree);
    }

    @And("I should be seeing that the value of  the {string} is correct to the related residential party customer for Document Info")
    public void ıShouldBeSeeingThatTheValueOfTheIsCorrectToTheRelatedResidentialPartyCustomerForDocumentInfo(String fieldName) {
        customer360Page
                .controlDocumentInfoWidgetValueForPartyCustomer(fieldName);
    }

    @Then("I should be seeing that all the Resources attached to this Product")
    public void ıShouldBeSeeingThatAllTheResourcesAttachedToThisProduct() {
        customer360Page
                .controlTechnicalResources();
    }

    @Then("I should be seeing that one of the Resource attached to this Product is removed on PopUp Window")
    public void ıShouldBeSeeingThatOneOfTheResourceAttachedToThisProductIsRemovedOnPopUpWindow() throws Throwable {
        customer360Page
                .controlTechnicalResourcesDeleteProduct();
    }

    @When("I select a value {string} in the Resource Type field")
    public void ıSelectAValueInTheResourceTypeField(String resourceType) throws Throwable {
        customer360Page
                .selectResourceType(resourceType);
    }

    @And("I enter a value {string} in the PremiumValue field")
    public void ıEnterAValueInThePremiumValueField(String premiumValue) throws Throwable {
        customer360Page
                .enterPremiumValue(premiumValue);
    }

    @When("I click the Close button for Customer360 Page")
    public void ıClickTheCloseButtonForCustomerPage() throws Throwable {
        customer360Page
                .clickCloseButton();
    }

    @When("I click {string} button for Service Address widget")
    public void ıClickButtonForServiceAddressWidget(String buttonName) throws Throwable {
        customer360Page
                .clickTechnicalResourceButton(buttonName);
    }

    @When("I click Cancel File button for Customer360 Page")
    public void ıClickCancelFileButtonForCustomerPage() throws Throwable {
        customer360Page
                .clickCancelButton();
    }

    @When("I click the Products Panel for Billing Account & Products Widget")
    public void ıClickTheProductsPanelForBillingAccountProductsWidget() throws Throwable {
        customer360Page
                .clickProductsPanelButton();
    }

    @When("I click on the View button on the Document Info widget")
    public void ıClickOnTheViewButtonOnTheDocumentInfoWidget() throws Throwable {
        customer360Page
                .clickDocumentViewButton();
    }

    @Then("I should be seeing that document image popup")
    public void ıShouldBeSeeingThatDocumentImagePopup() throws Throwable {
        customer360Page
                .controlDocumentImagePopup();
    }

    @Then("I should be seeing that {string} value is displayed on the BE side for Characteristic field for Corporate Customer")
    public void ıShouldBeSeeingThatValueIsDisplayedOnTheBESideForCharacteristicFieldForCorporateCustomer(String fieldName) {
        customer360Page
                .controlCharacteristicFieldForBackendSideForCorporate(fieldName);
    }

    @Then("I should be seeing that the Name field is displayed as Full Name for Corporate Customer")
    public void ıShouldBeSeeingThatTheNameFieldIsDisplayedAsFullNameForCorporateCustomer() throws Throwable {
        customer360Page
                .controlFullNameForCorporateCustomer();
    }

    @When("I click on the {string} button")
    public void ıClickOnTheButton(String buttonName) throws Throwable {
        customer360Page
                .clickButtonTwo(buttonName);
    }

    @And("I should be seeing that Status of {string} product is {string}")
    public void ıShouldBeSeeingThatStatusOfProductIs(String productName, String status ) {
        customer360Page
                .controlProductStatus(productName,status);
    }

    @Then("I should be seeing that Customer is displayed in the Customer360 view page")
    public void ıShouldBeSeeingThatCustomerIsDisplayedInTheCustomerViewPage() throws Throwable {
        customer360Page
                .controlCustomer();
    }

    @And("I click Cancel button for Identification Number")
    public void ıClickCancelButtonForIdentificationNumber() throws Throwable {
        customer360Page
                .clickCancelButtonForIdentificationNumber();
    }

    @And("I enter a value {string} in the BirthDate field in the Corporate Customer for Customer360 Page")
    public void ıEnterAValueInTheBirthDateFieldInTheCorporateCustomerForCustomerPage(String birthDate) throws InterruptedException {
        customer360Page
                .enterBirthDate(birthDate);
    }

    @And("I click Shopping Cart Panel")
    public void ıClickShoppingCartPanel() throws Throwable {
        customer360Page
                .clickShoppingCartPanel();
    }

    @And("I should be seeing that {string} Product status is displayed as green colour")
    public void ıShouldBeSeeingThatProductStatusIsDisplayedAsGreenColour(String product) {
        customer360Page
                .controlProductDefaultStatus(product);
    }

    @Then("I should be seeing that {string}, {string} values in the Blacklist Flag Dropdown list")
    public void ıShouldBeSeeingThatValuesInTheBlacklistFlagDropdownList(String fieldOne, String fieldTwo) throws Throwable {
        customer360Page
                .controlBlacklistFlagDropdownValue(fieldOne,fieldTwo);
    }

    @When("I select a value {string} in the Blacklist Flag field")
    public void ıSelectAValueInTheBlacklistFlagField(String blacklistFlag) throws Throwable {
        customer360Page
                .selectBlacklistFlag(blacklistFlag);
    }

    @When("I click on related product from agreement list")
    public void ıClickOnRelatedProductFromAgreementList() throws Throwable {
        customer360Page
                .clickAgreementList();
    }

    @And("I should be seeing {string} for Agreement Detail Page")
    public void ıShouldBeSeeingForAgreementDetailPage(String fieldName) {
        customer360Page
                .controlAgreementDetailField(fieldName);
    }

    @Then("I should be seeing that the {string} is correct")
    public void ıShouldBeSeeingThatTheIsCorrect(String fieldName) throws Throwable {
        customer360Page
                .controlContactTabField(fieldName);
    }

    @When("I click second Edit button for Customer360 Page")
    public void ıClickSecondEditButtonForCustomerPage() throws Throwable {
        customer360Page
                .clickEditButtonForCustomerInfo();
    }

    @And("I enter a value {string} in the Email field for Customer360 Page")
    public void ıEnterAValueInTheEmailFieldForCustomerPage(String email) throws Throwable {
        customer360Page
                .enterEmail(email);
    }

    @When("I click Service Address Edit button for Customer360 Page")
    public void ıClickServiceAddressEditButtonForCustomerPage() throws Throwable {
        customer360Page
                .clickEditButtonForServiceAddress();
    }

    @When("I click Billing Address Edit button for Customer360 Page")
    public void ıClickBillingAddressEditButtonForCustomerPage() throws Throwable {
        customer360Page
                .clickEditButtonForBillingAddress();
    }

    @When("I click the {string} for Contact Tab in the Customer360 Page")
    public void ıClickTheForContactTabInTheCustomerPage(String contactType ) throws Throwable {
        customer360Page
                .clickContactTypeForCustomer360Page(contactType);
    }

    @When("I click Edit button for Individual Customer in the Customer360 Page")
    public void ıClickEditButtonForIndividualCustomerInTheCustomerPage() throws Throwable {
        customer360Page
                .clickEditButtonForIndividualPartyInfo();
    }

    @When("I click second Edit button for Individual Customer in the Customer360 Page")
    public void ıClickSecondEditButtonForIndividualCustomerInTheCustomerPage() throws Throwable {
        customer360Page
                .clickEditButtonForIndividualCustomerInfo();
    }

    @When("I enter a value {string} in the Birth field for Contact Tab in the Customer360 Page")
    public void ıEnterAValueInTheBirthFieldForContactTabInTheCustomerPage(String birthDate) throws Throwable {
        customer360Page
                .enterBirthDateForContactTab(birthDate);
    }

    @When("I select the {string} value from Gender DropdownList for Contact Tab in the Customer360 Page")
    public void ıSelectTheValueFromGenderDropdownListForContactTabInTheCustomerPage(String gender) throws Throwable {
        customer360Page
                .selectGenderForContact(gender);
    }

    @And("I select the {string} value from Citizenship DropdownList for Contact Tab in the Customer360 Page")
    public void ıSelectTheValueFromCitizenshipDropdownListForContactTabInTheCustomerPage(String citizenship) throws Throwable {
        customer360Page
                .selectCitizenshipForContact(citizenship);
    }

    @When("I select a value {string} for the Document Type field for Contact Tab in the Customer360 Page")
    public void ıSelectAValueForTheDocumentTypeFieldForContactTabInTheCustomerPage(String documentType) throws Throwable {
        customer360Page
                .selectDocumentTypeForContact(documentType);
    }

    @When("I add file in the Document File field for Contact Tab in the Customer360 Page")
    public void ıAddFileInTheDocumentFileFieldForContactTabInTheCustomerPage() throws Throwable {
        customer360Page
                .enterDocumentFileForContact();
    }

    @When("I enter a value {string} in the Mobile Number field for Contact Admin Tab")
    public void ıEnterAValueInTheMobileNumberFieldForContactAdminTab(String mobileNumber) throws Throwable {
        customer360Page
                .enterMobileNumberForContactAdmin(mobileNumber);
    }

    @When("I select a value Authorized Type : {string} for Contact Tab")
    public void ıSelectAValueAuthorizedTypeForContactTab(String authType) throws Throwable {
        customer360Page
                .selectAuthType(authType);
    }

    @And("I click the New Order button for Postpaid")
    public void ıClickTheNewOrderButtonForPostpaid() throws Throwable {
        customer360Page
                .clickNewOrderButtonForPostpaid();
    }

    @Then("I should not seeing edit buttons because it doesn't have the edit_cust_details role for Individual Party Info")
    public void ıShouldNotSeeingEditButtonsBecauseItDoesnTHaveTheEdit_cust_detailsRoleForIndividualPartyInfo() throws Throwable {
        customer360Page
                .controlIndividualPartyEditButton();
    }

    @Then("I should not seeing edit buttons because it doesn't have the edit_cust_details role for Address Tab")
    public void ıShouldNotSeeingEditButtonsBecauseItDoesnTHaveTheEdit_cust_detailsRoleForAddressTab() throws Throwable {
        customer360Page
                .controlAddressEditButton();
    }

    @Then("I should not seeing update buttons because it doesn't have the edit_cust_details role for Contact Tab")
    public void ıShouldNotSeeingUpdateButtonsBecauseItDoesnTHaveTheEdit_cust_detailsRoleForContactTab() throws Throwable {
        customer360Page
                .controlContactUpdateButton();
    }

    @Then("I should not seeing new order buttons because it doesn't have the create_submit_order role for Account Tab")
    public void ıShouldNotSeeingNewOrderButtonsBecauseItDoesnTHaveTheCreate_submit_orderRoleForAccountTab() throws Throwable {
        customer360Page
                .controlNewOrderButton();
    }

    @Then("I should not seeing download and view buttons because it doesn't have the attachment_view_role role for Document Tab")
    public void ıShouldNotSeeingDownloadAndViewButtonsBecauseItDoesnTHaveTheAttachment_view_roleRoleForDocumentTab() throws Throwable {
        customer360Page
                .controlDocumentAndViewButton();
    }

    @When("I enter a value {string} in the Sales Agent field")
    public void ıEnterAValueInTheSalesAgentField(String salesAgent) throws Throwable {
        customer360Page
                .enterSalesAgent(salesAgent);
    }

    @Then("I should be seeing that {string} field is not editable for Update Resource Page")
    public void ıShouldBeSeeingThatFieldIsNotEditableForUpdateResourcePage(String fieldName) throws Throwable {
        customer360Page
                .controlNotEditableFieldForResource(fieldName);
    }

    @When("I enter a value {string} in the MacAddress field for Update Resource Page")
    public void ıEnterAValueInTheMacAddressFieldForUpdateResourcePage(String macAddress) throws Throwable {
        customer360Page
                .enterMacAddress(macAddress);
    }

    @When("I click Payment button")
    public void ıClickPaymentButton() throws Throwable {
        customer360Page
                .clickPaymentButton();
    }

    @When("I should be seeing {string} value")
    public void ıShouldBeSeeingValue(String field) throws Throwable {
        customer360Page
                .controlFieldValue(field);
    }

    @And("I click Load Ticket button")
    public void ıClickLoadTicketButton() throws Throwable {
        customer360Page
                .clickLoadTicketButton();
    }

    @And("I get Intallation Ticket Id")
    public void ıGetIntallationTicketId() throws Throwable {
        customer360Page
                .getInstallationTicketId();
    }

    @When("I enter a value {string} in the Email field for Contact Tab in the Customer360 Page")
    public void ıEnterAValueInTheEmailFieldForContactTabInTheCustomerPage(String email) throws Throwable {
        customer360Page
                .enterEmailForEnterpriseContact(email);
    }

    @And("I enter a value {string} in the Identification Number Field for Residential Contact Tab")
    public void ıEnterAValueInTheIdentificationNumberFieldForResidentialContactTab(String identificationNumber) throws Throwable {
        customer360Page
                .enterIdentificationNumber(identificationNumber);
    }

    @When("I click {string} for Deactivation Process")
    public void ıClickForDeactivationProcess(String buttonName) throws Throwable {
        customer360Page
                .clickDeactivationButton(buttonName);
    }

    @And("I click more vert icon for Interaction Field")
    public void ıClickMoreVertIconForInteractionField() throws Throwable {
        customer360Page
                .clickMoreVertForInteraction();
    }

    @And("I click Create button for Interaction Field")
    public void ıClickCreateButtonForInteractionField() throws Throwable {
        customer360Page
          .clickCreateButtonForInteraction();
    }

    @And("I enter {string} value on Search field and click Search button for Migration")
    public void ıEnterValueOnSearchFieldAndClickSearchButtonForMigration(String migrationId) throws Throwable {
        customer360Page
                .enterSearchMigrationId(migrationId);
    }

    @When("I click {string} for Manual Order")
    public void ıClickForManualOrder(String buttonName) throws Throwable {
        customer360Page
                .clickButtonForManualOrder(buttonName);
    }

    @And("I enter {string} value on Search field and click Search button for Migration Customer")
    public void ıEnterValueOnSearchFieldAndClickSearchButtonForDebtMigrationCustomer(String debtMigrationId) throws Throwable {
        customer360Page
                .enterDebtMigrationId(debtMigrationId);
    }

    @When("I click on the Pay button")
    public void ıClickOnThePayButton() throws Throwable {
        customer360Page
                .clickDebtPayButton();
    }

    @And("I select a value {string} in the Payment Method field for Debt Pay")
    public void ıSelectAValueInThePaymentMethodFieldForDebtPay(String paymentMethod) throws Throwable {
        customer360Page
                .selectPaymentMethodForDebtPay(paymentMethod);
    }

    @And("I click the Payment Collected for Debt Pay")
    public void ıClickThePaymentCollectedForDebtPay() throws Throwable {
        customer360Page
                .clickPaymentCollectedForDebtPay();
    }

    @And("I enter {string} value on Search field and click Search button for Order Completed Customer")
    public void ıEnterValueOnSearchFieldAndClickSearchButtonForOrderCompletedCustomer(String orderCompletedCustomer) throws Throwable {
        customer360Page
                .enterOrderCompletedCustomer(orderCompletedCustomer);
    }
}