package optiim.pages.customermanagement;

import optiim.framework.core.PageBase;
import optiim.framework.helpers.WebDriverHelper;
import optiim.framework.helpers.WorldHelper;
import optiim.framework.utils.log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PartnerPage extends PageBase {


    //public static final By titleCustomerRecords = By.xpath("//span[contains(text(),'Customer Records')]");
    public static final By cmbSearchType = By.cssSelector("[class*='mat-select-arrow']");
    public static final By txtSearch = By.cssSelector("input[role='combobox']");
    public static final By btnPartnerMenu = By.xpath("//span[contains(text(),'Partner')]");
    public static final By btnSearchText = By.xpath("//mat-icon[contains(text(),'search')]");

    private final WorldHelper worldHelper;

    public PartnerPage(WebDriverHelper webDriverHelper, WorldHelper worldHelper) {
        super(webDriverHelper);
        this.worldHelper = worldHelper;
    }

    public PartnerPage controlPageTitleName(String titleName) throws InterruptedException {
        Thread.sleep(2000);
        log.info(titleName + "Page Title is checking.");
        control(isElementExist(By.xpath("//*[contains(text(),'" + titleName + "')]")), titleName + "title is exist.", "ERROR:" + titleName + "title is not exist.");
        return this;
    }

    public PartnerPage clickSelectSearchTypeButton() throws InterruptedException {
        Thread.sleep(500);
        clickJS(cmbSearchType);
        log.info("Search Type Button clicked.");
        return this;
    }

    public PartnerPage controlSearchTypeField(String fieldName) {
        log.info(fieldName + "Field is checking.");
        control(isElementExist(By.xpath("//*[contains(text(),'" + fieldName + "')]")), fieldName + "Field is exist.", "ERROR:" + fieldName + "Field is not exist.");
        return this;
    }

    public PartnerPage selectPartnerSearchType(String searchType) throws InterruptedException {
        Thread.sleep(1000);
        List<WebElement> elementList = findElements(cmbSearchType);
        selectMatComboboxJS(elementList.get(1), searchType);
        log.info("Select Search Type:" + searchType);
        return this;
    }

    public PartnerPage enterSearchText(String searchName) throws InterruptedException {
        Thread.sleep(1000);
        sendKeys(txtSearch, searchName,true);
        Thread.sleep(2000);
        //List<WebElement> elementList = findElements(btnSearchText);
        //clickJS(elementList.get(1));
        //clickJS(By.xpath("//span[contains(text(),'" + searchName + "')]"));
        clickJS(By.cssSelector("span[class='mat-option-text'] span"));
        log.info("Enter Search Name:" + searchName);
        return this;
    }

    public PartnerPage clickPartnerMenu() throws InterruptedException {
        Thread.sleep(3000);
        List<WebElement> elementList = findElements(btnPartnerMenu);
        clickJS(elementList.get(1));
        log.info("Partner Page Menu clicked.");
        return this;
    }
}
