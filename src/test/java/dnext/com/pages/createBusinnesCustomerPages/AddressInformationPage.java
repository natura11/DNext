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
public class AddressInformationPage extends BasePage{

    @FindBy(xpath = "//div[contains(text(),'Address Information')]")
    public WebElement addressInformationButton;

    @FindBy(xpath = "//span[contains(text(),'Also Service Address')]//preceding-sibling::div/*[@role='switch']")
    public WebElement alsoServiceAddressToggleSwitch;

    @FindBy(xpath = "//input[@formcontrolname='mediumType']")
    public WebElement billingAddressMediumType;

    @FindBy(xpath = "//input[@formcontrolname='contactType']")
    public WebElement billingAddressContactType;

    @FindBy(xpath = "//textarea[@id='street1']")
    public WebElement billingAddressLineOneInput;

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
            if (billingAddressMediumType.isDisplayed())
                log.info("Address field is displaying");
        } catch (Throwable e) {
            log.info("Error message: Address field is  not displaying");
        }
        return this;
    }
    public AddressInformationPage billingAddressLineOneDisplayed() {
        Utils.waitFor(1);
        Assert.assertTrue(billingAddressLineOneInput.isDisplayed());
        log.info(billingAddressLineOneInput + "is displaying");
        return this;
    }

    public AddressInformationPage fillBillingAddressLineOneField(String addressLine1) {
        Utils.waitForPageToLoad();
        billingAddressLineOneInput.sendKeys(addressLine1);
        return this;
    }

    public AddressInformationPage nextBtnClickAddressInformation() {
        Utils.click(nextButtonOnAddressInformationPage);
        Utils.waitFor(3);
        return this;
    }

}