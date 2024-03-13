package dnext.com.step_definitions.gui.createBusinessCustomerStepDefinition;

import dnext.com.pages.BasePage;
import dnext.com.pages.createBusinnesCustomerPages.AddressInformationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@AllArgsConstructor
@Log4j2
public class AddressInformationStepDefinition extends BasePage {
    private AddressInformationPage addressInformationPage;

    @Given("User clicks the Address Information button")
    public void userClicksTheAddressInformationButton() {
        addressInformationPage.clickAddressInformationIcon();
    }


    @Given("User is on the Address Information page")
    public void userIsOnTheAddressInformationPage() {
        addressInformationPage.verifyUserIsOnAddressInformationPage();
    }

    @Given("User should see the Address Line 1 textbox on Address Information Page")
    public void userShouldSeeTheAddressLineTextbox() {
        addressInformationPage.billingAddressLineOneDisplayed();
    }

    @And("User clicks Address Line 1 Field on Address Information Page")
    public void userClicksAddressLineField() {
        clickField(addressInformationPage.billingAddressLineOneInput);
    }

    @Then("User enters a value {string} in the Address Line 1 textbox on Address Information Page")
    public void userEntersAValueInTheAddressLineTextbox(String address) {
        addressInformationPage.fillBillingAddressLineOneField(address);
    }

    @And("User clears Address Line 1 Field on Address Information Page")
    public void userClearsAddressLineField() {
        addressInformationPage.billingAddressLineOneInput.clear();
    }

    @Then("User sees the Address Line 1 is required on Address Information Page")
    public void userSeesTheAddressLineIsRequired() {
    }
}