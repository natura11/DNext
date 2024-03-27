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
    public WebElement warningForAlreadyOnGoingSerialNumber;
    @FindBy(xpath = "//*[.='One of the product already in use by another customer!!']")
    public WebElement warningForAlreadyInUsedSerialNumber;
    @FindBy(xpath = "(//mat-basic-chip[normalize-space()='ALL0 3Month'])[1]")
    public WebElement all03MonthsOptionForSmartCardCashOption;
    @FindBy(xpath = "(//mat-icon[@role='img'][normalize-space()='add'])[1]")
    public WebElement smartCardAddSignofCryptoguard;
    @FindBy(xpath = "(//mat-icon[@role='img'][normalize-space()='add'])[1]")
    public WebElement aksesFeePerDekoderBasicAddSign;


    public void numbersCreationForSerialNumbers() {
        String[] numbers = {"00340002231195", "00340002248193", "00340002249190",
                "00340002258192", "00340002262199", "00340002271191", "00340002297191"};

        for (int currentIndex = 0; currentIndex < numbers.length; currentIndex++) {
            String number = numbers[currentIndex];

            int counter = 0;

            while (counter < 2) {
                counter++;

                smartCardSerialNumberField.clear();
                smartCardSerialNumberField.sendKeys(number);
                smartCardSerialNumberField.sendKeys(Keys.RETURN);
                Utils.waitFor(1);
                addToCartBtn.click();
                Utils.waitFor(1);



                if (warningForAlreadyInUsedSerialNumber.isDisplayed()|| warningForAlreadyOnGoingSerialNumber.isDisplayed()) {
                    System.out.println(number + "  already been used or the selected number in progress.");


                    // Continue to the next number, if the first warning is encountered
                    if (currentIndex < numbers.length - 1) {
                        System.out.println("Processing Next Number: " + (currentIndex + 1));
                        currentIndex++;
                    }

                }if (!warningForAlreadyInUsedSerialNumber.isDisplayed()
                        && !warningForAlreadyOnGoingSerialNumber.isDisplayed()) {
                    System.out.println(number + " has been processed.");
                    break;
                }


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

//    public String numbersCreationForSerialNumbers(int currentIndex) {
//
//        String[] numbers = {
//                "00340002231195", "00340002248193", "00340002249190",
//                "00340002258192", "00340002262199", "00340002271191", "00340002297191",
//                "00340002303199", "00340002308194", "00340002312191", "00340002318193",
//                "00340002337194", "00340002355198", "00340002373192", "00340002380190",
//                "00340002382194", "00340002388196", "00340002394197", "00340002395194",
//                "00340002396191", "00340002404193", "00340002418190", "00340002437191",
//                "00340002456192", "00340002457199", "00340002463190", "00340002470198",
//                "00340002479191", "00340002490196", "00340002502196", "00340002503193",
//                "00340002506194", "00340002510191", "00340002521197", "00340002524198"
//        };
//
//        if (currentIndex >= numbers.length) {
//            System.out.println("All numbers have been processed.");
//            return "";
//        }
//
//        String number = numbers[currentIndex];
//        smartCardSerialNumberField.clear();
//        smartCardSerialNumberField.sendKeys(number);
//        smartCardSerialNumberField.sendKeys(Keys.RETURN);
//        Utils.waitFor(1);
//        addToCartBtn.click();
//        Utils.waitFor(1);
//
//        if (warningForAlreadyInUsedSerialNumber.getAttribute("textContent").equals("One of the product already in use by another customer!!")) {
//            Utils.waitForVisibility(warningForAlreadyOnGoingSerialNumber, 2);
//            System.out.println(number + " number is in progress.");
//            return numbersCreationForSerialNumbers(currentIndex + 1);
//        } else if (warningForAlreadyOnGoingSerialNumber.getAttribute("textContent").equals("ERROR_MESSAGES.THERE_IS_ALREADY_ON_GOING_CART_ITEM_EXIST")) {
//            Utils.waitForVisibility(warningForAlreadyInUsedSerialNumber, 2);
//            System.out.println(number + " number has already been used.");
//            return numbersCreationForSerialNumbers(currentIndex + 1);
//        } else {
//            System.out.println(number + " number has accepted successfully.");
//            return number;
//        }


