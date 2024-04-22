package dnext.com.step_definitions.gui.activation;

import com.utilities.Driver;
import com.utilities.Utils;
import dnext.com.pages.BasePage;
import dnext.com.pages.backofficePage.BackofficeHomePage;
import dnext.com.pages.activationPages.FiberActivationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@AllArgsConstructor
public class FiberActivationStepDefinition extends BasePage {
    FiberActivationPage fiberActivationPage;


    @When("User enters random Fiber Postpaid number to Smart Card field on Product Offering Page")
    public void userEntersRandomFiberPostpaidNumberToSmartCardFieldOnProductOfferingPage() {
        fiberActivationPage.fillFiberPostpaidCardNumber();
    }

    @And("User checks the Fiber Number is available for Sale on Product Offering Page")
    public void userChecksTheFiberNumberIsAvailableForSaleOnProductOfferingPage() {
        fiberActivationPage.checkFiberPostpaidNumberIsAvailableOrNot();
    }


    @When("User enters random Fiber Prepaid number to Smart Card field on Product Offering Page")
    public void userEntersRandomFiberPrepaidNumberToSmartCardFieldOnProductOfferingPage() {
        fiberActivationPage.fillFiberPrepaidCardNumber();
    }
}

