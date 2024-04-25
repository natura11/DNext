package dnext.com.pages.backofficePage;

import com.github.javafaker.Faker;
import com.utilities.Driver;
import dnext.com.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BackOfficeIpInventoryPage extends BasePage {
    static String inventedIpAddress;
    @FindBy(xpath = "//a[@href=\"/ip-inventory\"]/span")
    static public WebElement ipInventoryButton;
    @FindBy(xpath = "(//span[contains(text(),'Create')][1])")
    static public WebElement createButtonToStartIpInventory;
    @FindBy(xpath = "//input[@formcontrolname='address']")
    static public WebElement adressButtonForIpInventory;
    @FindBy(xpath = "//mat-select[@formcontrolname='service']")
    static public WebElement serviceTypeDropdownForIpInventory;
    @FindBy(xpath = "(//span[@class='mat-option-text'])[1]")
    static public WebElement ipOptionFromDropdownForIpInventory;
    @FindBy(xpath = "//mat-select[@formcontrolname='type']/div")
    static public WebElement addressTypeDropdownForIpInventory;
    @FindBy(xpath = "//span[contains(text(),'single')]")
    static public WebElement singleOptionFromAddressTypeDropdownForIpInventory;
    @FindBy(xpath = "(//div[@class='mat-radio-inner-circle'])[1]")
    static public WebElement onOptionFromAutoProvForIpInventory;
    @FindBy(xpath = "(//span[contains(text(),'Create')])[2]")
    static public WebElement createButtonToCompleteIpInventory;
    @FindBy(xpath = "(//tbody[@role='rowgroup']/tr/td)[1]")
    static public WebElement createdIpfieldForIpInventory;
    @FindBy(xpath = "//span[.='All']/../../..")
    static public WebElement statusDropdownForIpInventory;
    @FindBy(xpath = "//span[contains(text(),'Reserved')]")
    static public WebElement reservedOptionfromsSatusDropdownForIpInventory;
    @FindBy(xpath = "//mat-label[contains(text(),'Text Search')]/../../../input")
    static public WebElement textSearchInputFieldForIpInventory;
    @FindBy(xpath = "//span[contains(text(),' Search ')]")
    static public WebElement searchButtonForIpInventory;
    @FindBy(xpath = "//tbody[@role='rowgroup']/tr/td")
    static public WebElement accountNumberFieldForIpInventory;
    @FindBy(xpath = "//tbody[@role='rowgroup']/tr/td")
    static public WebElement statusForIpInventory;
    @FindBy(xpath = "//tbody[@role='rowgroup']/tr/td[8]/mat-icon")
    static public WebElement cancelStatusSignForIpInventory;
    @FindBy(xpath = "//tbody[@role='rowgroup']/tr/td[7]/mat-icon")
    static public WebElement doneStatusSignForIpInventory;


}
