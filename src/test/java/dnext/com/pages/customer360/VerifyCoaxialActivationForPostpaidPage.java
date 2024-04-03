package dnext.com.pages.customer360;

import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import com.utilities.Utils;
import dnext.com.pages.BasePage;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;
import static dnext.com.pages.customer360.VtvActivationPage.addToCartBtn;
@Log4j2
public class VerifyCoaxialActivationForPostpaidPage extends BasePage {

    @FindBy(xpath = "(//span[@class='mat-radio-container'])[2]")
    public WebElement  recurringProductsOption;
    @FindBy(xpath = "/html[1]/body[1]/app[1]/app-sales-layout[1]/div[2]/div[1]/app-catalog[1]/div[1]/app-catalog-filters[1]/mat-card[1]/app-catalog-filters-category[1]/div[2]/mat-tree[1]/mat-nested-tree-node[1]/div[1]/mat-checkbox[1]/label[1]/span[2]")
    public WebElement  internetOptionForCoaxial;
    @FindBy(xpath = "//mat-basic-chip[normalize-space()='12 X ALL2000']")
    public WebElement   option12XALL2000ContractDurationForForCoaxial;
    @FindBy(xpath = "//span[@class='mat-option-text'][.=' COAXIAL ']")
    public WebElement   coaxialOptionForForCoaxial;
    @FindBy(xpath = "//mat-basic-chip[normalize-space()='12 X ALL0']")
    public WebElement   option12XALL0ContractDurationForBasicMEnterpriseModem;
    @FindBy(xpath = "//input[@id='MACAddress']")
    public WebElement   inputFieldForMACAddress;
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
    @FindBy(xpath = "//*[.='getFlowVariables successful!']")
    static public WebElement successfullMessageOnComunda;

    public  void verifyTheOrderStatusIsCompleted() {
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
            log.error("Error message is " + errorMessageOnVariablesOnCamunda.getText());
            switchToWindowNew(0);
        }
    }



    public void numbersCreationForMacAdreess() {
        String[] numbers = {

               "DC537C055152","DC537C055271","DC537C14DF54","DC537C14E26B"};


            for (String number : numbers) {
                inputFieldForMACAddress.clear();
                inputFieldForMACAddress.sendKeys(number);
                Utils.waitFor(4);
                addToCartBtn.click();
                Utils.waitFor(6);
                System.out.println("number = " + number);

            }
        }






}
