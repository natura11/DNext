package dnext.com.pages.createBusinnesCustomerPages;
import com.utilities.Driver;
import com.utilities.Utils;
import dnext.com.pages.BasePage;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Random;

import static org.apache.hc.client5.http.utils.DateUtils.formatDate;

@Log4j2
public class GeneralInformationPage extends BasePage {
    @FindBy(xpath = "//*[@formcontrolname=\"organization\"]")
    public WebElement organizationNumberBox;
    @FindBy(xpath = "//*[@id=\"name\"]")
    public WebElement nameBox;
    @FindBy(xpath = "(//*[@formcontrolname=\"industry\"])[1]")
    public WebElement industryDropdown;
    @FindBy(xpath = "//*[text()=' Finance & Insurance ']")
    public WebElement industryDropdownFinanceOption;
    @FindBy(xpath = "//*[text()=' Manufacturing ']")
    public WebElement industryDropdownManufacturingOption;
    @FindBy(xpath = "//*[text()=' Construction ']")
    public WebElement industryDropdownConstructionOption;
    @FindBy(xpath = "//*[text()=' Mining & Agriculture ']")
    public WebElement industryDropdownMiniAgriculereOption;
    @FindBy(xpath = "//*[text()=' Retail & Wholesale ']")
    public WebElement industryDropdownRetailWholesaleOption;
    @FindBy(xpath = "//*[text()=' Professional Services ']")
    public WebElement industryDropdownProfessionalServicesleOption;
    @FindBy(xpath = "//*[text()=' Transport & Logistics ']")
    public WebElement industryDropdownTransportLogisticsOption;
    @FindBy(xpath = "//*[text()=' Media ']")
    public WebElement industryDropdownMediaOption;
    @FindBy(xpath = "//*[text()=' Accommodation & Leisure ']")
    public WebElement industryDropdownAccommodationAndLeisureOption;
    @FindBy(xpath = "//*[text()=' Telecoms ']")
    public WebElement industryDropdownTelecomsOption;
    @FindBy(xpath = "//*[text()=' Utilities ']")
    public WebElement industryDropdownUtilitiesOption;
    @FindBy(xpath = "//*[text()=' Healthcare ']")
    public WebElement industryDropdownHealtcareOption;
    @FindBy(xpath = "//*[text()=' Govt & Education ']")
    public WebElement industryDropdownGovtEducationOption;
    @FindBy(xpath = "//*[text()=' - ']")
    public WebElement emptyOptionFromIndustryDropdown;
    @FindBy(xpath = "//*[@id=\"companyName\"]")
    public WebElement companyNameBox;
    @FindBy(xpath = "//*[@formcontrolname=\"segment\"]")
    public WebElement segmentDropdownBox;
    @FindBy(xpath = "//*[text()=' Corporate ']")
    public WebElement segmentDropdownCorporateOption;
    @FindBy(xpath = "//*[text()=' SME ']")
    public WebElement segmentDropdownSMEOption;
    @FindBy(xpath = "//*[text()=' SOHO ']")
    public WebElement segmentDropdownSOHOoption;
    @FindBy(xpath = "//*[text()=' Other Business ']")
    public WebElement segmentDropdownOtherBusinessOption;
    @FindBy(xpath = "//*[@formcontrolname=\"taxExempt\"]")
    public WebElement taxExemptDropdownBox;
    @FindBy(xpath = "//*[text()=' NO ']")
    public WebElement taxExemptDropdownOOption;
    @FindBy(xpath = "//*[text()=' YES ']")
    public WebElement taxExemptDropdownYESOption;
    @FindBy(xpath = "//*[@formcontrolname=\"communicationMethod\"]")
    public WebElement communicationMethodDropDown;
    @FindBy(xpath = "(//*[text()=' Email '])[2]")
    public WebElement communicationMethodDropDownEmailOption;
    @FindBy(xpath = "//*[text()=' SMS ']")
    public WebElement communicationMethodDropDownSMSOption;
    @FindBy(xpath = "//*[text()=' Email & SMS ']")
    public WebElement communicationMethodDropDownEmailAndSmsOption;
    @FindBy(xpath = "//*[@formcontrolname=\"phoneCode\"]")
    public WebElement countryCodeDropdownBox;
    @FindBy(xpath = "(//*[@formcontrolname=\"phoneNumber\"])[1]")
    public WebElement mobilePhoneNumberBox;
    @FindBy(xpath = "(//*[.='Phone number must be like 6XXXXXXXX ! '] )[2]")
    public WebElement warningMessageTextForInvalidAlbanianPhoneNumber;
    @FindBy(xpath = "//*[@formcontrolname=\"identificationIssuingDate\"]")
    public WebElement issuingDateDropdownBox;
    @FindBy(xpath = "//*[@class=\"mat-form-field-suffix ng-tns-c108-28 ng-star-inserted\"]")
    public WebElement issuingDateIcon;
    @FindBy(xpath = "//*[@class=\"mat-focus-indicator mat-calendar-period-button mat-button mat-button-base\"]")
    public WebElement issuingDateMonth;
    @FindBy(xpath = "//*[@id=\"cdk-step-content-0-1\"]/app-corporate-customer-general/div/form/div[7]/div[1]/div/button")
    public WebElement addDocumentButtonOnNewBusinessCustomer;
    @FindBy(xpath = "//*[@id=\"file-label\"]")
    public WebElement documentNameVerify;
    @FindBy(xpath = "//*[@class=\"mat-error ng-star-inserted\"]")
    public WebElement addWarningDocumentMessage;
    @FindBy(xpath = "//*[@class=\"mat-focus-indicator red-fg mat-button mat-button-base\"]")
    public WebElement deleteDocumentButton;
    @FindBy(xpath = "//span[.='Only image and pdf files are accepted!']")
    public WebElement warningMessageForUnmatchedDocument;
    @FindBy(xpath = "//span[.='File size can not be bigger than 5 MB!']")
    public WebElement warningMessageForBiggerDocument;
    @FindBy(xpath = " //*[@id=\"cdk-step-content-0-1\"]/div/button[2]/span/span")
    public WebElement nextButtonOnGeneralInformationPage;
    @FindBy(xpath = " (//*[@formcontrolname=\"email\"])[1]")
    public WebElement emailBtnOnGeneralInformationPage;
    @FindBy(xpath = "//*[@id=\"cdk-step-content-0-1\"]/app-corporate-customer-general/div/form/div[5]/mat-form-field[1]/div/div[1]/div[2]")
    public WebElement emailPictureBtnOnGeneralInformationPage;
    @FindBy(xpath = "//span[.=' +355 ']")
    public WebElement albanianCountryCode;
    @FindBy(xpath = "//span[.=' +213 ']")
    public WebElement countryCodeExceptAlbanian;
    @FindBy(xpath = "(//*[.='Phone number is required ! '])[2]")
    public WebElement warningMessageForEmptyMobilePhoneNumber;
    @FindBy(xpath = "//*[@formcontrolname=\"identificationIssuingDate\"]")
    public WebElement issuingDateFieldOnGeneralInformationPage;
    @FindBy(xpath = "(//*[.=' You have to add Extract QKR document!'])[1]")
    public WebElement warningOfAddExtractQKRdocumentMessage;
    @FindBy(xpath = "//mat-error/..//input[@id='fileInputGeneral']")
    public WebElement fileInputGeneral;
    @FindBy(xpath = "//*[@id=\"file-label\"]/div[1]")
    public WebElement nameOfUploadedFileOnGeneral;

