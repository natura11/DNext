package optiim.pages;

import optiim.framework.core.PageBase;
import optiim.framework.helpers.WebDriverHelper;
import optiim.framework.helpers.WorldHelper;
import optiim.framework.utils.log;
import org.openqa.selenium.By;

public class CommonPage extends PageBase {
    public static final By faveoNavigationMenu = By.cssSelector("[id='sideMenu'] [id='agent-navigation']");
    public static final By formMenu = By.cssSelector("[class='skin-blue fixed-sidebar content-wrapper']");
    public static final By menuActive = By.cssSelector("[class='has-arrow active']");

    private final WorldHelper worldHelper;

    public CommonPage(WebDriverHelper webDriverHelper, WorldHelper worldHelper) {
        super(webDriverHelper);
        this.worldHelper = worldHelper;
    }

    public void controlPage(String page) throws InterruptedException {

        if(page.equals("Trouble Tickets")){
            Thread.sleep(1000);
            getWebDriver().navigate().refresh();
            Thread.sleep(1000);
            //clickJS(By.xpath("//*[contains(text(),'Tickets')]"));
            log.info("Tickets Button clicked.");

        }
        else{
            Thread.sleep(1000);
            control(isElementExist(By.xpath("//*[contains(text(),'" + page + "')]")), "Home page appeared.", "The home page did not appear.");
        }
    }

    public CommonPage menuToggle() {

        click(faveoNavigationMenu);
        log.info("Menü toggle tıklandı.");

        return this;
    }

    public CommonPage openMenuDCase(String menu, String subMenu) throws InterruptedException {

        waitForElement(faveoNavigationMenu);
        waitForExpectedElement(faveoNavigationMenu);

//        if (!isElementExist(menuActive, 3)) {
//            clickJS(By.xpath("//span[normalize-space(text())='" + menu + "']"));
//        }
//
//        clickJS(By.xpath("//a[normalize-space(text())='" + altMenu + "']"));
//
//        log.info("Menü açıldı. Menu:" + menu + " - Alt Menu:" + altMenu);
//
//        if (isElementExist(formMenu, 3)) {
//            menuToggle();
//        }

        clickJS(By.xpath("//span[normalize-space(text())='" + menu + "']"));
        clickJS(By.cssSelector("[title='" + subMenu + "']"));

        log.info("Menu opened. Menu:" + menu + " - Sub Menu:" + subMenu);

        return this;
    }

    public CommonPage openMenuProductCatalog(String menu) throws InterruptedException {
        waitForElement(By.xpath("//span[normalize-space(text())='" + menu + "']"));
        waitForExpectedElement(By.xpath("//span[normalize-space(text())='" + menu + "']"));
        clickJS(By.xpath("//span[normalize-space(text())='" + menu + "']"));
        log.info("Menu opened. Menu:" + menu);
        return this;
    }


    public CommonPage openMenuCusMan(String menu) throws InterruptedException {
        Thread.sleep(2000);
        clickJS(By.xpath("//*[normalize-space(text())='" + menu + "']"));
        log.info("Menu opened. Menu:" + menu);
        return this;
    }

    public CommonPage openMenuCusCaseMan(String menu) throws InterruptedException {
        waitForElement(By.xpath("//span[normalize-space(text())='" + menu + "']"));
        waitForExpectedElement(By.xpath("//span[normalize-space(text())='" + menu + "']"));
        clickJS(By.xpath("//span[normalize-space(text())='" + menu + "']"));
        log.info("Menu opened. Menu:" + menu);

        return this;
    }

    public CommonPage controlPageUrl(String pageUrl) throws InterruptedException {
        Thread.sleep(2000);
        log.info("Page Url is checking.");
        String incomingPageUrl = getWebDriver().getCurrentUrl();
        log.info("Incoming Page Url " +incomingPageUrl);
        log.info("Expected Page Url " + pageUrl);
        control(incomingPageUrl.contains(pageUrl),pageUrl + " Page Url is exist.","ERROR:" + pageUrl + " Page Url is not exist.");
        return this;
    }
}
