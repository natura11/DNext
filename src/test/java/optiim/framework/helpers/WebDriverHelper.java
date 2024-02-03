package optiim.framework.helpers;


import com.utilities.Driver;
import optiim.framework.utils.log;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WebDriverHelper {
    private static String SELENIUM_REMOTE_URL = System.getProperty("hub") == null ? "" : System.getProperty("hub");
    private WebDriver driver;
    private static final Logger LOG = LoggerFactory.getLogger(WebDriverHelper.class);

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public void setupController() {
        this.driver = startChromeDriver();
    }

    private static WebDriver startChromeDriver() {
        return Driver.getDriver();
    }


    public void teardownController() {
        if (driver != null) {
            driver.quit();
        }
        log.info("The driver shut down.");
    }
}