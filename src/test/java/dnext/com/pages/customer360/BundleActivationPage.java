package dnext.com.pages.customer360;

import dnext.com.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BundleActivationPage extends BasePage {
    @FindBy(xpath = "(//mat-select[@id='Infrastructure'])[1]")
    public WebElement infrastructureDropdown;

    @FindBy(xpath = "//form[@class='d-dynamic-form-wrapper ng-pristine ng-valid ng-star-inserted ng-touched']/mat-form-field/div/div/div/mat-select/div/div/span//*[.='COAXIAL']")
    public WebElement coaxialOptionFromDropdown;

    @FindBy(xpath = "(//mat-select[@id='TVInfrastructure'])[1]")
    public WebElement tvInfrastructureDropdown;
    @FindBy(xpath = "//mat-basic-chip[normalize-space()='ALL0 6Month']")
    public WebElement smartCardCashFirstOption;
    @FindBy(xpath = "//mat-basic-chip[normalize-space()='ALL4000 6Month']")
    public WebElement  aksesFeePerModemBasicCashMethodFirstOption;
    @FindBy(xpath = "//*[@id=\"TVInfrastructure-panel\"]/mat-option[2]/span")
    public WebElement cryptoguardOptionFromInfrastructureDropdown;
    @FindBy(xpath = "(//mat-icon[@role='img'][normalize-space()='add'])[2]")
    public WebElement tarifeInstalllimiAddSign;
    @FindBy(xpath = "(//mat-icon[@role='img'][normalize-space()='add'])[3]")
    public WebElement  aksesFeePerModemBasicAddSign;
    @FindBy(xpath = "(//mat-icon[@role='img'][normalize-space()='add'])[5]")
    public WebElement  aksesFeePerDecoderBasicAddSign;
    @FindBy(xpath = "//mat-basic-chip[normalize-space()='ALL0 6Month']")
    public WebElement  aksesFeePerDecoderBasicCashMethodFirstOption;



}
