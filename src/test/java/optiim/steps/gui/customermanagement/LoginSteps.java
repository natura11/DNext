package optiim.steps.gui.customermanagement;

import optiim.framework.UrlBuilder;
import optiim.framework.helpers.WebDriverHelper;
import optiim.pages.customermanagement.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class LoginSteps {

    private final WebDriverHelper webDriverHelper;
    private final UrlBuilder urlBuilder;
    private final LoginPage loginPage;

    @When("I have logged into the system.")
    public void I_have_logged_into_the_system() throws Throwable{
        loginPage
                .login();
    }

    @When("I have log out into the system.")
    public void ıHaveLogOutIntoTheSystem() throws Throwable {
        loginPage
                .logout();
    }

    @Then("I should be seeing that the {string} page is opened for Login Page")
    public void ıShouldBeSeeingThatThePageIsOpenedForLoginPage(String expectedTitle) throws Throwable {
        loginPage
                .controlLoginPage(expectedTitle);
    }

    @When("I enter a value {string} in the UserName field")
    public void ıEnterAValueInTheUserNameField(String userName) throws Throwable {
        loginPage
                .enterUsername(userName);
    }

    @And("I enter a value {string} in the Password field")
    public void ıEnterAValueInThePasswordField(String password) throws Throwable {
        loginPage
                .enterPassword(password);
    }

    @And("I click the login button for Login Page")
    public void ıClickTheLoginButtonForLoginPage() throws Throwable {
        loginPage
                .clickLoginButton();
    }

    @Then("I should be seeing the message {string} for Login Page")
    public void ıShouldBeSeeingTheMessageForLoginPage(String expectedValue) {
        loginPage
                .controlErrorMessage(expectedValue);
    }
}
