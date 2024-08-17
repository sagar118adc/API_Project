import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class FirstJsonObject {

  @Test
  public void postJsonObject() {
    JSONObject jsonObject= new JSONObject();

    jsonObject.put("name", "Tyson");
    jsonObject.put("job", "Operator");
    System.out.println(jsonObject);
    given()
        .header("content-type", "application/json")
        .body(jsonObject.toString())
        .when()
        .post("https://reqres.in/api/users")
        .then()
        .assertThat()
        .statusCode(201)
        .and()
        .body("name", equalTo("Tyson"));
  }


  @Test
  public void jsonObject1() {
    JSONObject jsonObject= new JSONObject();

    jsonObject.put("name", "Siddhu");
    jsonObject.put("job", "Operator");
    given()
        .header("content-type", "application/json")
        .body(jsonObject.toString())
        .when()
        .post("https://reqres.in/api/users")
        .then()
        .assertThat()
        .statusCode(201)
        .and()
        .body("name", equalTo("Siddhu"));
  }
}
