package dnext.com.step_definitions.gui.backOffice;

import com.utilities.Driver;
import com.utilities.Utils;
import dnext.com.pages.BasePage;
import dnext.com.pages.backofficePage.BackofficeHomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WindowType;

@Log4j2
@AllArgsConstructor
public class BackOfficeStepDefinition extends BasePage {
    BackofficeHomePage backofficeHomePage;

    @And("User switches to Backoffice page")
    public void userSwitchesToBackofficePage() {
        backofficeHomePage.openingBackOfficeInNewTab();
    }

    @And("User should see the name of {string} progressed customer on BackOffice page")
    public void userShouldSeeTheNameOfProgressedCustomerOnBackOfficePage(String customerName) {
        backofficeHomePage.verifyTheNameOfCustomer(customerName);
    }

    @And("User clicks the name of {string} customer on BackOffice page")
    public void userClicksTheNameOfCustomerOnBackOfficePage(String customerName) {
        backofficeHomePage.clickTheNameOfCustomer(customerName);
    }

    @And("User clicks the three dots on opened page  on Backoffice page")
    public void userClicksTheThreeDotsOnOpenedPageOnBackofficePage() {
        clickField(backofficeHomePage.threeDotsOnOpenedPageAfterClickingNameOfCustomer);
    }

    @And("User clicks the ClaimEdit button on opened segment on BackOffice page")
    public void userClicksTheClaimEditButtonOnOpenedSegmentOnBackOfficePage() {
        backofficeHomePage.claimEditButtonUsage();
    }

    @And("User should see the {string} text on BackOffice page")
    public void userShouldSeeTheTextOnBackOfficePage(String text) {
        backofficeHomePage.assertionOfBackOfficePage(text);
    }

    @And("User clicks the isApprovved dropdown button on BackOffice page")
    public void userClicksTheIsApprovvedDropdaownButtonOnBackOfficePage() {
        Utils.clickWithJS(backofficeHomePage.isApprovedDropdownButtonOnCorporateConfirmationPage);
    }

    @And("User clicks the {string} option from dropdown on BackOffice page")
    public void userClicksTheOptionFromDropdownOnBackOfficePage(String option) {
        backofficeHomePage.selectApproveOption(option);
    }

    @And("User clicks the Complete Task button on the right button of the on BackOffice page")
    public void userClicksTheCompleteTaskButtonOnTheRightButtonOfTheOnBackOfficePage() {
        clickField(backofficeHomePage.completeTaskButtonOnCorporateConfirmationPage);
    }

    @Then("User should see {string} pop up message  on BackOffice page")
    public void userShouldSeePopUpMessageOnBackOfficePage(String messageOnScreen) {
        warningMessage(messageOnScreen, backofficeHomePage.taskCompletedPopUpMessageOnCorporateConfirmationPage);
    }

    @And("User turns back to Customer Management after task completion on BackOffice page")
    public void userTurnsBackToCustomerManagementAfterTaskCompletionOnBackOfficePage() {
        backofficeHomePage.turningBackToCustomerManagementPage();
    }
}

