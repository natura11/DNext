package optiim.steps.gui.customermanagement;

import optiim.framework.UrlBuilder;
import optiim.framework.helpers.WebDriverHelper;
import optiim.pages.customermanagement.CustomersPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class CustomersSteps {

    private final WebDriverHelper webDriverHelper;
    private final UrlBuilder urlBuilder;
    private final CustomersPage customersPage;

    @Then("I should be seeing the popup alert message {string}")
    public void I_should_be_seeing_the_popup_alert_message(String alertMessage) throws Throwable {
        customersPage
                .controlCustomerRecords(alertMessage);
    }

    @Then("I should be seeing that the {string} title for Customers Page")
    public void ıShouldBeSeeingThatTheTitleForCustomersPage(String titlePageName) {
        customersPage
                .controlCustomerPageTitle(titlePageName);
    }

    @When("I select a customer from customer list")
    public void ıSelectACustomerFromCustomerList() throws Throwable {
        customersPage
                .clickCustomerName();
    }


}
