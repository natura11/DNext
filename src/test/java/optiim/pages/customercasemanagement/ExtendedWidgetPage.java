package optiim.pages.customercasemanagement;

import optiim.framework.core.PageBase;
import optiim.framework.helpers.WebDriverHelper;
import optiim.framework.helpers.WorldHelper;
import optiim.framework.utils.log;
import org.openqa.selenium.By;


public class ExtendedWidgetPage extends PageBase {

    public static final By btnDetails = By.xpath("//span[contains(text(),'Details')]");
    public static final By btnMoreProcess = By.xpath("//mat-icon[contains(text(),'more_vert')]");
    public static final By btnCreateNew = By.xpath("//mat-icon[contains(text(),'add')]");


    private final WorldHelper worldHelper;

    public ExtendedWidgetPage(WebDriverHelper webDriverHelper, WorldHelper worldHelper) {
        super(webDriverHelper);
        this.worldHelper = worldHelper;
    }


    public ExtendedWidgetPage clickMoveVertIcon() throws InterruptedException {
        Thread.sleep(2000);
        clickJS(By.xpath("//table/tbody//tr[1]//td[9]//button"));
        log.info("Move Vert Icon clicked.");
        return this;
    }

    public ExtendedWidgetPage clickDetails() throws InterruptedException {
        Thread.sleep(1000);
        clickJS(btnDetails);
        log.info("Details Button clicked.");
        return this;
    }

    public ExtendedWidgetPage clickAddNewTicketButton() throws InterruptedException {
        Thread.sleep(2000);
        clickJS(btnCreateNew);
        log.info("Add New Ticket Button clicked.");
        return this;
    }

    public ExtendedWidgetPage controlPageAddressLink() {
        log.info("Extended Page Address Link is checking.");
        control(getWebDriver().getCurrentUrl().contains("extended-widget"),"Extended Page Address Link is exist.","ERROR: Extended Page Address Link is not exist." );
        return this;
    }

    public ExtendedWidgetPage controlDetailPopup() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Detail Popup Page is checking.");
        control(!(isElementExist(By.cssSelector("[class='dialog-content-wrapper']"))),"Detail Popup Page closed.","ERROR: Detail Popup Page did not close.");
        return this;
    }
}