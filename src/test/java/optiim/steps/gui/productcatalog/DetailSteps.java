package optiim.steps.gui.productcatalog;


import optiim.framework.UrlBuilder;
import optiim.framework.helpers.WebDriverHelper;
import optiim.pages.productcatalog.DetailPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class DetailSteps {

    private final WebDriverHelper webDriverHelper;
    private final UrlBuilder urlBuilder;
    private final DetailPage detailPage;

    @When("I click {string} tab on Offering Price Detail Page")
    public void I_click_tab_on_Offering_Price_Detail_Page(String tabName) throws Throwable {
        detailPage
                .clickTab(tabName);
    }


    @Then("I should be seeing that the {string} dropdown list is opened")
    public void ıShouldBeSeeingThatTheDropdownListIsOpened(String fieldName) {
        detailPage
                .controlField(fieldName);
    }

    @Then("I should be seeing that {string},{string},{string} values are displayed for Currency field")
    public void ıShouldBeSeeingThatValuesAreDisplayedForCurrencyField(String fieldOne, String fieldTwo, String fieldThree) throws Throwable {
        detailPage
                .controlCurrencyField(fieldOne,fieldTwo,fieldThree);
    }

    @When("I click Add button on the Tab for Product Catalog")
    public void ıClickAddButtonOnTheTabForProductCatalog() throws Throwable {
        detailPage
                .clickAddButton();
    }

    @Then("I should be seeing that {string} field in the Search Popup")
    public void ıShouldBeSeeingThatFieldInTheSearchPopup(String fieldName) {
        detailPage
                .controlSearchPopupField(fieldName);
    }
}
