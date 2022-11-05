package CRUDoperations;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class getByIdRequest {
@Test
public void getId() {
	when()
	.get("http://localhost:8080/admins/id/38")
	.then()
	.assertThat().statusCode(200)
	.and()
	.assertThat().contentType(ContentType.XML)
	.log().all();
}
}
