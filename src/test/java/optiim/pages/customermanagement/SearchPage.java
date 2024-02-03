package optiim.pages.customermanagement;

import optiim.framework.core.PageBase;
import optiim.framework.helpers.WebDriverHelper;
import optiim.framework.helpers.WorldHelper;
import optiim.framework.utils.log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchPage extends PageBase {

    public static final By titleSearchCustomer = By.xpath("//div[contains(text(),'Search Customer')]");
    public static final By pathTab = By.xpath("//mat-tab-header/div[2]/div[1]/mat-ink-bar[1]");
    public static final By txtIdentityNumber = By.cssSelector("[formcontrolname='customerIdentityNumber']");
    public static final By btnCustomerIdentity = By.xpath("//h3[contains(text(),'Customer Identity')]");
    public static final By btnCustomerName = By.xpath("//h3[contains(text(),'Customer Name')]");
    public static final By btnStatusDeactive = By.xpath("//h3[contains(text(),'Status')]");
    public static final By txtCustomerName = By.cssSelector("[formcontrolname='customerName']");
    public static final By btnSearch = By.xpath("//h3[contains(text(),'search')]");
    public static final By titleCustomerOption = By.cssSelector("[role='option']");


    private final WorldHelper worldHelper;

    public SearchPage(WebDriverHelper webDriverHelper, WorldHelper worldHelper) {
        super(webDriverHelper);
        this.worldHelper = worldHelper;
    }

    public SearchPage controlSearchCustomer(String titleName) throws InterruptedException {
        String incomingTitleMessage = getTextOfElement(titleSearchCustomer);
        log.info("Expected Page Title:" + titleName);
        log.info("Incoming Page Title:" + incomingTitleMessage);
        control(incomingTitleMessage.contains(titleName), titleName + "title is exist.", "ERROR:" + titleName + "title is not exist.");
        return this;
    }


    public SearchPage enterIdentificationNumber(String identificationNumber) throws InterruptedException {
        identificationNumber = worldHelper.getCustomerName();
        log.info("Enter Customer Name:" + identificationNumber );
        click(btnCustomerName);
        sendKeys(txtCustomerName, identificationNumber);
        List<WebElement> elementList = findElements(titleCustomerOption);
        elementList.get(elementList.size() - 1).click();
        return this;
    }
}
