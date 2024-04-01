package dnext.com.pages.customer360;
import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import com.utilities.Utils;
import dnext.com.pages.BasePage;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static com.utilities.Utils.waitFor;
import static dnext.com.pages.camundaPage.HomePageCamunda.*;

@Log4j2
public class AbelActivationPage extends BasePage {

    @FindBy(xpath = "//span[@class='mat-option-text'][normalize-space()='Abel']")
    public WebElement optionAbel;
    @FindBy(xpath = "//p[.='Smart Card']")
    public WebElement smartCardOption;
    @FindBy(xpath = "(//span[@class='mat-button-wrapper'])[5]")
    public WebElement smartCardAddSign;
    @FindBy(xpath = "//mat-basic-chip[normalize-space()='12 X ALL2550']")
    public WebElement contract12XALL2550ForDigitalbPremiumPlus;
    @FindBy(xpath = "//mat-basic-chip[normalize-space()='12 X ALL0']")
    public WebElement contract12XALL0ForSmartCard;
    @FindBy(xpath = "//input[@id=\"SmartCardSerialNumber\"]")
    public WebElement smartCardSerialNumberField;
    @FindBy(xpath = "(//mat-icon[@role='img'][normalize-space()='add'])[1]")
    public WebElement aksesFeePerDekoderBasicAddSign;
    @FindBy(xpath = "(//*[@class='mat-chip mat-focus-indicator mat-primary mat-basic-chip ng-star-inserted'][.=' 12 X ALL0 '])[2]")
    public WebElement contract12XALL0ForAksesFeePerDekoderBasic;
    @FindBy(xpath = "(//mat-icon[@role='img'][normalize-space()='add'])[2]")
    public WebElement addIconForTarifeInstalimi;
    @FindBy(xpath = "//mat-basic-chip[normalize-space()='ALL1500 12Month']")
    public WebElement contractALL150012MonthForTarifeInstalimi;
    @FindBy(xpath = "//mat-row[1]//mat-cell[2]//span[1]")
    public WebElement orderStatus;
    @FindBy(xpath = "//span[normalize-space()='Add to Cart']")
    public WebElement addToCartBtn;
    @FindBy(xpath = "//*[.='ERROR_MESSAGES.THERE_IS_ALREADY_ON_GOING_CART_ITEM_EXIST']")
    public WebElement warningForAlreadyUsedSerialNumber;
    @FindBy(xpath = "//h3[.=\"Digitalb Premium Plus \"]")
    public WebElement selectedProductInShoppingCart;
    @FindBy(xpath = "//*[.='ERROR_MESSAGES.THERE_IS_ALREADY_ON_GOING_CART_ITEM_EXIST']")
     public WebElement warningForAlreadyOnGoingSerialNumber;
    @FindBy(xpath = "//*[.='One of the product already in use by another customer!!']")
     public WebElement warningForAlreadyInUsedSerialNumber;


    public void verifyTheOrderStatusIsCompleted() {
        if (orderStatus.getText().equalsIgnoreCase("completed")) {
            System.out.println("orderStatus.getText() = " + orderStatus.getText());
            Assert.assertEquals("completed", orderStatus.getText());
        } else {
            System.out.println("OrderStatus is= " + orderStatus.getText());
            String OrderId = orderIdField.getText();
            Driver.getDriver().get(ConfigurationReader.getProperty("comundaViewer.site.url"));
            sendKeys(orderIdFieldOnCamundaHomePage, OrderId);
            clickField(productOrderCamundaOnHomePage);
            waitFor(1);
            clickField(fullfillmentTypeFirstChoiceIconOnCamunda);
            clickField(variablesChoiceIconOnCamunda);
            waitFor(2);
            log.error("Error message is " + errorMessageOnVariablesOnCamunda.getText());
            switchToWindowNew(0);
        }
    }

    public void serialNumbersCreation() {
        String[] numbers =
                {
                        "002001380290", "002001380308", "002001380316", "002001380324", "002001380332", "002001380340", "002001380357",
                        "002001380365", "002001380373", "002001380381", "002001380399", "002001380407", "002001380415", "002001380423",
                        "002001380431", "002001380449", "002001380456", "002001380464", "002001380472", "002001380480", "002001380498",
                        "002001380506", "002001380514", "002001380522", "002001380530", "002001380548", "002001380555", "002001380563",
                        "002001380571", "002001380589", "002001380597", "002001380605", "002001380613", "002001379003", "002001379011",
                        "002001379029", "002001379037", "002001379045", "002001379052", "002001379060", "002001379078", "002001379086",
                        "002001379094", "002001379102", "002001379110", "002001379128", "002001379136", "002001379144", "002001379151",
                        "002001379169", "002001379177", "002001379193", "002001379201", "002001379219", "002001379227", "002001380282",};
        outerLoop:
        for (String number : numbers) {
            smartCardSerialNumberField.clear();
            waitFor(1);
            smartCardSerialNumberField.sendKeys(number);
            waitFor(1);
            addToCartBtn.click();
            waitFor(1);


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
    }


//            boolean isWarningVisible = false;
//            try {
//                Utils.waitForVisibility(warningForAlreadyUsedSerialNumber, 15);
//                isWarningVisible = true;
//            } catch (Exception e) {
//                isWarningVisible = false;
//            }
//            if (isWarningVisible) {
//                System.out.println(number + "number has already been used.");
//                continue;
//            } else {
//                System.out.println(number + " number has accepted successfully.");
//                break;
//            }
//        }
//        return this;
//    }



