package dnext.com.pages.createBusinnesCustomerPages;

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
public class AdminInformationPage extends BasePage {

    @FindBy(xpath = "//div[contains(text(),'Admin Information')]")
    public WebElement adminInformationButton;

    @FindBy(xpath = "//div[@class='mat-step-icon mat-step-icon-state-edit mat-step-icon-selected']")
    public WebElement adminInformationIcon;

    @FindBy(css = "[formcontrolname = 'personalNumber']")
    public WebElement identificationNumberField;

    @FindBy(xpath = "//*[@id=\"cdk-step-content-0-2\"]/app-corporate-customer-admin/div/div[3]/form/div[2]/span")
    public WebElement warningForClickingSearchIcon;

    @FindBy(xpath = "(//div[text()='Admin Information']/following::mat-icon[text()='search'])[2]")
    public WebElement searchIconInIdentificationField;

    @FindBy(xpath = "//div[text()='Admin Information']/following::mat-icon[text()='search']")
    public WebElement searchIconInIdentificationFieldAfterOrganizationSearch;

    @FindBy(css = "[formcontrolname = 'firstName']")
    public WebElement firstName;

    @FindBy(css = "[formcontrolname = 'lastName']")
    public WebElement lastName;

    @FindBy(css = "[formcontrolname = 'secondaryName']")
    public WebElement middleName;

    @FindBy(css = "app-corporate-customer-admin [formcontrolname = 'email']")
    public WebElement emailField;

    @FindBy(css = "[formcontrolname = 'birthDate']")
    public WebElement birthDateField;

    @FindBy(css = "[formcontrolname = 'gender']")
    public WebElement genderField;

    @FindBy(css = "[formcontrolname = 'birthCountry']")
    public WebElement countryOfBirthField;

    @FindBy(css = "[formcontrolname = 'placeOfBirth']")
    public WebElement placeOfBirthField;

    @FindBy(css = "input[formcontrolname = 'placeOfBirth']")
    public WebElement placeOfBirthInputField;

    @FindBy(css = "[formcontrolname = 'citizenShip']")
    public WebElement citizenshipField;

    @FindBy(css = "app-corporate-customer-admin [formcontrolname = 'phoneNumber']")
    public WebElement mobilePhoneNumberField;

    @FindBy(css = "input[formcontrolname=workPhoneNumber]")
    public WebElement workPhoneNumberField;

    @FindBy(xpath = "(//*[@formcontrolname = 'authDocType'])[2]")
    public WebElement AdminDocField;

    @FindBy(css = "*[formcontrolname=\"gender\"]")
    public WebElement genderDropdown;

    @FindBy(css = "*[formcontrolname=phoneCodeWork]")
    public WebElement countryCodeDropdown;

    @FindBy(xpath = "//*[@id=\"mat-option-419\"]/span")
    public WebElement albaniaCountryCode;
    @FindBy(xpath = "(//*[.='Phone number must be like 6XXXXXXXX ! '])[2]")
    public WebElement warningOfMobilePhoneNumber;

    @FindBy(xpath = "(//*[.=' You have to add customers ID document!'])[2]")
    public WebElement warningOfDocCustomerIdDocument;
    @FindBy(xpath = "//*[@id=\"cdk-step-content-0-2\"]/app-corporate-customer-admin/div/div[3]/form/div[7]/div[1]/div/button")
    public WebElement addBtn;
    @FindBy(xpath = "//mat-error/..//input[@id='fileInput']")
    public WebElement txtFileInput;

    @FindBy(xpath = "//*[.='File size can not be bigger than 5 MB!']")
    public WebElement warningBiggerSizeFile;
    @FindBy(xpath = "//*[@id=\"file-label\"]/div[1]")
    public WebElement nameOfUploadedFile;
    @FindBy(xpath = "//*[@id=\"file-label\"]/div[2]/a[1]/span/mat-icon")
    public WebElement cancelButton;
    @FindBy(xpath = "//mat-icon[normalize-space()='cancel']")
    public WebElement cancelIconInIdentificationField;
    @FindBy(xpath = "//*[@id=\"cdk-step-content-0-2\"]/div/div/button[2]/span/span")
    public WebElement nextButtonOnAdminInfoPage;
    @FindBy(xpath = "//mat-icon[normalize-space()='create']")
    public WebElement contactPageIcon;
    @FindBy(xpath = "//*[@id=\"cdk-step-content-0-2\"]/app-corporate-customer-admin/div/div[3]/form/div[1]/mat-form-field[2]/div/div[1]/div[2]")
    public WebElement firstNamePictureBtnOnAdminInformationPage;
    @FindBy(xpath = "//*[@id=\"cdk-step-content-0-2\"]/app-corporate-customer-admin/div/div[3]/form/div[3]/mat-form-field[1]/div/div[1]/div[2]")
    public WebElement emailPictureBtnAdminInformationPage;
    @FindBy(xpath = "(//*[@*='mat-option-text'])[1]")
    public WebElement maleOptionOfGender;
    @FindBy(xpath = "//span[@class='mat-option-text'][normalize-space()='ALBANIA']")
    public WebElement albaniaOptionFromCountryDropdown;
    @FindBy(xpath = "//span[normalize-space()='BERAT']")
    public WebElement beratCityFromPlaceOfBirthDropdown;
    @FindBy(xpath = "//*[@id=\"cdk-step-content-0-2\"]/app-corporate-customer-admin/div/div[3]/form/div[4]/mat-form-field[1]/div/div[1]/div[3]/button/span/mat-icon")
    public WebElement cancelButtonOnDateOfbirthField;

