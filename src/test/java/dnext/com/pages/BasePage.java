package dnext.com.pages;

import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.utilities.TestContext;
import com.utilities.Utils;
import com.utilities.anotations.DefaultUrl;
import dnext.com.step_definitions.Hooks;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.utilities.Driver.getDriver;

public  abstract class BasePage {
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


    @FindBy(xpath = "//span[normalize-space()='Customer360']")
    public WebElement customer360btn;
    @FindBy(xpath = "//span[@class='nav-link-title ng-tns-c97-1 ng-star-inserted']")
    public WebElement covarageMapBtn;
    @FindBy(xpath = "//span[normalize-space()='Operations']")
    public WebElement operationsBtn;
    @FindBy(xpath = "//span[normalize-space()='Create Individual Customer']")
    public WebElement createIndividualCustomerBtn;
    @FindBy(xpath = "//span[normalize-space()='Create Business Customer']")
    public WebElement createBusinessCustomerBtn;
    @FindBy(xpath = "//span[normalize-space()='Create Government Customer']")
    public WebElement createGovernmentCustomerBtn;
    @FindBy(xpath = "//span[normalize-space()='Enterprise Parent Account']")
    public WebElement enterpriseParentAccountBtn;
    @FindBy(xpath = "//span[@class='nav-link-title ng-star-inserted'][normalize-space()='Batch Operations']")
    public  WebElement batchOperationsBtn;
    @FindBy(xpath = "//span[@class='nav-link-title ng-star-inserted'][normalize-space()='Partner']")
    public WebElement partnerBtn;
    @FindBy(xpath = "//span[@class='nav-link-title ng-star-inserted'][normalize-space()='Skeda']")
    public WebElement skedaBtn;
    @FindBy(xpath = "//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[1]")
    public  WebElement dnextlogoOnNavbar;


    public static class CommonElements {

    }



}