package authentocation;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class digistive_auth {
	
	@Test
	public void digestiveAuth()
	{
		given()
		.auth()
		.digest("rmgyantra", "rmgy@9999")
		.when()
		.get("http://localhost:8084/login")
		.then()
		.log()
		.all();
	}

}
