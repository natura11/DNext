package optiim.pages.customermanagement;

import optiim.framework.core.PageBase;
import optiim.framework.helpers.WebDriverHelper;
import optiim.framework.helpers.WorldHelper;
import optiim.framework.utils.log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CustomersPage extends PageBase {

    public static final By titleCustomerRecords = By.xpath("//span[contains(text(),'Customer Records')]");
    public static final By alertPopupMessage = By.xpath("//*[@role='alert] [@class='mat-simple-snackbar ng-star-inserted']");


    public static final By tblCustomer = By.cssSelector("[role='gridcell'] span");
    public static final By titleItemsPerPage = By.xpath("//div[contains(text(),'Items per page:')]");
    public static final By cmbItemsPerPage = By.cssSelector("[aria-label='Items per page:']");
    public static final By btnNextPage = By.cssSelector("[aria-label='Next page']");
    public static final By btnPreviousPage = By.cssSelector("[aria-label='Previous page']");
    public static final By txtSearchCustomer = By.cssSelector("[placeholder='Search for a customer']");


    private final WorldHelper worldHelper;

    public CustomersPage(WebDriverHelper webDriverHelper, WorldHelper worldHelper) {
        super(webDriverHelper);
        this.worldHelper = worldHelper;
    }

    public CustomersPage controlCustomerRecords(String alertMessage) throws InterruptedException {
        Thread.sleep(2000);
        log.info("Expected message:" + alertMessage);
        control(isElementExist(By.xpath("//*[contains(text(),'" + alertMessage + "')]")), "Popup control is successfully", "ERROR:Popup control is not successfully");
        return this;
    }

    public CustomersPage controlCustomerPageTitle(String titlePageName) {
        control(isElementExist(titleCustomerRecords), titlePageName + " title is exist.", "ERROR:" + titlePageName + "title is not exist.");
        return this;
    }

    public CustomersPage clickCustomerName() throws InterruptedException {
        log.info("Enter Name:" + worldHelper.getCustomerName());
        sendKeys(txtSearchCustomer, worldHelper.getCustomerName());
        List<WebElement> elementList = findElements(tblCustomer);
        elementList.get(0).click();
        log.info("Customer Name clicked.");
        return this;
    }
}
