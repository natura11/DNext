package dnext.com.step_definitions.gui.activation;

import com.utilities.Utils;
import dnext.com.pages.BasePage;
import dnext.com.pages.activationPages.CryptoguardActivationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@AllArgsConstructor
public class CryptoguardActivationStepDefinition extends BasePage {
    CryptoguardActivationPage cryptoguardActivationPage;


    @When("User enters random Cryptoguard number to Smart Card field on Product Offering Page")
    public void userEntersRandomCryptoguardNumberToSmartCardFieldOnProductOfferingPage() {
        cryptoguardActivationPage.cryptoguardNumbersCreationForSerialNumbers();
    }

    @And("User checks the Cryptoguard Number is available for Sale on Product Offering Page")
    public void userChecksTheCryptoguardNumberIsAvailableForSaleOnProductOfferingPage() {
        cryptoguardActivationPage.checkCryptoguardNumberIsAvailableOrNot();
    }
}
