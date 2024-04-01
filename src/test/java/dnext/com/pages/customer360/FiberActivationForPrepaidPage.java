package dnext.com.pages.customer360;

import com.utilities.Driver;
import com.utilities.Utils;
import dnext.com.pages.BasePage;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.event.KeyEvent;

@Log4j2
public class FiberActivationForPrepaidPage extends BasePage {

    @FindBy(xpath = "//*[.='ERROR_MESSAGES.THERE_IS_ALREADY_ON_GOING_CART_ITEM_EXIST']")
    static  public WebElement warningForAlreadyUsedSerialNumber;
    @FindBy(xpath = "//*[@id=\"mat-checkbox-31\"]/label/span[1]")
    public WebElement internetCheckBoxButton;
    @FindBy(xpath = "//*[.=' Vodafone GigaFibra 200 Mbps ']")
    public static WebElement vodafoneGigaFibra200MbpsOption;
    @FindBy(xpath = "(//*[.='Vodafone GigaFibra 200 Mbps'])[2]")
    public WebElement vodafoneGigaFibra200MbpsTextOnProducts;
    @FindBy(xpath = "//mat-basic-chip[normalize-space()='ALL12600 6Month']")
    public WebElement aLL126006MonthCashOption;
    @FindBy(xpath = "//*[@id=\"mat-select-value-5\"]")
    public WebElement dropdownForFiberOptions;
    @FindBy(xpath = "//span[@class='mat-option-text'][.=' FIBER ']")
    public WebElement optionFiber;
    @FindBy(xpath = "(//span[@class='mat-button-wrapper'][.='add'])[4]")
    public WebElement basicEnterpriseModemAddButton;
    @FindBy(xpath = "//div[@class='mat-chip-list-wrapper']//*[.=' ALL0 6Month ']")
    public WebElement aLL06MonthCashOption;
    @FindBy(xpath = "(//input[@id='PPPoEUser'])[1]")
    static public WebElement pPPoEUserInputField;
    @FindBy(xpath = "//input[@id='ONTSerialNumber']")
    static public WebElement oNTSerialNumberInputField;
    @FindBy(xpath = "//span[@class='mat-button-wrapper'][.='SAVE ']")
    public WebElement saveButtonAfterCheckout;
    @FindBy(xpath = "//*[.='Activation Form']")
   static public WebElement activationFormButtonAfterCheckout;
    @FindBy(xpath = "//span[normalize-space()='Add to Cart']")
    public WebElement addToCartBtn;
    @FindBy(xpath = "//mat-row[1]//mat-cell[2]//span[1]")
    static public WebElement orderStatus;
    @FindBy(xpath = "//h3[.=\"Basic Enterprise Modem \"]")
    public WebElement selectedProductInShoppingCart;
    @FindBy(xpath = "//mat-row[1]//mat-cell[3]")
    public WebElement orderDateOfOrder;
    @FindBy(xpath = "//mat-row[1]//mat-cell[9]//span[1]")
    public WebElement aggreementIdOfOrder;
    @FindBy(xpath = "//tbody/tr[1]/td[2]")
    public WebElement invoiceDateOfFiscalizationReceipt;
    @FindBy(css = "tbody tr:nth-child(1) td:nth-child(6) a:nth-child(1)")
    public WebElement aggreementIdOfFiscalizationReceipt;
    @FindBy(xpath = "//*[@class=\"mat-tab-label-content\"][.='Order']")
    public WebElement orderButtonOnCustomer360Page;
    @FindBy(xpath = "//div[contains(text(),'Fiscalization Receipts')]")
    public WebElement fiscalizationReceiptsButton;
    @FindBy(xpath = "(//div[@class='mat-tab-header-pagination-chevron'])[2]")
    public WebElement directionSignTofiscalizationReceiptsButton;
    @FindBy(xpath = "(//span[.=' Detail '])[1]")
    public WebElement detailFirstButtonOnFiscalization;
    @FindBy(xpath = "(//span[.=' New Order '])[2]")
    public WebElement newOrderBtnOnPrepaid;
    @FindBy(xpath = "(//span[.=' New Order '])[4]")
    public WebElement newOrderBtnOnPostpaid;
    @FindBy(xpath = " //span[.=' Create the receipt ']")
    public WebElement createReceiptButton;


