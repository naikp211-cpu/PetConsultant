package CRUDoperations;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class getbyEmailrequest {

	@Test
	public void getALlEMail() {
		when()
		.get("http://localhost:8080/admins/email/pooja1@gmail.com ?password=pavn155")
		.then()
		.assertThat().statusCode(200)
		.and()
		.assertThat().contentType(ContentType.JSON)
		.log().all();
}
}
