package CRUDoperations;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;


public class putRequest {
@Test
public void updateProject() {
	JSONObject jObject=new JSONObject();
	jObject.put("email", "string123@gmail.com");
	  jObject.put("id", 33);
	 jObject.put("name", "Pooja");
	  jObject.put("password", "stringpooja");
	 jObject.put("phone", 908765432);	
	given()
	 .contentType(ContentType.JSON)
	 .body(jObject)
	 .when()
	 .put("http://localhost:8080/admins")
	.then()
	   .log().all()
	   .assertThat().statusCode(200)
	   .assertThat().contentType(ContentType.JSON);

}

}

