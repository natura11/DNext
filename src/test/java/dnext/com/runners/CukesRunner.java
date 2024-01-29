package dnext.com.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber.json",
                "html:target/cucumber-report.html",

                "com.utilities.formatter.PrettyReports:target/cucumber-pretty-reports",
                "rerun:target/rerun.txt",
        },
        features = "src/test/resources/features",//path from content root
        glue = "dnext/com/step_definitions",
        dryRun =false,
        tags ="@loginPositive",
        publish = false



)
public class CukesRunner {
}
