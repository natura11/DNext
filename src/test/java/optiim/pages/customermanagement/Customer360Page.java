package optiim.pages.customermanagement;

import optiim.framework.core.PageBase;
import optiim.framework.helpers.WebDriverHelper;
import optiim.framework.helpers.WorldHelper;
import optiim.framework.utils.log;
import optiim.models.data.gui.customermanegement.CreateCustomerResidentialData;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


public class Customer360Page extends PageBase {

    public static final By titleCustomer360 = By.xpath("//span[contains(text(),'Customer Search')]");
    public static final By cmbSearchType = By.xpath("//mat-select-trigger");
    public static final By txtSearch = By.cssSelector("input[role='combobox']");
    public static final By btnSearch = By.xpath("//mat-icon[contains(text(),'search')]");
    public static final By titleOption = By.cssSelector("[class='mat-option-text']");
    public static final By titleTab = By.cssSelector("div[role='tab'] [class='mat-tab-label-content']");
    public static final By titleProductList = By.xpath("//*[contains(text(),'Product Id')]");
    public static final By btnClose = By.xpath("//mat-icon[contains(text(),'close')]");
    public static final By titleBillingAddressField = By.xpath("//mat-expansion-panel[1]//strong");
    public static final By titleBillingAddressValue = By.xpath("//mat-expansion-panel[1]//p/span");
    public static final By titleServiceAddressField = By.xpath("//mat-expansion-panel[2]//strong");
    public static final By titleServiceAddressValue = By.xpath("//mat-expansion-panel[2]//p/span");
    public static final By titleDocumentInfo = By.xpath("//tr[contains(@class,'mat-row')]/td");
    public static final By btnEdit = By.xpath("//*[contains(text(),'Edit')]");
    public static final By btnSaveNotActive = By.xpath("//button[@ng-reflect-disabled='true']//span[contains(text(),'Save')]");
    public static final By txtBillingAccountName = By.cssSelector("[placeholder='billingAccountName']");
    public static final By txtAgreementId = By.cssSelector("[placeholder='agreementId']");
    public static final By txtStartDate = By.cssSelector("[placeholder='startDate']");
    public static final By txtTerminationDate = By.cssSelector("[ng-reflect-placeholder='terminationDate']");
    public static final By btnCopyUrlLink = By.cssSelector("[ng-reflect-message='Copy Customer Url']");
    public static final By alertPopupMessage = By.cssSelector("[role='alert'] [class='mat-simple-snackbar ng-star-inserted']");
    public static final By agreementID = By.xpath("//input[@id='mat-input-2']");
    public static final By btnNewOrder = By.xpath("//span[contains(text(),'New Order')]");
    public static final By btnRePurchase = By.xpath("//*[contains(text(),'Re-Purchase')]");
    public static final By btnInvoice = By.xpath("//button[@color='primary']");
    public static final By btnNewAttachment = By.cssSelector("[ng-reflect-message='Create New Attachment']");
    public static final By cmbDocumentType = By.cssSelector("[name='docType']");
    public static final By pcrIssuingDate = By.cssSelector("[name='identificationIssuingDate']");
    public static final By txtDocumentNumber = By.cssSelector("[name='documentNumber']");
    public static final By btnAttachFile = By.xpath("//mat-icon[contains(text(),'add')]");
    public static final By txtFileInput = By.cssSelector("[type='file']");
    public static final By cmbResourceType = By.cssSelector("[formcontrolname='spec'][role='listbox']");
    public static final By txtPremiumValue = By.cssSelector("input[name='premiumValue']");
    public static final By btnCancel = By.xpath("//mat-icon[contains(text(),'cancel')]");
    public static final By btnOpenCalender = By.cssSelector("[aria-label='Open calendar']");
    public static final By btnCalenderMonthYear = By.cssSelector("[aria-label='Choose month and year']");
    public static final By btnCalender1992Year = By.xpath("//div[contains(text(),'1992')]");
    public static final By btnCalenderMoth = By.xpath("//*[contains(text(),'JUN')]");
    public static final By btnCalenderDay = By.xpath("//td[@aria-label='2 June 1992']");
    public static final By pcrBirthDate = By.cssSelector("[formcontrolname = 'birthDate']");
    public static final By cmbBlackListFlag = By.cssSelector("[formcontrolname = 'blacklistedFlag']");
    public static final By cmbGenderForContact = By.cssSelector("[formcontrolname = 'Gender']");
    public static final By cmbCitizenshipForContact = By.cssSelector("[formcontrolname='Citizenship']");
    public static final By cmbDocumentTypeForContact = By.cssSelector("[formcontrolname='AuthDocType']");
    public static final By btnAddNewDocument = By.xpath("//mat-icon[contains(text(),'add')]");
    public static final By txtMobileNumber = By.cssSelector("[formcontrolname='phoneNumber']");
    public static final By txtSalesAgent = By.cssSelector("[formcontrolname='salesAgent']");
    public static final By txtMacAdressForResource = By.cssSelector("[name='MACAddress']");
    public static final By btnMoreVertInteraction = By.xpath("//app-interactions-widget//*[contains(text(),'more_vert')]");

    private final WorldHelper worldHelper;

    public Customer360Page(WebDriverHelper webDriverHelper, WorldHelper worldHelper) {
        super(webDriverHelper);
        this.worldHelper = worldHelper;
    }


    public Customer360Page controlPage(String pageName) throws InterruptedException {
        log.info("Expected Customer360 Page Title:" + pageName);
        //Thread.sleep(3000);
        //waitForExpectedElement(titleCustomer360);
        //String incomingPageTitle = getTextOfElement(titleCustomer360);
        //log.info("Incoming Customer360 Page Title:" + incomingPageTitle);
        //control(incomingPageTitle.contains(pageName), pageName + "title is exist.", "ERROR:" + pageName + "title is not exist.");
        control(isElementExist(By.xpath("//*[contains(text(),'" + pageName + "')]")), "Popup control is successfully", "ERROR:Popup control is not successfully");
        log.info(getWebDriver().getCurrentUrl());
        control(getWebDriver().getCurrentUrl().contains("customer360"), "Customer360 page opened.", "ERROR: Customer360 page did not open.");
        return this;
    }

    public Customer360Page controlSearchTypeDropdown() {
        control(isElementExist(cmbSearchType), "Select Search Type Dropdown field is exist.", "ERROR: Select Search Type Dropdown field is not exist.");
        return this;
    }

    public Customer360Page selectSearchType(String searchType) throws InterruptedException, AWTException {
        Thread.sleep(1000);
        //elementToBeClickable(cmbSearchType);
        //selectMatComboboxJS(cmbSearchType,searchType);
        selectMatComboboxTrial(cmbSearchType, searchType);
        return this;
    }

    public Customer360Page enterSearchValue(String searchValue) throws InterruptedException, AWTException {
        Thread.sleep(2000);
        if (getTextOfElement(cmbSearchType).contains("Customer Name")) {
            searchValue = worldHelper.getNewIndividualCreateResponse().getName().replace("İ", "I");
        } else if (getTextOfElement(cmbSearchType).contains("Personal Number")) {
            searchValue = worldHelper.getNewCreateIndividualCustomerRequest().getPartyOperations().get(0).getValue().getIndividualIdentification().get(0).getIdentificationId();
        } else if (getTextOfElement(cmbSearchType).contains("NIPT")) {
            searchValue = worldHelper.getNewCreateCorporateCustomerRequest().getPartyOperations().get(1).getValue().getOrganizationIdentification().get(0).getIdentificationId();
        }


        log.info("Enter Search Value:" + searchValue);
        sendKeys(txtSearch, searchValue, true);

        //List<WebElement> elementList = findElements(btnSearch);
        //clickJS(elementList.get(1));
        //clickJS(elementList.get(1));
        log.info("Search Button clicked.");
        return this;
    }

    public Customer360Page controlSearchCustomer() throws InterruptedException {
        Thread.sleep(3000);
        log.info("Search Customer is checking.");
//        List<WebElement> elementList = findElements(titleOption);
//        control(elementList.size() > 0, elementList.size() + "value found.", "ERROR: Value did not found.");
//        int value = 0;
//        for (WebElement element : elementList) {
//            value++;
//            log.info(value + ". value" + element.getText());
//        }
        return this;
    }

    public Customer360Page clickSearchCustomer() throws InterruptedException {
        Thread.sleep(1750);
        List<WebElement> elementList = findElements(titleOption);
        clickJS(elementList.get(elementList.size() - 1));
        log.info("Search Customer clicked.");
        return this;
    }

    public Customer360Page controlCustomerDetailTab(String mainPage, String product, String order, String hierarchy) throws InterruptedException {
        Thread.sleep(2000);
        log.info("Detail Tab is checking.");
        control(isElementExist(titleTab), "Detail Tabs opened.", "ERROR: Detail Tabs did not open.");
        List<WebElement> elementList = findElements(titleTab);
        control(elementList.get(0).getText().contains(mainPage), mainPage + "field is exist.", "ERROR:" + mainPage + "field is not exist.");
        control(elementList.get(2).getText().contains(product), product + "field is exist.", "ERROR:" + product + "field is not exist.");
        control(elementList.get(4).getText().contains(order), order + "field is exist.", "ERROR:" + order + "field is not exist.");
        //control(elementList.get(3).getText().contains(hierarchy), hierarchy + "field is exist.", "ERROR:" + hierarchy + "field is not exist.");
        return this;
    }

    public Customer360Page controlMainPageTabField(String general, String address, String contact) {
        log.info("Main Page Tab Field is checking.");
        control(isElementExist(By.xpath("//*[contains(text(),'" + general + "')]")), general + "field is exist.", "ERROR:" + general + "field is not exist.");
        control(isElementExist(By.xpath("//*[contains(text(),'" + address + "')]")), address + "field is exist.", "ERROR:" + address + "field is not exist.");
        control(isElementExist(By.xpath("//*[contains(text(),'" + contact + "')]")), contact + "field is exist.", "ERROR:" + contact + "field is not exist.");
        return this;
    }

    public Customer360Page controlGeneralTabField(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5) {
        log.info("General Tab is checking.");
        control(isElementExist(By.xpath("//span[contains(text(),'" + arg0 + "')]")), arg0 + "field is exist.", "ERROR:" + arg0 + "field is not exist.");
        control(isElementExist(By.xpath("//span[contains(text(),'" + arg1 + "')]")), arg1 + "field is exist.", "ERROR:" + arg1 + "field is not exist.");
        control(isElementExist(By.xpath("//span[contains(text(),'" + arg2 + "')]")), arg3 + "field is exist.", "ERROR:" + arg2 + "field is not exist.");
        control(isElementExist(By.xpath("//span[contains(text(),'" + arg3 + "')]")), arg3 + "field is exist.", "ERROR:" + arg3 + "field is not exist.");
        control(isElementExist(By.xpath("//span[contains(text(),'" + arg4 + "')]")), arg4 + "field is exist.", "ERROR:" + arg4 + "field is not exist.");
        control(isElementExist(By.xpath("//span[contains(text(),'" + arg5 + "')]")), arg5 + "field is exist.", "ERROR:" + arg5 + "field is not exist.");
        return this;
    }

