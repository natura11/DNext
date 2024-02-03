package optiim.pages.customercasemanagement;

import optiim.framework.core.PageBase;
import optiim.framework.helpers.WebDriverHelper;
import optiim.framework.helpers.WorldHelper;
import optiim.framework.utils.log;
import optiim.models.data.gui.customercasemanagement.CustomerCaseManagementData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.text.ParseException;
import java.util.List;

public class TroubleTicketsPage extends PageBase {
    public static final By btnCreateNew = By.cssSelector("[ng-reflect-message='Create New Ticket']");
    public static final By txtSubjectCreate = By.xpath("/html[1]/body[1]/div[4]/div[2]/div[1]/mat-dialog-container[1]/app-ticket-detail-dialog[1]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/form[1]/mat-form-field[1]/div[1]/div[1]/div[3]");
    public static final By txtSubject = By.cssSelector("[class='dialog-content-wrapper'] [formcontrolname='name']");
    public static final By txtSubjectInvalid = By.cssSelector("[formcontrolname='name'][class*='ng-invalid']");
    public static final By cmbPriority = By.cssSelector("[formcontrolname='priority']");
    public static final By btnCreate = By.xpath("//span[contains(text(),'Save')]");
    public static final By cmbSubTypes = By.xpath("//app-custom-fields[1]//mat-select");
    public static final By cmbSubTypesInvalid = By.xpath("//app-custom-fields[1]/div[contains(@class,'ng-invalid')]");
    public static final By txtProductInformation = By.xpath("//app-custom-fields[2]//input");
    public static final By txtProductInformation2 = By.xpath("//*[text()='Product Information']");
    public static final By txtInvoiceNumber = By.xpath("//*[text()='Invoice Number']");
    public static final By txtBillingAccount = By.xpath("//*[text()='Billing Account']");
    public static final By txtInvoiceAmount = By.xpath("//*[text()='Invoice Amount']");
    public static final By txtRefundAmount = By.xpath("//*[text()='Refund Amount']");
    public static final By txtPartnerID = By.xpath("//*[text()='Partner ID']");
    public static final By txtPartnerContact = By.xpath("//*[text()='Partner Contact']");
    public static final By txtPOSNumber = By.xpath("//*[text()='POS Number']");
    public static final By txtOrderItemID = By.xpath("//input[@id='140']");
    public static final By txtIssueCategory = By.xpath("//*[text()='Issue Category']");
    public static final By txtIssueCategoryInvalid = By.cssSelector("[ng-reflect-name='131'][aria-invalid='true']");
    public static final By txtErrorOnSystem = By.xpath("//input[@id='141']");
    public static final By txtErrorOnSystemInvalid = By.cssSelector("[ng-reflect-name='141'][aria-invalid='true']");
    public static final By btnMoreProcess = By.xpath("//app-extended-trouble-ticket-widget//mat-icon[contains(text(),'more_vert')]");
    public static final By btnClose = By.xpath("//mat-icon[contains(text(),'close')]");
    public static final By txtInsNumber = By.id("80");
    public static final By cmbIssueCategory = By.id("73");
    public static final By tableTroubleTickets = By.xpath("//table/tbody/tr");
    public static final By tableTroubleTicketsTr = By.xpath("//table/tbody/tr[1]/td");
    public static final By alertPopupMessage = By.cssSelector("[role='alert'] [class='mat-simple-snackbar ng-star-inserted']");
    public static final By txtSearch = By.cssSelector("[class*='search-wrapper'] [placeholder='Search']");
    public static final By columnTableStatus = By.xpath("//div[contains(text(),'Status')]");
    public static final By columnTableSubject = By.xpath("//div[contains(text(),'Subject')]");
    public static final By columnTableResolutionDate = By.xpath("//div[contains(text(),'Resolution Date')]");
    public static final By columnTablePriority = By.xpath("//div[contains(text(),'Priority')]");
    public static final By btnDetails = By.xpath("//span[contains(text(),'Details')]");
    public static final By popupTicketDetails = By.cssSelector("[class='dialog-content-wrapper']");
    public static final By btnGoToUpdate = By.xpath("//span[contains(text(),'GO TO UPDATE')]");
    public static final By getTicketID = By.name("externalId");
    public static final By subjectInTicketDetailsPopup = By.cssSelector("[class='dialog-content-wrapper'] [formcontrolname='name'][type='text']");
    public static final By statusInTicketDetailsPopup = By.cssSelector("[class='dialog-content-wrapper'] [formcontrolname='status'][role='listbox']");
    public static final By priorityInTicketDetailsPopup = By.cssSelector("[class='dialog-content-wrapper'] [formcontrolname='priority'][role='listbox']");
    public static final By resolutionDateInTicketDetailsPopup = By.cssSelector("[class='dialog-content-wrapper'] [formcontrolname='resolutionDate']");
    public static final By expectedResolutionDateInTicketDetailsPopup = By.cssSelector("[class='dialog-content-wrapper'] [formcontrolname='expectedResolutionDate']");
    public static final By subjectFieldMandatory = By.cssSelector("[formcontrolname='name'][class*='ng-invalid']");
    public static final By descFieldMandatory = By.cssSelector("[formcontrolname='description'][class*='ng-invalid']");
    public static final By priorityFieldMandatory = By.cssSelector("[formcontrolname='priority'][class*='select-invalid ng-touched']");
    public static final By ticketTypeFieldMandatory = By.cssSelector("[formcontrolname='ticketType'][class*='select-invalid ng-touched']");
    public static final By txtCustomerID = By.cssSelector("[class='dialog-content-wrapper'] [formcontrolname='customerId']");
    public static final By txtCustomerID2 = By.cssSelector("[class='dialog-content-wrapper'] [formcontrolname='customerId'][aria-required='false']");
    public static final By txtCustomerId = By.cssSelector("[class='dialog-content-wrapper'] [formcontrolname='customerId']");
    public static final By txtSLA = By.cssSelector("[class='dialog-content-wrapper'] [formcontrolname='slaPlan'][type='text']");
    public static final By txtAssignee = By.cssSelector("[class='dialog-content-wrapper'] [formcontrolname='assignee'][type='text']");
    public static final By txtTicketId = By.cssSelector("[class='dialog-content-wrapper'] [formcontrolname='externalId'][type='text']");
    public static final By txtTicketIdDefault = By.cssSelector("[class='dialog-content-wrapper'] [formcontrolname='externalId'][aria-required='false']");
    public static final By txtDescription = By.cssSelector("mat-form-field textarea[formcontrolname='description']");
    public static final By txtDescriptionInvalid = By.cssSelector("[class='dialog-content-wrapper'] [formcontrolname='description'][class*='ng-invalid']");
    public static final By cmbCaseType = By.cssSelector("[formcontrolname='ticketType'][role='listbox']");
    public static final By txtCreatedDate = By.cssSelector("[formcontrolname='creationDate']");
    public static final By txtCreatedDateDefault = By.cssSelector("[formcontrolname='creationDate'][aria-required='false']");
    public static final By txtExpectedResolutionDateDefault = By.cssSelector("[formcontrolname='expectedResolutionDate'][aria-required='false']");
    public static final By txtSLADefault = By.cssSelector("[formcontrolname='slaPlan'][aria-required='false']");
    public static final By txtAssigneeDefault = By.cssSelector("[formcontrolname='assignee'][aria-required='false']");
    public static final By txtDescriptionDefault = By.cssSelector("[formcontrolname='description'][disabled='']");
    public static final By txtSubjectDefault = By.cssSelector("[formcontrolname='name'][disabled='']");
    public static final By btnStatusHistoryTab = By.xpath("//div[contains(text(),'Status History')]");
    public static final By btnCommentsTab = By.xpath("//div[contains(text(),'Comments')]");
    public static final By btnMoveVertIcon = By.xpath("//table/tbody/tr[1]/td[6]/button");
    public static final By btnUpdate = By.xpath("//span[contains(text(),'Save')]");
    public static final By txtRefundAmount2 = By.cssSelector("[ng-reflect-name='93']");
    public static final By txtShop = By.cssSelector("[ng-reflect-name='100']");
    public static final By txtShopInvalid = By.cssSelector("[ng-reflect-name='100'][class*='ng-invalid']");
    public static final By txtServiceAddressCity = By.cssSelector("[ng-reflect-name='101']");
    public static final By txtServiceAddressCityInvalid = By.cssSelector("[ng-reflect-name='101'][class*='ng-invalid']");
    public static final By txtAppointmentDateAndTime = By.cssSelector("[ng-reflect-name='142']");
    public static final By txtAppointmentDateAndTimeInvalid = By.cssSelector("[ng-reflect-name='108'][class*='ng-invalid']");
    public static final By txtServiceActivationDate = By.cssSelector("[ng-reflect-name='134']");
    public static final By txtServiceActivationDateInvalid = By.cssSelector("[ng-reflect-name='109'][class*='ng-invalid']");
    public static final By txtMacAddress = By.cssSelector("[ng-reflect-name='104']");
    public static final By txtMacAddressInvalid = By.cssSelector("[ng-reflect-name='104'][class*='ng-invalid']");
    public static final By txtSerialNumber = By.cssSelector("[ng-reflect-name='143']");
    public static final By txtSerialNumberInvalid = By.cssSelector("[ng-reflect-name='105'][class*='ng-invalid']");
    public static final By txtOrderItemNumber = By.cssSelector("[ng-reflect-name='106']");
    public static final By txtOrderItemNumberInvalid = By.cssSelector("[ng-reflect-name='106'][class*='ng-invalid']");
    public static final By txtOrderItemIDInvalid = By.cssSelector("[ng-reflect-name='140'][class*='ng-invalid']");
    public static final By txtCustomerLink = By.cssSelector("[ng-reflect-name='114']");
    public static final By txtCustomerLinkInvalid = By.cssSelector("[ng-reflect-name='114'][class*='ng-invalid']");
    public static final By btnFaveo = By.xpath("//span[contains(text(),'DCase')]");
    public static final By cmbTerminationRequestCancelled = By.id("189");
    public static final By cmbTerminationReason = By.id("143");
    public static final By cmbPenaltyWaiving = By.id("115");
    public static final By cmbWaivingReason = By.id("116");
    public static final By cmbReasonDetail = By.id("192");
    public static final By cmbIssueCategoryInteraction = By.cssSelector("[formcontrolname='issueCategory']");
    public static final By cmbSubTypeInteraction = By.id("146");

