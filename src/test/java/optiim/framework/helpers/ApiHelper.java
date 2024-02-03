


package optiim.framework.helpers;


import com.google.common.reflect.TypeToken;
import com.google.gson.*;
import optiim.framework.UrlBuilder;
import optiim.framework.utils.log;
import optiim.models.api.customermanagement.AccountManagementResponse;
import optiim.models.api.login.CoaxLoginResponse;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import static optiim.framework.UrlBuilder.getBasePathURIDiamToken;
import static io.restassured.RestAssured.given;

/**
 * Every Api Step definition class should extend this class
 */

public class ApiHelper {
    private static Gson gson;
    public static Response responseRest;



    public static RequestSpecification givenConfigDCaseAPI() {
        RestAssured.baseURI = UrlBuilder.getBasePathURIDCaseAPI().toString();
        System.out.println("Rest Assured BaseURI: " + RestAssured.baseURI);
        RestAssured.useRelaxedHTTPSValidation();

        return given()
//                .header("Accept-Language", "en")
                .header("Content-Type", "application/json")
                .header("Accept", "application/json");
    }



    public static RequestSpecification givenTicketAPI() throws IOException {
        givenFixLogs();
        return given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("Authorization", "Bearer " + getDiamToken().replaceAll("\"", ""));
    }



    public static RequestSpecification givenOttUserAPI() throws IOException {
        return given()
                .header("Content-Type", "application/json")
                .header("Accept", "*/*")
                .header("Authorization", "Bearer " + getDiamToken().replaceAll("\"", ""));
    }

    public static RequestSpecification givenDocsisAPI() throws IOException {
        String serdar = "Bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJPeDZDODB2cF9vaDFrX2RiRE1kQzMyTjhkLVNCZkFOZFpzbXRfZGJIR2ZjIn0.eyJleHAiOjE2MTYwNzYwOTgsImlhdCI6MTYxNjA3NTQ5OCwianRpIjoiMjMzYzA3ZGMtY2UzOS00N2VkLTk4OTEtNzUxMTg5ZTc4ZmEyIiwiaXNzIjoiaHR0cHM6Ly9kaWFtLWRldi5kbmV4dC12ZmFsLmNvbS9hdXRoL3JlYWxtcy9kbmV4dCIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiJkMGI4ZjZmOC0wOTY1LTRmN2ItODU3YS0wY2M3NjMwZGRhMDAiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJkbmV4dC1jbGllbnQiLCJzZXNzaW9uX3N0YXRlIjoiODhhYmQwZjQtYjU4YS00ZDE3LTk0MjMtYmY2NWUzNTkyMzVkIiwiYWNyIjoiMSIsImFsbG93ZWQtb3JpZ2lucyI6WyIqIl0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJvZmZsaW5lX2FjY2VzcyIsInVtYV9hdXRob3JpemF0aW9uIl19LCJyZXNvdXJjZV9hY2Nlc3MiOnsiZG5leHQtY2xpZW50Ijp7InJvbGVzIjpbInVtYV9wcm90ZWN0aW9uIiwiZG5leHQtY2xpZW50LXJvbGUiXX0sImFjY291bnQiOnsicm9sZXMiOlsibWFuYWdlLWFjY291bnQiLCJtYW5hZ2UtYWNjb3VudC1saW5rcyIsInZpZXctcHJvZmlsZSJdfX0sInNjb3BlIjoicHJvZmlsZSBlbWFpbCIsImVtYWlsX3ZlcmlmaWVkIjpmYWxzZSwicHJlZmVycmVkX3VzZXJuYW1lIjoiZG5leHQifQ.Zc24m3s5bXlaVQWm8czgBe2OI5yjq2PVWUPSWwqushAco36WEP1PsV5FgMSa2f18YffCdlb6gLkIpYeJiuiiJ1m6rOuc095oPZNVYp7p2muYEsac3K-zlFj6n5_Tn4--pejxzL2MOW9SQZYNoJt6pnnXEadY8frjGliqr9ikYW-SkmQoH5hr69p84TJ1sWh3QJInGxDXjdlpcX6eNceRShOSeiQPNY8NTnojZV1OMV8iNCRmAiPP3j0FtBh0QGPUIsc51-B9k0H6kG2UY3_AcmpMt09BMDwpqVNboOuIw8illiaueZc8BoOQ4kSaXeLjrJ_bCLhYxOvb6Ln7bgMcXQ";

        return given()
                .header("Content-Type", "application/json")
                .header("Accept", "*/*")
                .header("Authorization", serdar);
    }

