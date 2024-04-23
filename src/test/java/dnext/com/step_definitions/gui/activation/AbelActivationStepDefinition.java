package dnext.com.step_definitions.gui.activation;

import com.utilities.Utils;
import dnext.com.pages.BasePage;
import dnext.com.pages.activationPages.AbelActivationPage;
import dnext.com.pages.activationPages.VtvActivationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@AllArgsConstructor
public class AbelActivationStepDefinition extends BasePage {
    AbelActivationPage abelActivationPage;


    @When("User enters random Abel number to Smart Card field on Product Offering Page")
    public void userEntersRandomAbelNumberToSmartCardFieldOnProductOfferingPage() {
        abelActivationPage.fillAbelSmartCardNumber();
    }


    @And("User checks the Abel Number is available for Sale on Product Offering Page")
    public void userChecksTheAbelNumberIsAvailableForSaleOnProductOfferingPage() {
        abelActivationPage.checkAbelNumberIsAvailableOrNot();
    }


}
