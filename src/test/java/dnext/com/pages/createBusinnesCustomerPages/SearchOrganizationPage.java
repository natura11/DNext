package dnext.com.pages.createBusinnesCustomerPages;

import com.github.javafaker.Faker;
import com.utilities.Driver;
import com.utilities.Utils;
import dnext.com.pages.BasePage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.NoSuchElementException;

@Log4j2
public class SearchOrganizationPage extends BasePage {
    Faker faker = new Faker();

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
    @FindBy(xpath= "//*[@id=\"cdk-step-content-0-0\"]/app-corporate-customer-select/div/form/div[2]/div/button")
    public static WebElement searchBtnOnSearchOrganizationPage;
    @FindBy(css = "div[id='cdk-step-content-0-0'] span[class='mat-button-wrapper'] span")
    public WebElement nextBtnOnSearchOrganizationPage;
    @FindBy(xpath = "//mat-error[@id='mat-error-0']")
    public WebElement warningInvalidNıptNumber;
    @FindBy(css = "input[formcontrolname='organizationNumberWithName']")
    public WebElement newCustomerTextWithNumberInNiptField;
    @FindBy(xpath = "//span[contains(text(),'This organization cannot have more than one custom')]")
    public WebElement warningWithExistingNiptNumber;


    public SearchOrganizationPage getCurrentUrl(String currentUrl) {
        Utils.waitFor(3);
        Driver.getDriver().getCurrentUrl();
        System.out.println("Driver.getDriver().getCurrentUrl() = " + Driver.getDriver().getCurrentUrl());
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("customer/create-enterprise-customer"));
        return this;
    }

    public SearchOrganizationPage popUpWarningValidationOfExistenceNumber(String popUpMessage) {
        Utils.waitFor(3);
        String actualMessage = warningWithExistingNiptNumber.getText();
        String expectedMessage = popUpMessage;
        Assert.assertTrue(expectedMessage.equals(actualMessage));
        return this;
    }

    public SearchOrganizationPage usingExistenceNiptNumber(String number) {
        Utils.waitForPageToLoad();
        niptNumberField.sendKeys(number);
        return this;
    }

    public SearchOrganizationPage selectOfAlbanianCustomerType() {
        Utils.waitForPageToLoad();
        Utils.click(dropdownBtnOfCustomerType);
        Utils.click(albanianCustomerInDropdown);
        return this;
    }

    public SearchOrganizationPage selectOfForeignCustomerType() {
        Utils.waitFor(3);
        Utils.click(dropdownBtnOfCustomerType);
        Utils.click(foreignCustomerInDropdown);
        return this;
    }

    public SearchOrganizationPage openCreateBusinessCustomerPage() {
        Utils.hover(dnextlogoOnNavbar);
        Utils.waitForPageToLoad();
        Utils.click(createBusinessCustomerBtn);
        return this;
    }

    public SearchOrganizationPage negativNiptInput(String inavlidFormatNipt) {
        Utils.sendKeys(niptNumberField, inavlidFormatNipt + Keys.ENTER);
        return this;
    }

    public SearchOrganizationPage warningMessageOfnegativNiptInput(String warningMessage) {
        String expectedWarning = warningMessage;
        String actualWarning = warningInvalidNıptNumber.getText();
        log.info(actualWarning + "is " + expectedWarning);
        Assert.assertTrue(expectedWarning.equals(actualWarning));
        return this;
    }

    public SearchOrganizationPage inputNiptForForeignCustomer() {
        String randomNipt = faker.bothify("?????####");
        Utils.sendKeys(niptNumberField, randomNipt);
        return this;
    }

    public SearchOrganizationPage searchBtnClickOnSearchOrgPage() {
        Utils.click(searchBtnOnSearchOrganizationPage);
        return this;
    }

    public SearchOrganizationPage nextBtnClickOnSearchPage() {
        Utils.click(nextBtnOnSearchOrganizationPage);
        return this;
    }

    public SearchOrganizationPage verifySearchBtnEnable() {
        String isDisabled = searchBtnOnSearchOrganizationPage.getAttribute("disabled");
        if (isDisabled != null && isDisabled.equals("true")) {
            System.out.println("The search button is disabled.");
        } else {
            System.out.println("The search button is enabled.");
        }
        return this;
    }

}



