package dnext.com.step_definitions.gui;

import com.utilities.Driver;
import com.utilities.TestContext;

import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;
import java.util.List;

public class HooksUI {

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
           //Driver.closeDriver();
        }
   }

}
