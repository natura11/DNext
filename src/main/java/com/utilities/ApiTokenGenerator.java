package com.utilities;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


public class ApiTokenGenerator {
    public static String getAccessToken() {

        //RestAssured.defaultParser = Parser.JSON;
        Response response = RestAssured.given()
                .param("client_id", ConfigurationReader.getProperty("client_id"))
                .param("client_secret", ConfigurationReader.getProperty("client_secret"))
                .param("grant_type", ConfigurationReader.getProperty("grant_type"))
                .param("username", ConfigurationReader.getProperty("APIusername"))
                .param("password", ConfigurationReader.getProperty("APIpassword"))
                .when()
                .post(ConfigurationReader.getProperty("accessTokenUrl"));

        // Yanıtı kontrol et
        if (response.getStatusCode() != 200) {
            System.out.println("Fail Code: " + response.getStatusCode());
            System.out.println("Fail Message: " + response.getBody().asString());
            return null;

        }

        // JSON yanıtını işle
        JsonPath jsonPath = response.jsonPath();
        String accessToken = jsonPath.getString("access_token");
        String finalToken= "Bearer " + accessToken;
        System.out.println("finalToken = " + finalToken);
        return finalToken;

}

}
