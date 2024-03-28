package dnext.com.step_definitions.gui.createIndividualCustomerStepDefinition;

import dnext.com.pages.BasePage;
import dnext.com.pages.createIndividualCustomer.GeneralInformationNewIndividualCustomerPage;
import dnext.com.pages.createIndividualCustomer.SearchIndividualPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@AllArgsConstructor
public class SearchIndividualStepDefinition extends BasePage {
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

    @And("User clicks search button on Create Individual Customer page")
    public void userClicksSearchButtonOnCreateIndividualCustomerPage() {
        clickField(searchIndividualPage.searchBtnOnSearchIndividualHomePage);

    }

    @Then("User should see {string} on Create Individual Customer page")
    public void userShouldSeeOnCreateIndividualCustomerPage(String message) {
        warningMessage(message, searchIndividualPage.warningForExistingIdNumberOnSearchIndividualHomePage);
    }

    @And("User clicks next Button in Search Individual on Create Individual Customer page")
    public void userClicksNextButtonInSearchIndividualOnCreateIndividualCustomerPage() {
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

    @When("User clicks the Search Individual button for Individual")
    public void userClicksTheSearchIndividualButtonForIndividual() {
        clickField(searchIndividualPage.searchIndividualButton);
    }

    @Then("User is on the Individual Search Individual page")
    public void userIsOnTheIndividualSearchIndividualPage() {
        searchIndividualPage.verifyUserIsOnSearchIndividualPage();
    }
}

