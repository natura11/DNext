package dnext.com.pages.customer360;

import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import com.utilities.Utils;
import dnext.com.pages.BasePage;
import lombok.extern.log4j.Log4j2;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static dnext.com.pages.customer360.VtvActivationPage.addToCartBtn;

@Log4j2
public class VerifyCoaxialActivationForPostpaidPage extends BasePage {

    @FindBy(xpath = "(//span[@class='mat-radio-container'])[2]")
    public WebElement recurringProductsOption;
    @FindBy(xpath = "/html[1]/body[1]/app[1]/app-sales-layout[1]/div[2]/div[1]/app-catalog[1]/div[1]/app-catalog-filters[1]/mat-card[1]/app-catalog-filters-category[1]/div[2]/mat-tree[1]/mat-nested-tree-node[1]/div[1]/mat-checkbox[1]/label[1]/span[2]")
    public WebElement internetOptionForCoaxial;
    @FindBy(xpath = "//mat-basic-chip[normalize-space()='12 X ALL2000']")
    public WebElement option12XALL2000ContractDurationForForCoaxial;
    @FindBy(xpath = "//span[@class='mat-option-text'][.=' COAXIAL ']")
    public WebElement coaxialOptionForForCoaxial;
    @FindBy(xpath = "//mat-basic-chip[normalize-space()='12 X ALL0']")
    public WebElement option12XALL0ContractDurationForBasicMEnterpriseModem;
    @FindBy(xpath = "//input[@id='MACAddress']")
    public static WebElement inputFieldForMACAddress;
    @FindBy(xpath = "//mat-row[1]//mat-cell[2]//span[1]")
    public WebElement orderStatus;
    @FindBy(css = "div[class='list-item'] div[class='center']")
    public static WebElement orderStatusButtonInOrderDetail;
    @FindBy(xpath = "//div[@class='label'][normalize-space()='Order Id']/following-sibling::div")
    public static WebElement orderIdButtonInOrderDetail;
    @FindBy(xpath = "//input[@id=\"Id\"]")
    public static WebElement orderIdFieldOnCamundaHomePage;
    @FindBy(xpath = "//div[@id=\"devextreme1\"]")
    public static WebElement productOrderCamundaOnHomePage;
    @FindBy(xpath = "//*[text()='ACTIVE']")
    public static List<WebElement> activeListOnCamundaOnPage;
    @FindBy(xpath = "//*[@id=\"mat-tab-content-0-4\"]/div/app-order-page/mat-drawer-container/mat-drawer-content/div/div/mat-table/mat-row[1]/mat-cell[1]/span")
    static public WebElement orderIdField;
    @FindBy(xpath = "//*[@id=\"CamundaProcessGrid\"]/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[1]/div")
    static public WebElement fullfillmentTypeFirstChoiceIconOnCamunda;
    @FindBy(xpath = "//span[text()='Variables']")
    static public WebElement variablesChoiceIconOnCamunda;
    @FindBy(xpath = "/html/body/main/div[2]/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div[2]/div/div/div[2]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[10]/td[3]")
    static public WebElement errorMessageOnVariablesOnCamunda;
    @FindBy(xpath = "//table/tbody/tr[13]/td[@aria-describedby='dx-col-16']")
    static public WebElement errorMessageOnVariablesOnCamunda1;
    @FindBy(xpath = "//*[.='getFlowVariables successful!']")
    static public WebElement successfullMessageOnComunda;
    @FindBy(xpath = "//simple-snack-bar/span[text()='Shopping cart created successfully!']")
    public WebElement successMessageForShoppingCart;

