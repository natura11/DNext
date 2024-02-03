package optiim.pages.ordercapture;

import optiim.framework.core.PageBase;
import optiim.framework.helpers.WebDriverHelper;
import optiim.framework.helpers.WorldHelper;
import optiim.framework.utils.log;
import optiim.models.data.gui.ordercapture.OrderCaptureData;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.io.IOException;
import java.util.List;


public class ProductDetailPage extends PageBase {

    public static final By sctProductDetail = By.cssSelector("[class='d-product-detail-section']");
    public static final By sctProductQty = By.tagName("app-product-qty");
    public static final By btnConfigurable = By.xpath("//div[contains(text(),'Configurable Characteristic')]");
    public static final By btnPredefined = By.xpath("//div[contains(text(),'Predefined Characteristic')]");
    public static final By titleProductTerm = By.xpath("//span[contains(text(),'Product Term')]");
    public static final By btnProducts = By.xpath("//a[contains(text(),'Products')]");
    public static final By cmbCaseSize = By.id("Case Size");
    public static final By cmbConnectivity = By.id("Connectivity");
    public static final By cmbBandSize = By.id("Band Size");
    public static final By cmbColour = By.id("Test_Mouse_Color");
    //public static final By cmbColour = By.id("Colour");
    public static final By cmbStorage = By.id("Storage");
    public static final By btnMonthTwentyFour = By.xpath("//div[contains(text(),'24 Month Commitment')]");
    public static final By btnMonthTwelve = By.xpath("//div[contains(text(),'12MonthCommitment')]");
    public static final By btnCash = By.xpath("//div[contains(text(),'Cash')]");
    public static final By titleProductQty = By.cssSelector("[class='d-product-qty'] span");
    public static final By btnIncreaseQty = By.xpath(" //button[contains(text(),'+')]");
    public static final By btnDecreaseQty = By.xpath("//button[contains(text(),'-')]");
    public static final By btnAddToCart = By.xpath("//span[contains(text(),'Add to Cart')]");
    public static final By btnAddToCartActive = By.xpath("//span[contains(text(),'Add to Cart')]//parent::button");
    public static final By btnShoppingCart = By.cssSelector("nav button[class*='mat-focus-indicator mat-button']");
    public static final By btnAddToCartDeactive = By.cssSelector("[class='d-product-op-section'] button[ng-reflect-disabled='true']");
    public static final By btnProductImage = By.cssSelector("[class='d-img-nav'] li");
    public static final By titleProductDescription = By.xpath("//span[contains(text(),'» An expansive Retina display so you can see more ')]");
    public static final By titleProductDescriptionList = By.cssSelector("[class='d-product-description'] ul li span");
    public static final By titleAppleWatchSE = By.xpath("//div[contains(text(),'AppleWatchSE')]");
    public static final By titlePredefinedList = By.cssSelector("[class*='mat-tab-body-content'] ul li");
    public static final By txtSerialNumber = By.id("SmartCardSerialNumber");
    public static final By txtSerialNumberInvalid = By.cssSelector("[id='SerialNumber'][class*='ng-invalid']");
    public static final By cmbTVInfrastructure = By.id("TVInfrastructure");
    public static final By cmbTVInfrastructureInvalid = By.cssSelector("[id='TVInfrastructure'][class*='ng-invalid']");
    public static final By titlePaymentPlan = By.xpath("//*[contains(text(),'Payment Plan')]");
    public static final By txtSipPassword = By.id("SipPassword");
    public static final By txtSipPasswordInvalid = By.cssSelector("[ng-reflect-name='SipPassword'][class*='ng-invalid']");
    public static final By txtSipUser = By.id("SipUser");
    public static final By txtSipUserInvalid = By.cssSelector("[id='SipUser'][class*='ng-invalid']");
    public static final By txtPhoneNumber = By.id("PhoneNumber");
    public static final By txtPhoneNumberTwo = By.id("PhoneNumber2");
    public static final By txtPhoneNumberInvalid = By.cssSelector("[ng-reflect-name='PhoneNumber'][class*='ng-invalid']");
    public static final By cmbPhoneNumber = By.xpath("//mat-select[@id='mat-select-0']");
    public static final By titleProductName = By.xpath("//mat-card//div//h3");
    //public static final By btnShoppingCart = By.xpath("//button[@routerlink='shopping-cart']");
    public static final By titlePaymentPlanType = By.cssSelector("[class='mat-button-toggle-label-content']");
    public static final By titleProductPrice = By.xpath("//mat-card[contains(@class,'ng-star-inserted')]//p//following-sibling::span");
    public static final By titleTotalProductPrice = By.xpath("//mat-card//h1");
    public static final By cmbInternetInfrastructureTest = By.xpath("//strong[contains(text(),'Test')]//following-sibling::mat-tab-group//mat-select[@ng-reflect-id='InternetInfrastructure']");
    public static final By cmbInternetInfrastructure = By.xpath("//mat-select[@id='Infrastructure']");
    public static final By txtMacAddressTest = By.xpath("//strong[contains(text(),'Test')]//following-sibling::mat-tab-group//input[@ng-reflect-id='MacAddress']");
    public static final By txtMacAddress = By.xpath("//input[@id='MACAddress']");
    public static final By txtStaticIPTest = By.xpath("//strong[contains(text(),'Test')]//following-sibling::mat-tab-group//input[@ng-reflect-id='StaticIP']");
    public static final By txtStaticIP = By.xpath("//input[@ng-reflect-id='StaticIP']");
    public static final By btnAddOnProduct = By.xpath("//mat-icon[contains(text(),'add')]");
    public static final By cmbAddOnTVInfrastructure = By.xpath("//app-dynamic-inputs//mat-select[@id='Infrastructure']");
    public static final By btnAddOnProductEdit = By.xpath("//mat-icon[contains(text(),'edit')]");
    public static final By btnProductDetailEdit = By.xpath("//span[contains(text(),'Update the Item')]");
    public static final By txtBundleMacAddress = By.xpath("//strong[contains(text(),'Vodafone GigaFibra 15 Mbps')]//following-sibling::mat-tab-group//input[@ng-reflect-id='MacAddress']");
    public static final By txtBundleStaticIP = By.xpath("//strong[contains(text(),'Vodafone GigaFibra 15 Mbps')]//following-sibling::mat-tab-group//input[@ng-reflect-id='StaticIP']");
    public static final By cmbBundleInternetInfrastructure = By.xpath("//strong[contains(text(),'Vodafone GigaFibra 15 Mbps')]//following-sibling::mat-tab-group//mat-select[@ng-reflect-id='InternetInfrastructure']");
    public static final By txtPrice = By.xpath("//input[@type='number']//following-sibling::span//label//mat-label[contains(text(),'Price')]");
    public static final By txtAmount = By.xpath("//input[@type='number']//following-sibling::span//label//mat-label[contains(text(),'Amount')]");
    public static final By txtDescription = By.xpath("//input[@type='text']//following-sibling::span//label//mat-label[contains(text(),'Description')]");
    public static final By txtAddressLineOne = By.xpath("//textarea[@type='text']//following-sibling::span//label//mat-label[contains(text(),'Address Line 1')]");
    public static final By txtAddressLineTwo = By.xpath("//textarea[@type='text']//following-sibling::span//label//mat-label[contains(text(),'Address Line 2')]");
    public static final By cmbCountry = By.xpath("//mat-select[@role='listbox']//following-sibling::span//label//mat-label[contains(text(),'Country')]");
    public static final By cmbCity = By.xpath("//mat-select[@role='combobox']//following-sibling::span//label//mat-label[contains(text(),'City')]");
    public static final By txtPPPoEUser = By.id("PPPoEUser");
    public static final By btnPurchasableResources = By.xpath("//app-offering-resource//mat-basic-chip");
    public static final By btnPurchasableAddons = By.xpath("//app-offering-addon//mat-basic-chip");

