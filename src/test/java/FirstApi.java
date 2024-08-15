import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class FirstApi {

    @Test
    public void getMethod() {

        given()
                .when().get("https://reqres.in/api/users?page=2")
                .then()
                .assertThat()
                .statusCode(200);
    }
}
