package crudOperationswithoutBDD;

import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AddProject {
	
	//Create JSON body using JSON simple
	
	@Test
	public void addProj()
	{
	JSONObject jobj= new JSONObject();
	jobj.put("createdBy", "Purvith");
	jobj.put("projectName", "Hour");
	jobj.put("status", "new");
	jobj.put("teamSize", 420);
	
	//prerequest for the script
	RequestSpecification req = RestAssured.given();
	req.body(jobj);
	req.contentType(ContentType.JSON);
	//Action
	RequestSpecification uri = req.baseUri("http://localhost:8084");
	req.pathParam("resourcepath", "addProject");
	Response res = req.post("/{resourcepath}");
	System.out.println(res.asString());

	
	
	}
}
