package optiim;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.PickleWrapper;
import optiim.framework.utils.log;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json"},
        features = "src/test/resources/optiim/gui/dcase",
        glue = {"classpath:com.examples"},
        tags = "@regression"

)
public class RunCucumberTest extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        log.info("dataprovider length" + super.scenarios().length);
//        System.out.println("dataprovider lengths" + super.scenarios().length);
//
//        for (int i = 0; i < super.scenarios().length; i++) {
////            log.info("scenarios:" + super.scenarios()[i][0].toString());
//            PickleWrapper pw = (PickleWrapper) super.scenarios()[i][0];
//            log.info("Scenario Name " + i +":" + pw.getPickle().getName());
//            log.info("suite " + pw.getPickle().getTags().get(2));
//            log.info("test# " +pw.getPickle().getTags().get(3));
//        }
        return super.scenarios();
    }
}
