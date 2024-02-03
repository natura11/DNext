package optiim.pages.customermanagement;

import optiim.framework.core.PageBase;
import optiim.framework.helpers.WebDriverHelper;
import optiim.framework.helpers.WorldHelper;
import optiim.framework.utils.log;
import org.openqa.selenium.By;

public class HomePage extends PageBase {

    private final WorldHelper worldHelper;

    public HomePage(WebDriverHelper webDriverHelper, WorldHelper worldHelper) {
        super(webDriverHelper);
        this.worldHelper = worldHelper;
    }

    public HomePage clickMenu(String menu) throws InterruptedException {

        click(By.xpath("//span[contains(text(),'" + menu + "')]"));
        log.info("Menu clicked:" + menu );

        return this;
    }



}
