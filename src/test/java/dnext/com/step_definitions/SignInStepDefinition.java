package dnext.com.step_definitions;

import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import com.utilities.Utils;
import dnext.com.pages.HomePage;
import dnext.com.pages.SignInPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SignInStepDefinition {
   SignInPage signInPage=new SignInPage();
   HomePage homePage=new HomePage();


   @Given("I have opened the {string} application")
    public void i_have_opened_the_application(String string) {
        Driver.getDriver().get(ConfigurationReader.getProperty("dnext.url"));
    }

   @When("I enter a value {string} in the Username or email field")
   public void i_enter_a_value_in_the_username_or_email_field(String username) {
    signInPage.usernameField.sendKeys(username);
   }
   @When("I enter a value {string} in the Password field")
   public void i_enter_a_value_in_the_password_field(String password) {

       signInPage.passwordField.sendKeys(password);
   }
   @When("I click the Sign in button for Sign in  Page")
   public void i_click_the_sign_in_button_for_sign_in_page() {
       signInPage.signInBtn.click();
   }
   @Then("I should be seeing that the {string} is shown on opened page")
   public void iShouldBeSeeingThatTheIsShownOnOpenedPage(String searchSign) {
       homePage.searchSignBtn.isDisplayed();
   }
   @When("I have log out into the system.")
   public void i_have_log_out_into_the_system() {
       Utils.wait(3);
       homePage.profileSignBtn.click();
       homePage.logoutBtn.click();
   }
   @Then("I should be seeing that the {string} page is opened for Login Page")
   public void i_should_be_seeing_that_the_page_is_opened_for_login_page(String title) {
    String actualTitle=signInPage.pageTitleOfLoginPage.getText();
    System.out.println("actualTitle = " + actualTitle);
    String expectedTitle="Sign in to your account";
    Assert.assertEquals(expectedTitle,actualTitle);
 }
    @When("I enter an item {string} in the UserName field")
    public void iEnterAnItemInTheUserNameField(String invalidUsername) {
        signInPage.usernameField.sendKeys(invalidUsername);
    }

    @Then("I should be seeing the message {string} for Login Page")
    public void i_should_be_seeing_the_message_for_login_page(String invalidPassword) {
        signInPage.passwordField.sendKeys(invalidPassword);
    }

    @Then("I should be seeing the message {string} for Sign in Page")
    public void iShouldBeSeeingTheMessageForSignInPage(String arg0) {
        System.out.println("signInPage.invalidUsernameOrPasswordWarning.isDisplayed() = "
                + signInPage.invalidUsernameOrPasswordWarning.isDisplayed());
    }


}
