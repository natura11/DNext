package dnext.com.pages.customer360;

import com.utilities.Driver;
import com.utilities.Utils;
import dnext.com.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static dnext.com.pages.customer360.FiberActivationForPrepaidPage.oNTSerialNumberInputField;
import static dnext.com.pages.customer360.FiberActivationForPrepaidPage.pPPoEUserInputField;
import static dnext.com.pages.customer360.VtvActivationPage.addToCartBtn;

public class VerifyCoaxialActivationForPrepaidPage extends BasePage {
    @FindBy(xpath = "//div[@class='mat-chip-list-wrapper']/mat-basic-chip")
    public WebElement firstOptionfromTheSelectedProductForCash;
    @FindBy(xpath = "(//*[@class='mat-row cdk-row ng-star-inserted'])[1]")
    public WebElement firstOptionFromProducts;
    @FindBy(xpath = "//mat-basic-chip[normalize-space()='ALL0 6Month']")
    public WebElement firstOptionFromBasicEnterpriseModemForCash;
    @FindBy(xpath = "//*[@id=\"mat-checkbox-31\"]/label/span[1]")
    public WebElement internetCheckBoxButtonForCoaxPrepaid;
    @FindBy(xpath = "//h3[contains(text(),'GigaFibra Pro 50-20 Mbps')]")
    public WebElement GigaFibraPro50_20MbpsText;

}
