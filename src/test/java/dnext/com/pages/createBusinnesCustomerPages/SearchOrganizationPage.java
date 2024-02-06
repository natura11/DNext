package dnext.com.pages.createBusinnesCustomerPages;

import com.github.javafaker.Faker;
import com.utilities.Driver;
import com.utilities.Utils;
import dnext.com.pages.BasePage;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.NoSuchElementException;

@Slf4j
public class SearchOrganizationPage extends BasePage {
    public SearchOrganizationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


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
    @FindBy(xpath = "//button[@class='mat-focus-indicator warn mat-raised-button mat-button-base']")
    public WebElement searchBtnOnSearchOrganizationPage;
    @FindBy(xpath = "//*[@id=\"cdk-step-content-0-0\"]/div/button/span/span")
    public WebElement nextBtnOnSearchOrganizationPage;
    @FindBy(xpath = "//mat-error[@id='mat-error-0']")
    public WebElement warningInvalidNıptNumber;
    @FindBy(css = "input[formcontrolname='organizationNumberWithName']")
    public WebElement newCustomerTextWithNumberInNiptField;
    @FindBy(xpath = "//span[contains(text(),'This organization cannot have more than one custom')]")
    public WebElement warningWithExistingNiptNumber;


    public SearchOrganizationPage getCurrentUrl(String currentUrl) {
        Utils.waitFor(2);
        Driver.getDriver().getCurrentUrl();
        System.out.println("Driver.getDriver().getCurrentUrl() = " + Driver.getDriver().getCurrentUrl());
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("customer/create-enterprise-customer"));
        return this;
    }

    public SearchOrganizationPage popUpWarningValidationOfExistenceNumber(String popUpMessage) {
        Utils.waitFor(3);
        String actualMessage = warningWithExistingNiptNumber.getText();
        String expectedMessage = popUpMessage;
        System.out.println("actualMessage = " + actualMessage);
        System.out.println("expectedMessage = " + expectedMessage);
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

//    public SearchOrganizationPage verificationOfValidAndNonExistenceInput(String text) {
//        Utils.waitFor(
//                10
//        );
////        JavascriptExecutor jse = (JavascriptExecutor)Driver.getDriver();
//        WebElement element = Driver.getDriver().findElement(By.cssSelector("input[formcontrolname='organizationNumberWithName']"));
//
//        String text1 = (String) ((JavascriptExecutor)Driver.getDriver()).executeScript("return arguments[0].text", element);
//        //String elementSelector = "input[formcontrolname='organizationNumberWithName']";
//        System.out.println("text1 = " + text1);
//
//        return this;
//    }

    public SearchOrganizationPage inputNiptForForeignCustomer() {
        String randomNipt = faker.bothify("?????####");
        Utils.sendKeys(niptNumberField, randomNipt);
        return this;
    }




}
