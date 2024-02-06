package dnext.com.pages;

import com.utilities.ConfigurationReader;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.utilities.TestContext;
import com.utilities.Utils;
import com.utilities.anotations.DefaultUrl;
import dnext.com.step_definitions.gui.Hooks;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Map;
import java.util.Random;

import static com.utilities.Driver.getDriver;
@Slf4j
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
    @FindBy(xpath = "//*[@id=\"container-3\"]/toolbar/mat-toolbar/div/div[2]/button[1]/span/div/img")
    public WebElement profileSignBtnOnHomePage;
    @FindBy(xpath = "//mat-icon[normalize-space()='keyboard_arrow_down']")
    public WebElement profileSignDropdownArrowBtnOnPage;
    @FindBy(xpath = "//span[@class='username mr-12']")
    public WebElement userNameWithProfileOnHomePage;
    @FindBy(xpath = "//*[@id=\"mat-menu-panel-0\"]/div/button[1]/span")
    public WebElement myProfileBtnInDropdownOnHomePage;
    @FindBy(xpath = "//*[@id=\"mat-menu-panel-0\"]/div/button[2]/span")
    public WebElement inboxBtnInDropdownOnHomePage;
    @FindBy(xpath = "//button[3]")
    public WebElement logoutBtnInDropdownOnHomePage;
    @FindBy(xpath = "//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[1]/div[2]")
    public WebElement emailOfUserOnHomePage;
    @FindBy(xpath = "//*[@id=\"container-3\"]/toolbar/mat-toolbar/div/div[2]/button[2]/span/div/span")
    public WebElement languageBtnOnHomePage;
    @FindBy(xpath = "//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[1]/div[2]/button[1]")
    public WebElement arrowBackBtnOnHomePage;
    @FindBy(xpath = "//span[.=\"arrow_back\"]/..")
    public WebElement arrowBackBtn;

    public BasePage logout(){
        Utils.waitFor(3);
        log.info("User logs out from the page");
        Utils.click( profileSignDropdownArrowBtnOnPage);
        Utils.click(logoutBtnInDropdownOnHomePage);
        return this;
    }

    public BasePage isShownEmailOfUserOnHomePage(){
        emailOfUserOnHomePage.isDisplayed();
        System.out.println("emailOfUserOnHomePage.getText() = " + emailOfUserOnHomePage.getText());
        return this;
    }

    public static class CommonElements {

    }



}