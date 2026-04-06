package base;

import io.restassured.RestAssured;

public class BaseTest {
    public void setup() {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
    }
}