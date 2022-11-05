package CRUDoperations;

import org.json.simple.JSONObject;
import org.junit.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostRequest {
@Test 
public void createProject() {
	JSONObject jObject=new JSONObject();
	jObject.put("email", "naikpooja@gmail.com");
	  jObject.put("id", 30);
	 jObject.put("name", "Payal");
	  jObject.put("password", "tytd123");
	 jObject.put("phone", 908765321);
	 given()
	 .contentType(ContentType.JSON)
	 .body(jObject)
	 .when()
	 .post("http://localhost:8080/admins")
	 .then()
	 .log().all()
	 .assertThat().statusCode(200)
	 .assertThat().contentType(ContentType.JSON);
	 
	
}
}
