package optiim.pages.dcase;

import optiim.framework.core.PageBase;
import optiim.framework.helpers.WebDriverHelper;
import optiim.framework.helpers.WorldHelper;
import optiim.framework.utils.log;
import org.openqa.selenium.By;

public class HomePage extends PageBase {

    public static final By ddUserMenu = By.cssSelector("[class='dropdown user user-menu'] [class='dropdown-toggle']");
    public static final By btnLogout = By.id("logout");
    public static final By homePage = By.cssSelector("[id='masthead'] [id='logo']");
    public static final By btnTickets = By.xpath("//span[@id='tickets-name-1']");
    public static final By btnInbox = By.xpath("//span[@id='inbox-name-1']");


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

    public void clickMenuButton(String buttonName) throws InterruptedException {
        switch (buttonName) {
            case "Tickets":
                clickJS(btnTickets);
                break;
            case "Inbox":
                clickJS(btnInbox);
                break;
            default:
                //code block
        }

        log.info(buttonName + "Button clicked.");
    }
}
