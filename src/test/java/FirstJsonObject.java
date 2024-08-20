import org.json.JSONObject;
import org.testng.annotations.*;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


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

  @Test
  public void jsonObject2() {

    JSONObject jsonObject=new JSONObject();
    jsonObject.put("name", "Harsha");
    jsonObject.put("job", "Manager");
    given()
        .header("content-type", "application/json")
        .body(jsonObject.toString())
        .when()
        .post("https://reqres.in/api/users")
        .then()
        .assertThat()
        .statusCode(201)
        .and()
        .body("name", equalTo("Harsha"));

  }

  @Test
  public void jsonObject4() {
    JSONObject jsonObject=new JSONObject();
    jsonObject.put("name", "Rana");
    jsonObject.put("job", "Actor");
    given()
        .header("content-type", "application/json")
        .body(jsonObject.toString())
        .when()
        .post("https://reqres.in/api/users")
        .then()
        .assertThat()
        .statusCode(201)
        .and()
        .body("name", equalTo("Rana"));
  }

@Test
  public void jsonObject5() {
    JSONObject jsonObject=new JSONObject();
    jsonObject.put("name", "Rana1");
    jsonObject.put("job", "Actor");
    given()
        .header("content-type", "application/json")
        .body(jsonObject.toString())
        .log()
        .all()
        .when()
        .post("https://reqres.in/api/users")
        .then()
        .log()
        .body()
        .assertThat()
        .statusCode(201)
        .and()
        .body("name", equalTo("Rana1"));

}


@Test
  public void jsonPostMethod6() {
    JSONObject jsonObject=new JSONObject();
    jsonObject.put("name", "Sudhakar");
    jsonObject.put("job", "Marketing");
    given()
        .header("content-type", "application/json")
        .body(jsonObject.toString())
        .when()
        .post("https://reqres.in/api/users")
        .then()
        .assertThat()
        .statusCode(201)
        .and()
        .body("job", equalTo("Marketing"));
}

@Test
  public void jsonGet6() {
    given()
        .when()
        .get("https://reqres.in/api/users?page=1")
        .then()
        .assertThat()
        .statusCode(200);


}

@Test
  public void deleteMethod() {
    given()
        .when()
        .delete("https://reqres.in/api/users/2")
        .then()
        .assertThat()
        .statusCode(204);
}

@Test
  public void jsonPutOne() {
    JSONObject jsonObject=new JSONObject();
    jsonObject.put("name", "Raja");
    given()
        .header("content-type", "application/json")
        .body(jsonObject.toString())
        .when()
        .put("https://reqres.in/api/users/2")
        .then()
        .assertThat()
        .statusCode(200)
        .and()
        .body("name", equalTo("Raja"));
}

  }
