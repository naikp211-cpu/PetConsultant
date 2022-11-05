package Authtication;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;




public class BasicAuth {
@Test

public void basicAuth() {


baseURI="http://github.com/";

given().auth().basic("naikp211-cpu","8296538499pooja")
        .when().get("/login")
        .then().log().all();

}

}


