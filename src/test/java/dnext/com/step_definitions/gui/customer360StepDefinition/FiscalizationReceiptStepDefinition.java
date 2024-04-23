package dnext.com.step_definitions.gui.customer360StepDefinition;

import com.utilities.Utils;
import dnext.com.pages.BasePage;
import dnext.com.pages.customer360Pages.FiscalizationReceiptsPage;
import io.cucumber.java.en.And;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FiscalizationReceiptStepDefinition extends BasePage {
        FiscalizationReceiptsPage fiscalizationReceiptsPage;

    @And("User compares the AgreementId on Order with AgreementId on Fiscalization Receipts on Customer360 search page")
    public void userComparesTheAgreementIdOnOrderWithAgreementIdOnFiscalizationReceiptsOnCustomerSearchPage() {
        fiscalizationReceiptsPage.verificationOfFiscalizationWithOrder();
    }

    @And("User click the detail button on Fiscalization Receipt Page")
    public void userClickTheDetailButtonOnFiscalizationReceiptPage() {
        elementDisplayed(fiscalizationReceiptsPage.detailFirstButtonOnFiscalization);
        clickField(fiscalizationReceiptsPage.detailFirstButtonOnFiscalization);
    }
}