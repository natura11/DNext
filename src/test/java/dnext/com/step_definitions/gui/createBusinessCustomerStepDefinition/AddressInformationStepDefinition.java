package dnext.com.step_definitions.gui.createBusinessCustomerStepDefinition;

import com.utilities.Utils;
import dnext.com.pages.BasePage;
import dnext.com.pages.createBusinnesCustomerPages.AddressInformationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@AllArgsConstructor
@Log4j2
public class AddressInformationStepDefinition extends BasePage {
    AddressInformationPage addressInformationPage;

    @Given("User clicks the Address Information button")
    public void userClicksTheAddressInformationButton() {
        clickField(addressInformationPage.addressInformationButton);
    }

    @Then("User is on the Address Information Page")
    public void userShouldSeeTheAddressInformationPage() {
        addressInformationPage.verifyUserIsOnAddressInformationPage();
    }

    @And("User clicks Next button on Address Information Page")
    public void userClicksNextButtonOnAddressInformationPage() {
        clickField(addressInformationPage.nextButtonOnAddressInformationPage);
    }

    @And("User clicks Back button on Address Information Page")
    public void userClicksBackButtonOnAddressInformationPage() {
        clickField(addressInformationPage.backButtonOnAddressInformationPage);
    }

    @Given("User should see the Address Line 1 textbox on Address Information Page")
    public void userShouldSeeTheAddressLineOneTextbox() {
        elementDisplayed(addressInformationPage.billingAddressLineOneInput);
    }

    @And("User clicks Address Line 1 Field on Address Information Page")
    public void userClicksAddressLineOneField() {
        clickField(addressInformationPage.billingAddressLineOneInput);
    }

    @Then("User enters a value {string} in the Address Line 1 textbox on Address Information Page")
    public void userEntersAValueInTheAddressLineOneTextbox(String address) {
        addressInformationPage
                .fillInputField(addressInformationPage.billingAddressLineOneInput,address);
    }

    @And("User clears Address Line 1 Field on Address Information Page")
    public void userClearsAddressLineFieldOnAddressInformationPage() {
        addressInformationPage.billingAddressLineOneInput.clear();
    }

    @Then("User sees the Address Line 1 is required on Address Information Page")
    public void userSeesTheAddressLineIsRequired() {
        clickField(addressInformationPage.billingAddressMediumType);
        warningBackgroundRedColorOne(addressInformationPage.billingAddressLineOneInputDiv, true);
    }

    @Given("User should see the Address Line 2 textbox on Address Information Page")
    public void userShouldSeeTheAddressLineTwoTextbox() {
        elementDisplayed(addressInformationPage.billingAddressLineTwoInput);
    }

    @And("User clicks Address Line 2 Field on Address Information Page")
    public void userClicksAddressLineTwoField() {
        clickField(addressInformationPage.billingAddressLineTwoInput);
    }

    @Then("User enters a value {string} in the Address Line 2 textbox on Address Information Page")
    public void userEntersAValueInTheAddressLineTwoTextbox(String address) {
        addressInformationPage
                .fillInputField(addressInformationPage.billingAddressLineTwoInput,address);
    }

    @Given("User should see the Post Code textbox on Address Information Page")
    public void userShouldSeeThePostCodeTextbox() {
        elementDisplayed(addressInformationPage.billingPostCodeInput);
    }

    @And("User clicks Post Code Field on Address Information Page")
    public void userClicksPostCodeField() {
        clickField(addressInformationPage.billingPostCodeInput);
    }

    @Then("User enters a value {string} in the Post Code textbox on Address Information Page")
    public void userEntersAValueInThePostCodeTextbox(String postCode) {
        addressInformationPage
                .fillInputField(addressInformationPage.billingPostCodeInput,postCode);
    }

    @Given("User should see the Medium Type textbox on Address Information Page")
    public void userShouldSeeTheMediumTypeTextbox() {
        elementDisplayed(addressInformationPage.billingAddressMediumType);
    }

    @Then("User see the Medium Type textbox is non-editable on Address Information Page")
    public void userSeeTheMediumTypeTextboxIsNonEditable() {
        addressInformationPage
                .verifyInputElementsNonEditable(addressInformationPage.billingAddressMediumType);
    }

    @Given("User should see the Contact Type textbox on Address Information Page")
    public void userShouldSeeTheContactTypeTextbox() {
        elementDisplayed(addressInformationPage.billingAddressContactType);
    }

    @Then("User see the Contact Type textbox is non-editable on Address Information Page")
    public void userSeeTheContactTypeTextboxIsNonEditable() {
        addressInformationPage
                .verifyInputElementsNonEditable(addressInformationPage.billingAddressContactType);
    }

    @Given("User should see the Country dropdown on Address Information Page")
    public void userShouldSeeTheCountryDropdown() {
        elementDisplayed(addressInformationPage.billingCountryDropdown);
    }

    @Then("User see the Country dropdown is non-editable on Address Information Page")
    public void userSeeTheCountryDropdownIsNonEditable() {
        addressInformationPage
                .verifyDropdownNonEditable(addressInformationPage.billingCountryDropdown);
    }

    @Then("User see the ALBANIA value on the Country dropdown on Address Information Page")
    public void userSeeTheALBANIAValueOnTheCountryDropdown() {
        addressInformationPage
                .verifyCountryHasDefaultValue(addressInformationPage.billingCountryDropdown, "ALBANIA");
    }

    @Given("User should see the City dropdown on Address Information Page")
    public void userShouldSeeTheCityDropdown() {
        elementDisplayed(addressInformationPage.billingCityDropdown);
    }

    @When("User clicks City dropdown on Address Information Page")
    public void userClicksCityDropdown() {
        clickField(addressInformationPage.billingCityDropdown);
    }

