package dnext.com.step_definitions;

import com.utilities.Driver;
import com.utilities.Utils;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;

public class Hooks {

    @Before
    public void setUpScenario() {
        Driver.getDriver().manage().timeouts().getPageLoadTimeout();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void tearDownScenario(Scenario scenario) {

        if(scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

            scenario.attach(screenshot,"image/png", scenario.getName());

        }
        Driver.closeDriver();
    }


    @BeforeStep
    public void setUpStep() throws InterruptedException {
        Utils.sleep(2);
        //System.out.println("----->applying setup using @BeforeStep");
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
/**
    @AfterStep
    public void takeScreenshotAfterStep(Scenario scenario) {
        try {
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshots");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/

}
