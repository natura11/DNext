package dnext.com.step_definitions.gui.createBusinessCustomerStepDefinition;

import com.utilities.Utils;
import dnext.com.pages.BasePage;
import dnext.com.pages.createBusinnesCustomerPages.GeneralInformationPage;
import dnext.com.pages.createBusinnesCustomerPages.OtherInformationPage;
import dnext.com.pages.createBusinnesCustomerPages.SearchOrganizationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;

import java.awt.*;

@AllArgsConstructor
@Log4j2
public class OtherInformationStepDefinition extends BasePage {

    private OtherInformationPage otherInformationPage;
    private GeneralInformationPage generalInformationPage;
    private SearchOrganizationPage searchOrganizationPage;

    @Then("User should see the values previously entered in the Organization Number field on Other Information Page")
    public void userShouldSeeTheValuesPreviouslyEnteredInTheCompanyNameAndOrganizationNumberAndIndustryFieldsFieldsOnOtherInformationPage() {
        String nonExistenceNiptNumberOnOtherInformation = searchOrganizationPage.nonExistenceNiptNumber;
        otherInformationPage.checkNiptNumber(nonExistenceNiptNumberOnOtherInformation);
    }

    @Then("User should see the values previously entered in the Industry field on Other Information Page")
    public void userShouldSeeTheValuesPreviouslyEnteredInTheIndustryFieldsOnOtherInformationPage() {
        otherInformationPage.checkIndustryFields();
    }

    @Then("User should see the values previously entered in the Company Name field on Other Information Page")
    public void userShouldSeeTheValuesPreviouslyEnteredInTheCompanyNameFieldsOnOtherInformationPage() {
        String companyNameFieldOnOtherInformation = generalInformationPage.companyNameFieldForEquals;
        otherInformationPage.checkCompanyName(companyNameFieldOnOtherInformation);
    }

    @When("User checks the Company Name field on the Other Information page")
    public void userChecksTheCompanyNameFieldOnTheOtherInformationPage() {
        otherInformationPage.seeCompanyName();
    }

    @When("User checks the Organization Number field on the Other Information page")
    public void userChecksTheOrganizationNumberFieldOnTheOtherInformationPage() {
        otherInformationPage.seeNiptNumber();
    }

    @When("User checks the Industry field on the Other Information page")
    public void userChecksTheIndustryFieldOnTheOtherInformationPage() {
        otherInformationPage.seeIndustryFields();
    }

    @When("User click Generate Form button on the Other Information page")
    public void userClickGenerateFormButtonOnTheOtherInformationPage() {
        otherInformationPage.clickGenerateButton();
    }

    @When("User adds a {string} of which format is image on Other Information page")
    public void userAddsAOfWhichFormatIsImageOnOtherInformationPage(String file) {
        uploadFile(otherInformationPage.addDocumentButtonOnOtherInformation, otherInformationPage.fileInputGeneralOnOtherInformation, file);
    }

    @Then("User should see the Generate Form open in a new window")
    public void userShouldSeeTheGenerateFormOpenInANewWindow() throws AWTException {
        otherInformationPage.checkOpenedForm();
    }

    @When("User click Save button on Other Information Page")
    public void userClickSaveButtonOnOtherInformationPage() {
        otherInformationPage.clickSaveButton();
    }

    @Then("User should see Customer Create popup on customer360")
    public void userShouldSeeCustomerCreatePopupOnCustomer360() {
        otherInformationPage.checkCustomerCreatePopup();
    }

    @Then("User should see the name of {string} added jpg document on the screen on Other Information page")
    public void userShouldSeeTheNameOfAddedJpgDocumentOnTheScreenOnOtherInformationPage(String fileName) {
        Assert.assertEquals(" ConsentForm-" + fileName, otherInformationPage.nameOfUploadedFileOnOther.getText());
    }
}