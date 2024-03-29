package dnext.com.step_definitions.gui.createIndividualCustomerStepDefinition;

import com.utilities.Utils;
import dnext.com.pages.BasePage;
import dnext.com.pages.createIndividualCustomer.AddressInformationIndividualPage;
import dnext.com.pages.createIndividualCustomer.ContactInformationIndividualPage;
import dnext.com.pages.createIndividualCustomer.GeneralInformationNewIndividualCustomerPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@AllArgsConstructor
@Log4j2
public class AddressInformationIndividualStepDefinition extends BasePage {
    AddressInformationIndividualPage addressInformationIndividualPage;
    GeneralInformationNewIndividualCustomerPage generalInformationNewIndividualCustomerPage;

    @Given("User is in the Address Information on Create Individual Customer page")
    public void userIsInTheAddressInformationOnCreateIndividualCustomerPage() {
        //addressInformationIndividualPage.verifyUserIsOnAddressInformationPageOnIndividual();
        addressInformationIndividualPage.selectedAddressInformationOnIndividual.isDisplayed();
    }

    @And("User clicks Next button in Address Information on Create Individual Customer page")
    public void userClicksNextButtonInAddressInformationOnCreateIndividualCustomerPage() {
        clickField(addressInformationIndividualPage.nextButtonOnAddressInformationOnIndividual);
    }

    @Then("User sees the Address Line 1 is required in Address Information on Create Individual Customer page")
    public void userSeesTheAddressLineOneIsRequiredInAddressInformationOnCreateIndividualCustomerPage() {
        clickField(addressInformationIndividualPage.billingAddressMediumTypeOnIndividual);
        warningBackgroundRedColorOne(addressInformationIndividualPage.billingAddressLineOneInputDiv, true);
    }

    @And("User clicks Back button on Address Information on Create Individual Customer page")
    public void userClicksBackButtonOnAddressInformationOnCreateIndividualCustomerPage() {
        clickField(addressInformationIndividualPage.backButtonOnAddressInformationOnIndividual);
    }

    @Then("User is in the General Information on Create Individual Customer page")
    public void userIsInTheGeneralInformationOnCreateIndividualCustomerPage() {
        generalInformationNewIndividualCustomerPage.selectedGeneralInformationOnIndividual.isDisplayed();
    }

    @Given("User should see the Address Line 1 textbox in Address Information on Create Individual Customer page")
    public void userShouldSeeTheAddressLineOneTextboxInAddressInformationOnCreateIndividualCustomerPage() {
        elementDisplayed(addressInformationIndividualPage.billingAddressLineOneInputOnIndividual);
    }

    @When("User clicks Address Line 1 Field in Address Information on Create Individual Customer page")
    public void userClicksAddressLineOneFieldInAddressInformationOnCreateIndividualCustomerPage() {
        clickField(addressInformationIndividualPage.billingAddressLineOneInputOnIndividual);
    }

    @And("User enters a value {string} in the Address Line 1 textbox in Address Information on Create Individual Customer page")
    public void userEntersAValueInTheAddressLineOneTextboxInAddressInformationOnCreateIndividualCustomerPage(String address) {
        addressInformationIndividualPage.fillInputField(addressInformationIndividualPage.billingAddressLineOneInputOnIndividual, address);
    }

    @And("User clears Address Line 1 Field in Address Information on Create Individual Customer page")
    public void userClearsAddressLineOneFieldInAddressInformationOnCreateIndividualCustomerPage() {
        addressInformationIndividualPage.billingAddressLineOneInputOnIndividual.clear();
    }

    @Given("User should see the Address Line 2 textbox in Address Information on Create Individual Customer page")
    public void userShouldSeeTheAddressLineTwoTextboxInAddressInformationOnCreateIndividualCustomerPage() {
        elementDisplayed(addressInformationIndividualPage.billingAddressLineTwoInputOnIndividual);
    }

    @And("User clicks Address Line 2 Field in Address Information on Create Individual Customer page")
    public void userClicksAddressLineTwoFieldInAddressInformationOnCreateIndividualCustomerPage() {
        clickField(addressInformationIndividualPage.billingAddressLineTwoInputOnIndividual);
    }

