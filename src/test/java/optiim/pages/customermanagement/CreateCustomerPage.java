package optiim.pages.customermanagement;

import optiim.framework.core.PageBase;
import optiim.framework.helpers.WebDriverHelper;
import optiim.framework.helpers.WorldHelper;
import optiim.framework.utils.log;
import optiim.models.data.gui.customermanegement.CreateCustomerForeignerData;
import optiim.models.data.gui.customermanegement.CreateCustomerResidentialData;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.Logs;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class CreateCustomerPage extends PageBase {

    public static final By txtNewCustomer = By.xpath("//div[contains(@class,'h2')]");
    public static final By txtIdentification = By.cssSelector("[name='personalNumber']");
    public static final By txtIdentificationInvalid = By.cssSelector("[name='personalNumber'][class*='ng-invalid']");
    public static final By txtIdentificationDeactive = By.cssSelector("[formcontrolname='personalNumber'][aria-required='false']");
    //public static final By txtNewCustomerOption = By.xpath("//div[@id='mat-autocomplete-0']/mat-option[1]");
    public static final By iconValidTab = By.xpath("//mat-icon[contains(text(),'create')]");
    public static final By btnSearchIdentification = By.cssSelector("[ng-reflect-message='Detail']");
    public static final By btnNext = By.xpath("//span[contains(text(),'Next')]//parent::span//parent::button");
    public static final By txtFirstName = By.cssSelector("[formcontrolname='firstName']");
    public static final By txtFirstNameInvalid = By.cssSelector("[formcontrolname='firstName'][class*='ng-invalid']");
    public static final By txtLastName = By.cssSelector("[formcontrolname='lastName']");
    public static final By txtLastNameInvalid = By.cssSelector("[formcontrolname='firstName'][class*='ng-invalid']");
    public static final By txtSecondaryName = By.cssSelector("[formcontrolname='secondaryName']");
    public static final By txtSecondaryNameInvalid = By.cssSelector("[formcontrolname='firstName'][class*='ng-invalid']");
    public static final By txtEmail = By.cssSelector("[formcontrolname='email']");
    public static final By txtEmailValid = By.cssSelector("[formcontrolname='email'][class*='ng-valid']");
    public static final By txtEmailInvalid = By.cssSelector("[formcontrolname='email'][class*='ng-invalid']");
    public static final By pcrBirthDate = By.cssSelector("[formcontrolname='birthDate']");
    public static final By pcrBirthDateClose = By.xpath("//mat-icon[contains(text(),'close')]");
    public static final By pcrBirthDateInvalid = By.cssSelector("[formcontrolname='birthDate'][class*='ng-invalid']");
    public static final By pcrBirthDatevalid = By.cssSelector("[formcontrolname='birthDate'][class*='ng-valid']");
    public static final By cmbGender = By.cssSelector("[formcontrolname='gender']");
    public static final By cmbGenderInvalid = By.cssSelector("[formcontrolname='email'][class*='ng-invalid']");
    public static final By cmbCountryOfBirth = By.cssSelector("[formcontrolname='birthCountry']");
    public static final By cmbCountryOfBirthInvalid = By.cssSelector("[formcontrolname='email'][class*='ng-invalid']");
    public static final By cmbPlaceOfBirth = By.cssSelector("[formcontrolname='placeOfBirth']");
    public static final By cmbPlaceOfBirthInvalid = By.cssSelector("[formcontrolname='email'][class*='ng-invalid']");
    public static final By cmbCitizenship = By.cssSelector("[formcontrolname='citizenShip']");
    public static final By cmbCitizenshipInvalid = By.cssSelector("[formcontrolname='email'][class*='ng-invalid']");
    public static final By txtMobileNumber = By.cssSelector("[formcontrolname='phoneNumber']");
    public static final By txtMobileNumberInvalid = By.cssSelector("[formcontrolname='phoneNumber'][class*='ng-invalid']");
    public static final By cmbDocumentType = By.cssSelector("[formcontrolname='authDocType']");
    public static final By cmbDocumentTypeInvalid = By.cssSelector("[formcontrolname='email'][class*='ng-invalid']");
    public static final By txtAddressLineOne = By.cssSelector("[formcontrolname='street1']");
    public static final By txtAddressLineOneInValid = By.cssSelector("[formcontrolname='street1'][class*='ng-invalid']");
    public static final By txtAddressLineTwo = By.cssSelector("[formcontrolname='street2']");
    public static final By txtAddressLineTwoInValid = By.cssSelector("[formcontrolname='street2'][class*='ng-invalid']");
    public static final By cmbCountry = By.cssSelector("[formcontrolname='country']");
    public static final By cmbCountryInvalid = By.cssSelector("[formcontrolname='email'][class*='ng-invalid']");
    public static final By cmbCity = By.cssSelector("[formcontrolname='city']");
    public static final By cmbCityInValid = By.cssSelector("[formcontrolname='city'][class*='ng-invalid']");
    public static final By btnAddNewMedium = By.xpath("//mat-card-header/aside[1]/button[1]");
    public static final By titleNewMediumContact = By.xpath("//h3[contains(text(),'New Contact Medium')]");
    public static final By btnNewMediumContactBlankPanel = By.xpath("//mat-expansion-panel-header/span[1]");
    public static final By cmbMediumType = By.cssSelector("[formcontrolname='mediumType'][role='listbox']");
    public static final By cmbMediumTypeInvalid = By.cssSelector("[formcontrolname='mediumType'][role='listbox'][class*='ng-invalid']");
    public static final By cmbContactType = By.cssSelector("[formcontrolname='contactType'][role='listbox']");
    public static final By cmbContactTypeInvalid = By.cssSelector("[formcontrolname='contactType'][role='listbox'][class*='ng-invalid']");
    //public static final By txtTelephoneNumber = By.cssSelector("[formcontrolname='phoneNumber']");
    public static final By txtEmailAddressContactMediumPanel = By.cssSelector("[formcontrolname='emailAddress']");
    public static final By txtEmailAddressContactMediumInvalid = By.cssSelector("[formcontrolname='emailAddress'][class*='ng-invalid']");
    public static final By btnDeleteMediumContact = By.xpath("//mat-icon[contains(text(),'delete')]");
    public static final By tabAddressInformation = By.xpath("//div[contains(text(),'Address Information')]");
    public static final By tabGeneralInformation = By.xpath("//div[contains(text(),'General Information')]");
    public static final By tabContactInformation = By.xpath("//div[contains(text(),'Contact Information')]");
    public static final By cmbAuthorizationType = By.cssSelector("[formcontrolname='PartyRole']");
    public static final By cmbAuthorizationTypeInvalid = By.cssSelector("[formcontrolname='PartyRole'][class*='ng-invalid']");
    //public static final By cmbAuthorizationTypeInvali = By.cssSelector("[formcontrolname='email'][class*='ng-invalid']");
    public static final By txtfirstNameContactInformationTab = By.cssSelector("[formcontrolname='GivenName']");
    public static final By txtfirstNameContactInformationInvalid = By.cssSelector("[formcontrolname='GivenName'][class*='ng-invalid']");
    public static final By txtlastNameContactInformationTab = By.cssSelector("[formcontrolname='FamilyName']");
    public static final By txtlastNameContactInformationInvalid = By.cssSelector("[formcontrolname='FamilyName'][class*='ng-invalid']");
    public static final By txtpersonalNumberContactInformationTab = By.cssSelector("[formcontrolname='IdentificationId']");
    public static final By txtpersonalNumberContactInformationInvalid = By.cssSelector("[formcontrolname='IdentificationId'][class*='ng-invalid']");
    public static final By cmbDocumentTypeContactInformationTab = By.cssSelector("[formcontrolname='authDocType']");
    public static final By cmbDocumentTypeContactInformationInvalid = By.cssSelector("[formcontrolname='authDocType'][class*='ng-invalid']");
    public static final By btnAdd = By.xpath("//span[contains(text(),'Save')]");
    public static final By btnSave = By.cssSelector("[class*='save-product-button']");
    //public static final By alertPopupMessage = By.tagName("simple-snack-bar");
    //public static final By btnSaveInvalid = By.cssSelector("[class*='save-product-button'][disabled='true']");
    public static final By btnSaveInvalid = By.xpath("//button[@disabled='true']//span[contains(text(),'Save')]");
    public static final By btnAddInvalid = By.cssSelector("[class*='save-product-button'][disabled='true']");
    public static final By titleCustomerOption = By.cssSelector("[role='option']");
    public static final By titleCustomerOptionContactInformation = By.cssSelector("[class*='mat-option'][role='option']");
    public static final By pcrIdentificationIssuingDate = By.cssSelector("[formcontrolname='identificationIssuingDate']");
    public static final By pcrIdentificationIssuingDateInvalid = By.cssSelector("[formcontrolname='identificationIssuingDate'][class*=ng-invalid]");
    public static final By btnAddNewDocument = By.xpath("//mat-icon[contains(text(),'add')]");
    public static final By txtFileInput = By.cssSelector("[id='fileInput']");
    public static final By txtDocumentNumber = By.cssSelector("[formcontrolname='documentNumber']");
    public static final By txtDocumentNumberInvalid = By.cssSelector("[formcontrolname='documentNumber'][class*=ng-invalid]");
    public static final By btnCancelFile = By.xpath("//mat-icon[contains(text(),'cancel')]");
    public static final By titleFileDeleteMessage = By.xpath("//mat-error");
    public static final By chkServiceAddress = By.cssSelector("[formcontrolname='hasServiceAddress']");
    public static final By txtServiceAddressMediumType = By.cssSelector("[formcontrolname='serviceMediumType']");
    public static final By txtServiceAddressContactType = By.cssSelector("[formcontrolname='serviceContactType']");
    public static final By txtServiceAddressLineOne = By.cssSelector("[formcontrolname='serviceStreet1']");
    public static final By txtServiceAddressLineOneInvalid = By.cssSelector("[formcontrolname='serviceStreet1'][class*=ng-invalid]");
    public static final By txtServiceAddressLineTwo = By.cssSelector("[formcontrolname='serviceStreet2']");
    public static final By cmbServiceAddressCountry = By.cssSelector("[formcontrolname='serviceCountry']");
    public static final By cmbServiceAddressCity = By.cssSelector("[formcontrolname='serviceCity']");
    public static final By cmbServiceAddressCityInvalid = By.cssSelector("[formcontrolname='serviceStreet1'][class*=ng-invalid]");
    public static final By iconGenderFemale = By.xpath("//span[contains(text(),'\uD83D\uDC69 FEMALE')]");
    public static final By iconGenderMale = By.xpath("//span[contains(text(),'\uD83D\uDC68 MALE')]");
    public static final By btnOpenCalender = By.cssSelector("[aria-label='Open calendar']");
    public static final By btnCalenderMonthYear = By.cssSelector("[aria-label='Choose month and year']");
    public static final By btnCalender1992Year = By.xpath("//div[contains(text(),'1992')]");
    public static final By btnCalenderMoth = By.xpath("//div[contains(text(),'JUN')]");
    public static final By btnCalenderDay = By.xpath("//td[@aria-label='2 June 1992']");
    public static final By cmbPhoneCode = By.cssSelector("[formcontrolname='phoneCode']");
    public static final By cmbContactPhoneCode = By.xpath("//mat-select[@id='mat-select-12']");
    public static final By cmbSegment = By.cssSelector("[formcontrolname='segment']");
    public static final By btnSendPin = By.xpath("//*[contains(text(),'Send Pin')]");
    public static final By txtPinCode = By.cssSelector("input[formcontrolname='phoneValidation']");
    public static final By btnValidatePin = By.xpath("//*[contains(text(),'Validate Pin')]");
    public static final By btnDisability = By.cssSelector("app-individual-disability [class='mat-slide-toggle-bar']");
    public static final By txtDisabledOrganization = By.cssSelector("[formcontrolname='disabledOrganization']");
    public static final By cmbDisabledType = By.cssSelector("[formcontrolname='disabilityType']");
    public static final By cmbDisabledTypeInvalid = By.cssSelector("[formcontrolname='disabilityType'][class*='ng-invalid']");
    public static final By cmbContractType = By.cssSelector("[formcontrolname='contractType']");
    public static final By cmbContractTypeInvalid = By.cssSelector("[formcontrolname='contractType'][class*='ng-invalid']");
    public static final By cmbPreferredCommunicationMethod = By.cssSelector("[formcontrolname='preferredCommunicationMethod']");
    public static final By cmbPreferredCommunicationMethodInvalid = By.cssSelector("[formcontrolname='preferredCommunicationMethod'][class*='ng-invalid']");
    public static final By cmbDocumentTypeOtherInformationTab = By.cssSelector("[formcontrolname='consentDocType']");
    public static final By btnAddDocumentFile = By.xpath("//button[@aria-label='Add Document']");
    public static final By txtFileInputOtherInformationTab = By.xpath("//div//input[@type='file']");
    public static final By btnGenerateForm = By.xpath("//span[contains(text(),'Generate Form')]");
    public static final By txtFixPhoneNumber = By.cssSelector("[formcontrolname='fixPhoneNumber']");
    public static final By txtFixPhoneNumberInvalid = By.cssSelector("[formcontrolname='fixPhoneNumber'][class*='ng-invalid']");
    public static final By btnDocumentView = By.xpath("//mat-icon[contains(text(),'visibility')]");
    public static final By cmbCreditCard = By.cssSelector("[formcontrolname='creditRatingForPostpaid']");
    public static final By cmbCreditRatingForPrepaid = By.cssSelector("[formcontrolname='creditRatingForPostpaid']");


    private final WorldHelper worldHelper;

    public CreateCustomerPage(WebDriverHelper webDriverHelper, WorldHelper worldHelper) {
        super(webDriverHelper);
        this.worldHelper = worldHelper;
    }


    public CreateCustomerPage controlNewCustomerPage(String message) throws InterruptedException {
        Thread.sleep(2500);
        control(isElementExist(By.xpath("//*[contains(text(),'" + message + "')]")), "New Customer Page Opened.", "ERROR:New Customer Page could not be opened.");
        return this;
    }

    public CreateCustomerPage controlSearchTab() throws InterruptedException {
        control((isElementExist(iconValidTab) && isElementExist(txtIdentification)), "Search Tab opened..", "ERROR:Search Tab could not be opened.");
        return this;
    }

    public CreateCustomerPage clickTab(String tabName) throws InterruptedException {
        clickJS(By.xpath("//div[contains(text(),'" + tabName + "')]"));
        log.info(tabName + " " + "clicked.");
        return this;
    }

    public CreateCustomerPage   enterIdentificationNumber(String identificationNumber) throws InterruptedException {
        Thread.sleep(2000);
        String newNumber = "";
        if (identificationNumber.contains("C")) {

            String letter1 = "J20602";
            String number = RandomStringUtils.randomNumeric(3);
            String letter2 = RandomStringUtils.random(1, "ABCDEFGHIJKLMNOPQRSTUVW");
            newNumber = "" + letter1 + number + letter2;
            worldHelper.setIdentificationNumberResidential(newNumber);
            log.info("Identification Number: " + newNumber);
            sendKeys(txtIdentification, newNumber, true);
        } else if (identificationNumber.contains("1")) {
//            String letter1 = "J20602";
            String number = RandomStringUtils.randomNumeric(10);
//            String letter2 = RandomStringUtils.random(1, "ABCDEFGHIJKLMNOPQRSTUVW");
//            newNumber = "" + letter1 + number + letter2;
//            worldHelper.setIdentificationNumberForeigner(newNumber);
            log.info("Identification Number: " + number);
            sendKeys(txtIdentification, number, true);




        } else if (identificationNumber.contains("0")) {
            String letter1 = "J20602";
            String number = RandomStringUtils.randomNumeric(3);
            String letter2 = RandomStringUtils.random(1, "ABCDEFGHIJKLMNOPQRSTUVW");
            newNumber = "" + letter1 + number + letter2;
            worldHelper.setIdentificationNumberForeigner(newNumber);
            log.info("Identification Number: " + newNumber);
            sendKeys(txtIdentification, newNumber, false);
        } else {
            sendKeys(txtIdentification, identificationNumber, true);
        }

        return this;
    }

    public CreateCustomerPage clickSearchIdentificationButton() throws InterruptedException {
        clickJS(btnSearchIdentification);
        //List<WebElement> elementList = findElements(titleCustomerOption);
        //clickJS(elementList.get(1));
        Thread.sleep(500);
        clickJS(titleCustomerOption);
        log.info("Search Identification Button clicked.");
        return this;
    }


    public CreateCustomerPage controlIdentificationDeactive() {
        control(isElementExist(txtIdentificationDeactive), "Identification deactive is exist.", "Identification deactive is not exist.");
        return this;
    }

    public CreateCustomerPage enterIdentificationNumberUpdateRegister(String identificationNumber) throws InterruptedException {
        identificationNumber = worldHelper.getNewCreateIndividualCustomerRequest().getPartyOperations().get(0).getValue().getIndividualIdentification().get(0).getIdentificationId();
        log.info("Identification Number: " + identificationNumber);
        sendKeys(txtIdentification, identificationNumber, false);
        return this;
    }

   /* public CreateCustomerPage controlNewCustomerOption() throws InterruptedException {

        String incomingMessage = getTextOfElement(txtNewCustomerOption);
        log.info("Incoming Message:" + incomingMessage);
        log.info("Expected Message: New Customer");
        control(incomingMessage.contains("New Customer"), "The new customer option was seen. ", "ERROR:\n" +
                "The new customer option was not seen.");
        return this;
    }

    public CreateCustomerPage clickNewCustomerOption() {
        click(txtNewCustomerOption);
        return this;
    }*/

    public CreateCustomerPage clickNextButton() throws InterruptedException {
        Thread.sleep(3000);
        List<WebElement> elementList = findElements(btnNext);
        clickJS(elementList.get(2));
        log.info("Next button clicked.");
        return this;
    }

    public CreateCustomerPage clickNextButtonSearchTab() throws InterruptedException {
        Thread.sleep(3000);
        List<WebElement> elementList = findElements(btnNext);
        clickJS(elementList.get(0));
        log.info("Next button clicked.");
        return this;
    }

    public CreateCustomerPage clickNextButtonn() throws InterruptedException {
        Thread.sleep(7000);
        List<WebElement> elementList = findElements(btnNext);
        //elementList.get(1).click();
        //JavascriptExecutor javascriptExecutor = (JavascriptExecutor) getWebDriver();
        //javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", elementList.get(1));
        clickJS(elementList.get(1));
        log.info("Next button clicked.");
        return this;
    }


    public CreateCustomerPage controlGeneralInformationTab() {
        control((isElementExist(iconValidTab) && isElementExist(txtSecondaryName)), "General Information Tab opened..", "ERROR:General Information Tab could not be opened.");
        return this;
    }

    public CreateCustomerPage enterFirstName(String firstName) throws InterruptedException {
        Thread.sleep(2500);
        log.info("First Name:" + firstName);
        sendKeys(txtFirstName, firstName, false);
        if (firstName.equals("")) {
            sendKeys(txtFirstName, "A");
            findElement(txtFirstName).sendKeys(Keys.BACK_SPACE);
        }
        return this;
    }


    public CreateCustomerPage enterLastName(String lastName) throws InterruptedException {
        log.info("Last Name:" + lastName);
        sendKeys(txtLastName, lastName, false);
        return this;
    }


    public CreateCustomerPage enterSecondaryName(String secondaryName) throws InterruptedException {
        log.info("Secondary Name:" + secondaryName);
        sendKeys(txtSecondaryName, secondaryName, false);
        return this;
    }


    public CreateCustomerPage enterEmail(String email) throws InterruptedException, AWTException {
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

    public CreateCustomerPage controlValueField(String value, String field) {

        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        log.info("Enter value:" + value);
        String expected = value.toUpperCase().replace('İ', 'I');
        log.info("Expected:" + expected);

        String incoming = null;

        switch (field) {
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
                incoming = js.executeScript("return document.querySelector('[formcontrolname=email]').value").toString();
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


    public CreateCustomerPage enterBirthDate(String birthDate) throws InterruptedException, AWTException {
        log.info("Birth Date:" + birthDate);
        switch (birthDate) {
            case "02061992":
                //clearText(pcrBirthDate);
                List<WebElement> elementList = findElements(btnOpenCalender);
                clickJS(elementList.get(0));
                Thread.sleep(500);
                clickJS(btnCalenderMonthYear);
                Thread.sleep(500);
                clickJS(btnCalender1992Year);
                Thread.sleep(500);
                clickJS(btnCalenderMoth);
                Thread.sleep(500);
                clickJS(btnCalenderDay);
                // sendKeys(pcrBirthDate, birthDate, false);
                Thread.sleep(2000);

                break;
            default:
                Thread.sleep(1500);
                sendKeys(pcrBirthDate, birthDate, false);
        }

        return this;
    }

    public CreateCustomerPage clickBirthDateCloseButton() throws InterruptedException {
        Thread.sleep(1500);
        List<WebElement> elementList = findElements(pcrBirthDateClose);
        clickJS(elementList.get(4));
        log.info("Clicked birth date close button.");
        Thread.sleep(500);
        return this;
    }

    public CreateCustomerPage controlAge() {
        control(isElementExist(pcrBirthDatevalid), " Accepts people over the age of 18.", "ERROR: Doesn't approve over the age of 18.");
        return this;
    }

    public CreateCustomerPage selectGender(String gender) throws InterruptedException {
        Thread.sleep(1500);
        selectMatComboboxJS(cmbGender, gender.toUpperCase());
        log.info("Gender:" + gender);
        return this;
    }

    /*public CreateCustomerPage controlCountryOfBirth(String cob) throws InterruptedException {

        return this;
    }*/

    public CreateCustomerPage selectPlaceOfBirth(String placeOfBirth) throws InterruptedException {
        log.info("Select Place Of Birth:" + placeOfBirth);
        selectMatComboboxJS(cmbPlaceOfBirth, placeOfBirth);
        return this;
    }

    public CreateCustomerPage enterPlaceOfBirth(String placeOfBirth) throws InterruptedException {
        log.info("Enter Place Of Birth:" + placeOfBirth);
        sendKeys(cmbPlaceOfBirth, placeOfBirth, false);
        return this;
    }

    public CreateCustomerPage selectCountryOfBirth(String countryOfBirth) throws InterruptedException {
        log.info("Country Of Birth:" + countryOfBirth);
        selectMatComboboxJS(cmbCountryOfBirth, countryOfBirth);
        return this;
    }

    public CreateCustomerPage selectCitizenship(String citizenship) throws InterruptedException {
        log.info("Citizenship:" + citizenship);
        selectMatComboboxJS(cmbCitizenship, citizenship);
        return this;
    }


    public CreateCustomerPage controlCitizenship(String citizenship) {
        control(isElementExist(By.xpath("//span[contains(text(),'" + citizenship + "')]")), "" +
                        "Country came default Albanian.",
                "ERROR: Country did not come default Albania.");
        return this;

    }


    public CreateCustomerPage enterMobileNumber(String mobileNumber) throws InterruptedException, AWTException {
        Thread.sleep(1500);
        getWebDriver().findElement(txtMobileNumber).clear();
        sendKeys(txtMobileNumber, mobileNumber, false);
        log.info("Mobile Number:" + mobileNumber);
        if (mobileNumber.equals("")) {
            getWebDriver().findElement(txtMobileNumber).clear();
            sendKeys(txtMobileNumber, "345", false);
            findElement(txtMobileNumber).sendKeys(Keys.BACK_SPACE);
        }

        return this;
    }


    public CreateCustomerPage selectDocumentType(String documentType) throws InterruptedException {
        log.info("Document Type:" + documentType);
        selectMatComboboxJS(cmbDocumentType, documentType.toUpperCase());
        return this;
    }

    public CreateCustomerPage controlAddressInformationTab() {
        //code block
        return this;
    }

    public CreateCustomerPage enterAddressLineOne(String addressLineOne) throws InterruptedException, AWTException {
        Thread.sleep(1500);
        getWebDriver().findElement(txtAddressLineOne).clear();
        log.info("AddressLineOne:" + addressLineOne);
        sendKeys(txtAddressLineOne, addressLineOne, false);
        if (addressLineOne.equals("")) {
            sendKeys(txtAddressLineOne, "A", false);
            findElement(txtAddressLineOne).sendKeys(Keys.BACK_SPACE);
        }
        if (addressLineOne.contains("New Address")) {
            getWebDriver().findElement(txtAddressLineOne).clear();
            addressLineOne = "Pallati" + RandomStringUtils.randomNumeric(5) + " " + "shkalla" + RandomStringUtils.randomNumeric(2) + " " + "apartamenti" + RandomStringUtils.randomNumeric(2);
            sendKeys(txtAddressLineOne, addressLineOne);
            log.info("AddressLineOne:" + addressLineOne);
        }
        return this;
    }

    public CreateCustomerPage enterAddressLineTwo(String addressLineTwo) throws InterruptedException {
        clickJS(txtAddressLineTwo);
        log.info("AddressLineTwo:" + addressLineTwo);
        sendKeys(txtAddressLineTwo, addressLineTwo, false);
        return this;
    }

    public CreateCustomerPage selectCountry(String country) throws InterruptedException {
        log.info("Country:" + country);
        selectMatComboboxJS(cmbCountry, country);
        return this;
    }

    public CreateCustomerPage selectCity(String city) throws InterruptedException {
        Thread.sleep(1500);
        log.info("Select city:" + city);
        selectMatComboboxJS(cmbCity, city);
        Thread.sleep(3000);
        findElement(cmbCity).sendKeys(Keys.ENTER);
        return this;
    }

    public CreateCustomerPage enterCity(String city) throws InterruptedException {
        log.info("Enter city:" + city);
        sendKeys(cmbCity, city, false);
        return this;
    }

    public CreateCustomerPage clickNewContactMediumButton() throws InterruptedException {
        clickJS(btnAddNewMedium);
        log.info("New Contact Medium Add Button clicked.");
        return this;
    }

    public CreateCustomerPage clickMediumContactBlankPanel() throws InterruptedException {
        Thread.sleep(1000);
        clickJS(btnNewMediumContactBlankPanel);
        log.info("New Medium Contact Blank Panel clicked.");
        return this;
    }

    public CreateCustomerPage controlNewMediumContact() {
        control(isElementExist(titleNewMediumContact), "New Contact Medium field is exist.", "ERROR:New Contact Medium field is not exist.");
        return this;
    }

    public CreateCustomerPage controlMediumType(String dropdownName) {

        switch (dropdownName) {
            case "Medium Type":
                control(isElementExist(cmbMediumType), dropdownName + "field is exist", "ERROR:" + dropdownName + "field is not exist.");
                break;
            case "Contact Type":
                control(isElementExist(cmbContactType), dropdownName + "field is exist", "ERROR:" + dropdownName + "field is not exist.");
                break;
        }
        return this;
    }

    public CreateCustomerPage selectMediumType(String mediumType) throws InterruptedException {
        log.info("Select medium type:" + mediumType);
        selectMatComboboxJS(cmbMediumType, mediumType);
        return this;
    }


    public CreateCustomerPage selectContactType(String contactType) throws InterruptedException {
        log.info("Select contact type:" + contactType);
        selectMatComboboxJS(cmbContactType, contactType);
        return this;
    }

    public CreateCustomerPage enterEmailAdress(String emailAddress) throws InterruptedException {
        Thread.sleep(2000);
        //elementToBeClickable(txtEmailAddressContactMediumPanel);
        log.info("Email Address:" + emailAddress);
        elementToBeClickable(txtEmailAddressContactMediumPanel);
        clickJS(txtEmailAddressContactMediumPanel);
        findElement(txtEmailAddressContactMediumPanel).clear();
        findElement(txtEmailAddressContactMediumPanel).sendKeys(emailAddress);
        return this;
    }

    public CreateCustomerPage enterTelephoneNumber(String telephoneNumber) throws InterruptedException, AWTException {
        Thread.sleep(500);
        log.info("Telephone Number" + telephoneNumber);
        List<WebElement> elementList = findElements(txtMobileNumber);
        elementList.get(1).clear();
        elementList.get(1).sendKeys(telephoneNumber);
        if (telephoneNumber.equals("")) {
            elementList.get(1).sendKeys("A");
            elementList.get(1).sendKeys(Keys.BACK_SPACE);
        }
        return this;
    }

    public CreateCustomerPage clickDeleteButton() throws InterruptedException {
        clickJS(btnDeleteMediumContact);
        log.info("Delete button clicked.");
        return this;
    }

    public CreateCustomerPage controlPopupMessage(String message) throws InterruptedException {
        Thread.sleep(2500);
        log.info("Expected message:" + message);
        control(isElementExist(By.xpath("//*[contains(text(),'" + message + "')]")), "Popup control is successfully", "ERROR:Popup control is not successfully");
        return this;
    }


    public CreateCustomerPage clickAddButton() throws InterruptedException {
        Thread.sleep(9000);
        clickJS(btnAdd);
        log.info("Add button clicked.");
        return this;
    }

    public CreateCustomerPage clickSaveButton() throws InterruptedException {
        List<WebElement> elementList = findElements(btnSave);
        clickJS(elementList.get(0));
        log.info("Save button clicked.");
        return this;
    }


    public CreateCustomerPage controlContactInformationTab() {
        //code block
        return this;
    }


    public CreateCustomerPage clickAddressInformationTab() throws InterruptedException {
        clickJS(tabAddressInformation);
        log.info("Address Information Tab clicked.");
        return this;
    }

    public CreateCustomerPage clickGeneralInformationTab() throws InterruptedException {
        clickJS(tabGeneralInformation);
        log.info("General Information Tab clicked.");
        return this;
    }

    public CreateCustomerPage checkDefaultCountry(String country) {
        //waitForExpectedElement(cmbCountryOfBirth);
        control(isElementExist(By.xpath("//mat-select//span[contains(text(),'" + country + "')]")), "" +
                        "Country came default Albania.",
                "ERROR: Country did not come default Albania.");
        return this;
    }

    public CreateCustomerPage
    checkAddressFilds(String address1, String address2, String country, String city) {
        log.info("Check address fields:");
        control(isElementExist(txtAddressLineOne, 3), address1 + " field is exist.", "ERROR: " + address1 + " field is not exist.");
        control(isElementExist(txtAddressLineTwo, 3), address2 + " field is exist.", "ERROR: " + address2 + " field is not exist.");
        control(isElementExist(cmbCountry, 3), country + " field is exist.", "ERROR: " + country + " field is not exist.");
        control(isElementExist(cmbCity, 3), city + " field is exist.", "ERROR: " + city + " field is not exist.");
        return this;
    }

    public CreateCustomerPage selectAuthorizationFields(String authorizationType) throws InterruptedException {
        log.info("Authorization Type:" + authorizationType);
        selectMatComboboxJS(cmbAuthorizationType, authorizationType);
        return this;
    }

    public CreateCustomerPage checkAuthorizedCustomerFields(String firstName, String lastName, String personalNumber, String authorizationDocumentType) throws InterruptedException {
        log.info("Check Authorized Customer fields:");
        control(isElementExist(txtfirstNameContactInformationTab, 3), firstName + " field is exist.", "ERROR: " + firstName + " field is not exist.");
        control(isElementExist(txtlastNameContactInformationTab, 3), lastName + " field is exist.", "ERROR: " + lastName + " field is not exist.");
        //elementToBeClickable(txtpersonalNumberContactInformationTab);
        //control(isElementExist(txtpersonalNumberContactInformationTab, 3), personalNumber + " field is exist.", "ERROR: " + personalNumber + " field is not exist.");
        control(isElementExist(cmbAuthorizationType, 3), authorizationDocumentType + " field is exist.", "ERROR: " + authorizationDocumentType + " field is not exist.");
        return this;
    }

    public CreateCustomerPage controlTab(String tab) throws InterruptedException {
        Thread.sleep(1000);
        switch (tab) {
            case "Search Individual":
                control((isElementExist(iconValidTab) && isElementExist(txtIdentification)), tab + " Tab opened..", "ERROR:" + tab + " Tab could not be opened.");
                break;
            case "General Information":
                control((isElementExist(iconValidTab) && isElementExist(txtSecondaryName)), tab + " Tab opened..", "ERROR:" + tab + " Tab could not be opened.");
                break;
            case "Address Information":
                control((isElementExist(iconValidTab) && isElementExist(txtAddressLineOne)), tab + " Tab opened..", "ERROR:" + tab + " Tab could not be opened.");
                break;
            case "Contact Information":
                control((isElementExist(iconValidTab) && isElementExist(cmbAuthorizationType)), tab + " Tab opened..", "ERROR:" + tab + " Tab could not be opened.");
                break;
            default:
                //code block
        }

        return this;
    }

    public CreateCustomerPage checkMandatoryFields(String field) throws InterruptedException {
        switch (field) {
            case "First Name":
                control(isElementExist(txtFirstNameInvalid), field + " Invalid and mandatory field.", "ERROR: " + field + " valid and not mandatory field.");
                break;
            case "Last Name":
                control(isElementExist(txtLastNameInvalid), field + " Invalid and mandatory field.", "ERROR: " + field + " valid and not mandatory field.");
                break;
            case "Personal Number":
                control(isElementExist(txtIdentificationInvalid), field + " Invalid and mandatory field.", "ERROR: " + field + " valid and not mandatory field.");
                break;
            case "Document Type":
                control(isElementExist(cmbDocumentTypeInvalid), field + " Invalid and mandatory field.", "ERROR: " + field + " valid and not mandatory field.");
                break;
            /*case "Segment":
                control(isElementExist(), field + " Invalid and mandatory field.", "ERROR: " + field + " valid and not mandatory field.");
                break;
            case "POS":
                control(isElementExist(), field + " Invalid and mandatory field.", "ERROR: " + field + " valid and not mandatory field.");
                break;*/
            case "Birth":
                control(isElementExist(pcrBirthDateInvalid), field + " Invalid and mandatory field.", "ERROR: " + field + " valid and not mandatory field.");
                //click(pcrBirthDateClose);
                break;
            case "Place Of Birth":
                control(isElementExist(cmbPlaceOfBirthInvalid), field + " Invalid and mandatory field.", "ERROR: " + field + " valid and not mandatory field.");
                break;
            case "Country Of Birth":
                control(isElementExist(cmbCountryOfBirthInvalid), field + " Invalid and mandatory field.", "ERROR: " + field + " valid and not mandatory field.");
                break;
            case "Citizenship":
                control(isElementExist(cmbCitizenshipInvalid), field + " Invalid and mandatory field.", "ERROR: " + field + " valid and not mandatory field.");
                break;
            case "Mobile Number":
                control(isElementExist(txtMobileNumberInvalid), field + " Invalid and mandatory field.", "ERROR: " + field + " valid and not mandatory field.");
                break;
            case "Gender":
                control(isElementExist(cmbGenderInvalid), field + " Invalid and mandatory field.", "ERROR: " + field + " valid and not mandatory field.");
                break;
            /*case "Document Type2":
                control(isElementExist(), field + " Invalid and mandatory field.", "ERROR: " + field + " valid and not mandatory field.");
                break;*/
            case "Email":
                control(isElementExist(txtEmailInvalid), field + " Invalid and mandatory field.", "ERROR: " + field + " valid and not mandatory field.");
                break;
            case "Address1":
                control(isElementExist(txtAddressLineOneInValid), field + " Invalid and mandatory field.", "ERROR: " + field + " valid and not mandatory field.");
                break;
            case "Address2":
                control(isElementExist(txtAddressLineTwoInValid), field + " Invalid and mandatory field.", "ERROR: " + field + " valid and not mandatory field.");
                break;
            case "City":
                control(isElementExist(cmbCityInValid), field + " Invalid and mandatory field.", "ERROR: " + field + " valid and not mandatory field.");
                break;
            case "Country":
                control(isElementExist(cmbCountryInvalid), field + " Invalid and mandatory field.", "ERROR: " + field + " valid and not mandatory field.");
                break;
            /*case "Customer Sales":
                control(isElementExist(), field + " Invalid and mandatory field.", "ERROR: " + field + " valid and not mandatory field.");
                break;*/
            case "Add":
                control(isElementExist(btnAddInvalid), field + "deactive button and customer is not created.", "ERROR:" + field + "active button and customer created.");
                break;
            case "Save":
                control(isElementExist(btnSaveInvalid), field + "deactive button and customer is not updated.", "ERROR: " + field + "active button and customer updated.");
                break;
            case "First Name Contact":
                control(isElementExist(txtfirstNameContactInformationInvalid), field + "Invalid and mandatory field.", "ERROR: " + field + " valid and not mandatory field.");
                break;
            case "Last Name Contact":
                control(isElementExist(txtlastNameContactInformationInvalid), field + "Invalid and mandatory field.", "ERROR: " + field + " valid and not mandatory field.");
                break;
            case "Identification Contact":
                control(isElementExist(txtpersonalNumberContactInformationInvalid), field + "Invalid and mandatory field.", "ERROR: " + field + " valid and not mandatory field.");
                break;
            case "Document Contact":
                control(isElementExist(cmbDocumentTypeContactInformationInvalid), field + "Invalid and mandatory field.", "ERROR: " + field + " valid and not mandatory field.");
                break;
            case "Authorized Type Contact":
                control(isElementExist(cmbAuthorizationTypeInvalid), field + "Invalid and mandatory field.", "ERROR: " + field + " valid and not mandatory field.");
                break;
            case "Medium Type":
                control(isElementExist(cmbMediumTypeInvalid), field + "Invalid and mandatory field.", "ERROR: " + field + " valid and not mandatory field.");
                break;
            case "Contact Type":
                control(isElementExist(cmbContactTypeInvalid), field + "Invalid and mandatory field.", "ERROR: " + field + " valid and not mandatory field.");
                break;
            case "Email Address":
                control(isElementExist(txtEmailAddressContactMediumInvalid), field + "Invalid and mandatory field.", "ERROR: " + field + " valid and not mandatory field.");
                break;
            case "Issuing Date":
                control(isElementExist(pcrIdentificationIssuingDateInvalid), field + "Invalid and mandatory field.", "ERROR: " + field + " valid and not mandatory field.");
                break;
            case "Document Number":
                control(isElementExist(txtDocumentNumberInvalid), field + "Invalid and mandatory field.", "ERROR: " + field + " valid and not mandatory field.");
                break;
            case "Given Name":
                control(isElementExist(txtfirstNameContactInformationInvalid), field + "Invalid and mandatory field.", "ERROR: " + field + " valid and not mandatory field.");
                break;
            case "Family Name":
                control(isElementExist(txtlastNameContactInformationInvalid), field + "Invalid and mandatory field.", "ERROR: " + field + " valid and not mandatory field.");
                break;
            case "Service Address 1":
                control(isElementExist(txtServiceAddressLineOneInvalid), field + "Invalid and mandatory field.", "ERROR: " + field + " valid and not mandatory field.");
                break;
            case "Service Address City":
                control(isElementExist(cmbServiceAddressCityInvalid), field + "Invalid and mandatory field.", "ERROR: " + field + " valid and not mandatory field.");
                break;
            case "Disability Type":
                control(isElementExist(cmbDisabledTypeInvalid), field + "Invalid and mandatory field.", "ERROR: " + field + " valid and not mandatory field.");
                break;
            case "Preferred Communication Method":
                control(isElementExist(cmbPreferredCommunicationMethodInvalid), field + "Invalid and mandatory field.", "ERROR: " + field + " valid and not mandatory field.");
                break;
            case "Contract Type":
                control(isElementExist(cmbContractTypeInvalid), field + "Invalid and mandatory field.", "ERROR: " + field + " valid and not mandatory field.");
                break;
            case "Fix Phone Number":
                control(isElementExist(txtFixPhoneNumberInvalid), field + "Invalid and mandatory field.", "ERROR: " + field + " valid and not mandatory field.");
                break;
            default:
                //code block
        }
        return this;
    }

    public CreateCustomerPage enterIdentificationNumberContactInformation(String identificationNumber) throws InterruptedException {
        Thread.sleep(2000);
        clickJS(txtpersonalNumberContactInformationTab);
        //findElement(txtpersonalNumberContactInformationTab).clear();
        if (identificationNumber.contains("C")) {
            String letter1 = "J20602";
            String number = RandomStringUtils.randomNumeric(3);
            String letter2 = RandomStringUtils.random(1, "ABCDEFGHIJKLMNOPQRSTUVW");
            String newNumber = "" + letter1 + number + letter2;
            worldHelper.setIdentificationNumberResidentialContact(newNumber);
            log.info("Identification Number: " + newNumber);
            findElement(txtpersonalNumberContactInformationTab).sendKeys(newNumber);
        } else if (identificationNumber.contains("1")) {
            String letter1 = "J20602";
            String number = RandomStringUtils.randomNumeric(3);
            String letter2 = RandomStringUtils.random(1, "ABCDEFGHIJKLMNOPQRSTUVW");
            String newNumber = "" + letter1 + number + letter2;
            log.info("Identification Number: " + newNumber);
            findElement(txtpersonalNumberContactInformationTab).sendKeys(newNumber);
        } else {
            log.info("Identification Number: " + identificationNumber);
            findElement(txtpersonalNumberContactInformationTab).sendKeys(identificationNumber);
            if (identificationNumber.equals("")) {
                sendKeys(txtpersonalNumberContactInformationTab, "A");
                findElement(txtpersonalNumberContactInformationTab).sendKeys(Keys.BACK_SPACE);
                sendKeys(txtpersonalNumberContactInformationTab, "A");
            }
        }

        return this;
    }

    public CreateCustomerPage clickSearchIdentificationContact() throws InterruptedException {
        Thread.sleep(3000);
        List<WebElement> elementList = findElements(By.xpath("//mat-icon[contains(text(),'search')]"));
        clickJS(elementList.get(elementList.size() - 1));
        log.info("Search Identification clicked.");

        Thread.sleep(3000);
        /*
        elementList = findElements(titleCustomerOptionContactInformation);
        elementList.get(2).click();
        log.info("Customer Name clicked.");*/
        return this;
    }

    public CreateCustomerPage enterFirstNameContactInformation(String firstName) throws InterruptedException {
        findElement(txtfirstNameContactInformationTab).clear();
        Thread.sleep(500);
        log.info("First Name:" + firstName);
        clickJS(txtfirstNameContactInformationTab);
        sendKeys(txtfirstNameContactInformationTab, firstName);

        if (firstName.equals("")) {
            getWebDriver().switchTo().window(getWebDriver().getWindowHandle());
            clickJS(txtfirstNameContactInformationTab);
            findElement(txtfirstNameContactInformationTab).sendKeys("A");
            findElement(txtfirstNameContactInformationTab).sendKeys(Keys.BACK_SPACE);
        }
        return this;
    }

    public CreateCustomerPage enterLastNameContactInformation(String lastName) throws InterruptedException {
        clearText(txtlastNameContactInformationTab);
        Thread.sleep(500);
        log.info("First Name:" + lastName);
        clickJS(txtlastNameContactInformationTab);
        sendKeys(txtlastNameContactInformationTab, lastName);

        if (lastName.equals("")) {
            findElement(txtlastNameContactInformationTab).sendKeys("A");
            findElement(txtlastNameContactInformationTab).sendKeys(Keys.BACK_SPACE);
        }
        return this;
    }

    public CreateCustomerPage selectDocumentTypeContactInformation(String authorizationDocumentType) throws InterruptedException {
        log.info("Authorization Document Type Name:" + authorizationDocumentType);
        wait.until(ExpectedConditions.elementToBeSelected(cmbDocumentTypeContactInformationTab));
        selectMatComboboxJS(cmbDocumentTypeContactInformationTab, authorizationDocumentType.toUpperCase());
        return this;
    }

    public CreateCustomerPage enterIssuingDate(String issuingDate) throws InterruptedException, AWTException {
        if (issuingDate.equals("")) {
            sendKeys(pcrIdentificationIssuingDate, "A", false);
            findElement(pcrIdentificationIssuingDate).sendKeys(Keys.BACK_SPACE);
        } else {
            clearText(pcrIdentificationIssuingDate);
            sendKeys(pcrIdentificationIssuingDate, issuingDate, false);
            log.info("Issuing Date:" + issuingDate);
        }
        Thread.sleep(1000);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        return this;
    }

    public CreateCustomerPage enterDocumentFile() throws AWTException, InterruptedException {
        Thread.sleep(5000);
        List<WebElement> elementList = findElements(btnAddNewDocument);
        clickJS(elementList.get(0));
        String path = System.getProperty("user.dir") + "\\document.jpg";
        uploadFile(txtFileInput, path);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        Thread.sleep(1000);
        return this;
    }


    public CreateCustomerPage createNewCustomer(String customerType) throws InterruptedException, AWTException {
        if (customerType.contains("Residential")) {
            controlSearchTab();
            enterIdentificationNumber(CreateCustomerResidentialData.identificationNumber);
            clickNextButtonSearchTab();
            controlGeneralInformationTab();
            enterFirstName(CreateCustomerResidentialData.firstName);
            controlValueField(CreateCustomerResidentialData.firstName, CreateCustomerResidentialData.valueTypeFirstName);
            enterLastName(CreateCustomerResidentialData.lastName);
            controlValueField(CreateCustomerResidentialData.lastName, CreateCustomerResidentialData.valueTypeLastName);
            enterSecondaryName(CreateCustomerResidentialData.secondaryName);
            controlValueField(CreateCustomerResidentialData.secondaryName, CreateCustomerResidentialData.valueTypeSecondaryName);
            enterEmail(CreateCustomerResidentialData.email);
            controlValueField(CreateCustomerResidentialData.email, CreateCustomerResidentialData.valueTypeEmail);
            enterBirthDate(CreateCustomerResidentialData.birthDate);
            controlAge();
            selectGender(CreateCustomerResidentialData.gender);
            checkDefaultCountry(CreateCustomerResidentialData.countryOfBirth);
            selectPlaceOfBirth(CreateCustomerResidentialData.placeOfBirth);
            controlCitizenship(CreateCustomerResidentialData.citizenship);
            enterMobileNumber(CreateCustomerResidentialData.mobileNumber);
            selectDocumentType(CreateCustomerResidentialData.documentType);
            enterIssuingDate(CreateCustomerResidentialData.issuingDate);
            enterDocumentNumber("C");
            enterDocumentFile();
            clickNextButtonn();
            checkAddressFilds(CreateCustomerResidentialData.valueTypeAddressLineOne, CreateCustomerResidentialData.valueTypeAddressLineTwo, CreateCustomerResidentialData.valueTypeCountry, CreateCustomerResidentialData.valueTypeCity);
            enterAddressLineOne(CreateCustomerResidentialData.addressLineOne);
            enterAddressLineTwo(CreateCustomerResidentialData.addressLineTwo);
            selectCity(CreateCustomerResidentialData.city);
            clickNextButton();
            controlTab(CreateCustomerResidentialData.controlInformationTab);
            selectAuthorizationFields(CreateCustomerResidentialData.authorizationFieldAuthorizedCustomer);
            enterIdentificationNumberContactInformation(CreateCustomerResidentialData.identificationNumber);
            clickSearchIdentificationContact();
            enterFirstNameContactInformation(CreateCustomerResidentialData.firstNameContactTab);
            enterLastNameContactInformation(CreateCustomerResidentialData.lastNameContactTab);
            selectDocumentTypeForContact(CreateCustomerResidentialData.documentTypeContactTab);
            enterIssuingDateForContact(CreateCustomerResidentialData.issuingDateContactTab);
            enterDocumentFileForContact();
            clickAddButton();
        } else {
            controlSearchTab();
            enterIdentificationNumber(CreateCustomerForeignerData.identificationNumber);
            clickNextButtonSearchTab();
            controlGeneralInformationTab();
            enterFirstName(CreateCustomerForeignerData.firstName);
            controlValueField(CreateCustomerForeignerData.firstName, CreateCustomerForeignerData.valueTypeFirstName);
            enterLastName(CreateCustomerForeignerData.lastName);
            controlValueField(CreateCustomerForeignerData.lastName, CreateCustomerForeignerData.valueTypeLastName);
            enterSecondaryName(CreateCustomerForeignerData.secondaryName);
            controlValueField(CreateCustomerForeignerData.secondaryName, CreateCustomerForeignerData.valueTypeSecondaryName);
            enterEmail(CreateCustomerForeignerData.email);
            controlValueField(CreateCustomerForeignerData.email, CreateCustomerForeignerData.valueTypeEmail);
            enterBirthDate(CreateCustomerForeignerData.birthDate);
            controlAge();
            selectGender(CreateCustomerForeignerData.gender);
            selectCountryOfBirth(CreateCustomerForeignerData.countryOfBirth);
            enterPlaceOfBirth(CreateCustomerForeignerData.placeOfBirth);
            selectCitizenship(CreateCustomerForeignerData.citizenship);
            enterMobileNumber(CreateCustomerForeignerData.mobileNumber);
            selectDocumentType(CreateCustomerForeignerData.documentType);
            enterIssuingDate(CreateCustomerForeignerData.issuingDate);
            enterDocumentNumber("1");
            enterDocumentFile();
            clickNextButtonn();
            checkAddressFilds(CreateCustomerForeignerData.valueTypeAddressLineOne, CreateCustomerForeignerData.valueTypeAddressLineTwo, CreateCustomerResidentialData.valueTypeCountry, CreateCustomerResidentialData.valueTypeCity);
            enterAddressLineOne(CreateCustomerForeignerData.addressLineOne);
            enterAddressLineTwo(CreateCustomerForeignerData.addressLineTwo);
            //selectCountry(CreateCustomerForeignerData.country);
            //enterCity(CreateCustomerForeignerData.city);
            selectCity(CreateCustomerResidentialData.city);
            clickNextButton();
            controlTab(CreateCustomerForeignerData.controlInformationTab);
            selectAuthorizationFields(CreateCustomerForeignerData.authorizationFieldAuthorizedCustomer);
            enterIdentificationNumberContactInformation(CreateCustomerForeignerData.identificationNumber);
            clickSearchIdentificationContact();
            enterFirstNameContactInformation(CreateCustomerForeignerData.firstNameContactTab);
            enterLastNameContactInformation(CreateCustomerForeignerData.lastNameContactTab);
            selectDocumentTypeForContact(CreateCustomerForeignerData.documentTypeContactTab);
            enterIssuingDateForContact(CreateCustomerForeignerData.issuingDateContactTab);
            enterDocumentFileForContact();
            clickAddButton();
        }

        return this;
    }

    public CreateCustomerPage enterIssuingDateForContact(String issuingDate) {
        log.info("Issuing Date:" + issuingDate);
        List<WebElement> elementList = findElements(pcrIdentificationIssuingDate);
        elementList.get(1).sendKeys(issuingDate, Keys.TAB);
        return this;
    }

    public CreateCustomerPage selectDocumentTypeForContact(String documentType) throws InterruptedException {
        log.info("Select Document Type:" + documentType);
        List<WebElement> elementList = findElements(cmbDocumentTypeContactInformationTab);
        clickJS(elementList.get(1));
        Thread.sleep(500);
        clickJS(By.xpath("//mat-option/span[contains(.,'" + documentType.toUpperCase() + "')]"));
        return this;
    }

    public CreateCustomerPage enterDocumentFileForContact() throws AWTException, InterruptedException {
        //control(isElementExist(By.xpath("//mat-icon[contains(text(),'add')]")), "Add Document Button is exist.", "ERROR: Add Document Button is not exist.");
        //log.info("Add Document File: document.jpg");
        Thread.sleep(5000);
        //clickJS(findElements(By.xpath("//mat-icon[contains(text(),'add')]")).get(1));
        //Robot robot = new Robot();
        //robot.keyPress(KeyEvent.VK_ESCAPE);
        //robot.keyRelease(KeyEvent.VK_ESCAPE);

        //robot.keyPress(KeyEvent.VK_TAB);
        //robot.keyRelease(KeyEvent.VK_TAB);
        //robot.keyPress(KeyEvent.VK_ENTER);
        //robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        String path = System.getProperty("user.dir") + "\\document.jpg";
        List<WebElement> elementList = findElements(txtFileInput);
        elementList.get(elementList.size() - 1).sendKeys(path);
        Thread.sleep(1000);
        //uploadFile(txtFileInput, path);
        //robot.keyPress(KeyEvent.VK_ESCAPE);
        //robot.keyRelease(KeyEvent.VK_ESCAPE);
        Thread.sleep(2000);
        return this;
    }

    public CreateCustomerPage controlDocumentTypeAllField(String idCard, String passport, String other) throws InterruptedException, AWTException {
        log.info("Document Type Fields are checking.");
        clickJS(cmbDocumentType);
        control(isElementExist(By.xpath("//span[contains(text(),'" + idCard.toUpperCase() + "')]")), idCard + "type is exist.", "ERROR:" + idCard + "type is not exist.");
        control(isElementExist(By.xpath("//span[contains(text(),'" + passport.toUpperCase() + "')]")), passport + "type is exist.", "ERROR:" + passport + "type is not exist.");
        //control(isElementExist(By.xpath("//span[contains(text(),'" + other.toUpperCase() + "')]")), other + "type is exist.", "ERROR:" + other + "type is not exist.");

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        return this;
    }

    public CreateCustomerPage controlDocumentCollection(String documentType, String issuingDate, String documentNumber) {
        log.info("Document Collection Field is checking.");
        control(isElementExist(cmbDocumentType), documentType + "field is exist.", "ERROR:" + documentType + "field is not exist.");
        control(isElementExist(pcrIdentificationIssuingDate), issuingDate + "field is exist.", "ERROR:" + issuingDate + "field is not exist.");
        control(isElementExist(txtDocumentNumber), documentNumber + "field is exist.", "ERROR:" + documentNumber + "field is not exist.");
        return this;
    }

    public CreateCustomerPage controlDefaultDocumentType(String documentType) {
        log.info("Document Type Default value is checking.");
        control(isElementExist(By.xpath("//span[contains(text(),'" + documentType.toUpperCase() + "')]")), "Document Type came default" + documentType, "ERROR: Document Type did not come default" + documentType);
        return this;
    }

    public CreateCustomerPage enterDocumentNumber(String documentNumber) throws InterruptedException, AWTException {
        String newNumber = "";
        if (documentNumber.contains("C")) {
            //newNumber = worldHelper.getIdentificationNumberResidential();
            newNumber = documentNumber + getRandomNumberInRange(10000000, 99999999) + "X";
            log.info("Enter Document Number:" + newNumber);
            clearText(txtDocumentNumber);
            sendKeys(txtDocumentNumber, newNumber);
        } else if (documentNumber.contains("1")) {
            //newNumber = worldHelper.getIdentificationNumberForeigner();
            newNumber = documentNumber + getRandomNumberInRange(10000000, 99999999) + "1";
            log.info("Enter Document Number:" + newNumber);
            clearText(txtDocumentNumber);
            sendKeys(txtDocumentNumber, newNumber);
        } else {
            sendKeys(txtDocumentNumber, "A", false);
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_BACK_SPACE);
            robot.keyRelease(KeyEvent.VK_BACK_SPACE);
        }
        return this;
    }

    public CreateCustomerPage clickCancelFileButton() throws InterruptedException {
        Thread.sleep(7000);
        List<WebElement> elementList = findElements(btnCancelFile);
        clickJS(elementList.get(1));
        log.info("Cancel File Button clicked.");
        return this;
    }

    public CreateCustomerPage controlFileDeleteMessage(String fileDeleteMessage) throws InterruptedException {
        Thread.sleep(2000);
        log.info("Expected Message:" + fileDeleteMessage);
        control(isElementExist(By.xpath("//mat-error[contains(text(),'" + fileDeleteMessage + "')]")), fileDeleteMessage + "title is exist.", "ERROR:" + fileDeleteMessage + "title is not exist.");
        return this;
    }

    public CreateCustomerPage enterFiveMBDocumentFile() throws AWTException, InterruptedException {
        List<WebElement> elementList = findElements(btnAddNewDocument);
        clickJS(elementList.get(0));
        String path = System.getProperty("user.dir") + "\\document.jpg";
        uploadFile(txtFileInput, path);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        return this;
    }

    public CreateCustomerPage enterGreaterThanFiveMBDocumentFile() throws AWTException, InterruptedException {
        Thread.sleep(5000);
        List<WebElement> elementList = findElements(btnAddNewDocument);
        clickJS(elementList.get(0));
        String path = System.getProperty("user.dir") + "\\document_2.jpg";
        uploadFile(txtFileInput, path);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        return this;
    }

    public CreateCustomerPage enterGreaterThanFiveMBDocumentFileForContact() throws AWTException, InterruptedException {
        Robot robot = new Robot();
//        robot.keyPress(KeyEvent.VK_TAB);
//        robot.keyRelease(KeyEvent.VK_TAB);
//        robot.keyPress(KeyEvent.VK_TAB);
//        robot.keyRelease(KeyEvent.VK_TAB);
//        robot.keyPress(KeyEvent.VK_ENTER);
//        robot.keyRelease(KeyEvent.VK_ENTER);
        List<WebElement> elementListAddButton = findElements(btnAddNewDocument);
        clickJS(elementListAddButton.get(1));
        Thread.sleep(1000);
        String path = System.getProperty("user.dir") + "\\document.jpg";
        List<WebElement> elementList = findElements(txtFileInput);
        elementList.get(0).sendKeys(path);
        //uploadFile(txtFileInput, path);
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        return this;
    }

    public CreateCustomerPage controlDocumentCollectionForContact(String documentType, String issuingDate, String documentNumber) {
        List<WebElement> elementList = findElements(cmbDocumentType);
        control(elementList.get(1).isDisplayed(), documentType + "field is exist.", "ERROR:" + documentType + "field is not exist.");
        elementList = findElements(pcrIdentificationIssuingDate);
        control(elementList.get(1).isDisplayed(), issuingDate + "field is exist.", "ERROR:" + issuingDate + "field is not exist.");
        elementList = findElements(txtDocumentNumber);
        control(elementList.get(1).isDisplayed(), documentNumber + "field is exist.", "ERROR:" + documentNumber + "field is not exist.");
        return this;
    }

    public CreateCustomerPage clickCancelFileButtonForContact() throws InterruptedException, AWTException {
        List<WebElement> elementList = findElements(btnCancelFile);
        clickJS(elementList.get(2));
        log.info("Cancel File Button clicked.");

        //Robot robot = new Robot();
        //robot.keyPress(KeyEvent.VK_TAB);
        //robot.keyRelease(KeyEvent.VK_TAB);
        return this;
    }

    public CreateCustomerPage controlFileDeleteMessageForContact(String fileDeleteMessage) {
        log.info("Expected Message:" + fileDeleteMessage);
        List<WebElement> elementList = findElements(titleFileDeleteMessage);
        String incomingMessage = elementList.get(1).getText();
        log.info("Incoming Message:" + incomingMessage);
        control(incomingMessage.contains(fileDeleteMessage), fileDeleteMessage + "title is exist.", "ERROR:" + fileDeleteMessage + "title is not exist.");
        return this;
    }

    public CreateCustomerPage enterDocumentNumberForContact(String documentNumber) throws InterruptedException {
        String newNumber = "";
        if (documentNumber.contains("C")) {
            //newNumber = worldHelper.getIdentificationNumberResidential();
            newNumber = "C12345678B";
        } else if (documentNumber.contains("1")) {
            //newNumber = worldHelper.getIdentificationNumberForeigner();
            newNumber = "1234567890";
        } else {
            newNumber = documentNumber;
        }
        log.info("Enter Document Number:" + newNumber);
        List<WebElement> elementList = findElements(txtDocumentNumber);
        elementList.get(1).clear();
        elementList.get(1).sendKeys(newNumber);
        return this;
    }

    public CreateCustomerPage controlAddressInformationTabValue(String fieldName) throws InterruptedException {
        log.info(fieldName + "Value is checking.");

        String expectedValue = "";
        //String incomingValue = "";

        switch (fieldName) {
            case "Address Line 1":
                expectedValue = worldHelper.getCreateAggResidentialRequest().getIndividualObject().getContactMedium().get(2).getCharacteristic().getStreet1();
                log.info("Expected Value:" + expectedValue);
                control(isElementExist(By.xpath("//*[contains(@ng-reflect-value,'" + expectedValue + "')]")), "Popup control is successfully", "ERROR:Popup control is not successfully");
                //incomingValue = findElement(txtAddressLineOne).getAttribute("ng-reflect-value");
                break;
            case "City":
                expectedValue = worldHelper.getCreateAggResidentialRequest().getIndividualObject().getContactMedium().get(2).getCharacteristic().getCity();
                log.info("Expected Value:" + expectedValue);
                control(isElementExist(By.xpath("//*[contains(text(),'" + expectedValue + "')]")), "Popup control is successfully", "ERROR:Popup control is not successfully");
                //incomingValue = findElements(By.cssSelector("[formcontrolname='city'] span")).get(0).getText();
                break;
            default:
                //code block
        }

        //log.info("Incoming Value:" + incomingValue);
        //control(incomingValue.contains(expectedValue), fieldName + "Value is successfully.", "ERROR:" + fieldName + "Value is not successfully");

        return this;
    }

    public CreateCustomerPage checkDefaultCountryForAddressInformatıon(String country) throws InterruptedException {
        Thread.sleep(1000);
        log.info("Expected Default Country:" + country);

        //JavascriptExecutor javascriptExecutor = (JavascriptExecutor) getWebDriver();
        //String incomingDefaultValue = javascriptExecutor.executeScript("return document.querySelector('[formcontrolname=country]').value").toString();

        String incomingDefaultValue = findElement(cmbCountry).getAttribute("ng-reflect-value");
        //String incomingDefaultValue = findElement(cmbCountry).getAttribute("ng-reflect-value");
        log.info("Incoming Default Country:" + incomingDefaultValue);
        control(incomingDefaultValue.contains(country), country + "default value came.", "ERROR:" + country + "default value did not come.");
        return this;
    }

    public CreateCustomerPage controlDefaultServiceAddressSwitch(String statusValue) throws InterruptedException {
        Thread.sleep(2000);
        log.info("Service Address Switch Value checking.");
        control(isElementExist(By.cssSelector("[formcontrolname='hasServiceAddress'] [aria-checked='" + statusValue + "']")), "Service address switch value is " + statusValue, "Service address switch value is not " + statusValue);
        return this;
    }

    public CreateCustomerPage clickServiceAddressSwitch() throws InterruptedException {
        Thread.sleep(1000);
        List<WebElement> elementList = findElements(By.cssSelector("[class='mat-slide-toggle-bar']"));
        clickJS(elementList.get(0));
        //clickJS(chkServiceAddress);
        log.info("Service Address Switch clicked.");
        return this;
    }

    public CreateCustomerPage controlServiceAddressField(String mediumType, String contactType, String addressLineOne, String addressLineTwo, String country, String city) {
        log.info("Service Address Field is checking.");
        control(isElementExist(txtServiceAddressMediumType), mediumType + "field is exist.", "ERROR:" + mediumType + "field is not exist.");
        control(isElementExist(txtServiceAddressContactType), contactType + "field is exist.", "ERROR:" + contactType + "field is not exist.");
        control(isElementExist(txtServiceAddressLineOne), addressLineOne + "field is exist.", "ERROR:" + addressLineOne + "field is not exist.");
        control(isElementExist(txtServiceAddressLineTwo), addressLineTwo + "field is exist.", "ERROR:" + addressLineTwo + "field is not exist.");
        control(isElementExist(cmbServiceAddressCountry), country + "field is exist.", "ERROR:" + country + "field is not exist.");
        control(isElementExist(cmbServiceAddressCity), city + "field is exist.", "ERROR:" + city + "field is not exist.");
        return this;
    }

    public CreateCustomerPage controlDefaultServiceAddressCountry(String country) throws InterruptedException {
        log.info("Expected Default Country:" + country);
        control(isElementExist(By.xpath("//span[contains(text(),'" + country + "')]")), country + "default value came.", "ERROR:" + country + "default value did not come.");
        return this;
    }

    public CreateCustomerPage enterAddressLineOneForServiceAddress(String addressLineOne) throws InterruptedException, AWTException {
        clearText(txtServiceAddressLineOne);
        log.info("Enter Address Line One:" + addressLineOne);
        findElement(txtServiceAddressLineOne).sendKeys(addressLineOne);
        if (addressLineOne.equals("")) {
            sendKeys(txtServiceAddressLineOne, "A", false);
            findElement(txtServiceAddressLineOne).sendKeys(Keys.BACK_SPACE);
        }
        return this;
    }

    public CreateCustomerPage enterAddressLineTwoForServiceAddress(String addressLineTwo) throws InterruptedException {
        log.info("Enter Address Line Two:" + addressLineTwo);
        sendKeys(txtServiceAddressLineTwo, addressLineTwo);
        return this;
    }

    public CreateCustomerPage selectCityForServiceAddress(String city) throws InterruptedException {
        log.info("Select City:" + city);
        selectMatComboboxJS(cmbServiceAddressCity, city);
        findElement(cmbServiceAddressCity).sendKeys(Keys.ENTER);
        return this;
    }

    public CreateCustomerPage clickDocumentAddButton() throws InterruptedException {
        Thread.sleep(7000);
        clickJS(btnAddNewDocument);
        log.info("Document Add Button clicked.");
        return this;
    }

    public CreateCustomerPage clickBirthDateCloseButtonForCreateResidential() throws InterruptedException {
        List<WebElement> elementList = findElements(pcrBirthDateClose);
        clickJS(elementList.get(2));
        log.info("Birth Date Close Button clicked.");
        Thread.sleep(500);
        return this;
    }

    public CreateCustomerPage clickIssuingDateCloseButton() throws InterruptedException {
        List<WebElement> elementList = findElements(pcrBirthDateClose);
        clickJS(elementList.get(3));
        log.info("Issuing Date Close Button clicked.");
        Thread.sleep(500);
        return this;
    }

    public CreateCustomerPage enterDocumentFilePngFormat() throws InterruptedException, AWTException {
        Thread.sleep(5000);
        List<WebElement> elementList = findElements(btnAddNewDocument);
        clickJS(elementList.get(0));
        String path = System.getProperty("user.dir") + "\\document_1.png";
        uploadFile(txtFileInput, path);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        Thread.sleep(1000);
        return this;
    }

    public CreateCustomerPage enterDocumentFilePdfFormat() throws InterruptedException, AWTException {

        Thread.sleep(5000);
        List<WebElement> elementList = findElements(btnAddNewDocument);
        clickJS(elementList.get(0));
        String path = System.getProperty("user.dir") + "\\document_1.pdf";
        uploadFile(txtFileInput, path);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        Thread.sleep(1000);
        return this;

    }

    public CreateCustomerPage enterGreaterThanFiveMBDocumentFileJpgFormat() throws InterruptedException, AWTException {
        Thread.sleep(5000);
        List<WebElement> elementList = findElements(btnAddNewDocument);
        clickJS(elementList.get(0));
        String path = System.getProperty("user.dir") + "\\document_2.jpg";
        uploadFile(txtFileInput, path);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        return this;

    }

    public CreateCustomerPage enterGreaterThanFiveMBDocumentFilePngFormat() throws InterruptedException, AWTException {
        Thread.sleep(5000);
        List<WebElement> elementList = findElements(btnAddNewDocument);
        clickJS(elementList.get(0));
        String path = System.getProperty("user.dir") + "\\document_2.png";
        uploadFile(txtFileInput, path);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        return this;
    }

    public CreateCustomerPage enterDocumentFileTxtFormat() throws InterruptedException, AWTException {
        Thread.sleep(5000);
        List<WebElement> elementList = findElements(btnAddNewDocument);
        clickJS(elementList.get(0));
        String path = System.getProperty("user.dir") + "\\selenium-waitModal.txt";
        uploadFile(txtFileInput, path);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        return this;
    }

    public CreateCustomerPage enterDocumentFileForContactPngFormat() throws InterruptedException, AWTException {
        control(isElementExist(By.cssSelector("[aria-label='Add Document']")), "Add Document Button is exist.", "ERROR: Add Document Button is not exist.");
        log.info("Add Document File: document_1.png");
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        String path = System.getProperty("user.dir") + "\\document_1.png";
        List<WebElement> elementList = findElements(txtFileInput);
        elementList.get(0).sendKeys(path);
        //uploadFile(txtFileInput, path);
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        Thread.sleep(2000);
        return this;
    }

    public CreateCustomerPage enterDocumentFileForContactPdfFormat() throws AWTException, InterruptedException {
        control(isElementExist(By.cssSelector("[aria-label='Add Document']")), "Add Document Button is exist.", "ERROR: Add Document Button is not exist.");
        log.info("Add Document File: document_1.pdf");
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        String path = System.getProperty("user.dir") + "\\document_1.pdf";
        List<WebElement> elementList = findElements(txtFileInput);
        elementList.get(0).sendKeys(path);
        //uploadFile(txtFileInput, path);
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        Thread.sleep(2000);
        return this;
    }

    public CreateCustomerPage enterGreaterThanFiveMBDocumentFileForContactPngFormat() throws AWTException, InterruptedException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        String path = System.getProperty("user.dir") + "\\document_2.png";
        List<WebElement> elementList = findElements(txtFileInput);
        elementList.get(0).sendKeys(path);
        //uploadFile(txtFileInput, path);
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        return this;
    }


    public CreateCustomerPage enterGreaterThanFiveMBDocumentFileForContactJpgFormat() throws AWTException, InterruptedException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        String path = System.getProperty("user.dir") + "\\document_2.jpg";
        List<WebElement> elementList = findElements(txtFileInput);
        elementList.get(0).sendKeys(path);
        //uploadFile(txtFileInput, path);
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        return this;
    }


    public CreateCustomerPage enterDocumentFileForContactTxtFormat() throws AWTException, InterruptedException {
        control(isElementExist(By.cssSelector("[aria-label='Add Document']")), "Add Document Button is exist.", "ERROR: Add Document Button is not exist.");
        log.info("Add Document File: selenium-waitModal.txt");
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        String path = System.getProperty("user.dir") + "\\selenium-waitModal.txt";
        List<WebElement> elementList = findElements(txtFileInput);
        elementList.get(0).sendKeys(path);
        //uploadFile(txtFileInput, path);
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        Thread.sleep(2000);
        return this;
    }


    public CreateCustomerPage controlGender(String iconGender) {
        switch (iconGender) {
            case "Female":
                control(isElementExist(iconGenderFemale), iconGender +
                                " icon is displayed.",
                        "ERROR:" + iconGender + " icon is not displayed .");
                break;
            case "Male":

                control(isElementExist(iconGenderMale), iconGender +
                                " icon is displayed.",
                        "ERROR: " + iconGender + "icon is not displayed .");
                break;
            default:
        }

        return this;

    }


    public CreateCustomerPage selectCountryPhoneCode(String countryPhoneCode) throws InterruptedException {
        selectMatComboboxJS(cmbPhoneCode, countryPhoneCode);
        log.info("Telephone Country Code" + countryPhoneCode);
        return this;
    }

    public CreateCustomerPage selectContactCountryPhoneCode(String contactCountryCode) throws InterruptedException {
        selectMatComboboxJS(cmbContactPhoneCode, contactCountryCode);
        log.info("Telephone Contact Country Code" + contactCountryCode);
        return this;
    }

    public CreateCustomerPage enterBirthDate2ndVersion(String birthDate) throws InterruptedException {
        List<WebElement> elementList = findElements(btnOpenCalender);
        clickJS(elementList.get(0));
        Thread.sleep(500);
        clickJS(btnCalenderMonthYear);
        Thread.sleep(500);
        clickJS(By.xpath("//div[contains(text(),'" + birthDate.substring(birthDate.length() - 4) + "')]"));
        Thread.sleep(500);
        clickJS(By.xpath("//div[contains(text(),'" + birthDate.toUpperCase().substring(3, 6) + "')]"));
        Thread.sleep(500);

        if (birthDate.charAt(0) == '0') {
            String newBirthdate = birthDate.substring(1);
            clickJS(By.xpath("//td[@aria-label='" + newBirthdate + "']"));
            log.info(newBirthdate + "clicked.");
        } else {
            clickJS(By.xpath("//td[@aria-label='" + birthDate + "']"));
        }


        Thread.sleep(5000);
        return this;
    }

    public CreateCustomerPage selectSegment(String segment) throws InterruptedException {
        Thread.sleep(1500);
        selectMatComboboxJS(cmbSegment, segment);
        log.info("Select Segment:" + segment);
        return this;

    }

    public CreateCustomerPage enterBirthDateForContactTab(String birthDate) throws InterruptedException {
        log.info("Birth Date:" + birthDate);
        switch (birthDate) {
            case "02061992":
                //clearText(pcrBirthDate);
                List<WebElement> elementList = findElements(btnOpenCalender);
                clickJS(elementList.get(2));
                Thread.sleep(500);
                clickJS(btnCalenderMonthYear);
                Thread.sleep(500);
                clickJS(btnCalender1992Year);
                Thread.sleep(500);
                clickJS(btnCalenderMoth);
                Thread.sleep(500);
                clickJS(btnCalenderDay);
                // sendKeys(pcrBirthDate, birthDate, false);
                Thread.sleep(2000);
                break;
            default:
                sendKeys(pcrBirthDate, birthDate, false);
        }
        return this;
    }

    public CreateCustomerPage selectGenderForContactTab(String gender) throws InterruptedException {
        elementToBeClickable(findElements(cmbGender).get(1));
        selectMatComboboxJS(findElements(cmbGender).get(1), gender.toUpperCase());
        log.info("Gender:" + gender);
        return this;
    }

    public CreateCustomerPage selectCitizenshipForContactTab(String citizenship) throws InterruptedException {
        selectMatComboboxJS(findElements(cmbCitizenship).get(1), citizenship);
        log.info("Citizenship:" + citizenship);
        return this;
    }

    public CreateCustomerPage controlGeneralInformationTabFieldValue(String fieldName) {
        log.info(fieldName + "Field Value is checking.");
        String expectedValue = "";
        switch (fieldName) {
            case "First Name":
                expectedValue = worldHelper.getCreateAggResidentialRequest().getIndividualObject().getGivenName();
                break;
            case "Last Name":
                expectedValue = worldHelper.getCreateAggResidentialRequest().getIndividualObject().getFamilyName();
                break;
            default:
                //code block
        }
        log.info("Expected Value: " + expectedValue);
        control(isElementExist(By.cssSelector("[ng-reflect-value='" + expectedValue + "']")), fieldName + "Field Value is successfully.", "ERROR:" + fieldName + "Field Value is not successfully.");
        return this;
    }

    public CreateCustomerPage clickContactInformationTab() throws InterruptedException {
        clickJS(tabContactInformation);
        log.info("Contact Information Tab clicked.");
        return this;
    }

    public CreateCustomerPage controlNotSeeingField(String fieldName) {
        log.info(fieldName + "Field is checking.");
        switch (fieldName) {
            case "Issuing Date":
                control(!(isElementExist(By.xpath("//mat-label[contains(text(),'Issuing Date')]"))), fieldName + "Field is not exist.", "ERROR:" + fieldName + "Field is exist.");
                break;
            case "Issuing Date1":
                control(!(findElements(pcrIdentificationIssuingDate).size() > 1), fieldName + "Field is not exist.", "ERROR:" + fieldName + "Field is exist.");
                break;
            default:
                //code block
        }
        return this;
    }

    public CreateCustomerPage enterIdentificationNumberForFemale(String value) throws InterruptedException {
        sendKeys(txtIdentification, "J25602" + RandomStringUtils.randomNumeric(3) + RandomStringUtils.random(1, "ABCDEFGHIJKLMNOPQRSTUVW"), true);
        log.info("Enter Value:" + value);
        return this;
    }

    public CreateCustomerPage clickSendPinButton() throws InterruptedException {
        clickJS(btnSendPin);
        log.info("Send Pin Button clicked.");
        return this;
    }

    public CreateCustomerPage enterPinCode(String pinCode) throws InterruptedException {
        Thread.sleep(2000);

        if (pinCode.equals("0000")) {
            sendKeys(txtPinCode, pinCode);
        }

        Logs logs = getWebDriver().manage().logs();
        LogEntries logEntries = logs.get(LogType.BROWSER);

        for (LogEntry logEntry : logEntries) {
            if (logEntry.getMessage().contains("created")) {
                pinCode = logEntry.getMessage().trim().split("created")[1].split(" ")[1];
            }
        }


        sendKeys(txtPinCode, pinCode);
        log.info("Enter Pin Code:" + pinCode);
        Thread.sleep(500);
        return this;
    }

    public CreateCustomerPage clickValidatePin() throws InterruptedException {
        clickJS(btnValidatePin);
        log.info("Validate Pin Button clicked.");
        return this;
    }

    public CreateCustomerPage clickSearchButtonForBillingAddress() throws InterruptedException {
        Thread.sleep(1000);
        //List<WebElement> elementList = findElements(By.xpath("//span[contains(text(),'Search')]"));
        //clickJS(elementList.get(0));
        clickJS(By.xpath("//span[contains(text(),'Search')]"));
        log.info("Billing Address Search Button clicked.");
        return this;
    }

    public CreateCustomerPage clickSearchButtonForServiceAddress() throws InterruptedException {
        List<WebElement> elementList = findElements(By.xpath("//span[contains(text(),'Search')]"));
        clickJS(elementList.get(1));
        log.info("Service Address Search Button clicked.");
        Thread.sleep(500);
        return this;
    }

    public CreateCustomerPage clickCancelFileButtonForGeneralInformationTab() throws InterruptedException {
        Thread.sleep(3500);
        List<WebElement> elementList = findElements(btnCancelFile);
        clickJS(elementList.get(1));
        log.info("Cancel File Button clicked.");
        return this;
    }

    public CreateCustomerPage enterIdentificationNumberWithEnterpriseAdminId(String identificationNumber) throws InterruptedException {
        String enterpriseAdminIdValue = worldHelper.getNewCreateCorporateCustomerRequest().getPartyOperations().get(1).getValue().getIndividualIdentification().get(0).getIdentificationId();
        sendKeys(txtIdentification, enterpriseAdminIdValue, true);
        log.info("Enter Identification Number:" + enterpriseAdminIdValue);
        return this;
    }

    public CreateCustomerPage enterIdentificationNumberWithContactAuthorizeId(String identificationNumber) throws InterruptedException {
        String contactAuthorizeValue = worldHelper.getNewCreateIndividualCustomerRequest().getPartyOperations().get(1).getValue().getIndividualIdentification().get(0).getIdentificationId();
        sendKeys(txtIdentification, contactAuthorizeValue, true);
        log.info("Enter Identification Number:" + contactAuthorizeValue);
        return this;
    }

    public CreateCustomerPage clickDisabilityButton() throws InterruptedException {
        Thread.sleep(1000);
        clickJS(btnDisability);
        log.info("Disability Button clicked.");
        return this;
    }

    public CreateCustomerPage enterDisabledOrganization(String disabledOrganization) throws InterruptedException {
        Thread.sleep(2000);
        sendKeys(txtDisabledOrganization, disabledOrganization);
        log.info("Enter Disabled Organization" + disabledOrganization);
        return this;
    }

    public CreateCustomerPage selectDisabledType(String disabledType) throws InterruptedException, AWTException {
        Thread.sleep(1000);
        if (disabledType.equals("")) {
            clickJS(cmbDisabledType);
            Thread.sleep(1000);
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ESCAPE);
            robot.keyRelease(KeyEvent.VK_ESCAPE);
        } else {
            selectMatComboboxJS(cmbDisabledType, disabledType);
            log.info("Select Disabled Type" + disabledType);
        }
        return this;
    }

    public CreateCustomerPage selectPreferredCommunicationMethod(String preferredComunicationMethod) throws InterruptedException {
        Thread.sleep(1000);
        selectMatComboboxJS(cmbPreferredCommunicationMethod, preferredComunicationMethod);
        log.info("Select Preferred Communication Method" + preferredComunicationMethod);
        return this;
    }

    public CreateCustomerPage selectContractType(String contractType) throws InterruptedException {
        Thread.sleep(1000);
        selectMatComboboxJS(cmbContractType, contractType);
        log.info("Select Contract Type" + contractType);
        return this;
    }

    public CreateCustomerPage selectDocumentTypeOtherInformation(String documentType) throws InterruptedException {
        Thread.sleep(1000);
        selectMatComboboxJS(cmbDocumentTypeOtherInformationTab, documentType);
        log.info("Select Document Type" + documentType);
        return this;
    }

    public CreateCustomerPage enterDocumentFileForOtherInformationTab() throws InterruptedException, AWTException {
        Thread.sleep(2000);

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        //getWebDriver().findElements(btnAddDocumentFile).get(1).click();
        //clickJS(findElements(btnAddDocumentFile).get(1));
        log.info("Document File Button clicked.");
        Thread.sleep(3000);
        String path = System.getProperty("user.dir") + "\\document.jpg";
        StringSelection str = new StringSelection(path);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
        log.info(path);
        //findElements(txtFileInput).get(1).sendKeys(path);
        Thread.sleep(1000);

//         press Contol+V for pasting
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

//        // release Contol+V for pasting
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

//        // for pressing and releasing Enter
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        return this;
    }

    public CreateCustomerPage clickGenerateForm() throws InterruptedException {
        Thread.sleep(1000);
        clickJS(btnGenerateForm);
        log.info("Generate Button clicked.");
        Thread.sleep(2000);
        ArrayList<String> tabs = new ArrayList<String>(getWebDriver().getWindowHandles());
        if (tabs.size() > 1) {
            getWebDriver().switchTo().window(tabs.get(1));
            getWebDriver().close();
            getWebDriver().switchTo().window(tabs.get(0));
        }

        Thread.sleep(1500);

        String window = getWebDriver().getWindowHandle();
        getWebDriver().switchTo().window(window);

        Thread.sleep(2000);

        return this;
    }

    public CreateCustomerPage controlGenerateFormNotActive() {
        log.info("Generate Form Not Active is checking.");
        ArrayList<String> tabs = new ArrayList<String>(getWebDriver().getWindowHandles());
        control(tabs.size() < 2, "Generate Form Not Active.", "ERROR: Generate Form Active.");
        return this;
    }

    public CreateCustomerPage controlSearchButtonNotSeeing() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Search Button is checking.");
        control(!(isElementExist(By.xpath("//*[contains(text(),'Search')]"))), "Search button is not exist.", "ERROR: Search button is exist.");
        return this;
    }

    public CreateCustomerPage clickDocumentViewPage() throws InterruptedException {
        Thread.sleep(5000);
        clickJS(btnDocumentView);
        log.info("Document View Page button clicked.");
        return this;
    }

    public CreateCustomerPage enterDocumentFileSpaceDefinedFormat() throws InterruptedException, AWTException {
        Thread.sleep(5000);
        List<WebElement> elementList = findElements(btnAddNewDocument);
        clickJS(elementList.get(0));
        String path = System.getProperty("user.dir") + "\\document 1.pdf";
        uploadFile(txtFileInput, path);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        return this;
    }

    public CreateCustomerPage enterDocumentFileOtherFormat() throws InterruptedException, AWTException {
        Thread.sleep(5000);
        List<WebElement> elementList = findElements(btnAddNewDocument);
        clickJS(elementList.get(0));
        String path = System.getProperty("user.dir") + "\\document-1.pdf";
        uploadFile(txtFileInput, path);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        return this;
    }

    public CreateCustomerPage controlSendPinButton() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Send Pin Button is checking.");
        control(isElementExist(By.xpath("//*[contains(text(),'Send Pin')]//parent::button[contains(@style,'none')]")), "Send Pin Button is not exist.", "Send Pin Button is exist.");
        return this;
    }

    public CreateCustomerPage selectCreditCard(String creditCard) throws InterruptedException {
        Thread.sleep(1500);
        selectMatComboboxJS(cmbCreditCard,creditCard);
        log.info("Select Credit Card:" + creditCard);
        return this;
    }

    public CreateCustomerPage selectCreditRatingForPrepaid(String creditRatingPrepaid) throws InterruptedException {
        Thread.sleep(1500);
        selectMatComboboxJS(cmbCreditRatingForPrepaid,creditRatingPrepaid);
        log.info("Select Credit Rating For Prepaid:" + creditRatingPrepaid);
        return this;
    }
}
