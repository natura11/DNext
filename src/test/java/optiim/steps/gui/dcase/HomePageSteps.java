package optiim.steps.gui.dcase;

import optiim.framework.UrlBuilder;
import optiim.framework.helpers.WebDriverHelper;
import optiim.pages.dcase.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class HomePageSteps {
    private final WebDriverHelper webDriverHelper;
    private final UrlBuilder urlBuilder;
    private final HomePage homePage;


    @When("I logout")
    public void I_logout() throws Throwable {
        homePage
                .logout();
    }

    @Then("I should see home page")
    public void I_should_see_home_page() throws Throwable {
        homePage
                .homePageControl();
    }


    @When("I click {string} button for dcase menu")
    public void ıClickButtonForDcaseMenu(String buttonName) throws Throwable {
        homePage
                .clickMenuButton(buttonName);
    }
}
