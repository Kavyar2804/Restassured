package authentocation;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Primitive_auth {
	
	@Test
	public void primitive(){
		
		given()
		.auth()
		.preemptive()
		.basic("rmgyantra", "rmgy@9999")
		.get("http://localhost:8084/login")
		.then()
		.assertThat()
		.statusCode(202)
		.log().all();
		
	}

}
