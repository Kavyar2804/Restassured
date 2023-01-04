package crudOperationwithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Put {
	
	@Test
	public void updation()
	{
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Purvith");
		jobj.put("projectName", "Online");
		jobj.put("status", "new");
		jobj.put("teamSize", 420);
		
		RequestSpecification req = RestAssured.given();
		req.body(jobj);
		req.contentType(ContentType.JSON);
		Response res = req.put("http://localhost:8084/projects/TY_PROJ_205");
	}

}