    private final WorldHelper worldHelper;
    private final CustomerCaseManagementData customerCaseManagementData;

    public TroubleTicketsPage(WebDriverHelper webDriverHelper, WorldHelper worldHelper, CustomerCaseManagementData customerCaseManagementData) {
        super(webDriverHelper);
        this.worldHelper = worldHelper;
        this.customerCaseManagementData = customerCaseManagementData;

    }

    public TroubleTicketsPage createNewButton() throws MalformedURLException, InterruptedException {
        Thread.sleep(1500);
        clickJS(btnMoreProcess);
        Thread.sleep(500);
        clickJS(By.xpath("//mat-icon[contains(text(),'add')]"));
        //clickJS(btnCreateNew);
        return this;
    }

    public TroubleTicketsPage enterSubject(String subject) throws MalformedURLException, InterruptedException, AWTException {
        //getWebDriver().switchTo().window(getWebDriver().getWindowHandle());
        if (subject.equals("")) {
            JavascriptExecutor executor = (JavascriptExecutor) getWebDriver();
            executor.executeScript("arguments[0].click();", findElement(txtSubject));
            sendKeys(txtSubject, "A");
            findElement(txtSubject).sendKeys(Keys.BACK_SPACE);
        } else {
            String newName = subject + " " + getRandomNumberInRange(1000000, 9999999);
            customerCaseManagementData.setTicketSubjectName(newName);
            worldHelper.setCustomerCaseManagementData(customerCaseManagementData);
            sendKeys(txtSubject, newName, false);
            log.info("Enter Subject:" + newName);
        }
        return this;
    }

    public TroubleTicketsPage enterDescription(String desc) throws MalformedURLException, InterruptedException, AWTException {

        Actions actions = new Actions(getWebDriver());
        actions.moveToElement(findElement(txtDescription)).doubleClick().build().perform();

        //elementToBeClickable(txtDescription);
        customerCaseManagementData.setTicketDescription(desc);
        worldHelper.setCustomerCaseManagementData(customerCaseManagementData);
        findElement(txtDescription).sendKeys(desc);
        return this;
    }

    public TroubleTicketsPage selectPriority(String priority) throws MalformedURLException, InterruptedException {
        Thread.sleep(500);
        customerCaseManagementData.setTicketPriority(priority);
        worldHelper.setCustomerCaseManagementData(customerCaseManagementData);
        selectMatComboboxJS(cmbPriority, priority);
        return this;
    }

    public TroubleTicketsPage selectCaseType(String caseType) throws MalformedURLException, InterruptedException, AWTException {
        Thread.sleep(1000);
        customerCaseManagementData.setTicketCaseType(caseType);
        scrollMainWindow(0, 500);
        //Thread.sleep(1500);
        //wait.until(ExpectedConditions.presenceOfElementLocated(cmbCaseType));
        Thread.sleep(2000);
        selectMatComboboxJS(cmbCaseType, caseType);
        return this;
    }

    public TroubleTicketsPage selectSubTypes(String subTypes) throws MalformedURLException, InterruptedException {
        Thread.sleep(2000);
        customerCaseManagementData.setTicketSubTypes(subTypes);
        selectMatComboboxJS(cmbSubTypes, subTypes);
        return this;
    }