    public void numbersCreationForSerialNumbers() {
        String[] numbers =
                {"4857544313F18C92", "4857544314170A9D", "4857544314191E9D", "4857544314228925", "485754431423CD25",
                        "485754431424C025", "4857544314269425", "485754431428B925", "48575443142B2625", "48575443144CC225",
                        "48575443145F87A1", "485754431469A2A1", "4857544314705F81", "48575443147142A1", "485754431471D142",
                        "4857544314741540", "4857544314749681", "4857544314749742", "485754431475EB42", "4857544314765942",
                        "4857544314794281", "48575443147B6D42", "48575443147E3342", "48575443147E7942", "4857544314800942",
                        "4857544314840F42", "4857544314844142", "4857544314847d42", "4857544314852742", "4857544314859542",
                        "485754431485BC80", "485754431485FAA1", "4857544314862B42", "4857544314886540", "48575443148B8542",
                        "48575443148C5742", "485754431490AB81", "4857544314921380", "4857544314933493", "485754431493B942",
                        "485754431494E542", "485754431494F942", "4857544314A0EB81", "4857544314A20580", "4857544314AB2980",
                        "4857544314B13881", "4857544314B29380", "4857544314B36781", "4857544314DF0F80", "4857544314DFD280",
                        "4857544314E27944", "4857544314E3F6A1", "4857544314E8C280", "4857544314F06805", "4857544314F0AE05",
                        "4857544314F23405", "4857544314F23E05", "4857544314F25205", "4857544314FE7C3F", "4857544315017A86",
                        "4857544315074780", "48575443150FC681", "48575443151004A3", "4857544315133C44", "485754431519FC44",
                        "4857544315218B44", "485754431522FCA1", "4857544315278A69", "485754431529FEA1", "48575443152DD08F",
                        "4857544313F2367B", "4857544313F54A25", "4857544313F62225", "4857544313F65825", "4857544313F84344",
                        "4857544313FBD69A", "4857544313FD6025", "4857544313FF358F", "4857544314020425", "4857544314039025",
                        "4857544314064E25", "48575443140A1580", "48575443140B6725", "48575443140C3625", "48575443140D759C",
                        "4857544314146725", "4857544314165D92", "485754431416DD25"};
        for (String number : numbers) {
            pPPoEUserInputField.clear();
            oNTSerialNumberInputField.clear();
            pPPoEUserInputField.sendKeys(number);
            pPPoEUserInputField.sendKeys(Keys.RETURN);
            oNTSerialNumberInputField.sendKeys(number);
            oNTSerialNumberInputField.sendKeys(Keys.RETURN);
            addToCartBtn.click();
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
                continue;
            } else {
                System.out.println(number + " number has accepted successfully.");
                break;
            }
        }
    }

    static public void verifyTheOrderStatusIsCompleted() {
        if (orderStatus.getText().equalsIgnoreCase("completed")) {
            System.out.println("OrderStatus is = " + orderStatus.getText());
            Assert.assertEquals("completed", orderStatus.getText());
        } else {
            System.out.println("OrderStatus is = " + orderStatus.getText());
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



    static public void activationFormClicking() {
        Utils.waitFor(1);
        clickField(activationFormButtonAfterCheckout);
        Utils.waitFor(10);
        System.out.println("Driver.getDriver().getWindowHandles().size() = " + Driver.getDriver().getWindowHandles().size());
        if (Driver.getDriver().getWindowHandles().size() > 1) {
            switchToWindowNew(1);
            Utils.waitFor(5);

            Robot robot = null;
            try {
                robot = new Robot();
            } catch (AWTException e) {
                System.err.println("Error creating Robot instance: " + e.getMessage());
                e.printStackTrace();
            }
            if (robot != null) {
                robot.keyPress(KeyEvent.VK_ESCAPE);
                robot.keyRelease(KeyEvent.VK_ESCAPE);
                Utils.waitFor(1); // Adjust this wait time as needed
            }
            Driver.getDriver().close();
            switchToWindowNew(0);
        }
    }

    public void verificationOfFiscalisationWithOrder() {
        String agrementIdOfOrder = "";
        String agrementIdOfFiscalizationReceipt = "";
        String orderDateOfOrderButton = "";
        String orderDateOfFiscalizationReceipt = "";
        clickField(orderButtonOnCustomer360Page);
        Utils.waitFor(1);
        agrementIdOfOrder = aggreementIdOfOrder.getText();
        System.out.println("agrementIdOfOrder is :" + agrementIdOfOrder);
        orderDateOfOrderButton = orderDateOfOrder.getText();
        clickField(directionSignTofiscalizationReceiptsButton);
        Utils.waitFor(2);
        clickField(directionSignTofiscalizationReceiptsButton);
        Utils.waitFor(2);
        clickField(fiscalizationReceiptsButton);
        Utils.waitFor(3);
        agrementIdOfFiscalizationReceipt = aggreementIdOfFiscalizationReceipt.getText();
        System.out.println("agrementIdOfFiscalizationReceipt is :" + agrementIdOfFiscalizationReceipt);
        orderDateOfFiscalizationReceipt = invoiceDateOfFiscalizationReceipt.getText();
        System.out.println("orderDateOfOrderButton is " + orderDateOfOrderButton);
        System.out.println("orderDateOfFiscalizationReceipt is " + orderDateOfFiscalizationReceipt);
        Utils.waitFor(1);
        Assert.assertEquals(agrementIdOfOrder,agrementIdOfFiscalizationReceipt);
    }

    public void receipCreationForABCOM(){
        clickField(createReceiptButton);
        Utils.waitFor(3);
        switchToWindowNew(1);
        System.out.println("Driver.getDriver().getWindowHandles().size() = " + Driver.getDriver().getWindowHandles().size());
        Driver.getDriver().close();
        switchToWindowNew(0);
    }


}




