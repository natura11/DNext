package dnext.com.pages.faveo;

import com.utilities.Utils;
import dnext.com.pages.BasePage;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
@Log4j2
public class LoginOfFaveo extends BasePage {
    @FindBy(xpath = "//*[@id=\"login_form_user_name\"]")
    public WebElement userNameForLoginOnFaveoPage;

    @FindBy(xpath = "//*[@id=\"login_form_password\"]")
    public WebElement passwordForLoginOnFaveoPage;

    @FindBy(xpath = "//button[@id='default-login-button']")
    public static WebElement loginForLoginOnFaveoPage;


    public LoginOfFaveo login(String username, String password) throws InterruptedException {
        Utils.waitForVisibility(userNameForLoginOnFaveoPage,15);
        clickField(userNameForLoginOnFaveoPage);
        clearEnterText(userNameForLoginOnFaveoPage, username);
        clickField(passwordForLoginOnFaveoPage);
        clearEnterText(passwordForLoginOnFaveoPage, password);
        clickField(loginForLoginOnFaveoPage);
        log.info("Login is successful:" + username + " password:" + password);
        return this;
    }
}
