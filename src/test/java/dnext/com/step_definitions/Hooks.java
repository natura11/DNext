package dnext.com.step_definitions;

import com.utilities.Driver;
import com.utilities.Utils;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setUpScenario() {
        // System.out.println("====Setting up browser using cucumber @Before");

    }
    @Before ()
    public void setUpScenarioForLogins() {
        //System.out.println("====This will only apply to scenarios with @login tag");

    }
    @Before ()
    public void setUpDatabaseScenario() {
        //System.out.println("====This will only apply to scenarios with @db tag");

    }

    @After
    public void tearDownScenario(Scenario scenario) {

        if(scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

            scenario.attach(screenshot,"image/png", scenario.getName());

        }



        Driver.closeDriver();

        // System.out.println("====Closing browser using cucumber @After");
        //System.out.println("====Scenario ended/Take screenshot if failed!");
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

    @AfterStep
    public void takeScreenshotAfterStep(Scenario scenario) {
        try {
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshots");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
