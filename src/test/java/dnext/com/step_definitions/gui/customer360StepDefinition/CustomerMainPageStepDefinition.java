package dnext.com.step_definitions.gui.customer360StepDefinition;

import com.utilities.Utils;
import dnext.com.pages.BasePage;
import dnext.com.pages.customer360Pages.CustomerMainPage;
import dnext.com.pages.customer360Pages.OrderPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lombok.AllArgsConstructor;
import org.openqa.selenium.By;

@AllArgsConstructor
public class CustomerMainPageStepDefinition extends BasePage {

    CustomerMainPage customerMainPage;

    @And("User clicks Load Tickets button on Customer360 search page")
    public void userClicksLoadTicketsButtonOnCustomerSearchPage() {
        clickField(customerMainPage.loadTicketsOnTroubleTickets);
        Utils.waitForVisibility(By.xpath("//tbody//tr"), 5);
    }

    @And("User cliks three dots right of opened block on Customer360 search page")
    public void userCliksThreeDotsRightOfOpenedBlockOnCustomerSearchPage() {
        clickField(customerMainPage.threeDotsIconNearOpenTicket);
    }

    @And("User clicks Dnext option from the opened dropdown on Customer360 search page")
    public void userClicksDnextOptionFromTheOpenedDropdownOnCustomerSearchPage() {
        customerMainPage.switchToFaveoFromDnext();
    }
}