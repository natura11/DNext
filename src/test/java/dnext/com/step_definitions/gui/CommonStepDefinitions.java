package dnext.com.step_definitions.gui;

import dnext.com.pages.BasePage;
import dnext.com.pages.CreateCustomerCommonPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CommonStepDefinitions extends BasePage {

    CreateCustomerCommonPage createCustomerCommonPage;


    public CommonStepDefinitions() {

    }

    @And("I navigate the page: {string}")
    public void iNavigateThePage(String className) throws ClassNotFoundException {
        openPage(Class.forName(className.replace(" ", "")));
    }

    @And("I refresh the page")
    public void iRefreshThePage() {
        refreshPage();
    }

    @Then("User should see the {string} tab is opened")
    public void userShouldSeeTheTabIsActive(String header) {
        createCustomerCommonPage.verifyInCorrectTab(header);
    }
}
