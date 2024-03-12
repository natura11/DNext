package dnext.com.step_definitions.gui.createBusinessCustomerStepDefinition;

import dnext.com.pages.BasePage;
import dnext.com.pages.createBusinnesCustomerPages.ContactInformationPage;
import io.cucumber.java.en.And;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@AllArgsConstructor
@Log4j2
public class ContactInformationStepDefinition extends BasePage {
    private ContactInformationPage contactInformationPage;
    @And("User clicks next Button on Contact Information Page")
    public void userClicksTheNextButtonOnContactInformationPage() {
        contactInformationPage.nextBtnClickContactInformation();
    }
}