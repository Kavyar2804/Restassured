package crudOperationwithBDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.io.File;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;

public class AddProMultipart {
	
	@Test
	public void addPro()
	{
			
		
		 baseURI = "http://localhost";
		 port = 8084;
		 given()
		.contentType(ContentType.MULTIPART)
		.multiPart("sample[file]" , new File("./data.json"))
		//.body("./data.json")
		
		
		.when()
		.post("/addProject")
		.andReturn()
		
		
		.then()
		.assertThat()
		.log().all()
		
		
		;
		
	}

}
