package optiim.steps.api.products;

import optiim.api.testauto.TestAutoApi;
import optiim.framework.helpers.ApiHelper;
import optiim.framework.helpers.WorldHelper;
import optiim.framework.utils.log;
import optiim.models.data.api.ApiData;
import io.cucumber.java.en.When;

import java.io.IOException;

public class ProductsSteps extends ApiHelper {
    private final WorldHelper worldHelper;
    private final ApiData apiData;

    public ProductsSteps(WorldHelper worldHelper, ApiData apiData) {
        this.worldHelper = worldHelper;
        this.apiData = apiData;
    }

    @When("I Land Products Page {string}")
    public void landingPage(String page) throws IOException {
        TestAutoApi.landPage(page);
        log.info("Api worked.");
    }

    @When("I Search Product FullName {string}")
    public void searchProductFullName(String productName) throws IOException {
        TestAutoApi.searchProductFullName(productName);
        log.info("Api worked.");
    }

    @When("I Search Product with City {string}")
    public void searchProductwithCity(String cityName) throws IOException {
        TestAutoApi.searchProductwithCity(cityName);
        log.info("Api worked.");
    }

    @When("I Filter Catalog {string}")
    public void filterCatalog(String catalogName) throws IOException {
        TestAutoApi.filterCatalog(catalogName);
        log.info("Api worked.");
    }

    @When("I Multiple Filter Catalog {string} and {string}")
    public void filterMultipleCatalog(String catalogName1,String catalogName2) throws IOException {
        TestAutoApi.filterMultipleCatalog(catalogName1,catalogName2);
        log.info("Api worked.");
    }

}