    public GeneralInformationPage verificationOfNameBox() {
        Utils.waitFor(1);
        Assert.assertTrue(nameBox.isDisplayed());
        log.info(nameBox + "is displyaing");
        return this;
    }

    public GeneralInformationPage usingValidFormatName(String validName) {
        Utils.waitForPageToLoad();
        nameBox.sendKeys(validName);
        return this;
    }

    public GeneralInformationPage industryDropdownSelectable() {
        isDropdownSelectable(By.xpath("//*[@class=\"mat-option-text\"]"));
        return this;
    }

    public GeneralInformationPage optionFromIndustryDropdown() {
        optionFromDropdown(By.xpath("//*[@class=\"mat-option-text\"]"));
        return this;
    }

    public GeneralInformationPage segmentDropdownSelectable() {
        isDropdownSelectable(By.xpath("//*[@class=\"mat-option-text\"]"));
        return this;
    }
    public GeneralInformationPage segmentOptionFromDropdown() {
        optionFromDropdown(By.xpath("//*[@class=\"mat-option-text\"]"));
        return this;
    }

    public GeneralInformationPage taxExemptDropdownSelectable() {
        isDropdownSelectable(By.xpath("//*[@class=\"mat-option-text\"]"));
        return this;
    }

    public GeneralInformationPage taxExemptOptionFromDropdown() {
        optionFromDropdown(By.xpath("//*[@class=\"mat-option-text\"]"));
        return this;
    }

