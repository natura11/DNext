package dnext.com.pages.createBusinessCustomerPages;

import com.utilities.CustomerFakerDataCreator;
import com.utilities.Utils;
import dnext.com.pages.BasePage;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.apache.hc.client5.http.utils.DateUtils.formatDate;

@Log4j2
public class GeneralInformationBusinessPage extends BasePage {

    @FindBy(xpath = "//div[contains(text(),'General Information')]//ancestor::mat-step-header")
    public WebElement generalInformationButtonSelectedLabel;  // aria-selected : true will be validated

    public String companyNameFieldForEquals;
    @FindBy(xpath = "//*[@formcontrolname='organization']")
    public WebElement organizationNumberBox;
    @FindBy(xpath = "//input[@id='name']")
    public WebElement organizationNameInput;
    @FindBy(xpath = "//input[@formcontrolname='companyName']")
    public WebElement companyNameInput;
    @FindBy(xpath = "(//*[@formcontrolname='industry'])[1]")
    public WebElement industryDropdown;
    @FindBy(xpath = "//*[text()=' - ']")
    public WebElement emptyOptionFromIndustryDropdown;
    @FindBy(xpath = "//*[@id='companyName']")
    public WebElement companyNameBox;
    @FindBy(xpath = "//*[@formcontrolname='segment']")
    public WebElement segmentDropdownBox;
    @FindBy(xpath = "//*[text()=' Corporate ']")
    public WebElement segmentDropdownCorporateOption;
    @FindBy(xpath = "//*[text()=' SME ']")
    public WebElement segmentDropdownSMEOption;
    @FindBy(xpath = "//*[text()=' SOHO ']")
    public WebElement segmentDropdownSOHOoption;
    @FindBy(xpath = "//*[text()=' Other Business ']")
    public WebElement segmentDropdownOtherBusinessOption;
    @FindBy(xpath = "//*[@formcontrolname='taxExempt']")
    public WebElement taxExemptDropdownBox;
    @FindBy(xpath = "//*[text()=' NO ']")
    public WebElement taxExemptDropdownOOption;
    @FindBy(xpath = "//*[text()=' YES ']")
    public WebElement taxExemptDropdownYESOption;
    @FindBy(xpath = "//*[@formcontrolname='communicationMethod']")
    public WebElement communicationMethodDropDown;
    @FindBy(xpath = "(//*[text()=' Email '])[2]")
    public WebElement communicationMethodDropDownEmailOption;
    @FindBy(xpath = "//*[text()=' SMS ']")
    public WebElement communicationMethodDropDownSMSOption;
    @FindBy(xpath = "//*[text()=' Email & SMS ']")
    public WebElement communicationMethodDropDownEmailAndSmsOption;
    @FindBy(xpath = "//*[@formcontrolname='phoneCode']")
    public WebElement countryCodeDropdownBox;
    @FindBy(xpath = "(//*[@formcontrolname='phoneNumber'])[1]")
    public WebElement mobilePhoneNumberBox;
    @FindBy(xpath = "(//*[.='Phone number must be like 6XXXXXXXX ! '] )[2]")
    public WebElement warningMessageTextForInvalidAlbanianPhoneNumber;

    @FindBy(xpath = "//*[@formcontrolname='identificationIssuingDate']/following::button[@aria-label='Add Document']")
    public WebElement addDocumentButtonOnNewBusinessCustomer;
    @FindBy(xpath = "//*[@id='file-label']")
    public WebElement documentNameVerify;
    @FindBy(xpath = "//*[@class='mat-error ng-star-inserted']")
    public WebElement addWarningDocumentMessage;
    @FindBy(xpath = "//*[@formcontrolname='identificationIssuingDate']/following::mat-icon[text()='cancel']")
    public WebElement deleteDocumentButton;
    @FindBy(xpath = "//span[.='Only image and pdf files are accepted!']")
    public WebElement warningMessageForUnmatchedDocument;
    @FindBy(xpath = "//span[.='File size can not be bigger than 5 MB!']")
    public WebElement warningMessageForBiggerDocument;
    @FindBy(xpath = "(//*[@formcontrolname='email'])[1]")
    public WebElement emailFieldOnGeneral;
    @FindBy(xpath = "(//*[@formcontrolname='email'])[1]/parent::div/preceding-sibling::div[1]")
    public WebElement emailPictureBtnOnGeneralInformationPage;
    @FindBy(xpath = "//span[.=' +355 ']")
    public WebElement albanianCountryCode;
    @FindBy(xpath = "//span[.=' +213 ']")
    public WebElement countryCodeExceptAlbanian;
    @FindBy(xpath = "(//*[.='Phone number is required ! '])[2]")
    public WebElement warningMessageForEmptyMobilePhoneNumber;
    @FindBy(xpath = "//*[@formcontrolname='identificationIssuingDate']")
    public WebElement issuingDateField;
    @FindBy(xpath = "//*[@formcontrolname='identificationIssuingDate']/parent::div/preceding-sibling::div[2]")
    public WebElement issuingDateBackgroundField;
    @FindBy(xpath = "(//*[.=' You have to add Extract QKR document!'])[1]")
    public WebElement warningOfAddExtractQKRdocumentMessage;
    @FindBy(xpath = "//mat-error/..//input[@id='generalFileInput']")
    public WebElement fileInputGeneral;
    @FindBy(xpath = "//*[@id='file-label']/div[1]")
    public WebElement nameOfUploadedFileOnGeneral;
    @FindBy(xpath = "(//span[text()='Next'])[2]//ancestor::button")
    public WebElement nextBtnOnGeneralInformation;
    @FindBy(xpath = "(//span[text()='Back'])[1]//ancestor::button")
    public WebElement backBtnOnGeneralInformation;

