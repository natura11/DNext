package dnext.com.pages;

import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import com.utilities.Driver;
import com.utilities.Utils;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import com.utilities.anotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


@DefaultUrl("signin.page.url")
@Slf4j
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
    public SignInPage fillUserNameInput(String username) {
        usernameFieldOnSignInPage.sendKeys(username);
        return this;
    }
    public SignInPage fillPasswordInput(String password) {
        log.info("Password is inserting");
        passwordFieldOnSignInPage.sendKeys(password);
        return this;
    }
    public SignInPage signInBtn(){
       Utils.waitForPageToLoad();
        Utils.click(signInBtnOnSignInPage);
        return this;
    }
    public SignInPage warningMessageAssertionOnSignIn(String warningMessage){
        log.info("Warning message is shown in Sign in page");
        String actualresult=invalidUsernameOrPasswordWarningOnSignInPage.getText();
        String expectedResult=warningMessage;
        Assert.assertEquals(warningMessage,actualresult);
        System.out.println("warningMessage = " + warningMessage);
        return this;
    }
    public SignInPage titleVerificationOnSignIn(String title){
        String actualTitle = titleOfSignInOnSignInPage.getText();
        System.out.println("actualTitle = " + actualTitle);
        System.out.println("title = " + title);
        String expectedTitle = title;
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        return this;
    }

    public WebElement getHeaderSignOfDnextOnSignInPage(){

        return headerSignOfDnextOnSignInPage;
    }




}
