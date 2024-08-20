import jdk.security.jarsigner.JarSigner;
import org.json.JSONObject;
import org.testng.annotations.*;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class APITESTING {

  @Test
  public void jObject() {
    JSONObject jsonObject=new JSONObject();
    jsonObject.put("name", "Rajesh");
    jsonObject.put("Job", "Tele Marketing");
    given()
        .header("content-type", "application/json")
        .body(jsonObject.toString())
        .when()
        .post("https://reqres.in/api/users")
        .then()
        .statusCode(201)
        .and()
        .body("name", equalTo("Rajesh"));

  }
}