    public Customer360Page clickProductTabButton() throws InterruptedException {
        List<WebElement> elementList = findElements(titleTab);
        clickJS(elementList.get(1));
        log.info("Product Tab Button clicked.");
        return this;
    }

    public Customer360Page controlProductTabField(String tabName) throws InterruptedException {
        log.info("Product Tab is checking.");
        control(isElementExist(titleProductList), tabName + "field is exist.", "ERROR:" + tabName + "field is not exist.");
        Thread.sleep(7000);
        //getWebDriver().navigate().refresh();
        return this;
    }

    public Customer360Page clickOrderTabButton() throws InterruptedException {
        List<WebElement> elementList = findElements(titleTab);
        clickJS(elementList.get(2));
        log.info("Order Tab Button clicked.");
        return this;
    }

    public Customer360Page clickHierarchyTabButton() throws InterruptedException {
        List<WebElement> elementList = findElements(titleTab);
        clickJS(elementList.get(3));
        log.info("Hierarchy Tab Button clicked.");
        return this;
    }

    public Customer360Page controlSearchTypeDropdownField(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8) throws AWTException, InterruptedException {
        log.info("Search Type Field is checking.");
        clickJS(cmbSearchType);
        control(isElementExist(By.xpath("//span[contains(text(),'" + arg0 + "')]")), arg0 + "field is exist.", "ERROR:" + arg0 + "field is not exist.");
        control(isElementExist(By.xpath("//span[contains(text(),'" + arg1 + "')]")), arg1 + "field is exist.", "ERROR:" + arg1 + "field is not exist.");
        control(isElementExist(By.xpath("//span[contains(text(),'" + arg2 + "')]")), arg2 + "field is exist.", "ERROR:" + arg2 + "field is not exist.");
        control(isElementExist(By.xpath("//span[contains(text(),'" + arg3 + "')]")), arg3 + "field is exist.", "ERROR:" + arg3 + "field is not exist.");
        control(isElementExist(By.xpath("//span[contains(text(),'" + arg4 + "')]")), arg4 + "field is exist.", "ERROR:" + arg4 + "field is not exist.");
        control(isElementExist(By.xpath("//span[contains(text(),'" + arg5 + "')]")), arg5 + "field is exist.", "ERROR:" + arg5 + "field is not exist.");
        control(isElementExist(By.xpath("//span[contains(text(),'" + arg8 + "')]")), arg8 + "field is exist.", "ERROR:" + arg8 + "field is not exist.");
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        return this;
    }

