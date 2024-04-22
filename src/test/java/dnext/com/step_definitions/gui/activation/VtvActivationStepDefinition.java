package dnext.com.step_definitions.gui.activation;

import com.utilities.Utils;
import dnext.com.pages.BasePage;
import dnext.com.pages.activationPages.VtvActivationPage;
import dnext.com.pages.faveo.LoginOfFaveo;
import dnext.com.pages.faveo.TicketDetailsPageOfFaveo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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