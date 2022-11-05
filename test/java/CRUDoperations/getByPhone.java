package CRUDoperations;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class getByPhone {
@Test
public void TestByPhone() {
	when()
	.get("http://localhost:8080/admins/phone?phone=908765432")
	.then()
	.assertThat().statusCode(200)
	.and()
	.assertThat().contentType(ContentType.JSON)
	.log().all();
}
}

