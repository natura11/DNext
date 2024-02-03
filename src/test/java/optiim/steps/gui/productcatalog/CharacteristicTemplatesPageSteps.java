package optiim.steps.gui.productcatalog;

import optiim.framework.UrlBuilder;
import optiim.framework.helpers.WebDriverHelper;
import optiim.pages.productcatalog.CharacteristicTemplatesPage;
import io.cucumber.java.en.When;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class CharacteristicTemplatesPageSteps {
    private final WebDriverHelper webDriverHelper;
    private final CharacteristicTemplatesPage characteristicTemplatesPage;
    private final UrlBuilder urlBuilder;


    @When("I enter a name {string} in the name field")
    public void iEnterANameInTheNameField(String name) throws InterruptedException {
        characteristicTemplatesPage
                .enterName(name);
    }

    @When("I enter a text {string} in the description field")
    public void iEnterATextInTheDescriptionField(String desc) throws InterruptedException {
        characteristicTemplatesPage
                .enterDesc(desc);
    }

    @When("I click add icon in the New Characteristic page")
    public void iClickAddIconInTheNewCharacteristicPage() {
        characteristicTemplatesPage
                .addIcon();
    }

    @When("I select start date time in the start date time field")
    public void iSelectStartDateTimeInTheStartDateTimeField() throws InterruptedException {
        characteristicTemplatesPage
                .enterStartDateTime();
    }

    @When("I select end date time in the end date time field")
    public void iSelectEndDateTimeInTheEndDateTimeField() throws InterruptedException {
        characteristicTemplatesPage
                .enterEndDateTime();
    }
}
