package optiim.steps.gui.customermanagement;

import optiim.framework.UrlBuilder;
import optiim.framework.helpers.WebDriverHelper;
import optiim.pages.customermanagement.CorporateParentCustomerPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class CorporateParentCustomerSteps {

    private final WebDriverHelper webDriverHelper;
    private final UrlBuilder urlBuilder;
    private final CorporateParentCustomerPage corporateParentCustomerPage;

    @Then("I should be seeing that the {string} title for Corporate Parent Account Page")
    public void I_should_be_seeing_that_the_title_for_Corporate_Parent_Account_Page(String titleName) throws Throwable {
        corporateParentCustomerPage
                .controlParentAccount(titleName);
    }


    @When("I click Add button for Corporate Parent Account Page")
    public void ıClickAddButtonForCorporateParentAccountPage() throws Throwable {
        corporateParentCustomerPage
                .clickAddButton();

    }

    @Then("I should be seeing {string} popup")
    public void ıShouldBeSeeingPopup(String popupTitleName) throws Throwable {
        corporateParentCustomerPage
                .controlAddPopup(popupTitleName);
    }

    @When("I enter a value {string} in the Name field for Corporate Parent Account Page")
    public void ıEnterAValueInTheNameFieldForCorporateParentAccountPage(String name) throws Throwable {
        corporateParentCustomerPage
                .enterName(name);
    }

    @And("I should be seeing that Name field is displayed for Corporate Parent Account Page")
    public void ıShouldBeSeeingThatNameFieldIsDisplayedForCorporateParentAccountPage() {
        corporateParentCustomerPage
                .controlNameField();
    }

    @Then("I should be seeing that {string} field is mandatory and not leaved empty for Corporate Parent Account Page")
    public void ıShouldBeSeeingThatFieldIsMandatoryAndNotLeavedEmptyForCorporateParentAccountPage(String fieldName) {
        corporateParentCustomerPage
                .controlErrorMessage(fieldName);
    }

    @When("I would be saving the The Parent Account and click Add button")
    public void ıWouldBeSavingTheTheParentAccountAndClickAddButton() throws Throwable {
        corporateParentCustomerPage
                .clickAddParentButton();
    }

    @Then("I should be seeing that {string} {string} value characters are uppercase for Corporate Parent Account Page")
    public void ıShouldBeSeeingThatValueCharactersAreUppercaseForCorporateParentAccountPage(String value, String field) {
        corporateParentCustomerPage
                .controlValueField(value, field);
    }

    @Then("I should be seeing that {string} The Parent Account is created")
    public void ıShouldBeSeeingTheTheParentAccountIsCreated(String parentAccountName) throws Throwable {
        corporateParentCustomerPage
                .controlCreateParentAccount(parentAccountName);
    }

    @Then("I should be seeing the popup alert message {string} for Corporate Parent Account Page")
    public void ıShouldBeSeeingThePopupAlertMessageForCorporateParentAccountPage(String message) throws Throwable {
        corporateParentCustomerPage
                .controlPopupMessage(message);
    }

    @When("I click New Customer button for Corporate Parent Account Page")
    public void ıClickNewCustomerButtonForCorporateParentAccountPage() throws Throwable {
        corporateParentCustomerPage
                .clickNewCustomerButton();
    }

    @When("I enter a value {string} in the NIPT field for Corporate Parent Account Page")
    public void ıEnterAValueInTheNIPTFieldForCorporateParentAccountPage(String nipt) throws Throwable {
        corporateParentCustomerPage
                .enterNIPT(nipt);
    }

    @When("I enter a value {string} in the NIPT field and choose registered user for Corporate Parent Account Page")
    public void ıEnterAValueInTheNIPTFieldAndChooseRegisteredUserForCorporateParentAccountPage(String nipt) throws Throwable {
        corporateParentCustomerPage
                .enterNIPTForRegisteredUser(nipt);
    }

    @And("I click Search button for Corporate Parent Account Page")
    public void ıClickSearchButtonForCorporateParentAccountPage() throws Throwable {
        corporateParentCustomerPage
                .clickSearchButton();
    }

    @And("I click on related customer from search list for Corporate Parent Account Page")
    public void ıClickOnRelatedCustomerFromSearchListForCorporateParentAccountPage() throws Throwable {
        corporateParentCustomerPage
                .clickSearchList();
    }

    @And("I click {string} button")
    public void ıClickButton(String buttonName) throws InterruptedException {
        corporateParentCustomerPage
                .clickButton(buttonName);
    }
}
