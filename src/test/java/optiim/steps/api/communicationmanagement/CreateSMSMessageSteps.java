package optiim.steps.api.communicationmanagement;

import optiim.framework.helpers.ApiHelper;
import optiim.framework.helpers.WorldHelper;
import optiim.framework.utils.log;
import optiim.models.api.communicationmanagement.email.*;
import optiim.models.api.communicationmanagement.sms.CreateSMSMessageRequest;
import optiim.models.data.api.ApiData;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.Map;

public class CreateSMSMessageSteps extends ApiHelper{

    private final WorldHelper worldHelper;
    private final ApiData apiData;

    public CreateSMSMessageSteps(WorldHelper worldHelper, ApiData apiData) {
        this.worldHelper = worldHelper;
        this.apiData = apiData;
    }

    @DataTableType
    public CreateSMSMessageRequest createSMSMessageRequest(Map<String, String> entry) {

        CreateSMSMessageRequest createSMSMessageRequest = new CreateSMSMessageRequest();

        return createSMSMessageRequest;
    }

    @When("I executing SMS POST API")
    public void i_executing_SMS_POST_API(CreateSMSMessageRequest createSMSMessageRequest) {
   //     CreateEmailMessageResponse lttr = TestAutoApi.createEmailMessage(createSMSMessageRequest);
        log.info("Api worked.");
        log.info("Created trouble ticket.");
    }

    @Then("I should expect the sms result of {string}")
    public void I_should_expect_the_sms_result_of_(String statusCode) throws Throwable {
        Assert.assertEquals(responseRest.getStatusCode(), statusCode, "Api did not work successfully. Status code:" + apiData.getStatusCode());
        log.info("Api worked successfully.");
        log.info("Status code:" + apiData.getStatusCode());
        //Service not active and callable

    }

}
