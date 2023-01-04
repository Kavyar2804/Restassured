package Parameters;

import org.testng.annotations.Test;

import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class Path_parameter {
	
	@Test
	public void pathParam()
	{
		baseURI="http://localhost";
		port=8084;
		String proj_id ="TY_PROJ_1002";
				given()
				.pathParam("projectId", proj_id)
				.when()
				.get("/projects/{projectId}")
				//.delete("/{projectId")
				.then()
				.assertThat()
				.statusCode(204)
				.log()
				.all();
				
		
	
	}

}
