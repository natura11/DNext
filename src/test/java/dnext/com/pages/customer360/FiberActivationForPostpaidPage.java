package dnext.com.pages.customer360;

import com.utilities.Driver;
import com.utilities.Utils;
import dnext.com.pages.BasePage;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static dnext.com.pages.backofficePage.BackofficeHomePage.claimEditButton;
import static dnext.com.pages.customer360.FiberActivationForPrepaidPage.*;
import static dnext.com.pages.customer360.VtvActivationPage.addToCartBtn;
import static dnext.com.pages.customer360.VtvActivationPage.productsText;

@Log4j2
public class FiberActivationForPostpaidPage extends BasePage {
    @FindBy(xpath = "(//span[.=' New Order '])[4]")
    public WebElement newOrderBtnOnPostpaidOnFiber;
    @FindBy(xpath = "//mat-table[@role='table']//mat-row[1]//mat-cell[1]")
    public WebElement vodafoneGigaFibra200MbpsOptionForPostpaid;
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
    @FindBy(xpath = "//*[@id=\"catalog-component-wrapper\"]/div/mat-card[2]/h4")
    public WebElement textForConfirmation;


    public void numbersCreationForSerialNumbers() {
        String[] numbers =
                       {"485754436BD1BB1F", "485754436BD1F71F", "485754436BD2331F", "485754436BD2511F",
                        "485754436BD28D1F", "485754436BD2E71F", "485754436BD44E32", "485754436BD4631F",
                        "485754436BD48B1F", "485754436BD49F1F", "485754436BD55583", "4485754431F02C9A",
                        "448575443A2F0F9B", "4854544351AD279B", "485754430003CE76", "485754430009099A",
                        "4857544300091D76", "485754430009608F", "48575443000F7A76", "485754430037B242",
                        "48575443003A9642", "48575443003DCA42", "48575443003E5660", "48575443003a3242",
                        "48575443003ee242", "485754430047AB9A", "48575443004A878F", "48575443004EF042",
                        "485754430052449A", "485754430055EE42", "485754430057F29A", "485754430058899A",
                        "48575443005D029A", "48575443005E6F60", "48575443005EE042", "48575443005a1242",
                        "48575443005e0442"};
        for (String number : numbers) {
            pPPoEUserInputField.clear();
            oNTSerialNumberInputField.clear();
            Utils.waitFor(2);
            pPPoEUserInputField.sendKeys(number);
            oNTSerialNumberInputField.sendKeys(number);
            Utils.waitFor(2);
            addToCartBtn.click();
            Utils.waitFor(8);
            boolean c1=textForConfirmation.isDisplayed();
            System.out.println("textForConfirmation.isDisplayed() = " + textForConfirmation.isDisplayed());
            try{
                if(c1){
                    System.out.println("The selected serial number "+ number + "is being used!!");
                    throw new Exception();
                }
            }catch (Exception e){
                log.info("No more available numbers!!!");
            }

//            boolean isWarningVisible = false;
//            try {
//                Utils.waitForVisibility(warningForAlreadyUsedSerialNumber, 15);
//                isWarningVisible = true;
//            } catch (Exception e) {
//                isWarningVisible = false;
//            }
//            if (isWarningVisible) {
//                System.out.println(number + "number has already been used.");
//                continue;
//            } else {
//                System.out.println(number + " number has accepted successfully.");
//                break;
//            }
        }
    }

    public void claimEditButtonUsage(){
        Utils.clickWithJS(claimEditButton);
        Utils.waitFor(3);
        System.out.println("Driver.getDriver().getWindowHandles().size() = " + Driver.getDriver().getWindowHandles().size());
        switchToWindowNew(2);
    }

    public void approveButton(){
        clickField(approvedButtonOnCorporateConfirmationPage);
        System.out.println("Driver.getDriver().getWindowHandles().size() = " + Driver.getDriver().getWindowHandles().size());
    }
    public void assertionOfBackOfficePage(String text){
        System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());
        warningMessage(text, corporateConfirmationTextOnCorporateConfirmationPage);
    }


}
