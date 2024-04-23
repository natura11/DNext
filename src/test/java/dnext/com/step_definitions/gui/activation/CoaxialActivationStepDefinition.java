package dnext.com.step_definitions.gui.activation;

import dnext.com.pages.BasePage;
import dnext.com.pages.activationPages.CoaxialActivationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;


@Log4j2
@AllArgsConstructor
public class CoaxialActivationStepDefinition extends BasePage {
    CoaxialActivationPage coaxialActivationPage;


    @When("User enters random Coaxial Mac number to Smart Card field on Product Offering Page")
    public void userEntersRandomCoaxialMacNumberToSmartCardFieldOnProductOfferingPage() {
        coaxialActivationPage.numbersCreationForMacAdreess();
    }

    @And("User checks the  Coaxial Mac Number is available for Sale on Product Offering Page")
    public void userChecksTheCoaxialMacNumberIsAvailableForSaleOnProductOfferingPage() {
        coaxialActivationPage.checkCoaxialMacNumberIsAvailableOrNot();
    }
}
