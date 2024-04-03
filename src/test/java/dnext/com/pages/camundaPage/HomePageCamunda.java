package dnext.com.pages.camundaPage;

import dnext.com.pages.BasePage;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Log4j2
public  class HomePageCamunda extends BasePage {

    @FindBy(xpath = "//input[@id=\"Id\"]")
    public WebElement idFieldOnHomePage;
    @FindBy(xpath = "//div[@id=\"devextreme1\"]")
    public WebElement productOrderOnHomePage;
    @FindBy(xpath = "//*[@id=\"payments\"]/thead/tr/th[6]")
    public List<WebElement> agreementIds;
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
    @FindBy(xpath = "/html/body/main/div[2]/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div[2]/div/div/div[2]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[16]/td[3]")
    static public WebElement errorMessageOnVariablesOnCamunda;
    @FindBy(xpath = "//*[.='getFlowVariables successful!']")
    static public WebElement successfullMessageOnComunda;

}
