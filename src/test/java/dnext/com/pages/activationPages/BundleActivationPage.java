package dnext.com.pages.activationPages;

import com.utilities.Driver;
import com.utilities.Utils;
import dnext.com.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static dnext.com.pages.activationPages.CryptoguardActivationPage.cryptoguardNumbersCreationForSerialNumbers;
import static dnext.com.pages.activationPages.CryptoguardActivationPage.smartCardSerialNumberField;
import static dnext.com.pages.activationPages.VerifyCoaxialActivationForPostpaidPage.inputFieldForMACAddress;
import static dnext.com.pages.activationPages.VerifyCoaxialActivationForPostpaidPage.numbersCreationForMacAdreess;
import static dnext.com.pages.activationPages.VtvActivationPage.addToCartBtn;

public class BundleActivationPage extends BasePage {

    @FindBy(xpath = "//input[@id='bundle-checkbox-input']/..")
    public WebElement bundleOptionFromDropdown;

    @FindBy(xpath = "(//mat-cell[@class='mat-cell cdk-cell cdk-column-name mat-column-name ng-star-inserted'])[1]")
    public WebElement productsFirstOptionForVbu;

    @FindBy(xpath = "(//mat-select[@id='Infrastructure'])[1]")
    public WebElement infrastructureDropdown;

    @FindBy(xpath = "//mat-basic-chip[normalize-space()='6Month']")
    public WebElement cashOptionOfSelectedProductsForFirstOptionForVbu;

    @FindBy(xpath = "//mat-basic-chip[normalize-space()='ALL34800 6Month']")
    public WebElement cashOptionOfSelectedProductsForBundleForVbu;

    @FindBy(xpath = "//mat-select[@id='Infrastructure']")
    public WebElement dropdownForCoaxialOptionForVbu;

    @FindBy(xpath = "//span[text()=' COAXIAL ']")
    public WebElement coaxialOptionFromDropdownForVbu;

    @FindBy(xpath = "(//mat-icon[@role='img'][normalize-space()='add'])[1]")
    public WebElement basicEnterpriseModemAddSignForVbu;
    @FindBy(xpath = "(//mat-basic-chip[normalize-space()='ALL0 6Month'])[1]")
    public WebElement cashOptionoFPublicIPforBundleForVbu;
    @FindBy(xpath = "(//mat-basic-chip[normalize-space()='ALL0 6Month'])[2]")
    public WebElement cashOptionBasicEnterpriseModem;

    @FindBy(xpath = "(//input[@id='IPAddress'])[2]")
    public WebElement inputFieldForIpAdreessForVbu;




    @FindBy(xpath = "//form[@class='d-dynamic-form-wrapper ng-pristine ng-valid ng-star-inserted ng-touched']/mat-form-field/div/div/div/mat-select/div/div/span//*[.='COAXIAL']")
    public WebElement coaxialOptionFromDropdownForCbu;

    @FindBy(xpath = "(//mat-select[@id='TVInfrastructure'])[1]")
    public WebElement tvInfrastructureDropdown;
    @FindBy(xpath = "//mat-basic-chip[normalize-space()='ALL0 6Month']")
    public WebElement smartCardCashFirstOption;
    @FindBy(xpath = "//mat-basic-chip[normalize-space()='ALL4000 6Month']")
    public WebElement aksesFeePerModemBasicCashMethodFirstOption;
    @FindBy(xpath = "//*[@id=\"TVInfrastructure-panel\"]/mat-option[2]/span")
    public WebElement cryptoguardOptionFromInfrastructureDropdown;
    @FindBy(xpath = "(//mat-icon[@role='img'][normalize-space()='add'])[2]")
    public WebElement tarifeInstalllimiAddSign;
    @FindBy(xpath = "(//mat-icon[@role='img'][normalize-space()='add'])[3]")
    public WebElement aksesFeePerModemBasicAddSign;
    @FindBy(xpath = "(//mat-icon[@role='img'][normalize-space()='add'])[5]")
    public WebElement aksesFeePerDecoderBasicAddSign;
    @FindBy(xpath = "//mat-basic-chip[normalize-space()='ALL0 6Month']")
    public WebElement aksesFeePerDecoderBasicCashMethodFirstOption;


    public void checkCoaxialMacNumberIsAvailableOrNotForBundle() {
        String successMessageXpath = "//simple-snack-bar/span[text()='Shopping cart created successfully!']";
        boolean isNumberAvailable = false;
        do {
            Utils.waitFor(3);
            if (Driver.getDriver().findElements(By.xpath(successMessageXpath)).isEmpty()) {
                smartCardSerialNumberField.clear();
                cryptoguardNumbersCreationForSerialNumbers();
                inputFieldForMACAddress.clear();
                numbersCreationForMacAdreess();
                clickField(addToCartBtn);
                Utils.waitFor(3);
            } else {
                isNumberAvailable = true;
            }
        } while (!isNumberAvailable);
    }


    public void ipAdressCreationForBundle() {
        List<String> abelNumbers = new ArrayList<>(Arrays
                .asList(
                        "21.47.72.208", "22.100.113.51;22.100.113.53",
                        "95.255.128.252_30", "235.175.66.2", "86.250.214.62;86.250.214.65",
                        "87.124.246.125", "65.25.204.144_30", "104.226.166.253;104.226.166.254",
                        "155.221.126.78", "143.104.225.77_30", "200.66.100.9",
                        "95.244.21.112;95.244.21.115", "72.111.121.49_30", "132.173.15.174",
                        "165.228.43.100;165.228.43.105", "238.156.38.6_30", "71.8.102.23",
                        "215.31.91.56;215.31.91.57", "59.69.77.241", "184.48.161.136",
                        "55.236.115.105"));
        Random random = new Random();
        int randomIndex = random.nextInt(abelNumbers.size());
        sendKeys(inputFieldForIpAdreessForVbu, abelNumbers.get(randomIndex));
    }

}
