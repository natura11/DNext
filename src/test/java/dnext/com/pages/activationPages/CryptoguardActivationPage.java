package dnext.com.pages.activationPages;

import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import com.utilities.Utils;
import dnext.com.pages.BasePage;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static dnext.com.pages.activationPages.AbelActivationPage.successMessageForShoppingCart;
import static dnext.com.pages.activationPages.VerifyCoaxialActivationForPostpaidPage.*;

@Log4j2
public class CryptoguardActivationPage extends BasePage {

    @FindBy(xpath = "//span[@class='mat-option-text'][normalize-space()='Cryptoguard']")
    public WebElement optionCryptoguard;
    @FindBy(xpath = "(//mat-basic-chip[normalize-space()='ALL0 3Month'])[2]")
    static public WebElement all03MonnthsForAkesFeePerDokoderBasicOnCryptoguard;
    @FindBy(xpath = "(//mat-icon[@role='img'][normalize-space()='add'])[2]")
    public WebElement addIconForTarifeInstalimiOnCryptoguard;
    @FindBy(xpath = "//h3[.=\"Digitalb Premium Plus \"]")
    public WebElement selectedProductInShoppingCart;
    @FindBy(xpath = "//input[@id='SmartCardSerialNumber']")
    public WebElement smartCardSerialNumberField;
    @FindBy(xpath = "//mat-row[1]//mat-cell[2]//span[1]")
    public WebElement orderStatus;
    @FindBy(xpath = "//span[normalize-space()='Add to Cart']")
    public WebElement addToCartBtn;
    @FindBy(xpath = "(//mat-basic-chip[normalize-space()='ALL0 3Month'])[1]")
    public WebElement all03MonthsOptionForSmartCardCashOption;
    @FindBy(xpath = "(//mat-icon[@role='img'][normalize-space()='add'])[1]")
    public WebElement smartCardAddSignofCryptoguard;
    @FindBy(xpath = "(//mat-icon[@role='img'][normalize-space()='add'])[1]")
    public WebElement aksesFeePerDekoderBasicAddSign;


    public void cryptoguardNumbersCreationForSerialNumbers() {
        List<String> abelNumbers = new ArrayList<>(Arrays
                .asList("00340005209191","00340005219190","00340005234193", "00340005247193",
                        "00340005261199", "00340005267191", "00340005268198", "00340005274199",
                        "00340005280190", "00340005287199", "00340005297198", "00340005312198",
                        "00340005333193", "00340005334190", "00340005342195", "00340005343192",
                        "00340005344199", "00340005352194", "00340005358196", "00340005365194"
                       ));
        Random random = new Random();
        int randomIndex = random.nextInt(abelNumbers.size());
        sendKeys(smartCardSerialNumberField, abelNumbers.get(randomIndex));
    }

    public void checkCryptoguardNumberIsAvailableOrNot() {
        String successMessageXpath = "//simple-snack-bar/span[text()='Shopping cart created successfully!']";
        boolean isNumberAvailable = false;
        do {
            Utils.waitFor(3);
            if (Driver.getDriver().findElements(By.xpath(successMessageXpath)).isEmpty()) {
                smartCardSerialNumberField.clear();
                cryptoguardNumbersCreationForSerialNumbers();
                clickField(addToCartBtn);
                Utils.waitFor(4);
            } else {
                isNumberAvailable = true;
            }
        } while (!isNumberAvailable);
    }

    public void verifyShoppingCartIsCreated() {
        Assert.assertTrue(isElementDisplayed(successMessageForShoppingCart));
    }

    public void verifyTheOrderStatusIsCompleted () {

            if (orderStatus.getText().equalsIgnoreCase("completed")) {
                System.out.println("OrderStatus is=  = " + orderStatus.getText());
                Assert.assertEquals("completed", orderStatus.getText());
            } else {
                System.out.println("OrderStatus is= " + orderStatus.getText());
            String OrderId = orderIdField.getText();
            Driver.getDriver().get(ConfigurationReader.getProperty("comundaViewer.site.url"));
            sendKeys(orderIdFieldOnCamundaHomePage, OrderId);
            clickField(productOrderCamundaOnHomePage);
            Utils.waitFor(1);
            clickField(fullfillmentTypeFirstChoiceIconOnCamunda);
            clickField(variablesChoiceIconOnCamunda);
            Utils.waitFor(2);
            log.error("Error message is " + errorMessageOnVariablesOnCamunda.getText());
            switchToWindowNew(0);
            }
        }
    }


