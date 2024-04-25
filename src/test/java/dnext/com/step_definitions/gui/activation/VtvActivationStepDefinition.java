package dnext.com.step_definitions.gui.activation;

import dnext.com.pages.BasePage;
import dnext.com.pages.activationPages.VtvActivationPage;
import io.cucumber.java.en.And;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@AllArgsConstructor
@Log4j2
public class VtvActivationStepDefinition extends BasePage {
    VtvActivationPage vtvActivationPage;

    @And("User enters CasId on Product Detail page")
    public void userEntersCasIdOnCustomerSearchPage() {
        vtvActivationPage.casIdFromFaker();
    }


    @And("User checks the Vtv Number is available for Sale on Product Offering Page")
    public void userChecksTheVtvNumberIsAvailableForSaleOnProductOfferingPage() {
        vtvActivationPage.checkVtvNumberIsAvailableOrNot();
    }


}