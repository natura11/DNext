package dnext.com.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber.json",
                "html:target/cucumber-report.html",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "rerun:target/rerun.txt",
        },
        features = "src/test/resources/features",//path from content root
        glue = "dnext/com/step_definitions",
        dryRun =false,
        tags ="@searchOrganization",
        publish = false



)
public class CukesRunner {
}