    CustomerFakerDataCreator customerFakerDataCreator = new CustomerFakerDataCreator();

    public void verifyUserIsOnGeneralInformationPage() {
        try {
            elementDisplayed(generalInformationButtonSelectedLabel);
            Assert.assertEquals("true", generalInformationButtonSelectedLabel.getAttribute("aria-selected"));
            log.info("Other Information Page is displaying");
        } catch (Throwable e) {
            log.info("Error message: Other Information Page is  not displaying");
        }
    }

    public void verificationOfNameBox() {
        elementDisplayed(organizationNameInput);
        Assert.assertTrue(organizationNameInput.isDisplayed());
        log.info(organizationNameInput + "is displyaing");
    }

    public void usingValidFormatName(String validName) {
        companyNameFieldForEquals = validName;
        Utils.waitForPageToLoad();
        organizationNameInput.sendKeys(validName);
    }

    public void verifyEnterInvalidFormatMobilePhoneNumber(String mobile, String message) {
        mobilePhoneNumberBox.clear();
        Utils.sendKeys(mobilePhoneNumberBox, mobile + Keys.TAB);
        Assert.assertEquals(message, warningMessageTextForInvalidAlbanianPhoneNumber.getText());
    }

    public void enteringOtherNumbers() {
        Utils.click(countryCodeExceptAlbanian);
        Utils.click(mobilePhoneNumberBox);
    }

    public void verifyEnteringOtherNumbers(String message) {
        try {
            Utils.sendKeys(mobilePhoneNumberBox, "" + Keys.TAB);
            Assert.assertEquals(message, warningMessageForEmptyMobilePhoneNumber.getText());
        } catch (Exception e) {
            log.info(message + "is not displaying");
        }
    }

    public void fillOrganizationNameWithRandomString(){
        sendKeys(organizationNameInput,
                customerFakerDataCreator.organizationNameFromFaker() + " AUTOMATION");
    }

    public void verifyDateFromCalendarOnGeneralInfo() {
        clickField(issuingDateField);
        sendKeys(issuingDateField,
                customerFakerDataCreator.invalidIssuingDateFromFaker());
        performKeyboardAction(Keys.TAB);
        warningBackgroundRedColorOne(issuingDateBackgroundField, true);
    }

    public void verifyTheUploadedBigger5MbSizeFile(String fileName, String warning) {
        try {
            uploadFile(addDocumentButtonOnNewBusinessCustomer, fileInputGeneral, fileName);
            Assert.assertEquals(warning, warningMessageForBiggerDocument.getText());
        } catch (Exception e) {
            log.info("Warning message not shown!!!");
        }
    }

    public void verifyTheCompanyNameIsSame(){
        Assert.assertEquals(getValueByMouseKeyboardAction(organizationNameInput),
                            getValueByMouseKeyboardAction(companyNameInput));
    }

    public void fillEmailWithRandomEmail(){
        sendKeys(emailFieldOnGeneral,
                customerFakerDataCreator.emailFromFaker());
    }

    public void fillPhoneNumberWithRandomNumber(){
        sendKeys(mobilePhoneNumberBox,
                customerFakerDataCreator.phoneFromFaker());
    }

    public void fillIssuingDateWithRandomValidDate(){
        sendKeys(issuingDateField,
                customerFakerDataCreator.issuingDateFromFaker());
    }

    public void verifyUploadedExtractQkrDocument(String fileName) {
        Utils.waitForVisibility(nameOfUploadedFileOnGeneral, 5);
        Assert.assertEquals("DOCUMENT-" + fileName, nameOfUploadedFileOnGeneral.getText().trim());
    }
}