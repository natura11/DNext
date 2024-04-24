package com.utilities;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.path.json.exception.JsonPathException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.path.json.exception.JsonPathException;
import io.restassured.response.Response;
import lombok.extern.log4j.Log4j2;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
@Log4j2
public class ApiBaseMethods {
    public static Response getRequest(String endpoint, String token) {
        defaultParser = Parser.JSON;
        baseURI = endpoint;
        Response r = null;
        System.out.println("baseURI: " + baseURI);
        try {
            r = given().headers("Content-Type", " application/json", "Authorization", token)
                    .when()
                    .get(baseURI)
                    .then()
//                    .statusCode(200)
//                    .header("Date", notNullValue())
//                    .and()
//                    .body("data", notNullValue())
//                    .body("status", is("SUCCESS"))
//                    .body("code", is("SUCCESS"))
                    .and()
//                    .contentType("application/json;charset=UTF-8")
                    .log().all()
                    .extract().response();
        } catch (Exception e) {
            throw new JsonPathException("Failed to parse the JSON document", e);
        }
        RestAssured.reset();
        return r;
    }


    public static Response postRequest(String endpoint, String token, String body) {
        defaultParser = Parser.JSON;
        baseURI = endpoint;
        Response r = null;
        System.out.println("baseURI : " + baseURI);
        System.out.println("body : " + body);
        try {
            r = given().headers("Content-Type", ContentType.JSON, "Accept", ContentType.JSON, "Authorization", token).
                    body(body).
                    when()
                    .post(baseURI).
                    then()
//                    .header("Date", notNullValue())
//                    .and()
//                    .body("status", is("SUCCESS"))
//                    .body("code", is("SUCCESS"))
//                    .contentType("application/json;charset=UTF-8")
                    .log().all()
                    .extract().response();

        } catch (Exception e) {
            throw new JsonPathException("Failed to parse the JSON document", e);
        }
        //  RestAssured.reset();
        return r;

    }

    public static Response putRequest(String endpoint, String token, String requestBody) {
        defaultParser = Parser.JSON;
        baseURI = endpoint;
        Response r = null;
        System.out.println("baseURI: " + baseURI);
        try {
            r = given().headers("Content-Type", "application/json", "Authorization", token)
                    .body(requestBody)
                    .when()
                    .put(baseURI)
                    .then()
//                    .header("Date", notNullValue())
//                    .and()
//                    .body("data", notNullValue())
//                    .body("status", is("SUCCESS"))
//                    .body("code", is("SUCCESS"))
//                    .body("message", is("Resource updated"))
//                    .contentType("application/json;charset=UTF-8")
                    .log().all()
                    .contentType(ContentType.JSON)
                    .extract().response();
        } catch (Exception e) {
            throw new JsonPathException("Failed to parse the JSON document", e);
        }
        RestAssured.reset();
        return r;
    }

    public static Response deleteRequest(String endpoint, String token) {
        defaultParser = Parser.JSON;
        baseURI = endpoint;
        Response r = null;
        System.out.println("baseURI: " + baseURI);
        try {
            r = given().headers("Content-Type", "application/json", "Authorization", token)
                    .when()
                    .delete(baseURI)
                    .then()
//                    .statusCode(200)
//                    .header("Date", notNullValue())
//                    .and()
//                    .body("status", is("SUCCESS"))
//                    .body("code", is("SUCCESS"))
//                    //.body("message", is("Resource deleted"))
                    .and()
                    .contentType("application/json;charset=UTF-8")
                    .log().all()
                    .contentType(ContentType.JSON)
                    .extract().response();
        } catch (Exception e) {
            throw new JsonPathException("Failed to parse the JSON document", e);
        }
        RestAssured.reset();
        return r;

    }

    static Response response;

    public static Response getRequestBillingAddressOnBrm(String endpoint, String token) {
        Utils.waitFor(20);
        defaultParser = Parser.JSON;
        baseURI = endpoint;
        // Response r = null;
        System.out.println("baseURI: " + baseURI);
        try {
            response = given().headers("Content-Type", " application/json", "Authorization", token)
                    .when()
                    .get(baseURI)
                    .then()
                    .statusCode(200)
//                    .header("Date", notNullValue())
                    .and()
                    .body("[1].payload.relatedParty[0].contactMedium[0].characteristic.street1", is("ISTANBUL"))
                    .body("[1].payload.relatedParty[0].contactMedium[0].characteristic.street2", is("KARTAL-54"))
                    .body("data", notNullValue())
//            .body("code", is("SUCCESS"))
                    .and()
                    .contentType("application/json;charset=UTF-8")
                    .log().all()
                    .extract().response();

        } catch (Exception e) {
            throw new JsonPathException("Failed to parse the JSON document", e);
        }
        // RestAssured.reset();
        return response;
    }
    public static Response getRequestForFiscalization(String endpoint, String token) {
        //Utils.waitFor(10);
        defaultParser = Parser.JSON;
        baseURI = endpoint;
        Response r = null;
        System.out.println("baseURI: " + baseURI);
        try {
            r = given().headers("Content-Type", " application/json", "Authorization", token)
                    .when()
                    .get(baseURI)
                    .then()
                    .statusCode(200)
//                    .header("Date", notNullValue())
//                    .and()
//                    .body("data", notNullValue())
//                    .body("status", is("SUCCESS"))
//                    .body("code", is("SUCCESS"))
                    .and()
//                    .contentType("application/json;charset=UTF-8")
                    //.log().all()
                    .extract().response();
            log.info("!!!!!!!!!!!!!!!!!!!!!!Exception at Fiscalization is = " + r.getBody().jsonPath().getString("data.items[0].exception"));
            log.info("!!!!!!!!!!!!!!!!!!!!!!Succeeded type at Fiscalization is = " + r.getBody().jsonPath().getString("data.items[0].succeeded"));
        } catch (Exception e) {
            throw new JsonPathException("Failed to parse the JSON document", e);
        }
        RestAssured.reset();
        return r;
    }