    public TroubleTicketsPage enterProductInformation(String productInfo) throws MalformedURLException, InterruptedException {
        Thread.sleep(1000);
        customerCaseManagementData.setTicketProductInformation(productInfo);
        sendKeys(txtProductInformation, productInfo, false);
        return this;
    }

    public TroubleTicketsPage enterInsTicketNumber(String insTicketNumber) throws MalformedURLException, InterruptedException {
        customerCaseManagementData.setTicketInstallationTicketNumber(insTicketNumber);
        sendKeys(txtInsNumber, insTicketNumber, false);
        return this;
    }

    public TroubleTicketsPage selectIssueCategory(String issueCategory) throws MalformedURLException, InterruptedException {
        //Actions actions = new Actions(getWebDriver());
        //actions.moveToElement(findElement(By.xpath("//app-custom-fields[3]"))).build().perform();
        customerCaseManagementData.setTicketIssueCategory(issueCategory);
        if (issueCategory.contains("I want")) {
            selectMatComboboxJS(By.id("63"), issueCategory);
        } else if (issueCategory.contains("I Need")) {
            selectMatComboboxJS(By.id("83"), issueCategory);
        } else if (issueCategory.contains("Error Ticket")) {
            selectMatComboboxJS(By.cssSelector("[ng-reflect-name='131']"), issueCategory);
        } else {
            selectMatComboboxJS(cmbIssueCategory, issueCategory);
        }

        return this;
    }

    public TroubleTicketsPage create() throws MalformedURLException, InterruptedException {
        Thread.sleep(2000);
        clickJS(btnCreate);
        return this;
    }

    public TroubleTicketsPage controlPopupAlertMessage(String message) throws MalformedURLException, InterruptedException {
        Thread.sleep(2000);
        //waitForExpectedElement(alertPopupMessage);
        //String popupMessage = getTextOfElement(alertPopupMessage);
        //log.info("Incoming Message:" + popupMessage);
        log.info("Expected Message:" + message);
        //control(popupMessage.contains(message), "Popup message control succesfully.", "ERROR:Popup message control unsuccesfully.");
        control(isElementExist(By.xpath("//*[contains(text(),'" + message + "')]")), "Popup control is successfully", "ERROR:Popup control is not successfully");

        return this;
    }

    public TroubleTicketsPage controlInTroubleTicketTable() throws MalformedURLException, InterruptedException {

        Thread.sleep(3000);

//        boolean status = false;
//        List<WebElement> elementListTr = findElements(tableTroubleTickets);
//
//        for (int i = 0; i < elementListTr.size(); i++) {
//            List<WebElement> elementListTd = elementListTr.get(i).findElements(By.tagName("td"));
//            for (int j = 0; j < elementListTd.size(); j++) {
//                if (elementListTd.get(j).getText().trim().contains(worldHelper.getCustomerCaseManagementData().getTicketSubjectName())) {
//                    log.info(worldHelper.getCustomerCaseManagementData().getTicketSubjectName() + " added in list.");
//                    status = true;
//                    break;
//                }
//            }
//            if (status == true) {
//                break;
//            }
//
//        }

        control(isElementExist(By.xpath("//app-extended-trouble-ticket-widget//tbody//tr")), "There are ticket on the Trouble Tickets table.", "ERROR:There are not ticket on the Trouble Tickets table.");


        return this;
    }

    public TroubleTicketsPage searchTicket(String ticketName) throws MalformedURLException, InterruptedException {
        //getWebDriver().navigate().refresh();
        log.info("Enter Search Ticket:" + ticketName);
        sendKeys(txtSearch, ticketName, false);
        return this;
    }

    public TroubleTicketsPage controlFilter(String ticketName) throws MalformedURLException, InterruptedException {

        control(isElementExist(By.xpath("//*[contains(text(),'" + ticketName + "')]")), ticketName + " search result come in the ticket table.", "ERROR:" + ticketName + " search result is not come in the ticket table.");

        return this;
    }

    public TroubleTicketsPage controlCaseList() throws MalformedURLException, InterruptedException {
        control(isElementExist(tableTroubleTickets), "The result come in the ticket table.", "ERROR:The result is not come in the ticket table.");
        return this;
    }

    public TroubleTicketsPage controlTableFields(String field) throws MalformedURLException, InterruptedException {
        control(isElementExist(By.xpath("//div[contains(text(),'" + field + "')]")), field + "column is exist.", "ERROR:" + field + "column is not exist.");
        return this;
    }


    public TroubleTicketsPage clickMoveVertIcon() throws MalformedURLException, InterruptedException, AWTException {
        Thread.sleep(3000);
        getWebDriver().navigate().refresh();
        clickJS(By.xpath("//span[contains(text(),'Tickets')]"));
        if (isElementExist(btnMoveVertIcon, 10)) {
            String getTicketSubjectName = getTextOfElement(By.xpath("//table/tbody/tr[1]/td[3]"));
            customerCaseManagementData.setTicketSubjectName(getTicketSubjectName);
            worldHelper.setCustomerCaseManagementData(customerCaseManagementData);
            clickJS(btnMoveVertIcon);
        } else {
            createTicket();
            clickJS(btnMoveVertIcon);
        }
        return this;
    }

    public TroubleTicketsPage clickDetails() throws MalformedURLException, InterruptedException {
        //waitForExpectedElement(btnDetails);
        clickJS(btnDetails);
        log.info("Details Button clicked.");
        return this;
    }

    public TroubleTicketsPage goToUpdate() throws MalformedURLException, InterruptedException {
        clickJS(btnUpdate);
        return this;
    }


    public TroubleTicketsPage createTicket() throws MalformedURLException, InterruptedException, AWTException {

        String newName = "TA Ticket " + getRandomNumberInRange(1000000, 9999999);
        customerCaseManagementData.setTicketSubjectName(newName);
        worldHelper.setCustomerCaseManagementData(customerCaseManagementData);

        createNewButton();
        //enterSubject("TA Ticket");
        enterSubjectForCreateTicketPage("TA Ticket");
        enterDescription("TA Ticket Desc.");
        selectPriority("High");
        selectCaseType("After Sales Incident Case Type");
        selectSubTypes("Network Issues");
        enterProductInformation("Vodafone product");
        enterInsTicketNumber("VF12345");
        selectIssueCategory("Service loss");
        create();

        return this;
    }

    public TroubleTicketsPage controlHyberLinkTroubleTicketUI() throws MalformedURLException, InterruptedException {

        String getTicketSubjectName = worldHelper.getCustomerCaseManagementData().getTicketSubjectName();
        control(isElementExist(By.xpath("//div[contains(text(),'" + getTicketSubjectName + "')]")), "Ticket open in the TroubleTicketUI.", "ERROR:Ticket does not open in the TroubleTicketUI.");
        control(getWebDriver().getTitle().contains("TroubleTicketUi"), "TroubleTicketUI opened.", "ERROR:TroubleTicketUI did not open.");

        return this;
    }

