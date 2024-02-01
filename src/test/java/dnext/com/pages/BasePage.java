package dnext.com.pages;

import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import com.utilities.TestContext;
import com.utilities.Utils;
import com.utilities.anotations.DefaultUrl;
import dnext.com.step_definitions.Hooks;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.utilities.Driver.getDriver;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(getDriver(), this);
    }

    public static ThreadLocal<List<TestContext>> testContext = new InheritableThreadLocal<>();

    public void setTestData(String key, String value) {
        testContext.get().add(new TestContext(Hooks.scenarioName.get(), Map.of(key, value)));
    }

    public String getTestDate(String key, String scenarioName) {
        return testContext.get().stream()
                .filter(n -> n.scenarioName().equals(scenarioName))
                .map(n -> n.testData().get(key))
                .toList().getFirst();
    }

    public String getTestDate(String key) {
        return testContext.get().stream()
                .filter(n -> n.testData().containsKey(key))
                .toList().getFirst().testData().get(key);
    }

    public <T> void openPage(Class<T> className) {
        getDriver().get(ConfigurationReader.getProperty(className.getAnnotation(DefaultUrl.class).value()));
        Utils.waitForPageToLoad();
    };

    public void refreshPage() {
        Utils.refreshThePage();
    }
    public abstract boolean isPageLoad();

    public static class NavbarComponent {

    }

    public static class CommonElements {

    }
}