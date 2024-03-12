package dnext.com.step_definitions.gui.createBusinessCustomerStepDefinition;

import dnext.com.pages.BasePage;
import dnext.com.pages.createBusinnesCustomerPages.AddressInformationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@AllArgsConstructor
@Log4j2
public class AddressInformationStepDefinition extends BasePage {
    private AddressInformationPage addressInformationPage;

    @And("User clicks next Button on Address Information Page")
    public void userClicksTheNextButtonOnAddressInformationPage() {
        addressInformationPage.nextBtnClickAddressInformation();
    }

    @Given("User enters valid {string} in to the Address Line 1 field on Address Information Page")
    public void userEntersValidInToTheAddressLineFieldOnAddressInformationPage(String arg0) {
        addressInformationPage.addressLine1Filled(arg0);
    }

    @And("User selects Berat as City on Address Information Page")
    public void userSelectsBeratAsCityOnAddressInformationPage() {
        addressInformationPage.selectCityOnAddressInformationPage();
    }
}