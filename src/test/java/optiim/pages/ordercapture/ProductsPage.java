package optiim.pages.ordercapture;

import optiim.framework.core.PageBase;
import optiim.framework.helpers.WebDriverHelper;
import optiim.framework.helpers.WorldHelper;
import optiim.framework.utils.log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static optiim.pages.ordercapture.ProductDetailPage.btnShoppingCart;


public class ProductsPage extends PageBase {

    public static final By titleNewOrderPage = By.xpath("//span[contains(text(),'Products')]");
    public static final By lstProductFilter = By.cssSelector("mat-tree[role='tree']");
    public static final By txtSearchProduct = By.cssSelector("input[name='name']");
    public static final By btnSearchProduct = By.xpath("//mat-card//*[contains(text(),'search')]");
    public static final By btnClose = By.xpath("//mat-icon[contains(text(),'close')]");
    public static final By btnProduct = By.xpath("//app-product");
    public static final By btnAppleWatchSE = By.xpath("//div[contains(text(),'APPLEWATCHSE')]");
    public static final By btnIPhoneSeven = By.xpath("//div[contains(text(),'IPHONE7')]");
    public static final By btnFAMILYTV = By.xpath("//div[contains(text(),'CABLETVPS')]");
    public static final By btnEditServiceAddress = By.xpath("//mat-icon[contains(text(),'add')]");
    public static final By titleSearchProductName = By.xpath("//mat-cell[1]");
    public static final By btnParentCategoryOneChevronRight = By.xpath("//mat-tree-node[1]/button");
    public static final By btnParentCategoryTwoChevronRight = By.xpath("//mat-tree-node[5]/button");
    public static final By btnExpandMore = By.xpath("//mat-icon[contains(text(),'expand_more')]");
    public static final By txtSerialNumber = By.id("SerialNumber");
    public static final By alertPopupMessage = By.cssSelector("[role='alert'] [class='mat-simple-snackbar ng-star-inserted']");
    public static final By titleEditServiceAddressPage = By.xpath("//span[contains(text(),'Service Address')]");
    public static final By txtAddressLineOne = By.cssSelector("[formcontrolname='street1']");
    public static final By txtAddressLineTwo = By.cssSelector("[formcontrolname='street2']");
    public static final By cmbCountry = By.cssSelector("[formcontrolname='country']");
    public static final By cmbCity = By.cssSelector("[formcontrolname='city']");
    public static final By btnServiceAddressUpdate = By.xpath("//*[contains(text(),'Create')]");
    public static final By btnServiceAddressClose = By.xpath("//mat-icon[contains(text(),'close')]");
    public static final By titleProductPrice = By.xpath("//tr//td[2]");
    public static final By btnCustomer360Page = By.xpath("//*[contains(text(),'Customer360')]");


    private final WorldHelper worldHelper;

    public ProductsPage(WebDriverHelper webDriverHelper, WorldHelper worldHelper) {
        super(webDriverHelper);
        this.worldHelper = worldHelper;
    }


    public ProductsPage controlNewOrderPage() throws InterruptedException {
        //switchWindowTab();
        //control(isElementExist(titleNewOrderPage), "New Order Page opened.", "ERROR: New Order Page did not open.");
        //control(isElementExist(btnEditServiceAddress), "Service Address field is exist.", "Service Address field is not exist.");
        return this;
    }

    public ProductsPage clickFirstProduct() throws InterruptedException {
        List<WebElement> elementList = findElements(btnProduct);
        clickJS(elementList.get(0));
        log.info("Product clicked.");
        return this;
    }

    public ProductsPage clickIphoneSeven() throws InterruptedException {
        clickJS(btnIPhoneSeven);
        log.info("IPhone7 Button clicked.");
        return this;
    }

    public ProductsPage controlProductList() throws InterruptedException {
        //Thread.sleep(1000);
        //control(isElementExist(btnProduct), "Product List opened.", "ERROR: Product List did not open.");
        return this;
    }

    public ProductsPage clickFamilyTV() throws InterruptedException {
        clickJS(btnFAMILYTV);
        log.info("FAMILY TV Product clicked.");
        return this;
    }

