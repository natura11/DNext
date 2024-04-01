package dnext.com.pages;

import com.utilities.Utils;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import com.utilities.anotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("signin.page.url")
@Log4j2
public class SignInPage extends BasePage {

    @FindBy(id = "username")
    public WebElement usernameFieldOnSignInPage;
    @FindBy(id = "password")
    public WebElement passwordFieldOnSignInPage;
    @FindBy(id = "kc-login")
    public WebElement signInBtnOnSignInPage;
    @FindBy(className = "kc-social-provider-name")
    public WebElement connectWithVodafoneAccountBtnOnSignInPage;
    @FindBy(id = "input-error")
    public WebElement invalidUsernameOrPasswordWarningOnSignInPage;
    @FindBy(id = "kc-header-wrapper")
    public WebElement headerSignOfDnextOnSignInPage;
    @FindBy(id = "kc-page-title")
    public WebElement titleOfSignInOnSignInPage;

    public void fillUserNameInput(String username) {
        usernameFieldOnSignInPage.sendKeys(username);
    }

    public void fillPasswordInput(String password) {
        log.info("Password is inserting");
        passwordFieldOnSignInPage.sendKeys(password);
    }

    public void signInBtn() {
        Utils.waitForPageToLoad();
        Utils.click(signInBtnOnSignInPage);
    }

    public void warningMessageAssertionOnSignIn(String warningMessage) {
        log.info("Warning message is shown in Sign in page");
        String actualresult = invalidUsernameOrPasswordWarningOnSignInPage.getText();
        Assert.assertEquals(warningMessage, actualresult);
        System.out.println("warningMessage = " + warningMessage);
    }

    public void verificationTitleOnSignIn(String title) {
        String actualTitle = titleOfSignInOnSignInPage.getText();
        System.out.println("actualTitle = " + actualTitle);
        System.out.println("title = " + title);
        Assert.assertEquals(title, actualTitle);
    }


}