    @Then("User enters a value {string} in the Address Line 2 textbox in Address Information on Create Individual Customer page")
    public void userEntersAValueInTheAddressLineTwoTextboxInAddressInformationOnCreateIndividualCustomerPage(String address) {
        addressInformationIndividualPage.fillInputField(addressInformationIndividualPage.billingAddressLineTwoInputOnIndividual, address);
    }

    @Given("User should see the Post Code textbox in Address Information on Create Individual Customer page")
    public void userShouldSeeThePostCodeTextboxInAddressInformationOnCreateIndividualCustomerPage() {
        elementDisplayed(addressInformationIndividualPage.billingPostCodeInputOnIndividual);
    }

    @And("User clicks Post Code Field on Address Information in Create Individual Customer page")
    public void userClicksPostCodeFieldOnAddressInformationInCreateIndividualCustomerPage() {
        clickField(addressInformationIndividualPage.billingPostCodeInputOnIndividual);
    }

    @Then("User enters a value {string} in the Post Code textbox in Address Information on Create Individual Customer page")
    public void userEntersAValueInThePostCodeTextboxInAddressInformationOnCreateIndividualCustomerPage(String postCode) {
        addressInformationIndividualPage.fillInputField(addressInformationIndividualPage.billingPostCodeInputOnIndividual, postCode);
    }

    @Given("User should see the Medium Type textbox in Address Information on Create Individual Customer page")
    public void userShouldSeeTheMediumTypeTextboxInAddressInformationOnCreateIndividualCustomerPage() {
        elementDisplayed(addressInformationIndividualPage.billingAddressMediumTypeOnIndividual);
    }

    @Then("User see the Medium Type textbox is non-editable in Address Information on Create Individual Customer page")
    public void userSeeTheMediumTypeTextboxIsNonEditableInAddressInformationOnCreateIndividualCustomerPage() {
        addressInformationIndividualPage.verifyInputElementsNonEditableOnIndividual(addressInformationIndividualPage.billingAddressMediumTypeOnIndividual);
    }

    @Given("User should see the Contact Type textbox on Address Information in Create Individual Customer page")
    public void userShouldSeeTheContactTypeTextboxOnAddressInformationInCreateIndividualCustomerPage() {
        elementDisplayed(addressInformationIndividualPage.billingAddressContactTypeOnIndividual);
    }

    @Then("User see the Contact Type textbox is non-editable in Address Information on Create Individual Customer page")
    public void userSeeTheContactTypeTextboxIsNonEditableInAddressInformationOnCreateIndividualCustomerPage() {
        addressInformationIndividualPage.verifyInputElementsNonEditableOnIndividual(addressInformationIndividualPage.billingAddressContactTypeOnIndividual);
    }

    @Given("User should see the Country dropdown in Address Information on Create Individual Customer page")
    public void userShouldSeeTheCountryDropdownInAddressInformationOnCreateIndividualCustomerPage() {
        elementDisplayed(addressInformationIndividualPage.billingCountryDropdownOnIndividual);
    }

    @Then("User see the Country dropdown is non-editable in Address Information on Create Individual Customer page")
    public void userSeeTheCountryDropdownIsNonEditableInAddressInformationOnCreateIndividualCustomerPage() {
        addressInformationIndividualPage.verifyDropdownNonEditableOnIndividual(addressInformationIndividualPage.billingCountryDropdownOnIndividual);
    }

    @Then("User see the ALBANIA value on the Country dropdown in Address Information on Create Individual Customer page")
    public void userSeeTheALBANIAValueOnTheCountryDropdownInAddressInformationOnCreateIndividualCustomerPage() {
        addressInformationIndividualPage.verifyCountryHasDefaultValueOnIndividual(addressInformationIndividualPage.billingCountryDropdownOnIndividual, "ALBANIA");
    }

    @Given("User should see the City dropdown in Address Information on Create Individual Customer page")
    public void userShouldSeeTheCityDropdownInAddressInformationOnCreateIndividualCustomerPage() {
        elementDisplayed(addressInformationIndividualPage.billingCityDropdownOnIndividual);
    }