    @And("User should ensure each options in City dropdown are selectable on Address Information Page")
    public void userShouldEnsureEachOptionsInCityDropdownAreSelectable() {
        isDropdownSelectableOne();
    }

    @Then("User should select {string} option in the City dropdown on Address Information Page")
    public void userShouldSelectOptionInTheCityDropdown(String city) {
        selectSpecificOptionFromDropdown(city);
    }

    @Given("User should see the Service Address slider on Address Information Page")
    public void userShouldSeeTheServiceAddressSlider() {
        elementDisplayed(addressInformationPage.alsoServiceAddressToggleSwitch);
    }

    @When("User switch off the slider on Address Information Page")
    public void userSwitchOffTheSlider() {
        clickField(addressInformationPage.alsoServiceAddressToggleSwitch);
    }

    @Then("User should see the Service Address field for Contact Type on Address Information Page")
    public void userShouldSeeTheServiceAddressFieldForContactType() {
        addressInformationPage.verifyServiceAddressValue();
    }

    @Given("User should see the Address Line 1 textbox for Service Address on Address Information Page")
    public void userShouldSeeTheAddressLine1TextboxForServiceAddress() {
        Utils.scrollToElement(addressInformationPage.serviceAddressLineOneInput);
        elementDisplayed(addressInformationPage.serviceAddressLineOneInput);
    }

    @And("User clicks Address Line 1 Field for Service Address on Address Information Page")
    public void userClicksAddressLineFieldForServiceAddress() {
        clickField(addressInformationPage.serviceAddressLineOneInput);
    }

    @Then("User enters a value {string} in the Address Line 1 textbox for Service Address on Address Information Page")
    public void userEntersAValueInTheAddressLineTextboxForServiceAddress(String address) {
        addressInformationPage
                .fillInputField(addressInformationPage.serviceAddressLineOneInput,address);
    }

    @And("User clears Address Line 1 Field for Service Address on Address Information Page")
    public void userClearsAddressLineFieldForServiceAddress() {
        addressInformationPage.serviceAddressLineOneInput.clear();
    }

    @Then("User sees the Address Line 1 is required for Service Address on Address Information Page")
    public void userSeesTheAddressLineIsRequiredForServiceAddress() {
        warningBackgroundRedColorOne(addressInformationPage.serviceAddressLineOneInputDiv, true);
    }

    @Given("User should see the Address Line 2 textbox for Service Address on Address Information Page")
    public void userShouldSeeTheAddressLine2TextboxForServiceAddress() {
        elementDisplayed(addressInformationPage.serviceAddressLineTwoInput);
    }

    @And("User clicks Address Line 2 Field for Service Address on Address Information Page")
    public void userClicksAddressLine2FieldForServiceAddress() {
        clickField(addressInformationPage.serviceAddressLineTwoInput);
    }

    @Then("User enters a value {string} in the Address Line 2 textbox for Service Address on Address Information Page")
    public void userEntersAValueInTheAddressLine2TextboxForServiceAddress(String address) {
        addressInformationPage
                .fillInputField(addressInformationPage.serviceAddressLineTwoInput,address);
    }

    @Given("User should see the Post Code textbox for Service Address on Address Information Page")
    public void userShouldSeeThePostCodeTextboxForServiceAddress() {
        elementDisplayed(addressInformationPage.servicePostCodeInput);
    }

    @And("User clicks Post Code Field for Service Address on Address Information Page")
    public void userClicksPostCodeFieldForServiceAddress() {
        clickField(addressInformationPage.servicePostCodeInput);
    }

    @Then("User enters a value {string} in the Post Code textbox for Service Address on Address Information Page")
    public void userEntersAValueInThePostCodeTextboxForServiceAddress(String postCode) {
        addressInformationPage
                .fillInputField(addressInformationPage.servicePostCodeInput,postCode);
    }

    @Given("User should see the Country dropdown for Service Address on Address Information Page")
    public void userShouldSeeTheCountryDropdownForServiceAddress() {
        elementDisplayed(addressInformationPage.serviceCountryDropdown);
    }

    @Then("User see the Country dropdown is non-editable for Service Address on Address Information Page")
    public void userSeeTheCountryDropdownIsNonEditableForServiceAddress() {
        addressInformationPage
                .verifyDropdownNonEditable(addressInformationPage.serviceCountryDropdown);
    }


    @Then("User see the ALBANIA value on the Country dropdown for Service Address on Address Information Page")
    public void userSeeTheALBANIAValueOnTheCountryDropdownForServiceAddress() {
        addressInformationPage
                .verifyCountryHasDefaultValue(addressInformationPage.serviceCountryDropdown, "ALBANIA");
    }

    @Given("User should see the City dropdown for Service Address on Address Information Page")
    public void userShouldSeeTheCityDropdownForServiceAddress() {
        Utils.scrollToElement(addressInformationPage.serviceCityDropdown);
        elementDisplayed(addressInformationPage.serviceCityDropdown);
    }

    @When("User clicks City dropdown for Service Address on Address Information Page")
    public void userClicksCityDropdownForServiceAddress() {
        clickField(addressInformationPage.serviceCityDropdown);
    }

    @And("User should ensure each options in City dropdown are selectable for Service Address on Address Information Page")
    public void userShouldEnsureEachOptionsInCityDropdownAreSelectableForServiceAddress() {
        isDropdownSelectableOne();
    }

    @Then("User should select {string} option in the City dropdown for Service Address on Address Information Page")
    public void userShouldSelectOptionInTheCityDropdownForServiceAddress(String city) {
        selectSpecificOptionFromDropdown(city);
    }



}