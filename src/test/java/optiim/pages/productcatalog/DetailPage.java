package optiim.pages.productcatalog;

import optiim.framework.core.PageBase;
import optiim.framework.helpers.WebDriverHelper;
import optiim.framework.helpers.WorldHelper;
import optiim.framework.utils.log;
import org.openqa.selenium.By;

import java.awt.*;
import java.awt.event.KeyEvent;

public class DetailPage extends PageBase {

    //public static final By homePage = By.cssSelector("[id='masthead'] [id='logo']");
    public static final By cmbCurrency = By.cssSelector("[ng-reflect-placeholder='Currency'][role='listbox']");

    private final WorldHelper worldHelper;

    public DetailPage(WebDriverHelper webDriverHelper, WorldHelper worldHelper) {
        super(webDriverHelper);
        this.worldHelper = worldHelper;
    }

    public DetailPage clickTab(String tabName) throws InterruptedException {
        clickJS(By.xpath("//div[contains(text(),'" + tabName + "')]"));
        log.info(tabName + "tab clicked.");
        Thread.sleep(1000);
        return this;
    }

    public DetailPage controlField(String fieldName) {
        log.info(fieldName + "Field is checking.");
        switch (fieldName) {
            case "Currency":
                control(isElementExist(cmbCurrency), fieldName + " field is exist.", "ERROR:" + fieldName + " field is not exist.");
                break;
            default:
                //code block
        }
        return this;
    }

    public DetailPage controlCurrencyField(String fieldOne, String fieldTwo, String fieldThree) throws InterruptedException, AWTException {
        log.info("Currency Field is checking.");
        clickJS(cmbCurrency);
        Thread.sleep(1000);
        control(isElementExist(By.xpath("//*[contains(text(),'" + fieldOne + "')]")), fieldOne + "field is exist.", "ERROR:" + fieldOne + "field is not exist.");
        control(isElementExist(By.xpath("//*[contains(text(),'" + fieldTwo + "')]")), fieldTwo + "field is exist.", "ERROR:" + fieldTwo + "field is not exist.");
        control(isElementExist(By.xpath("//*[contains(text(),'" + fieldThree + "')]")), fieldThree + "field is exist.", "ERROR:" + fieldThree + "field is not exist.");
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        return this;
    }

    public DetailPage clickAddButton() throws InterruptedException {
        clickJS(By.xpath("//mat-icon[contains(text(),'add')]"));
        log.info("Add Button clicked.");
        return this;
    }

    public DetailPage controlSearchPopupField(String fieldName) {
        log.info(fieldName + "Field is checking.");
        control(isElementExist(By.cssSelector("input[placeholder='" + fieldName + "']")), fieldName + "Field is exist.", "ERROR:" + fieldName + "Field is not exist.");
        return this;
    }
}