    public ProductsPage controlCatalogSearchFilter() throws InterruptedException {
        Thread.sleep(500);
        control(isElementExist(lstProductFilter), "Catalog Filter field is exist.", "ERROR: Catalog Filter field is not exist.");
        return this;
    }

    public ProductsPage clickEditServiceAddressButton() throws InterruptedException {
        Thread.sleep(2000);
        clickJS(btnEditServiceAddress);
        log.info("Service Address Button clicked.");
        return this;
    }

    public ProductsPage enterSearchProduct(String productName) throws InterruptedException {
        findElement(txtSearchProduct).clear();
        Thread.sleep(500);
        log.info("Enter Product Name:" + productName);
        sendKeys(txtSearchProduct, productName);
        Thread.sleep(2500);
        clickJS(btnSearchProduct);
        Thread.sleep(2000);
        return this;
    }

    public ProductsPage controlSearchProductName(String productName) throws InterruptedException {
        Thread.sleep(2000);
        List<WebElement> elementList = findElements(titleSearchProductName);
        log.info(elementList.size() + " product found.");
        int productOrder = 0;
        String incomingProductName;
        for (WebElement element : elementList) {
            productOrder++;
            incomingProductName = element.getText().toUpperCase().replace("İ","I");
            log.info(productOrder + ". Incoming Product Name:" + incomingProductName);
            log.info("Expected Product Name:" + productName);
            control(incomingProductName.contains(productName.toUpperCase().replace("İ","I")), productName + " product found.", "ERROR:" + productName + " product did not found.");
        }
        return this;
    }

    public ProductsPage selectCategory(String categoryName) throws InterruptedException {
        clickJS(By.xpath("//span[contains(text(),'" + categoryName + "')]"));
        log.info(categoryName + "Category Checkbox clicked.");
        return this;
    }

    public ProductsPage clickChevronRight() throws InterruptedException {
        clickJS(btnParentCategoryOneChevronRight);
        waitForExpectedElement(btnParentCategoryTwoChevronRight);
        clickJS(btnParentCategoryTwoChevronRight);
        //click(btnCategoryOneChevronRight);
        //click(btnCategoryTwoChevronRight);
        return this;
    }

    public ProductsPage clickProduct(String productName) throws InterruptedException {
        Thread.sleep(3500);
        enterSearchProduct(productName);
        //getWebDriver().navigate().refresh();
        log.info(getWebDriver().getCurrentUrl());
        /*if(productName.equals("VOIP")){
            clickJS(findElements(By.xpath("//div[contains(text(),'" + productName + "')]")).get(1));
        }
        else {

        }*/
        Thread.sleep(2500);
        //clickJS(By.xpath("//mat-cell[contains(text(),'" + productName + "')]"));
        clickJS(By.cssSelector("[class*='mat-cell cdk-cell cdk-column-name mat-column-name ng-star-inserted']"));
        log.info(productName + "product clicked.");
        return this;
    }


    public ProductsPage clickCloseButton() throws InterruptedException {
        clickJS(btnClose);
        log.info("Close Button clicked.");
        return this;
    }

    public ProductsPage controlPopupMessage(String popupMessage) throws InterruptedException {
        Thread.sleep(2000);
        log.info("Expected message:" + popupMessage);
        control(isElementExist(By.xpath("//*[contains(text(),'" + popupMessage + "')]")), "Popup control is successfully", "ERROR:Popup control is not successfully");
        Thread.sleep(2000);
        return this;
    }

    public ProductsPage controlEditServiceAddressPage() {
        log.info("Edit Service Address Page Title is checking.");
        control(isElementExist(titleEditServiceAddressPage), "Edit Service Address Page title is exist.", "ERROR: Edit Service Address Page title is not exist.");
        return this;
    }

    public ProductsPage controlEditServiceAddressPageField(String addressLineOne, String addressLineTwo, String country, String city) {
        log.info("Edit Service Address Page Field is checking.");
        control(isElementExist(txtAddressLineOne), addressLineOne + "field is exist.", "ERROR:" + addressLineOne + "field is not exist.");
        control(isElementExist(txtAddressLineTwo), addressLineTwo + "field is exist.", "ERROR:" + addressLineTwo + "field is not exist.");
        control(isElementExist(cmbCountry), country + "field is exist.", "ERROR:" + country + "field is not exist.");
        control(isElementExist(cmbCity), city + "field is exist.", "ERROR:" + city + "field is not exist.");
        return this;
    }

