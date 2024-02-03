package optiim.pages.customermanagement;

import optiim.framework.core.PageBase;
import optiim.framework.helpers.WebDriverHelper;
import optiim.framework.helpers.WorldHelper;
import optiim.framework.utils.log;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.net.URL;

public class LoginPage extends PageBase {
    public static final By hrefLogin = By.xpath("//a[@href ='/auth/login']");
    public static final By txtUsername = By.id("username");
    public static final By txtPassword = By.id("password");
    public static final By btnLogin = By.name("login");
    public static final By adminPanel = By.xpath("//*[text()='Admin Panel']");
    public static final By alertMessageClose = By.id("alert_close");
    public static final By alertMessage = By.id("alert-message");
    //public static final By titleLoginPage = By.cssSelector("[class='login_title']");
    public static final By titleLoginPage = By.xpath("//h1[@id='kc-page-title']");
    public static final By btnArrowDown = By.xpath("//mat-icon[contains(text(),'keyboard_arrow_down')]");
    public static final By btnLogout = By.xpath("//*[contains(text(),'Logout')]");


    private final WorldHelper worldHelper;

    public LoginPage(WebDriverHelper webDriverHelper, WorldHelper worldHelper) {
        super(webDriverHelper);
        this.worldHelper = worldHelper;
    }

    public LoginPage openPage() throws MalformedURLException {
        //getWebDriver().navigate().to(new URL(Props.getProp("site.url")));
        log.info("Web page açılıyor: " + worldHelper.getFrontEndURL());
        getWebDriver().navigate().to(new URL(worldHelper.getFrontEndURL()));
        return this;
    }

    public LoginPage login() throws MalformedURLException, InterruptedException {
        Thread.sleep(2750);
        //enterUsername("elvis.abazi");
        //enterUsername("orbitant");
        enterUsername("gerta.vathi");
        Thread.sleep(700);
        //enterPassword("orbitant123");
        enterPassword("1234");
        Thread.sleep(700);
        pressLogin();
        log.info("Login işlemi başarılı.");
        return this;
    }

    public LoginPage navBarLogin() throws MalformedURLException {
        click(hrefLogin);
        return this;
    }

    public LoginPage enterUsername(String username) throws MalformedURLException, InterruptedException {
        clearText(txtUsername);
        sendKeys(txtUsername, username);
        log.info("Enter Username:" + username);
        return this;
    }

    public LoginPage enterPassword(String password) throws MalformedURLException, InterruptedException {
        clearText(txtPassword);
        sendKeys(txtPassword, password);
        log.info("Enter Password:" + password);
        return this;
    }

    public LoginPage pressLogin() throws MalformedURLException, InterruptedException {
        clickJS(btnLogin);
        return this;
    }

    public LoginPage controlLogin() throws MalformedURLException {
        control(isElementExist(adminPanel), "Login successful.", "ERROR: Login unsuccessful.");
        return this;
    }

    public LoginPage controlAlertMessage(String expectedAlertMessage) throws MalformedURLException, InterruptedException {
        String inComingMessage = getTextOfElement(alertMessage);
        log.info("Incoming alert message: " + inComingMessage);
        log.info("Expected alert message: " + expectedAlertMessage);
        control(inComingMessage.contains(expectedAlertMessage), "Alert message check successful.", "ERROR: Alert message check unsuccessful.");
        return this;
    }

    public LoginPage controlLoginPage(String expectedTitle) throws MalformedURLException, InterruptedException {
        waitForExpectedElement(titleLoginPage);
        String incomingTitle = getTextOfElement(titleLoginPage);
        log.info("Incoming title:" + incomingTitle);
        log.info("Expected title: " + expectedTitle);
        control(expectedTitle.contains(incomingTitle), "Login page is opened.", "ERROR: Login page did not open.");
        return this;
    }


    public LoginPage logout() throws InterruptedException {
        Thread.sleep(3000);
        clickJS(By.xpath("//button[contains(@class,'user-button')]"));
        log.info("Arrow Down Button clicked.");
        Thread.sleep(2500);
        clickJS(btnLogout);
        log.info("Logout Button clicked.");
        return this;
    }

    public LoginPage clickLoginButton() throws InterruptedException {
        clickJS(btnLogin);
        log.info("Login Button clicked.");
        return this;
    }

    public LoginPage controlErrorMessage(String expectedValue) {
        log.info(expectedValue + "Title is checking;");
        control(isElementExist(By.xpath("//*[contains(text(),'" + expectedValue + "')]")), expectedValue + "Title is exist.", "ERROR:" + expectedValue + "Title is not exist.");
        return this;
    }
}
