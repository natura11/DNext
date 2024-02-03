package optiim.steps.gui.dcase;

import optiim.framework.UrlBuilder;
import optiim.framework.helpers.WebDriverHelper;
import optiim.pages.dcase.TicketPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class TicketPageSteps {
    private final WebDriverHelper webDriverHelper;
    private final UrlBuilder urlBuilder;
    private final TicketPage ticketPage;


    @When("I enter the {string} in the filter search bar")
    public void I_enter_the_in_the_filter_search_bar(String searchName) throws Throwable {
        ticketPage
                .enterFilterSearch(searchName);
    }

    @Then("I should be seeing that Ticket that I created previously is displayed")
    public void ıShouldBeSeeingThatTicketThatICreatedPreviouslyIsDisplayed() {
        ticketPage
                .controlTicket();
    }

    @And("I should be seeing that Customer Name and Ticket Description are displayed")
    public void ıShouldBeSeeingThatCustomerNameAndTicketDescriptionAreDisplayed() {
        ticketPage
                .controlCustomerNameAndTicketDescription();
    }

    @When("I click on one of the Ticket")
    public void ıClickOnOneOfTheTicket() throws Throwable {
        ticketPage
                .clickOneTicket();
    }

    @Then("I should be seeing that the {string} page for Dcase application")
    public void ıShouldBeSeeingThatThePageForDcaseApplication(String titleName) throws Throwable {
        ticketPage
                .controlTitle(titleName);
    }

    @When("I click {string} button for Ticket details")
    public void ıClickButtonForTicketDetails(String buttonName) throws Throwable {
        ticketPage
                .clickTicketDetailsButton(buttonName);
    }

    @When("I enter a value {string} in the Due Date Field")
    public void ıEnterAValueInTheDueDateField(String dueDate) throws Throwable {
        ticketPage
                .enterDueDate(dueDate);
    }

    @When("I enter a value {string} in the Department Field")
    public void ıEnterAValueInTheDepartmentField(String department) throws Throwable {
        ticketPage
                .enterDepartment(department);
    }

    @Then("I should be seeing that the DNextContextUrl field is Link")
    public void ıShouldBeSeeingThatTheDNextContextUrlFieldIsLink() {
        ticketPage
                .controlDNextContextUrl();
    }

    @When("I click the DNextContextUrl field")
    public void ıClickTheDNextContextUrlField() throws Throwable {
        ticketPage
                .clickDNextContextUrl();
    }
}
