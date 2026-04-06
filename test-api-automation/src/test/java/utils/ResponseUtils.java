package utils;

import io.restassured.response.Response;

public class ResponseUtils {

    public static int getStatusCode(Response response) {
        return response.getStatusCode();
    }

    public static String getString(Response response, String key) {
        return response.jsonPath().getString(key);
    }

    public static int getInt(Response response, String key) {
        return response.jsonPath().getInt(key);
    }
}