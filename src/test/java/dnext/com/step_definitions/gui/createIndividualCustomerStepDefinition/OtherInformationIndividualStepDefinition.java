package dnext.com.step_definitions.gui.createIndividualCustomerStepDefinition;

import com.utilities.Utils;
import dnext.com.pages.BasePage;
import dnext.com.pages.createIndividualCustomer.OtherInformationIndividualPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import org.junit.Assert;

import java.util.Map;


@AllArgsConstructor
public class OtherInformationIndividualStepDefinition extends BasePage {
    OtherInformationIndividualPage otherInformationIndividualPage;

    @Given("User clicks the Other Information button for Individual")
    public void userClicksTheOtherInformationButton() {
        clickField(otherInformationIndividualPage.otherInformationButton);
    }


    @Given("User is on the Individual Other Information page")
    public void userIsOnTheIndividualOtherInformationPage() {
        otherInformationIndividualPage.verifyUserIsOnOtherInformationPage();
    }

    @When("User clicks Back button on Individual Other Information page")
    public void userClicksBackButtonOnIndividualOtherInformationPage() {
        clickField(otherInformationIndividualPage.backButtonOnOtherInformationPage);
    }


    @When("User selects the first checkbox about agreement on Individual Other Information Page")
    public void userSelectsTheFirstCheckboxAboutAgreement() {
        Utils.selectCheckBox(otherInformationIndividualPage.firstCheckboxAgreement);
    }

    @Then("User should see the first checkbox is selected on Individual Other Information Page")
    public void userShouldSeeTheFirstCheckboxIsSelected() {
        otherInformationIndividualPage
                .verifyCheckboxStatus(otherInformationIndividualPage.firstCheckboxAgreement, true);
    }

    @When("User selects the second checkbox about agreement on Individual Other Information Page")
    public void userSelectsTheSecondCheckboxAboutAgreement() {
        Utils.selectCheckBox(otherInformationIndividualPage.secondCheckboxAgreement);
    }

    @Then("User should see the second checkbox is selected on Individual Other Information Page")
    public void userShouldSeeTheSecondCheckboxIsSelected() {
        otherInformationIndividualPage
                .verifyCheckboxStatus(otherInformationIndividualPage.secondCheckboxAgreement, true);
    }

    @When("User selects the Message checkbox for prefer on Individual Other Information Page")
    public void userSelectsTheMessageCheckboxForPrefer() {
        Utils.selectCheckBox(otherInformationIndividualPage.messageCheckbox);
    }

    @Then("User should see the Message checkbox is selected on Individual Other Information Page")
    public void userShouldSeeTheMessageCheckboxIsSelected() {
        otherInformationIndividualPage
                .verifyCheckboxStatus(otherInformationIndividualPage.messageCheckbox, true);
    }

    @When("User selects the Telephone checkbox for prefer on Individual Other Information Page")
    public void userSelectsTheTelephoneCheckboxForPrefer() {
        Utils.selectCheckBox(otherInformationIndividualPage.telephoneCheckbox);
    }

    @Then("User should see the Telephone checkbox is selected on Individual Other Information Page")
    public void userShouldSeeTheTelephoneCheckboxIsSelected() {
        otherInformationIndividualPage
                .verifyCheckboxStatus(otherInformationIndividualPage.telephoneCheckbox, true);
    }

    @When("User selects the Email checkbox for prefer on Individual Other Information Page")
    public void userSelectsTheEmailCheckboxForPrefer() {
        Utils.selectCheckBox(otherInformationIndividualPage.emailCheckbox);
    }

    @Then("User should see the Email checkbox is selected on Individual Other Information Page")
    public void userShouldSeeTheEmailCheckboxIsSelected() {
        otherInformationIndividualPage
                .verifyCheckboxStatus(otherInformationIndividualPage.emailCheckbox, true);
    }

    @When("User selects the Post checkbox for prefer on Individual Other Information Page")
    public void userSelectsThePostCheckboxForPrefer() {
        Utils.selectCheckBox(otherInformationIndividualPage.postCheckbox);
    }

