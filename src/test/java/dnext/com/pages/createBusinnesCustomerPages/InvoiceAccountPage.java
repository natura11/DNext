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
import org.openqa.selenium.support.FindBy;

import java.util.List;

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

    @FindBy(xpath = "//input[@formcontrolname='eBillEmail']" +
                    "/parent::div/preceding-sibling::div[1]")
    public WebElement eBillEmailInputDiv;

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

    @FindBy(xpath = "//input[@formcontrolname='eBillMobileNumber']" +
                    "/parent::div/preceding-sibling::div[1]")
    public WebElement eBillMobileNumberInputDiv;

    @FindBy(xpath = "//input[@formcontrolname='eBillMobileNumber']/following::mat-error")
    public WebElement phoneNumberErrorText;

    @FindBy(xpath = "//mat-select[@formcontrolname='creditRatingForPostpaid']")
    public WebElement postpaidCreditRatingDropdown;

    @FindBy(xpath = "//input[@value='E-Bill Document']")
    public WebElement eBillDocumentTypeField;

    @FindBy(xpath = "//input[@value='E-Bill Document']/following::button")
    public WebElement documentAddButton;

    @FindBy(xpath = "//input[@formcontrolname='eBillAttachment']/following-sibling::input")
    public WebElement fileInputField;

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

    @FindBy(xpath = "(//span[text()='Next'])[6]//ancestor::button")
    public WebElement nextButtonOnInvoiceAccountPage;

    @FindBy(xpath = "(//span[text()='Back'])[5]//ancestor::button")
    public WebElement backButtonOnInvoiceAccountPage;


    public void verifyUserIsOnInvoiceAccountPage() {
        try {
            if (postpaidAccountTitleLabel.isDisplayed())
                log.info("Account title is displaying");
        } catch (Throwable e) {
            log.info("Error message: Account title is  not displaying");
        }
    }

    public void fillInputField(WebElement element, String text) {
        element.clear();
        Utils.sendKeys(element, text + Keys.TAB);
    }

    public void selectAnOptionFromDropdown(String paymentMethod) {
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
    }

    public void bankNameAndBankAccountDisplayed() {
        Utils.waitFor(1);
        Assert.assertTrue(bankNameDropdown.isDisplayed());
        Assert.assertTrue(bankAccountNoInput.isDisplayed());
        log.info(bankNameDropdown.getTagName() + " " +
                bankNameDropdown.getTagName() + " is displaying");
    }

    public void bankNameAndBankAccountNotDisplayed() {
        Utils.waitFor(1);
        try {
            Assert.assertFalse(bankNameDropdown.isDisplayed());
            Assert.assertFalse(bankAccountNoInput.isDisplayed());
        }catch (NoSuchElementException exception){
            log.info("bankNameDropdown and bankAccountNoInput are not displaying");
        }
    }

    public void verifyInputErrorMessage(WebElement webElement, String message) {
        elementDisplayed(webElement);
        Assert.assertEquals(message, webElement.getText().trim());
    }

}
