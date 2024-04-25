package dnext.com.pages;

import com.utilities.Driver;
import com.utilities.Utils;
import io.cucumber.java.en.Then;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;
import java.util.Random;

@Log4j2
public class DSalesCommonPage extends BasePage {

    @FindBy(xpath = "//*[.='Products']")
    static public WebElement productsText;
    @FindBy(xpath = "//app-catalog-filters//mat-icon[contains(text(),'search')]")
    public WebElement searchBtnForCategoryOption;
    @FindBy(xpath = "//mat-row/mat-cell[contains(@class,'name')]")
    public List<WebElement> listedProducts;
    @FindBy(xpath = "//span[text()='Products']/following-sibling::span")
    public WebElement productNameOnProductDetail;
    @FindBy(xpath = "//mat-chip-list//mat-basic-chip")
    public List<WebElement> listedPrices;
    @FindBy(xpath = "//mat-select[@id='TVInfrastructure']")
    public WebElement tvInfrastructureDropdown;
    @FindBy(xpath = "//mat-select[@id='Infrastructure']")
    public WebElement internetInfrastructureDropdown;
    @FindBy(xpath = "//app-offering-resource//mat-accordion/mat-expansion-panel")
    public WebElement resourceSection;
    @FindBy(xpath = "//app-offering-addon//mat-accordion/mat-expansion-panel")
    public WebElement addonSection;
    @FindBy(xpath = "//span[normalize-space()='Add to Cart']")
    public WebElement addToCartBtn;
    @FindBy(xpath = "//mat-icon[text()='shopping_cart']")
    public WebElement shoppingCartIcon;
    @FindBy(xpath = "//simple-snack-bar/span[text()='Shopping cart created successfully!']")
    public WebElement successMessageForShoppingCart;
    @FindBy(xpath = "//mat-card//h3")
    public List<WebElement> productCardsOnShoppingCart;
    @FindBy(xpath = "//span[@id='mat-badge-content-0']")
    public WebElement shoppingCartIconNumber;
    @FindBy(xpath = "//span[normalize-space()='CHECKOUT']")
    public WebElement checkoutButton;
    @FindBy(xpath = "//span[contains(text(),'Collected')]/preceding-sibling::span")
    public WebElement collectedTickBeforeCompleteCheckout;
    @FindBy(xpath = "//button/span[contains(text(),'SAVE')]")
    public WebElement saveButtonAfterCheckout;
    @FindBy(xpath = "//*[.='Activation Form']")
    public WebElement activationFormButtonAfterCheckout;
    @FindBy(xpath = "//h2[contains(text(),'Before Checkout')]")
    public WebElement beforeCheckoutHeader;
    @FindBy(xpath = "//span[normalize-space()='COMPLETE CHECKOUT']/parent::button")
    public WebElement completeCheckoutButton;
    @FindBy(xpath = "//h3[text()='Checkout is successfully completed']")
    public WebElement checkoutIsSuccessfullyCompletedMessage;
    @FindBy(xpath = " //span[.=' Create the receipt ']")
    public WebElement createReceiptButton;
    @FindBy(xpath = "//span[normalize-space()='Go back to Customer360']")
    public WebElement goBackToCustomer360Btn;

    public void waitForProductPage() {
        Utils.waitForVisibility(productsText, 60);
        warningMessage("Products", productsText);
    }


    public void filterByOnceOffRecurring(String categoryType) {
        Utils.waitForVisibility(By.xpath("//mat-radio-group//mat-radio-button"), 15);
        WebElement newOrderButton = Driver.getDriver().findElement(By.xpath(
                "//span[contains(text(),'" + categoryType +
                        "')]"));
        newOrderButton.click();
    }
    public void filterByCategory(String categoryType) {
        Utils.waitForVisibility(By.xpath("//app-catalog-filters//mat-tree//span[text()]"), 15);
        Utils.waitFor(3);
        WebElement catalogOption = Driver.getDriver().findElement(By.xpath(
                "//app-catalog-filters//span[contains(text(),'" + categoryType +
                        "')]"));
        catalogOption.click();
    }

    public void selectARandomProduct() {
        Utils.waitFor(3);
        if(listedProducts.isEmpty()){
            clickField(searchBtnForCategoryOption);
        }
        Utils.waitForVisibility(By.xpath("//mat-table//mat-row"), 15);
        Random random = new Random();
        int randomIndex;
        do{
            randomIndex = random.nextInt(listedProducts.size());
        }while (listedProducts.get(randomIndex).getText().contains("Big Brother VIP"));

        Utils.scrollToElement(listedProducts.get(randomIndex));
        log.info("Random product is selected: " + listedProducts.get(randomIndex).getText());
        listedProducts.get(randomIndex).click();
    }

