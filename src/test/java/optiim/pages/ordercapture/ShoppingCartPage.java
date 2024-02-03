package optiim.pages.ordercapture;

import optiim.framework.core.PageBase;
import optiim.framework.helpers.WebDriverHelper;
import optiim.framework.helpers.WorldHelper;
import optiim.framework.utils.log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

//import static optiim.pages.customermanagement.Customer360Page.btnCheckOut;


public class ShoppingCartPage extends PageBase {

    public static final By titleShoppingCartPage = By.xpath("//div[contains(text(),'My Shopping Cart')]");
    public static final By titleProductName = By.cssSelector("[class='d-product-details'] [class='d-product-name']");
    public static final By btnProducts = By.xpath("//*[contains(text(),'Products')]");
    public static final By btnDeleteProduct = By.xpath("//mat-icon[contains(text(),'delete')]");
    public static final By titleDeleteProductMessage = By.cssSelector("[class*='d-alert']");
    public static final By btnCheckout = By.xpath("//*[contains(text(),'CHECKOUT')]");
    public static final By btnShoppingCartConfirm = By.xpath("//span[contains(text(),'OK')]");
    public static final By pcrFutureDate = By.xpath("//mat-form-field//input");
    public static final By btnAddDocument = By.xpath("//mat-icon[contains(text(),'add')]");
    public static final By txtFileInput = By.id("fileInput");
    public static final By cmbPaymentMethod = By.cssSelector("mat-select");
    public static final By chkPaymentCollected = By.xpath("//input[@type='checkbox']//parent::span");

    private final WorldHelper worldHelper;

    public ShoppingCartPage(WebDriverHelper webDriverHelper, WorldHelper worldHelper) {
        super(webDriverHelper);
        this.worldHelper = worldHelper;
    }


    public ShoppingCartPage controlProduct() throws InterruptedException {
        Thread.sleep(5000);
        control(isElementExist(titleShoppingCartPage), "Shopping Cart Page opened.", "ERROR: Shopping Cart Page did not open.");
        String expectedProductName = worldHelper.getProductName();
        log.info("Expected Product Name:" + expectedProductName);
        //elementToBeClickable(titleProductName);
        List<WebElement> elementList = findElements(titleProductName);
        String incomingProductName = elementList.get(elementList.size() - 1).getText();
        log.info("Incoming Product Name:" + incomingProductName);
        control(incomingProductName.contains(expectedProductName), expectedProductName + "product is exist.", "ERROR:" + expectedProductName + "product is not exist.");
        return this;
    }

    public ShoppingCartPage clickProductsButton() throws InterruptedException {
        clickJS(btnProducts);
        log.info("Products Button clicked.");
        return this;
    }

    public ShoppingCartPage clickDeleteButton() throws InterruptedException {
        Thread.sleep(1000);
        clickJS(btnDeleteProduct);
        log.info("Delete Button clicked.");
        return this;
    }

    public ShoppingCartPage controlDeleteProductMessage(String deleteMessage) throws InterruptedException {
        Thread.sleep(2000);
        log.info("Expected Message:" + deleteMessage);
        //String incomingMessage = getTextOfElement(titleDeleteProductMessage);
        //log.info("Incoming Message:" + incomingMessage);
        //control(incomingMessage.contains(deleteMessage), deleteMessage + "title is exist.", "ERROR:" + deleteMessage + "title is not exist.");
        control(isElementExist(By.xpath("//*[contains(text(),'" + deleteMessage + "')]")), "Popup control is successfully", "ERROR:Popup control is not successfully");
        return this;
    }

    public ShoppingCartPage clickCheckoutButton() throws InterruptedException {
        Thread.sleep(2000);
        clickJS(btnCheckout);
        log.info("Checkout Button clicked.");
        return this;
    }

    public ShoppingCartPage controlAdditionalProduct(String productName) throws InterruptedException {
        Thread.sleep(1000);
        log.info(productName + "Additional Product is checking");
        control(isElementExist(By.xpath("//*[contains(text(),'" + productName + "')]")), productName + "product is exist.", "ERROR:" + productName + "product is not exist.");
        return this;
    }

    public ShoppingCartPage controlDeleteMessage(String deleteMessage) throws InterruptedException {
        Thread.sleep(1750);
        log.info(deleteMessage + "Message is checking");
        control(isElementExist(By.xpath("//*[contains(text(),'" + deleteMessage + "')]")), deleteMessage + "message is exist.", "ERROR:" + deleteMessage + "message is not exist.");
        return this;
    }

    public ShoppingCartPage clickConfirmButton() throws InterruptedException {
        Thread.sleep(2000);
        clickJS(btnShoppingCartConfirm);
        log.info("Shopping Cart Page Confirm Button clicked.");
        return this;
    }

    public ShoppingCartPage controlShoppingPage() throws InterruptedException {
        switchWindowTab();
        Thread.sleep(5000);
        control(isElementExist(btnCheckout), "Checkout Button Address field is exist.", "Checkout Button Address field is not exist.");
        return this;
    }

    public ShoppingCartPage controlFutureDate() {
        log.info("Future Date Field is checking.");
        control(isElementExist(pcrFutureDate), "Future Date Field is exist.", "ERROR: Future Date Field is not exist.");
        return this;
    }