    public TroubleTicketsPage controlTableFieldsInTicketDetailsPopup(String field) throws MalformedURLException, InterruptedException {

        switch (field) {
            case "Status":
                control(isElementExist(statusInTicketDetailsPopup), "Status field exist in the Ticket details popup.", "ERROR:Status field does not exist in the Ticket details popup.");
                break;
            case "Subject":
                control(isElementExist(subjectInTicketDetailsPopup), "Subject field exist in the Ticket details popup.", "ERROR:Subject field does not exist in the Ticket details popup.");
                break;
            case "Priority":
                control(isElementExist(priorityInTicketDetailsPopup), "Priority field exist in the Ticket details popup.", "ERROR:Priority field does not exist in the Ticket details popup.");
                break;
            case "Expected Resolution Date":
                control((isElementExist(resolutionDateInTicketDetailsPopup, 1) || (isElementExist(expectedResolutionDateInTicketDetailsPopup, 1))), "Resolution Date field exist in the Ticket details popup.", "ERROR:Resolution Date field does not exist in the Ticket details popup.");
                break;
            case "Customer ID":
                control(isElementExist(txtCustomerId), field + "field is exist.", "ERROR:" + field + "field is not exist.");
                break;
            case "Ticket ID":
                control(isElementExist(txtTicketId), field + "field is exist.", "ERROR:" + field + "field is not exist.");
                break;
            case "SLA":
                control(isElementExist(txtSLA), field + "field is exist.", "ERROR:" + field + "field is not exist.");
                break;
            case "Description":
                control(isElementExist(txtDescription), field + "field is exist.", "ERROR:" + field + "field is not exist.");
                break;
            case "Assignee":
                control(isElementExist(txtAssignee), field + "field is exist.", "ERROR:" + field + "field is not exist.");
                break;
            case "Case Type":
                control(isElementExist(cmbCaseType), field + "field is exist.", "ERROR:" + field + "field is not exist.");
                break;
            case "Created Date":
                control(isElementExist(txtCreatedDate), field + "field is exist.", "ERROR:" + field + "field is not exist.");
                break;
            case "Sub Types":
                control(isElementExist(cmbSubTypes), field + "field is exist.", "ERROR:" + field + "field is not exist.");
                break;
            case "Product Information":
                control(isElementExist(txtProductInformation), field + "field is exist.", "ERROR:" + field + "field is not exist.");
                break;
            case "Installation Ticket Number":
                control(isElementExist(txtInsNumber), field + "field is exist.", "ERROR:" + field + "field is not exist.");
                break;
            case "Issue Category":
                control(isElementExist(cmbIssueCategory), field + "field is exist.", "ERROR:" + field + "field is not exist.");
                break;
            case "Status History":
                control(isElementExist(btnStatusHistoryTab), field + "field is exist.", "ERROR:" + field + "field is not exist.");
                break;
            case "Comments":
                control(isElementExist(btnCommentsTab), field + "field is exist.", "ERROR:" + field + "field is not exist.");
                break;
            default:
                // code block
        }

        return this;
    }

    public TroubleTicketsPage controlMandatoryFields(String subject, String desc, String priority, String caseType) {
        log.info("Mandatory Field is checking.");
        control(isElementExist(subjectFieldMandatory, 3), subject + " field is mandatory.", "ERROR:" + subject + " field is not mandatory");
        control(isElementExist(descFieldMandatory, 3), desc + " field is mandatory.", "ERROR:" + desc + "field is not mandatory");
        //control(isElementExist(priorityFieldMandatory, 3), priority + " field is mandatory.", "ERROR:" + priority + "field is not mandatory");
        //control(isElementExist(ticketTypeFieldMandatory, 3), caseType + "field is mandatory.", "ERROR:" + caseType + " field is not mandatory");
        return this;
    }

    public TroubleTicketsPage clickPriority() throws MalformedURLException, InterruptedException {
        clickJS(cmbPriority);
        //WebElement element = findElement(cmbPriority);
        //element.sendKeys(Keys.ESCAPE);
        return this;
    }

    public TroubleTicketsPage clickCaseTypeAndEscape() throws MalformedURLException, InterruptedException {
        clickJS(cmbCaseType);
        //WebElement element = findElement(cmbCaseType);
        //element.sendKeys(Keys.ESCAPE);
        return this;
    }

    public TroubleTicketsPage clickSubject() throws MalformedURLException, InterruptedException {
        clickJS(txtSubject);
        return this;
    }

    public TroubleTicketsPage clickDescription() throws MalformedURLException, InterruptedException {
        //click(txtDescription);
        clickJS(txtDescription);
        return this;
    }

    public TroubleTicketsPage controlCustomerID(String subject, String description, String priority, String caseType) throws MalformedURLException, InterruptedException {
        //control(isElementExist(txtCustomerID, 3), customerID + "field is mandatory and exist.", "ERROR:" + customerID + "field is not exist.");
        //control(isElementExist(txtSubjectCreate, 3), subject + "field is mandatory and exist.", "ERROR:" + subject + "field is not exist.");
        control(isElementExist(txtDescription, 3), description + "field is mandatory and exist.", "ERROR:" + description + "field is not exist.");
        control(isElementExist(cmbPriority, 3), priority + "field is mandatory and exist.", "ERROR:" + priority + "field is not exist.");
        control(isElementExist(cmbCaseType, 3), caseType + "field is mandatory and exist.", "ERROR:" + caseType + "field is not exist.");
        return this;
    }

    public TroubleTicketsPage controlNotEditableCustomerID() throws MalformedURLException, InterruptedException {
        control(isElementExist(txtCustomerID2, 3), "Customer ID field is not editable and not required.", "ERROR:Customer ID field is not editable and not required.");
        return this;
    }

    public TroubleTicketsPage clickCaseType() throws MalformedURLException, InterruptedException, AWTException {
        Thread.sleep(1500);
        clickJS(cmbCaseType);
        Thread.sleep(1000);
        //Robot robot = new Robot();
        //robot.keyPress(KeyEvent.VK_ENTER);
        //robot.keyRelease(KeyEvent.VK_ENTER);
        return this;
    }


    public TroubleTicketsPage controlCaseTypeValueList() {
        control(isElementExist(cmbCaseType, 5), "Case Type combobox is exist.", "ERROR:Case Type combobox is not exist.");
        return this;
    }

    public TroubleTicketsPage checkCaseTypeItem(String caseType) throws InterruptedException {
        Thread.sleep(2000);
        control(isElementExist(By.xpath("//span[contains(text(),'" + caseType + "')]")),
                caseType + "item is exist in the Case Type.",
                "ERROR: " + caseType + " item is not exist in the Case Type.");
        if (caseType.contains("Survey Ticket")) {
            WebElement element = findElement(cmbCaseType);
            element.sendKeys(Keys.ESCAPE);
        }
        return this;
    }

