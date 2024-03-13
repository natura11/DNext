package dnext.com.pages.customer360;

import dnext.com.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AbelActivationPage extends BasePage {


    @FindBy(xpath = "//span[@class='mat-option-text'][normalize-space()='Abel']")
    public WebElement optionAbel;

    @FindBy(xpath = "//p[.='Smart Card']")
    public WebElement smartCardOption;

    @FindBy(xpath = "(//span[@class='mat-button-wrapper'])[5]")
    public WebElement smartCardAddSign;
    @FindBy(xpath = "//mat-basic-chip[normalize-space()='12 X ALL2550']")
    public WebElement  contract12XALL2550ForDigitalbPremiumPlus;
    @FindBy(xpath = "//mat-basic-chip[normalize-space()='12 X ALL0']")
    public WebElement  contract12XALL0ForSmartCard;

    @FindBy(xpath = "//input[@id=\"SmartCardSerialNumber\"]")
    public WebElement  smartCardSerialNumberField;

    @FindBy(xpath = "(//mat-icon[@role='img'][normalize-space()='add'])[1]")
    public WebElement  aksesFeePerDekoderBasicAddSign;
    @FindBy(xpath = "//mat-chip-list[@id='mat-chip-list-20']//mat-basic-chip[@role='option'][normalize-space()='12 X ALL0']")
    public WebElement  contract12XALL0ForAksesFeePerDekoderBasic;

    @FindBy(xpath = "(//mat-icon[@role='img'][normalize-space()='add'])[2]")
    public WebElement addIconForTarifeInstalimi;

    @FindBy(xpath = "//mat-basic-chip[normalize-space()='ALL1500 12Month']")
    public WebElement  contractALL150012MonthForTarifeInstalimi;

}
