import static io.restassured.RestAssured.authentication;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

public class postmanEchoTest {

    @Test
    void shouldReturnTestData() {
        given()
                .baseUri("https://postman-echo.com")
                .body("PostmanEchoTest data")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("PostmanEchoTest data"))
        ;
    }

    @Test
    void shouldTestPost() {
        given()
                .baseUri("https://postman-echo.com")
                .body("handWave")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("handWave"))

        ;
    }

}
