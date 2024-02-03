package optiim.steps.gui.customercasemanagement;

import optiim.framework.UrlBuilder;
import optiim.framework.helpers.WebDriverHelper;
import optiim.pages.customercasemanagement.ExtendedWidgetPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;


@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class ExtendedWidgetSteps {

    private final WebDriverHelper webDriverHelper;
    private final UrlBuilder urlBuilder;
    private final ExtendedWidgetPage extendedWidgetPage;

    @When("I click move vert icon for Extended Widget Page")
    public void I_click_move_vert_icon_for_Extended_Widget_Page() throws Throwable {
        extendedWidgetPage
                .clickMoveVertIcon();
    }

    @And("I click details button for Extended Widget Page")
    public void ıClickDetailsButtonForExtendedWidgetPage() throws Throwable {
        extendedWidgetPage
                .clickDetails();
    }

    @When("I click Create New button for Extended Widget Page")
    public void ıClickCreateNewButtonForExtendedWidgetPage() throws Throwable {
        extendedWidgetPage
                .clickAddNewTicketButton();
    }

    @And("I should be seeing that Extended Widget window is opened")
    public void ıShouldBeSeeingThatExtendedWidgetWindowIsOpened() {
        extendedWidgetPage
                .controlPageAddressLink();
    }

    @Then("I should be seeing that detail popup window is closed and Extended Trouble Ticket List is displayed")
    public void ıShouldBeSeeingThatDetailPopupWindowIsClosedAndExtendedTroubleTicketListIsDisplayed() throws Throwable {
        extendedWidgetPage
                .controlDetailPopup();
    }
}