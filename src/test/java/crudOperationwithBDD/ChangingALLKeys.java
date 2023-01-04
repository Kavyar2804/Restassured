package crudOperationwithBDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;

public class ChangingALLKeys {
	
	@Test
	public void addPro()
	{
		JSONObject obj = new JSONObject();
		obj.put("created", "Champu");
		obj.put("projeName", "Tirupatinull");
		obj.put("stats", "new");
		obj.put("teamize", 100);	
		
		 baseURI = "http://localhost";
		 port = 8084;
		 given()
		.body(obj)
		.contentType(ContentType.JSON)
		
		.when()
		.post("/addProject")
		
		.then()
		.assertThat()
		.log().all()
		.statusCode(201)
		.contentType(ContentType.JSON)
		.statusLine("HTTP/1.1 201 ");
		
	}

}
