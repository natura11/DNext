package dnext.com.pages.createBusinnesCustomerPages;

import com.github.javafaker.Faker;
import com.utilities.Driver;
import com.utilities.Utils;
import dnext.com.pages.BasePage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.NoSuchElementException;

@Log4j2
public class SearchOrganizationPage extends BasePage {
    Faker faker = new Faker();
    public String nonExistenceNiptNumber;
    @FindBy(xpath = "//mat-icon[normalize-space()='create']")
    public WebElement searchOrganizationIcon;
    @FindBy(xpath = "//*[@id=\"cdk-step-content-0-0\"]/app-corporate-customer-select/div/form/div[1]/mat-form-field/div/div[1]/div[3]")
    public WebElement dropdownBtnOfCustomerType;
    @FindBy(xpath = "//span[.=' Albanian Customer ']")
    public WebElement albanianCustomerInDropdown;
    @FindBy(xpath = "//span[normalize-space()='Foreign Customer']")
    public WebElement foreignCustomerInDropdown;
    @FindBy(css = "[formcontrolname = 'organizationNumber']")
    public WebElement niptTextOnSeacrOrganization;
    @FindBy(xpath = "//input[@formcontrolname = 'organizationNumber']")
    public WebElement niptNumberField;
    @FindBy(xpath = "//*[@id=\"cdk-step-content-0-0\"]/app-corporate-customer-select/div/form/div[2]/div/button")
    public static WebElement searchBtnOnSearchOrganizationPage;
    @FindBy(css = "div[id='cdk-step-content-0-0'] span[class='mat-button-wrapper'] span")
    public WebElement nextBtnOnSearchOrganizationPage;
    @FindBy(xpath = "//mat-error[@id='mat-error-0']")
    public WebElement warningInvalidNıptNumber;
    @FindBy(css = "input[formcontrolname='organizationNumberWithName']")
    public WebElement newCustomerTextWithNumberInNiptField;
    @FindBy(xpath = "//span[contains(text(),'This organization cannot have more than one custom')]")
    public WebElement warningWithExistingNiptNumber;

    public void getCurrentUrl(String currentUrl) {
        Utils.waitFor(3);
        Driver.getDriver().getCurrentUrl();
        System.out.println("Driver.getDriver().getCurrentUrl() = " + Driver.getDriver().getCurrentUrl());
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("customer/create-enterprise-customer"));
    }

    public void popUpWarningValidationOfExistenceNumber(String popUpMessage) {
        Utils.waitFor(3);
        String actualMessage = warningWithExistingNiptNumber.getText();
        String expectedMessage = popUpMessage;
        Assert.assertTrue(expectedMessage.equals(actualMessage));
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
        Utils.click(dropdownBtnOfCustomerType);
        Utils.click(albanianCustomerInDropdown);
    }

    public void selectOfForeignCustomerType() {
        Utils.waitFor(3);
        Utils.click(dropdownBtnOfCustomerType);
        Utils.click(foreignCustomerInDropdown);
    }

    public void openCreateBusinessCustomerPage() {
        elementDisplayed(dnextlogoOnNavbar);
        Utils.hover(dnextlogoOnNavbar);
        Utils.waitFor(3);
        //Utils.waitForVisibility(createBusinessCustomerBtn,15);
        //Utils.waitForPageToLoad();
        Utils.click(createBusinessCustomerBtn);
    }

    public void negativNiptInput(String inavlidFormatNipt) {
        Utils.sendKeys(niptNumberField, inavlidFormatNipt + Keys.ENTER);
    }

    public void warningMessageOfnegativNiptInput(String warningMessage) {
        String expectedWarning = warningMessage;
        String actualWarning = warningInvalidNıptNumber.getText();
        log.info(actualWarning + "is " + expectedWarning);
        Assert.assertTrue(expectedWarning.equals(actualWarning));
    }

    public void inputNiptForForeignCustomer() {
        String randomNipt = faker.bothify("?????####");
        Utils.sendKeys(niptNumberField, randomNipt);
    }

    public void searchBtnClickOnSearchOrgPage() {
        Utils.click(searchBtnOnSearchOrganizationPage);
    }

    public void nextBtnClickOnSearchPage() {
        Utils.waitFor(1);
        Utils.click(nextBtnOnSearchOrganizationPage);
    }

    public void verifySearchBtnEnable() {
        try {
            Utils.waitFor(3);
            String isDisabled = searchBtnOnSearchOrganizationPage.getAttribute("disabled");
            if (isDisabled != null && isDisabled.equals("true")) {
                System.out.println("The search button is disabled.");
            }
        } catch (Throwable e) {
            System.out.println("The search button is enabled.");
        }
    }
}