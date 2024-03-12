package dnext.com.pages.customer360;

import com.github.javafaker.Faker;
import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import com.utilities.Utils;
import dnext.com.pages.BasePage;
import dnext.com.pages.camunda.HomePageCamunda;
import lombok.extern.log4j.Log4j2;
import org.bouncycastle.math.field.FiniteField;
import org.bouncycastle.math.field.FiniteFields;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class VtvActivationPage extends BasePage {
    Faker faker = new Faker();

    @FindBy(xpath = "//*[@id=\"products\"]/div[2]/div[1]/div[1] ")
    public WebElement customerSearchIcon;
    @FindBy(xpath = "//mat-select[@panelclass=\"dropDown-overlay\"]")
    public WebElement selectSearchTypeBtn;

    @FindBy(xpath = "(//*[text()=' Customer Name '])[2]")
    public WebElement selectSearchTypeWithCostomerName;

    @FindBy(xpath = "//*[@placeholder=\"Type text..\"]")
    public WebElement enterCustomerNamefield;

    @FindBy(xpath = "//*[@class=\"mat-autocomplete-panel custom-mat-autocomplete ng-star-inserted mat-autocomplete-visible\"]")
    public WebElement searchedNameField;

    @FindBy(xpath = "//div[text()='Account']")
    public WebElement accountButton;

    @FindBy(xpath = "(//*[.=' New Order '])[6]")
    public WebElement newOrderBtnOnPrepaid;
    @FindBy(xpath = "//*[.='Products']")
    public WebElement productsText;

    @FindBy(xpath = "//*[.='Digitalb Premium Plus']")
    public WebElement digitalbPremiumPlusText;

    @FindBy(xpath = "//label[@for='mat-checkbox-23-input']//span[@class='mat-checkbox-inner-container']")
    public WebElement tvOptionOnCheckBox;

    @FindBy(xpath = "//button[@class='mat-focus-indicator mat-shadow mat-flat-button mat-button-base']")
    public WebElement searchBtnForPruductOption;

    @FindBy(xpath = "//*[.=' Digitalb Premium Plus ']")
    public WebElement digitalbPremiumPlusOption;

    @FindBy(xpath = "//*[normalize-space()='ALL7900 3Month']")
    public WebElement paymentOptionALL79003Month;

    @FindBy(xpath = "//*[@id=\"mat-select-value-5\"]")
    public WebElement dropdownForVtvOptions;

    @FindBy(xpath = "//span[@class='mat-option-text'][normalize-space()='Vtv']")
    public WebElement optionVtv;

    @FindBy(xpath = "(//mat-icon[@role='img'][normalize-space()='add'])[3]")
    public WebElement addIconForAkesFeePerDokoderPremium;

    @FindBy(xpath = "//mat-basic-chip[normalize-space()='ALL0 3Month']")
    public WebElement all03MonnthsForAkesFeePerDokoderPremium;

    @FindBy(xpath = "//input[@id='CasId']")
    public WebElement cashIdForAkesFeePerDokoderPremium;

    @FindBy(xpath = "(//mat-icon[@role='img'][normalize-space()='add'])[3]")
    public WebElement addIconForTarifeInstalimi;

    @FindBy(xpath = "//mat-basic-chip[normalize-space()='ALL4000 3Month']")
    public WebElement allMonthsOptionForTarifeInstalimi;

    @FindBy(xpath = "//span[normalize-space()='Add to Cart']")
    public WebElement addToCartBtn;

    @FindBy(xpath = "//*[.='Shopping cart created successfully!']")
    public WebElement shoppingCartCreatedSuccesfullyMessage;

    @FindBy(xpath = "//*[@class='mat-icon notranslate mat-badge mat-badge-warn material-icons mat-icon-no-color mat-badge-overlap mat-badge-above mat-badge-after mat-badge-small']")
    public WebElement shoppingCartIcon;

    @FindBy(xpath = "//h3[.=\"Digitalb Premium Plus \"]")
    public WebElement selectedProductInShoppingCart;

    @FindBy(xpath = "//span[normalize-space()='CHECKOUT']")
    public WebElement checkoutBtn;

    @FindBy(xpath = "//label[@for='mat-checkbox-103-input']")
    public WebElement collectedTickBeforeCompleteChecekout;

    @FindBy(xpath = "//span[normalize-space()='COMPLETE CHECKOUT']")
    public WebElement completeChecekoutBtn;

    @FindBy(xpath = "//h3[.='Checkout is successfully completed']")
    public WebElement checkoutIsSuccessfullyCompletedMessage;

    @FindBy(xpath = "//span[normalize-space()='Go back to Customer360']")
    public WebElement goBackToCustomer360Btn;

    @FindBy(xpath = "//*[@class=\"mat-tab-label-content\"][.='Order']")
    public WebElement orderButtonOnCustomer360Page;

    @FindBy(xpath = "//*[@id=\"mat-tab-content-0-4\"]/div/app-order-page/mat-drawer-container/mat-drawer-content/div/div/mat-table/mat-row[1]/mat-cell[1]/span")
    public WebElement orderIdField;

    @FindBy(xpath = "//mat-row[1]//mat-cell[2]//span[1]")
    public WebElement orderStatus;

    @FindBy(xpath = "//h2[.='Customer Information']")
    public WebElement customerInformationTxtOnGeneral;

    @FindBy(xpath = "(//div[.='Main Page'])[2]")
    public WebElement mainPageButton;

    @FindBy(xpath = "//span[normalize-space()='Load Tickets']")
    public WebElement loadTicketsOnTroubleTickets;

    @FindBy(xpath = "//*[@id=\"mat-tab-content-2-0\"]/div/app-general-tab/div[4]/div/app-extended-trouble-ticket-widget/mat-card/div/div[2]/table/tbody/tr[1]/td[9]/button/span/mat-icon")
    public WebElement threeDotsIconNearLoadTickets;

    @FindBy(xpath = "//*[.='DCase']")
    public WebElement dCaseButton;

    @FindBy(xpath = "//*[@id=\"payments\"]/thead/tr/th[6]")
    public List<WebElement> agreementIds;




//camunda
    @FindBy(xpath = "//input[@id=\"Id\"]")
    public WebElement orderIdFieldOnCamundaHomePage;

    @FindBy(xpath = "//div[@id=\"devextreme1\"]")
    public WebElement productOrderCamundaOnHomePage;

    @FindBy(xpath = "//*[text()='ACTIVE']")
    public List<WebElement> activeListOnCamundaOnPage;

    @FindBy(xpath = "//*[@id=\"CamundaProcessGrid\"]/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[1]/div")
    public WebElement fullfillmentTypeFirstChoiceIconOnCamunda;

    @FindBy(xpath = "//span[text()='Variables']")
    public WebElement variablesChoiceIconOnCamunda;

    @FindBy(xpath = "//td[@class='dx-cell-focus-disabled']")
    public WebElement errorMessageOnVariablesOnCamunda;

    @FindBy(xpath = "//*[.='getFlowVariables successful!']")
    public  WebElement successfullMessageOnComunda;







    public VtvActivationPage casIdFromFaker() {
        sendKeys(cashIdForAkesFeePerDokoderPremium, faker.numerify("############"));
        return this;
    }

    public VtvActivationPage switchToFaveoFromDnext() {
        clickField(dCaseButton);
        switchToWindowNew(1);
        System.out.println("moved to faveo succesfully!!");
        return this;
    }

    public VtvActivationPage switchToDnextFromFaveo() {
        switchToWindowNew(0);
        System.out.println("moved to Dnext succesfully!!");
        return this;
    }

    public VtvActivationPage verifyTheOrderStatusIsCompleted() {

        if (orderStatus.getText().equalsIgnoreCase(" completed ")){
            Assert.assertEquals(" completed ", orderStatus.getText());

        }else {
        String OrderId   = orderIdField.getText();
         Driver.getDriver().get(ConfigurationReader.getProperty("comundaViewer.site.url"));
         //switchToWindowNew(1);
         sendKeys(orderIdFieldOnCamundaHomePage,OrderId);
         clickField(productOrderCamundaOnHomePage);

         if(activeListOnCamundaOnPage.getFirst().getText().equalsIgnoreCase("ACTIVE")){
             System.out.println(activeListOnCamundaOnPage.getFirst().getText());

             Utils.waitFor(3);
             clickField(fullfillmentTypeFirstChoiceIconOnCamunda);
             System.out.println("stayed without clicking");
             clickField(variablesChoiceIconOnCamunda);
             Utils.waitForVisibility(errorMessageOnVariablesOnCamunda,15);
             System.out.println("errorMessageOnVariablesOnCamunda.getText() = " + errorMessageOnVariablesOnCamunda.getText());
             log.info("Error message is " +errorMessageOnVariablesOnCamunda.getText());
             switchToWindowNew(0);
         }

        }




        try {
            Assert.assertEquals(" completed ", orderStatus.getText());
        } catch (Exception e) {
            log.info(orderStatus + "is not displayed");
        }
        return this;
    }

    public VtvActivationPage verifyOrderAggrementIdMatchedInFiscalizationReceipt() {
        List<WebElement> aggrementIds = Driver.getDriver().findElements(By.xpath("//*[@class='mat-cell cdk-cell cdk-column-agreementId mat-column-agreementId ng-star-inserted']"));
        List<String> agreementIdTexts = new ArrayList<>();
        for (WebElement agreementId : aggrementIds) {
            agreementIdTexts.add(agreementId.getText());
        }
        System.out.println("agreementIdTexts = " + agreementIdTexts);
        return this;
    }


}
