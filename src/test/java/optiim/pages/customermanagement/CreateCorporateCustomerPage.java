package optiim.pages.customermanagement;

import optiim.framework.core.PageBase;
import optiim.framework.helpers.WebDriverHelper;
import optiim.framework.helpers.WorldHelper;
import optiim.framework.utils.log;
import optiim.models.data.gui.customermanegement.CreateCorporateCustomerData;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.Logs;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

//import static sun.jvm.hotspot.oops.CellTypeState.value;

public class CreateCorporateCustomerPage extends PageBase {


    public static final By titleNewCorporateCustomerPage = By.xpath("//div[contains(text(),'New Enterprise Customer')]");
    public static final By iconValidCreateTab = By.xpath("//mat-icon[contains(text(),'create')]");
    public static final By txtNIPT = By.cssSelector("[formcontrolname = 'organizationNumber']");
    public static final By txtNIPTInvalid = By.cssSelector("[formcontrolname = 'organizationNumber'][class*='ng-invalid']");
    public static final By btnSearchNIPT = By.cssSelector("[mattooltip='Detail']");
    public static final By btnNext = By.xpath("//span[contains(text(),'Next')]//parent::span//parent::button");
    public static final By txtNIPTDeactive = By.cssSelector("[formcontrolname = 'organization'][disabled]");
    public static final By txtName = By.cssSelector("[formcontrolname = 'name']");
    public static final By txtNameInvalid = By.cssSelector("[formcontrolname = 'name'][class*='ng-invalid']");
    public static final By cmbIndustry = By.cssSelector("[formcontrolname = 'industry']");
    public static final By cmbIndustryInvalid = By.cssSelector("[formcontrolname = 'industry'][class*='ng-invalid']");
    public static final By cmbBillMedia = By.cssSelector("[formcontrolname = 'billMedia']");
    public static final By cmbBillMediaInvalid = By.cssSelector("[formcontrolname = 'presentationMedia'][class*='ng-invalid']");
    public static final By titleOptionList = By.cssSelector("[class*='mat-option'][role='option']");
    public static final By txtAccountManagerDeactive = By.cssSelector("[formcontrolname = 'accountManager'][disabled]");
    public static final By btnBack = By.cssSelector("[fxlayoutalign='space-between'] [class*='save-product-button primary']");
    public static final By txtIdentificationNumber = By.cssSelector("[formcontrolname = 'personalNumber']");
    public static final By txtIdentificationNumberWithName = By.cssSelector("[formcontrolname = 'personalNumberWithName']");
    public static final By txtIdentificationNumberInvalid = By.cssSelector("[formcontrolname = 'personalNumberWithName'][class*='ng-invalid']");
    public static final By txtFirstName = By.cssSelector("[formcontrolname = 'firstName']");
    public static final By txtFirstNameInvalid = By.cssSelector("[formcontrolname = 'firstName'][class*='ng-invalid']");
    public static final By txtLastName = By.cssSelector("[formcontrolname = 'lastName']");
    public static final By txtLastNameInvalid = By.cssSelector("[formcontrolname = 'lastName'][class*='ng-invalid']");
    public static final By txtSecondaryName = By.cssSelector("[formcontrolname = 'secondaryName']");
    public static final By txtSecondaryNameInvalid = By.cssSelector("[formcontrolname = 'secondaryName'][class*='ng-invalid']");
    public static final By txtEmail = By.cssSelector("app-corporate-customer-admin [formcontrolname = 'email']");
    public static final By txtEmailInvalid = By.cssSelector("[formcontrolname = 'email'][class*='ng-invalid']");
    public static final By pcrBirthDate = By.cssSelector("[formcontrolname = 'birthDate']");
    public static final By pcrBirthDateInvalid = By.cssSelector("[formcontrolname = 'birthDate'][class*='ng-invalid']");
    public static final By pcrBirthDateValid = By.cssSelector("[formcontrolname = 'birthDate'][class*='ng-valid']");
    public static final By cmbGender = By.cssSelector("[formcontrolname = 'gender']");
    public static final By cmbGenderInvalid = By.cssSelector("[formcontrolname = 'gender'][class*='ng-invalid']");
    public static final By cmbCountryOfBirth = By.cssSelector("[formcontrolname = 'birthCountry']");
    public static final By cmbCountryOfBirthInvalid = By.cssSelector("[formcontrolname = 'birthCountry'][class*='ng-invalid']");
    public static final By cmbPlaceOfBirth = By.cssSelector("[formcontrolname = 'placeOfBirth']");
    public static final By cmbPlaceOfBirthInvalid = By.cssSelector("[formcontrolname = 'placeOfBirth'][class*='ng-invalid']");
    public static final By txtPlaceOfBirth = By.cssSelector("input[formcontrolname = 'placeOfBirth']");
    public static final By txtPlaceOfBirthInvalid = By.cssSelector("input[formcontrolname = 'placeOfBirth'][class*='ng-invalid']");
    public static final By cmbCitizenship = By.cssSelector("[formcontrolname = 'citizenShip']");
    public static final By cmbCitizenshipInvalid = By.cssSelector("[formcontrolname = 'citizenShip'][class*='ng-invalid']");
    public static final By txtPhoneNumber = By.cssSelector("app-corporate-customer-admin [formcontrolname = 'phoneNumber']");
    public static final By txtWorkPhoneNumber = By.xpath("//input[@id='mat-input-13']");
    public static final By txtPhoneNumberInvalid = By.cssSelector("[formcontrolname = 'phoneNumber'][class*='ng-invalid']");
    public static final By cmbDocumentType = By.cssSelector("[formcontrolname = 'authDocType']");
    public static final By cmbDocumentTypeInvalid = By.cssSelector("[formcontrolname = 'authDocType'][class*='ng-invalid']");
    public static final By txtAddressLineOne = By.cssSelector("[formcontrolname = 'street1']");
    public static final By txtServiceAddressLineOne = By.cssSelector("[formcontrolname='serviceStreet1']");
    public static final By txtAddressLineOneInvalid = By.cssSelector("[formcontrolname = 'street1'][class*='ng-invalid']");
    public static final By txtServiceAddressLineOneInvalid = By.cssSelector("[formcontrolname='serviceStreet1'][class*='ng-invalid']");
    public static final By txtAddressLineTwo = By.cssSelector("[formcontrolname = 'street2']");
    public static final By txtServiceAddressLineTwo = By.cssSelector("[formcontrolname='serviceStreet2']");
    public static final By txtAddressLineTwoInvalid = By.cssSelector("[formcontrolname = 'street2'][class*='ng-invalid']");
    public static final By txtServiceAddressLineTwoInvalid = By.cssSelector("[formcontrolname='serviceStreet2'][class*='ng-invalid']");
    public static final By cmbCountry = By.cssSelector("[formcontrolname = 'country']");
    public static final By cmbServiceCountry = By.cssSelector("[formcontrolname='serviceCountry']");
    public static final By cmbCountryInvalid = By.cssSelector("[formcontrolname = 'country'][class*='ng-invalid']");
    public static final By cmbCity = By.cssSelector("[formcontrolname = 'city']");
    public static final By cmbServiceCity = By.cssSelector("[formcontrolname='serviceCity']");
    public static final By cmbCityInvalid = By.cssSelector("[formcontrolname = 'city'][role='listbox'][class*='ng-invalid']");
    public static final By cmbServiceCityInvalid = By.cssSelector("[formcontrolname='serviceCity'][class*='ng-invalid']");
    public static final By txtCity = By.cssSelector("[formcontrolname = 'city'][type='text']");
    public static final By txtCityInvalid = By.cssSelector("[formcontrolname = 'city'][type='text'][class*='ng-invalid']");
    public static final By btnAddNewMedium = By.xpath("//aside//span/mat-icon[contains(text(),'add')]");
    public static final By titleNewMediumContact = By.xpath("//h3[contains(text(),'New Contact Medium')]");
    public static final By btnNewMediumContactBlankPanel = By.xpath("//mat-expansion-panel-header/span[1]");
    public static final By cmbMediumTypeDefault = By.cssSelector("[formcontrolname='mediumType']");
    public static final By cmbServiceMediumType = By.cssSelector("[formcontrolname='serviceMediumType']");
    public static final By cmbContactTypeDefault = By.cssSelector("[formcontrolname='contactType']");
    public static final By cmbServiceContactType = By.cssSelector("[formcontrolname='serviceContactType']");
    public static final By cmbMediumType = By.cssSelector("[formcontrolname='mediumType']");
    public static final By cmbMediumTypeInvalid = By.cssSelector("[formcontrolname='mediumType'][role='listbox'][class*='ng-invalid']");
    public static final By cmbContactType = By.cssSelector("[formcontrolname='contactType']");
    public static final By cmbContactTypeInvalid = By.cssSelector("[formcontrolname='contactType'][role='listbox'][class*='ng-invalid']");
    public static final By txtEmailAddressContactMediumPanel = By.cssSelector("[formcontrolname='emailAddress']");
    public static final By txtEmailAddressContactMediumInvalid = By.cssSelector("[formcontrolname='emailAddress'][class*='ng-invalid']");
    public static final By btnDeleteMediumContact = By.xpath("//mat-icon[contains(text(),'delete')]");
    public static final By btnAdd = By.xpath("//span[contains(text(),'Save')]");
    public static final By btnAddInvalid = By.cssSelector("[class*='save-product-button'][disabled='true']");
    public static final By btnSave = By.cssSelector("[class*='save-product-button']");
    public static final By btnSaveInvalid = By.cssSelector("[class*='save-product-button'][disabled='true']");
    public static final By alertPopupMessage = By.cssSelector("[role='alert'] [class='mat-simple-snackbar ng-star-inserted']");
    public static final By adminInformationTab = By.xpath("//div[contains(text(),'Admin Information')]");
    public static final By searchOrganizationTab = By.xpath("//div[contains(text(),'Search Organization')]");
    public static final By generalInformationTab = By.xpath("//div[contains(text(),'General Information')]");
    public static final By addressInformationTab = By.xpath("//div[contains(text(),'Address Information')]");
    public static final By cmbCommunicationMethod = By.cssSelector("[formcontrolname='communicationMethod']");
    public static final By cmbCommunicationMethodInvalid = By.cssSelector("[formcontrolname='communicationMethod'][class*='ng-invalid']");
    public static final By pcrIdentificationIssuingDate = By.cssSelector("[formcontrolname='identificationIssuingDate']");
    public static final By pcrIdentificationIssuingDateInvalid = By.cssSelector("[formcontrolname='identificationIssuingDate'][class*='ng-invalid']");
    public static final By btnAddNewDocument = By.xpath("//mat-icon[contains(text(),'add')]");
    public static final By txtFileInput = By.xpath("//*[@id='fileInput']");
    public static final By txtFileInputGeneral = By.id("fileInputGeneral");
    public static final By txtDocumentNumber = By.cssSelector("[formcontrolname = 'documentNumber']");
    public static final By txtDocumentNumberInvalid = By.cssSelector("[formcontrolname = 'documentNumber'][class*='ng-invalid']");
    public static final By btnCancelFile = By.xpath("//div[@id='file-label']//following-sibling::div/a");
    public static final By btnCancelFileTwo = By.xpath("//mat-icon[contains(text(),'cancel')]");
    public static final By titleFileDeleteMessage = By.tagName("mat-error");
    public static final By btnAlsoServiceAddress = By.cssSelector("[formcontrolname='hasServiceAddress'] [class='mat-slide-toggle-bar']");
    public static final By txtWorkNumber = By.cssSelector("[formcontrolname='workPhoneNumber']");
    public static final By txtWorkNumberInvalid = By.cssSelector("[formcontrolname='workPhoneNumber'][class*='ng-invalid']");
    public static final By btnBirthDateClose = By.xpath("//mat-icon[contains(text(),'close')]");
    public static final By invoiceInformationTab = By.xpath("//div[contains(text(),'Invoice Account')]");
    public static final By cmbBillMediaForInvoiceAccount = By.cssSelector("[formcontrolname='presentationMedia'][role='listbox']");
    public static final By cmbCurrency = By.cssSelector("[formcontrolname='currency'][role='listbox']");
    public static final By cmbCurrencyPrepaid = By.cssSelector("[formcontrolname='currencyPrepaid'][role='listbox']");
    public static final By cmbPaymentType = By.cssSelector("[formcontrolname='ratingType']");
    public static final By txtDescription = By.cssSelector("input[formcontrolname='description']");
    public static final By txtDescriptionPrepaid = By.cssSelector("input[formcontrolname='descriptionPrepaid']");
    public static final By cmbPaymentMethod = By.cssSelector("[formcontrolname='paymentMethod'][role='listbox']");
    public static final By cmbBankName = By.cssSelector("[formcontrolname='bank'][role='listbox']");
    public static final By txtBankAccountNo = By.cssSelector("input[formcontrolname='accountNumber']");
    public static final By txtBankAccountNoInvalid = By.cssSelector("input[formcontrolname='accountNumber'][class*='ng-invalid']");
    public static final By txtOwner = By.cssSelector("input[formcontrolname='owner']");
    public static final By deleteButton = By.cssSelector("[class='mat-focus-indicator red-fg ng-tns-c331-8 mat-button mat-button-base']");
    public static final By cmbCorporatePhoneCode = By.cssSelector("[formcontrolname='phoneCodeMobile']");
    public static final By cmbCorporatePhoneWork = By.cssSelector("[formcontrolname='phoneCodeWork']");
    public static final By cmbCustomerType = By.cssSelector("[formcontrolname='customerType']");
    public static final By cmbCustomerTypeInvalid = By.cssSelector("[formcontrolname='customerType'][class*='ng-invalid']");
    public static final By cmbSegment = By.cssSelector("[formcontrolname='segment']");
    public static final By cmbSegmentInvalid = By.cssSelector("[formcontrolname='segment'][class*='ng-invalid']");
    public static final By btnOpenCalender = By.cssSelector("[aria-label='Open calendar']");
    public static final By btnCalenderMonthYear = By.cssSelector("[aria-label='Choose month and year']");
    public static final By btnCalender1992Year = By.xpath("//div[contains(text(),'1992')]");
    public static final By btnCalenderMoth = By.xpath("//div[contains(text(),'JUN')]");
    public static final By btnCalenderDay = By.xpath("//td[@aria-label='2 June 1992']");
    public static final By txtEmailGeneralTab = By.cssSelector("app-corporate-customer-general input[formcontrolname = 'email']");
    public static final By txtMobileNumberGeneralTab = By.cssSelector("app-corporate-customer-general input[formcontrolname = 'phoneNumber']");
    public static final By txtPinValue = By.cssSelector("app-corporate-customer-general input[formcontrolname = 'phoneValidation']");
    public static final By txtPinValueForAdminTab = By.cssSelector("app-corporate-customer-admin [formcontrolname = 'phoneValidation']");

