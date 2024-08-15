import jdk.jfr.ContentType;
import org.testng.annotations.Test;

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
        String jsonBody ="{\"name\":\"sagar\", \"job\":\"QA\"}";
        given()
                .header("content-type", "application/json")
                .body(jsonBody)
                .when().post("https://reqres.in/api/users")
                .then()
                .assertThat()
                .statusCode(201)
                .and()
                .body("name", equalTo("sagar"));
    }
}
