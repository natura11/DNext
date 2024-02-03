package optiim.steps.gui.productcatalog;

import optiim.framework.Props;
import optiim.framework.UrlBuilder;
import optiim.framework.helpers.WebDriverHelper;
import optiim.pages.productcatalog.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
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

    @Given("I should able open the Product Catalog application")
    public void I_should_able_open_the_Product_Catalog_application() throws Throwable {
        Props props = new Props();
        webDriverHelper.getDriver().navigate().to(props.getProp("productcatalog.site.url"));
    }

    @And("I enter an username {string} in the user name field")
    public void I_enter_an_username_in_the_user_name_field(String username) throws MalformedURLException, InterruptedException {
        loginPage
                .enterUsername(username);
    }

    @And("I enter a password {string} in the password field")
    public void I_enter_a_password_in_the_password_field(String password) throws MalformedURLException, InterruptedException {
        loginPage
                .enterPassword(password);
    }

    @When("I click the login button")
    public void I_click_the_login_button() throws Throwable {
        loginPage
                .clickLogin();
    }

    @Then("I should be seeing have successfully logged in to the Product Catalog")
    public void I_should_be_seeing_have_successfully_logged_in_to_the_product_catalog() throws Throwable {
        loginPage
                .controlLogin();
    }


    @When("I login to the Product Catalaog")
    public void I_login_to_the_Product_Catalaog() throws Throwable {
        Props props = new Props();

        loginPage
                .enterUsername(props.getProp("productcatalog.loginusername"))
                .enterPassword(props.getProp("productcatalog.loginpassword"))
                .clickLogin();
    }

}
