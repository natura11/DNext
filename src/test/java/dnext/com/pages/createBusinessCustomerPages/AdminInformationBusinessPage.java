package dnext.com.pages.createBusinessCustomerPages;

import com.utilities.CustomerFakerDataCreator;
import com.utilities.Utils;
import dnext.com.pages.BasePage;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;

import java.util.Map;

@Log4j2
public class AdminInformationBusinessPage extends BasePage {
    @FindBy(xpath = "//div[contains(text(),'Admin Information')]")
    public WebElement adminInformationButton;
    @FindBy(xpath = "//div[@class='mat-step-icon mat-step-icon-state-edit mat-step-icon-selected']")
    public WebElement adminInformationIcon;
    @FindBy(xpath = "//*[@formcontrolname = 'personalNumber']")
    public WebElement identificationNumberField;
    @FindBy(xpath = "//*[@formcontrolname = 'personalNumberWithName']")
    public WebElement identificationNumberFieldAfterSearch;
    @FindBy(xpath = "//input[@formcontrolname='personalNumber']/following::div[@fxlayout='row']/span")
    public WebElement warningForClickingSearchIcon;
    @FindBy(xpath = "//*[@formcontrolname = 'personalNumber']/following::mat-icon[text()='search']")
    public WebElement searchIconInIdentificationField;
    @FindBy(xpath = "//*[@formcontrolname = 'personalNumberWithName']/following::mat-icon[text()='cancel']")
    public WebElement cancelIconInIdentificationFieldAfterOrganizationSearch;
    @FindBy(xpath = "//*[@formcontrolname='firstName']")
    public WebElement firstName;
    @FindBy(xpath = "//*[@formcontrolname='lastName']")
    public WebElement lastName;
    @FindBy(xpath = "//*[@formcontrolname='secondaryName']")
    public WebElement middleName;
    @FindBy(xpath = "//*[@formcontrolname='secondaryName']/following::input[@formcontrolname='email']")
    public WebElement emailField;
    @FindBy(xpath = "//*[@formcontrolname='gender']")
    public WebElement genderDropdown;
    @FindBy(xpath = "//*[@formcontrolname='gender']//span/span")
    public WebElement genderDropdownSelectedOption;
    @FindBy(xpath = "(//*[@*='mat-option-text'])[1]")
    public WebElement maleOptionOfGender;
    @FindBy(xpath = "//*[@formcontrolname = 'birthDate']")
    public WebElement birthDateField;
    @FindBy(xpath = "//*[@formcontrolname = 'citizenShip']")
    public WebElement citizenshipField;
    @FindBy(xpath = "//*[@formcontrolname = 'citizenShip']//span/span")
    public WebElement citizenshipFieldSelectedOption;
    @FindBy(xpath = "//*[@formcontrolname = 'birthCountry']")
    public WebElement countryOfBirthField;
    @FindBy(xpath = "//*[@formcontrolname = 'birthCountry']//span/span")
    public WebElement countryOfBirthFieldSelectedOption;
    @FindBy(xpath = "//*[@formcontrolname = 'placeOfBirth']")
    public WebElement placeOfBirthField;
    @FindBy(xpath = "//*[@formcontrolname = 'placeOfBirth']//span/span")
    public WebElement placeOfBirthFieldSelectedOption;
    @FindBy(xpath = "//*[@formcontrolname=phoneCodeWork]")
    public WebElement countryCodeDropdown;
    @FindBy(xpath = "//*[@id='mat-option-419']/span")
    public WebElement albaniaCountryCode;
    @FindBy(xpath = "//input[@formcontrolname='workPhoneNumber']")
    public WebElement workPhoneNumberField;
    @FindBy(xpath = "//input[@formcontrolname='workPhoneNumber']/following::*[@formcontrolname='phoneNumber']")
    public WebElement mobilePhoneNumberField;
    @FindBy(xpath = "(//*[.='Phone number must be like 6XXXXXXXX ! '])[2]")
    public WebElement warningOfMobilePhoneNumber;

    @FindBy(xpath = "(//*[@formcontrolname = 'authDocType'])[2]")
    public WebElement AdminDocField;
    @FindBy(xpath = "(//*[.=' You have to add customers ID document!'])[2]")
    public WebElement warningOfDocCustomerIdDocument;
    @FindBy(xpath = "//span[text()='AdminDoc']/following::button[@aria-label='Add Document']")
    public WebElement addButton;
    @FindBy(xpath = "//mat-error/..//input[@id='adminFileInput']")
    public WebElement txtFileInput;
    @FindBy(xpath = "//*[.='File size can not be bigger than 5 MB!']")
    public WebElement warningBiggerSizeFile;
    @FindBy(xpath = "//span[text()='AdminDoc']/following::div[contains(text(),'AdminDoc')]")
    public WebElement nameOfUploadedFile;
    @FindBy(xpath = "//span[text()='AdminDoc']/following::mat-icon[text()='cancel']")
    public WebElement cancelButton;
    @FindBy(xpath = "(//span[text()='Next'])[3]//ancestor::button")
    public WebElement nextButtonOnAdminInfoPage;