    public ProductsPage controlCategoryTrueSelected(String categoryName) {
        log.info(categoryName + "Category True Selected is checking.");
        control(isElementExist(By.xpath("//span[contains(text(),'" + categoryName + "')]//parent::label//parent::mat-checkbox[contains(@class,'mat-checkbox-checked')]")), categoryName + "category selected.", "ERROR:" + categoryName + "category did not select.");
        return this;
    }

    public ProductsPage controlCategoryMixSelected(String categoryName) {
        log.info(categoryName + "Category Mix Selected is checking.");
        control(isElementExist(By.xpath("//span[contains(text(),'" + categoryName + "')]/preceding-sibling::div/input[@aria-checked='mixed']")), categoryName + "category mixed.", "ERROR:" + categoryName + "category did not mix.");
        return this;
    }

    public ProductsPage controlCategoryNotSelected(String categoryName) {
        log.info(categoryName + "Unselected Category is checking.");
        control(!(isElementExist(By.xpath("//span[contains(text(),'" + categoryName + "')]//parent::label//parent::mat-checkbox[contains(@class,'mat-checkbox-checked')]"))), categoryName + "category did not select.", "ERROR:" + categoryName + "category selected.");
        return this;
    }

    public ProductsPage controlRelationshipType(String relationshipType) {
        log.info(relationshipType + "Relationship Type is checking");
        return this;
    }

    public ProductsPage clickShoppingCartButton() throws InterruptedException {
        Thread.sleep(1500);
        scrollMainWindow(0, 250);
        //elementToBeClickable(btnShoppingCart);
        Actions actions = new Actions(getWebDriver());
        actions.moveToElement(findElement(btnShoppingCart)).click().build().perform();
        log.info("Shopping Cart Button clicked.");
        return this;
    }

    public ProductsPage controlBillingAccount() {
        log.info("Billing Account is checking");
        control(worldHelper.getAccountManagementResponseList().get(0).getName().contains(worldHelper.getCustomerName()), "Billing Account created.", "ERROR: Billing Account did not create.");
        return this;
    }

    public ProductsPage clickUpdateButton() throws InterruptedException {
        Thread.sleep(1000);
        clickJS(btnServiceAddressUpdate);
        log.info("Update Service Button clicked.");
        Thread.sleep(500);
        return this;
    }

    public ProductsPage controlProductPrice() {
        log.info("Product Price is checking.");
        control(isElementExist(titleProductPrice), "Product Price Field is exist.", "Product Price Field is not exist.");
        return this;
    }

    public ProductsPage clickCategory(String categoryName) throws InterruptedException {
        clickJS(By.xpath("//mat-panel-title[contains(text(),'" + categoryName + "')]"));
        log.info(categoryName + "Category clicked.");
        return this;
    }

    public ProductsPage clickCustomer360Button() throws InterruptedException {
        Thread.sleep(7000);
        clickJS(btnCustomer360Page);
        log.info("Customer360 Page Button clicked.");
        Thread.sleep(1000);
        switchWindowTab();
        return this;
    }

    public ProductsPage selecProduct(String productName) throws InterruptedException {
        Thread.sleep(2000);
        clickJS(By.xpath("//*[contains(text(),'" + productName + "')]"));
        //clickJS(findElements(By.xpath("//*[contains(text(),'" + productName + "')]")).get(1));
        log.info(productName + " Product clicked.");
        return this;
    }

    public ProductsPage clickProductSearchButton() throws InterruptedException {
        Thread.sleep(1500);
        clickJS(btnSearchProduct);
        log.info("Search Product Button clicked.");
        return this;
    }

    public ProductsPage clickLogoutButton() throws InterruptedException {
        Thread.sleep(1000);
        clickJS(By.xpath("//mat-icon[contains(text(),'person')]//parent::span//parent::button"));
        log.info("User button clicked.");
        Thread.sleep(2000);
        clickJS(By.xpath("//*[contains(text(),'LOGOUT')]"));
        return this;
    }
}
