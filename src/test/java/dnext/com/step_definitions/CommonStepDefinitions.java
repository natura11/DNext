package dnext.com.step_definitions;

import dnext.com.pages.HomePage;
import io.cucumber.java.en.And;

public class CommonStepDefinitions {

    private HomePage homePage;
    public CommonStepDefinitions() {
        this.homePage = new HomePage();
    }

    @And("I refresh the page")
    public void iRefreshThePage() {
        homePage.refreshPage();
    }
}
