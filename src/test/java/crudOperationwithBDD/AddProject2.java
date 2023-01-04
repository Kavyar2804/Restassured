package crudOperationwithBDD;

import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AddProject2 {
	
	//Create JSON body using JSON simple
	
	@Test
	public void addProj()
	{
	JSONObject jobj= new JSONObject();
	jobj.put("createdBy", "Purvith");
	jobj.put("projectName", "Horse1");
	jobj.put("status", "new");
	jobj.put("teamSize", 420);
	
	//prerequest for the script
	RequestSpecification req = RestAssured.given();
	req.body(jobj);
	req.contentType(ContentType.JSON);
	//Action
	Response resp = req.post("http://localhost:8084/addProject");
	//validation
	System.out.println(resp.getContentType());
	System.out.println(resp.getStatusCode());
	System.out.println(resp.getStatusLine());
	System.out.println(resp.getTime());
	System.out.println(resp.getTimeIn(TimeUnit.SECONDS));
	System.out.println(resp.getCookies());
	System.out.println(resp.getHeaders());
	System.out.println(resp.getBody().asString());
	
	resp.then().assertThat().log().all();
	resp.then().assertThat().contentType(ContentType.JSON);
	resp.then().assertThat().statusCode(201);
	//resp.then().assertThat().statusLine("http");
	
	}
}
