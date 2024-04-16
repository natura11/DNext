package dnext.com.step_definitions.gui.createIndividualCustomerStepDefinition;

import com.utilities.Utils;
import dnext.com.pages.BasePage;
import dnext.com.pages.createIndividualCustomerPages.GeneralInformationIndividualPage;
import dnext.com.pages.createIndividualCustomerPages.SearchIndividualPage;
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
    GeneralInformationIndividualPage generalInformationIndividualPage;

    @Given("User clicks Create Individual Customer on Home page")
    public void user_opens_create_ındividual_customer_on_home_page() {
        Utils.waitFor(3);
        elementDisplayed(searchIndividualPage.createIndividualCustomerBtnOnHomePage);
        clickField(searchIndividualPage.createIndividualCustomerBtnOnHomePage);

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
        clickField(generalInformationIndividualPage.citizenShipField);

    }

    @And("User selects ALBANIAN citizenship from dropdown on Create Individual Customer page")
    public void userSelectsALBANIANCitizenshipFromDropdownOnCreateIndividualCustomerPage() {
        clickField(generalInformationIndividualPage.albanianOptionForCitizenship);

    }

    @Given("User enters {string} identification ID for ALBANIAN to the identification number field on Create Individual Customer page")
    public void userEntersIdentificationIDForALBANIANToTheIdentificationNumberFieldOnCreateIndividualCustomerPage(String number) {
        sendKeys(searchIndividualPage.identificationNumberBtnOnSearchIndividualHomePage, number);
    }

    @Then("User should see background is not red on Create Individual Customer page")
    public void userShouldSeeBackgroundIsNotRedOnCreateIndividualCustomerPage() {
        warningBackgroundRedColorOne(generalInformationIndividualPage.firstNamePicture, false);
    }

    @When("User clicks the Search Individual button for Individual")
    public void userClicksTheSearchIndividualButtonForIndividual() {
        clickField(searchIndividualPage.searchIndividualButton);
    }

    @Then("User is on the Individual Search Individual page")
    public void userIsOnTheIndividualSearchIndividualPage() {
        searchIndividualPage.verifyUserIsOnSearchIndividualPage();
    }

    @When("User enters random identification ID for ALBANIAN to the identification number field on Search Individual page")
    public void userEntersRandomIdentificationIDForALBANIANToTheIdentificationNumberField() {
        searchIndividualPage.fillIDFieldWithRandomNumber();
    }

    @And("User checks the identification ID is already exists or not on Search Individual page")
    public void userChecksTheIdentificationIDIsAlreadyExistsOrNot() {
        searchIndividualPage.checkNumberIsExistsOrNot();
    }

    @Then("User should see the random identification ID is new for ALBANIAN on Search Individual page")
    public void userShouldSeeTheRandomIdentificationIDIsNewForALBANIAN() {
        searchIndividualPage.verifyCustomerIsNew();
    }
}

