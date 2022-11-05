package CRUDoperations;

import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class getbyphoneno {
@Test
public void passphone() {
	when()
	.get("http://localhost:8080/admins/phone/8491289607?password=pavn155")
	.then()
	.assertThat().statusCode(200)
	.and()
	.assertThat().contentType(ContentType.JSON)
	.log().all();
}
}