    public static String getDiamToken() throws IOException {
        HttpPost post = new HttpPost(getBasePathURIDiamToken());
        post.setHeader("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
        ArrayList<NameValuePair> parameters;
        parameters = new ArrayList<NameValuePair>();
        parameters.add(new BasicNameValuePair("grant_type", "password"));
        parameters.add(new BasicNameValuePair("client_id", "dnext-client"));
        parameters.add(new BasicNameValuePair("username", "orbitant"));
        parameters.add(new BasicNameValuePair("password", "orbitant123"));
        parameters.add(new BasicNameValuePair("client_secret", "02a86458-d330-49e9-9f74-f96bef53b345"));
        post.setEntity(new UrlEncodedFormEntity(parameters, "UTF-8"));
        CloseableHttpClient client = HttpClients.createDefault();
        CloseableHttpResponse response1 = client.execute(post);
        String result = EntityUtils.toString(response1.getEntity());

//        String responseString = responseRest.getBody().print();
        Gson gsonBuilderX = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).setPrettyPrinting().create();
        CoaxLoginResponse response = gsonBuilderX.fromJson(result, CoaxLoginResponse.class);

        return response.getAccessToken();
    }


    public static RequestSpecification givenConfigJIRAAPI() {
        RestAssured.baseURI = UrlBuilder.getBasePathURIDJIRAAPI().toString();
        System.out.println("Rest Assured BaseURI: " + RestAssured.baseURI);
        RestAssured.useRelaxedHTTPSValidation();
        return given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json");
    }

    public static RequestSpecification givenConfig() {
        RestAssured.baseURI = UrlBuilder.getBasePathURI().toString();
        System.out.println("Rest Assured BaseURI: " + RestAssured.baseURI);
        RestAssured.useRelaxedHTTPSValidation();

//        String encoding = Base64.getEncoder().encodeToString(("test".concat(":").concat("tEst123!")).getBytes(StandardCharsets.UTF_8));

        return given()
//                .header("Accept-Language", "en")
                .header("Content-Type", "application/json")
                .header("Accept", "application/json");
//                .header("Authorization", "Basic " + encoding);
    }



