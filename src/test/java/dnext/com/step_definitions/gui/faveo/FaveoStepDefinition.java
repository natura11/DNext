package dnext.com.step_definitions.gui.faveo;

import com.utilities.Utils;
import dnext.com.pages.BasePage;
import dnext.com.pages.faveo.LoginOfFaveo;
import dnext.com.pages.faveo.TicketDetailsPageOfFaveo;
import io.cucumber.java.en.And;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@AllArgsConstructor
@Log4j2
public class FaveoStepDefinition extends BasePage{

    LoginOfFaveo loginOfFaveo;
    TicketDetailsPageOfFaveo ticketDetailsPageOfFaveo;
    @And("User enters {string} as Username, {string} as password  and clicks the login button on FAVEO login page")
    public void userEntersAsUsernameAsPasswordAndClicksTheLoginButtonOnFAVEOLoginPage(String username, String password) throws InterruptedException {
        Utils.waitFor(2);
        loginOfFaveo.login(username, password);
    }

    @And("User clicks the Change Status button on FAVEO page")
    public void userClicksTheChangeStatusButtonOnFAVEOPage() {
        elementDisplayed(ticketDetailsPageOfFaveo.changeStatusBtnOnFaveoPage);
        Utils.clickWithJS(ticketDetailsPageOfFaveo.changeStatusBtnOnFaveoPage);
    }

    @And("User clicks the resolve option from the opened dropdown FAVEO  page")
    public void userClicksTheResolveOptionFromTheOpenedDropdownFAVEOPage() {
        clickField(ticketDetailsPageOfFaveo.changeStatusWithResolvedBtnOnFaveoPage);
    }

    @And("User clicks the Proceed button FAVEO  page")
    public void userClicksTheProceedButtonFAVEOPage() {
        clickField(ticketDetailsPageOfFaveo.proceedBtnOnFaveoPage);
    }

    @And("User should see {string} warning on FAVEO page")
    public void userShouldSeeWarningOnFAVEOPage(String warning) {
        warningMessage(warning, ticketDetailsPageOfFaveo.ticketStatusChangedSuccessfullyMessage);
    }

    @And("User turns back to Customer Management page on Customer360 search page")
    public void userTurnsBackToCustomerManagementPageOnCustomerSearchPage() {
        ticketDetailsPageOfFaveo.turningBackToCustomerManagementPage();
    }
}



