package utils;

import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;

public class RequestBuilder {

    public static RequestSpecification getRequest() {
        return given()
                .header("Content-Type", "application/json")
                .log().all();
    }
}