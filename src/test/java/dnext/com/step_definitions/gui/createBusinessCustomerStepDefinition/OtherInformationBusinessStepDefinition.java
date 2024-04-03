package dnext.com.step_definitions.gui.createBusinessCustomerStepDefinition;

import dnext.com.pages.BasePage;
import dnext.com.pages.createBusinessCustomerPages.GeneralInformationBusinessPage;
import dnext.com.pages.createBusinessCustomerPages.OtherInformationBusinessPage;
import dnext.com.pages.createBusinessCustomerPages.SearchOrganizationBusinessPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;

import java.awt.*;

@AllArgsConstructor
@Log4j2
public class OtherInformationBusinessStepDefinition extends BasePage {
    private OtherInformationBusinessPage otherInformationBusinessPage;
    private GeneralInformationBusinessPage generalInformationBusinessPage;
    private SearchOrganizationBusinessPage searchOrganizationBusinessPage;

    @Then("User should see the values previously entered in the Organization Number field on Other Information Page")
    public void userShouldSeeTheValuesPreviouslyEnteredInTheCompanyNameAndOrganizationNumberAndIndustryFieldsFieldsOnOtherInformationPage() {
        String nonExistenceNiptNumberOnOtherInformation = searchOrganizationBusinessPage.nonExistenceNiptNumber;
        otherInformationBusinessPage.checkNiptNumber(nonExistenceNiptNumberOnOtherInformation);
    }

    @Then("User should see the values previously entered in the Industry field on Other Information Page")
    public void userShouldSeeTheValuesPreviouslyEnteredInTheIndustryFieldsOnOtherInformationPage() {
        otherInformationBusinessPage.checkIndustryFields();
    }

    @Then("User should see the values previously entered in the Company Name field on Other Information Page")
    public void userShouldSeeTheValuesPreviouslyEnteredInTheCompanyNameFieldsOnOtherInformationPage() {
        String companyNameFieldOnOtherInformation = generalInformationBusinessPage.companyNameFieldForEquals;
        otherInformationBusinessPage.checkCompanyName(companyNameFieldOnOtherInformation);
    }

    @When("User checks the Company Name field on the Other Information page")
    public void userChecksTheCompanyNameFieldOnTheOtherInformationPage() {
        otherInformationBusinessPage.seeCompanyName();
    }

    @When("User checks the Organization Number field on the Other Information page")
    public void userChecksTheOrganizationNumberFieldOnTheOtherInformationPage() {
        otherInformationBusinessPage.seeNiptNumber();
    }

    @When("User checks the Industry field on the Other Information page")
    public void userChecksTheIndustryFieldOnTheOtherInformationPage() {
        otherInformationBusinessPage.seeIndustryFields();
    }

    @When("User click Generate Form button on the Other Information page")
    public void userClickGenerateFormButtonOnTheOtherInformationPage() {
        otherInformationBusinessPage.clickGenerateButton();
    }

    @When("User adds a {string} of which format is image on Other Information page")
    public void userAddsAOfWhichFormatIsImageOnOtherInformationPage(String file) {
        uploadFile(otherInformationBusinessPage.addDocumentButtonOnOtherInformation, otherInformationBusinessPage.fileInputGeneralOnOtherInformation, file);
    }

    @Then("User should see the Generate Form open in a new window")
    public void userShouldSeeTheGenerateFormOpenInANewWindow() throws AWTException {
        otherInformationBusinessPage.checkOpenedForm();
    }

    @When("User click Save button on Other Information Page")
    public void userClickSaveButtonOnOtherInformationPage() {
        otherInformationBusinessPage.clickSaveButton();
    }

    @Then("User should see Customer Create popup on customer360")
    public void userShouldSeeCustomerCreatePopupOnCustomer360() {
        otherInformationBusinessPage.checkCustomerCreatePopup();
    }

    @Then("User should see the name of {string} added jpg document on the screen on Other Information page")
    public void userShouldSeeTheNameOfAddedJpgDocumentOnTheScreenOnOtherInformationPage(String fileName) {
        Assert.assertEquals(" ConsentForm-" + fileName, otherInformationBusinessPage.nameOfUploadedFileOnOther.getText());
    }
}