    private final WorldHelper worldHelper;

    public ProductDetailPage(WebDriverHelper webDriverHelper, WorldHelper worldHelper) {
        super(webDriverHelper);
        this.worldHelper = worldHelper;
    }


    public ProductDetailPage controlProductDetailPageTitle() {
        //control(isElementExist(sctProductDetail), "Product Detail Page opened.", "ERROR: Product Detail Page did not open.");
        return this;
    }

    public ProductDetailPage clickProductsButton() throws InterruptedException {
        clickJS(btnProducts);
        log.info("Products Button clicked.");
        return this;
    }

    public ProductDetailPage controlIphoneField(String colour, String storage) {
        control(isElementExist(cmbColour), colour + "field is exist.", "ERROR:" + colour + "field is not exist.");
        control(isElementExist(cmbStorage), storage + "field is exist.", "ERROR:" + storage + "field is not exist.");
        return this;
    }

    public ProductDetailPage selectCaseSizeType(String caseSizeType) throws InterruptedException {
        log.info("Select Case Size Type:" + caseSizeType);
        selectMatComboboxJS(cmbCaseSize, caseSizeType);
        return this;
    }

    public ProductDetailPage selectConnectivityType(String connectivityType) throws InterruptedException {
        log.info("Select Connectivity Type:" + connectivityType);
        selectMatComboboxJS(cmbConnectivity, connectivityType);
        return this;
    }