    //Specify all one time default Gson config
    public static Gson gson() {
        GsonBuilder gsonBuilder = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).setPrettyPrinting();
        gson = gson(gsonBuilder);
        return gson;
    }

    public static Gson gsonNoUnderscore() {
        GsonBuilder gsonBuilder = new GsonBuilder().setPrettyPrinting();
        gson = gson(gsonBuilder);
        return gson;
    }

    public static Gson gsonIdentity() {
        GsonBuilder gsonBuilder = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.IDENTITY).setPrettyPrinting();
        gson = gson(gsonBuilder);
        return gson;
    }


    //Custom Gson config to override Default Gson  configuration
    public static Gson gson(GsonBuilder gsonBuilder) {
        gson = gsonBuilder.create();
        return gson;
    }


    public static String postDocsis(String methodName, String url, Object req) throws JsonSyntaxException, IOException {
        log.info("Request for " + methodName + " " + gsonIdentity().toJson(req).replace("type","@type"));
        RestAssured.baseURI = UrlBuilder.getBasePathURIDocsis().toString();
        System.out.println("Rest Assured BaseURI: " + RestAssured.baseURI);
        RestAssured.useRelaxedHTTPSValidation();
        responseRest = givenDocsisAPI().
                body(gsonIdentity().toJson(req).replace("type","@type")).
                when().
                post(url);

        String responseString = responseRest.getBody().print();
        return responseString;
    }

    public static String retrieveServiceBy(String methodName, String url, String id,String macAddress) throws JsonSyntaxException, IOException {
        RestAssured.baseURI = UrlBuilder.getBasePathURIDocsis().toString();
        System.out.println("Rest Assured BaseURI: " + RestAssured.baseURI);
        RestAssured.useRelaxedHTTPSValidation();

        if(macAddress.equals("")){
            try {
                responseRest = givenDocsisAPI().when().get(url+"/" + id);
            }
            catch (HttpResponseException httpResponseException){
                return "404";
            }
        }
        if (id.equals("")) {
            try {
                responseRest = givenDocsisAPI().when().get(url + "/" + macAddress);
            } catch (HttpResponseException httpResponseException) {
                return "404";
            }
        }
        if (!macAddress.equals("") && !id.equals("")) {
            String test = url + "/{macAddress}";
            responseRest = givenDocsisAPI().param("id", id).
                    when().
                    get(test, macAddress);
        }

        String responseString = responseRest.getBody().print();
        return responseString;
    }

    public static String deleteServiceBy(String methodName, String url, String id) throws JsonSyntaxException, IOException {
        RestAssured.baseURI = UrlBuilder.getBasePathURIDocsis().toString();
        System.out.println("Rest Assured BaseURI: " + RestAssured.baseURI);
        RestAssured.useRelaxedHTTPSValidation();
        responseRest = givenDocsisAPI().
                when().delete(url+"/" + id);
        String responseString = responseRest.getBody().print();
        return responseString;
    }

    public static String getResponseNoMapping(String methodName, String url, Object req) throws JsonSyntaxException {
        log.info("Request for " + methodName + " " + gson().toJson(req));
        responseRest = givenConfigJIRAAPI().
                body(gson().toJson(req)).
                when().
                post(url);
        String responseString = responseRest.getBody().print();
        return responseString;
    }



    public static <T> List<T> getResponseGET(String methodName, String url,Class<T> resp) throws JsonSyntaxException, IOException {
        responseRest = givenTicketAPI().when().get(url);

        log.info("Status code:" + responseRest.getStatusCode());
        String responseString = responseRest.getBody().print();
        log.info("Returned Response:" + responseString);
        Gson gsonBuilderX = new GsonBuilder().setPrettyPrinting().create();
        Type collectionType = new TypeToken<List<T>>(){}.getType();
        List<T> response = gsonBuilderX.fromJson(responseString, collectionType);
        return response;
    }


    public static <T> T getTicket(String methodName, String url, Class<T> resp) throws JsonSyntaxException, IOException {
        Response responseRest;
        if(url.contains("gdc-pcs")){
            responseRest = givenGKSAPI().
                    when().
                    get(url);
        }
        else {
            responseRest = givenTicketAPI().
                    when().
                    get(url);
        }



        log.info("Status code:" + responseRest.getStatusCode());

        String responseString = responseRest.getBody().print();

        Gson gsonBuilderX = new GsonBuilder().setPrettyPrinting().create();
        T response = gsonBuilderX.fromJson(responseString, resp);

        return response;

    }

    public static int landingPageAPI(String methodName, String url) throws JsonSyntaxException, IOException {
        Response responseRest = givenDNextAPI().
                when().
                get(url);

        int responseCode = responseRest.getStatusCode();
        log.info("Status code:" + responseCode);
        String responseString = responseRest.getBody().print();
        return responseCode;
    }

    public static String removeTicket(String methodName, String url,String ticketNumber) throws JsonSyntaxException, IOException {
        RestAssured.baseURI = UrlBuilder.getBasePathURISellCoaxAPI().toString();
        System.out.println("Rest Assured BaseURI: " + RestAssured.baseURI);
        RestAssured.useRelaxedHTTPSValidation();
        String test = url + "/{ticket_id}";
        try {
            responseRest = givenTicketAPI().
                    when().
                    delete(test, ticketNumber);
        }catch (HttpResponseException httpResponseException){
            return "404";
        }

        String responseString = responseRest.getBody().print();
        return responseString;
    }

    public static int getCustomerListAPI(String methodName, String url) throws JsonSyntaxException, IOException {
        responseRest = givenDNextAPI().
                when().
                get(url);

        int responseCode = responseRest.getStatusCode();
        log.info("Status code:" + responseCode);
        String responseString = responseRest.getBody().print();
        return responseCode;
    }

    public static int customerSearchViaNewCustomerCreationAPI(String methodName, String url) throws JsonSyntaxException, IOException {
        Response responseRest = givenDNextAPI().
                when().
                get(url);

        int responseCode = responseRest.getStatusCode();

        log.info("Status code:" + responseCode + " Request for " + methodName);
        String responseString = responseRest.getBody().print();
        return responseCode;
    }

    public static String customerSearchAggregated(String methodName, String url) throws JsonSyntaxException, IOException {
        Response responseRest = givenDNextAPI().
                when().
                get(url);

        int responseCode = responseRest.getStatusCode();

        log.info("Status code:" + responseCode + " Request for " + methodName);
        String responseString = responseRest.getBody().print();
        return responseString;
    }

    public static <T> T customerSearchViaNewCustomerCreationAPIExt(String methodName, String url,Class<T> resp) throws JsonSyntaxException, IOException {
        Response responseRest = givenTicketAPI().
                when().
                get(url);

        log.info("Status code:" + responseRest.getStatusCode() + " Request for " + methodName);
        String responseString = responseRest.getBody().print();
        Gson gsonBuilderX = new GsonBuilder().setPrettyPrinting().create();
        T response = gsonBuilderX.fromJson(responseString, resp);
        return response;
    }




    public static RequestSpecification givenCustomerAPI() throws IOException {
        givenFixLogs();
        return given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("Authorization", "Bearer " + getDiamToken().replaceAll("\"", ""));
    }

    public static RequestSpecification givenGKSAPI() throws IOException {
//        givenFixLogs();
        return given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("Authorization", "Bearer " + getDiamToken().replaceAll("\"", ""));

    }

    public static <T> T getResponse2GET(String methodName, String url, Class<T> resp) throws JsonSyntaxException {

//        log.info("Request for "+ methodName + " " + gson().toJson(req));

        responseRest = givenConfigDCaseAPI().
                when().
                get(url);

        log.info("Status code:" + responseRest.getStatusCode());

        String responseString = responseRest.getBody().print();

        Gson gsonBuilderX = new GsonBuilder().setPrettyPrinting().create();
        T response = gsonBuilderX.fromJson(responseString, resp);

        return response;

    }






    //*************************************Finalized APIs*********************************************
    public static RequestSpecification givenDNextAPI() throws IOException {
        givenFixLogs();
        return given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json");
    }

    public static <T> List<T> getResponseList(String methodName, String url,Class<T> resp) throws JsonSyntaxException, IOException {
        Response responseRest = givenTicketAPI().when().get(url);

        log.info("Status code:" + responseRest.getStatusCode() + " Request for " + methodName);
        String responseString = responseRest.getBody().print();
        log.info("Returned Response:" + responseString);
        Gson gsonBuilderX = new GsonBuilder().setPrettyPrinting().create();
        Type collectionType = new TypeToken<List<T>>(){}.getType();
        List<T> response = gsonBuilderX.fromJson(responseString, collectionType);


        for(int i=0; i < response.size(); i++) {
            JsonObject jsonObject = gsonBuilderX.toJsonTree(response.get(i)).getAsJsonObject();
            AccountManagementResponse accountManagementResponse = gsonBuilderX.fromJson(jsonObject, AccountManagementResponse.class);
            response.remove(i);
            response.add(i, (T) accountManagementResponse);
        }


        return response;
    }

