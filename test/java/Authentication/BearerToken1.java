package Authentication;
import static io.restassured.RestAssured.*;

import java.net.http.HttpResponse.BodyHandler;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class BearerToken1 {
@Test
	public void bearermain(){
		baseURI="http://github.com";
		JSONObject obj = new JSONObject();
		obj.put("name","newrepository12" );
given().auth().oauth2("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")
.body(obj).contentType(ContentType.JSON)
.when().post("/user/repos")
.then().log().all();
	}

}