    private final WorldHelper worldHelper;


    public CreateCorporateCustomerPage(WebDriverHelper webDriverHelper, WorldHelper worldHelper) {
        super(webDriverHelper);
        this.worldHelper = worldHelper;
    }

    public CreateCorporateCustomerPage controlNewCorporateCustomerPage(String pageNameText) throws InterruptedException {
        Thread.sleep(1000);
        control(isElementExist(By.xpath("//*[contains(text(),'" + pageNameText + "')]")), pageNameText + "is field exist", "ERROR:" + pageNameText + "is field not exist");
        return this;
    }

    public CreateCorporateCustomerPage controlTab(String tabName) {
        switch (tabName) {
            case "Search Organization":
                control((isElementExist(iconValidCreateTab) && isElementExist(txtNIPT)), tabName + "tab opened.", "ERROR:" + tabName + "tab could not be opened.");
                break;
            case "General Information":
                control((isElementExist(iconValidCreateTab) && isElementExist(pcrIdentificationIssuingDate)), tabName + "tab opened.", "ERROR:" + tabName + "tab could not be opened.");
                break;
            case "Admin Information":
                control((isElementExist(iconValidCreateTab) && isElementExist(txtSecondaryName)), tabName + "tab opened.", "ERROR:" + tabName + "tab could not be opened.");
                break;
            case "Address Information":
                control((isElementExist(iconValidCreateTab) && isElementExist(txtAddressLineTwo)), tabName + "tab opened.", "ERROR:" + tabName + "tab could not be opened.");
                break;
            case "Invoice Account Information":
                control((isElementExist(iconValidCreateTab) && isElementExist(cmbBillMediaForInvoiceAccount)), tabName + "tab opened.", "ERROR:" + tabName + "tab could not be opened.");
                break;
            case "Contact Information":
                control(isElementExist(cmbContactType), tabName + "tab opened.", "ERROR:" + tabName + "tab could not be opened.");
                break;
            default:
                //code block
        }
        return this;
    }


    public CreateCorporateCustomerPage enterNIPTNumber(String niptNumber) throws InterruptedException {
        Thread.sleep(2000);
        String newNumber = "";
        if (niptNumber.contains("A")) {
            newNumber = niptNumber + getRandomNumberInRange(10000000, 99999999) + "D";
            sendKeys(txtNIPT, newNumber, true);
            //click(btnSearchNIPT);
        } else if (niptNumber.contains("0")) {
            newNumber = "F" + getRandomNumberInRange(10000000, 99999999) + "D";
            sendKeys(txtNIPT, newNumber, false);
            //click(btnSearchNIPT);
        } else {
            newNumber = niptNumber + getRandomNumberInRange(10000000, 99999999) + "3";
            sendKeys(txtNIPT, newNumber, true);
            //click(btnSearchNIPT);
        }

        worldHelper.setNiptNumber(newNumber);
        log.info("NIPT Number: " + newNumber);

        return this;
    }

    public CreateCorporateCustomerPage clickNextButton() throws InterruptedException {
        Thread.sleep(2500);
        //elementToBeClickable(btnNext);
        List<WebElement> elementList = findElements(btnNext);
        clickJS(elementList.get(0));
        //elementList.get(0).click();
        log.info("Next button clicked in the Search Organization page ");
        return this;
    }

    public CreateCorporateCustomerPage controlGeneralInformationField(String organizationNumber, String name, String industry, String billMedia, String accountManager) {

        //control(isElementExist(txtNIPTDeactive), organizationNumber + "is field deactive exist", "ERROR:" + organizationNumber + "is field not deactive exist");
        control(isElementExist(txtName), name + "is field exist", "ERROR:" + name + "is field not exist");
        control(isElementExist(cmbIndustry), industry + "is field exist", "ERROR:" + industry + "is field not exist");
        //control(isElementExist(cmbBillMedia), billMedia + "is field exist", "ERROR:" + billMedia + "is field not exist");
        //control(isElementExist(txtAccountManagerDeactive), accountManager + "is field deactive exist", "ERROR:" + accountManager + "is field not deactive exist");
        return this;
    }

    public CreateCorporateCustomerPage enterName(String name) throws InterruptedException {
        clearText(txtName);
        log.info("Enter Name:" + name);
        sendKeys(txtName, name);

        if (name.equals("")) {
            sendKeys(txtName, "A", false);
            findElement(txtName).sendKeys(Keys.BACK_SPACE);
        }
        return this;
    }

    public CreateCorporateCustomerPage controlValueField(String value, String field) throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        String expected = value.toUpperCase().replace('İ', 'I');
        log.info("Expected:" + expected);

        String incoming = "";

        switch (field) {
            case "Name":
                incoming = js.executeScript("return document.querySelector('[formcontrolname=name]').value").toString();
                break;
            case "First Name":
                incoming = js.executeScript("return document.querySelector('[formcontrolname=firstName]').value").toString();
                break;
            case "Last Name":
                incoming = js.executeScript("return document.querySelector('[formcontrolname=lastName]').value").toString();
                break;
            case "Secondary Name":
                incoming = js.executeScript("return document.querySelector('[formcontrolname=secondaryName]').value").toString();
                break;
            case "Email":
                incoming = js.executeScript("return document.querySelector('app-corporate-customer-admin [formcontrolname=email]').value").toString();
                break;
            default:
                // code block
        }

        log.info("Incoming:" + incoming);
        control(incoming.contains(expected), "Value characters are uppercase.", "ERROR:Value characters are not uppercase.");
        if (field.equals("Email")) {
            control((incoming.contains("@") && (incoming.contains("."))), "'@' and '.' included.", "ERROR:'@' and '.' not included.");
        }

