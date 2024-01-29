package dnext.com.pages;

import dnext.com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

    public SignInPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "username")
    WebElement usernameField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(id = "kc-login")
    WebElement signInBtn;

    @FindBy(className = "kc-social-provider-name")
    WebElement ConnectWithVodafoneAccountBtn;

    @FindBy(id = "input-error")
    WebElement invalidUsernameOrPasswordWarning;

    @FindBy(id = "kc-header-wrapper")
    WebElement HeaderSignOfDnext;

    @FindBy(id = "kc-page-title")
    WebElement pageTitleOfLoginPage;
















}
