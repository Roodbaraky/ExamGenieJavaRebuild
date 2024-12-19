package codes.koo;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class ExamGenieResourceTest {
    @Test
    void testHomeEndpoint() {
        given()
          .when().get("/")
          .then()
             .statusCode(200)
             .body(is("Hi, ExamGenie is working"));
    }
    @Test
    void testClassesEndpoint() {
        given()
                .when().get("/classes")
                .then()
                .statusCode(200);
    }
    @Test
    void testTagsEndpoint() {
        given()
                .when().get("/tags")
                .then()
                .statusCode(200);
    }
    @Test
    void testWeeksEndpoint() {
        given()
                .when().get("/weeks")
                .then()
                .statusCode(200);
    }

}