package optiim.steps.gui.productcatalog;

import optiim.framework.UrlBuilder;
import optiim.framework.helpers.WebDriverHelper;
import optiim.pages.productcatalog.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class HomePageSteps {
    private final WebDriverHelper webDriverHelper;
    private final UrlBuilder urlBuilder;
    private final HomePage homePage;


//    @When("I logout")
//    public void I_logout() throws Throwable {
//        homePage
//                .logout();
//    }

//    @Then("I should see home page")
//    public void I_should_see_home_page() throws Throwable {
//        homePage
//                .homePageControl();
//    }

    @Then("I should be seeing that the {string} page is opened for Product Catalog")
    public void I_should_be_seeing_that_the_page_is_opened_for_Product_Catalog(String titleName) throws Throwable {
        homePage
                .controlTitlePage(titleName);
    }

    @When("I click {string} in on the Product Catalog application")
    public void ıClickInOnTheProductCatalogApplication(String selectName) throws Throwable {
        homePage
                .clickButton(selectName);
    }

    @When("I click Search button")
    public void ıClickSearchButton() throws Throwable {
        homePage
                .clickSearchButton();
    }

    @And("I enter a value {string} in the Name Field")
    public void ıEnterAValueInTheNameField(String name) throws Throwable {
        homePage
                .enterName(name);
    }

    @And("I click on related offer from search list")
    public void ıClickOnRelatedOfferFromSearchList() throws Throwable {
        homePage
                .clickOnRelatedOffer();
    }
}