//    public static <T> List<T> postResponseListTicket(String methodName, String url,Object req,Class<T> resp) throws JsonSyntaxException, IOException {
//        log.info("Request for " + methodName + " " + gsonIdentity().toJson(req).replace("referredType","@referredType"));
//        Response responseRest = givenTicketAPI().
//                body(gsonIdentity().toJson(req).replace("referredType","@referredType")).
//                when().
//                post(url);
//        log.info("Status code:" + responseRest.getStatusCode() + " Request for " + methodName);
//        String responseString = responseRest.getBody().print();
//        log.info("Returned Response:" + responseString);
//        Gson gsonBuilderX = new GsonBuilder().setPrettyPrinting().create();
//        Type collectionType = new TypeToken<List<T>>(){}.getType();
//        List<T> response = gsonBuilderX.fromJson(responseString, collectionType);
//
//
//        for(int i=0; i < response.size(); i++) {
//            JsonObject jsonObject = gsonBuilderX.toJsonTree(response.get(i)).getAsJsonObject();
////            AccountManagementResponse accountManagementResponse = gsonBuilderX.fromJson(jsonObject, (Type) resp);
//            response.remove(i);
//            response.add(i, (T) gsonBuilderX.fromJson(jsonObject, (Type) resp));
//        }
//        return response;
//    }

    public static <T> T postResponseSingle(String methodName, String url, Object req, Class<T> resp) throws JsonSyntaxException, IOException {
        log.info("Request for " + methodName + " " + gsonIdentity().toJson(req).replace("referredType","@referredType").replace("type","@type"));
        Response responseRest;
        if(url.contains("serdar")){
             responseRest = givenGKSAPI().
                    body(gsonIdentity().toJson(req).replace("referredType", "@referredType").replace("type","@type")).
                    when().
                    post(url);
        }
        else {
             responseRest = givenCustomerAPI().
                     body(gsonIdentity().toJson(req).replace("referredType", "@referredType").replace("type","@type")).
//                     body(gsonIdentity().toJson(req).replace("baseType", "@baseType")).
//                     body(gsonIdentity().toJson(req).replace("type", "@type")).
                    when().
                    post(url);
        }
        String responseString = responseRest.getBody().print();
        System.out.println("response API Call" + responseString);
        System.out.println("Status Code: " + responseRest.getStatusCode());
//        Gson gsonBuilderX = new GsonBuilder().setPrettyPrinting().create();
//        GsonBuilder gsonBuilder = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.IDENTITY).setPrettyPrinting();

        FieldNamingStrategy customPolicy = new FieldNamingStrategy() {
            @Override
            public String translateName(Field f) {
                if(f.getName().contains("baseType")){
                    return f.getName().replace("baseType", "@baseType");
                }
                if(f.getName().contains("type")){
                    return f.getName().replace("type", "@type");

                }
                if(f.getName().contains("schemaLocation")){
                    return f.getName().replace("schemaLocation", "@schemaLocation");

                }
                if(f.getName().contains("referredType")){
                    return f.getName().replace("referredType", "@referredType");

                }
                return f.getName();
            }
        };

        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setFieldNamingStrategy(customPolicy);
        Gson gson = gsonBuilder.create();


        T response = gson.fromJson(responseString, resp);
        return response;
    }

    public static <T> T postResponseSingleTicket(String methodName, String url, Object req, Class<T> resp) throws JsonSyntaxException, IOException {
        log.info("Request for " + methodName + " " + gsonIdentity().toJson(req).replace("referredType","@referredType"));
        Response responseRest;
        if(url.contains("gdc-pcs")){
            responseRest = givenGKSAPI().
                    body(gsonIdentity().toJson(req).replace("referredType", "@referredType")).
                    when().
                    post(url);
        }
        else {
            responseRest = givenCustomerAPI().
                    body(gsonIdentity().toJson(req).replace("referredType", "@referredType")).
                    when().
                    post(url);
        }

        String responseString = responseRest.getBody().print();
        Gson gsonBuilderX = new GsonBuilder().setPrettyPrinting().create();
        T response = gsonBuilderX.fromJson(responseString, resp);
        return response;
    }



    public static void givenFixLogs() throws IOException {
        RestAssured.baseURI = UrlBuilder.getBasePathURIDNext().toString();
        System.out.println("Rest Assured BaseURI: " + RestAssured.baseURI);
        RestAssured.useRelaxedHTTPSValidation();
    }


    public static <T> List<T> getMigrationResponseGET(String methodName, String url,Class<T> resp) throws JsonSyntaxException, IOException {

        Response responseRest = givenTicketAPI().when().get(url);

        log.info(url);
        log.info("https://dpam-api.sit1.dnext.al.vodafone.com/api/partyManagement/v4/individual?sort=-createdDate&givenName*=%25XXX%25&limit=10&fields=id");
        log.info("Status code:" + responseRest.getStatusCode());
        String responseString = responseRest.getBody().print();
        log.info("Returned Response:" + responseString);

        Gson gsonBuilderX = new GsonBuilder().setPrettyPrinting().create();
        Type collectionType = new TypeToken<List<T>>(){}.getType();
        List<T> response = gsonBuilderX.fromJson(responseString,collectionType);


        return response;
    }

    public static <T> List<T> getOrderCompletedCustomerResponseGET(String methodName, String url,Class<T> resp) throws JsonSyntaxException, IOException {

        Response responseRest = givenTicketAPI().when().get(url);

        log.info(url);
        log.info("Status code:" + responseRest.getStatusCode());
        String responseString = responseRest.getBody().print();
        log.info("Returned Response:" + responseString);

        Gson gsonBuilderX = new GsonBuilder().setPrettyPrinting().create();
        Type collectionType = new TypeToken<List<T>>(){}.getType();
        List<T> response = gsonBuilderX.fromJson(responseString,collectionType);


        return response;
    }

}