    public TroubleTicketsPage checkFieldInTroubleTicket(String field) {

        switch (field) {
            case "Sub Type":
                control(isElementExist(cmbSubTypes, 10), field + " field is exist in the Ticket Details.", "ERROR: " + field + " is not exist in the Ticket Details.");
                break;
            case "Product Information":
                control(isElementExist(txtProductInformation2, 5), field + " field is exist in the Ticket Details.", "ERROR: " + field + " is not exist in the Ticket Details.");
                break;
            case "Installation Ticket Number":
                control(isElementExist(txtInsNumber, 5), field + " field is exist in the Ticket Details.", "ERROR: " + field + " is not exist in the Ticket Details.");
                break;
            case "Invoice Number":
                control(isElementExist(txtInvoiceNumber, 5), field + " field is exist in the Ticket Details.", "ERROR: " + field + " is not exist in the Ticket Details.");
                break;
            case "Billing Account":
                control(isElementExist(txtBillingAccount, 5), field + " field is exist in the Ticket Details.", "ERROR: " + field + " is not exist in the Ticket Details.");
                break;
            case "Invoice Amount":
                control(isElementExist(txtInvoiceAmount, 5), field + " field is exist in the Ticket Details.", "ERROR: " + field + " is not exist in the Ticket Details.");
                break;
            case "Refund Amount":
                control(isElementExist(txtRefundAmount, 5), field + " field is exist in the Ticket Details.", "ERROR: " + field + " is not exist in the Ticket Details.");
                break;
            case "Partner ID":
                control(isElementExist(txtPartnerID, 5), field + " field is exist in the Ticket Details.", "ERROR: " + field + " is not exist in the Ticket Details.");
                break;
            case "Partner Contact":
                control(isElementExist(txtPartnerContact, 5), field + " field is exist in the Ticket Details.", "ERROR: " + field + " is not exist in the Ticket Details.");
                break;
            case "POS Number":
                control(isElementExist(txtPOSNumber, 5), field + " field is exist in the Ticket Details.", "ERROR: " + field + " is not exist in the Ticket Details.");
                break;
            case "Order Item ID":
                control(isElementExist(txtOrderItemID, 5), field + " field is exist in the Ticket Details.", "ERROR: " + field + " is not exist in the Ticket Details.");
                break;
            case "Error on System":
                control(isElementExist(txtErrorOnSystem, 5), field + " field is exist in the Ticket Details.", "ERROR: " + field + " is not exist in the Ticket Details.");
                break;
            case "Issue Category":
                control(isElementExist(txtIssueCategory, 5), field + " field is exist in the Ticket Details.", "ERROR: " + field + " is not exist in the Ticket Details.");
                break;
        }
        return this;
    }

    public TroubleTicketsPage clickCloseButton() throws InterruptedException {
        Thread.sleep(2000);
        List<WebElement> elementList = findElements(btnClose);
        clickJS(elementList.get(4));
        log.info("Close Button clicked.");
        return this;
    }

    public TroubleTicketsPage clickExtendedWidgetButton(String menu) throws InterruptedException {
        clickJS(By.xpath("//span[contains(text(),'Extended Widget')]"));
        log.info("Extended Widget Button clicked.");
        return this;
    }

    public TroubleTicketsPage controlDefaultCustomerId() {
        log.info("Customer Id Default Value checking.");
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        String incomingCustomerId = js.executeScript("return document.querySelector('[formcontrolname=customerId]').value").toString();
        control(!(incomingCustomerId.isEmpty()), "Customer Id Default Value is exist.", "ERROR: Customer Id Default Value is not exist.");
        return this;
    }

    public TroubleTicketsPage clickTicketCloseButton() throws InterruptedException {
        clickJS(By.cssSelector("[aria-label='Close dialog']"));
        log.info("Close Button clicked.");
        return this;
    }

    public TroubleTicketsPage selectSubType(String subType) throws InterruptedException {
        log.info("Select SubType:" + subType);
        selectMatCombobox(cmbSubTypes, subType);
        return this;
    }

    public TroubleTicketsPage clickExtendButton() throws InterruptedException {
        clickJS(By.xpath("//span[contains(text(),'Extend')]"));
        log.info("Extend Button clicked.");
        return this;
    }

    public TroubleTicketsPage clickMainMoveVertIcon() throws InterruptedException {
        clickJS(btnMoreProcess);
        log.info("Main Move Vert Icon clicked.");
        return this;
    }

    public TroubleTicketsPage controlMandatoryMessage(String fieldName) throws InterruptedException {
        log.info("Mandatory Field is checking.");
        switch (fieldName) {
            case "Shop":
                control(isElementExist(txtShopInvalid), fieldName + "mandatory field is exist.", "ERROR:" + fieldName + "mandatory field is not exist.");
                break;
            case "Service Address City":
                control(isElementExist(txtServiceAddressCityInvalid), fieldName + "mandatory field is exist.", "ERROR:" + fieldName + "mandatory field is not exist.");
                break;
            case "Appointment Date & Time":
                control(isElementExist(txtAppointmentDateAndTimeInvalid), fieldName + "mandatory field is exist.", "ERROR:" + fieldName + "mandatory field is not exist.");
                break;
            case "Service Activation Date":
                control(isElementExist(txtServiceActivationDateInvalid), fieldName + "mandatory field is exist.", "ERROR:" + fieldName + "mandatory field is not exist.");
                break;
            case "MAC Address":
                control(isElementExist(txtMacAddressInvalid), fieldName + "mandatory field is exist.", "ERROR:" + fieldName + "mandatory field is not exist.");
                break;
            case "Serial Number":
                control(isElementExist(txtSerialNumberInvalid), fieldName + "mandatory field is exist.", "ERROR:" + fieldName + "mandatory field is not exist.");
                break;
            case "Order Item Number":
                control(isElementExist(txtOrderItemNumberInvalid), fieldName + "mandatory field is exist.", "ERROR:" + fieldName + "mandatory field is not exist.");
                break;
            case "Customer Link":
                control(isElementExist(txtCustomerLinkInvalid), fieldName + "mandatory field is exist.", "ERROR:" + fieldName + "mandatory field is not exist.");
                break;
            case "Create":
                control(isElementExist(btnCreate), fieldName + "mandatory field is exist.", "ERROR:" + fieldName + "mandatory field is not exist.");
                break;
            case "Order Item ID":
                control(isElementExist(txtOrderItemIDInvalid), fieldName + "mandatory field is exist.", "ERROR:" + fieldName + "mandatory field is not exist.");
                break;
            case "Error On System":
                Thread.sleep(2000);
                control(isElementExist(txtErrorOnSystemInvalid), fieldName + "mandatory field is exist.", "ERROR:" + fieldName + "mandatory field is not exist.");
                break;
            case "Subject":
                control(isElementExist(txtSubjectInvalid), fieldName + "mandatory field is exist.", "ERROR:" + fieldName + "mandatory field is not exist.");
                break;
            case "Description":
                control(isElementExist(txtDescriptionInvalid), fieldName + "mandatory field is exist.", "ERROR:" + fieldName + "mandatory field is not exist.");
                break;
            case "Issue Category":
                control(isElementExist(txtIssueCategoryInvalid), fieldName + "mandatory field is exist.", "ERROR:" + fieldName + "mandatory field is not exist.");
                break;
            default:
                //code block
        }
        //control(isElementExist(cmbSubTypesInvalid), fieldName + "mandatory field is exist.", "ERROR:" + fieldName + "mandatory field is not exist.");
        return this;
    }

