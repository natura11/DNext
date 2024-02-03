package optiim.pages.dcase;

import optiim.framework.core.PageBase;
import optiim.framework.helpers.WebDriverHelper;
import optiim.framework.helpers.WorldHelper;
import optiim.framework.utils.log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.util.List;

public class UsersPage extends PageBase {
    public static final By btnCreateUser = By.cssSelector("[id='user_list'] [class*='add-user']");
    public static final By formUserCreate = By.id("user-form");
    public static final By txtFirstName = By.name("first_name");
    public static final By txtLastName = By.name("last_name");
    public static final By txtUsername = By.name("user_name");
    public static final By txtEmail = By.name("email");
    public static final By txtAddress = By.name("Address");
    public static final By btnSubmit = By.id("submitForm");
    public static final By tableRowListOfUsers = By.cssSelector("[id='datatable'] [class='VueTables__row ']");

    private final WorldHelper worldHelper;

    public UsersPage(WebDriverHelper webDriverHelper, WorldHelper worldHelper) {
        super(webDriverHelper);
        this.worldHelper = worldHelper;
    }

    public UsersPage createUser() throws MalformedURLException {
        click(btnCreateUser);
        log.info("Clicked create user button");
        return this;
    }

    public UsersPage controlUserCreateForm() throws MalformedURLException {
        control(isElementExist(formUserCreate), "User create form opened.", "ERROR: User create form does not open.");
        return this;
    }

    public UsersPage enterFirstName(String firstName) throws MalformedURLException, InterruptedException {
        sendKeys(txtFirstName, firstName, false);
        log.info(firstName + " entered in the First Name field.");
        return this;
    }

    public UsersPage enterLastName(String lastName) throws MalformedURLException, InterruptedException {
        sendKeys(txtLastName, lastName, false);
        log.info(lastName + " entered in the Last Name field.");
        return this;
    }

    public UsersPage enterUsername(String username) throws MalformedURLException, InterruptedException {
        sendKeys(txtUsername, username, false);
        log.info(username + " entered in the Username field.");
        return this;
    }

    public UsersPage enterEmail(String email) throws MalformedURLException, InterruptedException {
        sendKeys(txtEmail, email, false);
        log.info(email + " entered in the Email field.");
        return this;
    }

    public UsersPage enterAddress(String address) throws MalformedURLException, InterruptedException {
        sendKeys(txtAddress, address, false);
        log.info(address + " entered in the Email field.");
        return this;
    }

    public UsersPage submit() throws MalformedURLException, InterruptedException {
        click(btnSubmit);
        log.info("Clicked submit button");
        return this;
    }

    public UsersPage controlUserInTheListOfUsersTable(String username) throws MalformedURLException, InterruptedException {

        List<WebElement> elementList = findElements(tableRowListOfUsers);
        boolean status = false;
        for (int i = 0; i < elementList.size(); i++) {
            if (elementList.get(i).getText().contains(username)) {
                status = true;
                log.info("The user " + username + " exists in the list of users table");
                break;
            }
        }

        if(status==false){
            control(false, "The user exists in the list of users table.", "ERROR: The user doest not exists in the list of users table.");
        }

        return this;
    }


}
