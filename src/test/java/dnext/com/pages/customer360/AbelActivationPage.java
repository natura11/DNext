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
@Log4j2
public class AbelActivationPage extends BasePage {


    @FindBy(xpath = "//span[@class='mat-option-text'][normalize-space()='Abel']")
    public WebElement optionAbel;

    @FindBy(xpath = "//p[.='Smart Card']")
    public WebElement smartCardOption;

    @FindBy(xpath = "(//span[@class='mat-button-wrapper'])[5]")
    public WebElement smartCardAddSign;
    @FindBy(xpath = "//mat-basic-chip[normalize-space()='12 X ALL2550']")
    public WebElement  contract12XALL2550ForDigitalbPremiumPlus;
    @FindBy(xpath = "//mat-basic-chip[normalize-space()='12 X ALL0']")
    public WebElement  contract12XALL0ForSmartCard;

    @FindBy(xpath = "//input[@id=\"SmartCardSerialNumber\"]")
    public WebElement  smartCardSerialNumberField;

    @FindBy(xpath = "(//mat-icon[@role='img'][normalize-space()='add'])[1]")
    public WebElement  aksesFeePerDekoderBasicAddSign;
    @FindBy(xpath = "//mat-chip-list[@id='mat-chip-list-20']//mat-basic-chip[@role='option'][normalize-space()='12 X ALL0']")
    public WebElement  contract12XALL0ForAksesFeePerDekoderBasic;

    @FindBy(xpath = "(//mat-icon[@role='img'][normalize-space()='add'])[2]")
    public WebElement addIconForTarifeInstalimi;

    @FindBy(xpath = "//mat-basic-chip[normalize-space()='ALL1500 12Month']")
    public WebElement  contractALL150012MonthForTarifeInstalimi;
    @FindBy(xpath = "//mat-row[1]//mat-cell[2]//span[1]")
    public WebElement orderStatus;

    //camunda
    @FindBy(xpath = "//input[@id=\"Id\"]")
    public WebElement orderIdFieldOnCamundaHomePage;

    @FindBy(xpath = "//div[@id=\"devextreme1\"]")
    public WebElement productOrderCamundaOnHomePage;

    @FindBy(xpath = "//*[text()='ACTIVE']")
    public List<WebElement> activeListOnCamundaOnPage;

    @FindBy(xpath = "//*[@id=\"mat-tab-content-0-4\"]/div/app-order-page/mat-drawer-container/mat-drawer-content/div/div/mat-table/mat-row[1]/mat-cell[1]/span")
    public WebElement orderIdField;
    @FindBy(xpath = "//*[@id=\"CamundaProcessGrid\"]/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[1]/div")
    public WebElement fullfillmentTypeFirstChoiceIconOnCamunda;

    @FindBy(xpath = "//span[text()='Variables']")
    public WebElement variablesChoiceIconOnCamunda;

    @FindBy(xpath = "/html/body/main/div[2]/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div[2]/div/div/div[2]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[16]/td[3]")
    public WebElement errorMessageOnVariablesOnCamunda;

    @FindBy(xpath = "//*[.='getFlowVariables successful!']")
    public  WebElement successfullMessageOnComunda;


    public AbelActivationPage verifyTheOrderStatusIsCompleted() {
        if (orderStatus.getText().equalsIgnoreCase(" completed ")){
            System.out.println("orderStatus.getText() = " + orderStatus.getText());
            Assert.assertEquals(" completed ", orderStatus.getText());
        }else {
            String OrderId   = orderIdField.getText();
            Driver.getDriver().get(ConfigurationReader.getProperty("comundaViewer.site.url"));
            //switchToWindowNew(1);
            sendKeys(orderIdFieldOnCamundaHomePage,OrderId);
            clickField(productOrderCamundaOnHomePage);
            Utils.waitFor(1);
            clickField(fullfillmentTypeFirstChoiceIconOnCamunda);
            clickField(variablesChoiceIconOnCamunda);
            Utils.waitFor(2);
            //Utils.waitForVisibility(errorMessageOnVariablesOnCamunda,25);
            System.out.println("errorMessageOnVariablesOnCamunda.getText() = " + errorMessageOnVariablesOnCamunda.getText());
            log.info("Error message is " +errorMessageOnVariablesOnCamunda.getText());
            switchToWindowNew(0);

        }
        return this;
    }
}