    @Then("User should see the Post checkbox is selected on Individual Other Information Page")
    public void userShouldSeeThePostCheckboxIsSelected() {
        otherInformationIndividualPage
                .verifyCheckboxStatus(otherInformationIndividualPage.postCheckbox, true);
    }

    @When("User selects the Facebook checkbox for prefer on Individual Other Information Page")
    public void userSelectsTheFacebookCheckboxForPrefer() {
        Utils.selectCheckBox(otherInformationIndividualPage.facebookCheckbox);
    }

    @Then("User should see the Facebook checkbox is selected on Individual Other Information Page")
    public void userShouldSeeTheFacebookCheckboxIsSelected() {
        otherInformationIndividualPage
                .verifyCheckboxStatus(otherInformationIndividualPage.facebookCheckbox, true);
    }

    @When("User selects the Jo-No checkbox on Individual Other Information Page")
    public void userSelectsTheJoNoCheckbox() {
        Utils.selectCheckBox(otherInformationIndividualPage.joNoCheckbox);
    }

    @Then("User should see the Jo-No checkbox is selected on Individual Other Information Page")
    public void userShouldSeeTheJoNoCheckboxIsSelected() {
        otherInformationIndividualPage
                .verifyCheckboxStatus(otherInformationIndividualPage.joNoCheckbox, true);
    }

    @Then("User should see the Po-Yes checkbox is not selected on Individual Other Information Page")
    public void userShouldSeeThePoYesCheckboxIsNotSelected() {
        otherInformationIndividualPage
                .verifyCheckboxStatus(otherInformationIndividualPage.poYesCheckbox, false);
    }

    @When("User selects the Po-Yes checkbox on Individual Other Information Page")
    public void userSelectsThePoYesCheckbox() {
        Utils.selectCheckBox(otherInformationIndividualPage.poYesCheckbox);
    }

    @Then("User should see the Po-Yes checkbox is selected on Individual Other Information Page")
    public void userShouldSeeThePoYesCheckboxIsSelected() {
        otherInformationIndividualPage
                .verifyCheckboxStatus(otherInformationIndividualPage.poYesCheckbox, true);
    }

    @Then("User should see the Jo-No checkbox is not selected on Individual Other Information Page")
    public void userShouldSeeTheJoNoCheckboxIsNotSelected() {
        Utils.waitFor(1);
        otherInformationIndividualPage
                .verifyCheckboxStatus(otherInformationIndividualPage.joNoCheckbox, false);
    }

    @When("User clicks the Generate Form button on Individual Other Information Page")
    public void userClicksTheGenerateFormButton() {
        clickField(otherInformationIndividualPage.generateFormButton);
    }

    @Then("User should see the Generate Form open in a new window on Individual Other Information Page")
    public void userShouldSeeTheGenerateFormOpenInANewWindow() {
        otherInformationIndividualPage.verifyGenerateFormInNewTab();
    }

    @When("User go back to Individual Other Information Page")
    public void userGoBackToIndividualOtherInformationPage() {
        otherInformationIndividualPage.switchToOtherInformationPage();
    }

    @And("User adds a valid {string} document for Consent Form on Individual Other Information Page")
    public void userAddsAValidDocumentForConsentForm(String fileName) {
        otherInformationIndividualPage.uploadConsentFormDocument(fileName);
    }

    @Then("User should see the name of {string} added pdf document on Individual Other Information Page")
    public void userShouldSeeTheNameOfAddedPdfDocument(String fileName) {
        otherInformationIndividualPage.verifyUploadedConsentFormDocument(fileName);
    }

    @Then("User should see the customer data is fetched to input fields on Individual Other Information Page")
    public void userShouldSeeTheCustomerDataIsFetchedToInputFieldsOnIndividualOtherInformationPage(Map<String, String> table) {
        Utils.waitFor(2);
        otherInformationIndividualPage.verifyFetchedPersonData(table);
    }
}