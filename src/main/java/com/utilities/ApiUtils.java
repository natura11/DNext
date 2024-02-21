package com.utilities;


import io.restassured.response.Response;
public class ApiUtils {
    public static boolean statusCode(int statusCode, Response response) {
        boolean flag = false;
        int code = response.getStatusCode();
        System.out.println("code = " + code);
        if (statusCode == code){
            flag = true;
        }else {
            flag = false;
        }
        return  flag;
    }
}
