package dnext.com.step_definitions.gui;

import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import dnext.com.pages.BasePage;
import dnext.com.pages.SignInPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class SignInStepDefinition extends BasePage {
    private SignInPage signInPage;

    @Given("I have opened the {string} application")
    public void i_have_opened_the_application(String string) {
        Driver.getDriver().get(ConfigurationReader.getProperty("dnext.url"));
    }
    @When("I enter a value {string} in the Username or email field on Sign In page")
    public void i_enter_a_value_in_the_username_or_email_field_on_sign_in_page(String username) {
        signInPage.fillUserNameInput(username);
    }
    @When("I enter a value {string} in the Password field on Sign In page")
    public void i_enter_a_value_in_the_password_field_on_sign_in_page(String password) {
        signInPage.fillPasswordInput(password);
    }
    @When("I click the Sign in button on Sign In page")
    public void i_click_the_sign_in_button_on_sign_in_page() {
        signInPage.signInBtn();
    }
    @Then("I should be seeing that the {string} is shown on opened home page")
    public void i_should_be_seeing_that_the_is_shown_on_opened_home_page(String email) {
        isShownEmailOfUserOnHomePage();
    }
    @When("I have log out into the system on the home page.")
    public void i_have_log_out_into_the_system_on_the_home_page() {
        logout();
    }
    @Then("I should be seeing that the {string} header on Sign In page")
    public void i_should_be_seeing_that_the_header_on_sign_in_page(String title) {
        signInPage.titleVerificationOnSignIn(title);
    }
    @Then("I should be seeing the message {string} on Sign In page")
    public void iShouldBeSeeingTheMessageOnSignInPage(String warningMessage) {
        signInPage.warningMessageAssertionOnSignIn(warningMessage);
    }





}
