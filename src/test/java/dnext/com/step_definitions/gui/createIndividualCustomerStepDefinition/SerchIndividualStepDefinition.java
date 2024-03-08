package dnext.com.step_definitions.gui.createIndividualCustomerStepDefinition;

import com.utilities.Utils;
import dnext.com.pages.BasePage;
import dnext.com.pages.createIndividualCustomer.GeneralInformationNewIndividualCustomerPage;
import dnext.com.pages.createIndividualCustomer.SearchIndividualPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SerchIndividualStepDefinition extends BasePage {
    SearchIndividualPage searchIndividualPage;
    GeneralInformationNewIndividualCustomerPage generalInformationNewIndividualCustomerPage;

    @Given("User clicks Create Individual Customer on Home page")
    public void user_opens_create_ındividual_customer_on_home_page() {
        clickField(searchIndividualPage.createIndividualCustomerBtnOnHomePage);

    }

    @Given("User should see the {string} header on screen on Create Individual Customer page")
    public void user_should_see_the_header_on_screen_on_create_ındividual_customer_page(String string) {
        searchIndividualPage.verificationNewIndividualCustomerHeader(string);

    }

    @Given("User enters {string} existing identification ID in to identification number field on Create Individual Customer page")
    public void userEntersIdentificationIDInToIdentificationNumberFieldOnCreateIndividualCustomerPage(String idNumber) {
        sendKeys(searchIndividualPage.identificationNumberBtnOnSearchIndividualHomePage, idNumber);

    }

    @And("User clicks search button on Create Individual Customer page on Create Individual Customer page")
    public void userClicksSearchButtonOnCreateIndividualCustomerPageOnCreateIndividualCustomerPage() {
        clickField(searchIndividualPage.searchBtnOnSearchIndividualHomePage);

    }

    @Then("User should see {string} on Create Individual Customer page")
    public void userShouldSeeOnCreateIndividualCustomerPage(String message) {
        warningMessage(message, searchIndividualPage.warningForExistingIdNumberOnSearchIndividualHomePage);
    }

    @And("User clicks next Button on on Create Individual Customer page")
    public void userClicksNextButtonOnOnCreateIndividualCustomerPage() {
        clickField(searchIndividualPage.nextBtnOnSearchIndividualHomePage);
    }


    @And("User clicks Citizenship dropdown on Create Individual Customer page")
    public void userClicksCitizenshipDropdownOnCreateIndividualCustomerPage() {
        clickField(generalInformationNewIndividualCustomerPage.citizenShipFieldOnNewIndividualCustomer);

    }

    @And("User selects ALBANIAN citizenship from dropdown on Create Individual Customer page")
    public void userSelectsALBANIANCitizenshipFromDropdownOnCreateIndividualCustomerPage() {
        clickField(generalInformationNewIndividualCustomerPage.albanianOptionOnNewIndividualCustomer);

    }

    @Given("User enters {string} identification ID for ALBANIAN to the identification number field on Create Individual Customer page")
    public void userEntersIdentificationIDForALBANIANToTheIdentificationNumberFieldOnCreateIndividualCustomerPage(String number) {
        sendKeys(searchIndividualPage.identificationNumberBtnOnSearchIndividualHomePage, number);
    }

    @Then("User should see background is not red on Create Individual Customer page")
    public void userShouldSeeBackgroundIsNotRedOnCreateIndividualCustomerPage() {
        generalInformationNewIndividualCustomerPage.warningBackgroundIsNotRedColor();

    }
}

