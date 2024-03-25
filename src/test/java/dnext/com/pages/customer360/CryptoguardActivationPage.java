package dnext.com.pages.customer360;

import com.utilities.Utils;
import dnext.com.pages.BasePage;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class CryptoguardActivationPage extends BasePage {

    @FindBy(xpath = "//span[@class='mat-option-text'][normalize-space()='Cryptoguard']")
    public WebElement optionCryptoguard;

    @FindBy(xpath = "(//mat-basic-chip[normalize-space()='ALL0 3Month'])[2]")
    public WebElement all03MonnthsForAkesFeePerDokoderBasicOnCryptoguard;

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
    public WebElement warningForAlreadyUsedSerialNumber;
    @FindBy(xpath = "(//mat-basic-chip[normalize-space()='ALL0 3Month'])[1]")
    public WebElement all03MonthsOptionForSmartCardCashOption;
    @FindBy(xpath = "(//mat-icon[@role='img'][normalize-space()='add'])[1]")
    public WebElement smartCardAddSignofCryptoguard;
    @FindBy(xpath = "(//mat-icon[@role='img'][normalize-space()='add'])[1]")
    public WebElement aksesFeePerDekoderBasicAddSign;

    public void numbersCreationForSerialNumbers() {
        String[] numbers =
                { "00340002231195"};
//        "00340002248193", "00340002249190",
//                        "00340002258192", "00340002262199", "00340002271191", "00340002297191",
//                        "00340002303199", "00340002308194", "00340002312191", "00340002318193",
//                        "00340002337194", "00340002355198", "00340002373192", "00340002380190",
//                        "00340002382194", "00340002388196", "00340002394197", "00340002395194",
//                        "00340002396191", "00340002404193", "00340002418190", "00340002437191",
//                        "00340002456192", "00340002457199", "00340002463190", "00340002470198",
//                        "00340002479191", "00340002490196", "00340002502196", "00340002503193",
//                        "00340002506194", "00340002510191", "00340002521197", "00340002524198",
//                        "00340002527199", "00340002528196", "00340002554195", "00340002563197",
//                        "00340002564194", "00340002617197", "00340002619191", "00340002621194",
//                        "00340002636198", "00340002642199", "00340002644193", "00340002654192",
//                        "00340002668199", "00340002671199"};
        for (String number : numbers) {
            smartCardSerialNumberField.clear();
            smartCardSerialNumberField.sendKeys(number);
            smartCardSerialNumberField.sendKeys(Keys.RETURN);
//            addToCartBtn.click();
            Utils.waitFor(2);
            boolean isWarningVisible = false;
            try {
                Utils.waitForVisibility(warningForAlreadyUsedSerialNumber, 15);
                isWarningVisible = true;
            } catch (Exception e) {
                isWarningVisible = false;
            }
            if (isWarningVisible) {
                System.out.println(number + "number has already been used.");
                smartCardSerialNumberField.clear();
                smartCardSerialNumberField.sendKeys(number);
                smartCardSerialNumberField.sendKeys(Keys.RETURN);
                addToCartBtn.click();
                continue;
            } else {
                System.out.println(number + " number has accepted successfully.");
                break;
            }
        }
    }
//public void numbersCreationForSerialNumbers() {
//    String[] numbers = {
//            "00340002225194", "00340002231195", "00340002248193", "00340002249190",
//            "00340002258192", "00340002262199", "00340002271191", "00340002297191",
//            "00340002303199", "00340002308194", "00340002312191", "00340002318193",
//            "00340002337194", "00340002355198", "00340002373192", "00340002380190",
//            "00340002382194", "00340002388196", "00340002394197", "00340002395194",
//            "00340002396191", "00340002404193", "00340002418190", "00340002437191",
//            "00340002456192", "00340002457199", "00340002463190", "00340002470198",
//            "00340002479191", "00340002490196", "00340002502196", "00340002503193",
//            "00340002506194", "00340002510191", "00340002521197", "00340002524198",
//            "00340002527199", "00340002528196", "00340002554195", "00340002563197",
//            "00340002564194", "00340002617197", "00340002619191", "00340002621194",
//            "00340002636198", "00340002642199", "00340002644193", "00340002654192",
//            "00340002668199", "00340002671199"
//    };
//
//    for (String number : numbers) {
//        smartCardSerialNumberField.clear();
//        smartCardSerialNumberField.sendKeys(number);
//        smartCardSerialNumberField.sendKeys(Keys.RETURN);
//        Utils.waitFor(2);
//
//        boolean isWarningVisible = false;
//        try {
//            Utils.waitForVisibility(warningForAlreadyUsedSerialNumber, 15);
//            isWarningVisible = true;
//        } catch (Exception e) {
//            isWarningVisible = false;
//        }
//
//        if (isWarningVisible) {
//            System.out.println(number + " number has already been used.");
//        } else {
//            System.out.println(number + " number has accepted successfully.");
//            addToCartBtn.click(); // Sadece başarılı olan sayılar için addToCartBtn.click() çağrısını buraya taşıdım
//        }
//    }
//}

    public void verifyTheOrderStatusIsCompleted() {

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
