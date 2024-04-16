package dnext.com.step_definitions.gui.createBusinessCustomerStepDefinition;

import com.utilities.Utils;
import dnext.com.pages.BasePage;
import dnext.com.pages.createBusinessCustomerPages.AddressInformationBusinessPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@AllArgsConstructor
@Log4j2
public class AddressInformationBusinessStepDefinition extends BasePage {
    AddressInformationBusinessPage addressInformationBusinessPage;

    @Given("User clicks the Address Information button")
    public void userClicksTheAddressInformationButton() {
        clickField(addressInformationBusinessPage.addressInformationButton);
    }


    @And("User clicks Next button on Address Information Page")
    public void userClicksNextButtonOnAddressInformationPage() {
        clickField(addressInformationBusinessPage.nextButtonOnAddressInformationPage);
    }

    @And("User clicks Back button on Address Information Page")
    public void userClicksBackButtonOnAddressInformationPage() {
        clickField(addressInformationBusinessPage.backButtonOnAddressInformationPage);
    }

    @Given("User should see the Address Line 1 textbox on Address Information Page")
    public void userShouldSeeTheAddressLineOneTextbox() {
        elementDisplayed(addressInformationBusinessPage.billingAddressLineOneInput);
    }

    @And("User clicks Address Line 1 Field on Address Information Page")
    public void userClicksAddressLineOneField() {
        clickField(addressInformationBusinessPage.billingAddressLineOneInput);
    }

    @Then("User enters a value {string} in the Address Line 1 textbox on Address Information Page")
    public void userEntersAValueInTheAddressLineOneTextbox(String address) {
        fillInput(addressInformationBusinessPage.billingAddressLineOneInput, address);
    }

    @And("User clears Address Line 1 Field on Address Information Page")
    public void userClearsAddressLineFieldOnAddressInformationPage() {
        addressInformationBusinessPage.billingAddressLineOneInput.clear();
    }

    @Then("User sees the Address Line 1 is required on Address Information Page")
    public void userSeesTheAddressLineIsRequired() {
        clickField(addressInformationBusinessPage.billingAddressMediumType);
        warningBackgroundRedColorOne(addressInformationBusinessPage.billingAddressLineOneInputDiv, true);
    }

    @Given("User should see the Address Line 2 textbox on Address Information Page")
    public void userShouldSeeTheAddressLineTwoTextbox() {
        elementDisplayed(addressInformationBusinessPage.billingAddressLineTwoInput);
    }

    @And("User clicks Address Line 2 Field on Address Information Page")
    public void userClicksAddressLineTwoField() {
        clickField(addressInformationBusinessPage.billingAddressLineTwoInput);
    }

    @Then("User enters a value {string} in the Address Line 2 textbox on Address Information Page")
    public void userEntersAValueInTheAddressLineTwoTextbox(String address) {
        fillInput(addressInformationBusinessPage.billingAddressLineTwoInput, address);
    }

    @Given("User should see the Post Code textbox on Address Information Page")
    public void userShouldSeeThePostCodeTextbox() {
        elementDisplayed(addressInformationBusinessPage.billingPostCodeInput);
    }

    @And("User clicks Post Code Field on Address Information Page")
    public void userClicksPostCodeField() {
        clickField(addressInformationBusinessPage.billingPostCodeInput);
    }

    @Then("User enters a value {string} in the Post Code textbox on Address Information Page")
    public void userEntersAValueInThePostCodeTextbox(String postCode) {
        fillInput(addressInformationBusinessPage.billingPostCodeInput, postCode);
    }

    @Given("User should see the Medium Type textbox on Address Information Page")
    public void userShouldSeeTheMediumTypeTextbox() {
        elementDisplayed(addressInformationBusinessPage.billingAddressMediumType);
    }