    public AdminInformationPage clickAdminInformationIcon() {
        Utils.click(adminInformationButton);
        return this;
    }

    public AdminInformationPage verifyUserIsOnAdminInformationPage() {

        try {
            if (adminInformationIcon.isDisplayed())
                log.info("Icon is displaying");
        } catch (Throwable e) {
            log.info("Error message: Icon is  not displaying");
        }

        return this;
    }

    public AdminInformationPage clickIdentificationNumberField() {
        Utils.waitForPageToLoad();
        Utils.click(identificationNumberField);
        return this;
    }

    public AdminInformationPage inputExistingNumberToIdentificationNumberField(String number) {
        Utils.waitForPageToLoad();
        Utils.sendKeys(identificationNumberField, number);
        return this;
    }

    public AdminInformationPage warningMessageForSearchIcon(String message) {
        Assert.assertEquals(message, warningForClickingSearchIcon.getText());
        return this;
    }

    public AdminInformationPage clickSearchIconInIdentificationField() {
        Utils.click(searchIconInIdentificationField);
        return this;
    }

    public AdminInformationPage verifyOfExistenceNumberInformation(Map<String, String> customerInfo) {

        log.info("Customer fetched informations are :" + customerInfo);
        if (customerInfo.get("Email ") == null) {
            log.info("Customer Email was not given");
            log.info("Customer Mobile Phone Number was not given");
        } else {

            log.info("Error message: Customer info was sent!!!!!");
            log.info("Error message: Customer Mobile Phone Number was sent!!!!!");
        }
        return this;
    }

    public AdminInformationPage verifyUploadingFilesWithDifferentFormats(String fileName) {

        try {
            if (!(fileName.endsWith(".pdf") || fileName.endsWith(".jpg"))) {
                Utils.waitFor(3);
                log.info(fileName + " is not an acceptable format");
            } else {
                uploadFile(addBtn, txtFileInput, fileName);
                //Assert.assertEquals("AdminDoc-" + fileName, nameOfUploadedFile.getText());
                elementDisplayed(nameOfUploadedFile);
                System.out.println("nameOfUploadedFile.getText() = " + nameOfUploadedFile.getText());
            }
        } catch (Exception e) {
            log.error("Error uploading file: " + e.getMessage());
            throw new RuntimeException(e);
        }
        return this;
    }

    public AdminInformationPage verifyTheUploadedBigger5MbSizeFile(String fileName, String warning) {
        uploadFile(addBtn, txtFileInput, fileName);
        Utils.waitForVisibility(warningBiggerSizeFile, 10);
        log.info(warningBiggerSizeFile.getText());
        Assert.assertEquals(warning, warningBiggerSizeFile.getText());
        return this;
    }

    public AdminInformationPage inputEmailAndMobilePhoneNumberOnAdminInfoPage(String email, String phoneNumber) {

        try {
            Utils.waitFor(3);
            Utils.sendKeys(emailField, email);
            Utils.sendKeys(mobilePhoneNumberField, phoneNumber);

        } catch (Exception e) {
            log.info("Texts not inserted!!!");
        }
        return this;
    }

    public AdminInformationPage verifyContactInfoPageIsOpened() {
        try {
            cancelButton.isDisplayed();
        } catch (Exception e) {
            log.info(cancelButton + " is not displayed!!!");
        }
        return this;
    }

    public AdminInformationPage warningBackgroundRedColor() {
        try {
            String expectedRedColorCode = "#f44336";
            String backgroundColor = emailPictureBtnAdminInformationPage.getCssValue("color");
            Color color = Color.fromString(backgroundColor);
            String actualBackRoundColorCode = color.asHex();
            Assert.assertEquals(expectedRedColorCode, actualBackRoundColorCode);
        } catch (Exception e) {
            log.info("Error Message: Red Warning message is not displaying!!");
        }
        return this;
    }

    public AdminInformationPage warningBackgroundIsNotRedColor() {
        Utils.waitFor(1);
        try {
            String expectedRedColorCode = "#f44336";
            String backgroundColor = firstNamePictureBtnOnAdminInformationPage.getCssValue("color");
            org.openqa.selenium.support.Color color = Color.fromString(backgroundColor);
            String actualBackRoundColorCode = color.asHex();
            Assert.assertFalse(expectedRedColorCode.equals(actualBackRoundColorCode));
        } catch (Exception e) {
            log.info("Error Message: Red Warning message is  displaying!!");
        }
        return this;
    }

    public AdminInformationPage enterInvalidFormatEmails(String email) {
        Utils.sendKeys(emailField, email + Keys.TAB);
        return this;
    }

    public AdminInformationPage selectMaleOptionFromGenderDropdown() {
        genderDropdown.click();
        maleOptionOfGender.click();
        return this;
    }

    public AdminInformationPage selectPlaceOfBirthFromDropdown() {
        placeOfBirthField.click();
        selectSpecificOptionFromDropdown("BERAT");
        return this;
    }

    public AdminInformationPage selectDateOfBirth(String date) {
        clickField(birthDateField);
        sendKeys(birthDateField, date);
        return this;
    }

    public AdminInformationPage selectAlbaniaFromDropdown() {
        clickField(countryOfBirthField);
        clickField(albaniaOptionFromCountryDropdown);
        return this;
    }

}