    public static Response getRequestOfVtvForFiscalization(String endpoint, String token) {
        Utils.waitFor(20);
        defaultParser = Parser.JSON;
        baseURI = endpoint;
        Response r = null;
        System.out.println("baseURI: " + baseURI);
        try {
            r = given().headers("Content-Type", " application/json", "Authorization", token)
                    .when()
                    .get(baseURI)
                    .then()
                    .statusCode(200)
//                    .header("Date", notNullValue())
//                    .and()
//                    .body("data", notNullValue())
//                    .body("status", is("SUCCESS"))
//                    .body("code", is("SUCCESS"))
                    .and()
//                    .contentType("application/json;charset=UTF-8")
                    //.log().all()
                    //.body("data.items[0].succeeded",is("True"))
                    .extract().response();
            log.info("!!!!!!!!!!!!!!!!!!!!!!!!!Exception at Fiscalization is = " + r.getBody().jsonPath().getString("data.items[0].exception"));
            log.info("!!!!!!!!!!!!!!!!!!!!!!!!!Succeeded type at Fiscalization is = " + r.getBody().jsonPath().getString("data.items[0].succeeded"));
        } catch (Exception e) {
            throw new JsonPathException("Failed to parse the JSON document", e);
        }
        RestAssured.reset();
        return r;
    }
    public static Response getRequestOfCryptoguardForFiscalization(String endpoint, String token) {
        Utils.waitFor(20);
        defaultParser = Parser.JSON;
        baseURI = endpoint;
        Response r = null;
        System.out.println("baseURI: " + baseURI);
        try {
            r = given().headers("Content-Type", " application/json", "Authorization", token)
                    .when()
                    .get(baseURI)
                    .then()
                    .statusCode(200)
                    .and()
                    //.log().all()
                    .extract().response();
            log.info("!!!!!!!!!!!!!!!Exception at Fiscalization is = " + r.getBody().jsonPath().getString("data.items[0].exception"));
            log.info("!!!!!!!!!!!!!!!Succeeded type at Fiscalization is = " + r.getBody().jsonPath().getString("data.items[0].succeeded"));
        } catch (Exception e) {
            throw new JsonPathException("Failed to parse the JSON document", e);
        }
        RestAssured.reset();
        return r;
    }
    public static Response getRequestOfCoaxialBrmOrder(String endpoint, String token) {
        Utils.waitFor(20);
        defaultParser = Parser.JSON;
        baseURI = endpoint;
        Response r = null;
        System.out.println("baseURI: " + baseURI);
        try {
            r = given().headers("Content-Type", " application/json", "Authorization", token)
                    .when()
                    .get(baseURI)
                    .then()
                    .statusCode(200)
                    .and()
                    //.log().all()
                    .extract().response();
            log.info("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!Exception at BRM for Status is = " + r.getBody().jsonPath().getString("[4].status"));
        } catch (Exception e) {
            throw new JsonPathException("Failed to parse the JSON document", e);
        }
        RestAssured.reset();
        return r;
    }
    public static Response getRequestOfCoaxialPrepaidForFiscalization(String endpoint, String token) {
        Utils.waitFor(20);
        defaultParser = Parser.JSON;
        baseURI = endpoint;
        Response r = null;
        System.out.println("baseURI: " + baseURI);
        try {
            r = given().headers("Content-Type", " application/json", "Authorization", token)
                    .when()
                    .get(baseURI)
                    .then()
                    .statusCode(200)
                    .and()
                    //.log().all()
                    //!!!!!!!!.body("data.items[0].succeeded",is("true"))
                    .extract().response();
            log.info("!!!!!!!!!!!!!!!Exception at Fiscalization is = " + r.getBody().jsonPath().getString("data.items[0].exception"));
            log.info("!!!!!!!!!!!!!!!Succeeded type at Fiscalization is = " + r.getBody().jsonPath().getString("data.items[0].succeeded"));
        } catch (Exception e) {
            throw new JsonPathException("Failed to parse the JSON document", e);
        }
        RestAssured.reset();
        return r;
    }
    public static Response getRequestOfBundleCoaxialPrepaidForFiscalization(String endpoint, String token) {
        Utils.waitFor(20);
        defaultParser = Parser.JSON;
        baseURI = endpoint;
        Response r = null;
        System.out.println("baseURI: " + baseURI);
        try {
            r = given().headers("Content-Type", " application/json", "Authorization", token)
                    .when()
                    .get(baseURI)
                    .then()
                    .statusCode(200)
                    .and()
                    //!!!!!!!!.body("data.items[0].succeeded",is("true"))
                    //.log().all()
                    .extract().response();
            log.info("!!!!!!!!!!!!!!!Exception at API Fiscalization is = " + r.getBody().jsonPath().getString("data.items[0].exception"));
            log.info("!!!!!!!!!!!!!!!Succeeded type at API Fiscalization is = " + r.getBody().jsonPath().getString("data.items[0].succeeded"));
        } catch (Exception e) {
            throw new JsonPathException("Failed to parse the JSON document", e);
        }
        RestAssured.reset();
        return r;
    }






}