    @When("User clicks City dropdown in Address Information on Create Individual Customer page")
    public void userClicksCityDropdownInAddressInformationOnCreateIndividualCustomerPage() {
        clickField(addressInformationIndividualPage.billingCityDropdownOnIndividual);
    }

    @And("User should ensure each options in City dropdown are selectable in Address Information on Create Individual Customer page")
    public void userShouldEnsureEachOptionsInCityDropdownAreSelectableInAddressInformationOnCreateIndividualCustomerPage() {
        isDropdownSelectableOne();
    }

    @Then("User should select {string} option in the City dropdown in Address Information on Create Individual Customer page")
    public void userShouldSelectOptionInTheCityDropdownInAddressInformationOnCreateIndividualCustomerPage(String city) {
        selectSpecificOptionFromDropdown(city);
    }

    @Then("User is in the Contact Information on Create Individual Customer page")
    public void userIsInTheContactInformationOnCreateIndividualCustomerPage() {
        addressInformationIndividualPage.selectedContactInformationOnIndividual.isDisplayed();
    }

    @Given("User should see the Service Address slider in Address Information on Create Individual Customer page")
    public void userShouldSeeTheServiceAddressSliderInAddressInformationOnCreateIndividualCustomerPage() {
        elementDisplayed(addressInformationIndividualPage.alsoServiceAddressToggleSwitchOnIndividual);
    }

    @When("User switch off the slider in Address Information on Create Individual Customer page")
    public void userSwitchOffTheSliderInAddressInformationOnCreateIndividualCustomerPage() {
        clickField(addressInformationIndividualPage.alsoServiceAddressToggleSwitchOnIndividual);
    }

    @Then("User should see the Service Address field for Contact Type in Address Information on Create Individual Customer page")
    public void userShouldSeeTheServiceAddressFieldForContactTypeInAddressInformationOnCreateIndividualCustomerPage() {
        addressInformationIndividualPage.verifyServiceAddressValueOnIndividual();
    }

    @Given("User should see the Address Line 1 textbox for Service Address in Address Information on Create Individual Customer page")
    public void userShouldSeeTheAddressLineOneTextboxForServiceAddressInAddressInformationOnCreateIndividualCustomerPage() {
        Utils.scrollToElement(addressInformationIndividualPage.serviceAddressLineOneInputOnIndividual);
        elementDisplayed(addressInformationIndividualPage.serviceAddressLineOneInputOnIndividual);
    }

    @And("User clicks Address Line 1 Field for Service Address in Address Information on Create Individual Customer page")
    public void userClicksAddressLineOneFieldForServiceAddressInAddressInformationOnCreateIndividualCustomerPage() {
        clickField(addressInformationIndividualPage.serviceAddressLineOneInputOnIndividual);
    }

    @Then("User enters a value {string} in the Address Line 1 textbox for Service Address in Address Information on Create Individual Customer page")
    public void userEntersAValueInTheAddressLineOneTextboxForServiceAddressInAddressInformationOnCreateIndividualCustomerPage(String address) {
        addressInformationIndividualPage.fillInputField(addressInformationIndividualPage.serviceAddressLineOneInputOnIndividual, address);
    }

    @And("User clears Address Line 1 Field for Service Address in Address Information on Create Individual Customer page")
    public void userClearsAddressLineOneFieldForServiceAddressInAddressInformationOnCreateIndividualCustomerPage() {
        addressInformationIndividualPage.serviceAddressLineOneInputOnIndividual.clear();
    }

    @Then("User sees the Address Line 1 is required for Service Address in Address Information on Create Individual Customer page")
    public void userSeesTheAddressLineOneIsRequiredForServiceAddressInAddressInformationOnCreateIndividualCustomerPage() {
        warningBackgroundRedColorOne(addressInformationIndividualPage.serviceAddressLineOneInputDivOnIndividual, true);
    }

    @Given("User should see the Address Line 2 textbox for Service Address in Address Information on Create Individual Customer page")
    public void userShouldSeeTheAddressLineTwoTextboxForServiceAddressInAddressInformationOnCreateIndividualCustomerPage() {
        elementDisplayed(addressInformationIndividualPage.serviceAddressLineTwoInputOnIndividual);
    }

