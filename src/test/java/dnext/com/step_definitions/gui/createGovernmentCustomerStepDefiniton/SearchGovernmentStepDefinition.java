package dnext.com.step_definitions.gui.createGovernmentCustomerStepDefiniton;

import com.utilities.Utils;
import dnext.com.pages.BasePage;
import dnext.com.pages.createGovernmentCustomerPages.SearchGovernmentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@AllArgsConstructor
@Log4j2
public class SearchGovernmentStepDefinition extends BasePage {
    SearchGovernmentPage searchGovernmentPage;


    @Given("User opens Create Government Customer page on Home page")
    public void userOpensCreateGovernmentCustomerPageOnHomePage() {
        Utils.click(createGovernmentCustomerBtn);
    }

    @And("User checks the NIPT is usable or not on Search Government page")
    public void userChecksTheNIPTIsUsableOrNotOnSearchGovernmentPage() {
        searchGovernmentPage.checkNIPTIsAvailableOrNot();
    }
}