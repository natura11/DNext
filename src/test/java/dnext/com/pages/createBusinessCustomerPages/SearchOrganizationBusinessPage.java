package dnext.com.pages.createBusinessCustomerPages;

import com.utilities.CustomerFakerDataCreator;
import com.utilities.Driver;
import com.utilities.Utils;
import dnext.com.pages.BasePage;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class SearchOrganizationBusinessPage extends BasePage {
    public String nonExistenceNiptNumber;

    @FindBy(xpath = "//mat-icon[normalize-space()='create']")
    public WebElement searchOrganizationIcon;
    @FindBy(xpath = "//mat-select[@formcontrolname='customerType']")
    public WebElement customerTypeDropdown;
    @FindBy(xpath = "//span[.=' Albanian Customer ']")
    public WebElement albanianCustomerInDropdown;
    @FindBy(xpath = "//span[normalize-space()='Foreign Customer']")
    public WebElement foreignCustomerInDropdown;
    @FindBy(xpath = "//input[@formcontrolname = 'organizationNumber']")
    public WebElement niptNumberField;
    @FindBy(xpath = "//input[@formcontrolname = 'organizationNumberWithName']")
    public WebElement niptNumberFieldWithNewCustomer;

    @FindBy(xpath = "//span[normalize-space()='Search']/parent::button")
    public static WebElement searchBtnOnSearchOrganizationPage;
    @FindBy(xpath = "(//span[text()='Next'])[1]//ancestor::button")
    public WebElement nextBtnOnSearchOrganizationPage;
    @FindBy(xpath = "//mat-error[@id='mat-error-0']")
    public WebElement warningInvalidNıptNumber;
    @FindBy(xpath = "//span[contains(text(),'This organization cannot have more than one custom')]")
    public WebElement warningWithExistingNiptNumber;

    CustomerFakerDataCreator customerFakerDataCreator = new CustomerFakerDataCreator();

    public void getCurrentUrl(String currentUrl) {
        Utils.waitFor(3);
        Driver.getDriver().getCurrentUrl();
        System.out.println("Driver.getDriver().getCurrentUrl() = " + Driver.getDriver().getCurrentUrl());
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(currentUrl));
    }

    public void popUpWarningValidationOfExistenceNumber(String popUpMessage) {
        Utils.waitFor(3);
        String actualMessage = warningWithExistingNiptNumber.getText();
        Assert.assertEquals(popUpMessage, actualMessage);
    }

    public void usingExistenceNiptNumber(String number) {
        Utils.waitForPageToLoad();
        niptNumberField.sendKeys(number);
    }

    public void usingNonExistenceNiptNumber(String number) {
        elementDisplayed(niptNumberField);
        nonExistenceNiptNumber = number;
        Utils.waitForPageToLoad();
        niptNumberField.sendKeys(number);
    }

    public void selectOfAlbanianCustomerType() {
        Utils.waitForPageToLoad();
        Utils.click(customerTypeDropdown);
        Utils.click(albanianCustomerInDropdown);
    }

    public void selectOfForeignCustomerType() {
        Utils.waitFor(3);
        Utils.click(customerTypeDropdown);
        Utils.click(foreignCustomerInDropdown);
    }

    public void openCreateBusinessCustomerPage() {
        elementDisplayed(dnextlogoOnNavbar);
        Utils.hover(dnextlogoOnNavbar);
        Utils.waitFor(3);
        Utils.click(createBusinessCustomerBtn);
    }

    public void negativNiptInput(String inavlidFormatNipt) {
        Utils.sendKeys(niptNumberField, inavlidFormatNipt + Keys.ENTER);
    }

    public void warningMessageOfnegativNiptInput(String warningMessage) {
        String actualWarning = warningInvalidNıptNumber.getText();
        log.info(actualWarning + "is " + warningMessage);
        Assert.assertEquals(warningMessage, actualWarning);
    }

    public void searchBtnClickOnSearchOrgPage() {
        Utils.click(searchBtnOnSearchOrganizationPage);
    }

    public void nextBtnClickOnSearchPage() {
        elementDisplayed(nextBtnOnSearchOrganizationPage);
        Utils.click(nextBtnOnSearchOrganizationPage);
    }

    public void verifySearchBtnEnable() {
        Utils.waitFor(3);
        String isDisabled = searchBtnOnSearchOrganizationPage.getAttribute("disabled");
        if (isDisabled != null && isDisabled.equals("true")) {
            System.out.println("The search button is disabled.");
        }
    }

    public void fillNIPTFieldWithRandomForeignNumber() {
        Utils.sendKeys(niptNumberField, customerFakerDataCreator.niptNumberForForeign());
    }

    public void fillNIPTFieldWithRandomAlbanianNumber() {
        sendKeys(niptNumberField,
                customerFakerDataCreator.niptNumberForAlbanian());
    }

    public void checkNIPTIsAvailableOrNot() {
        String warningMessageXpath = "//span[text()='This organization cannot have more than one customer connected to it']";
        boolean isNumberAvailable = false;
        do {
            Utils.waitFor(3);
            if (!Driver.getDriver().findElements(By.xpath(warningMessageXpath)).isEmpty()) {
                niptNumberField.clear();
                fillNIPTFieldWithRandomAlbanianNumber();
                clickField(searchBtnOnSearchOrganizationPage);
            } else {
                isNumberAvailable = true;
            }
        } while (!isNumberAvailable);
    }

    public void verifyOrganizationIsNew() {
        Assert.assertTrue(getValueByMouseKeyboardAction(niptNumberFieldWithNewCustomer).contains("New Customer"));
    }
}