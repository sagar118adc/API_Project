import io.restassured.internal.mapping.JsonbMapper;
import jdk.jfr.ContentType;
import org.testng.annotations.Test;

import java.security.PublicKey;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class FirstApi {

    @Test
    public void getMethod() {

        given()
            .when().get("https://reqres.in/api/users?page=2")
            .then()
            .assertThat()
            .statusCode(200);
    }

    @Test
    public void postMethod() {
        String jsonBody ="{\"name\":\"sagar1\", \"job\":\"QA\"}";
        given()
            .header("content-type", "application/json")
            .body(jsonBody)
            .when().post("https://reqres.in/api/users")
            .then()
            .assertThat()
            .statusCode(201)
            .and()
            .body("name", equalTo("sagar1"));
    }


    @Test

    public void postMethod1() {

        String jsonBody="{\"name\":\"sagar\", \"job\":\"engineer\"}";
        given()
            .header("content-type", "application/json")
            .body(jsonBody)
            .when()
            .post("https://reqres.in/api/users")
            .then()
            .assertThat()
            .statusCode(201)
            .and()
            .body("job", equalTo("engineer"));
    }

    @Test
    public void postMethod2() {

        String jsonBody="{\"name\":\"Ravi\", \"job\":\"testing\"}";
        given()
            .header("content-type", "application/json")
            .body(jsonBody)
            .when()
            .post("https://reqres.in/api/users")
            .then()
            .assertThat()
            .statusCode(201)
            .and()
            .body("name", equalTo("Ravi"));
    }

    @Test
    public void getMethod2() {
        given()
            .when()
            .get("https://reqres.in/api/users?page=2")
            .then()
            .assertThat()
            .statusCode(200);

    }

    @Test
        public void postMethod3() {

    String jsonBody = "{\"name\":\"qwerty\", \"Job\":\"Manager\"}";
    given()
        .header("content-type", "application/json")
        .body(jsonBody)
        .when()
        .post("https://reqres.in/api/users")
        .then()
        .assertThat()
        .statusCode(201)
        .and()
        .body("name", equalTo("qwerty"));
}


}
