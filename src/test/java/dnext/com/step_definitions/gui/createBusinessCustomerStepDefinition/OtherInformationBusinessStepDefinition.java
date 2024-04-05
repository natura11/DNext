package dnext.com.step_definitions.gui.createBusinessCustomerStepDefinition;

import com.utilities.Utils;
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
    OtherInformationBusinessPage otherInformationBusinessPage;

    @When("User adds a {string} of which format is image on Other Information page")
    public void userAddsAOfWhichFormatIsImageOnOtherInformationPage(String file) {
        uploadFile(otherInformationBusinessPage.addDocumentButtonOnOtherInformation, otherInformationBusinessPage.fileInputGeneralOnOtherInformation, file);
    }


    @Then("User should see the name of {string} added jpg document on the screen on Other Information page")
    public void userShouldSeeTheNameOfAddedJpgDocumentOnTheScreenOnOtherInformationPage(String fileName) {
        Assert.assertEquals(" ConsentForm-" + fileName, otherInformationBusinessPage.nameOfUploadedFileOnOther.getText());
    }

    @Then("User is on the Business Other Information page")
    public void userIsOnTheBusinessOtherInformationPage() {
        otherInformationBusinessPage.verifyUserIsOnOtherInformationPage();
    }

    @Then("User should see the random customer data is fetched to input fields on Business Other Information Page")
    public void userShouldSeeTheRandomCustomerDataIsFetchedToInputFields() {
        otherInformationBusinessPage.verifyFetchedPersonData();
    }
}