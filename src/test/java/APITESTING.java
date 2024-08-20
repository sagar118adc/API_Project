import io.restassured.RestAssured;
import org.json.JSONObject;
import org.testng.annotations.*;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class APITESTING {


  @BeforeTest
  public void beforeTest() {
    baseURI="https://reqres.in/api";
  }

  @Test
  public void jObject() {
    JSONObject jsonObject=new JSONObject();
    jsonObject.put("name", "Rajesh");
    jsonObject.put("Job", "Tele Marketing");
    given()
        .header("content-type", "application/json")
        .body(jsonObject.toString())
        .when()
        .post("/users")
        .then()
        .statusCode(201)
        .and()
        .body("name", equalTo("Rajesh"));

  }

  @Test
  public void getMethod(){
    given()
        .when()
        .get("/users?page=2")
        .then()
        .assertThat()
        .statusCode(200);
  }

  @AfterTest
  public void closeTest() {
    System.out.println("Closing Test");
  }
}
