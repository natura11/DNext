package dnext.com.step_definitions;

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

    @BeforeAll
    public void start() {
        testContexts = new ArrayList<>();
        BasePage.testContext.set(testContexts);
        Driver.getDriver().manage().timeouts().getPageLoadTimeout();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Before
    public void setUpScenario(Scenario scenario) {
        scenarioName.set(scenario.getName());
    }

    @After
    public void tearDownScenario(Scenario scenario) {

        if(scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

            scenario.attach(screenshot,"image/png", scenario.getName());

        }
        Driver.closeDriver();
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