    public ProductDetailPage selectBandSizeType(String bandSizeType) throws InterruptedException {
        log.info("Select Band Size Type:" + bandSizeType);
        selectMatComboboxJS(cmbBandSize, bandSizeType);
        return this;
    }

    public ProductDetailPage controlPredefinedField(String predefinedTitleOne, String predefinedTitleTwo) throws InterruptedException {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) getWebDriver();
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();", findElement(titlePredefinedList));
        waitForExpectedElement(titlePredefinedList);
        List<WebElement> elementList = findElements(titlePredefinedList);
        String incomingOne = elementList.get(0).getText();
        String incomingTwo = elementList.get(1).getText();
        log.info("Expected Value One:" + predefinedTitleOne);
        log.info("Incoming Value One:" + incomingOne);
        log.info("Expected Value Two:" + predefinedTitleTwo);
        log.info("Incoming Value Two:" + incomingTwo);
        control(incomingOne.contains(predefinedTitleOne), predefinedTitleOne + "title is exist.", "ERROR:" + predefinedTitleOne + "title is not exist.");
        control(incomingTwo.contains(predefinedTitleTwo), predefinedTitleTwo + "title is exist.", "ERROR:" + predefinedTitleTwo + "title is not exist.");
        return this;
    }

    public ProductDetailPage controlProductTermField(String productTermOne, String productTermTwo) throws InterruptedException {
        control(isElementExist(btnMonthTwelve), productTermOne + "title is exist.", "ERROR:" + productTermOne + "title is not exist.");
        control(isElementExist(btnCash), productTermTwo + "title is exist.", "ERROR:" + productTermTwo + "title is not exist.");
        return this;
    }

    public ProductDetailPage enterSerialNumber(String serialNumber) throws InterruptedException, IOException {
        log.info("Enter Serial Number:" + serialNumber);
        serialNumber = OrderCaptureData.getSerialNumber(serialNumber);
        sendKeys(txtSerialNumber, serialNumber);
        return this;
    }

    public ProductDetailPage controlErrorMessage(String fieldName) {
        switch (fieldName) {
            case "Serial Number":
                control(isElementExist(txtSerialNumberInvalid), fieldName + "Invalid and mandatory field.", "ERROR:" + fieldName + "Valid and not mandatory field.");
                break;
            case "TVInfrastructure":
                control(isElementExist(cmbTVInfrastructureInvalid), fieldName + "Invalid and mandatory field.", "ERROR:" + fieldName + "Valid and not mandatory field.");
                break;
            case "SipPassword":
                control(isElementExist(txtSipPasswordInvalid), fieldName + "Invalid and mandatory field.", "ERROR:" + fieldName + "Valid and not mandatory field.");
                break;
            case "Phone Number":
                control(isElementExist(txtPhoneNumberInvalid), fieldName + "Invalid and mandatory field.", "ERROR:" + fieldName + "Valid and not mandatory field.");
                break;
            case "SipUser":
                control(isElementExist(txtSipUserInvalid), fieldName + "Invalid and mandatory field.", "ERROR:" + fieldName + "Valid and not mandatory field.");
                break;
            default:
                //code block
        }
        return this;
    }

    public ProductDetailPage selectTVInfrastructureType(String tvInfrastructureType) throws InterruptedException {
        Thread.sleep(1000);
        log.info("Select TVInfrastructure Type:" + tvInfrastructureType);
        selectMatComboboxJS(cmbTVInfrastructure, tvInfrastructureType);
        return this;
    }

    public ProductDetailPage clickCash() throws InterruptedException {
        clickJS(btnCash);
        log.info("Cash Product Term Button clicked.");
        return this;
    }

    public ProductDetailPage controlPaymentPlan() {
        control(isElementExist(titlePaymentPlan), "Payment Plan field is exist.", "ERROR: Payment Plan field is not exist.");
        return this;
    }

    public ProductDetailPage controlFieldName(String fieldName) {
        if (fieldName.contains("Product Term")) {
            control(isElementExist(By.xpath("//span[contains(text(),'" + fieldName + "')]")), fieldName + " field is exist.", "ERROR:" + fieldName + "field is not exist.");
        } else {
            control(isElementExist(By.xpath("//*[contains(text(),'" + fieldName + "')]")), fieldName + " field is exist.", "ERROR:" + fieldName + "field is not exist.");
        }
        return this;
    }

    public ProductDetailPage enterSipPassword(String sipPassword) throws InterruptedException {
        clearText(txtSipPassword);
        log.info("Enter SipPassword:" + sipPassword);
        sendKeys(txtSipPassword, sipPassword);
        return this;
    }

    public ProductDetailPage enterPhoneNumber(String phoneNumber) throws InterruptedException {
        clearText(txtPhoneNumber);
        log.info("Enter Phone Number:" + phoneNumber);
        sendKeys(txtPhoneNumber, phoneNumber);
        return this;
    }

    public ProductDetailPage controlAddToCartButton() throws InterruptedException {
        Thread.sleep(1000);
        control(isElementExist(btnAddToCartActive), "Add to Cart Button is active.", "ERROR: Add to Cart Button is not active.");
        Thread.sleep(1000);
        return this;
    }

    public ProductDetailPage clickAddToCartButton() throws InterruptedException {
        Thread.sleep(2000);
        worldHelper.setProductName(getTextOfElement(titleProductName));
        clickJS(btnAddToCartActive);
        log.info("Add to Cart Button clicked.");
        Thread.sleep(2750);
        scrollMainWindow(0, 250);
        //elementToBeClickable(btnShoppingCart);
        //Actions actions = new Actions(getWebDriver());
        //actions.moveToElement(findElement(btnShoppingCart)).click().build().perform();
        clickJS(btnShoppingCart);
        log.info("Shopping Cart Button clicked.");
        Thread.sleep(1000);
        return this;
    }

    public ProductDetailPage controlAddToCartButtonDeactive() {
        control(isElementExist(btnAddToCartDeactive), "Add to Cart Button is active.", "ERROR: Add to Cart Button is not active.");
        return this;
    }

    public ProductDetailPage controlConfigurableCharacteristicField(String serialNumber, String sipPassword, String phoneNumber) {
        control(isElementExist(txtSerialNumber), serialNumber + "field is exist.", "ERROR:" + serialNumber + "field is not exist.");
        control(isElementExist(txtSipPassword), sipPassword + "field is exist.", "ERROR:" + sipPassword + "field is not exist.");
        control(isElementExist(txtPhoneNumber), phoneNumber + "field is exist.", "ERROR:" + phoneNumber + "field is not exist.");
        return this;
    }

    public ProductDetailPage clickProductTerm(String productTermType) throws InterruptedException {
        Thread.sleep(6000);
        clickJS(By.xpath("//app-offering-price//mat-basic-chip"));
        log.info(productTermType + "Product Term clicked.");
        return this;
    }

    public ProductDetailPage controlPaymentPlanTitle(String expectedPaymentPlan) throws InterruptedException {
        log.info("Expected Payment Plan:" + expectedPaymentPlan);
        //List<WebElement> elementList = findElements(titlePaymentPlanType);
        //String incomingPaymentPlan = elementList.get(elementList.size() - 1).getText();
        //log.info("Incoming Payment Plan:" + incomingPaymentPlan);
        //control(incomingPaymentPlan.contains(expectedPaymentPlan), expectedPaymentPlan + "title is exist.", "ERROR:" + expectedPaymentPlan + "title is not exist.");
        control(isElementExist(By.xpath("//*[contains(text(),'" + expectedPaymentPlan + "')]")), "Payment Plan is successfully", "ERROR:Payment Plan is not successfully");
        return this;
    }

    public ProductDetailPage controlSelectedProduct(String productName) throws InterruptedException {
        Thread.sleep(5000);
        log.info("Expected Product Name:" + productName);
        //control(isElementExist(By.xpath("//h3[contains(text(),'" + productName + "')]")), productName + " title is exist.", "ERROR:" + productName + "title is not exist.");
        control(isElementExist(By.xpath("/html[1]/body[1]/app[1]/app-sales-layout[1]/div[2]/div[1]/app-offering[1]/div[1]/div[1]/div[1]/mat-card[1]/div[1]/h3[1]")), productName + " title is exist.", "ERROR:" + productName + "title is not exist.");
        return this;
    }

    public ProductDetailPage enterPhoneNumberTwo(String phoneNumberTwo) throws InterruptedException {
        log.info("Enter Phone Number Two:" + phoneNumberTwo);
        sendKeys(txtPhoneNumberTwo, phoneNumberTwo);
        return this;
    }

    public ProductDetailPage controlVodafoneTVPredefinedField(String arg0, String arg1, String arg2, String arg3, String arg4) {
        log.info("Vodafone TV Predefined Field is checking.");
        control(isElementExist(titlePredefinedList), "Predefined List is exist.", "ERROR: Predefined List is not exist.");
        List<WebElement> elementList = findElements(titlePredefinedList);
        control(elementList.get(0).getText().contains(arg0), arg0 + "list value is exist.", "ERROR:" + arg0 + "list value is not exist.");
        control(elementList.get(1).getText().contains(arg1), arg1 + "list value is exist.", "ERROR:" + arg1 + "list value is not exist.");
        control(elementList.get(2).getText().contains(arg2), arg2 + "list value is exist.", "ERROR:" + arg2 + "list value is not exist.");
        control(elementList.get(3).getText().contains(arg3), arg3 + "list value is exist.", "ERROR:" + arg3 + "list value is not exist.");
        control(elementList.get(4).getText().contains(arg4), arg4 + "list value is exist.", "ERROR:" + arg4 + "list value is not exist.");
        return this;
    }

    public ProductDetailPage enterSipUser(String sipUser) throws InterruptedException {
        clearText(txtSipUser);
        log.info("Enter SipUser" + sipUser);
        sendKeys(txtSipUser, sipUser);
        return this;
    }

    public ProductDetailPage controlProductPrice() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Product Price is checking.");
        int expectedProductPrice = 0;

        List<WebElement> elementList = findElements(titleProductPrice);
        for (WebElement element : elementList) {
            //expectedProductPrice += Double.parseDouble(element.getText().split("\\p{Sc}")[1]);
            expectedProductPrice += Double.parseDouble(element.getText().split("ALL")[1].replace(",", ""));
        }

        getWebDriver().navigate().refresh();

        String incomingProductPrice = getTextOfElement(titleTotalProductPrice).split("ALL")[1].replace(",", "").trim();
        log.info("Expected Product Price:" + expectedProductPrice);
        log.info("Incoming Product Price:" + incomingProductPrice);
        control(incomingProductPrice.contains(String.valueOf(expectedProductPrice)), "Total Product Price value is successfully.", "Total Product Price value is not successfully.");
        //log.info("Expected Product Price Symbol:" + elementList.get(0).getText());
        //log.info("Incoming Product Price Symbol:" + String.valueOf(incomingProductPrice.charAt(0)));
        //control(elementList.get(0).getText().contains(String.valueOf(incomingProductPrice.charAt(0))), "Product Price Symbol is successfully.", "Product Price Symbol is not successfully.");
        return this;
    }

    public ProductDetailPage selectColour(String colour) throws InterruptedException {
        selectMatComboboxJS(cmbColour, colour);
        log.info("Select Colour:" + colour);
        return this;
    }

    public ProductDetailPage selectStorage(String storage) throws InterruptedException {
        selectMatComboboxJS(cmbStorage, storage);
        log.info("Select Storage:" + storage);
        return this;
    }

    public ProductDetailPage selectInternetInfrastructureType(String internetInfrastructure) throws InterruptedException {
        Thread.sleep(1000);
        selectMatComboboxJS(cmbInternetInfrastructure, internetInfrastructure);
        log.info("Select InternetInfrastructure:" + internetInfrastructure);
        return this;
    }

    public ProductDetailPage enterMacAddress(String macAddress) throws InterruptedException, IOException {
        Thread.sleep(3000);
        findElement(txtMacAddress).clear();
        macAddress = OrderCaptureData.getMacAddress(macAddress);
        sendKeys(txtMacAddress,macAddress);
        log.info("Enter MacAddress" + macAddress);
        return this;
    }

    public ProductDetailPage enterStaticIP(String staticIP) throws InterruptedException {
        clearText(txtStaticIP);
        sendKeys(txtStaticIP, staticIP);
        log.info("Enter Static IP" + staticIP);
        return this;
    }

    public ProductDetailPage controlAddOnProduct(String addOnProduct) {
        log.info(addOnProduct + "Add-on Product is checking.");
        control(isElementExist(By.xpath("//h4[contains(text(),'" + addOnProduct + "')]")), addOnProduct + "Add-on Product is exist.", "ERROR:" + addOnProduct + "Add-on Product is not exist.");
        return this;
    }

    public ProductDetailPage clickAddOnProduct(String addOnProduct) throws InterruptedException {
        Thread.sleep(2000);
        clickJS(By.xpath("//p[contains(text(),'" + addOnProduct + "')]//parent::div//following-sibling::button"));
        log.info(addOnProduct + "Add-on Product clicked.");
        return this;
    }

    public ProductDetailPage selectAddOnTVInfrastructureType(String tvInfrastructureType) throws InterruptedException, AWTException {
        Thread.sleep(2000);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) getWebDriver();
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();", findElements(cmbAddOnTVInfrastructure).get(1));

        selectMatComboboxJS(findElements(cmbAddOnTVInfrastructure).get(1), tvInfrastructureType);
        log.info("Select Add-on TVInfrastructure Type:" + tvInfrastructureType);

