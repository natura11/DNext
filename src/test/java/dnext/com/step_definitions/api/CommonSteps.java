package dnext.com.step_definitions.api;

import com.utilities.ApiBaseMethods;
import com.utilities.ApiTokenGenerator;
import com.utilities.ApiUtils;
import com.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.specification.RequestSpecification;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.datatable.DataTable;
import io.restassured.response.Response;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import java.util.List;
import java.util.Map;
import static io.restassured.RestAssured.given;



public class CommonSteps {

    Response response;
    public String token;
    public String fullEndpoint;
    String requestType;
    ApiUtils apiUtils ;
    static List<Map<String,String>> rows;
    static  String ApiBaseurl= ConfigurationReader.getProperty("apiBaseURI");


    @Given("Get Authorization for API")
    public void getAuthorizationForAPI() {
        token = ApiTokenGenerator.getAccessToken();
    }
    @When("Create an endpoint component")
    public void create_an_endpoint_component(DataTable dataTable) {
        String paths = "";
        rows = dataTable.asMaps(String.class, String.class);
        // index is starting from 0
        // first get is an index and it is line number
        // second get is column name on the table
        String endpoint = rows.get(0).get("Value");
        int lineSize = rows.size();
        System.out.println("lineSize = " + lineSize);
        if (lineSize>2){
            for (int i = 2; i < lineSize; i++) {
                if (rows.get(i).get("Type").equalsIgnoreCase("PathParam")){
                    paths = paths.concat("/");
                    paths = paths + rows.get(i).get("parameters");
                } else if (rows.get(i).get("Type").equalsIgnoreCase("QueryParam")) {
                    paths = paths.concat("?");
                    paths = paths + rows.get(i).get("Value") + "=" + rows.get(i).get("parameters");
                }
            }
        }
        requestType = rows.get(1).get("Value");
        fullEndpoint = ApiBaseurl+ endpoint + paths;
        System.out.println("fullEndpoint = " + fullEndpoint);

    }
    @When("Send a request")
    public void send_a_request() throws JsonProcessingException {
        //String postMethodName = rows.get(3).get("Value");
        String body = rows.get(2).get("parameters");
        if (requestType.equalsIgnoreCase("GET")) {
            response = ApiBaseMethods.getRequest(fullEndpoint, token);
            response.prettyPrint();
        }else if (requestType.equalsIgnoreCase("POST")){
            response = ApiBaseMethods.postRequest(fullEndpoint, token,body);
            response.prettyPrint();
        }else if (requestType.equalsIgnoreCase("PUT")){
            response = ApiBaseMethods.putRequest(fullEndpoint, token,body);
            response.prettyPrint();
        }else if (requestType.equalsIgnoreCase("DELETE")){
            response = ApiBaseMethods.deleteRequest(fullEndpoint, token);
            response.prettyPrint();
        }
    }

    @Then("Status code is {int}")
    public void statusCodeIs(int statusCode) {
        Assert.assertTrue(apiUtils.statusCode(statusCode,response));
        System.out.println("statusCode = " + statusCode);
    }

    //#######################################################################

}