    @FindBy(xpath = "//*[@formcontrolname='firstName']/parent::div/preceding-sibling::div[1]")
    public WebElement firstNamePictureBtnOnAdminInformationPage;
    @FindBy(xpath = "//*[@formcontrolname='secondaryName']/following::input[@formcontrolname='email']/parent::div/preceding-sibling::div[1]")
    public WebElement emailPictureBtnAdminInformationPage;

    @FindBy(xpath = "//span[@class='mat-option-text'][normalize-space()='ALBANIA']")
    public WebElement albaniaOptionFromCountryDropdown;
    @FindBy(xpath = "//*[@formcontrolname='secondaryName']/following::mat-icon[text()='close']")
    public WebElement cancelButtonOnDateOfbirthField;

    CustomerFakerDataCreator customerFakerDataCreator = new CustomerFakerDataCreator();

    public void verifyUserIsOnAdminInformationPage() {
        try {
            if (adminInformationIcon.isDisplayed())
                log.info("Icon is displaying");
        } catch (Throwable e) {
            log.info("Error message: Icon is  not displaying");
        }
    }

    public void clickIdentificationNumberField() {
        Utils.waitForPageToLoad();
        Utils.click(identificationNumberField);
    }

    public void inputExistingNumberToIdentificationNumberField(String number) {
        Utils.waitForPageToLoad();
        Utils.sendKeys(identificationNumberField, number);
    }

    public void warningMessageForSearchIcon(String message) {
        Assert.assertEquals(message, warningForClickingSearchIcon.getText());
    }


    public void verifyUploadingFilesWithDifferentFormats(String fileName) {
        if (!(fileName.endsWith(".pdf") || fileName.endsWith(".jpg"))) {
            Utils.waitFor(3);
            log.info(fileName + " is not an acceptable format");
        } else {
            uploadAdminDocument(fileName);
        }
    }

    public void uploadAdminDocument(String fileName) {
        try {
            uploadFile(addButton, txtFileInput, fileName);
        } catch (Exception e) {
            log.error("Error uploading file: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public void verifyUploadedAdminDocument(String fileName) {
        Utils.waitForVisibility(nameOfUploadedFile, 10);
        Assert.assertEquals("AdminDoc-" + fileName, nameOfUploadedFile.getText().trim());
    }

    public void verifyTheUploadedBigger5MbSizeFile(String fileName, String warning) {
        uploadFile(addButton, txtFileInput, fileName);
        Utils.waitForVisibility(warningBiggerSizeFile, 10);
        log.info(warningBiggerSizeFile.getText());
        Assert.assertEquals(warning, warningBiggerSizeFile.getText());
    }

    public void inputEmailAndMobilePhoneNumberOnAdminInfoPage(String email, String phoneNumber) {
        try {
            Utils.waitFor(3);
            Utils.sendKeys(emailField, email);
            Utils.sendKeys(mobilePhoneNumberField, phoneNumber);
        } catch (Exception e) {
            log.info("Texts not inserted!!!");
        }
    }

    public void selectMaleOptionFromGenderDropdown() {
        Utils.click(genderDropdown);
        maleOptionOfGender.click();
    }

    public void selectPlaceOfBirthFromDropdown() {
        placeOfBirthField.click();
        selectSpecificOptionFromDropdown("BERAT");
    }

    public void selectDateOfBirth(String date) {
        clickField(birthDateField);
        sendKeys(birthDateField, date);
    }

    public void selectAlbaniaFromDropdown() {
        clickField(countryOfBirthField);
        clickField(albaniaOptionFromCountryDropdown);
    }

    public void fillEmailWithRandomEmail() {
        sendKeys(emailField,
                customerFakerDataCreator.emailFromFaker());
    }

    public void fillPhoneNumberWithRandomNumber() {
        sendKeys(mobilePhoneNumberField,
                customerFakerDataCreator.phoneFromFaker());
    }

    public void verifyFetchedPersonData(Map<String, String> personData) {
        Assert.assertEquals(personData.get("Identification Number"), (getValueByMouseKeyboardAction(identificationNumberFieldAfterSearch).split(" "))[0]);
        Assert.assertEquals(personData.get("First Name"), getValueByMouseKeyboardAction(firstName));
        Assert.assertEquals(personData.get("Last Name"), getValueByMouseKeyboardAction(lastName));
        Assert.assertEquals(personData.get("Birth Date"), getValueByMouseKeyboardAction(birthDateField));
        Assert.assertEquals(personData.get("Gender"), (genderDropdownSelectedOption.getText().split(" "))[1]);
        Assert.assertEquals(personData.get("Citizenship"), citizenshipFieldSelectedOption.getText());
        Assert.assertEquals(personData.get("Country Of Birth"), countryOfBirthFieldSelectedOption.getText());
        Assert.assertEquals(personData.get("Place Of Birth"), placeOfBirthFieldSelectedOption.getText());
    }
}