    @Then("User see the Medium Type textbox is non-editable on Address Information Page")
    public void userSeeTheMediumTypeTextboxIsNonEditable() {
        addressInformationBusinessPage
                .verifyInputElementsNonEditable(addressInformationBusinessPage.billingAddressMediumType);
    }

    @Given("User should see the Contact Type textbox on Address Information Page")
    public void userShouldSeeTheContactTypeTextbox() {
        elementDisplayed(addressInformationBusinessPage.billingAddressContactType);
    }

    @Then("User see the Contact Type textbox is non-editable on Address Information Page")
    public void userSeeTheContactTypeTextboxIsNonEditable() {
        addressInformationBusinessPage
                .verifyInputElementsNonEditable(addressInformationBusinessPage.billingAddressContactType);
    }

    @Given("User should see the Country dropdown on Address Information Page")
    public void userShouldSeeTheCountryDropdown() {
        elementDisplayed(addressInformationBusinessPage.billingCountryDropdown);
    }

    @Then("User see the Country dropdown is non-editable on Address Information Page")
    public void userSeeTheCountryDropdownIsNonEditable() {
        addressInformationBusinessPage
                .verifyDropdownNonEditable(addressInformationBusinessPage.billingCountryDropdown);
    }

    @Then("User see the ALBANIA value on the Country dropdown on Address Information Page")
    public void userSeeTheALBANIAValueOnTheCountryDropdown() {
        addressInformationBusinessPage
                .verifyCountryHasDefaultValue(addressInformationBusinessPage.billingCountryDropdown, "ALBANIA");
    }

    @Given("User should see the City dropdown on Address Information Page")
    public void userShouldSeeTheCityDropdown() {
        elementDisplayed(addressInformationBusinessPage.billingCityDropdown);
    }

    @When("User clicks City dropdown on Address Information Page")
    public void userClicksCityDropdown() {
        clickField(addressInformationBusinessPage.billingCityDropdown);
    }

    @And("User should ensure each options in City dropdown are selectable on Address Information Page")
    public void userShouldEnsureEachOptionsInCityDropdownAreSelectable() {
        isDropdownSelectable();
    }

    @Then("User should select {string} option in the City dropdown on Address Information Page")
    public void userShouldSelectOptionInTheCityDropdown(String city) {
        selectSpecificOptionFromDropdown(city);
    }

    @Given("User should see the Service Address slider on Address Information Page")
    public void userShouldSeeTheServiceAddressSlider() {
        elementDisplayed(addressInformationBusinessPage.alsoServiceAddressToggleSwitch);
    }

    @When("User switch off the slider on Address Information Page")
    public void userSwitchOffTheSlider() {
        clickField(addressInformationBusinessPage.alsoServiceAddressToggleSwitch);
    }

    @Then("User should see the Service Address field for Contact Type on Address Information Page")
    public void userShouldSeeTheServiceAddressFieldForContactType() {
        addressInformationBusinessPage.verifyServiceAddressValue();
    }

    @Given("User should see the Address Line 1 textbox for Service Address on Address Information Page")
    public void userShouldSeeTheAddressLine1TextboxForServiceAddress() {
        Utils.scrollToElement(addressInformationBusinessPage.serviceAddressLineOneInput);
        elementDisplayed(addressInformationBusinessPage.serviceAddressLineOneInput);
    }

    @And("User clicks Address Line 1 Field for Service Address on Address Information Page")
    public void userClicksAddressLineFieldForServiceAddress() {
        clickField(addressInformationBusinessPage.serviceAddressLineOneInput);
    }

    @Then("User enters a value {string} in the Address Line 1 textbox for Service Address on Address Information Page")
    public void userEntersAValueInTheAddressLineTextboxForServiceAddress(String address) {
        fillInput(addressInformationBusinessPage.serviceAddressLineOneInput, address);
    }

    @And("User clears Address Line 1 Field for Service Address on Address Information Page")
    public void userClearsAddressLineFieldForServiceAddress() {
        addressInformationBusinessPage.serviceAddressLineOneInput.clear();
    }

