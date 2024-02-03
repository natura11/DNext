package optiim.pages.productcatalog;

import optiim.framework.core.PageBase;
import optiim.framework.helpers.WebDriverHelper;
import optiim.framework.helpers.WorldHelper;
import optiim.framework.utils.log;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends PageBase {

    public static final By ddUserMenu = By.cssSelector("[class='dropdown user user-menu'] [class='dropdown-toggle']");
    public static final By btnLogout = By.id("logout");
    public static final By homePage = By.cssSelector("[id='masthead'] [id='logo']");
    public static final By btnSearch = By.cssSelector("[id='search']");
    public static final By txtName = By.cssSelector("[placeholder='Name']");

    private final WorldHelper worldHelper;

    public HomePage(WebDriverHelper webDriverHelper, WorldHelper worldHelper) {
        super(webDriverHelper);
        this.worldHelper = worldHelper;
    }

    public void logout() {
        click(ddUserMenu);
        click(btnLogout);
        log.info("Logout.");
    }

    public void homePageControl() {
        control(isElementExist(homePage), "Home page appeared.", "The home page did not appear.");
        log.info("Logout.");
    }

    public void controlPage(String page) {
        control(isElementExist(By.xpath("//*[text()='" + page + "']")), "Home page appeared.", "The home page did not appear.");
        log.info("Logout.");
    }


    public HomePage controlTitlePage(String titleName) throws InterruptedException {
        Thread.sleep(2000);
        log.info(titleName + "Page Title is checking.");
        control(isElementExist(By.xpath("//*[contains(text(),'" + titleName + "')]")), titleName + "Page Title is exist.", "ERROR:" + titleName + "Page Title is not exist.");
        return this;
    }

    public HomePage clickButton(String selectName) throws InterruptedException {
        clickJS(By.xpath("//p[contains(text(),'" + selectName + "')]"));
        log.info(selectName + "button clicked.");
        return this;
    }

    public HomePage clickSearchButton() throws InterruptedException {
        Thread.sleep(1000);
        clickJS(btnSearch);
        log.info("Search Button clicked.");
        return this;
    }

    public HomePage enterName(String name) throws InterruptedException {
        Thread.sleep(2000);
        sendKeys(txtName, name);
        log.info("Enter Name:" + name);
        Thread.sleep(2000);
        clickJS(By.xpath("//span[contains(text(),'Search') and @class='mat-button-wrapper']"));
        log.info("Search Button clicked.");
        return this;
    }

    public HomePage clickOnRelatedOffer() throws InterruptedException {
        Thread.sleep(3000);
        Actions actions = new Actions(getWebDriver());
        actions.moveToElement(findElements(By.xpath("//mat-cell[1]")).get(0)).doubleClick().build().perform();
        //clickJS(findElements(By.xpath("//mat-cell[1]")).get(0));
        log.info("Related Offer clicked.");
        return this;
    }
}
