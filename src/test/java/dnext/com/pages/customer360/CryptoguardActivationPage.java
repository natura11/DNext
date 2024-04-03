package dnext.com.pages.customer360;

import com.utilities.Driver;
import com.utilities.Utils;
import dnext.com.pages.BasePage;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

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
    @FindBy(xpath = "//*[.='ERROR_MESSAGES.THERE_IS_ALREADY_ON_GOING_CART_ITEM_EXIST']")
    static public WebElement warningForAlreadyOnGoingSerialNumber;
    @FindBy(xpath = "//*[.='One of the product already in use by another customer!!']")
    static public WebElement warningForAlreadyInUsedSerialNumber;
    @FindBy(xpath = "(//mat-basic-chip[normalize-space()='ALL0 3Month'])[1]")
    public WebElement all03MonthsOptionForSmartCardCashOption;
    @FindBy(xpath = "(//mat-icon[@role='img'][normalize-space()='add'])[1]")
    public WebElement smartCardAddSignofCryptoguard;
    @FindBy(xpath = "(//mat-icon[@role='img'][normalize-space()='add'])[1]")
    public WebElement aksesFeePerDekoderBasicAddSign;




    public void numbersCreationForSerialNumbers() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        String[] numbers = {
                "00340005209191", "00340005219190", "00340005234193", "00340005247193",
                "00340005261199", "00340005267191", "00340005268198", "00340005274199",
                "00340005280190", "00340005287199", "00340005297198", "00340005312198",
                "00340005333193", "00340005334190", "00340005342195", "00340005343192",
                "00340005344199", "00340005352194", "00340005358196", "00340005365194"};

        outerLoop:
        for (String number : numbers) {
            smartCardSerialNumberField.clear();
            Utils.waitFor(3);
            smartCardSerialNumberField.sendKeys(number);
            Utils.waitFor(3);
            addToCartBtn.click();
            try {
                Utils.waitForVisibility(warningForAlreadyOnGoingSerialNumber, 20);
                System.out.println("Serial number " + number + " is already in progress.");
                continue outerLoop;
            } catch (TimeoutException e) {

            }
            try {
                if (warningForAlreadyInUsedSerialNumber.isDisplayed()) {
                    System.out.println("One of the products is already in use by another customer!!");
                    continue outerLoop;
                }
            } catch (Exception e) {
                System.out.println("Serial number " + number + " has been processed.");
                break ;
            }
        }
    }


    public void verifyTheOrderStatusIsCompleted () {

            if (orderStatus.getText().equalsIgnoreCase("completed")) {
                System.out.println("OrderStatus is=  = " + orderStatus.getText());
                Assert.assertEquals("completed", orderStatus.getText());
            } else {
                System.out.println("OrderStatus is= " + orderStatus.getText());
//            String OrderId = orderIdField.getText();
//            Driver.getDriver().get(ConfigurationReader.getProperty("comundaViewer.site.url"));
//            sendKeys(orderIdFieldOnCamundaHomePage, OrderId);
//            clickField(productOrderCamundaOnHomePage);
//            Utils.waitFor(1);
//            clickField(fullfillmentTypeFirstChoiceIconOnCamunda);
//            clickField(variablesChoiceIconOnCamunda);
//            Utils.waitFor(2);
//            log.error("Error message is " + errorMessageOnVariablesOnCamunda.getText());
//            switchToWindowNew(0);
            }
        }
    }


