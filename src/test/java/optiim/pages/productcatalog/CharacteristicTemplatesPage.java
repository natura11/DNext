package optiim.pages.productcatalog;

import optiim.framework.core.PageBase;
import optiim.framework.helpers.WebDriverHelper;
import optiim.framework.helpers.WorldHelper;
import optiim.framework.utils.log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CharacteristicTemplatesPage extends PageBase {
    public static final By btnAdd = By.xpath("//mat-icon[contains(text(),'add')]");
    public static final By txtName = By.name("name");
    public static final By txtDesc = By.cssSelector("[formcontrolname='description']");
    public static final By startDateTime = By.name("startDateTime");
    public static final By startDateTimeToday = By.cssSelector("[class='mat-calendar-table'] [class*='mat-calendar-body-selected mat-calendar-body-today']");
    public static final By endDateTime = By.name("endDateTime");
    public static final By userPanel = By.cssSelector("[class^='user fuse-navy'] [class*='username']");
    public static final By titleLoginPage = By.xpath("//*[text()='product-catalog login']");
    public static final By usernameContainer = By.cssSelector("[id='container-2'] [class*='username']");
    public static final By dateFields = By.cssSelector("[name='formGroup'] [aria-label='Open calendar']");
    public static final By cmbCharacticsType = By.cssSelector("[formcontrolname='characteristicType']");

    private final WorldHelper worldHelper;

    public CharacteristicTemplatesPage(WebDriverHelper webDriverHelper, WorldHelper worldHelper) {
        super(webDriverHelper);
        this.worldHelper = worldHelper;
    }

    public CharacteristicTemplatesPage enterName(String name) throws InterruptedException {
        String chName = name + " " + getRandomNumberInRange(1000000, 9999999);
        sendKeys(txtName, name, false);
        log.info("Entered name:" + name);
        return this;
    }


    public CharacteristicTemplatesPage enterDesc(String desc) throws InterruptedException {
        click(txtDesc);
        getWebDriver().findElement(txtDesc).sendKeys(desc);
        log.info("Entered desc:" + desc);
        return this;
    }

    public CharacteristicTemplatesPage enterStartDateTime() throws InterruptedException {
        List<WebElement> elementList = findElements(dateFields);
        elementList.get(0).click();
        click(startDateTimeToday);
        return this;
    }

    public CharacteristicTemplatesPage enterEndDateTime() throws InterruptedException {
        List<WebElement> elementList = findElements(dateFields);
        elementList.get(1).click();
        click(By.cssSelector("[class='mat-calendar-period-button mat-button']"));
        click(By.cssSelector("[class='mat-calendar-body'] [aria-label='2023']"));
        click(By.cssSelector("[class='mat-calendar-body'] [aria-label^='April']"));
        click(By.xpath("//tbody/tr[4]/td[3]/div[1]"));

        return this;
    }

    public CharacteristicTemplatesPage addIcon() {
        click(btnAdd);
        return this;
    }
}
