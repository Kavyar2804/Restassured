package DifferentWaysToPostody;

import static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PostBodyUsingJSOnFILe {
	
	@Test
	public void addPro()
	{
		File file = new File("./src\\test\\resources\\data.json");
		baseURI = "http://localhost";
		 port = 8084;
		given()
		.body(file)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then()
		.statusCode(201)
		.contentType(ContentType.JSON)
		.log().all();
		
		
		 
	}
	

}
