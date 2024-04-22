package dnext.com.step_definitions.gui.customer360StepDefinition;

import com.utilities.Utils;
import dnext.com.pages.BasePage;
import dnext.com.pages.createIndividualCustomerPages.AddressInformationIndividualPage;
import dnext.com.pages.createIndividualCustomerPages.ContactInformationIndividualPage;
import dnext.com.pages.createIndividualCustomerPages.InvoiceAccountIndividualPage;
import dnext.com.pages.customer360Pages.OrderPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import org.openqa.selenium.By;

import java.util.Map;

@AllArgsConstructor
public class OrderStepDefinition extends BasePage {
        OrderPage orderPage;

    @Then("User should see the {string} of the selected product on Customer360 Order page")
    public void userSeesTheOrderIdOfTheSelectedProductOnCustomerSearchPage(String columnName) {
        orderPage.veriyOrderIsCreatedOnOrderPage(columnName);
    }

    @Then("User should see the {string} as {string} on Customer360 Order page")
    public void userShouldSeeTheAsOnCustomerOrderPage(String columnName, String text) {
        orderPage.veriyOrderDataWithParameter(columnName, text);
    }

    @Then("User gets the error message if {string} is not {string}")
    public void userGetsTheErrorMessageIfIsNot(String columnName, String text) {
        orderPage.getErrorMessageIfAny(columnName, text);
    }
}