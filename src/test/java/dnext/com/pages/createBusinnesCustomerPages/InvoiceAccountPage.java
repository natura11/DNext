package dnext.com.pages.createBusinnesCustomerPages;

import com.utilities.Driver;
import com.utilities.Utils;
import dnext.com.pages.BasePage;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Map;
import java.util.Random;

@Log4j2
public class InvoiceAccountPage extends BasePage {

    @FindBy(xpath = "//div[contains(text(),'Invoice Account')]")
    public WebElement invoiceAccountButton;

    @FindBy(xpath = "//h2[contains(text(), 'POSTPAID ACCOUNT')]")
    public WebElement postpaidAccountTitleLabel;

    @FindBy(xpath = "//mat-select[@formcontrolname='presentationMedia']")
    public WebElement billMediaField;

    @FindBy(xpath = "//mat-select[@formcontrolname='currency']")
    public WebElement postpaidCurrencyDropdown;

    @FindBy(xpath = "//input[@formcontrolname='description']")
    public WebElement postpaidDescriptionInput;

    @FindBy(xpath = "//mat-select[@formcontrolname='paymentMethod']")
    public WebElement paymentMethodDropdown;

    @FindBy(xpath = "//mat-select[@formcontrolname='bank']")
    public WebElement bankNameDropdown;

    @FindBy(xpath = "//input[@formcontrolname='accountNumber']")
    public WebElement bankAccountNoInput;

    @FindBy(xpath = "//input[@formcontrolname='eBillEmail']")
    public WebElement eBillEmailInput;

    @FindBy(xpath = "//input[@formcontrolname='eBillEmail']/following::mat-error")
    public WebElement eBillEmailErrorText;

    @FindBy(xpath = "//mat-select[@formcontrolname='eBillPhoneCode']")
    public WebElement eBillCountryCodeDropdown;

    @FindBy(xpath = "//span[.=' +355 ']")
    public WebElement albanianCountryCode;
    @FindBy(xpath = "//span[.=' +213 ']")
    public WebElement countryCodeExceptAlbanian;

    @FindBy(xpath = "//input[@formcontrolname='eBillMobileNumber']")
    public WebElement eBillMobileNumberInput;

    @FindBy(xpath = "//input[@formcontrolname='eBillMobileNumber']/following::mat-error")
    public WebElement phoneNumberErrorText;

    @FindBy(xpath = "//mat-select[@formcontrolname='creditRatingForPostpaid']")
    public WebElement postpaidCreditRatingDropdown;

    @FindBy(xpath = "//input[@value='E-Bill Document']")
    public WebElement eBillDocumentTypeField;

    @FindBy(xpath = "//input[@value='E-Bill Document']/following::button")
    public WebElement documentAddButton;

    @FindBy(xpath = "//mat-error/..//input[@id='fileInputGeneral']")
    public WebElement fileInputGeneral;

    @FindBy(xpath = "//input[@value='E-Bill Document']/following::div[@id='file-label']")
    public WebElement eBillDocumentNameField;

    @FindBy(xpath = "//input[@value='E-Bill Document']/following::a[@title='Delete']")
    public WebElement eBillCancelButton;

    @FindBy(xpath = "//h2[contains(text(), 'PREPAID ACCOUNT')]")
    public WebElement prepaidAccountTitleLabel;

    @FindBy(xpath = "//mat-select[@formcontrolname='currencyPrepaid']")
    public WebElement prepaidCurrencyDropdown;

    @FindBy(xpath = "//input[@formcontrolname='descriptionPrepaid']")
    public WebElement prepaidDescriptionInput;

    @FindBy(xpath = "//mat-select[@formcontrolname='creditRatingForPrepaid']")
    public WebElement prepaidCreditRatingDropdown;


    @FindBy(xpath = "//span[.='File size can not be bigger than 5 MB!']")
    public WebElement warningMessageForBiggerDocument;


    public InvoiceAccountPage clickAdminInformationIcon() {
        Utils.click(invoiceAccountButton);
        return this;
    }

    public InvoiceAccountPage verifyUserIsOnInvoiceAccountPage() {

        try {
            if (postpaidAccountTitleLabel.isDisplayed())
                log.info("Account title is displaying");
        } catch (Throwable e) {
            log.info("Error message: Account title is  not displaying");
        }

        return this;
    }