    public TroubleTicketsPage clickSubTypes() throws InterruptedException {
        //clickJS(cmbSubTypes);
        clickJS(cmbSubTypes);
        WebElement element = findElement(cmbSubTypes);
        element.sendKeys(Keys.ESCAPE);
        return this;
    }

    public TroubleTicketsPage controlPriorityField(String urgent, String high, String medium, String low) {
        log.info("Priority Field is checking.");
        List<WebElement> elementList = findElements(By.cssSelector("span[class='mat-option-text']"));
        control(elementList.get(0).getText().contains(urgent), urgent + "priority type is exist.", "ERROR:" + urgent + "priority type is not exist.");
        control(elementList.get(1).getText().contains(high), high + "priority type is exist.", "ERROR:" + high + "priority type is not exist.");
        control(elementList.get(2).getText().contains(medium), medium + "priority type is exist.", "ERROR:" + medium + "priority type is not exist.");
        control(elementList.get(3).getText().contains(low), low + "priority type is exist.", "ERROR:" + low + "priority type is not exist.");
        return this;
    }

    public TroubleTicketsPage controlNotEditableTicketField(String fieldName) {
        log.info(fieldName + "Not Editable Field is checking.");
        switch (fieldName) {
            case "Created Date":
                control(isElementExist(txtCreatedDateDefault), fieldName + "field is not editable.", "ERROR:" + fieldName + "field is editable.");
                break;
            case "Ticket ID":
                control(isElementExist(txtTicketIdDefault), fieldName + "field is not editable.", "ERROR:" + fieldName + "field is editable.");
                break;
            case "Description":
                control(isElementExist(txtDescriptionDefault), fieldName + "field is not editable.", "ERROR:" + fieldName + "field is editable.");
                break;
            case "Subject":
                control(isElementExist(txtSubjectDefault), fieldName + "field is not editable.", "ERROR:" + fieldName + "field is editable.");
                break;
            case "Assignee":
                control(isElementExist(txtAssigneeDefault), fieldName + "field is not editable.", "ERROR:" + fieldName + "field is editable.");
                break;
            case "SLA":
                control(isElementExist(txtSLADefault), fieldName + "field is not editable.", "ERROR:" + fieldName + "field is editable.");
                break;
            case "Expected Resolution Date":
                control(isElementExist(txtExpectedResolutionDateDefault), fieldName + "field is not editable.", "ERROR:" + fieldName + "field is editable.");
                break;
            default:
                //code block
        }
        return this;
    }

    public TroubleTicketsPage controlTicketDetailsPopupValue(String fieldName) throws InterruptedException {
        log.info(fieldName + "Value is checking.");
        String expectedValue = "";
        //String incomingValue = "";

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) getWebDriver();

        switch (fieldName) {
            case "Ticket ID":
                //incomingValue = javascriptExecutor.executeScript("return document.querySelector('[formcontrolname=externalId]').value").toString();
                expectedValue = worldHelper.getCustomerCaseManagementData().getTicketId();
                break;
            case "Subject":
                //incomingValue = javascriptExecutor.executeScript("return document.querySelector('[formcontrolname=name][class*=ng-valid]').value").toString();
                expectedValue = worldHelper.getTroubleTicketResponse().getName();
                break;
            case "Description":
                //incomingValue = javascriptExecutor.executeScript("return document.querySelector('[formcontrolname=description]').value").toString();
                expectedValue = worldHelper.getTroubleTicketResponse().getDescription();
                break;
            case "Status":
                //incomingValue = javascriptExecutor.executeScript("return document.querySelector('[formcontrolname=status]').value").toString();
                expectedValue = worldHelper.getTroubleTicketResponse().getStatus();
                //Date date1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse(expectedValue);
                //expectedValue = new SimpleDateFormat("dd/MM/yyyy").format(date1);
                break;
            case "Priority":
                //incomingValue = getWebDriver().findElement(By.cssSelector("[formcontrolname='priority'] [class*='mat-select-value-text'] span")).getText();
                expectedValue = worldHelper.getTroubleTicketResponse().getPriority();
                break;
            case "Case Type":
                //incomingValue = getTextOfElement(By.cssSelector("[formcontrolname='ticketType'] [class*='mat-select-value-text'] span"));
                expectedValue = worldHelper.getTroubleTicketResponse().getTicketType();
                break;
            case "Created Date":
                //incomingValue = javascriptExecutor.executeScript("return document.querySelector('[formcontrolname=creationDate]').value").toString();
                expectedValue = worldHelper.getTroubleTicketResponse().getCreationDate();
                break;
            case "Expected Resolution Date":
                //incomingValue = javascriptExecutor.executeScript("return document.querySelector('[formcontrolname=expectedResolutionDate]').value").toString();
                expectedValue = worldHelper.getTroubleTicketResponse().getExpectedResolutionDate();
                break;
            case "Sub Types":
                //incomingValue = getTextOfElement(By.cssSelector("[ng-reflect-name='72'] [class*='mat-select-value-text'] span"));
                expectedValue = "";
                break;
            case "Product Information":
                //incomingValue = findElement(txtProductInformation).getAttribute("ng-reflect-value");
                expectedValue = "";
                break;
            case "Installation Ticket Number":
                //incomingValue = javascriptExecutor.executeScript("return document.querySelector('[ng-reflect-name=80]').value").toString();
                expectedValue = "";
                break;
            case "Issue Category":
                //incomingValue = getTextOfElement(By.cssSelector("[ng-reflect-name='73'] [class*='mat-select-value-text'] span"));
                expectedValue = "";
                break;
            default:
                //code block
        }
        log.info("Expected Value:" + expectedValue);
        //log.info("Incoming Value:" + incomingValue);
        //control(incomingValue.contains(expectedValue), fieldName + "Value is successfully.", "ERROR:" + fieldName + "Value is not successfully");
        control(isElementExist(By.xpath("//*[contains(text(),'" + expectedValue + "')]")), "Popup control is successfully", "ERROR:Popup control is not successfully");

