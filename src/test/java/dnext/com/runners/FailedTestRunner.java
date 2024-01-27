package dnext.com.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        glue = "dnext/com/step_definitions",//path from source root
        features = "@target/rerun.txt"




)
public class FailedTestRunner {


}
