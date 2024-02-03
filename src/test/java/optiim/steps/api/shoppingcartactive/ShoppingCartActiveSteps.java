package optiim.steps.api.shoppingcartactive;

import optiim.api.testauto.TestAutoApi;
import optiim.framework.helpers.WorldHelper;
import optiim.framework.utils.log;
import optiim.models.api.newagg.common.*;
import optiim.models.api.newagg.corporate.NewCreateCorporateCustomerRequest;
import optiim.models.api.newagg.corporate.OrganizationIdentification;
import optiim.models.api.newagg.corporate.reponse.NewCorporateCreateResponse;
import optiim.models.api.shoppingcartactive.ShoppingCartActive;
import optiim.models.api.shoppingcartactive.ShoppingCartActiveResponse;
import optiim.models.data.api.ApiData;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.io.IOException;
import java.text.ParseException;
import java.util.Map;


public class ShoppingCartActiveSteps {
    private final WorldHelper worldHelper;
    private final ApiData apiData;

    public ShoppingCartActiveSteps(WorldHelper worldHelper, ApiData apiData) {
        this.worldHelper = worldHelper;
        this.apiData = apiData;
    }

    @DataTableType
    public ShoppingCartActive shoppingCartActiveRequest(Map<String, String> entry) throws ParseException {

        log.info(entry.get("status"));

        ShoppingCartActive shoppingCartActive = new ShoppingCartActive();

        shoppingCartActive.setResult("PASSED");
        shoppingCartActive.setTicketId(worldHelper.getTicketId());


        return shoppingCartActive;
    }


    @When("I Create Shopping Cart Active Status")
    public void i_Create_Shopping_Cart_Active_Status(ShoppingCartActive shoppingCartActive) throws IOException, InterruptedException {
        ShoppingCartActiveResponse shoppingCartActiveResponse = TestAutoApi.shoppingCartActive(shoppingCartActive);
        worldHelper.setShoppingCartActiveResponse(shoppingCartActiveResponse);
        log.info("Api worked.");
        Thread.sleep(90000);
    }

}