    public InvoiceAccountPage postpaidCurrencyDropdownDisplayed() {
        Utils.waitFor(1);
        Assert.assertTrue(postpaidCurrencyDropdown.isDisplayed());
        log.info(postpaidCurrencyDropdown + "is displaying");
        return this;
    }

    public InvoiceAccountPage currencyDropdownSelectable() {
        isDropdownSelectable(By.xpath("//*[@class=\"mat-option-text\"]"));
        return this;
    }

    public InvoiceAccountPage optionFromCurrencyDropdown() {
        optionFromDropdown(By.xpath("//*[@class=\"mat-option-text\"]"));
        return this;
    }

    public InvoiceAccountPage postpaidDescriptionDisplayed() {
        Utils.waitFor(1);
        Assert.assertTrue(postpaidDescriptionInput.isDisplayed());
        log.info(postpaidDescriptionInput + "is displaying");
        return this;
    }

    public InvoiceAccountPage fillDescriptionField(String descriptionText) {
        Utils.waitForPageToLoad();
        postpaidDescriptionInput.sendKeys(descriptionText);
        return this;
    }

    public InvoiceAccountPage paymentMethodDropdownDisplayed() {
        Utils.waitFor(1);
        Assert.assertTrue(paymentMethodDropdown.isDisplayed());
        log.info(paymentMethodDropdown + "is displaying");
        return this;
    }

    public InvoiceAccountPage paymentMethodDropdownSelectable() {
        isDropdownSelectable(By.xpath("//*[@class=\"mat-option-text\"]"));
        return this;
    }

    public InvoiceAccountPage selectAnOptionFromDropdown(String paymentMethod) {
        List<WebElement> options = Driver.getDriver()
                .findElements(By.xpath("//*[@class=\"mat-option-text\"]"));
        if (!options.isEmpty()) {
            if (paymentMethod.equalsIgnoreCase("Cash")) {
                options.get(0).click();
            } else if (paymentMethod.equalsIgnoreCase("Direct Debit")) {
                options.get(1).click();
            } else {
                options.get(0).click();
            }
            log.info(paymentMethod + " option is selected: ");
        } else {
            log.info("No options found in the dropdown.");
        }
        return this;
    }

    public InvoiceAccountPage bankNameAndBankAccountDisplayed() {
        Utils.waitFor(1);
        Assert.assertTrue(bankNameDropdown.isDisplayed());
        Assert.assertTrue(bankNameDropdown.isDisplayed());
        log.info(bankNameDropdown + " " + bankNameDropdown + " is displaying");
        return this;
    }

    public InvoiceAccountPage bankNameAndBankAccountNotDisplayed() {
        Utils.waitFor(1);
        try {
            Assert.assertFalse(bankNameDropdown.isDisplayed());
            Assert.assertFalse(bankAccountNoInput.isDisplayed());
        }catch (NoSuchElementException exception){
            log.info("bankNameDropdown and bankAccountNoInput are not displaying");
        }

        return this;
    }

    public InvoiceAccountPage optionFromBankNameDropdown() {
        optionFromDropdown(By.xpath("//*[@class=\"mat-option-text\"]"));
        return this;
    }

    public InvoiceAccountPage fillBankAccountNoField(String accountNo) {
        Utils.waitForPageToLoad();
        bankAccountNoInput.sendKeys(accountNo);
        return this;
    }

    public InvoiceAccountPage eBillEmailTextBoxDisplayed() {
        Utils.waitFor(1);
        Assert.assertTrue(eBillEmailInput.isDisplayed());
        log.info(eBillEmailInput + "is displaying");
        return this;
    }

    public InvoiceAccountPage eBillMobileNumberTextBoxDisplayed() {
        Utils.waitFor(1);
        Assert.assertTrue(eBillMobileNumberInput.isDisplayed());
        log.info(eBillMobileNumberInput + "is displaying");
        return this;
    }

    public InvoiceAccountPage verifyEnterInvalidFormatEmail(String email, String message) {
        Utils.sendKeys(eBillEmailInput, email + Keys.TAB);
        Assert.assertEquals(message, eBillEmailErrorText.getText().trim());
        return this;
    }

