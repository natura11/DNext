package dnext.com.step_definitions.gui;

import dnext.com.pages.BasePage;
import io.cucumber.java.en.And;

public class CommonStepDefinitions extends BasePage {


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
}