    @Then("User sees the Address Line 1 is required for Service Address on Address Information Page")
    public void userSeesTheAddressLineIsRequiredForServiceAddress() {
        warningBackgroundRedColorOne(addressInformationBusinessPage.serviceAddressLineOneInputDiv, true);
    }

    @Given("User should see the Address Line 2 textbox for Service Address on Address Information Page")
    public void userShouldSeeTheAddressLine2TextboxForServiceAddress() {
        elementDisplayed(addressInformationBusinessPage.serviceAddressLineTwoInput);
    }

    @And("User clicks Address Line 2 Field for Service Address on Address Information Page")
    public void userClicksAddressLine2FieldForServiceAddress() {
        clickField(addressInformationBusinessPage.serviceAddressLineTwoInput);
    }

    @Then("User enters a value {string} in the Address Line 2 textbox for Service Address on Address Information Page")
    public void userEntersAValueInTheAddressLine2TextboxForServiceAddress(String address) {
        fillInput(addressInformationBusinessPage.serviceAddressLineTwoInput, address);
    }

    @Given("User should see the Post Code textbox for Service Address on Address Information Page")
    public void userShouldSeeThePostCodeTextboxForServiceAddress() {
        elementDisplayed(addressInformationBusinessPage.servicePostCodeInput);
    }

    @And("User clicks Post Code Field for Service Address on Address Information Page")
    public void userClicksPostCodeFieldForServiceAddress() {
        clickField(addressInformationBusinessPage.servicePostCodeInput);
    }

    @Then("User enters a value {string} in the Post Code textbox for Service Address on Address Information Page")
    public void userEntersAValueInThePostCodeTextboxForServiceAddress(String postCode) {
        fillInput(addressInformationBusinessPage.servicePostCodeInput, postCode);
    }

    @Given("User should see the Country dropdown for Service Address on Address Information Page")
    public void userShouldSeeTheCountryDropdownForServiceAddress() {
        elementDisplayed(addressInformationBusinessPage.serviceCountryDropdown);
    }

    @Then("User see the Country dropdown is non-editable for Service Address on Address Information Page")
    public void userSeeTheCountryDropdownIsNonEditableForServiceAddress() {
        addressInformationBusinessPage
                .verifyDropdownNonEditable(addressInformationBusinessPage.serviceCountryDropdown);
    }

    @Then("User see the ALBANIA value on the Country dropdown for Service Address on Address Information Page")
    public void userSeeTheALBANIAValueOnTheCountryDropdownForServiceAddress() {
        addressInformationBusinessPage
                .verifyCountryHasDefaultValue(addressInformationBusinessPage.serviceCountryDropdown, "ALBANIA");
    }

    @Given("User should see the City dropdown for Service Address on Address Information Page")
    public void userShouldSeeTheCityDropdownForServiceAddress() {
        Utils.scrollToElement(addressInformationBusinessPage.serviceCityDropdown);
        elementDisplayed(addressInformationBusinessPage.serviceCityDropdown);
    }

    @When("User clicks City dropdown for Service Address on Address Information Page")
    public void userClicksCityDropdownForServiceAddress() {
        clickField(addressInformationBusinessPage.serviceCityDropdown);
    }

    @And("User should ensure each options in City dropdown are selectable for Service Address on Address Information Page")
    public void userShouldEnsureEachOptionsInCityDropdownAreSelectableForServiceAddress() {
        isDropdownSelectable();
    }

    @Then("User should select {string} option in the City dropdown for Service Address on Address Information Page")
    public void userShouldSelectOptionInTheCityDropdownForServiceAddress(String city) {
        selectSpecificOptionFromDropdown(city);
    }

    @Then("User should select random option in the City dropdown on Address Information Page")
    public void userShouldSelectRandomOptionInTheCityDropdownOnAddressInformationPage() {
        randomOptionFromDropdown();
    }
}