    @And("User clicks Address Line 2 Field for Service Address in Address Information on Create Individual Customer page")
    public void userClicksAddressLineTwoFieldForServiceAddressInAddressInformationOnCreateIndividualCustomerPage() {
        clickField(addressInformationIndividualPage.serviceAddressLineTwoInputOnIndividual);
    }

    @Then("User enters a value {string} in the Address Line 2 textbox for Service Address in Address Information on Create Individual Customer page")
    public void userEntersAValueInTheAddressLineTwoTextboxForServiceAddressInAddressInformationOnCreateIndividualCustomerPage(String address) {
        addressInformationIndividualPage.fillInputField(addressInformationIndividualPage.serviceAddressLineTwoInputOnIndividual,address);
    }

    @Given("User should see the Post Code textbox for Service Address in Address Information on Create Individual Customer page")
    public void userShouldSeeThePostCodeTextboxForServiceAddressInAddressInformationOnCreateIndividualCustomerPage() {
        elementDisplayed(addressInformationIndividualPage.servicePostCodeInputOnIndividual);
    }

    @And("User clicks Post Code Field for Service Address in Address Information on Create Individual Customer page")
    public void userClicksPostCodeFieldForServiceAddressInAddressInformationOnCreateIndividualCustomerPage() {
        clickField(addressInformationIndividualPage.servicePostCodeInputOnIndividual);
    }

    @Then("User enters a value {string} in the Post Code textbox for Service Address in Address Information on Create Individual Customer page")
    public void userEntersAValueInThePostCodeTextboxForServiceAddressInAddressInformationOnCreateIndividualCustomerPage(String postCode) {
        addressInformationIndividualPage.fillInputField(addressInformationIndividualPage.servicePostCodeInputOnIndividual,postCode);
    }

    @Given("User should see the Country dropdown for Service Address in Address Information on Create Individual Customer page")
    public void userShouldSeeTheCountryDropdownForServiceAddressInAddressInformationOnCreateIndividualCustomerPage() {
        elementDisplayed(addressInformationIndividualPage.serviceCountryDropdownOnIndividual);
    }

    @Then("User see the Country dropdown is non-editable for Service Address in Address Information on Create Individual Customer page")
    public void userSeeTheCountryDropdownIsNonEditableForServiceAddressInAddressInformationOnCreateIndividualCustomerPage() {
        addressInformationIndividualPage.verifyDropdownNonEditableOnIndividual(addressInformationIndividualPage.serviceCountryDropdownOnIndividual);
    }

    @Then("User see the ALBANIA value on the Country dropdown for Service Address in Address Information on Create Individual Customer page")
    public void userSeeTheALBANIAValueOnTheCountryDropdownForServiceAddressInAddressInformationOnCreateIndividualCustomerPage() {
        addressInformationIndividualPage.verifyCountryHasDefaultValueOnIndividual(addressInformationIndividualPage.serviceCountryDropdownOnIndividual, "ALBANIA");
    }

    @Given("User should see the City dropdown for Service Address in Address Information on Create Individual Customer page")
    public void userShouldSeeTheCityDropdownForServiceAddressInAddressInformationOnCreateIndividualCustomerPage() {
        Utils.scrollToElement(addressInformationIndividualPage.serviceCityDropdownOnIndividual);
        elementDisplayed(addressInformationIndividualPage.serviceCityDropdownOnIndividual);
    }

    @When("User clicks City dropdown for Service Address in Address Information on Create Individual Customer page")
    public void userClicksCityDropdownForServiceAddressInAddressInformationOnCreateIndividualCustomerPage() {
        clickField(addressInformationIndividualPage.serviceCityDropdownOnIndividual);
    }

    @And("User should ensure each options in City dropdown are selectable for Service Address in Address Information on Create Individual Customer page")
    public void userShouldEnsureEachOptionsInCityDropdownAreSelectableForServiceAddressInAddressInformationOnCreateIndividualCustomerPage() {
        isDropdownSelectableOne();
    }

    @Then("User should select {string} option in the City dropdown for Service Address in Address Information on Create Individual Customer page")
    public void userShouldSelectOptionInTheCityDropdownForServiceAddressInAddressInformationOnCreateIndividualCustomerPage(String city) {
        selectSpecificOptionFromDropdown(city);
    }
}