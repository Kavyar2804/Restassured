package crudOperationwithBDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Update {
	
	@Test
	public void updatepro()
	{
		JSONObject obj = new JSONObject();
		obj.put("createdBy", "Champu");
		obj.put("projectName", "Tractor");
		obj.put("status", "new");
		obj.put("teamSize", 100);
		
		baseURI = "http://localhost";
		port = 8084;
		given()
		.body(obj)
		.contentType(ContentType.JSON)
		 
		.when()
		.put("/projects/TY_PROJ_821")
		
		
		.then()
		.assertThat()
		.log().all()
		.contentType(ContentType.JSON)
		.statusCode(200)
		.statusLine("HTTP/1.1 200 ");
		
	}

}
