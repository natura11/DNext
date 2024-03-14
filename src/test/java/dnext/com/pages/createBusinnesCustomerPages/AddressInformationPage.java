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

@Log4j2
public class AddressInformationPage extends BasePage{

    @FindBy(xpath = "//div[contains(text(),'Address Information')]")
    public WebElement addressInformationButton;

    @FindBy(xpath = "//span[contains(text(),'Also Service Address')]//preceding-sibling::div")
    public WebElement alsoServiceAddressToggleSwitch;

    @FindBy(xpath = "//input[@formcontrolname='mediumType']")
    public WebElement billingAddressMediumType;

    @FindBy(xpath = "//input[@formcontrolname='contactType']")
    public WebElement billingAddressContactType;

    @FindBy(xpath = "//textarea[@id='street1']")
    public WebElement billingAddressLineOneInput;

    @FindBy(xpath = "//textarea[@id='street1']/parent::div/preceding-sibling::div[1]")
    public WebElement billingAddressLineOneInputDiv;

    @FindBy(xpath = "//textarea[@formcontrolname='street2']")
    public WebElement billingAddressLineTwoInput;

    @FindBy(xpath = "//input[@formcontrolname='postCode']")
    public WebElement billingPostCodeInput;

    @FindBy(xpath = "//mat-select[@formcontrolname='country']")
    public WebElement billingCountryDropdown;

    @FindBy(xpath = "//mat-select[@formcontrolname='city']")
    public WebElement billingCityDropdown;

    @FindBy(xpath = "//span[contains(text(),'CERRIK')]")
    public WebElement billingCerrikCity;

    @FindBy(xpath = "//span[contains(text(),'BERAT')]")
    public WebElement billingBeratCity;

    @FindBy(xpath = "//input[@formcontrolname='serviceMediumType']")
    public WebElement serviceAddressMediumType;

    @FindBy(xpath = "//input[@formcontrolname='serviceContactType']")
    public WebElement serviceAddressContactType;

    @FindBy(xpath = "//textarea[@id='serviceStreet1']")
    public WebElement serviceAddressLineOneInput;

    @FindBy(xpath = "//textarea[@id='serviceStreet1']//parent::div/preceding-sibling::div[1]")
    public WebElement serviceAddressLineOneInputDiv;

    @FindBy(xpath = "//textarea[@formcontrolname='serviceStreet2']")
    public WebElement serviceAddressLineTwoInput;

    @FindBy(xpath = "//input[@formcontrolname='servicePostCode']")
    public WebElement servicePostCodeInput;

    @FindBy(xpath = "//mat-select[@formcontrolname='serviceCountry']")
    public WebElement serviceCountryDropdown;

    @FindBy(xpath = "//mat-select[@formcontrolname='serviceCity']")
    public WebElement serviceCityDropdown;

    @FindBy(xpath = "//*[@role='option']//span[contains(text(),'CERRIK')]")
    public WebElement serviceCerrikCity;

    @FindBy(xpath = "//*[@role='option']//span[contains(text(),'BERAT')]")
    public WebElement serviceBeratCity;

    @FindBy(xpath = "(//span[text()='Next'])[5]//ancestor::button")
    public WebElement nextButtonOnAddressInformationPage;

    @FindBy(xpath = "(//span[text()='Back'])[5]//ancestor::button")
    public WebElement backButtonOnAddressInformationPage;

    public AddressInformationPage clickAddressInformationIcon() {
        Utils.click(addressInformationButton);
        return this;
    }

    public AddressInformationPage verifyUserIsOnAddressInformationPage() {
        try {
            Assert.assertTrue(billingAddressMediumType.isDisplayed());
            log.info("Address field is displaying");
        } catch (Throwable e) {
            log.info("Error message: Address field is  not displaying");
        }
        return this;
    }
    public AddressInformationPage elementDisplayed(WebElement webElement) {
        Utils.waitFor(1);
        Assert.assertTrue(webElement.isDisplayed());
        log.info(webElement + "is displaying");
        return this;
    }

    public AddressInformationPage fillInputField(WebElement webElement, String text) {
        Utils.waitForPageToLoad();
        webElement.sendKeys(text);
        return this;
    }

    public AddressInformationPage warningBackgroundRedColor(WebElement webElement) {
        try {
            String expectedRedColorCode = "#f44336";
            String backgroundColor = webElement.getCssValue("color");
            Color color = Color.fromString(backgroundColor);
            String actualBackRoundColorCode = color.asHex();
            Assert.assertEquals(expectedRedColorCode, actualBackRoundColorCode);
        } catch (Exception e) {
            log.info("Error Message: Red Warning message is not displaying!!");
        }
        return this;
    }

    public AddressInformationPage verifyInputElementsNonEditable(WebElement webElement) {
        String isReadOnly = webElement.getAttribute("readonly");
        Assert.assertEquals("true", isReadOnly);
        return this;
    }

    public AddressInformationPage verifyDropdownNonEditable(WebElement webElement) {
        String isDisabled = webElement.getAttribute("aria-disabled");
        Assert.assertEquals("true", isDisabled);
        return this;
    }

    public AddressInformationPage verifyCountryHasDefaultValue(WebElement webElement, String value) {
        List<WebElement> spanLists = webElement.findElements(By.xpath(".//span"));
        for (WebElement element: spanLists) {
            String actualCountry = element.getText();
            if(actualCountry.equals(value)){
                Assert.assertTrue(true);
                return this;
            }
        }
        Assert.fail();
        return this;
    }
    public AddressInformationPage cityDropdownSelectable() {
        isDropdownSelectable(By.xpath("//*[@class=\"mat-option-text\"]"));
        return this;
    }
    public AddressInformationPage selectAnOptionFromDropdown(String city) {
        List<WebElement> options = Driver.getDriver()
                .findElements(By.xpath("//*[@class=\"mat-option-text\"]"));
        if (!options.isEmpty()) {
            options.stream().filter(option -> option.getText().trim().equals(city))
                    .findFirst()
                    .ifPresent(WebElement::click);
            log.info(city +  " option is selected!");
        }
        else {
            log.info("No options found in the dropdown.");
        }
        return this;
    }

    public AddressInformationPage verifyServiceAddressValue() {
        Utils.scrollToElement(serviceAddressContactType);
        String contactType = getValueByMouseKeyboardAction(serviceAddressContactType);
        Assert.assertEquals("Service Address", contactType);
        return this;
    }


}