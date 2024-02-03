package optiim.steps.gui.dcase;

import optiim.framework.UrlBuilder;
import optiim.framework.helpers.WebDriverHelper;
import optiim.pages.dcase.UsersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class UsersPageSteps {
    private final WebDriverHelper webDriverHelper;
    private final UrlBuilder urlBuilder;
    private final UsersPage usersPage;

    @When("I press create user button")
    public void I_press_create_user_button() throws Throwable {

        usersPage
                .createUser();
    }

    @Then("I should be seeing user create form")
    public void I_should_be_seeing_user_create_form() throws Throwable {

        usersPage
                .controlUserCreateForm();
    }

    @When("I enter a first name {string} in the first name field")
    public void I_enter_a_first_name_in_the_first_name_field(String firstName) throws Throwable {

        usersPage
                .enterFirstName(firstName);
    }

    @And("I enter a last name {string} in the last name field")
    public void I_enter_a_last_name_in_the_last_name_field(String lastName) throws Throwable {

        usersPage
                .enterLastName(lastName);
    }

    @And("I enter an username {string} in the username field")
    public void I_enter_an_username_in_the_username_field(String username) throws Throwable {

        usersPage
                .enterUsername(username);
    }

    @And("I enter an email {string} in the email field")
    public void I_enter_an_email_in_the_email_field(String email) throws Throwable {

        usersPage
                .enterEmail(email);
    }

    @And("I enter an address {string} in the address field")
    public void I_enter_an_address_in_the_address_field(String address) throws Throwable {

        usersPage
                .enterAddress(address);
    }

    @And("I press submit button")
    public void I_press_submit_button() throws Throwable {

        usersPage
                .submit();
    }

    @And("I should be seeing the user created in the list of users table")
    public void I_should_be_seeing_the_user_created_in_the_list_of_users_table() throws Throwable {

        usersPage
                .controlUserInTheListOfUsersTable("sezaicelik");
    }


}
