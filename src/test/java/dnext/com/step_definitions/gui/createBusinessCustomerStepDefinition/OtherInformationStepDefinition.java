package dnext.com.step_definitions.gui.createBusinessCustomerStepDefinition;

import com.utilities.Utils;
import dnext.com.pages.BasePage;
import dnext.com.pages.createBusinnesCustomerPages.GeneralInformationPage;
import dnext.com.pages.createBusinnesCustomerPages.OtherInformationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@AllArgsConstructor
@Log4j2
public class OtherInformationStepDefinition extends BasePage {

    private OtherInformationPage otherInformationPage;
    @And("User clicks the Next button on general information page")
    public void userClicksTheNextButtonOnGeneralInformationPage() {
        otherInformationPage.nextBtnClickGeneralInformation();
    }
}