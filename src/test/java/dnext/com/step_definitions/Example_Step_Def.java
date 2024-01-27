package dnext.com.step_definitions;

import dnext.com.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Example_Step_Def {

    @Given("user is on the google page")
    public void user_is_on_the_google_page() {
      Driver.getDriver().get("https://www.google.com/");

    }

    @When("user enters {string} into search button")
    public void userEntersIntoSearchButton(String item) {
        WebElement googlePage= Driver.getDriver().findElement(By.name("q"));
        googlePage.sendKeys(item);
    }
}