    public void verifyTheOrderStatusIsCompleted() {
        if (orderStatusButtonInOrderDetail.getText().equalsIgnoreCase("completed")) {
            System.out.println("OrderStatus is = " + orderStatusButtonInOrderDetail.getText());
            Assert.assertEquals("completed", orderStatusButtonInOrderDetail.getText());
        } else {
            System.out.println("OrderStatus is = " + orderStatusButtonInOrderDetail.getText());
            String OrderId = orderIdButtonInOrderDetail.getText();
            Driver.getDriver().get(ConfigurationReader.getProperty("comundaViewer.site.url"));
            Utils.waitFor(2);
            sendKeys(orderIdFieldOnCamundaHomePage, OrderId);
            Utils.waitFor(1);
            clickField(productOrderCamundaOnHomePage);
            Utils.waitFor(1);
            clickField(fullfillmentTypeFirstChoiceIconOnCamunda);
            clickField(variablesChoiceIconOnCamunda);
            Utils.waitFor(2);
            log.error("Error message at Camunda is " + errorMessageOnVariablesOnCamunda.getText());
            log.error("Error message at Camunda is " + errorMessageOnVariablesOnCamunda1.getText());
            System.out.println("Driver.getDriver().getWindowHandles().size() = " + Driver.getDriver().getWindowHandles().size());
            switchToWindowNew(0);
        }
    }


    public static void numbersCreationForMacAdreess() {
        List<String> Numbers = new ArrayList<>(Arrays
                .asList("0024D186E41F", "0024D186E426", "0024D186E42D", "0024D186E434", "0024D186E43B",
                        "0024D186E442", "0024D186E449", "0024D186E450", "0024D186E457", "0024D186E45E",
                        "0024D186E465", "0024D186E46C", "0024D186E473", "0024D186E47A", "0024D186E481",
                        "0024D186E488", "0024D186E48F", "0024D186E496", "0024D186E49D", "0024D186E4A4", "0024D186E648",
                        "0024D186E4AB", "0024D186E4B2", "0024D186E4B9", "0024D186E4C0", "0024D186E4C7", "0024D186E64F",
                        "0024D186E4CE", "0024D186E4D5", "0024D186E4DC", "0024D186E4E3", "0024D186E4EA", "0024D186E617",
                        "0024D186E4F1", "0024D186E4F8", "0024D186E4FF", "0024D186E506", "0024D186E50D", "0024D186E514",
                        "0024D186E51B", "0024D186E522", "0024D186E529", "0024D186E530", "0024D186E537", "0024D186E53E",
                        "0024D186E545", "0024D186E54C", "0024D186E553", "0024D186E55A", "0024D186E561", "0024D186E568",
                        "0024D186E56F", "0024D186E576", "0024D186E57D", "0024D186E584", "0024D186E58B", "0024D186E592",
                        "0024D186E599", "0024D186E5A0", "0024D186E5A7", "0024D186E5AE", "0024D186E5B5", "0024D186E5BC",
                        "0024D186E5C3", "0024D186E5CA", "0024D186E5D1", "0024D186E5D8", "0024D186E5DF", "0024D186E5E6",
                        "0024D186E5ED", "0024D186E5F4", "0024D186E5FB", "0024D186E602", "0024D186E609", "0024D186E610",
                        "0024D186E61E", "0024D186E625", "0024D186E62C", "0024D186E633", "0024D186E63A", "0024D186E641"
                ));
        Random random = new Random();
        int randomIndex = random.nextInt(Numbers.size());
        System.out.println("Numbers.get(randomIndex) = " + Numbers.get(randomIndex));
        sendKeys(inputFieldForMACAddress, Numbers.get(randomIndex));
        Utils.waitFor(2);
    }

    public void checkCoaxialMacNumberIsAvailableOrNot() {
        String successMessageXpath = "//simple-snack-bar/span[text()='Shopping cart created successfully!']";
        boolean isNumberAvailable = false;
        do {
            Utils.waitFor(3);
            if (Driver.getDriver().findElements(By.xpath(successMessageXpath)).isEmpty()) {
                inputFieldForMACAddress.clear();
                numbersCreationForMacAdreess();
                clickField(addToCartBtn);
                Utils.waitFor(3);
            } else {
                isNumberAvailable = true;
            }
        } while (!isNumberAvailable);
    }

    public void verifyShoppingCartIsCreated() {
        Assert.assertTrue(isElementDisplayed(successMessageForShoppingCart));
    }
}