    public void selectSpecificProduct(String productName) {
        Utils.waitFor(3);
        if(listedProducts.isEmpty()){
            clickField(searchBtnForCategoryOption);
        }
        Utils.waitForVisibility(By.xpath("//mat-table//mat-row"), 15);
        WebElement selectedProduct = Driver.getDriver().findElement(By.xpath(
                "//mat-row/mat-cell[contains(text(),'" + productName + "')]"));
        selectedProduct.click();
    }


    public void selectARandomChipPrice() {
        Utils.waitForVisibility(By.xpath("//mat-chip-list//mat-basic-chip/div"), 15);
        Random random = new Random();
        int randomIndex = random.nextInt(listedPrices.size());
        listedPrices.get(randomIndex).click();
        log.info("Random price is selected: " + listedPrices.get(randomIndex).getText());
    }

    public void selectSpecificInfrastructure(String infraName) {
        WebElement selectedInfrastructure = Driver.getDriver().findElement(By.xpath(
                "//mat-option/span[contains(text(),'" + infraName + "')]"));
        selectedInfrastructure.click();
        log.info(infraName + " is selected");
    }

    public void selectSpecificResourceAndPrice(String resourceName) {
        Utils.waitForVisibility(resourceSection, 30);
        WebElement selectedResource = Driver.getDriver().findElement(
                By.xpath("//app-offering-resource//mat-accordion/mat-expansion-panel" +
                                        "//p[contains(text(),'" + resourceName + "')]/following::button"));
        selectedResource.click();
        log.info(resourceName + " is selected");

        List<WebElement> listedPrices = Driver.getDriver().findElements(
                By.xpath("//app-offering-resource//mat-accordion/mat-expansion-panel" +
                                        "//p[contains(text(),'" + resourceName + "')]/following::button[1]" +
                                        "//ancestor::span//mat-basic-chip"));
        Random random = new Random();
        int randomIndex = random.nextInt(listedPrices.size());
        listedPrices.get(randomIndex).click();
        log.info("Random price is selected: " + listedPrices.get(randomIndex).getText());
    }

    public void selectSpecificAddOnAndPrice(String addOnName) {
        elementDisplayed(addonSection);
        WebElement selectedAddon = Driver.getDriver().findElement(
                By.xpath("//app-offering-addon//mat-accordion/mat-expansion-panel" +
                                        "//p[contains(text(),'" + addOnName + "')]/following::button"));
        selectedAddon.click();
        log.info(addOnName + " is selected");

        Random random = new Random();
        List<WebElement> listedPrices = Driver.getDriver().findElements(
                By.xpath("//app-offering-addon//mat-accordion/mat-expansion-panel" +
                                        "//p[contains(text(),'" + addOnName + "')]/following::button[1]" +
                                        "/ancestor::span//mat-basic-chip"));
        int randomIndex = random.nextInt(listedPrices.size());
        listedPrices.get(randomIndex).click();
        log.info("Random price is selected: " + listedPrices.get(randomIndex).getText());
    }

    public void verifyShoppingCartIsCreated() {
        Assert.assertTrue(isElementDisplayed(successMessageForShoppingCart));
    }

    public void verifyShoppingCartIsCreatedWithCorrectNumber() {
        Utils.waitForVisibility(By.xpath("//mat-card//h3"), 10);
        Assert.assertEquals(Integer.parseInt(shoppingCartIconNumber.getText()) ,productCardsOnShoppingCart.size());
    }

    public void verifyProductIsAddedOnShoppingCart(String productName) {
        String xpathOfProduct = "//mat-card//h3[contains(text(),'" + productName + "')]";
        Utils.waitForVisibility(By.xpath(xpathOfProduct), 5);
        WebElement productInSC = Driver.getDriver().findElement(By.xpath(xpathOfProduct));
        Assert.assertTrue(isElementDisplayed(productInSC));
    }


    public void verifyActivationFormInNewTab() {
        Utils.waitFor(10);
        try {
            Runtime.getRuntime().exec(
                    System.getProperty("user.dir") + "\\src\\test\\resources\\autoItScripts\\cancelDownloadWindow.exe");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Utils.waitFor(1);
        Assert.assertEquals(2, Driver.getDriver().getWindowHandles().size());
        switchToWindowNew(1);
//        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("blob"));
        Driver.getDriver().close();
    }

    public void clickCollected(String customerType){
        Utils.waitFor(5);
        elementDisplayed(collectedTickBeforeCompleteCheckout);
        clickField(collectedTickBeforeCompleteCheckout);
        if(customerType.equals("Individual")){
       //     clickField(collectedTickBeforeCompleteCheckout);
        }
    }
    public void switchToDSalesPage() {
        switchToWindowNew(0);
        elementDisplayed(beforeCheckoutHeader);
    }
    public void verifyTheSuccessfulCheckoutMessage(String message) {
        Utils.waitForVisibility(checkoutIsSuccessfullyCompletedMessage,10);
        Assert.assertEquals(message, checkoutIsSuccessfullyCompletedMessage.getText());
        Utils.waitFor(45);
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