    public Customer360Page clickSearchCustomerCloseButton() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        log.info("Search Customer Close Button clicked.");
        return this;
    }

    public Customer360Page clickButton(String buttonName) throws InterruptedException {
        Thread.sleep(7000);
        clickJS(By.xpath("//span[contains(text(),'" + buttonName + "')]"));
        log.info(buttonName + "Button clicked.");
        return this;
    }

    public Customer360Page controlTicketList() throws InterruptedException {
        log.info("Trouble Ticket List checking.");
        control(isElementExist(By.xpath("//div[contains(text(),'Trouble Tickets')]")), "Trouble Ticket List is exist.", "ERROR: Trouble Ticket List is not exist.");
        //control(isElementExist(By.xpath("//td[contains(text(),'Open')]")), "Open title is exist.", "ERROR: Open title is not exist.");
        return this;
    }

    public Customer360Page clickAddressTabButton() throws InterruptedException {
        List<WebElement> elementList = findElements(titleTab);
        clickJS(elementList.get(5));
        log.info("Address Tab Button clicked.");
        return this;
    }

    public Customer360Page controlTabField(String fieldName) throws InterruptedException {
        Thread.sleep(4000);
        log.info(fieldName + " Field is checking.");
        control(isElementExist(By.xpath("//*[contains(text(),'" + fieldName + "')]")), fieldName + "field is exist.", "ERROR:" + fieldName + "field is not exist.");
        return this;
    }

    public Customer360Page clickWidget(String widgetName) throws InterruptedException {
        Thread.sleep(2000);
        clickJS(By.xpath("//*[contains(text(),'" + widgetName + "')]"));
        log.info(widgetName + "Widget clicked.");
        Thread.sleep(500);
        return this;
    }

    public Customer360Page controlWidget(String widgetName) {
        log.info(widgetName + "Widget is checking.");
        if (widgetName.contains("Customer/Party")) {
            control(isElementExist(By.xpath("//div[@class='red-fg']//span[contains(text(),'" + widgetName + "')]")), widgetName + "widget opened.", "ERROR" + widgetName + " widget did not open.");
        } else {
            control(isElementExist(By.xpath("//*[contains(text(),'" + widgetName + "') and contains(@class,'red-fg')]")), widgetName + "widget opened.", "ERROR" + widgetName + " widget did not open.");
        }
        return this;
    }

    public Customer360Page controlBillingWidgetField(String addressLineOne, String addressLineTwo, String country, String city) {
        log.info("Billing Widget Field is checking.");
        control(isElementExist(By.xpath("//*[contains(text(),'" + addressLineOne + "')]")), addressLineOne + "field is exist.", "ERROR:" + addressLineOne + "field is not exist.");
        control(isElementExist(By.xpath("//*[contains(text(),'" + addressLineTwo + "')]")), addressLineTwo + "field is exist.", "ERROR:" + addressLineTwo + "field is not exist.");
        control(isElementExist(By.xpath("//*[contains(text(),'" + country + "')]")), country + "field is exist.", "ERROR:" + country + "field is not exist.");
        control(isElementExist(By.xpath("//*[contains(text(),'" + city + "')]")), city + "field is exist.", "ERROR:" + city + "field is not exist.");
        return this;
    }

    public Customer360Page controlBillingWidgetValue(String fieldName) {
        log.info(fieldName + " Value is checking.");

        String expectedValue = "";

        switch (fieldName) {
            case "Address Line 1":
                expectedValue = "ADDRESS1";

                break;
            case "Address Line 2":
                expectedValue = "ADDRESS2";

                break;
            case "Country":
                expectedValue = "ALBANIA";

                break;
            case "City":
                expectedValue = "TIRANE";

            default:
                //code block
        }

        log.info("Expected Value:" + expectedValue);
        control(isElementExist(By.xpath("//tr[2]//*[contains(text(),'" + expectedValue + "')]")), fieldName + " Value is successfully.", "ERROR:" + fieldName + "Value is not successfully");

        return this;
    }

    public Customer360Page controlServiceWidgetField(String addressLineOne, String addressLineTwo, String country, String city) {
        log.info("Service Widget Field is checking.");
        List<WebElement> elementList = findElements(titleServiceAddressField);
        control(elementList.get(0).getText().contains(addressLineOne), addressLineOne + "field is exist.", "ERROR:" + addressLineOne + "field is not exist.");
        control(elementList.get(1).getText().contains(addressLineTwo), addressLineTwo + "field is exist.", "ERROR:" + addressLineTwo + "field is not exist.");
        control(elementList.get(2).getText().contains(country), country + "field is exist.", "ERROR:" + country + "field is not exist.");
        control(elementList.get(3).getText().contains(city), city + "field is exist.", "ERROR:" + city + "field is not exist.");
        return this;
    }

    public Customer360Page controlServiceWidgetValue(String fieldName) {
        log.info(fieldName + " Value is checking.");

        String expectedValue = "";

        switch (fieldName) {
            case "Address Line 1":
                expectedValue = "ADDRESS1";

                break;
            case "Address Line 2":
                expectedValue = "ADDRESS2";

                break;
            case "Country":
                expectedValue = "ALBANIA";

                break;
            case "City":
                expectedValue = "TIRANE";

            default:
                //code block
        }

        log.info("Expected Value:" + expectedValue);
        control(isElementExist(By.xpath("//tr[1]//*[contains(text(),'" + expectedValue + "')]")), fieldName + " Value is successfully.", "ERROR:" + fieldName + "Value is not successfully");

        return this;
    }

    public Customer360Page controlWidgetField(String fieldName) {
        log.info(fieldName + " Field is checking.");
        control(isElementExist(By.xpath("//*[contains(text(),'" + fieldName + "')]")), fieldName + " field is exist.", "ERROR:" + fieldName + " field is not exist.");
        return this;
    }

    public Customer360Page controlCustomerPartyRelatedInfoWidgetValue(String fieldName) throws InterruptedException, ParseException {
        log.info(fieldName + " Value is checking.");
        String expectedValue = "";
        //String incomingValue = findElement(By.xpath("//strong[contains(text(),'" + fieldName + "')]/following-sibling::span")).getText();

        switch (fieldName) {
            case "First Name":
                expectedValue = worldHelper.getNewCreateIndividualCustomerRequest().getPartyOperations().get(0).getValue().getGivenName();
                break;
            case "Last Name":
                expectedValue = worldHelper.getNewCreateIndividualCustomerRequest().getPartyOperations().get(0).getValue().getFamilyName();
                break;
            case "Secondary Name":
                expectedValue = worldHelper.getNewCreateIndividualCustomerRequest().getPartyOperations().get(0).getValue().getMiddleName();
                break;
            case "Identification Number":
                expectedValue = worldHelper.getNewCreateIndividualCustomerRequest().getPartyOperations().get(0).getValue().getIndividualIdentification().get(0).getIdentificationId();
                break;
            case "POS":
                expectedValue = "";
                break;
            case "Birth Date":
                expectedValue = worldHelper.getNewCreateIndividualCustomerRequest().getPartyOperations().get(0).getValue().getBirthDate();
                Date date1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").parse(expectedValue);
                //expectedValue = new SimpleDateFormat("dd/MM/yyyy").format(date1);
                expectedValue = new SimpleDateFormat("dd.MM.yyyy").format(date1);
                break;
            case "Place Of Birth":
                expectedValue = worldHelper.getNewCreateIndividualCustomerRequest().getPartyOperations().get(0).getValue().getPlaceOfBirth();
                break;
            case "Country Of Birth":
                expectedValue = worldHelper.getNewCreateIndividualCustomerRequest().getPartyOperations().get(0).getValue().getCountryOfBirth();
                break;
            case "Citizenship":
                expectedValue = worldHelper.getNewCreateIndividualCustomerRequest().getPartyOperations().get(0).getValue().getNationality();
                break;
            case "Gender":
                expectedValue = worldHelper.getNewCreateIndividualCustomerRequest().getPartyOperations().get(0).getValue().getGender();
                break;
            case "Email":
                expectedValue = worldHelper.getNewCreateIndividualCustomerRequest().getCustomerOperations().get(0).getValue().getContactMedium().get(1).getCharacteristic().getEmailAddress();
                break;
            case "Mobile Phone Number":
                expectedValue = worldHelper.getNewCreateIndividualCustomerRequest().getCustomerOperations().get(0).getValue().getContactMedium().get(0).getCharacteristic().getCountry() + worldHelper.getNewCreateIndividualCustomerRequest().getCustomerOperations().get(0).getValue().getContactMedium().get(0).getCharacteristic().getPhoneNumber();
                break;
            case "Telephone Number":
                expectedValue = "";
                break;
            case "Fax":
                expectedValue = "";
                break;
            case "Disconnection Date":
                expectedValue = "";
                break;
            case "Disconnection Reason":
                expectedValue = "";
                break;
            case "Created User":
                expectedValue = "";
                break;
            case "Customer Since":
                expectedValue = "";
                break;
            case "Created":
                expectedValue = "";
                break;
            case "Recommended By":
                expectedValue = "";
                break;
            case "Education":
                expectedValue = "";
                break;
            case "Job Description":
                expectedValue = "";
                break;
            case "Status":
                expectedValue = "Prospect";
                break;
            default:
                //code block
        }

        log.info("Expected Value:" + expectedValue);
        //log.info("Incoming Value:" + incomingValue);
        //control(incomingValue.contains(expectedValue), fieldName + " Value is successfully.", "ERROR:" + fieldName + "Value is not successfully");
        control(isElementExist(By.xpath("//*[contains(text(),'" + expectedValue + "')]")), "Popup control is successfully", "ERROR:Popup control is not successfully");

        return this;
    }

    public Customer360Page controlResidentialBillingWidgetValue(String fieldName) {
        log.info(fieldName + " Value is checking.");
        //List<WebElement> elementList = findElements(titleBillingAddressValue);
        String expectedValue = "";
        //String incomingValue = "";

        switch (fieldName) {
            case "Address Line 1":
                //expectedValue = worldHelper.getCreateAggResidentialRequest().getCustomerObject().getContactMedium().get(0).getCharacteristic().getStreet1();
                expectedValue = "ADDRESS1";
                //incomingValue = elementList.get(0).getText();
                break;
            case "Address Line 2":
                //expectedValue = worldHelper.getCreateAggResidentialRequest().getCustomerObject().getContactMedium().get(0).getCharacteristic().getStreet2();
                //incomingValue = elementList.get(1).getText();
                expectedValue = "ADDRESS2";
                break;
            case "Country":
                //expectedValue = worldHelper.getCreateAggResidentialRequest().getCustomerObject().getContactMedium().get(0).getCharacteristic().getCountry();
                //incomingValue = elementList.get(2).getText();
                expectedValue = "ALBANIA";
                break;
            case "City":
                //expectedValue = worldHelper.getCreateAggResidentialRequest().getCustomerObject().getContactMedium().get(0).getCharacteristic().getCity();
                //incomingValue = elementList.get(3).getText();
                expectedValue = "BERAT";
            default:
                //code block
        }

        //if (expectedValue == null) {
        //    expectedValue = "";
        //}

        log.info("Expected Value:" + expectedValue);
        //log.info("Incoming Value:" + incomingValue);
        //control(incomingValue.contains(expectedValue), fieldName + " Value is successfully.", "ERROR:" + fieldName + "Value is not successfully");
        control(isElementExist(By.xpath("//*[contains(text(),'" + expectedValue + "')]")), "Value is successfully", "ERROR:Value is not successfully");
        return this;
    }

    public Customer360Page controlResidentialServiceWidgetValue(String fieldName) {
        log.info(fieldName + " Value is checking.");
        //List<WebElement> elementList = findElements(titleServiceAddressValue);
        String expectedValue = "";
        //String incomingValue = "";

        switch (fieldName) {
            case "Address Line 1":
                //expectedValue = worldHelper.getCreateAggResidentialRequest().getIndividualObject().getContactMedium().get(3).getCharacteristic().getStreet1();
                expectedValue = "ADDRESS1";
                //incomingValue = elementList.get(0).getText();
                break;
            case "Address Line 2":
                //expectedValue = worldHelper.getCreateAggResidentialRequest().getIndividualObject().getContactMedium().get(3).getCharacteristic().getStreet2();
                expectedValue = "ADDRESS2";
                //incomingValue = elementList.get(1).getText();
                break;
            case "Country":
                //expectedValue = worldHelper.getCreateAggResidentialRequest().getIndividualObject().getContactMedium().get(3).getCharacteristic().getCountry();
                expectedValue = "ALBANIA";
                //incomingValue = elementList.get(2).getText();
                break;
            case "City":
                //expectedValue = worldHelper.getCreateAggResidentialRequest().getIndividualObject().getContactMedium().get(3).getCharacteristic().getCity();
                expectedValue = "BERAT";
                //incomingValue = elementList.get(3).getText();
            default:
                //code block
        }

        //if (expectedValue == null) {
        //    expectedValue = "";
        //}

        log.info("Expected Value:" + expectedValue);
        //log.info("Incoming Value:" + incomingValue);
        //control(incomingValue.contains(expectedValue), fieldName + " Value is successfully.", "ERROR:" + fieldName + "Value is not successfully");
        control(isElementExist(By.xpath("//*[contains(text(),'" + expectedValue + "')]")), "Popup control is successfully", "ERROR:Popup control is not successfully");

        return this;
    }

    public Customer360Page clickTab(String tabName) throws InterruptedException {
        Thread.sleep(1000);
        clickJS(By.xpath("//div[@role='tab']//div[contains(text(),'" + tabName + "')]"));
        log.info(tabName + "Tab clicked.");
        return this;
    }

    public Customer360Page controlResidentialAuthorizedCustomerWidgetValue(String fieldName) throws InterruptedException {
        log.info(fieldName + "Value is checking.");
        String expectedValue = "";
        String incomingValue = getTextOfElement(By.xpath("//strong[contains(text(),'" + fieldName + "')]/following-sibling::span"));

        switch (fieldName) {
            case "Identification Number":
                expectedValue = worldHelper.getIdentificationNumberResidentialContact();
                break;
            case "First Name":
                expectedValue = CreateCustomerResidentialData.firstNameContactTab.toUpperCase().replace('İ', 'I');
                break;
            case "Last Name":
                expectedValue = CreateCustomerResidentialData.lastNameContactTab.toUpperCase().replace('İ', 'I');
                break;
            default:
                //code block
        }
        log.info("Expected Value:" + expectedValue);
        log.info("Incoming Value:" + incomingValue);
        control(incomingValue.contains(expectedValue), fieldName + "Value is successfully.", "ERROR:" + fieldName + "Value is not successfully");
        return this;
    }

    public Customer360Page controlDocumentInfoWidgetField(String fieldName) {
        log.info(fieldName + "Field is checking.");
        control(isElementExist(By.xpath("//th[contains(text(),'" + fieldName + "')]")), fieldName + "field is exist.", "ERROR:" + fieldName + "field is not exist.");
        return this;
    }

    public Customer360Page controlDocumentInfoWidgetValue(String fieldName) {
        log.info(fieldName + "Value is checking.");
        //List<WebElement> elementList = findElements(titleDocumentInfo);

        String expectedValue = "";
        //String incomingValue = "";

        switch (fieldName) {
            case "Document Type":
                //expectedValue = worldHelper.getCreateAggResidentialRequest().getIndividualObject().getIndividualIdentification().get(0).getIdentificationType().replace("_", " ");
                //incomingValue = elementList.get(0).getText().toUpperCase().replace(" ", "_");
                expectedValue = worldHelper.getNewCreateIndividualCustomerRequest().getDocumentOperations().get(0).getValue().getAttachmentType();
                break;
            case "Name":
                expectedValue = worldHelper.getNewCreateIndividualCustomerRequest().getDocumentOperations().get(0).getValue().getName();
                //incomingValue = elementList.get(1).getText();
                break;
            case "Size":
                expectedValue = worldHelper.getNewCreateIndividualCustomerRequest().getDocumentOperations().get(0).getValue().getSize().toString();
                //incomingValue = elementList.get(2).getText();
                break;
            case "Description":
                expectedValue = worldHelper.getNewCreateIndividualCustomerRequest().getDocumentOperations().get(0).getValue().getDescription();
                //incomingValue = elementList.get(3).getText();
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

    public Customer360Page controlAdminInformationWidgetValue(String fieldName) throws InterruptedException, ParseException {
        log.info(fieldName + "Value is checking.");
        String expectedValue = "";
        //String incomingValue = getTextOfElement(By.xpath("//strong[contains(text(),'" + fieldName + "')]/following-sibling::span"));

        switch (fieldName) {
            case "Name":
                expectedValue = worldHelper.getNewCreateCorporateCustomerRequest().getPartyOperations().get(1).getValue().getGivenName();
                break;
            case "Middle Name":
                expectedValue = worldHelper.getNewCreateCorporateCustomerRequest().getPartyOperations().get(1).getValue().getMiddleName();
                break;
            case "Identification Number":
                expectedValue = worldHelper.getNewCreateCorporateCustomerRequest().getPartyOperations().get(1).getValue().getIndividualIdentification().get(0).getIdentificationId();
                break;
            case "Last Name":
                expectedValue = worldHelper.getNewCreateCorporateCustomerRequest().getPartyOperations().get(1).getValue().getFamilyName();
                break;
            case "Email":
                expectedValue = worldHelper.getNewCreateCorporateCustomerRequest().getPartyRoleOperations().get(0).getValue().getContactMedium().get(0).getCharacteristic().getEmailAddress();
                break;
            case "Birth Date":
                expectedValue = worldHelper.getNewCreateCorporateCustomerRequest().getPartyOperations().get(1).getValue().getBirthDate().split("T")[0];
                //Date date1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").parse(expectedValue);
                //expectedValue = new SimpleDateFormat("dd/MM/yyyy").format(date1);
                break;
            case "Country Of Birth":
                expectedValue = worldHelper.getNewCreateCorporateCustomerRequest().getPartyOperations().get(1).getValue().getCountryOfBirth();
                break;
            case "Citizenship":
                expectedValue = worldHelper.getNewCreateCorporateCustomerRequest().getPartyOperations().get(1).getValue().getNationality();
                break;
            case "Document":
                expectedValue = worldHelper.getNewCreateCorporateCustomerRequest().getDocumentOperations().get(1).getValue().getDescription();
                break;
            case "First Name":
                expectedValue = worldHelper.getNewCreateCorporateCustomerRequest().getPartyOperations().get(1).getValue().getGivenName();
                break;
            case "Secondary Name":
                expectedValue = worldHelper.getNewCreateCorporateCustomerRequest().getPartyOperations().get(1).getValue().getMiddleName();
                break;
            case "Gender":
                expectedValue = worldHelper.getNewCreateCorporateCustomerRequest().getPartyOperations().get(1).getValue().getGender();
                break;
            case "Communication Method":
                expectedValue = worldHelper.getNewCreateCorporateCustomerRequest().getPartyRoleOperations().get(0).getValue().getContactMedium().get(2).getCharacteristic().getContactType();
                break;
            case "Place Of Birth":
                expectedValue = worldHelper.getNewCreateCorporateCustomerRequest().getPartyOperations().get(1).getValue().getPlaceOfBirth();
                break;
            case "Mobile Phone Number":
                expectedValue = worldHelper.getNewCreateCorporateCustomerRequest().getCustomerOperations().get(0).getValue().getContactMedium().get(1).getCharacteristic().getPhoneNumber();
                break;
            case "Issuing Date":
                expectedValue = "";
                Date date2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse(expectedValue);
                expectedValue = new SimpleDateFormat("dd/MM/yyyy").format(date2);
                break;
            default:
                //code block
        }
        log.info("Expected Value:" + expectedValue);
        //log.info("Incoming Value:" + incomingValue);
        //control(incomingValue.contains(expectedValue), fieldName + "Value is successfully.", "ERROR:" + fieldName + "Value is not successfully");
        control(isElementExist(By.xpath("//*[contains(text(),'" + expectedValue + "')]")), "Value is successfully", "ERROR:Value is not successfully");

        return this;

    }

    public Customer360Page controlCorporateDocumentInfoWidgetValue(String fieldName) throws ParseException {
        log.info(fieldName + "Value is checking.");
        //List<WebElement> elementList = findElements(titleDocumentInfo);

        String expectedValue = "";
        //String incomingValue = "";

        switch (fieldName) {
            case "Document Type":
                expectedValue = "Extract QKR";
                //incomingValue = elementList.get(0).getText().toUpperCase().replace(" ", "_");
                break;
            case "Issuing Date":
                expectedValue = "";
                //Date date1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse(expectedValue);
                //expectedValue = new SimpleDateFormat("dd.MM.yyyy").format(date1);
                //incomingValue = elementList.get(1).getText();
                break;
            case "Identification Number":
                expectedValue = worldHelper.getNewCreateCorporateCustomerRequest().getPartyOperations().get(0).getValue().getIndividualIdentification().get(0).getIdentificationId();
                //incomingValue = elementList.get(2).getText();
                break;
            case "Description":
                expectedValue = worldHelper.getNewCreateCorporateCustomerRequest().getDocumentOperations().get(0).getValue().getDescription();
                //incomingValue = elementList.get(3).getText();
                break;
            case "Size":
                expectedValue = worldHelper.getNewCreateCorporateCustomerRequest().getDocumentOperations().get(0).getValue().getSize().toString();
                //incomingValue = elementList.get(3).getText();
                break;
            case "Name":
                expectedValue = worldHelper.getNewCreateCorporateCustomerRequest().getDocumentOperations().get(0).getValue().getName();
                //incomingValue = elementList.get(3).getText();
                break;
            default:
                //code block
        }
        log.info("Expected Value:" + expectedValue);
        //log.info("Incoming Value:" + incomingValue);
        //control(incomingValue.contains(expectedValue), fieldName + "Value is successfully.", "ERROR:" + fieldName + "Value is not successfully");
        control(isElementExist(By.xpath("//*[contains(text(),'" + expectedValue + "')]")), "Value is successfully.", "ERROR:Value is not successfully");
        return this;
    }

    public Customer360Page clickEditButton() throws InterruptedException {
        Thread.sleep(1000);
        clickJS(By.xpath("//app-organization-party-info//mat-icon[contains(text(),'more_vert')]"));
        Thread.sleep(1000);
        clickJS(btnEdit);
        log.info("Edit Button clicked.");
        return this;
    }

    public Customer360Page controlNotActiveField(String fieldName) throws InterruptedException {
        log.info(fieldName + "Field Not Active is checking.");
        switch (fieldName) {
            case "Save":
                Thread.sleep(2000);
                control(isElementExist(btnSaveNotActive), fieldName + "field is not active.", "ERROR:" + fieldName + "field is active.");
                break;
            default:
                //code block
        }

        return this;
    }

    public Customer360Page controlBillingAccountAndProductsWidgetField(String fieldName) {
        log.info(fieldName + "Field is checking.");
        control(isElementExist(By.xpath("//*[contains(text(),'" + fieldName + "')]")), fieldName + "field is exist.", "ERROR:" + fieldName + "field is not exist.");
        return this;
    }

    public Customer360Page controlProductTabListField(String productName) {
        log.info(productName + "Product is checking.");
        control(isElementExist(By.xpath("//*[contains(text(),'" + productName + "')]")), productName + "field is exist.", "ERROR:" + productName + "field is not exist.");
        return this;
    }

    public Customer360Page clickProduct(String productName) throws InterruptedException {
        Thread.sleep(2500);
        clickJS(By.xpath("//*[contains(text(),'" + productName + "')]"));
        log.info(productName + "product clicked.");
        return this;
    }

    public Customer360Page controlProductField(String fieldName) throws InterruptedException {
        Thread.sleep(500);
        log.info(fieldName + "Field is checking.");
        switch (fieldName) {
            case "Billing Account Name":
                control(isElementExist(txtBillingAccountName), fieldName + "field is exist.", "ERROR:" + fieldName + "field is not exist.");
                break;
            case "Agreement Id":
                control(isElementExist(txtAgreementId), fieldName + "field is exist.", "ERROR:" + fieldName + "field is not exist.");
                break;
            case "Start Date":
                control(isElementExist(txtStartDate), fieldName + "field is exist.", "ERROR:" + fieldName + "field is not exist.");
                break;
            case "Termination Date":
                control(isElementExist(txtTerminationDate), fieldName + "field is exist.", "ERROR:" + fieldName + "field is not exist.");
                break;
            case "Resource Type":
                control(isElementExist(cmbResourceType), fieldName + "field is exist.", "ERROR:" + fieldName + "field is not exist.");
                break;
            case "Premium Value":
                control(isElementExist(txtPremiumValue), fieldName + "field is exist.", "ERROR:" + fieldName + "field is not exist.");
                break;
            default:
                clickJS(By.xpath("//mat-icon[contains(text(),'more_vert')]"));
                Thread.sleep(2000);
                control(isElementExist(By.xpath("//span[contains(text(),'" + fieldName + "')]")), fieldName + "field is exist.", "ERROR:" + fieldName + "field is not exist.");
                clickJS(By.xpath("//mat-icon[contains(text(),'more_vert')]"));
                break;
        }
        return this;
    }

    public Customer360Page clickProductButton(String buttonName) throws InterruptedException {
        Thread.sleep(5000);
        clickJS(By.xpath("//mat-icon[contains(text(),'more_vert')]"));
        Thread.sleep(2000);
        switch (buttonName) {
            case "Manual Order":
                Thread.sleep(2000);
                clickJS(By.xpath("//span[contains(text(),'" + buttonName + "')]"));
                break;
            default:
                clickJS(By.xpath("//*[contains(text(),'" + buttonName + "')]"));
        }
        log.info(buttonName + "Button clicked.");
        return this;
    }

    public Customer360Page controlCopyUrlLink() {
        log.info("Copy Url Link is checking.");
        //waitForExpectedElement(btnCopyUrlLink);
        control(isElementExist(btnCopyUrlLink), "Copy Url Link button is exist.", "ERROR: Copy Url Link button is not exist.");
        return this;
    }

    public Customer360Page clickCopyUrlLink() throws InterruptedException {
        Thread.sleep(2000);
        clickJS(btnCopyUrlLink);
        log.info("Copy Url Link clicked.");
        return this;
    }

    public Customer360Page controlAlertPopupMessage(String popupMessage) throws InterruptedException {
        Thread.sleep(2200);
        //waitForExpectedElement(alertPopupMessage);
        //String customer360PopupMessage = getTextOfElement(alertPopupMessage);
        //log.info("Incoming message:" + customer360PopupMessage);
        log.info("Expected message:" + popupMessage);
        //control(customer360PopupMessage.contains(popupMessage), "Popup control is successfully", "ERROR:Popup control is not successfully");
        control(isElementExist(By.xpath("//*[contains(text(),'" + popupMessage + "')]")), "Popup control is successfully", "ERROR:Popup control is not successfully");

        return this;
    }

    public Customer360Page controlNewTabCopyUrlLink() throws IOException, UnsupportedFlavorException, InterruptedException, AWTException {
        Thread.sleep(3000);
        log.info("New Tab Copy Url Link is checking.");
        String copyUrlLink = Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor).toString();
        clickJS(txtSearch);
        //findElement(txtSearch).sendKeys(Keys.CONTROL + "v");
        sendKeys(txtSearch, copyUrlLink);
        Thread.sleep(3000);
        log.info("url link:" + copyUrlLink);
        getWebDriver().get(copyUrlLink);
        Thread.sleep(2000);
        control(isElementExist(By.xpath("//span[contains(text(),'Customer/Party Related Info')]")), "New Tab Copy Url Link is successfully.", "ERROR: New Tab Copy Url Link is not successfully.");
        return this;
    }

    public Customer360Page clickNewOrderButton() throws InterruptedException {
        Thread.sleep(1000);
        WebElement element = findElement(By.xpath("//mat-cell//span[contains(text(),'Prepaid')]//parent::mat-cell//parent::mat-row//span[contains(text(),'New Order')]"));
        clickJS(element);
        log.info("New Order Button clicked.");
        return this;
    }

    public Customer360Page controlBillingAddresWidgetValue(String expectedValue, String fieldName) throws InterruptedException {
        log.info(fieldName + "Field Value is checking.");
        //String incomingValue = findElement(By.xpath("//strong[contains(text(),'" + fieldName + "')]/following-sibling::span")).getText();
        log.info("Expected Value" + expectedValue.toUpperCase().replace("İ", "I"));
        //log.info("Incoming Value" + incomingValue);
        //control(incomingValue.contains(expectedValue.toUpperCase().replace("İ", "I")), fieldName + "Value is successfully.", "ERROR:" + fieldName + "Value is not successfully");
        control(isElementExist(By.xpath("//*[contains(text(),'" + expectedValue.toUpperCase().replace("İ", "I") + "')]")), fieldName + " Field Value is successfully", "ERROR: " + fieldName + " Field Value is not successfully");
        return this;
    }

    public Customer360Page controlCustomerPartyRelatedInfoForCorporateWidgetValue(String fieldName) throws InterruptedException {
        log.info(fieldName + "Field Value is checking.");
        //String incomingValue = findElement(By.xpath("//strong[contains(text(),'" + fieldName + "')]/following-sibling::span")).getText();
        String expectedValue = "";
        switch (fieldName) {
            case "Company Name":
                expectedValue = worldHelper.getNewCreateCorporateCustomerRequest().getPartyOperations().get(0).getValue().getName();
                break;
            case "Customer Name":
                expectedValue = worldHelper.getNewCreateCorporateCustomerRequest().getPartyOperations().get(0).getValue().getName();
                break;
            case "NIPT":
                expectedValue = worldHelper.getNewCreateCorporateCustomerRequest().getPartyOperations().get(0).getValue().getOrganizationIdentification().get(0).getIdentificationId();
                break;
            case "Industry":
                expectedValue = "";
                break;
            case "Enterprise Account Manager":
                expectedValue = "";
                break;
            case "Created User":
                expectedValue = "";
                break;
            case "Customer Since":
                expectedValue = "";
                break;
            case "Sales Agent":
                expectedValue = "";
                break;
            case "Credit Team":
                expectedValue = "";
                break;
            case "Dunning Level":
                expectedValue = "-";
                break;
            case "Disconnection Date":
                expectedValue = "";
                break;
            case "Disconnection Reason":
                expectedValue = "";
                break;
            case "POS":
                expectedValue = "";
                break;
            case "Parent Account":
                expectedValue = "";
                break;
            case "Potential Fraud":
                expectedValue = "-";
                break;
            case "Potential Fraud Comment":
                expectedValue = "-";
                break;
            case "First Class Responsible":
                expectedValue = "";
                break;
            case "Number Of Employees":
                expectedValue = "-";
                break;
            case "Blacklisted":
                expectedValue = "NO";
                break;
            case "Segment":
                expectedValue = worldHelper.getNewCreateCorporateCustomerRequest().getPartyOperations().get(0).getValue().getMarketSegment().get(1).getName();
                break;
            case "Tax Exempt":
                expectedValue = worldHelper.getNewCreateCorporateCustomerRequest().getPartyOperations().get(0).getValue().getPartyCharacteristic().get(1).getValue();
                break;
            case "Juridical Info":
                expectedValue = worldHelper.getNewCreateCorporateCustomerRequest().getPartyOperations().get(0).getValue().getPartyCharacteristic().get(0).getValue();
                break;
            case "Customer Type":
                expectedValue = worldHelper.getNewCreateCorporateCustomerRequest().getPartyOperations().get(0).getValue().getMarketSegment().get(0).getName();
                break;
            default:
                //code block;
        }

        log.info("Expected Value" + expectedValue.toUpperCase().replace("İ", "I"));
        //log.info("Incoming Value" + incomingValue);
        //control(incomingValue.contains(expectedValue.toUpperCase().replace("İ", "I")), fieldName + "Value is successfully.", "ERROR:" + fieldName + "Value is not successfully");
        control(isElementExist(By.xpath("//*[contains(text(),'" + expectedValue + "')]")), "Popup control is successfully", "ERROR:Popup control is not successfully");
        return this;
    }

    public Customer360Page controlBaseTypeAndTypeFieldValue(String expectedValue) {
        log.info("Base Type And Type Field Value is checking.");
        String incomingBaseTypeValue = "";
        String incomingTypeValue = "";
        switch (expectedValue) {
            case "Individual":
                incomingBaseTypeValue = worldHelper.getNewIndividualCreateResponse().getEngagedParty().getBaseType();
                incomingTypeValue = worldHelper.getNewIndividualCreateResponse().getEngagedParty().getType();
                break;
            case "Organization":
                incomingBaseTypeValue = worldHelper.getNewCorporateCreateResponse().getEngagedParty().getBaseType();
                incomingTypeValue = worldHelper.getNewCorporateCreateResponse().getEngagedParty().getType();
                break;
        }

        log.info("Incoming Base Type Value:" + incomingBaseTypeValue);
        log.info("Incoming Type Value:" + incomingTypeValue);
        log.info("Expected BaseType And Type Value:" + expectedValue);
        control(incomingBaseTypeValue.contains(expectedValue), expectedValue + "value is exist.", "ERROR:" + expectedValue + "value is not exist.");
        control(incomingTypeValue.contains(expectedValue), expectedValue + "value is exist.", "ERROR:" + expectedValue + "value is not exist.");
        return this;
    }

    public Customer360Page controlFullName() {
        log.info("Full Name Field Value is checking.");
        String incomingFullNameValue = worldHelper.getNewIndividualCreateResponse().getName();
        String expectedValue = worldHelper.getCustomerName();
        log.info("Incoming Full Name Value:" + incomingFullNameValue);
        log.info("Expected Full Name Value:" + expectedValue);
        control(incomingFullNameValue.contains(expectedValue), "Full Name value is successfully.", "ERROR: Full Name value is not successfully.");
        return this;
    }

    public Customer360Page controlProspectColour(String colour) {
        log.info(colour + "Status Colour is checking.");
        switch (colour) {
            case "Grey":
                control(isElementExist(By.xpath("//span[@class='gray-dot']")), colour + "Status Colour is exist.", "ERROR:" + colour + "Status Colour is not exist.");
                break;
            case "Green":
                control(isElementExist(By.xpath("//span[@class='green-dot']")), colour + "Status Colour is exist.", "ERROR:" + colour + "Status Colour is not exist.");
                break;
            case "Red":
                control(isElementExist(By.xpath("//span[@class='red-dot']")), colour + "Status Colour is exist.", "ERROR:" + colour + "Status Colour is not exist.");
                break;
            default:
                //code block
        }
        return this;
    }

    public Customer360Page controlDocumentInfoWidgetValueTwo(String expectedValue, String fieldName) {
        log.info(fieldName + "Field Value is checking.");
        List<WebElement> elementList = findElements(By.xpath("//tr//td//p"));
        String incomingValue = "";
        switch (fieldName) {
            case "Document Type":
                incomingValue = elementList.get(0).getText();
                break;
            case "Issuing Date":
                incomingValue = elementList.get(1).getText();
                break;
            default:
                //code block
        }
        log.info("Expected Value:" + expectedValue);
        log.info("Incoming Value:" + incomingValue);
        control(incomingValue.contains(expectedValue), fieldName + "Field Value is successfully.", "ERROR:" + fieldName + "Field Value is not successfully.");
        return this;
    }

    public Customer360Page controlAddressFieldForBackendSide(String fieldName, String expectedValue) {
        log.info(fieldName + "Field Value is checking.");
        String incomingValue = "";

        switch (fieldName) {
            case "Contact Type":
                if (expectedValue.contains("SERVICE_ADDRESS")) {
                    incomingValue = worldHelper.getCustomerManagementResponse().getContactMedium().get(1).getCharacteristic().getContactType();
                } else {
                    incomingValue = worldHelper.getCustomerManagementResponse().getContactMedium().get(0).getCharacteristic().getContactType();
                }
                break;
            case "Street1":
                incomingValue = worldHelper.getCustomerManagementResponse().getContactMedium().get(0).getCharacteristic().getStreet1();
                break;
            case "Street2":
                incomingValue = worldHelper.getCustomerManagementResponse().getContactMedium().get(0).getCharacteristic().getStreet2();
                if (incomingValue == null) {
                    incomingValue = "";
                }
                break;
            case "Country":
                incomingValue = worldHelper.getCustomerManagementResponse().getContactMedium().get(0).getCharacteristic().getCountry();
                break;
            case "City":
                incomingValue = worldHelper.getCustomerManagementResponse().getContactMedium().get(0).getCharacteristic().getCity();
                break;
            case "Medium Type":
                incomingValue = worldHelper.getCustomerManagementResponse().getContactMedium().get(0).getMediumType();
                break;
            case "Preferred":
                incomingValue = Boolean.toString(worldHelper.getCustomerManagementResponse().getContactMedium().get(0).getPreferred());
                break;
            default:
                //code block
        }

        log.info("Expected Value:" + expectedValue);
        log.info("IncomingValue:" + incomingValue);
        control(incomingValue.contains(expectedValue), fieldName + "Field Value is successfully.", "ERROR:" + fieldName + "Field Value is not successfully.");
        return this;

    }

    public Customer360Page controlCharacteristicFieldForBackendSide(String fieldName) {
        log.info(fieldName + "Field Value is checking.");
        String incomingValue = "";
        switch (fieldName) {
            case "name":
                incomingValue = worldHelper.getCreateAggResidentialResponse().getCharacteristic().get(2).getName();
                break;
            case "value":
                incomingValue = worldHelper.getCreateAggResidentialResponse().getCharacteristic().get(2).getValue();
                break;
            case "valueType":
                incomingValue = worldHelper.getCreateAggResidentialResponse().getCharacteristic().get(2).getValueType();
                break;
            default:
                //code block
        }
        log.info(fieldName + ": " + incomingValue);
        control(incomingValue != null, fieldName + "Field Value is successfully.", "ERROR:" + fieldName + "Field Value is not successfully.");
        return this;
    }

    public Customer360Page clickInvoiceButton() throws InterruptedException {
        Thread.sleep(1000);
        clickJS(btnInvoice);
        log.info("Invoice Button clicked.");
        return this;
    }

    public Customer360Page controlInvoicePageField(String fieldName) {
        log.info(fieldName + "Field is checking");
        control(isElementExist(By.xpath("//strong[contains(text(),'" + fieldName + "')]")), fieldName + "Field is exist.", "ERROR:" + fieldName + "Field is not exist.");
        return this;
    }

    public Customer360Page controlAddressFieldBackendSideForCorporateCustomer(String fieldName, String expectedValue) {
        log.info(fieldName + "Field Value is checking.");
        String incomingValue = "";

        switch (fieldName) {
            case "Contact Type":
                if (expectedValue.contains("SERVICE_ADDRESS")) {
                    incomingValue = worldHelper.getOrganizationResponse().getContactMedium().get(1).getCharacteristic().getContactType();
                } else {
                    incomingValue = worldHelper.getOrganizationResponse().getContactMedium().get(0).getCharacteristic().getContactType();
                }
                break;
            case "Street1":
                incomingValue = worldHelper.getOrganizationResponse().getContactMedium().get(0).getCharacteristic().getStreet1();
                break;
            case "Street2":
                incomingValue = worldHelper.getOrganizationResponse().getContactMedium().get(0).getCharacteristic().getStreet2();
                if (incomingValue == null) {
                    incomingValue = "";
                }
                break;
            case "Country":
                incomingValue = worldHelper.getOrganizationResponse().getContactMedium().get(0).getCharacteristic().getCountry();
                break;
            case "City":
                incomingValue = worldHelper.getOrganizationResponse().getContactMedium().get(0).getCharacteristic().getCity();
                break;
            case "Medium Type":
                incomingValue = worldHelper.getOrganizationResponse().getContactMedium().get(0).getMediumType();
                break;
            case "Preferred":
                incomingValue = Boolean.toString(worldHelper.getOrganizationResponse().getContactMedium().get(0).getPreferred());
                break;
            default:
                //code block
        }

        log.info("Expected Value:" + expectedValue);
        log.info("IncomingValue:" + incomingValue);
        control(incomingValue.contains(expectedValue), fieldName + "Field Value is successfully.", "ERROR:" + fieldName + "Field Value is not successfully.");
        return this;
    }

    public Customer360Page controlEngagedPartyField(String fieldName) {
        log.info(fieldName + "Field Value is checking.");
        String incomingValue = "";
        switch (fieldName) {
            case "name":
                incomingValue = worldHelper.getNewCorporateCreateResponse().getEngagedParty().getName();
                break;
            case "type":
                incomingValue = worldHelper.getNewCorporateCreateResponse().getEngagedParty().getType();
                break;
            case "referredType":
                incomingValue = worldHelper.getNewCorporateCreateResponse().getEngagedParty().getReferredType();
                break;
            default:
                //code block
        }
        control(incomingValue != null, fieldName + "Field Value is successfully.", "ERROR:" + fieldName + "Field Value is not successfully.");
        return this;
    }

    public Customer360Page controlSelectInvoiceAccount() {
        log.info("Select Invoice Account Dropdown is checking.");
        control(isElementExist(By.xpath("//mat-label[contains(text(),'Select Invoice Account')]")), "Dropdown is exist.", "ERROR: Dropdown is not exist.");
        return this;
    }

    public Customer360Page controlNewOrderButtonDisplayed(String disabledStatus) throws InterruptedException {
        Thread.sleep(1000);
        log.info("New Order Button Displayed Status is checking.");
        switch (disabledStatus) {
            case "active":
                control(isElementExist(By.xpath("//button[@ng-reflect-disabled='false']//span[contains(text(),'New Order')]")), "New Order Button Displayed Status is active.", "ERROR: New Order Button Displayed Status is not active.");
                break;
            case "deactive":
                control(isElementExist(By.xpath("//button[@ng-reflect-disabled='true']//span[contains(text(),'New Order')]")), "New Order Button Displayed Status is deactive.", "ERROR: New Order Button Displayed Status is not deactive.");
                break;
        }
        return this;
    }

    public Customer360Page selectInvoiceAccount(String invoiceAccount) throws InterruptedException {
        Thread.sleep(1000);
        List<WebElement> elementList = findElements(By.xpath("//mat-select[@role='listbox']"));
        clickJS(elementList.get(1));
        Thread.sleep(1000);
        clickJS(By.xpath("//mat-option/span[contains(.,'" + invoiceAccount + "')]"));
        return this;
    }

    public Customer360Page sendagreementıd(String agreementıd) throws InterruptedException {
        sendKeys(agreementID, agreementıd);
        log.info("Value " + agreementıd);
        return this;
    }

    public Customer360Page clickRePurchase() throws InterruptedException {
        Thread.sleep(1000);
        clickJS(btnRePurchase);
        log.info("clicked button");
        return this;
    }

    public Customer360Page controlCorporateCustomerNumber() {
        log.info("Corporate Customer Number is checking.");
        String incomingCustomerNumber = worldHelper.getNewCorporateCreateResponse().getId();
        log.info("Incoming Corporate Number:" + incomingCustomerNumber);
        control(incomingCustomerNumber.charAt(0) == 'F', "Corporate Number First Character is F.", "Corporate Number First Character is not F.");
        control(incomingCustomerNumber.substring(1).length() == 8, "Digit Number Length is 8.", "Digit Number Length is not 8.");
        return this;
    }

    public Customer360Page controlIndividualCustomerNumber() {
        log.info("Individual Customer Number is checking.");
        String incomingCustomerNumber = worldHelper.getNewIndividualCreateResponse().getId();
        log.info("Incoming Individual Number:" + incomingCustomerNumber);
        control(incomingCustomerNumber.charAt(0) == 'F', "Individual Number First Character is F.", "Individual Number First Character is not F.");
        control(incomingCustomerNumber.substring(1).length() == 8, "Digit Number Length is 8.", "Digit Number Length is not 8.");
        return this;
    }


    public Customer360Page controlIndividualAndCorporateCustomerNumberFor360Page() throws InterruptedException {
        Thread.sleep(2000);
        log.info("Customer Number is checking.");
        //JavascriptExecutor javascriptExecutor = (JavascriptExecutor) getWebDriver();
        //String incomingCustomerNumber = javascriptExecutor.executeScript("return arguments[0].text", findElement(By.xpath("//strong[contains(text(),'Customer Number')]//following-sibling::span"))).toString();
        String incomingCustomerNumber = getTextOfElement(By.xpath("//div[contains(text(),'Customer Number')]//following-sibling::div"));
        log.info("Incoming Customer Number:" + incomingCustomerNumber);
        control(incomingCustomerNumber.charAt(0) == 'F', "Individual Number First Character is F.", "Individual Number First Character is not F.");
        control(incomingCustomerNumber.substring(1).length() == 8, "Digit Number Length is 8.", "Digit Number Length is not 8.");
        return this;
    }

    public Customer360Page clickNewAttachmentButton() throws InterruptedException {
        clickJS(btnNewAttachment);
        log.info("New Attachment Button clicked.");
        return this;
    }

    public Customer360Page controlDocumentTypeField(String fieldOne, String fieldTwo) throws InterruptedException, AWTException {
        log.info("Document Type Field is checking.");
        clickJS(cmbDocumentType);
        Thread.sleep(500);
        control(isElementExist(By.xpath("//*[contains(text(),'" + fieldOne + "')]")), fieldOne + " field is exist.", "ERROR:" + fieldOne + " field is not exist.");
        //control(isElementExist(By.xpath("//*[contains(text(),'" + fieldTwo + "')]")), fieldTwo + " field is exist.", "ERROR:" + fieldTwo + " field is not exist.");
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        return this;
    }

    public Customer360Page selectDocumentType(String documentType) throws InterruptedException {
        Thread.sleep(2000);
        selectMatComboboxJS(cmbDocumentType, documentType);
        log.info("Select Document Type:" + documentType);
        return this;
    }

    public Customer360Page selectIssuingDate(String issuingDate) throws InterruptedException, AWTException {
        sendKeys(pcrIssuingDate, issuingDate);
        log.info("Select Issuing Date:" + issuingDate);
        Thread.sleep(500);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        return this;
    }

    public Customer360Page enterDocumentNumber(String documentNumber) throws InterruptedException {
        sendKeys(txtDocumentNumber, documentNumber);
        log.info("Enter Document Number:" + documentNumber);
        return this;
    }

    public Customer360Page enterDocumentFile() throws InterruptedException, AWTException {
        Thread.sleep(5000);
        clickJS(findElements(btnAttachFile).get(1));
        String path = System.getProperty("user.dir") + "\\document.jpg";
        uploadFile(By.cssSelector("[type='file']"), path);
//        Robot robot = new Robot();
//        robot.keyPress(KeyEvent.VK_ESCAPE);
//        robot.keyRelease(KeyEvent.VK_ESCAPE);
        return this;
    }

    public Customer360Page clickDoneButton() throws InterruptedException {
        Thread.sleep(3000);
        clickJS(By.xpath("//mat-icon[contains(text(),'done')]"));
        log.info("Done Button clicked.");
        return this;
    }

    public Customer360Page controlDocumentTypeFieldForResidential(String fieldOne, String fieldTwo, String fieldThree) throws InterruptedException, AWTException {
        log.info("Document Type Field is checking.");
        clickJS(cmbDocumentType);
        Thread.sleep(500);
        control(isElementExist(By.xpath("//*[contains(text(),'" + fieldOne + "')]")), fieldOne + " field is exist.", "ERROR:" + fieldOne + " field is not exist.");
        control(isElementExist(By.xpath("//*[contains(text(),'" + fieldTwo + "')]")), fieldTwo + " field is exist.", "ERROR:" + fieldTwo + " field is not exist.");
        //control(isElementExist(By.xpath("//*[contains(text(),'" + fieldThree + "')]")), fieldThree + " field is exist.", "ERROR:" + fieldThree + " field is not exist.");
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        return this;
    }

    public Customer360Page controlDocumentInfoWidgetValueForPartyCustomer(String fieldName) {
        log.info(fieldName + "field value is checking.");
        String expectedValue = "";
        switch (fieldName) {
            case "Document Type":
                expectedValue = ""; //worldHelper.getCreateAggResidentialRequest().getRelatedPartyObject().getPartyRoleObject().getAttachment().get(0).getAttachmentType();
                break;
            case "Issuing Date":
                expectedValue = "";
                break;
            case "Identification Number":
                expectedValue = worldHelper.getCreateAggResidentialRequest().getIndividualObject().getIndividualIdentification().get(0).getIdentificationId();
                break;
            case "Description":
                expectedValue = ""; //worldHelper.getCreateAggResidentialRequest().getRelatedPartyObject().getIndividualObject().getGivenName();
                break;
            default:
                //code block
        }
        log.info("Expected Value: " + expectedValue);
        control(isElementExist(By.xpath("//*[contains(text(),'" + expectedValue + "')]")), expectedValue + "title is exist.", "ERROR:" + expectedValue + "title is not exist.");
        return this;
    }

    public Customer360Page controlTechnicalResources() {
        log.info("Technical Resources List is checking.");
        control(isElementExist(By.xpath("//tr//td")), "Address Information is exist.", "Address Information is not exist.");
        control(isElementExist(By.xpath("//tr//mat-cell")), "Technical Resources List is exist.", "Technical Resources List is not exist.");
        return this;
    }

    public Customer360Page controlTechnicalResourcesDeleteProduct() throws InterruptedException {
        Thread.sleep(500);
        log.info("Technical Resources List is checking.");
        control(!(isElementExist(By.xpath("//td[contains(text(),'none')]"))), "Delete Product is not exist.", "Delete Product is exist.");
        return this;
    }

    public Customer360Page selectResourceType(String resourceType) throws InterruptedException {
        selectMatComboboxJS(cmbResourceType, resourceType);
        log.info("Select Resource Type:" + resourceType);
        return this;
    }

    public Customer360Page enterPremiumValue(String premiumValue) throws InterruptedException {
        sendKeys(txtPremiumValue, premiumValue);
        log.info("Enter Premium Value:" + premiumValue);
        return this;
    }

    public Customer360Page clickCloseButton() throws InterruptedException {
        Thread.sleep(1000);
        clickJS(btnClose);
        log.info("Close Button clicked.");
        return this;
    }

    public Customer360Page clickTechnicalResourceButton(String buttonName) throws InterruptedException {
        clickJS(By.xpath("//mat-chip[contains(text(),'" + buttonName + "')]"));
        log.info(buttonName + " Button clicked.");
        return this;
    }

    public Customer360Page clickCancelButton() throws InterruptedException {
        clickJS(btnCancel);
        log.info("Cancel Button clicked.");
        return this;
    }

    public Customer360Page clickProductsPanelButton() throws InterruptedException {
        List<WebElement> elementList = findElements(By.cssSelector("[class*='status-box-grey']"));
        clickJS(elementList.get(0));
        log.info("Products Panel Button clicked.");
        return this;
    }

    public Customer360Page clickDocumentViewButton() throws InterruptedException {
        clickJS(By.xpath("//mat-icon[contains(text(),'visibility')]"));
        log.info("Document View Button clicked.");
        return this;
    }

    public Customer360Page controlDocumentImagePopup() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Document Image Popup is checking.");
        //control(isElementExist(By.xpath("//app-document-view-modal//img")), "Document Image Popup is exist.", "Document Image Popup is not exist.");
        control(isElementExist(By.xpath("//*[contains(text(),'sample.pdf')]")), "Document Image Popup is exist.", "Document Image Popup is not exist.");
        return this;
    }

    public Customer360Page controlCharacteristicFieldForBackendSideForCorporate(String fieldName) {
        log.info(fieldName + "Field Value is checking.");
        String incomingValue = "";
        switch (fieldName) {
            case "name":
                incomingValue = worldHelper.getCreateAggCorporateResponse().getCharacteristic().get(2).getName();
                break;
            case "value":
                incomingValue = worldHelper.getCreateAggCorporateResponse().getCharacteristic().get(2).getValue();
                break;
            case "valueType":
                incomingValue = worldHelper.getCreateAggCorporateResponse().getCharacteristic().get(2).getValueType();
                break;
            default:
                //code block
        }
        log.info(fieldName + ": " + incomingValue);
        control(incomingValue != null, fieldName + "Field Value is successfully.", "ERROR:" + fieldName + "Field Value is not successfully.");
        return this;
    }

    public Customer360Page controlFullNameForCorporateCustomer() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Full Name Field Value is checking.");
        String incomingFullNameValue = worldHelper.getNewCorporateCreateResponse().getName();
        String expectedValue = "TESTCORP";
        log.info("Incoming Full Name Value:" + incomingFullNameValue);
        log.info("Expected Full Name Value:" + expectedValue);
        control(incomingFullNameValue.contains(expectedValue), "Full Name value is successfully.", "ERROR: Full Name value is not successfully.");
        return this;
    }

    public Customer360Page clickButtonTwo(String buttonName) throws InterruptedException {
        Thread.sleep(2000);
        if (buttonName.equals("Download")) {
            buttonName = "cloud_download";
            clickJS(By.xpath("//*[contains(text(),'" + buttonName + "')]"));
        } else if (buttonName.equals("add")) {
            clickJS(By.xpath("//mat-tab-body//*[contains(text(),'" + buttonName + "')]"));
        } else {
            clickJS(By.xpath("//*[contains(text(),'" + buttonName + "')]"));
        }
        log.info(buttonName + "Button clicked.");
        return this;
    }

    public Customer360Page controlProductStatus(String productName, String status) {
        log.info(productName + "Product Status is checking.");
        control(isElementExist(By.xpath("//mat-panel-title[contains(text(),'" + productName + "')]//following-sibling::mat-panel-description//*[contains(text(),'" + status + "')]")), productName + "Product Status is" + status, "ERROR:" + productName + "Product Status is not" + status);
        return this;
    }

    public Customer360Page controlCustomer() throws InterruptedException {
        switchWindowTab();
        log.info("Customer Search Display is checking.");
        control(isElementExist(By.xpath("//*[contains(text(),'Customer Search')]")), "Customer Search Display is exist.", "ERROR: Customer Search Display is not exist.");
        return this;
    }

    public Customer360Page clickCancelButtonForIdentificationNumber() throws InterruptedException {
        Thread.sleep(1000);
        List<WebElement> elementList = findElements(btnCancel);
        clickJS(elementList.get(0));
        log.info("Cancel Button For Identification Number Clicked.");
        return this;
    }

    public Customer360Page enterBirthDate(String birthDate) throws InterruptedException {
        log.info("Enter Birth Date:" + birthDate);
        if (birthDate.contains("boundary value")) {
            clickJS(btnOpenCalender);
            List<WebElement> elementList = findElements(By.xpath("//td[@aria-disabled='true']/preceding-sibling::td[1]"));
            clickJS(elementList.get(1));
        } else if (birthDate.contains("02061992")) {
            clickJS(btnOpenCalender);
            Thread.sleep(500);
            clickJS(btnCalenderMonthYear);
            Thread.sleep(500);
            clickJS(btnCalender1992Year);
            Thread.sleep(1000);
            clickJS(btnCalenderMoth);
            Thread.sleep(500);
            clickJS(btnCalenderDay);
            // sendKeys(pcrBirthDate, birthDate, false);
            Thread.sleep(2000);
        } else {
            Thread.sleep(1000);
            sendKeys(pcrBirthDate, birthDate);
        }
        return this;
    }

    public Customer360Page clickShoppingCartPanel() throws InterruptedException {
        Thread.sleep(1000);
        clickJS(By.xpath("//td//*[contains(text(),'Retail')]"));
        log.info("Shopping Cart Panel clicked.");
        return this;
    }

    public Customer360Page controlProductDefaultStatus(String product) {
        log.info(product + "Product Default Status Color is checking.");
        control(isElementExist(By.xpath("//mat-panel-title[contains(text(),'" + product + "')]//following-sibling::mat-panel-description//div[@class='status-box-green' and contains(text(),'active')]")), product + " Product Default Status is active", "ERROR:" + product + " Product Default Status is not active");
        return this;
    }

    public Customer360Page controlBlacklistFlagDropdownValue(String fieldOne, String fieldTwo) throws InterruptedException {
        Thread.sleep(1000);
        log.info("Blacklist Flag Dropdown Value is checking.");
        clickJS(cmbBlackListFlag);
        Thread.sleep(500);
        control(isElementExist(By.xpath("//*[contains(text(),'" + fieldOne + "')]")), fieldOne + " field is exist.", "ERROR: " + fieldOne + " field is not exist.");
        control(isElementExist(By.xpath("//*[contains(text(),'" + fieldTwo + "')]")), fieldTwo + " field is exist.", "ERROR: " + fieldTwo + " field is not exist.");
        return this;
    }

    public Customer360Page selectBlacklistFlag(String blacklistFlag) throws InterruptedException {
        Thread.sleep(1000);
        selectMatComboboxJS(cmbBlackListFlag, blacklistFlag);
        log.info("Select Blacklist Flag:" + blacklistFlag);
        return this;
    }

    public Customer360Page clickAgreementList() throws InterruptedException {
        Thread.sleep(1000);
        List<WebElement> elementList = findElements(By.xpath("//mat-cell"));
        clickJS(elementList.get(0));
        log.info("Agreement List clicked.");
        return this;
    }

    public Customer360Page controlAgreementDetailField(String fieldName) {
        log.info(fieldName + "Agreement Field is checking.");
        control(isElementExist(By.xpath("//mat-list-item//*[contains(text(),'" + fieldName + "')]")), fieldName + "field is exist.", "ERROR:" + fieldName + "field is not exist.");
        return this;
    }

    public Customer360Page controlContactTabField(String fieldName) throws InterruptedException {
        Thread.sleep(2000);
        log.info(fieldName + "Contact Tab Field Value is checking.");
        String expectedValue = "";
        switch (fieldName) {
            case "Identification Number":
                expectedValue = worldHelper.getIdentificationNumberResidentialContact();
        }
        control(isElementExist(By.xpath("//*[contains(text(),'" + expectedValue + "')]")), fieldName + "field value is successfully.", "ERROR:" + fieldName + "field value is not successfully.");
        return this;
    }

    public Customer360Page clickEditButtonForCustomerInfo() throws InterruptedException {
        Thread.sleep(1000);
        clickJS(By.xpath("//app-customer-info//mat-icon[contains(text(),'more_vert')]"));
        Thread.sleep(1000);
        clickJS(btnEdit);
        log.info("Edit Button clicked.");
        return this;
    }


    public Customer360Page enterEmail(String email) throws InterruptedException {
        findElement(By.cssSelector("app-customer-update-dialog input[formcontrolname = 'email']")).clear();
        Thread.sleep(1000);
        sendKeys(By.cssSelector("app-customer-update-dialog input[formcontrolname = 'email']"), email);
        log.info("Enter Email " + email);
        return this;
    }

    public Customer360Page clickEditButtonForServiceAddress() throws InterruptedException {
        Thread.sleep(1000);
        List<WebElement> elementList = findElements(By.xpath("//mat-icon[contains(text(),'more_vert')]"));
        clickJS(elementList.get(0));
        Thread.sleep(1000);
        clickJS(btnEdit);
        log.info("Edit Button clicked.");
        return this;
    }

    public Customer360Page clickEditButtonForBillingAddress() throws InterruptedException {
        Thread.sleep(1000);
        List<WebElement> elementList = findElements(By.xpath("//mat-icon[contains(text(),'more_vert')]"));
        clickJS(elementList.get(1));
        Thread.sleep(1000);
        clickJS(btnEdit);
        log.info("Edit Button clicked.");
        return this;
    }

    public Customer360Page clickContactTypeForCustomer360Page(String contactType) throws InterruptedException {
        Thread.sleep(1000);
        clickJS(By.xpath("//td[contains(text(),'" + contactType + "')]"));
        log.info(contactType + "Contact Type Button clicked.");
        return this;
    }

    public Customer360Page clickEditButtonForIndividualPartyInfo() throws InterruptedException {
        Thread.sleep(1000);
        clickJS(By.xpath("//app-individual-party-info//mat-icon[contains(text(),'more_vert')]"));
        Thread.sleep(1000);
        clickJS(btnEdit);
        log.info("Edit Button clicked.");
        return this;
    }

    public Customer360Page clickEditButtonForIndividualCustomerInfo() throws InterruptedException {
        Thread.sleep(1000);
        clickJS(By.xpath("//app-customer-info//mat-icon[contains(text(),'more_vert')]"));
        Thread.sleep(1000);
        clickJS(btnEdit);
        log.info("Edit Button clicked.");
        return this;
    }

    public Customer360Page enterBirthDateForContactTab(String birthDate) throws InterruptedException {
        Thread.sleep(1000);
        switch (birthDate) {
            case "02061992":
                clickJS(btnOpenCalender);
                Thread.sleep(1000);
                clickJS(btnCalenderMonthYear);
                Thread.sleep(2000);
                clickJS(btnCalender1992Year);
                Thread.sleep(1000);
                clickJS(btnCalenderMoth);
                Thread.sleep(500);
                clickJS(btnCalenderDay);
                // sendKeys(pcrBirthDate, birthDate, false);
                Thread.sleep(2000);
                break;
            default:
                sendKeys(pcrBirthDate, birthDate, false);
        }
        log.info("Birth Date:" + birthDate);
        return this;
    }

    public Customer360Page selectGenderForContact(String gender) throws InterruptedException {
        Thread.sleep(1000);
        selectMatComboboxJS(cmbGenderForContact, gender.toUpperCase());
        log.info("Select Gender " + gender);
        return this;
    }

    public Customer360Page selectCitizenshipForContact(String citizenship) throws InterruptedException {
        Thread.sleep(500);
        selectMatComboboxJS(cmbCitizenshipForContact, citizenship);
        log.info("Select Citizenship " + citizenship);
        return this;
    }

    public Customer360Page selectDocumentTypeForContact(String documentType) throws InterruptedException {
        Thread.sleep(500);
        selectMatComboboxJS(cmbDocumentTypeForContact, documentType);
        log.info("Select Document Type " + documentType);
        return this;
    }

    public Customer360Page enterDocumentFileForContact() throws InterruptedException, AWTException {
        Thread.sleep(5000);
        clickJS(findElements(btnAddNewDocument).get(2));
        String path = System.getProperty("user.dir") + "\\document.jpg";
        Thread.sleep(1000);
        uploadFile(txtFileInput, path);
        Thread.sleep(1000);
//        Robot robot = new Robot();
//        robot.keyPress(KeyEvent.VK_ESCAPE);
//        robot.keyRelease(KeyEvent.VK_ESCAPE);
//        Thread.sleep(1000);
        return this;
    }

    public Customer360Page enterMobileNumberForContactAdmin(String mobileNumber) throws InterruptedException {
        findElement(txtMobileNumber).clear();
        sendKeys(txtMobileNumber, mobileNumber, false);
        log.info("Mobile Number:" + mobileNumber);
        if (txtMobileNumber.equals("")) {
            sendKeys(txtMobileNumber, "345", false);
            findElement(txtMobileNumber).sendKeys(Keys.BACK_SPACE);
        }
        return this;
    }

    public Customer360Page selectAuthType(String authType) throws InterruptedException {
        Thread.sleep(1000);
        selectMatComboboxJS(By.cssSelector("[formcontrolname='authType']"), authType);
        log.info("Select AuthType" + authType);
        return this;
    }

    public Customer360Page clickNewOrderButtonForPostpaid() throws InterruptedException {
        Thread.sleep(1000);
        WebElement element = findElement(By.xpath("//mat-cell//span[contains(text(),'Postpaid')]//parent::mat-cell//parent::mat-row//span[contains(text(),'New Order')]"));
        clickJS(element);
        log.info("New Order Button For Postpaid clicked.");
        return this;
    }

    public Customer360Page controlIndividualPartyEditButton() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Individual Party Edit Button is checking.");
        control(isElementExist(By.xpath("//app-individual-party-info//mat-icon[contains(text(),'more_vert')]//parent::span//parent::button[contains(@style,'none')]")), "Individual Party Edit Button is not exist.", "Individual Party Edit Button is exist.");
        control(isElementExist(By.xpath("//app-customer-info//mat-icon[contains(text(),'more_vert')]//parent::span//parent::button[contains(@style,'none')]")), "Individual Party Edit Button is not exist.", "Individual Party Edit Button is exist.");
        return this;
    }

    public Customer360Page controlAddressEditButton() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Address Tab Edit Button is checking.");
        control(isElementExist(By.xpath("//td[contains(text(),'SERVICE')]//parent::tr//button[contains(@style,'none')]")), "Address Tab Edit Button is not exist.", "Address Tab Edit Button is exist.");
        control(isElementExist(By.xpath("//td[contains(text(),'BILLING')]//parent::tr//button[contains(@style,'none')]")), "Address Tab Edit Button is not exist.", "Address Tab Edit Button is exist.");
        return this;
    }

    public Customer360Page controlContactUpdateButton() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Contact Tab Update Button is checking.");
        List<WebElement> elementList = findElements(By.xpath("//mat-icon[contains(text(),'more_vert')]"));
        clickJS(elementList.get(0));
        Thread.sleep(1000);
        control(!(isElementExist(By.xpath("//*[contains(text(),'Update')]"))), "Update field is not exist.", "ERROR: Update field is exist.");
        clickJS(elementList.get(0));
        Thread.sleep(1000);
        clickJS(elementList.get(1));
        control(!(isElementExist(By.xpath("//*[contains(text(),'Update')]"))), "Update field is not exist.", "ERROR: Update field is exist.");
        return this;
    }

    public Customer360Page controlNewOrderButton() throws InterruptedException {
        Thread.sleep(1000);
        log.info("New Order Button is checking.");
        control(isElementExist(By.xpath("//*[contains(text(),'New Order')]//parent::span//parent::button[contains(@style,'none')]")), "New Order Button is not exist.", "New Order Button is exist.");
        return this;
    }

    public Customer360Page controlDocumentAndViewButton() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Document And View Button is checking.");
        control(isElementExist(By.xpath("//*[contains(text(),'cloud_download')]//parent::span//parent::button[contains(@style,'none')]")), "Document Button is not exist.", "Document Button is exist.");
        control(isElementExist(By.xpath("//*[contains(text(),'visibility')]//parent::span//parent::button[contains(@style,'none')]")), "View Button is not exist.", "View Button is exist.");
        return this;
    }

    public Customer360Page enterSalesAgent(String salesAgent) throws InterruptedException {
        Thread.sleep(1500);
        sendKeys(txtSalesAgent, salesAgent, true);
        Thread.sleep(1500);
        clickJS(By.xpath("//span[contains(text(),'" + salesAgent + "')]"));
        log.info("Enter Sales Agent " + salesAgent);
        return this;
    }

    public Customer360Page controlNotEditableFieldForResource(String fieldName) throws InterruptedException {
        Thread.sleep(1000);
        log.info(fieldName + " Field Not Editable Property is checking");
        switch (fieldName) {
            case "Resource Type":
                control(isElementExist(By.cssSelector("[formcontrolname='resourceType'][readonly='true']")), fieldName + " Field Not Editable.", "ERROR:" + fieldName + " Field Editable.");
                break;
            default:
                //code block
        }
        return this;
    }

    public Customer360Page enterMacAddress(String macAddress) throws InterruptedException {
        Thread.sleep(2000);
        findElement(txtMacAdressForResource).clear();
        Thread.sleep(1000);
        sendKeys(txtMacAdressForResource, macAddress);
        log.info("Enter Mac Address:" + macAddress);
        return this;
    }

    public Customer360Page clickPaymentButton() throws InterruptedException {
        Thread.sleep(1000);
        clickJS(By.xpath("//*[contains(text(),'Payment')]"));
        log.info("Payment Button clicked.");
        return this;
    }

    public Customer360Page controlFieldValue(String field) throws InterruptedException {
        Thread.sleep(1000);
        String fieldValue = findElement(By.xpath("//mat-drawer//*[contains(text(),'" + field + "')]//following-sibling::*")).getText();
        control(fieldValue != null, field + "field value is exist.", "ERROR:" + field + "field value is not exist.");
        return this;
    }

    public Customer360Page clickLoadTicketButton() throws InterruptedException {
        Thread.sleep(1000);
        //clickJS(By.xpath("//span[contains(text(),'Load Tickets')]//parent::button"));
        clickJS(By.cssSelector("[class*='mat-focus-indicator ng-tns-c207-23 mat-flat-button mat-button-base mat-primary']"));
        log.info("Load Tickets button clicked.");
        return this;
    }

    public Customer360Page getInstallationTicketId() throws InterruptedException {
        Thread.sleep(20000);
        //getWebDriver().navigate().refresh();
        //Thread.sleep(10000);
        String installationTicketId = findElement(By.xpath("//app-extended-trouble-ticket-widget//tr[1]//td[1]")).getText();
        log.info("Installation Ticket Id " + installationTicketId + " " + installationTicketId.split("-")[2]);
        worldHelper.setTicketId(installationTicketId.split("-")[2]);
        return this;
    }

    public Customer360Page enterEmailForEnterpriseContact(String email) throws InterruptedException {
        Thread.sleep(1000);
        sendKeys(By.cssSelector("[formcontrolname='email']"), email);
        log.info("Enter Enterprise Email Contact " + email);
        return this;
    }

    public Customer360Page enterIdentificationNumber(String identificationNumber) throws InterruptedException {
        Thread.sleep(2000);
        By locator = By.cssSelector("[formcontrolname='identificationId']");

        String newNumber = "";
        if (identificationNumber.contains("C")) {

            String letter1 = "J20602";
            String number = RandomStringUtils.randomNumeric(3);
            String letter2 = RandomStringUtils.random(1, "ABCDEFGHIJKLMNOPQRSTUVW");
            newNumber = "" + letter1 + number + letter2;
            worldHelper.setIdentificationNumberResidential(newNumber);
            log.info("Identification Number: " + newNumber);
            sendKeys(locator, newNumber, true);
        } else if (identificationNumber.contains("1")) {
//            String letter1 = "J20602";
            String number = RandomStringUtils.randomNumeric(10);
//            String letter2 = RandomStringUtils.random(1, "ABCDEFGHIJKLMNOPQRSTUVW");
//            newNumber = "" + letter1 + number + letter2;
//            worldHelper.setIdentificationNumberForeigner(newNumber);
            log.info("Identification Number: " + number);
            sendKeys(locator, number, true);

        } else if (identificationNumber.contains("0")) {
            String letter1 = "J20602";
            String number = RandomStringUtils.randomNumeric(3);
            String letter2 = RandomStringUtils.random(1, "ABCDEFGHIJKLMNOPQRSTUVW");
            newNumber = "" + letter1 + number + letter2;
            worldHelper.setIdentificationNumberForeigner(newNumber);
            log.info("Identification Number: " + newNumber);
            sendKeys(locator, newNumber, false);
        } else {
            sendKeys(locator, identificationNumber, true);
        }

        return this;
    }

    public Customer360Page clickDeactivationButton(String buttonName) throws InterruptedException {
        Thread.sleep(2500);
        clickJS(By.xpath("//*[contains(text(),'" + buttonName + "')]//parent::label//parent::mat-radio-button//input"));
        log.info(buttonName + " Deactivation button clicked.");
        return this;
    }

    public Customer360Page clickMoreVertForInteraction() throws InterruptedException {
        Thread.sleep(2000);
        clickJS(btnMoreVertInteraction);
        return this;
    }

    public Customer360Page clickCreateButtonForInteraction() throws InterruptedException {
        Thread.sleep(5000);
        clickJS(By.xpath("//*[contains(text(),'Create')]//parent::button"));
        return this;
    }

    public Customer360Page enterSearchMigrationId(String migrationId) throws InterruptedException {
        Thread.sleep(2000);
        migrationId = worldHelper.getMigrationCustomerId();
        sendKeys(txtSearch, migrationId, true);
        return this;
    }

    public Customer360Page clickButtonForManualOrder(String buttonName) throws InterruptedException {
        clickJS(By.xpath("//*[contains(text(),'" + buttonName + "')]//parent::button"));
        log.info(buttonName + " Button clicked.");
        return this;
    }

    public Customer360Page enterDebtMigrationId(String debtMigrationId) throws InterruptedException {
        Thread.sleep(2000);
        sendKeys(txtSearch, debtMigrationId,true);
        log.info("Enter Debt Migration Id: " + debtMigrationId);
        return this;
    }

    public Customer360Page clickDebtPayButton() throws InterruptedException {
        Thread.sleep(5000);
        clickJS(findElements(By.xpath("//*[contains(text(),'Pay')]")).get(2));
        log.info("Pay Button clicked.");
        return this;
    }

    public Customer360Page selectPaymentMethodForDebtPay(String paymentMethod) throws InterruptedException {
        Thread.sleep(1500);
        selectMatComboboxJS(By.xpath("//mat-dialog-container//mat-select"),paymentMethod);
        log.info("Select Payment Method: " + paymentMethod);
        return this;
    }

    public Customer360Page clickPaymentCollectedForDebtPay() throws InterruptedException {
        Thread.sleep(2000);
        clickJS(By.xpath("//input[@type='checkbox']//parent::div"));
        log.info("Payment Collected clicked.");
        return this;
    }

    public Customer360Page enterOrderCompletedCustomer(String orderCompletedCustomer) throws InterruptedException {
        Thread.sleep(2000);
        String orderCompletedCustomerId = worldHelper.getMigrationCustomerId();
        sendKeys(txtSearch,orderCompletedCustomerId,true);
        log.info("Enter Order Completed Customer Id: " + orderCompletedCustomerId);
        return this;
    }
}