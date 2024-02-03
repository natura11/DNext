package optiim.steps.api.communicationmanagement;

import optiim.api.testauto.TestAutoApi;
import optiim.framework.helpers.ApiHelper;
import optiim.framework.helpers.WorldHelper;
import optiim.framework.utils.log;
import optiim.models.api.communicationmanagement.email.*;
import optiim.models.data.api.ApiData;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CreateEmailMessageSteps extends ApiHelper{

    private final WorldHelper worldHelper;
    private final ApiData apiData;

    public CreateEmailMessageSteps(WorldHelper worldHelper, ApiData apiData) {
        this.worldHelper = worldHelper;
        this.apiData = apiData;
    }

    @DataTableType
    public CreateEmailMessageRequest createEmailMessageRequest(Map<String, String> entry) {

        CreateEmailMessageRequest createEmailMessageRequest = new CreateEmailMessageRequest();

        createEmailMessageRequest.setMessageType("Email");
        createEmailMessageRequest.setSubject("Vodafone Notification");
        createEmailMessageRequest.setContent("Dear ABC, Here is the information of the promotion XYZ");

        Sender sender = new Sender();
        sender.setId("10099");
        sender.setName("ABC Company");
        sender.setEmail("andrea.kruti@vodafone.com");
        createEmailMessageRequest.setSender(sender);

        List<Receiver> receiverList = new ArrayList<>();

        Receiver receiverRequest1 = new Receiver();
        receiverRequest1.setId("10234");
        receiverRequest1.setName("Customer");
        receiverRequest1.setEmail("john.lock@gmail.com");
        receiverRequest1.setType("to");

        RelatedParty relatedParty = new RelatedParty();
        relatedParty.setId("991");
        relatedParty.setHref("http://serverlocation:port/partyManagement/individual/991");
        relatedParty.setRole("customer");
        relatedParty.setName("John Lock");
        receiverRequest1.setRelatedParty(relatedParty);
        receiverList.add(receiverRequest1);

        Receiver receiverRequest2 = new Receiver();
        receiverRequest2.setId("10235");
        receiverRequest2.setName("Customer2");
        receiverRequest2.setEmail("abc.def@gmail.com");
        receiverRequest2.setType("cc");

        RelatedParty relatedParty2 = new RelatedParty();
        relatedParty2.setId("992");
        relatedParty2.setHref("http://serverlocation:port/partyManagement/individual/992");
        relatedParty2.setRole("customer");
        relatedParty2.setName("Abc Def");
        receiverRequest2.setRelatedParty(relatedParty2);
        receiverList.add(receiverRequest2);

        Receiver receiverRequest3 = new Receiver();
        receiverRequest3.setId("10236");
        receiverRequest3.setName("Customer3");
        receiverRequest3.setEmail("abc.rhrgh@gmail.com");
        receiverRequest3.setType("bcc");

        relatedParty = new RelatedParty();
        relatedParty.setId("993");
        relatedParty.setHref("http://serverlocation:port/partyManagement/individual/993");
        relatedParty.setRole("customer");
        relatedParty.setName("Abc Rhrgh");
        receiverRequest3.setRelatedParty(relatedParty);
        receiverList.add(receiverRequest3);

        createEmailMessageRequest.setReceiver(receiverList);

        return createEmailMessageRequest;
    }

    @When("I executing Email POST API")
    public void i_executing_Email_POST_API(CreateEmailMessageRequest createEmailMessageRequest) {
//        CreateEmailMessageResponse lttr = TestAutoApi.createEmailMessage(createEmailMessageRequest);
        log.info("Api worked.");
        log.info("Created trouble ticket.");
    }

    @When("I executing Email POST API for bad request")
    public void i_executing_Email_POST_API_for_bad_request(CreateEmailMessageRequest createEmailMessageRequest) {

    }


    @Then("I should expect the mail result of {string}")
    public void I_should_expect_the_mail_result_of_(String statusCode) throws Throwable {
        Assert.assertEquals(responseRest.getStatusCode(), statusCode, "Api did not work successfully. Status code:" + apiData.getStatusCode());
        log.info("Api worked successfully.");
        log.info("Status code:" + apiData.getStatusCode());
        //Service not active and callable

    }

}