    public GeneralInformationPage enterInvalidFormatEmails(String email) {
        Utils.sendKeys(emailBtnOnGeneralInformationPage, email + Keys.TAB);
        return this;
    }
    public GeneralInformationPage warningBackgroundRedColor() {
        try {
            String expectedRedColorCode = "#f44336";
            String backgroundColor = emailPictureBtnOnGeneralInformationPage.getCssValue("color");
            Color color = Color.fromString(backgroundColor);
            String actualBackRoundColorCode = color.asHex();
            Assert.assertEquals(expectedRedColorCode, actualBackRoundColorCode);
        } catch (Exception e) {
            log.info("Error Message: Red Warning message is not displaying!!");
        }
        return this;
    }

    public GeneralInformationPage enterValidFormatEmail(String validEmail) {
        Utils.sendKeys(emailBtnOnGeneralInformationPage, validEmail);
        return this;
    }

    public GeneralInformationPage verifyValidFormatEmail(String dotSign, String tagSign, String email) {
        Assert.assertTrue(String.valueOf(email.contains(dotSign)), email.contains(tagSign));
        return this;
    }

    public GeneralInformationPage communicationMethodDropdownSelectable() {
        isDropdownSelectable(By.xpath("//*[@class=\"mat-option-text\"]"));
        return this;
    }

    public GeneralInformationPage communicationMethodOptionFromDropdown() {
        optionFromDropdown(By.xpath("//*[@class=\"mat-option-text\"]"));
        return this;
    }

    public GeneralInformationPage verifyEnterInvalidFormatMobilePhoneNumber(String mobile, String message) {
        Utils.sendKeys(mobilePhoneNumberBox, mobile + Keys.TAB);
        Assert.assertEquals(message, warningMessageTextForInvalidAlbanianPhoneNumber.getText());
        return this;
    }


    public GeneralInformationPage enteringOtherNumbers() {
        Utils.click(countryCodeExceptAlbanian);
        Utils.click(mobilePhoneNumberBox);
        return this;
    }

    public GeneralInformationPage verifyEnteringOtherNumbers(String message) {
        try {
            Utils.sendKeys(mobilePhoneNumberBox, "" + Keys.TAB);
            Assert.assertEquals(message, warningMessageForEmptyMobilePhoneNumber.getText());
        } catch (Exception e) {
            log.info(message + "is not displaying");
        }
        return this;
    }

    public GeneralInformationPage inputOtherMobilePhoneNumberExceptAlbanian() {
        Utils.sendKeys(mobilePhoneNumberBox, "012345678901234");
        return this;
    }

    public GeneralInformationPage inputValidMobilePhoneNumber(String phoneNumber) {
        Utils.sendKeys(mobilePhoneNumberBox, phoneNumber);
        return this;
    }

    public GeneralInformationPage verifyDateFromCalendarOnGeneralInfo(String date) {
        clickField(issuingDateFieldOnGeneralInformationPage);
        verifyDateFromCalendar(date, issuingDateFieldOnGeneralInformationPage);
        return this;
    }

    public GeneralInformationPage verifyTheUploadedBigger5MbSizeFile(String fileName, String warning) {
        try {
            uploadFile(addDocumentButtonOnNewBusinessCustomer, fileInputGeneral, fileName);
            Assert.assertEquals(warning, warningMessageForBiggerDocument.getText());
        } catch (Exception e) {
            log.info("Warning message not shown!!!");
        }
        return this;
    }
}
