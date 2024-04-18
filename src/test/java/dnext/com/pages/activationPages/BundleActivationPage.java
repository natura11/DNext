package dnext.com.pages.activationPages;

import com.github.javafaker.Faker;
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
import static dnext.com.pages.backofficePage.BackOfficeIpInventoryPage.*;

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



public void usingCreatedIpAddressAtBackOffice(){
        Faker faker=new Faker();
        Driver.getDriver().navigate().to("https://backoffice-ui.uat.dnext.al.vodafone.com/orders/my-group-tasks");
        clickField(ipInventoryButton);
        clickField(createButtonToStartIpInventory);
        clickField(adressButtonForIpInventory);
        sendKeys(adressButtonForIpInventory,faker.numerify("###.###.###"));
        clickField(serviceTypeDropdownForIpInventory);
        clickField(ipOptionFromDropdownForIpInventory);
        clickField(addressTypeDropdownForIpInventory);
        clickField(singleOptionFromAddressTypeDropdownForIpInventory);
        clickField(onOptionFromAutoProvForIpInventory);
        clickField(createButtonToCompleteIpInventory);
        String inventedIpAddress=createdIpfieldForIpInventory.getText();
        System.out.println("inventedIpAddress = " + inventedIpAddress);
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();
        sendKeys(inputFieldForIpAdreessForVbu,inventedIpAddress);
}



}
