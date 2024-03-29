package dnext.com.pages.createIndividualCustomer;

import com.utilities.Utils;
import dnext.com.pages.BasePage;
import dnext.com.pages.createBusinnesCustomerPages.AddressInformationPage;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Log4j2
public class AddressInformationIndividualPage extends BasePage {
    @FindBy(xpath = "//div[contains(text(),'Contact Information')]//ancestor::*[@aria-selected='true']")
    public WebElement selectedContactInformationOnIndividual;
    @FindBy(xpath = "//input[@formcontrolname='mediumType']")
    public WebElement billingAddressMediumTypeOnIndividual;
    @FindBy(xpath = "(//span[text()='Next'])[3]//ancestor::button")
    public WebElement nextButtonOnAddressInformationOnIndividual;
    @FindBy(xpath = "(//span[text()='Back'])[2]//ancestor::button")
    public WebElement backButtonOnAddressInformationOnIndividual;
    @FindBy(xpath = "//textarea[@id='street1']/parent::div/preceding-sibling::div[1]")
    public WebElement billingAddressLineOneInputDiv;
    @FindBy(xpath = "//div[contains(text(),'Address Information')]//ancestor::*[@aria-selected='true']")
    public WebElement selectedAddressInformationOnIndividual;
    @FindBy(xpath = "//textarea[@id='street1']")
    public WebElement billingAddressLineOneInputOnIndividual;
    @FindBy(xpath = "//textarea[@formcontrolname='street2']")
    public WebElement billingAddressLineTwoInputOnIndividual;
    @FindBy(xpath = "//input[@formcontrolname='postCode']")
    public WebElement billingPostCodeInputOnIndividual;
    @FindBy(xpath = "//input[@formcontrolname='contactType']")
    public WebElement billingAddressContactTypeOnIndividual;
    @FindBy(xpath = "//mat-select[@formcontrolname='country']")
    public WebElement billingCountryDropdownOnIndividual;
    @FindBy(xpath = "//mat-select[@formcontrolname='city']")
    public WebElement billingCityDropdownOnIndividual;
    @FindBy(xpath = "//span[contains(text(),'Also Service Address')]//preceding-sibling::div")
    public WebElement alsoServiceAddressToggleSwitchOnIndividual;
    @FindBy(xpath = "//input[@formcontrolname='serviceContactType']")
    public WebElement serviceAddressContactTypeOnIndividual;
    @FindBy(xpath = "//textarea[@id='serviceStreet1']")
    public WebElement serviceAddressLineOneInputOnIndividual;
    @FindBy(xpath = "//textarea[@id='serviceStreet1']//parent::div/preceding-sibling::div[1]")
    public WebElement serviceAddressLineOneInputDivOnIndividual;
    @FindBy(xpath = "//textarea[@formcontrolname='serviceStreet2']")
    public WebElement serviceAddressLineTwoInputOnIndividual;
    @FindBy(xpath = "//input[@formcontrolname='servicePostCode']")
    public WebElement servicePostCodeInputOnIndividual;
    @FindBy(xpath = "//mat-select[@formcontrolname='serviceCountry']")
    public WebElement serviceCountryDropdownOnIndividual;
    @FindBy(xpath = "//mat-select[@formcontrolname='serviceCity']")
    public WebElement serviceCityDropdownOnIndividual;
    public AddressInformationIndividualPage fillInputField(WebElement webElement, String text) {
        webElement.clear();
        webElement.sendKeys(text);
        return this;
    }
    public AddressInformationIndividualPage verifyInputElementsNonEditableOnIndividual(WebElement webElement) {
        String isReadOnly = webElement.getAttribute("readonly");
        Assert.assertEquals("true", isReadOnly);
        return this;
    }
    public AddressInformationIndividualPage verifyDropdownNonEditableOnIndividual(WebElement webElement) {
        String isDisabled = webElement.getAttribute("aria-disabled");
        Assert.assertEquals("true", isDisabled);
        return this;
    }
    public AddressInformationIndividualPage verifyCountryHasDefaultValueOnIndividual(WebElement webElement, String value) {
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
    public AddressInformationIndividualPage verifyServiceAddressValueOnIndividual() {
        Utils.scrollToElement(serviceAddressContactTypeOnIndividual);
        String contactType = getValueByMouseKeyboardAction(serviceAddressContactTypeOnIndividual);
        Assert.assertEquals("Service Address", contactType);
        return this;
    }
}