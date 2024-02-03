package optiim.steps.gui.dcase;

import optiim.framework.Props;
import optiim.framework.UrlBuilder;
import optiim.framework.helpers.WebDriverHelper;
import optiim.pages.dcase.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

import java.net.MalformedURLException;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class LoginPageSteps {
    private final WebDriverHelper webDriverHelper;
    private final LoginPage loginPage;
    private final UrlBuilder urlBuilder;

    @When("I click login field")
    public void I_click_login_field() throws Throwable {
        loginPage
                .navBarLogin();
    }

    @When("I login")
    public void I_login() throws Throwable {
        Props props = new Props();
        loginPage
                .navBarLogin()
                .enterUsername(props.getProp("dcase.loginusername"))
                .enterPassword(props.getProp("dcase.loginpassword"))
                .pressLogin();
    }

    @When("I should be seeing login page")
    public void I_should_be_seeing_login_page() throws Throwable {
        loginPage
                .controlLoginPage();
    }

    @And("I enter a valid username {string} in the user name field")
    public void I_enter_a_valid_username_in_the_user_name_field(String username) throws MalformedURLException, InterruptedException {
        loginPage
                .enterUsername(username);
    }

    @And("I enter a invalid username {string} in the user name field")
    public void I_enter_a_invalid_username_in_the_user_name_field(String username) throws MalformedURLException, InterruptedException {
        loginPage
                .enterUsername(username);
    }

    @And("I enter a valid password {string} in the password field")
    public void I_enter_a_valid_password_in_the_password_field(String password) throws MalformedURLException, InterruptedException {
        loginPage
                .enterPassword(password);
    }

    @And("I enter a invalid password {string} in the password field")
    public void I_enter_a_invalid_password_in_the_password_field(String password) throws MalformedURLException, InterruptedException {
        loginPage
                .enterPassword(password);
    }


    @And("I press the login button")
    public void I_press_the_login_button() throws Throwable {
        loginPage
                .pressLogin();
    }

    @Then("I should be seeing have successfully logged in")
    public void I_should_be_seeing_have_successfully_logged_in() throws Throwable {
        loginPage
                .controlLogin();
    }

    @When("I should be seeing {string} alert message")
    public void I_should_be_seeing_alert_message(String message) throws Throwable {
        loginPage
                .controlAlertMessage(message);
    }


}
