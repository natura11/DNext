package dnext.com.pages.activationPages;

import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import com.utilities.Utils;
import dnext.com.pages.BasePage;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static dnext.com.pages.activationPages.AbelActivationPage.successMessageForShoppingCart;
import static dnext.com.pages.activationPages.VerifyCoaxialActivationForPostpaidPage.*;

@Log4j2
public class CryptoguardActivationPage extends BasePage {

    @FindBy(xpath = "//span[@class='mat-option-text'][normalize-space()='Cryptoguard']")
    public WebElement optionCryptoguard;
    @FindBy(xpath = "(//mat-basic-chip[normalize-space()='ALL0 3Month'])[2]")
    static public WebElement all03MonnthsForAkesFeePerDokoderBasicOnCryptoguard;
    @FindBy(xpath = "(//mat-icon[@role='img'][normalize-space()='add'])[2]")
    public WebElement addIconForTarifeInstalimiOnCryptoguard;
    @FindBy(xpath = "//h3[.=\"Digitalb Premium Plus \"]")
    public WebElement selectedProductInShoppingCart;
    @FindBy(xpath = "//input[@id='SmartCardSerialNumber']")
    public static WebElement smartCardSerialNumberField;
    @FindBy(xpath = "//mat-row[1]//mat-cell[2]//span[1]")
    public WebElement orderStatus;
    @FindBy(xpath = "//span[normalize-space()='Add to Cart']")
    public WebElement addToCartBtn;
    @FindBy(xpath = "(//mat-basic-chip[normalize-space()='ALL0 3Month'])[1]")
    public WebElement all03MonthsOptionForSmartCardCashOption;
    @FindBy(xpath = "(//mat-icon[@role='img'][normalize-space()='add'])[1]")
    public WebElement smartCardAddSignofCryptoguard;
    @FindBy(xpath = "(//mat-icon[@role='img'][normalize-space()='add'])[1]")
    public WebElement aksesFeePerDekoderBasicAddSign;
    @FindBy(xpath = "/html/body/app/vertical-layout-1/div/div/div/div/content/app-customer360/div/div[2]/div[2]/app-customer360-detail/div/mat-tab-group/div/mat-tab-body[1]/div/app-main-page/div/mat-tab-group/div/mat-tab-body[1]/div/app-general-tab/div[4]/div/app-extended-trouble-ticket-widget/mat-card/div/div[2]/table/tbody/tr[1]/td[9]/button/span/mat-icon")
    public WebElement threeDotsForDcaseOnCryptoguard;


    public static void cryptoguardNumbersCreationForSerialNumbers() {
        List<String> abelNumbers = new ArrayList<>(Arrays
                .asList("00340008407198", "00340008414196", "00340008415193", "00340008424195",
                        "00340008426199", "00340008449198", "00340008452198", "00340008502190",
                        "00340008511192", "00340008520194", "00340008524192", "00340008528190",
                        "00340008535198", "00340008537192", "00340008548198", "00340008575194",
                        "00340008593198", "00340008601190", "00340008604191", "00340008619195",
                        "00340008639193", "00340008658194", "00340008671193", "00340008672190",
                        "00340008676198", "00340008686197", "00340008691191", "00340008702194",
                        "00340008711196", "00340008716191", "00340008726190", "00340008745191",
                        "00340008752199", "00340008762198", "00340008763195", "00340008769197",
                        "00340008776195", "00340008779196", "00340008785197", "00340008790191",
                        "00340008791198", "00340008795196", "00340008828191", "00340008835199",
                        "00340008837193", "00340008840193", "00340008851199", "00340008852196",
                        "00340008854190", "00340008864199", "00340008882193", "00340008900194",
                        "00340008901191", "00340008926194", "00340008932195", "00340008934199",
                        "00340008935196", "00340008946192", "00340005060198", "00340005062192",
                        "00340005063199", "00340005076199", "00340005090195", "00340005099198",
                        "00340005102195", "00340005106193", "00340005123190", "00340005142191",
                        "00340005155191", "00340005158192"));
        Random random = new Random();
        int randomIndex = random.nextInt(abelNumbers.size());
        sendKeys(smartCardSerialNumberField, abelNumbers.get(randomIndex));
    }

    public  void checkCryptoguardNumberIsAvailableOrNot() {
        String successMessageXpath = "//simple-snack-bar/span[text()='Shopping cart created successfully!']";
        boolean isNumberAvailable = false;
        do {
            Utils.waitFor(3);
            if (Driver.getDriver().findElements(By.xpath(successMessageXpath)).isEmpty()) {
                smartCardSerialNumberField.clear();
                cryptoguardNumbersCreationForSerialNumbers();
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


