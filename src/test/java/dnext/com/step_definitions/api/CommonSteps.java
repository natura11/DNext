package dnext.com.step_definitions.api;

import com.utilities.ApiBaseMethods;
import com.utilities.ApiTokenGenerator;
import com.utilities.ApiUtils;
import com.utilities.ConfigurationReader;
import dnext.com.pages.BasePage;
import dnext.com.pages.customer360Pages.FiscalizationReceiptsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.datatable.DataTable;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.List;
import java.util.Map;




public class CommonSteps extends BasePage {

    Response response;
    public String token;
    public String fullEndpoint;
    String requestType;
    public String body;
    ApiUtils apiUtils;
    static List<Map<String, String>> rows;
    static String ApiBaseURI = ConfigurationReader.getProperty("apiBaseURI");
    static String ApiCamundaBaseURI = ConfigurationReader.getProperty("apiCamundaBaseURI");
    static String ApiBrmBaseURI = ConfigurationReader.getProperty("apiBrmBaseURI");
    static String FiscalizationBaseURI = ConfigurationReader.getProperty("fiscalizationBaseURI");
    static String ApiGeoAdressURI = ConfigurationReader.getProperty("apiGeoAdressURI");
    static String getOrderId;





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
        if (endpoint.equalsIgnoreCase("getFromPost")) {
            endpoint = getOrderId;
        } else if (endpoint.equalsIgnoreCase("getFromFiscalization")) {
            endpoint = paymentIdOfFiscalizationDetail.getText().trim();
        } else if (endpoint.equalsIgnoreCase("getFromVtvForFiscalization")) {
            endpoint = paymentIdOfFiscalizationDetail.getText().trim();
        } else if (endpoint.equalsIgnoreCase("getCryptoguard_ForFiscalization")) {
            endpoint = paymentIdOfFiscalizationDetail.getText().trim();
        } else if (endpoint.equalsIgnoreCase("getOrderDetailForCoaxialPostpaid")) {
            endpoint = orderIdForCoaxial.getAttribute("innerText");
        } else if (endpoint.equalsIgnoreCase("getCoaxialPrepaid_ForFiscalization")) {
            endpoint = paymentIdOfFiscalizationDetail.getText().trim();
        }else if (endpoint.equalsIgnoreCase("getBundleCoaxialPrepaid_ForFiscalization")) {
                endpoint = paymentIdOfFiscalizationDetail.getText().trim();

        }



        int lineSize = rows.size();
        System.out.println("lineSize = " + lineSize);
        if (lineSize > 4) {
            for (int i = 3; i < lineSize; i++) {
                if (rows.get(i).get("Type").equalsIgnoreCase("PathParam")) {
                    paths = paths.concat("/");
                    paths = paths + rows.get(i).get("parameters");
                } else if (rows.get(i).get("Type").equalsIgnoreCase("QueryParam")) {
                    paths = paths.concat("?");
                    paths = paths + rows.get(i).get("Value") + "=" + rows.get(i).get("parameters");
                }
            }
        }

        requestType = rows.get(1).get("Value");
        String baseURIParameter = rows.get(3).get("Value");
        if (baseURIParameter.equalsIgnoreCase("apiBaseURI")) {
            fullEndpoint = ApiBaseURI + endpoint + paths;
        } else if (baseURIParameter.equalsIgnoreCase("apiCamundaBaseURI")) {
            fullEndpoint = ApiCamundaBaseURI + endpoint + paths;
        } else if (baseURIParameter.equalsIgnoreCase("apiBrmBaseURI")) {
            fullEndpoint = ApiBrmBaseURI + endpoint + paths;
        } else if (baseURIParameter.equalsIgnoreCase("apiGeoAdressURI")) {
            fullEndpoint = ApiGeoAdressURI + endpoint + paths;
        }else if (baseURIParameter.equalsIgnoreCase("fiscalizationBaseURI")) {
            fullEndpoint = FiscalizationBaseURI + endpoint + paths;
        }




    }



    @When("Send a request")
    public void send_a_request() throws JsonProcessingException {
        //String postMethodName = rows.get(3).get("Value");
        body = rows.get(2).get("parameters");
        if (requestType.equalsIgnoreCase("GET")) {
            response = ApiBaseMethods.getRequest(fullEndpoint, token);
            response.prettyPrint();
        } else if (requestType.equalsIgnoreCase("POST")) {
            response = ApiBaseMethods.postRequest(fullEndpoint, token, body);
            response.prettyPrint();
            getOrderId = response.asString();
            System.out.println("getOrderId = " + getOrderId);
        } else if (requestType.equalsIgnoreCase("PUT")) {
            response = ApiBaseMethods.putRequest(fullEndpoint, token, body);
            response.prettyPrint();
        } else if (requestType.equalsIgnoreCase("DELETE")) {
            response = ApiBaseMethods.deleteRequest(fullEndpoint, token);
            response.prettyPrint();
        } else if (requestType.equalsIgnoreCase("GET_RequestBill")) {
            response = ApiBaseMethods.getRequestBillingAddressOnBrm(fullEndpoint, token);
            response.prettyPrint();
        }else if (requestType.equalsIgnoreCase("getRequestForFiscalization")) {
            response = ApiBaseMethods.getRequestForFiscalization(fullEndpoint, token);
            //response.prettyPrint();
        }else if (requestType.equalsIgnoreCase("getRequestOfVtvForFiscalization")) {
            response = ApiBaseMethods.getRequestOfVtvForFiscalization(fullEndpoint, token);
            //response.prettyPrint();
        }else if (requestType.equalsIgnoreCase("getRequestOfCryptoguardForFiscalization")) {
            response = ApiBaseMethods.getRequestOfCryptoguardForFiscalization(fullEndpoint, token);
            //response.prettyPrint();
        }else if (requestType.equalsIgnoreCase("getRequestOfCoaxialBrmOrder")) {
            response = ApiBaseMethods.getRequestOfCoaxialBrmOrder(fullEndpoint, token);
            response.prettyPrint();
        }else if (requestType.equalsIgnoreCase("getRequestOfCoaxialPrepaidForFiscalization")) {
            response = ApiBaseMethods.getRequestOfCoaxialPrepaidForFiscalization(fullEndpoint, token);
            //response.prettyPrint();
        }else if (requestType.equalsIgnoreCase("getRequestOfBundleCoaxialPrepaidForFiscalization")) {
            response = ApiBaseMethods.getRequestOfBundleCoaxialPrepaidForFiscalization(fullEndpoint, token);
            //response.prettyPrint();
        }






    }

    @Then("Status code is {int}")
    public void statusCodeIs(int statusCode) {
        Assert.assertTrue(apiUtils.statusCode(statusCode, response));
        System.out.println("statusCode = " + statusCode);
    }


    //#######################################################################

}
