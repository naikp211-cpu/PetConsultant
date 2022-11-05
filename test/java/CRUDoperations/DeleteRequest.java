package CRUDoperations;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DeleteRequest {

	@Test
	public void getAllProjects() {
			  
			 when()
			    .delete("http://localhost:8080/admins/9")
			 .then()
			    .log().all()
			    .assertThat().statusCode(200);
		
		}

}

