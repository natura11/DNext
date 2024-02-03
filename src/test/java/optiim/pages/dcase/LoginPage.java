package optiim.pages.dcase;

import optiim.framework.core.PageBase;
import optiim.framework.helpers.WebDriverHelper;
import optiim.framework.helpers.WorldHelper;
import optiim.framework.utils.log;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.net.URL;

public class LoginPage extends PageBase {
    public static final By hrefLogin = By.xpath("//a[@href ='/auth/login']");
    public static final By txtUsername = By.id("user_name");
    public static final By txtPassword = By.id("password");
    public static final By btnLogin = By.id("default-login-button");
    public static final By adminPanel = By.xpath("//*[text()='Admin Panel']");
    public static final By alertMessageClose = By.id("alert_close");
    public static final By alertMessage = By.id("alert-message");
    public static final By titleLoginPage = By.cssSelector("[class='login_title']");

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

    public LoginPage login(String username, String password) throws InterruptedException {
        //openURL(GetData.url);
        clearEnterText(txtUsername, username);
        clearEnterText(txtPassword, password);
        clickJS(btnLogin);
        log.info("Login işlemi başarılı. Kullanıcı İsmi:" + username + " Şifre:" + password);
        return this;
    }

    public LoginPage navBarLogin() throws MalformedURLException, InterruptedException {
        clickJS(hrefLogin);
        return this;
    }

    public LoginPage enterUsername(String username) throws MalformedURLException, InterruptedException {
        sendKeys(txtUsername, username);
        return this;
    }

    public LoginPage enterPassword(String pasword) throws MalformedURLException, InterruptedException {
        sendKeys(txtPassword, pasword);
        return this;
    }

    public LoginPage pressLogin() throws MalformedURLException, InterruptedException {
        clickJS(btnLogin);
        return this;
    }

    public LoginPage controlLogin() throws MalformedURLException, InterruptedException {
        control(isElementExist(adminPanel), "Login successful.", "ERROR: Login unsuccessful.");
        return this;
    }

    public LoginPage controlAlertMessage(String expectedAlertMessage) throws MalformedURLException, InterruptedException {
        //String inComingMessage = getTextOfElement(alertMessage);
        //log.info("Incoming alert message: " + inComingMessage);
        log.info("Expected alert message: " + expectedAlertMessage);
        //control(inComingMessage.contains(expectedAlertMessage), "Alert message check successful.", "ERROR: Alert message check unsuccessful.");
        control(isElementExist(By.xpath("//*[contains(text(),'" + alertMessage + "')]")), "Popup control is successfully", "ERROR:Popup control is not successfully");
        return this;
    }

    public LoginPage controlLoginPage() throws MalformedURLException, InterruptedException {
        switchWindowTab();
        Thread.sleep(500);
        String expectedTitle = "Login to start your session";
        //String actualTitle = getTextOfElement(titleLoginPage);
        //log.info("Actual title:" + actualTitle);
        log.info("Expected title: " + expectedTitle);
        //control(expectedTitle.contains(actualTitle), "Login page is opened.", "ERROR: Login page did not open.");
        //control(isElementExist(By.xpath("//*[contains(text(),'" + expectedTitle + "')]")), "Login page is opened.", "ERROR: Login page did not open.");
        return this;
    }


}
