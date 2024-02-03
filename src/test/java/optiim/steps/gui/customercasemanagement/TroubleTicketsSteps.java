package optiim.steps.gui.customercasemanagement;

import optiim.framework.UrlBuilder;
import optiim.framework.helpers.WebDriverHelper;
import optiim.pages.customercasemanagement.TroubleTicketsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

import java.awt.*;
import java.net.MalformedURLException;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class TroubleTicketsSteps {
    private final WebDriverHelper webDriverHelper;
    private final UrlBuilder urlBuilder;
    private final TroubleTicketsPage troubleTicketsPage;

    @When("I click Create New button")
    public void I_click_Create_New_button() throws Throwable {

        troubleTicketsPage
                .createNewButton();
    }

    @When("I enter a value {string} in the Subject field")
    public void I_enter_a_value_in_the_Subject_field(String subject) throws Throwable {

        troubleTicketsPage
                .enterSubject(subject);
    }

    @When("I enter a value {string} in the Body field")
    public void I_enter_a_value_in_the_Body_field(String desc) throws Throwable {

        troubleTicketsPage
                .enterDescription(desc);
    }

    @When("I select value {string} in the Priority field")
    public void I_select_value_in_the_Priority_field(String priority) throws Throwable {

        troubleTicketsPage
                .selectPriority(priority);
    }

    @When("I select value {string} in the Case Type field")
    public void I_select_value_in_the_Case_Type_field(String caseType) throws Throwable {

        troubleTicketsPage
                .selectCaseType(caseType);
    }

    @When("I select value {string} in the Sub Types field")
    public void I_select_value_in_the_Sub_Type_field(String subTypes) throws Throwable {

        troubleTicketsPage
                .selectSubTypes(subTypes);
    }

    @When("I enter a value {string} in the Product Information field")
    public void I_enter_a_value_in_the_Product_Information_field(String productInfo) throws Throwable {

        troubleTicketsPage
                .enterProductInformation(productInfo);
    }


    @When("I enter a value {string} in the Installation Ticket Number field")
    public void I_enter_a_value_in_the_Installation_Ticket_Number_field(String insTicketNumber) throws Throwable {

        troubleTicketsPage
                .enterInsTicketNumber(insTicketNumber);
    }

    @When("I select value {string} in the Issue Category field")
    public void I_select_value_in_the_Issue_Category_field(String issueCategory) throws Throwable {

        troubleTicketsPage
                .selectIssueCategory(issueCategory);
    }

    @When("I click create button")
    public void I_click_create_button() throws Throwable {

        troubleTicketsPage
                .create();
    }

    @When("I should be seeing {string} alert popup message")
    public void I_should_be_seeing_alert_popup_message(String message) throws Throwable {
        troubleTicketsPage
                .controlPopupAlertMessage(message);
    }

    @And("I should be seeing this record will come in the Trouble Tickets area")
    public void I_should_be_seeing_this_record_will_come_in_the_Trouble_Tickets_area() throws Throwable {
        troubleTicketsPage
                .controlInTroubleTicketTable();
    }

    @When("I enter a value {string} in the Search field")
    public void I_enter_a_value_in_the_Search_field(String ticketName) throws Throwable {

        troubleTicketsPage
                .searchTicket(ticketName);
    }

    @When("I should be seeing tickets will come about {string}")
    public void I_should_be_seeing_tickets_will_come_about(String ticketName) throws Throwable {

        troubleTicketsPage
                .controlFilter(ticketName);
    }

    @When("I open {string} page in the DNext Trouble Ticket UI")
    public void I_open_page_in_the_DNext_Trouble_Ticket_UI(String page) throws Throwable {
        //Sayfa otomatik geliyor şimdilik.
    }

    @Then("I should be seeing the case list")
    public void I_should_be_seeing_the_case_list() throws Throwable {

        troubleTicketsPage
                .controlCaseList();
    }

    @Then("I should be seeing the Case Records {string} field")
    public void I_should_be_seeing_the_Case_Records_field(String field) throws Throwable {

        troubleTicketsPage
                .controlTableFields(field);
    }

    @When("I click move vert icon")
    public void I_click_move_vert_icon() throws Throwable {

        troubleTicketsPage
                .clickMoveVertIcon();
    }

    @When("I click details button")
    public void I_click_details_button() throws Throwable {

        troubleTicketsPage
                .clickDetails();
    }

    @When("I click go to update button")
    public void I_click_go_to_update_button() throws Throwable {

        troubleTicketsPage
                .goToUpdate();
    }

    @Then("I should be seeing that the page navigate to TroubleTicketUI page and related ticket is displayed in TroubleTicketUI")
    public void I_should_be_seeing_that_the_page_navigate_to_TroubleTicletUI_page_and_related_ticket_is_displayed_in_TroubleTicletUI() throws Throwable {
        troubleTicketsPage
                .controlHyberLinkTroubleTicketUI();
    }

    @Then("I should be seeing the Case Records {string} field in the Ticket Details popup")
    public void I_should_be_seeing_the_Case_Records_field_in_the_Ticket_Details_popup(String field) throws Throwable {

        troubleTicketsPage
                .controlTableFieldsInTicketDetailsPopup(field);
    }


    @Then("I should be seeing {string}, {string}, {string} and {string} mandatory fields coming")
    public void I_should_be_seein_mandatory_fields_coming(String subject, String desc, String priority, String caseType) throws Throwable {

        troubleTicketsPage
                .controlMandatoryFields(subject, desc, priority, caseType);
    }

    @When("I click Priority field")
    public void I_click_Priority_field() throws Throwable {

        troubleTicketsPage
                .clickPriority();
    }

    @When("I click Case Type field")
    public void I_click_Case_Type_field() throws Throwable {

        troubleTicketsPage
                .clickCaseTypeAndEscape();
    }

    @When("I click Subject field")
    public void I_click_Subject_field() throws Throwable {

        troubleTicketsPage
                .clickSubject();
    }

    @When("I click Description field")
    public void I_click_Description_field() throws Throwable {

        troubleTicketsPage
                .clickDescription();
    }

    @Then("I should be seeing {string}, {string}, {string} and {string} mandatory field coming")
    public void I_should_be_seeing_mandatory_field_coming(String subject, String description, String priority, String caseType) throws Throwable {

        troubleTicketsPage
                .controlCustomerID(subject, description, priority, caseType);
    }

    @Then("I should be seeing {string} field coming by default selected and not editable")
    public void I_should_be_seeing_field_coming_by_default_selected_and_not_editable(String customerID) throws Throwable {

        troubleTicketsPage
                .controlNotEditableCustomerID();
    }


    @When("I click {string} dropdown list")
    public void iClickDropdownList(String arg0) throws Throwable {
        troubleTicketsPage
                .clickCaseType();
    }

    @Then("I should be seeing value list coming in the Case Type field")
    public void iShouldBeSeeingValueListComingInTheCaseTypeField() throws MalformedURLException, InterruptedException {
        troubleTicketsPage
                .controlCaseTypeValueList();
    }

    @And("I should be seeing {string} Case Type coming in the drop down list")
    public void iShouldBeSeeingCaseTypeComingInTheDropDownList(String caseType) throws Throwable {
        troubleTicketsPage
                .checkCaseTypeItem(caseType);
    }

    @And("I should be seeing {string} field coming in the Ticket Details")
    public void iShouldBeSeeingFieldComingInTheTicketDetails(String field) {
        troubleTicketsPage
                .checkFieldInTroubleTicket(field);
    }

    @When("I click Close button for Widget Page in the Customer Case Management")
    public void ıClickCloseButtonForWidgetPageInTheCustomerCaseManagement() throws Throwable {
        troubleTicketsPage
                .clickCloseButton();
    }

    @When("I open {string} menu in the Customer Case Management")
    public void ıOpenMenuInTheCustomerCaseManagement(String menu) throws Throwable {
        troubleTicketsPage
                .clickExtendedWidgetButton(menu);
    }

    @And("I should be seeing that Customer ID field is automaticly populated and the value  is same with Personel Number")
    public void ıShouldBeSeeingThatCustomerIDFieldIsAutomaticlyPopulatedAndTheValueIsSameWithPersonelNumber() {
        troubleTicketsPage
                .controlDefaultCustomerId();
    }

    @When("I click Close Ticket button for Widget Page in the Customer Case Management")
    public void ıClickCloseTicketButtonForWidgetPageInTheCustomerCaseManagement() throws InterruptedException {
        troubleTicketsPage
                .clickTicketCloseButton();
    }

    @When("I select {string} in the Sub Type field")
    public void ıSelectInTheSubTypeField(String subType) throws Throwable {
        troubleTicketsPage
                .selectSubType(subType);
    }

    @When("I click Extend button")
    public void ıClickExtendButton() throws InterruptedException {
        troubleTicketsPage
                .clickExtendButton();
    }

    @When("I click main move vert icon")
    public void ıClickMainMoveVertIcon() throws Throwable {
        troubleTicketsPage
                .clickMainMoveVertIcon();
    }

    @Then("I should be seeing {string} mandatory fields coming")
    public void ıShouldBeSeeingMandatoryFieldsComing(String fieldName) throws InterruptedException {
        troubleTicketsPage
                .controlMandatoryMessage(fieldName);
    }

    @When("I click Sub Types field")
    public void ıClickSubTypesField() throws Throwable {
        troubleTicketsPage
                .clickSubTypes();
    }

    @Then("I should be seeing that {string}, {string}, {string}, {string} values are displayed in the Priority field")
    public void ıShouldBeSeeingThatValuesAreDisplayedInThePriorityField(String urgent, String high, String medium, String low) {
        troubleTicketsPage
                .controlPriorityField(urgent, high, medium, low);
    }

    @Then("I should be seeing that {string} field is not editable")
    public void ıShouldBeSeeingThatFieldIsNotEditable(String fieldName) {
        troubleTicketsPage
                .controlNotEditableTicketField(fieldName);
    }

    @And("I should be seeing that the value of  the {string} is correct to the related customer for Ticket Details popup")
    public void ıShouldBeSeeingThatTheValueOfTheIsCorrectToTheRelatedCustomerForTicketDetailsPopup(String fieldName) throws Throwable {
        troubleTicketsPage
                .controlTicketDetailsPopupValue(fieldName);
    }

    @And("I click update button")
    public void ıClickUpdateButton() throws Throwable {
        troubleTicketsPage
                .clickUpdateButton();
    }

    @And("I should be seeing that the value of  the {string} is correct to the related customer for Trouble Ticket List")
    public void ıShouldBeSeeingThatTheValueOfTheIsCorrectToTheRelatedCustomerForTroubleTicketList(String fieldName) throws Throwable {
        troubleTicketsPage
                .controlTroubleTicketList(fieldName);
    }

    @And("I enter a value {string} in the Refund Amount field")
    public void ıEnterAValueInTheRefundAmountField(String refundAmount) throws Throwable {
        troubleTicketsPage
                .enterRefundAmount(refundAmount);
    }

    @When("I enter a value {string} in the Shop field")
    public void ıEnterAValueInTheShopField(String shop) throws Throwable {
        troubleTicketsPage
                .enterShop(shop);
    }

    @When("I enter a value {string} in the Service Address City field")
    public void ıEnterAValueInTheServiceAddressCityField(String serviceAddressCity) throws Throwable {
        troubleTicketsPage
                .enterServiceAddressCity(serviceAddressCity);
    }

    @When("I enter a value {string} in the Appointment Date & Time field")
    public void ıEnterAValueInTheAppointmentDateTimeField(String appointmentDateAndTime) throws Throwable {
        troubleTicketsPage
                .enterAppointmentDateAndTime(appointmentDateAndTime);
    }

    @When("I enter a value {string} in the Service Activation Date field")
    public void ıEnterAValueInTheServiceActivationDateField(String serviceActivationDate) throws Throwable {
        troubleTicketsPage
                .enterServiceActivationDate(serviceActivationDate);
    }

    @When("I enter a value {string} in the MAC Address field")
    public void ıEnterAValueInTheMACAddressField(String macAddress) throws Throwable {
        troubleTicketsPage
                .enterMacAddress(macAddress);
    }

    @When("I enter a value {string} in the Serial Number field for Trouble Tickets Page")
    public void ıEnterAValueInTheSerialNumberFieldForTroubleTicketsPage(String serialNumber) throws Throwable {
        troubleTicketsPage
                .enterSerialNumber(serialNumber);
    }

    @When("I enter a value {string} in the Order Item Number field")
    public void ıEnterAValueInTheOrderItemNumberField(String orderItemNumber) throws Throwable {
        troubleTicketsPage
                .enterOrderItemNumber(orderItemNumber);
    }

    @When("I enter a value {string} in the Customer Link field")
    public void ıEnterAValueInTheCustomerLinkField(String customerLink) throws Throwable {
        troubleTicketsPage
                .enterCustomerLink(customerLink);
    }

    @And("I should be seeing that {string} {string} value updated for Tickets Widget")
    public void ıShouldBeSeeingThatValueUpdatedForTicketsWidget(String expectedValue, String fieldName) throws Throwable {
        troubleTicketsPage
                .controlTroubleTicketListValue(expectedValue, fieldName);
    }

    @When("I enter a value {string} in the Subject field for create ticket page")
    public void iEnterAValueInTheSubjectFieldForCreateTicketPage(String subject) throws Throwable {
        troubleTicketsPage
                .enterSubjectForCreateTicketPage(subject);
    }

    @And("I should be seeing that {string} in the Ticket Details popup")
    public void ıShouldBeSeeingThatInTheTicketDetailsPopup(String expectedValue) throws Throwable {
        troubleTicketsPage
                .controlTroubleTicketPopupFieldValue(expectedValue);
    }

    @And("I enter a value {string} in Order Item ID for Corporate Customer")
    public void iEnterAValueInOrderItemIDForCorporateCustomer(String OrderItemID) throws InterruptedException {
        troubleTicketsPage
                .enterOrderItemID(OrderItemID);
    }

    @And("I enter a value {string} in Error on System for Corporate Customer")
    public void iEnterAValueInErrorOnSystemForCorporateCustomer(String errorOnSystem) throws InterruptedException, AWTException {
        troubleTicketsPage
                .enterErrorOnTicket(errorOnSystem);
    }

    @Then("I should be seeing tickets will not come about {string}")
    public void ıShouldBeSeeingTicketsWillNotComeAbout(String ticketName) {
        troubleTicketsPage
                .controlNotComeTicketName(ticketName);
    }

    @And("I click Faveo button")
    public void ıClickFaveoButton() throws Throwable {
        troubleTicketsPage
                .clickFaveoButton();
    }

    @And("I should be seeing {string} for Product Information")
    public void ıShouldBeSeeingForProductInformation(String titleName) {
        troubleTicketsPage
                .controlProductInformationTitle(titleName);
    }

    @Then("I should be seeing that {string}, {string} values in the Termination Request Cancelled Dropdown list")
    public void ıShouldBeSeeingThatValuesInTheTerminationRequestCancelledDropdownList(String fieldOne, String fieldTwo) throws Throwable {
        troubleTicketsPage
                .controlTerminationRequestCancelledDropdown(fieldOne,fieldTwo);
    }

    @When("I select a value {string} in the Customer Saved field")
    public void ıSelectAValueInTheTerminationRequestCancelledField(String terminationRequest) throws Throwable {
        troubleTicketsPage
                .selectTerminationRequest(terminationRequest);
    }

    @Then("I should be seeing that {string} Dropdown list")
    public void ıShouldBeSeeingThatDropdownList(String fieldName) {
        troubleTicketsPage
                .controlDropdownField(fieldName);
    }

    @Then("I should be seeing that {string}, {string}, {string} values in the Termination Reason Dropdown list")
    public void ıShouldBeSeeingThatValuesInTheTerminationReasonDropdownList(String fieldOne, String fieldTwo, String fieldThree) throws Throwable {
        troubleTicketsPage
                .controlTerminationReasonDropdown(fieldOne,fieldTwo,fieldThree);
    }

    @When("I select a value {string} in the Termination Reason field")
    public void ıSelectAValueInTheTerminationReasonField(String terminationReason) throws Throwable {
        troubleTicketsPage
                .selectTerminationReason(terminationReason);
    }

    @Then("I should be seeing that {string}, {string} values in the Penalty Waiving Dropdown list")
    public void ıShouldBeSeeingThatValuesInThePenaltyWaivingDropdownList(String fieldOne, String fieldTwo) throws Throwable {
        troubleTicketsPage
                .controlPenaltyWaivingDropdown(fieldOne,fieldTwo);
    }

    @When("I select a value {string} in the Penalty Waiving field")
    public void ıSelectAValueInThePenaltyWaivingField(String penaltyWaiving) throws Throwable {
        troubleTicketsPage
                .selectPenaltyWaiving(penaltyWaiving);
    }

    @And("I select a value {string} in the Waiving Reason field")
    public void ıSelectAValueInTheWaivingReasonField(String waivingReason) throws Throwable {
        troubleTicketsPage
                .selectWaivingReason(waivingReason);
    }

    @When("I click Close button for Widget Page in the Customer Case Management for Enterprise and Institute Customer")
    public void ıClickCloseButtonForWidgetPageInTheCustomerCaseManagementForEnterpriseAndInstituteCustomer() throws Throwable {
        troubleTicketsPage
                .clickCloseButtonForEnterpriseAndInstitute();
    }

    @Then("I should be not seeing {string} page")
    public void ıShouldBeNotSeeingPage(String fieldName) throws Throwable {
        troubleTicketsPage
                .controlNotSeeingField(fieldName);
    }

    @And("I select a value {string} in the Reason Detail field")
    public void ıSelectAValueInTheReasonDetailField(String reasonDetail) throws Throwable {
        troubleTicketsPage
                .selectReasonDetail(reasonDetail);
    }

    @And("I select a value {string} in the Issue Category field for Interaction")
    public void ıSelectAValueInTheIssueCategoryFieldForInteraction(String issueCategory) throws Throwable {
        troubleTicketsPage
                .selectIssueCategoryForInteraction(issueCategory);
    }

    @And("I select value {string} in the Sub Types field for Interaction")
    public void ıSelectValueInTheSubTypesFieldForInteraction(String subType) throws Throwable {
        troubleTicketsPage
                .selectSubTypeInteraction(subType);
    }
}
