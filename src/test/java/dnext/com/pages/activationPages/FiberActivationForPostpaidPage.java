package dnext.com.pages.activationPages;

import com.utilities.Driver;
import com.utilities.Utils;
import dnext.com.pages.BasePage;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static dnext.com.pages.activationPages.AbelActivationPage.successMessageForShoppingCart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static dnext.com.pages.backofficePage.BackofficeHomePage.claimEditButton;
import static dnext.com.pages.activationPages.FiberActivationForPrepaidPage.*;
import static dnext.com.pages.activationPages.VtvActivationPage.addToCartBtn;

@Log4j2
public class FiberActivationForPostpaidPage extends BasePage {
    @FindBy(xpath = "(//span[.=' New Order '])[4]")
    public WebElement newOrderBtnOnPostpaidOnFiber;
    @FindBy(xpath = "//mat-table[@role='table']//mat-row[1]//mat-cell[1]")
    public WebElement vodafoneGigaFibra200MbpsOptionForPostpaid;
    @FindBy(xpath = "/html/body/app/app-sales-layout/div[2]/div/app-catalog/div/div/mat-table/mat-row[1]/mat-cell[1]")
    public WebElement vodafoneGigaFibraPro50_20MbpsMbpsOptionForPostpaid;
    @FindBy(xpath = "//*[@id=\"mat-radio-3\"]")
    public WebElement recurringProductsOnFiber;
    @FindBy(xpath = "/html/body/app/app-sales-layout/div[2]/div/app-catalog/div/app-catalog-filters/mat-card/app-catalog-filters-category/div[2]/mat-tree/mat-nested-tree-node/div/mat-checkbox/label/span[1]")
    public WebElement internetOptionOnFiberForPostpaid;
    @FindBy(xpath = "//mat-basic-chip[normalize-space()='12 X ALL2000']")
    public WebElement contractDurationOf12XALL2000ForVodafoneGigaFibra200Mbps;
    @FindBy(xpath = "//mat-basic-chip[normalize-space()='12 X ALL0']")
    public WebElement contractDurationOf12XALLForBasicEnterpriseModem;
    @FindBy(xpath = "//h3[.=\"Vodafone GigaFibra 200 Mbps \"]")
    public WebElement selectedProductInShoppingCart;
    @FindBy(xpath = "//div[@class='mat-form-field-flex ng-tns-c108-5']")
    public WebElement isApprovedDropdownButtonOnCorporateConfirmationPage;
    @FindBy(xpath = "(//div[@class='cdk-overlay-pane']/div//*[@role='option'])[1]")
    public WebElement approvedButtonOnCorporateConfirmationPage;
    @FindBy(xpath = "//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-accent']")
    public WebElement completeTaskButtonOnCorporateConfirmationPage;
    @FindBy(xpath = "//p[normalize-space()='Task Completed']")
    public WebElement taskCompletedPopUpMessageOnCorporateConfirmationPage;
    @FindBy(xpath = "//*[.=' Corporate Confirmation '] ")
    public WebElement corporateConfirmationTextOnCorporateConfirmationPage;
    @FindBy(xpath = "//h3[.='GigaFibra Pro 50-20 Mbps']")
    public  WebElement vodafoneGigaFibraGigaFibraPro50_20MbpsOptionText;
    @FindBy(xpath = " (//*[@class='mat-chip mat-focus-indicator mat-primary mat-basic-chip ng-star-inserted'])[1]")
    public WebElement aLL12XALL3000MonthCashOption;



    public void fillFiberPostpaidCardNumber() {
        List<String> abelNumbers = new ArrayList<>(Arrays
                .asList(
                        "485754436BD1BB1F", "485754436BD1F71F", "485754436BD2331F", "485754436BD2511F",
                        "485754436BD28D1F", "485754436BD2E71F", "485754436BD44E32", "485754436BD4631F",
                        "485754436BD48B1F", "485754436BD49F1F", "485754436BD55583", "4485754431F02C9A",
                        "448575443A2F0F9B", "4854544351AD279B", "485754430003CE76", "485754430009099A",
                        "4857544300091D76", "485754430009608F", "48575443000F7A76", "485754430037B242",
                        "48575443003A9642", "48575443003DCA42", "48575443003E5660", "48575443003a3242",
                        "48575443003ee242", "485754430047AB9A", "48575443004A878F", "48575443004EF042",
                        "485754430052449A", "485754430055EE42", "485754430057F29A", "485754430058899A",
                        "48575443005D029A", "48575443005E6F60", "48575443005EE042", "48575443005a1242",
                        "48575443005e0442"));
        Random random = new Random();
        int randomIndex = random.nextInt(abelNumbers.size());
        sendKeys(pPPoEUserInputField, abelNumbers.get(randomIndex));
        sendKeys(oNTSerialNumberInputField, abelNumbers.get(randomIndex));
        System.out.println("abelNumbers.get(randomIndex) = " + abelNumbers.get(randomIndex));
    }

    public void checkFiberPostpaidNumberIsAvailableOrNot() {
        String successMessageXpath = "//simple-snack-bar/span[text()='Shopping cart created successfully!']";
        boolean isNumberAvailable = false;
        do {
            Utils.waitFor(3);
            if (Driver.getDriver().findElements(By.xpath(successMessageXpath)).isEmpty()) {
                pPPoEUserInputField.clear();
                oNTSerialNumberInputField.clear();
                fillFiberPostpaidCardNumber();
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

    public void claimEditButtonUsage(){
        Utils.waitForVisibility(claimEditButton,15);
        Utils.clickWithJS(claimEditButton);
        Utils.waitFor(3);
        System.out.println("Driver.getDriver().getWindowHandles().size() = " + Driver.getDriver().getWindowHandles().size());
        switchToWindowNew(2);
    }

    public void approveButton(){
        Utils.waitForVisibility(approvedButtonOnCorporateConfirmationPage,15);
        clickField(approvedButtonOnCorporateConfirmationPage);
        System.out.println("Driver.getDriver().getWindowHandles().size() = " + Driver.getDriver().getWindowHandles().size());
    }
    public void assertionOfBackOfficePage(String text){
        Utils.waitForVisibility(corporateConfirmationTextOnCorporateConfirmationPage,15);
        warningMessage(text, corporateConfirmationTextOnCorporateConfirmationPage);
    }


}