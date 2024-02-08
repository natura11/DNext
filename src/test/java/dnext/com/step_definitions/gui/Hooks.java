package dnext.com.step_definitions.gui;

import com.utilities.Driver;
import com.utilities.TestContext;
import com.utilities.Utils;

import dnext.com.pages.BasePage;
import io.cucumber.java.*;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Hooks {

    private static List<TestContext> testContexts;
    public static ThreadLocal<String> scenarioName;

    @Before
    public void before_all() {
        Driver.getDriver().manage().timeouts().getPageLoadTimeout();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }




    @After
    public void tearDown(Scenario scenario) {
        try {
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            if (scenario.isFailed()) {
                scenario.attach(screenshot, "image/png", "screenshots");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Driver.closeDriver();
        }
    }

}