    public ShoppingCartPage enterFutureDate() throws InterruptedException {
        Thread.sleep(500);
        clickJS(By.cssSelector("[aria-label='Open calendar']"));
        Thread.sleep(1000);
        clickJS(By.cssSelector("div[class*='mat-calendar-body-today']"));
        log.info("Enter Future Date:");
        return this;
    }

    public ShoppingCartPage clickProceedButton() throws InterruptedException {
        Thread.sleep(1000);
        clickJS(By.xpath("//*[contains(text(),'COMPLETE CHECKOUT')]"));
        log.info("Proceed Button clicked.");
        Thread.sleep(1000);
        return this;
    }

    public ShoppingCartPage clickAddDocumentButton() throws InterruptedException {
        Thread.sleep(1000);
        clickJS(btnAddDocument);
        log.info("Add Document Button clicked.");
        return this;
    }

    public ShoppingCartPage enterAddFile() throws InterruptedException, AWTException {
        Thread.sleep(500);
        String path = System.getProperty("user.dir") + "\\document.jpg";
        uploadFile(txtFileInput, path);
        Thread.sleep(1000);
//        Robot robot = new Robot();
//        robot.keyPress(KeyEvent.VK_ESCAPE);
//        robot.keyRelease(KeyEvent.VK_ESCAPE);
//        Thread.sleep(1000);
        log.info("File uploaded.");
        return this;
    }

    public ShoppingCartPage controlUploadedFiles() throws InterruptedException {
        Thread.sleep(2000);
        log.info("Uploaded Files is checking.");
        control(isElementExist(By.xpath("//*[contains(text(),'document.jpg')]")), "Uploaded Files is exist.", "ERROR: Uploaded Files is not exist.");
        return this;
    }

    public ShoppingCartPage clickDocumentForm(String documentForm) throws InterruptedException {
        Thread.sleep(1000);
        clickJS(By.xpath("//*[contains(text(),'" + documentForm + "')]"));
        log.info(documentForm + "Document Form clicked.");
        return this;
    }

    public ShoppingCartPage controlPrintOption() throws InterruptedException {
        //switchWindowTab();
        Thread.sleep(3000);
        ArrayList<String> tabs = new ArrayList<String>(getWebDriver().getWindowHandles());
        getWebDriver().switchTo().window(tabs.get(1));
        Thread.sleep(2000);
        log.info("Print Option is checking.");
        //control(isElementExist(By.xpath("//*[contains(text(),'FORMULAR REGJISTRIMI')]")), "Print Option is exist.", "ERROR: Print Option is not exist.");
        return this;
    }

    public ShoppingCartPage selectPaymentMethod(String paymentMethod) throws InterruptedException {
        Thread.sleep(1000);

        clickJS(findElements(cmbPaymentMethod).get(1));
        Thread.sleep(500);
        clickJS(By.xpath("//span/span[contains(.,'" + paymentMethod + "')]"));
        log.info("Select Payment Method " + paymentMethod);
        return this;
    }

    public ShoppingCartPage clickPaymentCollected() throws InterruptedException {
        clickJS(chkPaymentCollected);
        log.info("Payment Collected Button clicked.");
        return this;
    }

    public ShoppingCartPage clickButton(String buttonName) throws InterruptedException {
        Thread.sleep(2000);
        clickJS(By.xpath("//*[contains(text(),'" + buttonName + "')]"));
        log.info(buttonName + " Button clicked.");
        return this;
    }

    public ShoppingCartPage clickOkButton() throws InterruptedException {
        Thread.sleep(1000);
        clickJS(By.xpath("//button[@color='primary']"));
        log.info("OK Button clicked.");
        return this;
    }

    public ShoppingCartPage controlShoppingCartField(String fieldName) {
        log.info(fieldName + "Field is checking.");
        By locator = null;
        switch (fieldName) {
            case "Payment Collected":
                locator = chkPaymentCollected;
                break;
            case "Payment Method":
                locator = cmbPaymentMethod;
                break;
            default:
                //code block
        }
        control(isElementExist(locator), fieldName + "field is exist.", "ERROR:" + fieldName + "field is not exist.");
        return this;
    }

    public ShoppingCartPage controlPaymentMethodValue(String paymentMethodValue) throws InterruptedException, AWTException {
        log.info("Payment Method Value is checking.");
        clickJS(findElements(cmbPaymentMethod).get(1));
        Thread.sleep(2000);
        String[] paymentMethodValues = paymentMethodValue.split(",");
        for (int i=0; i<paymentMethodValues.length; i++) {
            control(isElementExist(By.xpath("//*[contains(text(),'" + paymentMethodValues[i] + "')]")), paymentMethodValues[i] + " payment method value is exist.", "ERROR:" + paymentMethodValues[i] + " payment method value is not exist.");
        }
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        return this;
    }

    public ShoppingCartPage controlCheckoutButton() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Checkout Button is checking.");
        control(isElementExist(By.xpath("//span[contains(text(),'Checkout')]//parent::button[contains(@style,'hidden')]")),"Checkout Button is not exist.","Checkout Button is exist.");
        return this;
    }

    public ShoppingCartPage selectDocumentType(String documentType) throws InterruptedException {
        Thread.sleep(1000);
        selectMatComboboxJS(By.xpath("//mat-select"),documentType);
        log.info("Select Document Type:" + documentType);
        return this;
    }
}