        return this;
    }

    public CreateCorporateCustomerPage controlDefaultBillMedia(String billMediaType) {
        control(isElementExist(By.xpath("//span[contains(text(),'" + billMediaType + "')]")), "" +
                        "Bill Media came default PAPER.",
                "ERROR:Bill Media did not come default PAPER.");
        return this;
    }

    public CreateCorporateCustomerPage controlBillMediaAllField(String fieldOne, String fieldTwo, String fieldThree) throws InterruptedException, AWTException {
        String[] billMediaType = {fieldOne, fieldTwo, fieldThree};
        int i = 0;
        log.info("Bill Media fields are checking...");
        clickJS(cmbBillMedia);
        //List<WebElement> elementList = findElements(By.cssSelector("[class='mat-option-text']"));
        //for (WebElement element : elementList) {
        //control(element.getText().contains(billMediaType[i]), billMediaType[i] + "type is exist.", "ERROR:" + billMediaType[i] + "type is not exist.");
        //i++;
        //}
        control(isElementExist(By.xpath("//*[contains(text(),'" + fieldOne + "')]")), "Popup control is successfully", "ERROR:Popup control is not successfully");
        control(isElementExist(By.xpath("//*[contains(text(),'" + fieldTwo + "')]")), "Popup control is successfully", "ERROR:Popup control is not successfully");
        control(isElementExist(By.xpath("//*[contains(text(),'" + fieldThree + "')]")), "Popup control is successfully", "ERROR:Popup control is not successfully");
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        return this;
    }

    public CreateCorporateCustomerPage selectBillMediaType(String billMediaType) throws InterruptedException {
        selectMatComboboxJS(cmbBillMedia, billMediaType);
        log.info(billMediaType + "selected.");
        return this;
    }

    public CreateCorporateCustomerPage controlIndustryAllField(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10, String arg11) throws InterruptedException, AWTException {
        //String[] IndustryType = {arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11,"OTHER"};
        //int i = 0;
        log.info("Industry fields are checking...");
        click(cmbIndustry);
        //waitForExpectedElement(By.cssSelector("[class='mat-option-text']"));
        //List<WebElement> elementList = findElements(By.cssSelector("[class='mat-option-text']"));
        //for (WebElement element : elementList) {
        //control(element.getText().contains(IndustryType[i].toUpperCase().replace("İ", "I")), IndustryType[i].toUpperCase() + "title is exist.", "ERROR:" + IndustryType[i].toUpperCase() + "title is not exist.");
        //control(element.getText().contains(IndustryType[i]), IndustryType[i].toUpperCase() + "title is exist.", "ERROR:" + IndustryType[i].toUpperCase() + "title is not exist.");
        //i++;
        //}
        control(isElementExist(By.xpath("//*[contains(text(),'" + arg0 + "')]")), "Popup control is successfully", "ERROR:Popup control is not successfully");
        control(isElementExist(By.xpath("//*[contains(text(),'" + arg1 + "')]")), "Popup control is successfully", "ERROR:Popup control is not successfully");
        control(isElementExist(By.xpath("//*[contains(text(),'" + arg2 + "')]")), "Popup control is successfully", "ERROR:Popup control is not successfully");
        control(isElementExist(By.xpath("//*[contains(text(),'" + arg3 + "')]")), "Popup control is successfully", "ERROR:Popup control is not successfully");
        control(isElementExist(By.xpath("//*[contains(text(),'" + arg4 + "')]")), "Popup control is successfully", "ERROR:Popup control is not successfully");
        control(isElementExist(By.xpath("//*[contains(text(),'" + arg5 + "')]")), "Popup control is successfully", "ERROR:Popup control is not successfully");
        control(isElementExist(By.xpath("//*[contains(text(),'" + arg6 + "')]")), "Popup control is successfully", "ERROR:Popup control is not successfully");
        control(isElementExist(By.xpath("//*[contains(text(),'" + arg7 + "')]")), "Popup control is successfully", "ERROR:Popup control is not successfully");
        control(isElementExist(By.xpath("//*[contains(text(),'" + arg8 + "')]")), "Popup control is successfully", "ERROR:Popup control is not successfully");
        control(isElementExist(By.xpath("//*[contains(text(),'" + arg9 + "')]")), "Popup control is successfully", "ERROR:Popup control is not successfully");
        control(isElementExist(By.xpath("//*[contains(text(),'" + arg10 + "')]")), "Popup control is successfully", "ERROR:Popup control is not successfully");
        control(isElementExist(By.xpath("//*[contains(text(),'" + arg11 + "')]")), "Popup control is successfully", "ERROR:Popup control is not successfully");

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        return this;
    }

    public CreateCorporateCustomerPage selectIndustryType(String industryType) throws InterruptedException {
        Thread.sleep(1500);
        selectMatComboboxJS(cmbIndustry, industryType);
        //selectMatComboboxJS(cmbIndustry, industryType.toUpperCase().replace("İ", "I"));
        log.info(industryType + "selected.");
        return this;
    }

    public CreateCorporateCustomerPage clickNextButtonGeneralInformation() throws InterruptedException {
        Thread.sleep(9000);
        //control(isElementExist(By.cssSelector("[id='file-label']")),"File label is exist.","File label is not exist.");
        List<WebElement> btnNextList = findElements(btnNext);
        btnNextList.get(1).click();
        log.info("Next button clicked in the General Information page");
        return this;
    }

    public CreateCorporateCustomerPage controlFieldErrorMessage(String fieldName) {
        switch (fieldName) {
            case "Name":
                control(isElementExist(txtNameInvalid), fieldName + " Invalid and mandatory field.", "ERROR: " + fieldName + " valid and not mandatory field.");
                break;
            case "First Name":
                control(isElementExist(txtFirstNameInvalid), fieldName + " Invalid and mandatory field.", "ERROR: " + fieldName + " valid and not mandatory field.");
                break;
            case "Last Name":
                control(isElementExist(txtLastNameInvalid), fieldName + " Invalid and mandatory field.", "ERROR: " + fieldName + " valid and not mandatory field.");
                break;
            case "NIPT":
                control(isElementExist(txtNIPTInvalid), fieldName + " Invalid and mandatory field.", "ERROR: " + fieldName + " valid and not mandatory field.");
                break;
            case "Industry":
                control(isElementExist(cmbIndustryInvalid), fieldName + " Invalid and mandatory field.", "ERROR: " + fieldName + " valid and not mandatory field.");
                break;
            case "Customer Type":
                control(isElementExist(cmbCustomerTypeInvalid), fieldName + " Invalid and mandatory field.", "ERROR: " + fieldName + " valid and not mandatory field.");
                break;
            case "Segment":
                control(isElementExist(cmbSegmentInvalid), fieldName + " Invalid and mandatory field.", "ERROR: " + fieldName + " valid and not mandatory field.");
                break;
            case "Bill Media":
                control(isElementExist(cmbBillMediaInvalid), fieldName + " Invalid and mandatory field.", "ERROR: " + fieldName + " valid and not mandatory field.");
                break;
            case "Identification Number":
                control(isElementExist(txtIdentificationNumberInvalid), fieldName + " Invalid and mandatory field.", "ERROR: " + fieldName + " valid and not mandatory field.");
                break;
            case "Secondary Name":
                control(isElementExist(txtSecondaryNameInvalid), fieldName + " Invalid and mandatory field.", "ERROR: " + fieldName + " valid and not mandatory field.");
                break;
            case "Email":
                control(isElementExist(txtEmailInvalid), fieldName + " Invalid and mandatory field.", "ERROR: " + fieldName + " valid and not mandatory field.");
                break;
            case "Birth Date":
                control(isElementExist(pcrBirthDateInvalid), fieldName + " Invalid and mandatory field.", "ERROR: " + fieldName + " valid and not mandatory field.");
                break;
            case "Gender":
                control(isElementExist(cmbGenderInvalid), fieldName + " Invalid and mandatory field.", "ERROR: " + fieldName + " valid and not mandatory field.");
                break;
            case "Country Of Birth":
                control(isElementExist(cmbCountryOfBirthInvalid), fieldName + " Invalid and mandatory field.", "ERROR: " + fieldName + " valid and not mandatory field.");
                break;
            case "Place Of Birth":
                control(isElementExist(cmbPlaceOfBirthInvalid), fieldName + " Invalid and mandatory field.", "ERROR: " + fieldName + " valid and not mandatory field.");
                break;
            case "Citizenship":
                control(isElementExist(cmbCitizenshipInvalid), fieldName + " Invalid and mandatory field.", "ERROR: " + fieldName + " valid and not mandatory field.");
                break;
            case "Phone Number":
                control(isElementExist(txtPhoneNumberInvalid), fieldName + " Invalid and mandatory field.", "ERROR: " + fieldName + " valid and not mandatory field.");
                break;
            case "Document Type":
                control(isElementExist(cmbDocumentTypeInvalid), fieldName + " Invalid and mandatory field.", "ERROR: " + fieldName + " valid and not mandatory field.");
                break;
            case "Address Line One":
                control(isElementExist(txtAddressLineOneInvalid), fieldName + " Invalid and mandatory field.", "ERROR: " + fieldName + " valid and not mandatory field.");
                break;
            case "Address Line Two":
                control(isElementExist(txtAddressLineTwoInvalid), fieldName + " Invalid and mandatory field.", "ERROR: " + fieldName + " valid and not mandatory field.");
                break;
            case "Service Address Line One":
                control(isElementExist(txtServiceAddressLineOneInvalid), fieldName + " Invalid and mandatory field.", "ERROR: " + fieldName + " valid and not mandatory field.");
                break;
            case "Service Address Line Two":
                control(isElementExist(txtServiceAddressLineTwoInvalid), fieldName + " Invalid and mandatory field.", "ERROR: " + fieldName + " valid and not mandatory field.");
                break;
            case "Country":
                control(isElementExist(cmbCountryInvalid), fieldName + " Invalid and mandatory field.", "ERROR: " + fieldName + " valid and not mandatory field.");
                break;
            case "City":
                control(isElementExist(cmbCityInvalid), fieldName + " Invalid and mandatory field.", "ERROR: " + fieldName + " valid and not mandatory field.");
                break;
            case "Service City":
                control(isElementExist(cmbServiceCityInvalid), fieldName + " Invalid and mandatory field.", "ERROR: " + fieldName + " valid and not mandatory field.");
                break;
            case "City Text ":
                control(isElementExist(txtCityInvalid), fieldName + " Invalid and mandatory field.", "ERROR: " + fieldName + " valid and not mandatory field.");
                break;
            case "Medium Type":
                control(isElementExist(cmbMediumTypeInvalid), fieldName + " Invalid and mandatory field.", "ERROR: " + fieldName + " valid and not mandatory field.");
                break;
            case "Contact Type":
                control(isElementExist(cmbContactTypeInvalid), fieldName + " Invalid and mandatory field.", "ERROR: " + fieldName + " valid and not mandatory field.");
                break;
            case "Email Address Contact":
                control(isElementExist(txtEmailAddressContactMediumInvalid), fieldName + " Invalid and mandatory field.", "ERROR: " + fieldName + " valid and not mandatory field.");
                break;
            case "Add":
                control(isElementExist(btnAddInvalid), fieldName + " Invalid and mandatory field.", "ERROR: " + fieldName + " valid and not mandatory field.");
                break;
            case "Save":
                control(isElementExist(btnSaveInvalid), fieldName + " Invalid and mandatory field.", "ERROR: " + fieldName + " valid and not mandatory field.");
                break;
            case "Issuing Date":
                control(isElementExist(pcrIdentificationIssuingDateInvalid), fieldName + " Invalid and mandatory field.", "ERROR: " + fieldName + " valid and not mandatory field.");
                break;
            case "Document Number":
                control(isElementExist(txtDocumentNumberInvalid), fieldName + " Invalid and mandatory field.", "ERROR: " + fieldName + " valid and not mandatory field.");
                break;
            case "Work Number":
                control(isElementExist(txtWorkNumberInvalid), fieldName + " Invalid and mandatory field.", "ERROR: " + fieldName + " valid and not mandatory field.");
                break;
            case "Bank Account No":
                control(isElementExist(txtBankAccountNoInvalid), fieldName + " Invalid and mandatory field.", "ERROR: " + fieldName + " valid and not mandatory field.");
                break;
            default:
                //code block

        }
        return this;

    }

    public CreateCorporateCustomerPage clickAdminInformationTab() throws InterruptedException {
        Thread.sleep(2000);
        clickJS(adminInformationTab);
        log.info("Admin Information Tab clicked.");
        return this;
    }

    public CreateCorporateCustomerPage enterFirstName(String firstName) throws InterruptedException {
        Thread.sleep(2500);
        getWebDriver().findElement(txtFirstName).clear();
        Thread.sleep(1000);
        log.info("Enter First Name:" + firstName);
        sendKeys(txtFirstName, firstName);
        Thread.sleep(1000);
        if (firstName.equals("")) {
            sendKeys(txtFirstName, "A");
            findElement(txtFirstName).sendKeys(Keys.BACK_SPACE);
        }
        return this;
    }

    public CreateCorporateCustomerPage enterLastName(String lastName) throws InterruptedException {
        clearText(txtLastName);
        log.info("Enter Last Name:" + lastName);
        sendKeys(txtLastName, lastName);
        return this;
    }

    public CreateCorporateCustomerPage enterSecondaryName(String secondaryName) throws InterruptedException {
        Thread.sleep(1000);
        findElement(txtSecondaryName).clear();
        Thread.sleep(500);
        sendKeys(txtSecondaryName, secondaryName);
        log.info("Enter Secondary Name:" + secondaryName);
        return this;
    }

    public CreateCorporateCustomerPage controlAdminInformationField(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10, String arg11) {
        log.info("Admin Information fields are checking...");
        control(isElementExist(txtIdentificationNumber), arg0 + "is field exist", "ERROR:" + arg0 + "is field not exist");
        //control(isElementExist(txtIdentificationNumber) || isElementExist(txtIdentificationNumberWithName), arg0 + "is field exist", "ERROR:" + arg0 + "is field not exist");
        control(isElementExist(txtFirstName), arg1 + "is field exist", "ERROR:" + arg1 + "is field not exist");
        control(isElementExist(txtLastName), arg2 + "is field exist", "ERROR:" + arg2 + "is field not exist");
        control(isElementExist(txtSecondaryName), arg3 + "is field exist", "ERROR:" + arg3 + "is field not exist");
        control(isElementExist(txtEmail), arg4 + "is field exist", "ERROR:" + arg4 + "is field not exist");
        control(isElementExist(pcrBirthDate), arg5 + "is field exist", "ERROR:" + arg5 + "is field not exist");
        control(isElementExist(cmbGender), arg6 + "is field exist", "ERROR:" + arg6 + "is field not exist");
        control(isElementExist(cmbCountryOfBirth), arg7 + "is field exist", "ERROR:" + arg7 + "is field not exist");
        control(isElementExist(cmbPlaceOfBirth), arg8 + "is field exist", "ERROR:" + arg8 + "is field not exist");
        control(isElementExist(cmbCitizenship), arg9 + "is field exist", "ERROR:" + arg9 + "is field not exist");
        control(isElementExist(txtPhoneNumber), arg10 + "is field exist", "ERROR:" + arg10 + "is field not exist");
        control(isElementExist(cmbDocumentType), arg11 + "is field exist", "ERROR:" + arg11 + "is field not exist");
        return this;
    }

    public CreateCorporateCustomerPage enterBirthDate(String birthDate) throws InterruptedException, AWTException {
        log.info("Enter Birth Date:" + birthDate);
        if (birthDate.contains("boundary value")) {
            clickJS(btnOpenCalender);
            List<WebElement> elementList = findElements(By.xpath("//td[@aria-disabled='true']/preceding-sibling::td[1]"));
            clickJS(elementList.get(1));
        } else if (birthDate.contains("02061992")) {
            List<WebElement> elementList = findElements(btnOpenCalender);
            clickJS(elementList.get(1));
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
            sendKeys(pcrBirthDate, birthDate);
        }
        return this;
    }

    public CreateCorporateCustomerPage controlDefaultCountryOfBirth(String cobName) {
        control(isElementExist(By.xpath("//span[contains(text(),'" + cobName + "')]")), "" +
                        "Country Of Birth came default Albania.",
                "ERROR: Country Of Birth did not come default Albania.");
        return this;
    }

    public CreateCorporateCustomerPage selectPlaceOfBirth(String pobName) throws InterruptedException {
        log.info("Select Place Of Birth:" + pobName);
        selectMatComboboxJS(cmbPlaceOfBirth, pobName);
        return this;
    }

    public CreateCorporateCustomerPage selectCountryOfBirth(String cobName) throws InterruptedException {
        log.info("Select Country Of Birth:" + cobName);
        selectMatComboboxJS(cmbCountryOfBirth, cobName);
        return this;
    }

    public CreateCorporateCustomerPage controlDefaultCitizenship(String citizenshipName) {
        control(isElementExist(By.xpath("//span[contains(text(),'" + citizenshipName + "')]")), "" +
                        "Citizenship came default Albanian.",
                "ERROR: Citizenship did not come default Albanian.");
        return this;
    }

    public CreateCorporateCustomerPage selectCitizenship(String citizenshipName) throws InterruptedException {
        log.info("Select Citizenship:" + citizenshipName);
        selectMatComboboxJS(cmbCitizenship, citizenshipName);
        return this;
    }

    public CreateCorporateCustomerPage selectGender(String genderType) throws InterruptedException {
        log.info("Select Gender:" + genderType);
        selectMatComboboxJS(cmbGender, genderType.toUpperCase());
        return this;
    }

    public CreateCorporateCustomerPage selectDocumentType(String documentType) throws InterruptedException {
        List<WebElement> elementList = findElements(cmbDocumentType);

        log.info("Select Document Type:" + documentType);
        selectMatComboboxJS(elementList.get(1), documentType);


        return this;
    }

    public CreateCorporateCustomerPage enterIdentificationNumber(String identificationNumber) throws InterruptedException {
        Thread.sleep(2000);
        String newNumber = "";
        if (identificationNumber.contains("C")) {
            String letter1 = "J20602";
            String number = RandomStringUtils.randomNumeric(3);
            String letter2 = RandomStringUtils.random(1, "ABCDEFGHIJKLMNOPQRSTUVW");
            newNumber = "" + letter1 + number + letter2;
        } else if (identificationNumber.contains("1")) {
            String letter1 = "J20602";
            String number = RandomStringUtils.randomNumeric(3);
            String letter2 = RandomStringUtils.random(1, "ABCDEFGHIJKLMNOPQRSTUVW");
            newNumber = "" + letter1 + number + letter2;
        } else
            newNumber = identificationNumber;
        worldHelper.setIdentificationNumberCorporate(newNumber);
        log.info("Enter Identification Number:" + newNumber);
        //worldHelper.setNiptNumber(newNumber);
        //waitForExpectedElement(txtIdentificationNumber);
        clickJS(txtIdentificationNumber);
        Thread.sleep(1000);
        sendKeys(txtIdentificationNumber, newNumber, true);
        clickJS(txtFirstName);
        return this;
    }

    public CreateCorporateCustomerPage enterEmail(String email) throws InterruptedException, AWTException {
        clearText(txtEmail);
        sendKeys(txtEmail, email, false);
        log.info("Email:" + email);
        if (email.equals("")) {
            sendKeys(txtEmail, "A", false);
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_BACK_SPACE);
            robot.keyRelease(KeyEvent.VK_BACK_SPACE);
        }
        return this;
    }

    public CreateCorporateCustomerPage enterPhoneNumber(String phoneNumber) throws InterruptedException, AWTException {
        clearText(txtPhoneNumber);
        sendKeys(txtPhoneNumber, phoneNumber, false);
        log.info("Mobile Number:" + phoneNumber);
        if (phoneNumber.equals("")) {
            sendKeys(txtPhoneNumber, "345", false);
            findElement(txtPhoneNumber).sendKeys(Keys.BACK_SPACE);
            //Robot robot = new Robot();
            //robot.keyPress(KeyEvent.VK_BACK_SPACE);
            //robot.keyRelease(KeyEvent.VK_BACK_SPACE);
        }
        return this;
    }

    public CreateCorporateCustomerPage clickAddressInformationTab() throws InterruptedException {
        Thread.sleep(2000);
        clickJS(addressInformationTab);
        log.info("Address Information Tab clicked.");
        return this;
    }

    public CreateCorporateCustomerPage enterAddressLineOne(String addressLineOne) throws InterruptedException, AWTException {
        Thread.sleep(1000);
        findElement(txtAddressLineOne).clear();
        Thread.sleep(1000);
        sendKeys(txtAddressLineOne, addressLineOne, false);
        log.info("AddressLineOne:" + addressLineOne);
        Thread.sleep(1000);
        if (addressLineOne.equals("")) {
            //getWebDriver().switchTo().window(getWebDriver().getWindowHandle());
            sendKeys(txtAddressLineOne, "A", false);
            findElement(txtAddressLineOne).sendKeys(Keys.BACK_SPACE);
        }
        if (addressLineOne.contains("New Address")) {
            findElement(txtAddressLineOne).clear();
            addressLineOne = "Turke" + RandomStringUtils.randomNumeric(5) + " " + "Rruga" + RandomStringUtils.randomNumeric(2) + " " + "Elbasanit No:" + RandomStringUtils.randomNumeric(2);
            Thread.sleep(1000);
            sendKeys(txtAddressLineOne, addressLineOne);
            log.info("AddressLineOne:" + addressLineOne);
        }
        return this;
    }

    public CreateCorporateCustomerPage clickNextButtonAdminInformation() throws InterruptedException {
        Thread.sleep(2000);
        List<WebElement> elementList = findElements(btnNext);
        clickJS(elementList.get(3));
        log.info("Next button clicked in the Admin Information page.");
        return this;
    }

    public CreateCorporateCustomerPage controlAddressInformationField(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5) throws InterruptedException {
        Thread.sleep(1000);
        log.info("Address Information fields are checking...");
        control(isElementExist(cmbMediumTypeDefault), arg0 + "is field exist", "ERROR:" + arg0 + "is field not exist");
        control(isElementExist(cmbContactTypeDefault), arg1 + "is field exist", "ERROR:" + arg1 + "is field not exist");
        control(isElementExist(txtAddressLineOne), arg2 + "is field exist", "ERROR:" + arg2 + "is field not exist");
        control(isElementExist(txtAddressLineTwo), arg3 + "is field exist", "ERROR:" + arg3 + "is field not exist");
        control(isElementExist(cmbCountry), arg4 + "is field exist", "ERROR:" + arg4 + "is field not exist");
        control(isElementExist(cmbCity), arg5 + "is field exist", "ERROR:" + arg5 + "is field not exist");
        return this;
    }

    public CreateCorporateCustomerPage controlDefaultMediumType(String mediumTypeValue) {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        String expected = mediumTypeValue;
        log.info("Expected Medium Type:" + expected);
        String incoming = js.executeScript("return document.querySelector('[formcontrolname=mediumType]').value").toString();
        log.info("Incoming Medium Type:" + incoming);
        control(incoming.contains(expected), mediumTypeValue + "field is exist", "ERROR:" + mediumTypeValue + "field is not exist");
        return this;
    }

    public CreateCorporateCustomerPage controlDefaultContactType(String contactTypeValue) throws InterruptedException {
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        String expected = contactTypeValue;
        log.info("Expected Contact Type:" + expected);
        String incoming = js.executeScript("return document.querySelector('[ng-reflect-name=contactType]').value").toString();
        log.info("İncoming Contact Type:" + incoming);
        control(incoming.contains(expected), contactTypeValue + "field is exist", "ERROR:" + contactTypeValue + "field is not exist");
        return this;
    }

    public CreateCorporateCustomerPage selectCountry(String countryName) throws InterruptedException {
        log.info("Select Country Name:" + countryName);
        selectMatCombobox(cmbCountry, countryName);
        return this;
    }

    public CreateCorporateCustomerPage controlCityFieldTextArea() {
        log.info("City TextArea Field is checking.");
        control(isElementExist(txtCity), "City TextArea field is exist", "ERROR:City TextArea field is not exist");
        return this;
    }

    public CreateCorporateCustomerPage enterCity(String cityName) throws InterruptedException {
        log.info("Enter Text City:" + cityName);
        sendKeys(txtCity, cityName);
        return this;
    }

    public CreateCorporateCustomerPage controlCityFieldDropdownlist() {
        log.info("City Dropdownlist Field is checking.");
        control(isElementExist(cmbCity), "City Dropdownlist field is exist", "ERROR:City Dropdownlist field is not exist");
        return this;
    }

    public CreateCorporateCustomerPage controlDefaultCountry(String countryName) {
        control(isElementExist(By.xpath("//span[contains(text(),'" + countryName + "')]")), "" +
                        "Country came default Albania.",
                "ERROR: Country did not come default Albania.");
        return this;
    }

    public CreateCorporateCustomerPage selectCity(String cityName) throws InterruptedException {
        Thread.sleep(1500);
        log.info("Select Dropdownlist City:" + cityName);
        selectMatComboboxJS(cmbCity, cityName);
        return this;
    }

    public CreateCorporateCustomerPage controlCityFieldValue(String cityName) {
        control(isElementExist(By.xpath("//span[contains(text(),'" + cityName + "')]")), "" +
                        "City came" + cityName,
                "ERROR: City did not come" + cityName);
        return this;
    }

    public CreateCorporateCustomerPage createCorporateCustomer() throws InterruptedException, AWTException {
        controlTab(CreateCorporateCustomerData.searchOrganization);
        enterNIPTNumber(CreateCorporateCustomerData.niptNumber);
        clickNextButton();
        controlTab(CreateCorporateCustomerData.generalInformation);
        enterName(CreateCorporateCustomerData.name);
        controlValueField(CreateCorporateCustomerData.name, CreateCorporateCustomerData.nameType);
        controlDefaultBillMedia(CreateCorporateCustomerData.paper);
        selectBillMediaType(CreateCorporateCustomerData.ebill);
        selectIndustryType(CreateCorporateCustomerData.financeAndInsurance);
        clickNextButtonGeneralInformation();
        controlTab(CreateCorporateCustomerData.adminInformation);
        enterIdentificationNumber(CreateCorporateCustomerData.identificationNumber);
        enterFirstName(CreateCorporateCustomerData.firstName);
        controlValueField(CreateCorporateCustomerData.firstName, CreateCorporateCustomerData.firstNameType);
        enterLastName(CreateCorporateCustomerData.lastName);
        controlValueField(CreateCorporateCustomerData.lastName, CreateCorporateCustomerData.lastNameType);
        enterSecondaryName(CreateCorporateCustomerData.secondaryName);
        controlValueField(CreateCorporateCustomerData.secondaryName, CreateCorporateCustomerData.secondaryNameType);
        enterEmail(CreateCorporateCustomerData.email);
        enterBirthDate(CreateCorporateCustomerData.birthDate);
        selectCommunicationType(CreateCorporateCustomerData.communicationType);
        controlDefaultCountryOfBirth(CreateCorporateCustomerData.countryOfBirth);
        selectPlaceOfBirth(CreateCorporateCustomerData.placeOfBirth);
        controlDefaultCitizenship(CreateCorporateCustomerData.citizenship);
        selectGender(CreateCorporateCustomerData.genderType);
        selectDocumentType(CreateCorporateCustomerData.documentType);
        enterIssuingDate(CreateCorporateCustomerData.issuingDate);
        //enterIdentificationNumberTwo("C");
        enterDocumentFile();
        enterPhoneNumber(CreateCorporateCustomerData.phoneNumber);
        clickNextButtonAdminInformation();
        controlTab(CreateCorporateCustomerData.addressInformation);
        enterAddressLineOne(CreateCorporateCustomerData.addressLineOne);
        selectCity(CreateCorporateCustomerData.city);
        clickAddButton();
        return this;
    }

    public CreateCorporateCustomerPage controlMediumPanel() {
        control(isElementExist(titleNewMediumContact), "New Contact Medium title is exist.", "New Contact Medium title is not exist.");
        return this;
    }

    public CreateCorporateCustomerPage clickAddNewContactMediumButton() throws InterruptedException {
        clickJS(btnAddNewMedium);
        log.info("Add New Contact Medium Button clicked.");
        clickJS(btnNewMediumContactBlankPanel);
        log.info("New Medium Contact Blank Panel clicked.");
        return this;
    }

    public CreateCorporateCustomerPage controlField(String fieldName) {
        switch (fieldName) {
            case "Medium Type":
                control(isElementExist(cmbMediumType), fieldName + "field is exist.", "ERROR:" + fieldName + "field is not exist.");
                break;
            case "Contact Type":
                control(isElementExist(cmbContactType), fieldName + "field is exist.", "ERROR:" + fieldName + "field is not exist.");
                break;
            default:
                //code block
        }
        return this;
    }

    public CreateCorporateCustomerPage selectMediumType(String mediumType) throws InterruptedException {
        //waitForExpectedElement(cmbMediumType);
        log.info("Select Medium Type:" + mediumType);
        selectMatComboboxJS(cmbMediumType, mediumType);
        return this;
    }

    public CreateCorporateCustomerPage selectContactType(String contactType) throws InterruptedException {
        log.info("Select Contact Type:" + contactType);
        selectMatComboboxJS(cmbContactType, contactType);
        return this;
    }

    public CreateCorporateCustomerPage enterEmailAddress(String email) throws InterruptedException {
        Thread.sleep(2000);
        //elementToBeClickable(txtEmailAddressContactMediumPanel);
        log.info("Enter Email Address:" + email);
        findElement(txtEmailAddressContactMediumPanel).clear();
        findElement(txtEmailAddressContactMediumPanel).sendKeys(email);
        return this;
    }

    public CreateCorporateCustomerPage enterPhoneNumberMediumContact(String phoneNumber) {
        log.info("Enter Phone Number:" + phoneNumber);
        List<WebElement> elementList = findElements(txtPhoneNumber);
        elementList.get(1).clear();
        elementList.get(1).sendKeys(phoneNumber);
        return this;
    }

    public CreateCorporateCustomerPage clickDeleteButton() throws InterruptedException {
        clickJS(btnDeleteMediumContact);
        return this;
    }

    public CreateCorporateCustomerPage controlAlertMessage(String expectedMessage) throws InterruptedException {
        Thread.sleep(2000);
        log.info("Expected Alert Message:" + expectedMessage);
        control(isElementExist(By.xpath("//*[contains(text(),'" + expectedMessage + "')]")), "Popup control is successfully", "ERROR:Popup control is not successfully");
        return this;
    }

    public CreateCorporateCustomerPage clickNextButtonAddressInformation() throws InterruptedException {
        Thread.sleep(1000);
        List<WebElement> elementList = findElements(btnNext);
        clickJS(elementList.get(3));
        log.info("Next button clicked in the Address Information page ");
        return this;
    }

    public CreateCorporateCustomerPage clickAddButton() throws InterruptedException {
        Thread.sleep(9000);
        clickJS(btnAdd);
        log.info("Add Button clicked.");
        return this;
    }

    public CreateCorporateCustomerPage selectCommunicationType(String communicationType) throws InterruptedException {
        Thread.sleep(1500);
        log.info("Select Communication Type:" + communicationType.toUpperCase());
        selectMatComboboxJS(cmbCommunicationMethod, communicationType);
        //selectMatComboboxJS(cmbCommunicationMethod, communicationType.toUpperCase().replace("İ","I"));
        return this;
    }

    public CreateCorporateCustomerPage controlCommunicationMethodField(String salesVisit, String phone, String directMail, String email, String wirelessMessage, String sms, String fax) throws InterruptedException, AWTException {
        String[] communicationMethodType = {salesVisit, phone, directMail, email, wirelessMessage, sms, fax};
        int i = 0;
        log.info("Communication Method Field is checking.");
        click(cmbCommunicationMethod);
        List<WebElement> elementList = findElements(By.cssSelector("[class='mat-option-text']"));
        for (WebElement element : elementList) {
            control(element.getText().contains(communicationMethodType[i].toUpperCase().replace("İ", "I")), communicationMethodType[i].toUpperCase() + "type is exist.", "ERROR:" + communicationMethodType[i].toUpperCase() + "type is not exist.");
            i++;
        }
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        return this;
    }

    public CreateCorporateCustomerPage enterIssuingDate(String issuingDate) throws InterruptedException {
        List<WebElement> elementList = findElements(pcrIdentificationIssuingDate);
        //elementList.get(1).clear();
        log.info("Issuing Date:" + issuingDate);
        elementList.get(1).sendKeys(issuingDate);
        return this;
    }

    public CreateCorporateCustomerPage enterDocumentFile() throws AWTException, InterruptedException {
        Thread.sleep(5000);
        List<WebElement> elementList = findElements(btnAddNewDocument);
        //elementList.get(2).click();

        clickJS(elementList.get(1));

        String path = System.getProperty("user.dir") + "\\document.jpg";

        uploadFile(txtFileInput, path);

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        return this;
    }

    public CreateCorporateCustomerPage enterIdentificationNumberTwo(String identificationNumber) throws InterruptedException {
        List<WebElement> elementList = findElements(txtDocumentNumber);
        elementList.get(1).clear();
        String newNumber = "";
        if (identificationNumber.contains("C")) {
            newNumber = identificationNumber + getRandomNumberInRange(10000000, 99999999) + "D";
        } else if (identificationNumber.contains("1")) {
            newNumber = identificationNumber + getRandomNumberInRange(10000000, 99999999) + "8";
        } else {
            newNumber = identificationNumber;
        }
        log.info("Enter Identification Number:" + newNumber);
        //worldHelper.setNiptNumber(newNumber);
        //waitForExpectedElement(txtIdentificationNumber);
        elementList.get(1).click();
        //click(txtDocumentNumber);
        elementList.get(1).sendKeys(newNumber, Keys.ENTER);
        return this;
    }

    public CreateCorporateCustomerPage controlDocumentCollection(String issuingDate, String documentNumber) {
        log.info("Document Collection field is checking.");
        control(isElementExist(pcrIdentificationIssuingDate), issuingDate + "field is exist.", "ERROR:" + issuingDate + "field is not exist.");
        control(isElementExist(txtDocumentNumber), documentNumber + "field is exist.", "ERROR:" + documentNumber + "field is not exist.");
        return this;
    }

    public CreateCorporateCustomerPage controlDefaultDocumentType(String documentType) {
        control(isElementExist(By.xpath("//span[contains(text(),'" + documentType.toUpperCase() + "')]")), "Document Type came default" + documentType, "ERROR: Document Type did not come default" + documentType);
        return this;
    }

    public CreateCorporateCustomerPage clickCancelFileButton() throws InterruptedException {
        Thread.sleep(7000);
        List<WebElement> elementList = findElements(btnCancelFile);
        clickJS(elementList.get(2));
        log.info("Cancel File Button clicked.");
        return this;
    }

    public CreateCorporateCustomerPage controlFileDeleteMessage(String fileDeleteMessage) throws InterruptedException {
        Thread.sleep(2000);
        log.info("Expected Message:" + fileDeleteMessage);
        control(isElementExist(By.xpath("//mat-error[contains(text(),'" + fileDeleteMessage + "')]")), fileDeleteMessage + "title is exist.", "ERROR:" + fileDeleteMessage + "title is not exist.");
        return this;
    }

    public CreateCorporateCustomerPage enterGreaterThanFiveMBDocumentFile() throws AWTException, InterruptedException {
        Thread.sleep(3000);
        List<WebElement> elementList = findElements(btnAddNewDocument);
        if (elementList.size() > 0) {
            clickJS(elementList.get(1));
        } else {
            clickJS(btnAddNewDocument);
        }
        String path = System.getProperty("user.dir") + "\\document_2.jpg";
        uploadFile(txtFileInput, path);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        return this;
    }

    public CreateCorporateCustomerPage enterAddressLineTwo(String addressLineTwo) throws InterruptedException {
        sendKeys(txtAddressLineTwo, addressLineTwo);
        log.info("Enter Address Line Two:" + addressLineTwo);
        return this;
    }

    public CreateCorporateCustomerPage enterNIPTNumberRegisteredUser(String niptNumber) throws InterruptedException {
        niptNumber = worldHelper.getCreateAggCorporateRequest().getOrganizationObject().getOrganizationIdentification().get(0).getIdentificationId();
        sendKeys(txtNIPT, niptNumber, true);
        log.info("Enter NIPT Number:" + niptNumber);
        return this;
    }

    public CreateCorporateCustomerPage clickSaveButton() {
        click(btnSave);
        log.info("Save Button clicked.");
        return this;
    }

    public CreateCorporateCustomerPage enterPlaceOfBirth(String placeOfBirth) throws InterruptedException {
        sendKeys(txtPlaceOfBirth, placeOfBirth);
        log.info("Enter Place Of Birth::" + placeOfBirth);
        return this;
    }

    public CreateCorporateCustomerPage clickDocumentAddButton() throws InterruptedException {
        Thread.sleep(2000);
        clickJS(findElements(btnAddNewDocument).get(0));
        log.info("Document Add Button clicked.");
        return this;
    }

    public CreateCorporateCustomerPage clickandDeactivateAlsoServiceAddressButton() throws InterruptedException {
        Thread.sleep(2000);
        clickJS(btnAlsoServiceAddress);
        log.info("Also Service Address Button clicked.");
        return this;
    }

    public CreateCorporateCustomerPage controlAlsoServiceAddressInformationField(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5) {
        log.info("Address Information fields are checking...");
        control(isElementExist(cmbServiceMediumType), arg0 + "is field exist", "ERROR:" + arg0 + "is field not exist");
        control(isElementExist(cmbServiceContactType), arg1 + "is field exist", "ERROR:" + arg1 + "is field not exist");
        control(isElementExist(txtServiceAddressLineOne), arg2 + "is field exist", "ERROR:" + arg2 + "is field not exist");
        control(isElementExist(txtServiceAddressLineTwo), arg3 + "is field exist", "ERROR:" + arg3 + "is field not exist");
        control(isElementExist(cmbServiceCountry), arg4 + "is field exist", "ERROR:" + arg4 + "is field not exist");
        control(isElementExist(cmbServiceCity), arg5 + "is field exist", "ERROR:" + arg5 + "is field not exist");
        return this;
    }

    public CreateCorporateCustomerPage controlAlsoServiceAddressDefaultMediumType(String serviceMediumTypeValue) throws InterruptedException {
        Thread.sleep(2500);
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        String expected = serviceMediumTypeValue;
        log.info("Expected Medium Type:" + expected);
        String incoming = js.executeScript("return document.querySelector('[formcontrolname=serviceMediumType]').value").toString();
        log.info("Incoming Medium Type:" + incoming);
        control(incoming.contains(expected), serviceMediumTypeValue + "field is exist", "ERROR:" + serviceMediumTypeValue + "field is not exist");
        return this;
    }

    public CreateCorporateCustomerPage controlAlsoServiceAddressServiceContactTypeValue(String serviceContactTypeValue) {
        String expected = serviceContactTypeValue;
        log.info("Expected Contact Type:" + expected);

        control(isElementExist(By.xpath("//*[contains(text(),'" + expected + "')]")), serviceContactTypeValue + "field is exist", "ERROR:" + serviceContactTypeValue + "field is not exist");
        return this;
    }

    public CreateCorporateCustomerPage controlAlsoServiceCountryValue(String serviceCountryValue) throws InterruptedException {
        String expected = serviceCountryValue;
        log.info("Expected Country Type:" + expected);
        control(isElementExist(By.xpath("//*[contains(text(),'" + expected + "')]")), serviceCountryValue + "field is exist", "ERROR:" + serviceCountryValue + "field is not exist");
        return this;

    }

    public CreateCorporateCustomerPage enterServiceAddressLineOne(String serviceAddressLineOne) throws InterruptedException, AWTException {
        Thread.sleep(1000);
        clearText(txtServiceAddressLineOne);
        log.info("AddressLineOne:" + serviceAddressLineOne);
        sendKeys(txtServiceAddressLineOne, serviceAddressLineOne, false);
        if (serviceAddressLineOne.equals("")) {
            sendKeys(txtServiceAddressLineOne, "A", false);
            findElement(txtServiceAddressLineOne).sendKeys(Keys.BACK_SPACE);
        }
        return this;
    }

    public CreateCorporateCustomerPage controlAlsoServiceAddressCity() {
        log.info("City Dropdownlist Field is checking.");
        control(isElementExist(cmbServiceCity), "City Dropdownlist field is exist", "ERROR:City Dropdownlist field is not exist");
        return this;
    }

    public CreateCorporateCustomerPage selectServiceCity(String serviceCity) throws InterruptedException {
        log.info("Select Dropdownlist City:" + serviceCity);
        selectMatComboboxJS(cmbServiceCity, serviceCity);
        return this;
    }

    public CreateCorporateCustomerPage controlAlsoServiceAddressCityValue(String serviceCity) {
        control(isElementExist(By.xpath("//span[contains(text(),'" + serviceCity + "')]")), "" +
                        "City came" + serviceCity,
                "ERROR: City did not come" + serviceCity);
        return this;
    }

    public CreateCorporateCustomerPage enterServiceAddressLineTwo(String serviceAddressLineTwo) throws InterruptedException, AWTException {
        clearText(txtServiceAddressLineTwo);
        log.info("AddressLineOne:" + serviceAddressLineTwo);
        sendKeys(txtServiceAddressLineTwo, serviceAddressLineTwo, false);
        if (serviceAddressLineTwo.equals("")) {
            sendKeys(txtServiceAddressLineTwo, "A", false);
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_BACK_SPACE);
            robot.keyRelease(KeyEvent.VK_BACK_SPACE);
        }
        return this;
    }

    public CreateCorporateCustomerPage enterWorkNumber(String workNumber) throws InterruptedException {
        sendKeys(txtWorkNumber, workNumber);
        log.info("Enter Work Number:" + workNumber);
        return this;
    }

    public CreateCorporateCustomerPage clickBirthDateCloseButton() throws InterruptedException {
        clickJS(findElements(btnBirthDateClose).get(2));
        log.info("Birth Date Close Button clicked.");
        return this;
    }

    public CreateCorporateCustomerPage clickInvoiceAccountInformationTab() throws InterruptedException {
        Thread.sleep(1000);
        clickJS(invoiceInformationTab);
        log.info("Invoice Account Information Tab clicked.");
        return this;
    }

    public CreateCorporateCustomerPage controlInvoiceAccountField(String fieldName) {
        log.info(fieldName + "Field is checking.");
        switch (fieldName) {
            case "Bill Media":
                control(isElementExist(cmbBillMediaForInvoiceAccount), fieldName + "Field is exist.", "ERROR:" + fieldName + "Field is not exist.");
                break;
            case "Currency":
                control(isElementExist(cmbCurrency), fieldName + "Field is exist.", "ERROR:" + fieldName + "Field is not exist.");
                break;
            case "Payment Type":
                control(isElementExist(cmbPaymentType), fieldName + "Field is exist.", "ERROR:" + fieldName + "Field is not exist.");
                break;
            case "Description":
                control(isElementExist(txtDescription), fieldName + "Field is exist.", "ERROR:" + fieldName + "Field is not exist.");
                break;
            case "Payment Method":
                control(isElementExist(cmbPaymentMethod), fieldName + "Field is exist.", "ERROR:" + fieldName + "Field is not exist.");
                break;
            case "Bank Name":
                control(isElementExist(cmbBankName), fieldName + "Field is exist.", "ERROR:" + fieldName + "Field is not exist.");
                break;
            case "Bank Account No":
                control(isElementExist(txtBankAccountNo), fieldName + "Field is exist.", "ERROR:" + fieldName + "Field is not exist.");
                break;
            case "Owner":
                control(isElementExist(txtOwner), fieldName + "Field is exist.", "ERROR:" + fieldName + "Field is not exist.");
                break;
            case "Currency Prepaid":
                control(isElementExist(cmbCurrencyPrepaid), fieldName + "Field is exist.", "ERROR:" + fieldName + "Field is not exist.");
                break;
            case "Description Prepaid":
                control(isElementExist(txtDescriptionPrepaid), fieldName + "Field is exist.", "ERROR:" + fieldName + "Field is not exist.");
                break;
            default:
                //code block
        }
        return this;
    }

    public CreateCorporateCustomerPage selectBillMedia(String billMedia) throws InterruptedException, AWTException {
        Thread.sleep(1000);
        if (billMedia.equals("")) {
            clickJS(cmbBillMediaForInvoiceAccount);
            Thread.sleep(500);
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ESCAPE);
            robot.keyRelease(KeyEvent.VK_ESCAPE);
        } else {
            selectMatComboboxJS(cmbBillMediaForInvoiceAccount, billMedia);
            log.info("Select Bill Media:" + billMedia);
        }
        return this;
    }

    public CreateCorporateCustomerPage selectCurrency(String currency) throws InterruptedException {
        Thread.sleep(2000);
        selectMatComboboxJS(cmbCurrency, currency);
        log.info("Select Currency:" + currency);
        return this;
    }

    public CreateCorporateCustomerPage selectPaymentType(String paymentType) throws InterruptedException {
        selectMatComboboxJS(cmbPaymentType, paymentType);
        log.info("Select Payment Type:" + paymentType);
        return this;
    }

    public CreateCorporateCustomerPage enterDescription(String description) throws InterruptedException {
        Thread.sleep(1500);
        sendKeys(txtDescription, description);
        log.info("Enter Description:" + description);
        return this;
    }

    public CreateCorporateCustomerPage selectPaymentMethod(String paymentMethod) throws InterruptedException {
        Thread.sleep(1000);
        selectMatComboboxJS(cmbPaymentMethod, paymentMethod);
        log.info("Select Payment Method:" + paymentMethod);
        return this;
    }

    public CreateCorporateCustomerPage selectBankName(String bankName) throws InterruptedException, AWTException {
        Thread.sleep(1000);
        //selectMatComboboxJS(cmbBankName, bankName);
        clickJS(cmbBankName);
        Thread.sleep(1000);
        clickJS(By.xpath("//mat-option/span[contains(.,'" + bankName + "')]"));
        //findElement(cmbBankName).sendKeys(Keys.ENTER);
        log.info("Select Bank Name:" + bankName);
        return this;
    }

    public CreateCorporateCustomerPage enterBankAccountNo(String bankAccountNo) throws InterruptedException {
        sendKeys(txtBankAccountNo, bankAccountNo);
        log.info("Enter Bank Account No:" + bankAccountNo);
        return this;
    }

    public CreateCorporateCustomerPage enterOwner(String owner) throws InterruptedException {
        sendKeys(txtOwner, owner);
        log.info("Enter Owner:" + owner);
        return this;
    }

    public CreateCorporateCustomerPage clickNextButtonForInvoiceAccountInformation() throws InterruptedException {
        Thread.sleep(1500);
        clickJS(findElements(By.xpath("//span[contains(text(),'Next')]")).get(3));
        log.info("Next Button For Invoice Account Information clicked.");
        return this;
    }

    public CreateCorporateCustomerPage controlCurrencyField(String fieldNameOne, String fieldNameTwo, String fieldNameThree) throws InterruptedException, AWTException {
        log.info("Currency Field is checking.");
        clickJS(cmbCurrency);
        Thread.sleep(1000);
        control(isElementExist(By.xpath("//span[contains(text(),'" + fieldNameOne + "')]")), fieldNameOne + "Field is exist.", "ERROR:" + fieldNameOne + "Field is not exist.");
        control(isElementExist(By.xpath("//span[contains(text(),'" + fieldNameTwo + "')]")), fieldNameTwo + "Field is exist.", "ERROR:" + fieldNameTwo + "Field is not exist.");
        control(isElementExist(By.xpath("//span[contains(text(),'" + fieldNameThree + "')]")), fieldNameThree + "Field is exist.", "ERROR:" + fieldNameThree + "Field is not exist.");
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        return this;
    }

    public CreateCorporateCustomerPage controlBillMediaFieldInvoiceTab(String fieldNameOne, String fieldNameTwo, String fieldNameThree) throws InterruptedException, AWTException {
        log.info("Bill Media Field is checking.");
        clickJS(cmbBillMediaForInvoiceAccount);
        //control(isElementExist(By.xpath("//span[contains(text(),'" + fieldNameOne + "')]")), fieldNameOne + "Field is exist.", "ERROR:" + fieldNameOne + "Field is not exist.");
        control(isElementExist(By.xpath("//span[contains(text(),'" + fieldNameTwo + "')]")), fieldNameTwo + "Field is exist.", "ERROR:" + fieldNameTwo + "Field is not exist.");
        control(isElementExist(By.xpath("//span[contains(text(),'" + fieldNameThree + "')]")), fieldNameThree + "Field is exist.", "ERROR:" + fieldNameThree + "Field is not exist.");
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        return this;
    }

    public CreateCorporateCustomerPage controlPaymentTypeField(String fieldNameOne, String fieldNameTwo) throws AWTException, InterruptedException {
        log.info("Payment Type Field is checking.");
        control(isElementExist(By.xpath("//*[contains(text(),'" + fieldNameOne + "')]")), fieldNameOne + "Title is exist.", "ERROR:" + fieldNameOne + "Title is not exist.");
        control(isElementExist(By.xpath("//*[contains(text(),'" + fieldNameTwo + "')]")), fieldNameTwo + "Title is exist.", "ERROR:" + fieldNameTwo + "Title is not exist.");
        return this;
    }

    public CreateCorporateCustomerPage controlPaymentMethodField(String fieldNameOne, String fieldNameTwo) throws InterruptedException, AWTException {
        log.info("Payment Method Field is checking.");
        clickJS(cmbPaymentMethod);
        control(isElementExist(By.xpath("//span[contains(text(),'" + fieldNameOne + "')]")), fieldNameOne + "Field is exist.", "ERROR:" + fieldNameOne + "Field is not exist.");
        control(isElementExist(By.xpath("//span[contains(text(),'" + fieldNameTwo + "')]")), fieldNameTwo + "Field is exist.", "ERROR:" + fieldNameTwo + "Field is not exist.");
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        return this;
    }

    public CreateCorporateCustomerPage clickIssuingDateCloseButton() throws InterruptedException {
        clickJS(findElements(btnBirthDateClose).get(4));
        log.info("Issuing Date Close Button clicked.");
        return this;
    }

    public CreateCorporateCustomerPage controlAdminInformationFieldTwo(String fieldName) throws InterruptedException {
        Thread.sleep(1000);
        log.info(fieldName + "Field is checking.");
        switch (fieldName) {
            case "Country Code":
                //control(isElementExist(By.cssSelector("[formcontrolname='phoneCodeMobile']")), fieldName + "Field is exist.", "ERROR:" + fieldName + "Field is not exist.");
                control(isElementExist(By.cssSelector("[formcontrolname='phoneCode']")), fieldName + "Field is exist.", "ERROR:" + fieldName + "Field is not exist.");
                break;
            case "+355":
                control(isElementExist(By.xpath("//span[contains(text(),'+355')]")), fieldName + "Field is exist.", "ERROR:" + fieldName + "Field is not exist.");
                break;
            default:
                //code block
        }
        return this;
    }

    public CreateCorporateCustomerPage enterDocumentFileGeneral() throws InterruptedException, AWTException {
        Thread.sleep(5000);
        List<WebElement> elementList = findElements(btnAddNewDocument);
        elementList.get(0).click();
        String path = System.getProperty("user.dir") + "\\document.jpg";
        uploadFile(txtFileInputGeneral, path);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        return this;
    }

    public CreateCorporateCustomerPage selectDocumentTypeGeneral(String documentType) throws InterruptedException {
        List<WebElement> elementList = findElements(cmbDocumentType);
        log.info("Select Document Type:" + documentType);
        selectMatComboboxJS(elementList.get(0), documentType.toUpperCase());
        return this;
    }

    public CreateCorporateCustomerPage enterIssuingDateGeneral(String issuingDate) throws InterruptedException {
        List<WebElement> elementList = findElements(pcrIdentificationIssuingDate);
        elementList.get(0).clear();
        log.info("Issuing Date:" + issuingDate);
        elementList.get(0).sendKeys(issuingDate);
        return this;
    }

    public CreateCorporateCustomerPage selectCorporateCountryPhoneCode(String countryPhoneCode) throws InterruptedException {
        //List<WebElement> elementList = findElements(cmbCorporatePhoneCode);
        selectMatComboboxJS(cmbCorporatePhoneCode, countryPhoneCode);
        return this;
    }

    public CreateCorporateCustomerPage selectCorporateWorkCountryPhoneCode(String countryWorkPhoneCode) throws InterruptedException {
        selectMatComboboxJS(cmbCorporatePhoneWork, countryWorkPhoneCode);
        log.info("Select Phone Code Work:" + countryWorkPhoneCode);
        return this;
    }

    public CreateCorporateCustomerPage enterWorkPhoneNumber(String workPhoneNumber) throws InterruptedException, AWTException {
        Thread.sleep(1000);
        getWebDriver().findElement(txtWorkNumber).clear();
        sendKeys(txtWorkNumber, workPhoneNumber, false);
        log.info("Mobile Number:" + workPhoneNumber);
        if (workPhoneNumber.equals("")) {
            sendKeys(txtWorkNumber, "A", false);
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_BACK_SPACE);
            robot.keyRelease(KeyEvent.VK_BACK_SPACE);
        }
        return this;
    }

    public CreateCorporateCustomerPage controlCurrencyPrepaidField(String fieldNameOne, String fieldNameTwo, String fieldNameThree) throws InterruptedException, AWTException {
        log.info("Currency Prepaid Field is checking.");
        clickJS(cmbCurrencyPrepaid);
        control(isElementExist(By.xpath("//span[contains(text(),'" + fieldNameOne + "')]")), fieldNameOne + "Field is exist.", "ERROR:" + fieldNameOne + "Field is not exist.");
        control(isElementExist(By.xpath("//span[contains(text(),'" + fieldNameTwo + "')]")), fieldNameTwo + "Field is exist.", "ERROR:" + fieldNameTwo + "Field is not exist.");
        control(isElementExist(By.xpath("//span[contains(text(),'" + fieldNameThree + "')]")), fieldNameThree + "Field is exist.", "ERROR:" + fieldNameThree + "Field is not exist.");
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        return this;
    }

    public CreateCorporateCustomerPage selectCurrencyPrepaid(String currencyPrepaid) throws InterruptedException {
        selectMatComboboxJS(cmbCurrencyPrepaid, currencyPrepaid);
        log.info("Select Currency Prepaid:" + currencyPrepaid);
        return this;
    }

    public CreateCorporateCustomerPage enterDescriptionPrepaid(String description) throws InterruptedException {
        sendKeys(txtDescriptionPrepaid, description);
        log.info("Enter Description Prepaid:" + description);
        return this;
    }

    public CreateCorporateCustomerPage selectCustomerType(String customerType) throws InterruptedException {
        selectMatComboboxJS(cmbCustomerType, customerType);
        log.info("Select Customer Type:" + customerType);
        return this;
    }

    public CreateCorporateCustomerPage selectSegment(String segment) throws InterruptedException {
        Thread.sleep(2500);
        selectMatComboboxJS(cmbSegment, segment);
        log.info("Select Segment:" + segment);
        return this;
    }

    public CreateCorporateCustomerPage controlSegmentField(String titleOne, String titleTwo, String titleThree, String titleFour, String titleFive, String titleSix, String titleSeven) throws InterruptedException, AWTException {
        log.info("Segment Field Title is checking.");
        clickJS(cmbSegment);
        Thread.sleep(1000);
        //control(isElementExist(By.xpath("//*[contains(text(),'" + titleOne + "')][@class='mat-option-text']")), titleOne + "Title is exist.", "ERROR:" + titleOne + "Title is not exist.");
        //control(isElementExist(By.xpath("//*[contains(text(),'" + titleTwo + "')][@class='mat-option-text']")), titleTwo + "Title is exist.", "ERROR:" + titleTwo + "Title is not exist.");
        control(isElementExist(By.xpath("//*[contains(text(),'" + titleThree + "')][@class='mat-option-text']")), titleThree + "Title is exist.", "ERROR:" + titleThree + "Title is not exist.");
        //control(isElementExist(By.xpath("//*[contains(text(),'" + titleFour + "')][@class='mat-option-text']")), titleFour + "Title is exist.", "ERROR:" + titleFour + "Title is not exist.");
        control(isElementExist(By.xpath("//*[contains(text(),'" + titleFive + "')][@class='mat-option-text']")), titleFive + "Title is exist.", "ERROR:" + titleFive + "Title is not exist.");
        control(isElementExist(By.xpath("//*[contains(text(),'" + titleSix + "')][@class='mat-option-text']")), titleSix + "Title is exist.", "ERROR:" + titleSix + "Title is not exist.");
        //control(isElementExist(By.xpath("//*[contains(text(),'" + titleSeven + "')][@class='mat-option-text']")), titleSeven + "Title is exist.", "ERROR:" + titleSeven + "Title is not exist.");
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        return this;
    }

    public CreateCorporateCustomerPage controlJuridicalInfoFieldValue(String expectedValue) {
        log.info("Juridical Info Field Value is checking.");
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) getWebDriver();
        String incomingValue = javascriptExecutor.executeScript("return document.querySelector('[formcontrolname=juridicalInfo]').value").toString();
        log.info("Expected Value:" + expectedValue.toUpperCase());
        log.info("Incoming Value:" + incomingValue);
        control(incomingValue.contains(expectedValue.toUpperCase()), "Juricidal Info Field Value is successfully", "ERROR: Juricidal Info Field Value is not successfully");
        return this;
    }

    public CreateCorporateCustomerPage enterDocumentFileForOneAddDocumentButton() throws AWTException, InterruptedException {
        Thread.sleep(3000);
        clickJS(btnAddNewDocument);
        log.info("Add Document File Button clicked.");

        String path = System.getProperty("user.dir") + "\\document.jpg";

        uploadFile(txtFileInput, path);

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        return this;
    }

    public CreateCorporateCustomerPage clickCancelFileButtonForGeneralInformationTab() throws InterruptedException {
        Thread.sleep(8000);
        List<WebElement> elementList = findElements(btnCancelFileTwo);
        clickJS(elementList.get(1));
        log.info("Cancel File Button For General Information Tab clicked.");
        return this;
    }

    public CreateCorporateCustomerPage enterDocumentFileGeneralForPngFile() throws InterruptedException, AWTException {
        Thread.sleep(5000);
        List<WebElement> elementList = findElements(btnAddNewDocument);
        elementList.get(0).click();
        String path = System.getProperty("user.dir") + "\\document_1.png";
        uploadFile(txtFileInputGeneral, path);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        return this;
    }

    public CreateCorporateCustomerPage enterDocumentFileGeneralForPdfFile() throws InterruptedException, AWTException {
        Thread.sleep(5000);
        List<WebElement> elementList = findElements(btnAddNewDocument);
        elementList.get(0).click();
        String path = System.getProperty("user.dir") + "\\document_1.pdf";
        uploadFile(txtFileInputGeneral, path);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        return this;
    }

    public CreateCorporateCustomerPage enterDocumentFileGeneralForThan5MB() throws AWTException, InterruptedException {
        Thread.sleep(5000);
        List<WebElement> elementList = findElements(btnAddNewDocument);
        elementList.get(0).click();
        String path = System.getProperty("user.dir") + "\\document_2.jpg";
        uploadFile(txtFileInputGeneral, path);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        return this;
    }

    public CreateCorporateCustomerPage enterDocumentFileGeneralForThan5MBPngFile() throws AWTException, InterruptedException {
        Thread.sleep(5000);
        List<WebElement> elementList = findElements(btnAddNewDocument);
        elementList.get(0).click();
        String path = System.getProperty("user.dir") + "\\document_2.png";
        uploadFile(txtFileInputGeneral, path);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        return this;
    }

    public CreateCorporateCustomerPage enterDocumentFileGeneralForTxtFile() throws AWTException, InterruptedException {
        Thread.sleep(5000);
        List<WebElement> elementList = findElements(btnAddNewDocument);
        elementList.get(0).click();
        String path = System.getProperty("user.dir") + "\\selenium-waitModal.txt";
        uploadFile(txtFileInputGeneral, path);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        return this;
    }

    public CreateCorporateCustomerPage enterDocumentFileGeneralForThan5MBPdfFile() throws AWTException, InterruptedException {
        Thread.sleep(5000);
        List<WebElement> elementList = findElements(btnAddNewDocument);
        elementList.get(0).click();
        String path = System.getProperty("user.dir") + "\\document_2.pdf";
        uploadFile(txtFileInputGeneral, path);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        return this;
    }

    public CreateCorporateCustomerPage controlPlaceOfBirthDropdownListValue() throws InterruptedException, AWTException {
        log.info("Place Of Birth Dropdown List Value is checking.");
        clickJS(cmbPlaceOfBirth);
        Thread.sleep(500);
        String placeOfBirthListValue = "Bajram Curri,Bajze,Ballsh,Berat,Bilisht,Bulqize,Burrel," +
                "Cerrik,Corovode,Delvine,Divjake,Durres,Elbasan,Erseke,Fier,Fierze,Finiq,Fushe Arrez,Fushe Kruje," +
                "Gjirokaster,Gramsh,Himare,Kamez,Kavaje,Kelcyre,Klos,Konispol,Koplik,Korce,Kraste,Krrabe,Kruje,Krume,Kucove,Kukes,Kurbnesh," +
                "Lac,Leskovik,Lezhe,Libohove,Librazhd,Lushnje,Maliq,Mamurras,Manez,Memaliaj,Milot,Orikum,Patos,Peqin," +
                "Permet,Peshkopi,Pogradec,Polican,Prrenjas,Puke,Reps,Roskovec,Rreshen,Rrogozhine,Rubik,Sarande,Selenice," +
                "Shengjin,Shijak,Shkoder,Sukth,Tepelene,Tirane,Ulez,Ura Vajgurore,Vau i Dejes,Vlore,Vore,Diber,Other,Golem,Luz,Luz.S,Velipoje";

        String[] placeOfBirthList = placeOfBirthListValue.split(",");

        for (int i = 0; i < placeOfBirthList.length; i++) {

            control(isElementExist(By.xpath("//*[contains(text(),'" + placeOfBirthList[i].toUpperCase().replace("İ", "I") + "')]")), placeOfBirthList[i] + " field is exist.", "ERROR:" + placeOfBirthList[i] + " field is not exist.");
        }

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);

        return this;

    }

    public CreateCorporateCustomerPage controlAddressCityDropdownListValue() throws AWTException, InterruptedException {
        log.info("Address City Dropdown List Value is checking.");
        clickJS(cmbCity);
        Thread.sleep(500);
        String placeOfBirthListValue = "Bajram Curri,Bajze,Ballsh,Berat,Bilisht,Bulqize,Burrel," +
                "Cerrik,Corovode,Delvine,Divjake,Durres,Elbasan,Erseke,Fier,Fierze,Finiq,Fushe Arrez,Fushe Kruje," +
                "Gjirokaster,Gramsh,Himare,Kamez,Kavaje,Kelcyre,Klos,Konispol,Koplik,Korce,Kraste,Krrabe,Kruje,Krume,Kucove,Kukes,Kurbnesh," +
                "Lac,Leskovik,Lezhe,Libohove,Librazhd,Lushnje,Maliq,Mamurras,Manez,Memaliaj,Milot,Orikum,Patos,Peqin," +
                "Permet,Peshkopi,Pogradec,Polican,Prrenjas,Puke,Reps,Roskovec,Rreshen,Rrogozhine,Rubik,Sarande,Selenice," +
                "Shengjin,Shijak,Shkoder,Sukth,Tepelene,Tirane,Ulez,Ura Vajgurore,Vau i Dejes,Vlore,Vore,Diber,Other,Golem,Luz,Luz.S,Velipoje";

        String[] placeOfBirthList = placeOfBirthListValue.split(",");

        for (int i = 0; i < placeOfBirthList.length; i++) {

            control(isElementExist(By.xpath("//*[contains(text(),'" + placeOfBirthList[i].toUpperCase().replace("İ", "I") + "')]")), placeOfBirthList[i] + " field is exist.", "ERROR:" + placeOfBirthList[i] + " field is not exist.");
        }

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);

        return this;
    }

    public CreateCorporateCustomerPage controlTaxExemptionFieldValue() {
        log.info("Tax Exemption Field Value is checking.");
        control(isElementExist(By.xpath("//mat-select[@formcontrolname='taxExempt']//span[contains(text(),'NO')]")), "Tax Exemption field value is successfully.", "ERROR: Tax Exemption field value is not successfully.");
        return this;
    }

    public CreateCorporateCustomerPage clickNextButtonInvoiceInformation() throws InterruptedException {
        Thread.sleep(1000);
        clickJS(findElements(By.xpath("//span[contains(text(),'Next')]")).get(4));
        log.info("Next Button For Other Information clicked.");
        return this;
    }

    public CreateCorporateCustomerPage enterEmailForGeneralInformation(String email) throws InterruptedException {
        sendKeys(txtEmailGeneralTab, email);
        log.info("Enter Email For General Tab " + email);
        return this;
    }

    public CreateCorporateCustomerPage enterMobileNumberForGeneralTab(String mobileNumber) throws InterruptedException {
        sendKeys(txtMobileNumberGeneralTab, mobileNumber);
        log.info("Enter Mobile Number " + mobileNumber);
        return this;
    }

    public CreateCorporateCustomerPage clickSendPinButton() throws InterruptedException {
        Thread.sleep(1000);
        clickJS(By.xpath("//*[contains(text(),'Send Pin')]"));
        log.info("Send Pin Button clicked.");
        return this;
    }

    public CreateCorporateCustomerPage enterPinValue(String pinValue) throws InterruptedException {
        Thread.sleep(2000);

        if (pinValue.equals("0000")) {
            sendKeys(txtPinValue, pinValue);
        }

        Logs logs = getWebDriver().manage().logs();
        LogEntries logEntries = logs.get(LogType.BROWSER);

        for (LogEntry logEntry : logEntries) {
            if (logEntry.getMessage().contains("created")) {
                pinValue = logEntry.getMessage().trim().split("created")[1].split(" ")[1];
            }
        }


        sendKeys(txtPinValue, pinValue);
        log.info("Enter Pin Code:" + pinValue);
        Thread.sleep(500);
        return this;
    }

    public CreateCorporateCustomerPage clickValidatePinButton() throws InterruptedException {
        Thread.sleep(1000);
        clickJS(By.xpath("//*[contains(text(),'Validate Pin')]"));
        log.info("Validate Pin Button clicked.");
        return this;
    }

    public CreateCorporateCustomerPage clickSendPinButtonForAdminTab() throws InterruptedException {
        Thread.sleep(1000);
        clickJS(By.xpath("//app-corporate-customer-admin//*[contains(text(),'Send Pin')]"));
        log.info("Send Pin Button clicked.");
        return this;
    }

    public CreateCorporateCustomerPage enterPinValueForAdminTab(String pinValue) throws InterruptedException {
        Thread.sleep(2000);

        if (pinValue.equals("0000")) {
            sendKeys(txtPinValueForAdminTab, pinValue);
        }

        Logs logs = getWebDriver().manage().logs();
        LogEntries logEntries = logs.get(LogType.BROWSER);

        for (LogEntry logEntry : logEntries) {
            if (logEntry.getMessage().contains("created")) {
                pinValue = logEntry.getMessage().trim().split("created")[1].split(" ")[1];
            }
        }


        sendKeys(txtPinValueForAdminTab, pinValue);
        log.info("Enter Pin Code:" + pinValue);
        Thread.sleep(500);
        return this;
    }

    public CreateCorporateCustomerPage clickValidatePinButtonForAdminTab() throws InterruptedException {
        Thread.sleep(1000);
        clickJS(By.xpath("//*[contains(text(),'Validate Pin')]"));
        log.info("Validate Pin Button clicked.");
        return this;
    }

    public CreateCorporateCustomerPage clickNextButtonForContacInformation() throws InterruptedException {
        Thread.sleep(7000);
        List<WebElement> elementList = findElements(btnNext);
        clickJS(elementList.get(2));
        log.info("Next button clicked in the Admin Information page.");
        return this;
    }

    public CreateCorporateCustomerPage clickNextButtonForOtherInformation() throws InterruptedException {
        Thread.sleep(2000);
        List<WebElement> elementList = findElements(btnNext);
        clickJS(elementList.get(5));
        log.info("Next button clicked in the Admin Information page.");
        return this;
    }

    public CreateCorporateCustomerPage clickContactInformation() throws InterruptedException {
        Thread.sleep(1000);
        clickJS(By.xpath("//*[contains(text(),'Contact Information')]"));
        log.info("Contact Information clicked.");
        return this;
    }

    public CreateCorporateCustomerPage enterMobileNumberForContactTab(String mobileNumber) throws InterruptedException {
        Thread.sleep(1000);
        findElements(By.cssSelector("[formcontrolname='phoneNumber']")).get(2).sendKeys(mobileNumber);
        log.info("Enter Mobile Number " + mobileNumber);
        return this;
    }

    public CreateCorporateCustomerPage enterEmailForContactTab(String email) throws InterruptedException {
        Thread.sleep(1000);
        findElements(By.cssSelector("[formcontrolname='email']")).get(2).sendKeys(email);
        log.info("Enter Email " + email);
        return this;
    }
}
