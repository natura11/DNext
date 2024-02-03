package optiim.pages.customermanagement;

import optiim.framework.core.PageBase;
import optiim.framework.helpers.WebDriverHelper;
import optiim.framework.helpers.WorldHelper;
import optiim.framework.utils.log;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class CorporateParentCustomerPage extends PageBase {

    public static final By titlePageName = By.xpath("//span[contains(text(),'Parent Accounts')]");
    public static final By titleAddParentPopupName = By.xpath("//h2[@id='mat-dialog-title-1']");
    public static final By tblCustomer = By.cssSelector("[role='gridcell'] span");
    public static final By titleItemsPerPage = By.xpath("//div[contains(text(),'Items per page:')]");
    public static final By cmbItemsPerPage = By.cssSelector("[aria-label='Items per page:']");
    public static final By btnNextPage = By.cssSelector("[aria-label='Next page']");
    public static final By btnPreviousPage = By.cssSelector("[aria-label='Previous page']");
    public static final By txtSearchCustomer = By.cssSelector("[placeholder='Search for a customer']");
    public static final By btnAddParentAccount = By.id("add-account-button");
    public static final By txtParentAccountName = By.cssSelector("[formcontrolname='name']");
    public static final By txtParentAccountNameInvalid = By.cssSelector("[formcontrolname='name'][class*='ng-invalid']");
    public static final By btnNewCustomer = By.xpath("//span[contains(text(),'New Customer')]");
    public static final By optCorporateCustomer = By.cssSelector("[role='option'] span");
    public static final By btnClose = By.xpath("//mat-icon[contains(text(),'close')]");
    public static final By btnDone = By.xpath("//mat-icon[contains(text(),'done')]");
    public static final By btnBlock = By.xpath("//mat-icon[contains(text(),'block')]");
    public static final By btnEdit = By.xpath("//mat-icon[contains(text(),'edit')]");
    public static final By btnAdd = By.xpath("//span[contains(text(),'Add')]");
    public static final By btnAddDeactive = By.cssSelector("[class*='mat-button-disabled'][class*='ng-star-inserted']");
    public static final By btnCancel = By.xpath("//span[contains(text(),'Cancel')]");
    public static final By btnConfirm = By.xpath("//span[contains(text(),'Confirm')]");
    public static final By alertPopupMessage = By.cssSelector("[role='alert'] [class='mat-simple-snackbar ng-star-inserted']");
    public static final By txtNIPT = By.cssSelector("[name='name']");
    public static final By txtNIPTInvalid = By.cssSelector("[name='name'][class*='ng-invalid']");
    public static final By btnSearch = By.xpath("//mat-form-field//mat-icon[contains(text(),'search')]");


    private final WorldHelper worldHelper;

    public CorporateParentCustomerPage(WebDriverHelper webDriverHelper, WorldHelper worldHelper) {
        super(webDriverHelper);
        this.worldHelper = worldHelper;
    }

    public CorporateParentCustomerPage controlParentAccount(String titleName) throws InterruptedException {
        //String incomingTitleName = getTextOfElement(titlePageName);
        //log.info("Incoming Page Title Name:" + incomingTitleName);
        log.info("Expected Page Title Name:" + titleName);
        //control(incomingTitleName.contains(titleName), titleName + "title name is exist.", "ERROR:" + titleName + "title name is not exist.");
        control(isElementExist(By.xpath("//*[contains(text(),'" + titleName + "')]")), titleName + "title name is exist.", "ERROR:" + titleName + "title name is not exist.");
        return this;
    }

    public CorporateParentCustomerPage clickAddButton() throws InterruptedException {
        clickJS(btnAddParentAccount);
        log.info("Add New Parent Account Button clicked.");
        return this;
    }

    public CorporateParentCustomerPage controlAddPopup(String popupTitleName) throws InterruptedException {
        Thread.sleep(2000);
        //String incomingTitleName = getTextOfElement(titleAddParentPopupName);
        //log.info("Incoming Page Popup Name:" + incomingTitleName);
        log.info("Expected Page Popup Name:" + popupTitleName);
        //control(incomingTitleName.contains(popupTitleName), popupTitleName + "title name is exist.", "ERROR:" + popupTitleName + "title name is not exist.");
        control(isElementExist(By.xpath("//span[contains(text(),'" + popupTitleName + "')]")), popupTitleName + "title name is exist.", "ERROR:" + popupTitleName + "title name is not exist.");

        return this;
    }

    public CorporateParentCustomerPage enterName(String name) throws InterruptedException {
        //elementToBeClickable(txtParentAccountName);
        clickJS(txtParentAccountName);
        sendKeys(txtParentAccountName, name);
        log.info("Enter Name:" + name);
        return this;
    }

    public CorporateParentCustomerPage controlNameField() {
        control(isElementExist(txtParentAccountName), "Name field is exist.", "ERROR: Name field is not exist.");
        return this;
    }

    public CorporateParentCustomerPage controlErrorMessage(String fieldName) {
        switch (fieldName) {
            case "Name":
                control(isElementExist(txtParentAccountNameInvalid), fieldName + "Invalid and mandatory field.", "ERROR:" + fieldName + "valid and not mandatory field.");
                break;
            case "Add":
                control(isElementExist(btnAddDeactive), fieldName + "button is deactive.", "ERROR:" + fieldName + "button is not deactive.");
                break;
            case "NIPT":
                control(isElementExist(txtNIPTInvalid), fieldName + "Invalid and mandatory field.", "ERROR:" + fieldName + "valid and not mandatory field.");
                break;
            default:
                //code block
        }
        return this;
    }

    public CorporateParentCustomerPage clickAddParentButton() throws InterruptedException {
        clickJS(btnAdd);
        log.info("Add Parent Account Button clicked.");
        clickJS(btnConfirm);
        log.info("Confirm Button clicked.");
        return this;
    }

    public CorporateParentCustomerPage controlValueField(String value, String field) {

        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        log.info("Enter value:" + value);
        String expected = value.toUpperCase().replace('İ', 'I');
        log.info("Expected:" + expected);

        String incoming = null;

        switch (field) {
            case "Name":
                incoming = js.executeScript("return document.querySelector('[formcontrolname=name]').value").toString();
                break;
            default:
                // code block
        }

        log.info("Incoming:" + incoming);
        control(incoming.equals(expected), "Value characters are uppercase.", "ERROR:Value characters are not uppercase.");
        if (field.equals("Email")) {
            control((incoming.contains("@") && (incoming.contains("."))), "'@' and '.' included.", "ERROR:'@' and '.' not included.");
            //control(isElementExist(txtEmailValid),"Valid and mandatory field.", "ERROR:Valid and not mandatory field.");
        }

        return this;
    }

    public CorporateParentCustomerPage controlCreateParentAccount(String parentAccountName) throws InterruptedException {
        getWebDriver().navigate().refresh();
        sendKeys(txtSearchCustomer, parentAccountName);
        waitElement(By.xpath("//span[contains(text(),'" + parentAccountName + "')]"));
        control(isElementExist(By.xpath("//span[contains(text(),'" + parentAccountName + "')]")), parentAccountName + "parent account created.", "ERROR:" + parentAccountName + "parent account did not create.");
        return this;
    }

    public CorporateParentCustomerPage controlPopupMessage(String message) throws InterruptedException {
        //waitForExpectedElement(alertPopupMessage);
        log.info("Expected Popup Message:" + message);
        //String incomingMessage = getTextOfElement(alertPopupMessage);
        //log.info("Incoming Message:" + incomingMessage);
        control(isElementExist(By.xpath("//*[contains(text(),'" + message + "')]")), "Popup control is successfully", "ERROR:Popup control is not successfully");
        Thread.sleep(2000);
        return this;
    }

    public CorporateParentCustomerPage clickNewCustomerButton() throws InterruptedException {
        clickJS(btnNewCustomer);
        log.info("New Customer Button clicked.");
        return this;
    }

    public CorporateParentCustomerPage enterNIPT(String nipt) throws InterruptedException {
        sendKeys(txtNIPT, nipt, true);
        log.info("Enter NIPT Number:" + nipt);
        return this;
    }

    public CorporateParentCustomerPage enterNIPTForRegisteredUser(String nipt) throws InterruptedException {
        nipt = worldHelper.getNewCreateCorporateCustomerRequest().getPartyOperations().get(0).getValue().getOrganizationIdentification().get(0).getIdentificationId();
        sendKeys(txtNIPT, nipt, true);
        log.info("Enter NIPT Registered User Number:" + nipt);
        return this;
    }

    public CorporateParentCustomerPage clickSearchButton() throws InterruptedException {
        clickJS(btnSearch);
        log.info("Search Button clicked.");
        return this;
    }

    public CorporateParentCustomerPage clickSearchList() throws InterruptedException {
        clickJS(optCorporateCustomer);
        log.info("Search List clicked.");
        return this;
    }

    public CorporateParentCustomerPage clickButton(String buttonName) throws InterruptedException {
        switch (buttonName) {
            case "Done":
                clickJS(btnDone);
                break;
            default:
                //code block
        }
        log.info(buttonName + "Button clicked.");
        return this;
    }
}