//        Thread.sleep(2000);
//        Robot robot = new Robot();
//        robot.keyPress(KeyEvent.VK_TAB);
//        robot.keyRelease(KeyEvent.VK_TAB);
//
//        robot.keyPress(KeyEvent.VK_TAB);
//        robot.keyRelease(KeyEvent.VK_TAB);
//
//        robot.keyPress(KeyEvent.VK_ENTER);
//        robot.keyRelease(KeyEvent.VK_ENTER);

        return this;
    }


    public ProductDetailPage clickAddOnProductEditButton() throws InterruptedException {
        //findElements(btnAddOnProductEdit).get(1).click();
        Thread.sleep(1000);
        clickJS(btnAddOnProductEdit);
        log.info("Add-on Product Edit Button clicked.");
        return this;
    }

    public ProductDetailPage clickEditButton() throws InterruptedException {
        Thread.sleep(2000);
        clickJS(btnProductDetailEdit);
        log.info("Product Edit Button clicked.");
        return this;
    }

    public ProductDetailPage selectBundleInternetInfrastructureType(String internetInfrastructure) throws InterruptedException {

        selectMatComboboxJS(cmbBundleInternetInfrastructure, internetInfrastructure);
        log.info("Select Bundle InternetInfrastructure:" + internetInfrastructure);
        return this;
    }

    public ProductDetailPage enterBundleMacAddress(String macAddress) throws InterruptedException, IOException {
        Thread.sleep(2000);
        macAddress = OrderCaptureData.getMacAddress(macAddress);
        findElements(txtMacAddress).get(1).sendKeys(macAddress);
        log.info("Enter Bundle MacAddress" + macAddress);
        return this;
    }

    public ProductDetailPage enterBundleStaticIP(String staticIP) throws InterruptedException {
        clearText(txtBundleStaticIP);
        sendKeys(txtBundleStaticIP, staticIP);
        log.info("Enter Bundle Static IP" + staticIP);
        return this;
    }

    public ProductDetailPage controlUpdatedValue(String updatedValue) {
        log.info(updatedValue + "Updated Value is checking.");
        control(isElementExist(By.xpath("//span[contains(text(),'" + updatedValue + "')]")), updatedValue + "updated value is exist.", "ERROR:" + updatedValue + "updated value is not exist.");
        return this;
    }

    public ProductDetailPage selectPhoneNumber(String phoneNumber) throws InterruptedException {
        //clickJS(cmbPhoneNumber);
        Thread.sleep(500);
        selectMatComboboxJS(cmbPhoneNumber, phoneNumber);
        log.info("Select Phone Number:" + phoneNumber);
        return this;
    }

    public ProductDetailPage selectCharacteristicField(String fieldName) throws InterruptedException {
        Thread.sleep(2000);
        clickJS(By.xpath("//app-product-addons//div[contains(text(),'" + fieldName + "')]"));
        log.info(fieldName + "Add-on Characteristic Field clicked.");
        return this;
    }

    public ProductDetailPage selectBundleCharacteristicField(String fieldName) throws InterruptedException {
        Thread.sleep(2000);
        List<WebElement> elementList = findElements(By.xpath("//app-product-bundles//div[contains(text(),'" + fieldName + "')]"));
        elementList.get(0).click();
        elementList.get(1).click();
        log.info(fieldName + "Bundle Characteristic Field clicked.");
        return this;
    }

    public ProductDetailPage switchNewWindowTab() throws InterruptedException {
        log.info("Switch New Window Tab");
        switchWindowTab();
        return this;
    }

    public ProductDetailPage clickButton(String buttonName) throws InterruptedException {
        Thread.sleep(1000);
        clickJS(By.xpath("//*[contains(text(),'" + buttonName + "')]"));
        log.info(buttonName + "Button clicked.");
        return this;
    }

    public ProductDetailPage controlPopupTitle(String popupName) throws InterruptedException {
        Thread.sleep(1000);
        log.info(popupName + "Popup title is checking.");
        control(isElementExist(By.xpath("//*[contains(text(),'" + popupName + "')]")), "Popup is exist.", "ERROR:" + popupName + "Popup is not exist.");
        return this;
    }

    public ProductDetailPage controlAuhorizeEditDialogField(String fieldName) {
        log.info(fieldName + " Authorize Edit Dialog Field is checking.");
        By locator = null;
        switch (fieldName) {
            case "Price":
                locator = txtPrice;
                break;
            case "Amount":
                locator = txtAmount;
                break;
            case "Description":
                locator = txtDescription;
                break;
            case "Address Line1":
                locator = txtAddressLineOne;
                break;
            case "Address Line2":
                locator = txtAddressLineOne;
                break;
            case "Country":
                locator = cmbCountry;
                break;
            case "City":
                locator = cmbCity;
                break;
            default:
                //code block
        }
        control(isElementExist(locator), fieldName + "Field is exist.", "ERROR:" + fieldName + "Field is not exist.");
        return this;
    }

    public ProductDetailPage enterPrice(String price) throws InterruptedException {
        Thread.sleep(1000);
        By lPrice = By.xpath("//app-authorize-edit-dialog//input[@type='number']");
        findElements(lPrice).get(0).clear();
        findElements(lPrice).get(0).sendKeys(price);
        log.info("Enter Price:" + price);
        return this;
    }

    public ProductDetailPage enterAmount(String amount) throws InterruptedException {
        Thread.sleep(500);
        By lAmount = By.xpath("//app-authorize-edit-dialog//input[@type='number']");
        findElements(lAmount).get(1).clear();
        findElements(lAmount).get(1).sendKeys(amount);
        log.info("Enter Amount:" + amount);
        return this;
    }

    public ProductDetailPage enterDescription(String description) throws InterruptedException {
        Thread.sleep(500);
        By lDescription = By.xpath("//app-authorize-edit-dialog//input[@type='text']");
        findElements(lDescription).get(0).clear();
        findElements(lDescription).get(0).sendKeys(description);
        log.info("Enter Description:" + description);
        return this;
    }

    public ProductDetailPage enterAddressLineOne(String addressLineOne) throws InterruptedException {
        Thread.sleep(500);
        By lAddressLineOne = By.xpath("//app-address-dialog//textarea[@type='text']");
        findElements(lAddressLineOne).get(0).clear();
        findElements(lAddressLineOne).get(0).sendKeys(addressLineOne + RandomStringUtils.randomNumeric(5));
        log.info("Enter Address Line 1" + addressLineOne);
        return this;
    }

    public ProductDetailPage enterAddressLineTwo(String addressLineTwo) throws InterruptedException {
        Thread.sleep(500);
        By lAddressLineTwo = By.xpath("//app-address-dialog//textarea[@type='text']");
        findElements(lAddressLineTwo).get(1).clear();
        findElements(lAddressLineTwo).get(1).sendKeys(addressLineTwo + RandomStringUtils.randomNumeric(5));
        log.info("Enter Address Line 2" + addressLineTwo);
        return this;
    }

    public ProductDetailPage selectCity(String city) throws InterruptedException {
        Thread.sleep(500);
        By lCity = By.xpath("//app-address-dialog//mat-select[@role='combobox']");
        selectMatComboboxJS(lCity, city);
        log.info("Select City" + city);
        return this;
    }

    public ProductDetailPage controlPriceField() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Price Field is checking.");
        control(isElementExist(By.xpath("//input[@type='number' and @readonly='true']//following-sibling::span//label//mat-label[contains(text(),'Price')]")), "Price Field is readonly", "Price Field is not readonly.");
        return this;
    }

    public ProductDetailPage enterPPPoEUser(String pppoeUser) throws InterruptedException {
        Thread.sleep(1000);
        sendKeys(txtPPPoEUser, pppoeUser);
        log.info("Enter PPPoEUser " + pppoeUser);
        return this;
    }

    public ProductDetailPage selectPurchasableResources(String purchasableResources) throws InterruptedException {
        Thread.sleep(3000);
        clickJS(btnPurchasableResources);
        log.info(purchasableResources + " clicked.");
        return this;
    }

    public ProductDetailPage selectPurchasableAddons(String purchasableAddons) throws InterruptedException {
        Thread.sleep(3000);
        clickJS(btnPurchasableAddons);
        log.info(purchasableAddons + " clicked.");
        return this;
    }

    public ProductDetailPage clickNewAddressButtonForAuthorizeEdit() throws InterruptedException {
        Thread.sleep(3000);
        clickJS(By.xpath("//app-authorize-edit//mat-icon[contains(text(),'add')]"));
        log.info("New Address Button For Authorize Edit clicked.");
        return this;
    }

    public ProductDetailPage clickAddOnProductForPurchasableResources(String productName) throws InterruptedException {
        Thread.sleep(2000);
        clickJS(By.xpath("//*[contains(text(),'Pajisje te reja')]//parent::div//p[contains(text(),'" + productName + "')]//parent::div//following-sibling::button"));
        log.info(productName + "Purchasable Resources Product clicked.");
        return this;
    }
}