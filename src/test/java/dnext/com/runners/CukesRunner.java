package dnext.com.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber.json",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                //"me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        features = "src/test/resources/features",//path from content root
        glue = "dnext/com/step_definitions",
        dryRun =true,
        tags =" ",
        publish = false



)
public class CukesRunner {
}