        return this;
    }

    public TroubleTicketsPage clickUpdateButton() throws InterruptedException {
        Thread.sleep(1000);
        clickJS(btnUpdate);
        log.info("Update Button clicked.");
        return this;
    }

    public TroubleTicketsPage controlTroubleTicketList(String fieldName) throws InterruptedException {
        Thread.sleep(2000);
        log.info(fieldName + " List Value is checking.");
        String expectedValue = "";
        //String incomingValue = "";

        switch (fieldName) {
            case "Priority":
                //incomingValue = findElements(By.xpath("//table/tbody/tr[1]/td[5]")).get(1).getText();
                expectedValue = worldHelper.getCustomerCaseManagementData().getTicketPriority();
                break;
            default:
                //code block
        }
        log.info("Expected Value:" + expectedValue);
        //log.info("Incoming Value:" + incomingValue);
        //control(incomingValue.contains(expectedValue), fieldName + "Value is successfully.", "ERROR:" + fieldName + "Value is not successfully");
        control(isElementExist(By.xpath("//*[contains(text(),'" + expectedValue + "')]")), "Popup control is successfully", "ERROR:Popup control is not successfully");

        return this;
    }

    public TroubleTicketsPage enterRefundAmount(String refundAmount) throws InterruptedException {
        Thread.sleep(500);
        sendKeys(txtRefundAmount2, refundAmount, false);
        log.info("Enter Refund Amount:" + refundAmount);
        return this;
    }

    public TroubleTicketsPage enterShop(String shop) throws InterruptedException {
        sendKeys(txtShop, shop, false);
        log.info("Enter Shop:" + shop);
        return this;
    }

    public TroubleTicketsPage enterServiceAddressCity(String serviceAddressCity) throws InterruptedException {
        sendKeys(txtServiceAddressCity, serviceAddressCity, false);
        log.info("Enter Service Address City:" + serviceAddressCity);
        return this;
    }

    public TroubleTicketsPage enterAppointmentDateAndTime(String appointmentDateAndTime) throws InterruptedException {
        findElement(txtAppointmentDateAndTime).sendKeys(Keys.SPACE);
        findElement(txtAppointmentDateAndTime).sendKeys(Keys.ENTER);
        log.info("Enter Appointment Date And Time:" + appointmentDateAndTime);
        return this;
    }

    public TroubleTicketsPage enterServiceActivationDate(String serviceActivationDate) throws InterruptedException, ParseException {
        findElement(txtServiceActivationDate).sendKeys(Keys.SPACE);
        findElement(txtServiceActivationDate).sendKeys(Keys.ENTER);
        //JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        //String expectedValue = js.executeScript("return document.querySelector('[ng-reflect-name=134]').value").toString();
        //worldHelper.setServiceActivationDate(expectedValue);
        log.info("Enter Service Activation Date:" + serviceActivationDate);
        return this;
    }

    public TroubleTicketsPage enterMacAddress(String macAddress) throws InterruptedException {
        sendKeys(txtMacAddress, macAddress, false);
        log.info("Enter Mac Address:" + macAddress);
        return this;
    }

    public TroubleTicketsPage enterSerialNumber(String serialNumber) throws InterruptedException {
        sendKeys(txtSerialNumber, serialNumber, false);
        log.info("Enter Serial Number:" + serialNumber);
        return this;
    }

    public TroubleTicketsPage enterOrderItemNumber(String orderItemNumber) throws InterruptedException {
        sendKeys(txtOrderItemNumber, orderItemNumber, false);
        log.info("Enter Order Item Number:" + orderItemNumber);
        return this;
    }

    public TroubleTicketsPage enterCustomerLink(String customerLink) throws InterruptedException {
        sendKeys(txtCustomerLink, customerLink, false);
        log.info("Enter Customer Link:" + customerLink);
        return this;
    }

    public TroubleTicketsPage controlTroubleTicketListValue(String expectedValue, String fieldName) throws InterruptedException {
        log.info(fieldName + "Field Value is checking.");
        log.info("Expected Value" + expectedValue);
        if (fieldName.contains("Case Type") || fieldName.contains("Sub Types")) {
            control(isElementExist(By.xpath("//table/tbody/tr[1]/td/span[contains(text(),'" + expectedValue + "')]")), fieldName + "Value is successfully.", "ERROR:" + fieldName + "Value is not successfully");
        } else {
            control(isElementExist(By.xpath("//table/tbody/tr[1]/td[contains(text(),'" + expectedValue + "')]")) || isElementExist(By.xpath("//table/tbody/tr[1]/td/span[contains(text(),'" + expectedValue + "')]")), fieldName + "Value is successfully.", "ERROR:" + fieldName + "Value is not successfully");
        }
        return this;
    }

    public TroubleTicketsPage enterSubjectForCreateTicketPage(String subject) throws InterruptedException, AWTException {
        //getWebDriver().switchTo().window(getWebDriver().getWindowHandle());
        if (subject.equals("")) {
            Thread.sleep(2000);
            findElement(txtSubject).sendKeys("A");
            findElement(txtSubject).sendKeys(Keys.BACK_SPACE);
        } else {
            //clearText(txtSubject);
            String newName = subject + " " + getRandomNumberInRange(1000000, 9999999);
            customerCaseManagementData.setTicketSubjectName(newName);
            worldHelper.setCustomerCaseManagementData(customerCaseManagementData);
            log.info("Enter Subject:" + newName);
            //List<WebElement> webElement = findElements(txtSubject);
            //webElement.get(1).sendKeys(newName);
            findElement(txtSubject).sendKeys(newName);
        }
        return this;
    }

    public TroubleTicketsPage controlTroubleTicketPopupFieldValue(String expectedValue) throws InterruptedException {
        log.info("Field Value is checking.");
        String incomingValue = findElement(txtServiceActivationDate).getAttribute("ng-reflect-value");
        log.info("Expected Value:" + worldHelper.getServiceActivationDate());
        log.info("Incoming Value:" + incomingValue);
        control(incomingValue.contains(expectedValue), expectedValue + "value is exist.", "ERROR:" + expectedValue + "value is not exist.");
        return this;
    }

    public TroubleTicketsPage enterOrderItemID(String orderItemID) throws InterruptedException {
        sendKeys(txtOrderItemID, orderItemID, false);
        log.info("Enter Order Item ID:" + orderItemID);
        return this;
    }

    public TroubleTicketsPage enterErrorOnTicket(String errorOnSystem) throws InterruptedException, AWTException {
        if (errorOnSystem.equals("")) {
            sendKeys(txtErrorOnSystemInvalid, "A", false);
            findElement(txtErrorOnSystemInvalid).sendKeys(Keys.BACK_SPACE);
        } else
            sendKeys(txtErrorOnSystem, errorOnSystem, false);

        log.info("Enter Error on System:" + errorOnSystem);
        return this;
    }

    public TroubleTicketsPage controlNotComeTicketName(String ticketName) {
        log.info(ticketName + "Ticket Name is checking.");
        control(!(isElementExist(By.xpath("//td[contains(text(),'" + ticketName + "')]"))), ticketName + " Ticket Name is not exist.", "ERROR:" + ticketName + "Ticket Name is exist.");
        return this;
    }

    public TroubleTicketsPage clickFaveoButton() throws InterruptedException {
        //Props props = new Props();
        //String url = "";
        //url = props.getProp("dcase.site.url");
        //getWebDriver().navigate().to(url);
        Thread.sleep(500);
        clickJS(btnFaveo);
        log.info("Faveo Button clicked.");
        return this;
    }

    public TroubleTicketsPage controlProductInformationTitle(String titleName) {
        log.info(titleName + "Title is checking.");
        control(isElementExist(By.xpath("//input[contains(@ng-reflect-value,'" + titleName + "')]")), titleName + "title is exist.", "ERROR:" + titleName + "title is not exist.");
        return this;
    }

    public TroubleTicketsPage controlTerminationRequestCancelledDropdown(String fieldOne, String fieldTwo) throws InterruptedException, AWTException {
        Thread.sleep(2000);
        log.info("Termination Request Cancelled Dropdown List is checking.");
        clickJS(cmbTerminationRequestCancelled);
        Thread.sleep(1000);
        control(isElementExist(By.xpath("//*[contains(text(),'" + fieldOne + "')]")), fieldOne + "field is exist.", "ERROR: " + fieldOne + "field is not exist.");
        control(isElementExist(By.xpath("//*[contains(text(),'" + fieldTwo + "')]")), fieldTwo + "field is exist.", "ERROR: " + fieldTwo + "field is not exist.");
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        return this;
    }

    public TroubleTicketsPage selectTerminationRequest(String terminationRequest) throws InterruptedException {
        Thread.sleep(1500);
        selectMatComboboxJS(cmbTerminationRequestCancelled, terminationRequest);
        log.info("Select Termination Request:" + terminationRequest);
        return this;
    }

    public TroubleTicketsPage controlDropdownField(String fieldName) {
        log.info(fieldName + " Dropdown List is checking.");
        By locator = null;

        switch (fieldName) {
            case "Termination Reason":
                locator = cmbTerminationReason;
                break;
            case "Penalty Waiving":
                locator = cmbPenaltyWaiving;
                break;
            default:
                //code block
        }

        control(isElementExist(locator), fieldName + "field is exist.", "ERROR: " + fieldName + "field is not exist.");
        return this;
    }

    public TroubleTicketsPage controlTerminationReasonDropdown(String fieldOne, String fieldTwo, String fieldThree) throws InterruptedException, AWTException {
        log.info("Termination Reason Field Value is checking.");
        clickJS(cmbTerminationReason);
        Thread.sleep(1000);
        control(isElementExist(By.xpath("//*[contains(text(),'" + fieldOne + "')]")), fieldOne + "field is exist.", "ERROR:" + fieldOne + "field is not exist.");
        control(isElementExist(By.xpath("//*[contains(text(),'" + fieldTwo + "')]")), fieldTwo + "field is exist.", "ERROR:" + fieldTwo + "field is not exist.");
        control(isElementExist(By.xpath("//*[contains(text(),'" + fieldThree + "')]")), fieldThree + "field is exist.", "ERROR:" + fieldThree + "field is not exist.");
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        return this;
    }

    public TroubleTicketsPage selectTerminationReason(String terminationReason) throws InterruptedException {
        selectMatComboboxJS(cmbTerminationReason, terminationReason);
        log.info("Select Termination Reason:" + terminationReason);
        return this;
    }

    public TroubleTicketsPage controlPenaltyWaivingDropdown(String fieldOne, String fieldTwo) throws AWTException, InterruptedException {
        log.info("Penalty Waiving Field Value is checking.");
        clickJS(cmbPenaltyWaiving);
        Thread.sleep(1000);
        control(isElementExist(By.xpath("//*[contains(text(),'" + fieldOne + "')]")), fieldOne + "field is exist.", "ERROR:" + fieldOne + "field is not exist.");
        control(isElementExist(By.xpath("//*[contains(text(),'" + fieldTwo + "')]")), fieldTwo + "field is exist.", "ERROR:" + fieldTwo + "field is not exist.");
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        return this;
    }

    public TroubleTicketsPage selectPenaltyWaiving(String penaltyWaiving) throws InterruptedException {
        selectMatComboboxJS(cmbPenaltyWaiving, penaltyWaiving);
        log.info("Select Penalty Waiving:" + penaltyWaiving);
        return this;
    }

    public TroubleTicketsPage selectWaivingReason(String waivingReason) throws InterruptedException {
        Thread.sleep(1000);
        //selectMatComboboxJS(cmbWaivingReason, waivingReason);
        //log.info("Select Waiving Reason:" + waivingReason);
        sendKeys(cmbWaivingReason,waivingReason);
        log.info("Enter Waiving Reason:" + waivingReason);
        return this;
    }

    public TroubleTicketsPage clickCloseButtonForEnterpriseAndInstitute() throws InterruptedException {
        Thread.sleep(2000);
        List<WebElement> elementList = findElements(btnClose);
        clickJS(elementList.get(3));
        log.info("Close Button clicked.");
        return this;
    }

    public TroubleTicketsPage controlNotSeeingField(String fieldName) throws InterruptedException {
        Thread.sleep(3000);
        log.info(fieldName + "Field is checking.");
        control(!(isElementExist(By.xpath("//*[contains(text(),'"+fieldName+"')]"))),fieldName +" field is not exist.","ERROR:" + fieldName + " field is exist.");
        return this;
    }

    public TroubleTicketsPage selectReasonDetail(String reasonDetail) throws InterruptedException {
        Thread.sleep(2000);
        //selectMatComboboxJS(cmbReasonDetail,reasonDetail);
        switch(reasonDetail){
            case "Not Saved- Roaming":
                clickJS(By.id("190"));
                break;
            default:
                clickJS(cmbReasonDetail);
        }

        Thread.sleep(2000);
        clickJS(By.xpath("//mat-option/span[contains(.,'" + reasonDetail + "')]"));
        log.info("Select Reason Detail " + reasonDetail);
        Thread.sleep(1000);
        clickJS(findElements(btnCreate).get(1));
        return this;
    }

    public TroubleTicketsPage selectIssueCategoryForInteraction(String issueCategory) throws InterruptedException {
        Thread.sleep(1500);
        selectMatComboboxJS(cmbIssueCategoryInteraction,issueCategory);
        return this;
    }

    public TroubleTicketsPage selectSubTypeInteraction(String subType) throws InterruptedException {
        Thread.sleep(1500);
        selectMatComboboxJS(cmbSubTypeInteraction,subType);
        return this;
    }
}

