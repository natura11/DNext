package optiim.steps.gui.casemanagement;

import optiim.framework.UrlBuilder;
import optiim.framework.helpers.WebDriverHelper;
import optiim.pages.casemanagement.TicketRecordsPage;
import optiim.pages.customercasemanagement.TroubleTicketsPage;
import io.cucumber.java.en.When;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class TicketRecordsSteps {
    private final WebDriverHelper webDriverHelper;
    private final UrlBuilder urlBuilder;
    private final TicketRecordsPage ticketRecordsPage;

    @When("I click a ticket id")
    public void I_click_a_ticket_id() throws Throwable {

        ticketRecordsPage
                .clickTicketID();
    }

    @When("I should be seeing that the page navigate to DCase page and related ticket is displayed in DCase")
    public void I_should_be_seeing_that_the_page_navigate_to_DCase_page() throws Throwable {
        ticketRecordsPage
                .controlLoginPage();
    }

}
