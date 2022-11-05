package CRUDoperations;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class getRequest {
@Test
public void getAllProjects() {
	  
	 when()
	    .get("http://localhost:8080/admins/string@gmail.com")
	 .then()
	    .assertThat().statusCode(200)
	    .and()
	    .assertThat().contentType(ContentType.JSON)
	    .log().all();
}


}
