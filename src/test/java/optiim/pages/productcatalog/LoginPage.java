package optiim.pages.productcatalog;

import optiim.framework.core.PageBase;
import optiim.framework.helpers.WebDriverHelper;
import optiim.framework.helpers.WorldHelper;
import optiim.framework.utils.log;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class LoginPage extends PageBase {
    public static final By txtUsername = By.id("username");
    public static final By txtPassword = By.id("password");
    public static final By btnLogin = By.name("login");
    public static final By userPanel = By.cssSelector("[class^='user fuse-navy'] [class*='username']");
    public static final By titleLoginPage = By.xpath("//*[text()='product-catalog login']");
    public static final By usernameContainer = By.cssSelector("[id='container-2'] [class*='username']");

    private final WorldHelper worldHelper;

    public LoginPage(WebDriverHelper webDriverHelper, WorldHelper worldHelper) {
        super(webDriverHelper);
        this.worldHelper = worldHelper;
    }

    public LoginPage login(String username, String password) {
        //openURL(GetData.url);
        clearEnterText(txtUsername, username);
        clearEnterText(txtPassword, password);
        click(btnLogin);
        log.info("Login successful. Username:" + username + " Password:" + password);
        return this;
    }

    public LoginPage enterUsername(String username) throws MalformedURLException, InterruptedException {
        sendKeys(txtUsername, username);
        log.info("Entered "+username+ " in the username field.");
        return this;
    }

    public LoginPage enterPassword(String pasword) throws MalformedURLException, InterruptedException {
        sendKeys(txtPassword, pasword);
        log.info("Entered "+pasword+ " in the password field.");
        return this;
    }

    public LoginPage clickLogin() throws MalformedURLException {
        click(btnLogin);
        log.info("Clicked login button.");
        return this;
    }

    public LoginPage controlLogin() throws MalformedURLException {
        control(isElementExist(userPanel), "Login successful.", "ERROR: Login unsuccessful.");
        control(isElementExist(usernameContainer), "Login successful.", "ERROR: Login unsuccessful.");
        return this;
    }

    public LoginPage controlPrdoctCatalogLoginPage() throws MalformedURLException {
        control(isElementExist(titleLoginPage), "Login page opened.", "ERROR: Login page did not open.");
        return this;
    }


}