    public InvoiceAccountPage enterValidFormatEmail(String validEmail) {
        Utils.sendKeys(eBillEmailInput, validEmail);
        return this;
    }

    public InvoiceAccountPage verifyValidFormatEmail(String dotSign, String tagSign, String email) {
        Assert.assertTrue(String.valueOf(email.contains(dotSign)), email.contains(tagSign));
        return this;
    }

    public InvoiceAccountPage verifyEnterInvalidFormatMobilePhoneNumber(String mobile, String message) {
        Utils.sendKeys(eBillMobileNumberInput, mobile + Keys.TAB);
        Assert.assertEquals(message, phoneNumberErrorText.getText().trim());
        return this;
    }

    public InvoiceAccountPage leaveBlankMobileNumber(String message) {
        Utils.sendKeys(eBillMobileNumberInput, "" + Keys.TAB);
        Assert.assertEquals(message, phoneNumberErrorText.getText().trim());
        return this;
    }

    public InvoiceAccountPage phoneNumberWarningMessageNotDisplayed(String message) {
        Utils.waitFor(1);
        try {
            Assert.assertFalse(phoneNumberErrorText.isDisplayed());
        }catch (NoSuchElementException exception){
            log.info("phoneNumberErrorText is not displaying");
        }

        return this;
    }

    public InvoiceAccountPage fillOtherMobilePhoneNumberExceptAlbanian(String phoneNumber) {
        Utils.sendKeys(eBillMobileNumberInput, phoneNumber);
        return this;
    }

    public InvoiceAccountPage fillValidMobilePhoneNumber(String mobile) {
        Utils.sendKeys(eBillMobileNumberInput, mobile + Keys.TAB);
        return this;
    }

    public InvoiceAccountPage postpaidCreditRatingDropdownDisplayed() {
        Utils.waitFor(1);
        Assert.assertTrue(postpaidCreditRatingDropdown.isDisplayed());
        log.info(postpaidCreditRatingDropdown + "is displaying");
        return this;
    }

    public InvoiceAccountPage postpaidCreditRatingDropdownSelectable() {
        isDropdownSelectable(By.xpath("//*[@class=\"mat-option-text\"]"));
        return this;
    }

    public InvoiceAccountPage optionFromPostpaidCreditRatingDropdown() {
        optionFromDropdown(By.xpath("//*[@class=\"mat-option-text\"]"));
        return this;
    }

    public InvoiceAccountPage verifyTheUploadedBigger5MbSizeFile(String fileName, String warning) {
        try {
            uploadFile(documentAddButton, fileInputGeneral, fileName);
            Assert.assertEquals(warning, warningMessageForBiggerDocument.getText());
        } catch (Exception e) {
            log.info("Warning message not shown!!!");
        }
        return this;
    }

    public InvoiceAccountPage eBillDocumentNameDisplayed() {
        Utils.waitFor(1);
        Assert.assertTrue(eBillDocumentNameField.isDisplayed());
        log.info(eBillDocumentNameField + "is displaying");
        return this;
    }

    public InvoiceAccountPage prepaidCurrencyDropdownDisplayed() {
        Utils.waitFor(1);
        Assert.assertTrue(prepaidCurrencyDropdown.isDisplayed());
        log.info(prepaidCurrencyDropdown + "is displaying");
        return this;
    }

    public InvoiceAccountPage prepaidCurrencyDropdownNotSelectable() {
        isDropdownSelectable(By.xpath("//*[@class=\"mat-option-text\"]"));
        return this;
    }

    public InvoiceAccountPage prepaidCreditRatingDropdownDisplayed() {
        Utils.waitFor(1);
        Assert.assertTrue(prepaidCreditRatingDropdown.isDisplayed());
        log.info(prepaidCreditRatingDropdown + "is displaying");
        return this;
    }

    public InvoiceAccountPage prepaidCreditRatingDropdownSelectable() {
        isDropdownSelectable(By.xpath("//*[@class=\"mat-option-text\"]"));
        return this;
    }

    public InvoiceAccountPage optionFromPrepaidCreditRatingDropdown() {
        optionFromDropdown(By.xpath("//*[@class=\"mat-option-text\"]"));
        return this;
    }


}
