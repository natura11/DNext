package optiim.pages.casemanagement;

import optiim.framework.core.PageBase;
import optiim.framework.helpers.WebDriverHelper;
import optiim.framework.helpers.WorldHelper;
import optiim.framework.utils.log;
import optiim.models.data.gui.customercasemanagement.CustomerCaseManagementData;
import optiim.pages.dcase.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.util.List;

public class TicketRecordsPage extends PageBase {
    public static final By btnCreateNew = By.cssSelector("[mattooltip='Create New']");
    public static final By titleDcaseLoginPage = By.cssSelector("[class='login_title']");

    private final WorldHelper worldHelper;
    private CustomerCaseManagementData customerCaseManagementData;

    public TicketRecordsPage(WebDriverHelper webDriverHelper, WorldHelper worldHelper, CustomerCaseManagementData customerCaseManagementData) {
        super(webDriverHelper);
        this.worldHelper = worldHelper;
        this.customerCaseManagementData = customerCaseManagementData;

    }

    public TicketRecordsPage clickTicketID() throws MalformedURLException {

        String currentTabHandle = getWebDriver().getWindowHandle();

        List<WebElement> elementList = findElements(By.cssSelector("[class^='products-table'] mat-row mat-cell a"));
        elementList.get(0).click();

        String newTabHandle = getWebDriver().getWindowHandles()
                .stream()
                .filter(handle -> !handle.equals(currentTabHandle))
                .findFirst()
                .get();

        getWebDriver().switchTo().window(newTabHandle);

        return this;
    }

    public TicketRecordsPage controlLoginPage() throws MalformedURLException, InterruptedException {
        String expectedTitle = "Login to start your session";
        String actualTitle = getTextOfElement(titleDcaseLoginPage);
        log.info("Actual title:" + actualTitle);
        log.info("Expected title: " + expectedTitle);
        control(expectedTitle.contains(actualTitle), "Dcase Login page is opened.", "ERROR: Dcase Login page did not open.");
        return this;
    }


}

