package crudOperationwithBDD;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class TeamSizeInString {
	
	@Test
	public void addpro()
	{
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "123456");
		jobj.put("projectName", "toy");
		jobj.put("status", "created");
		jobj.put("teamSize", "nine");
		
		baseURI = "http://localhost";
		 port = 8084;
		 given()
		 .body(jobj)
		 .contentType(ContentType.JSON)
		 
		 .when()
		 .post("/addProject")
		 
		 .then()
		 .assertThat()
		 .log().all()
		 .statusCode(201)
		 .contentType(ContentType.JSON);
		
	}

}


