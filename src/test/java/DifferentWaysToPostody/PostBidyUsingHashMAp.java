package DifferentWaysToPostody;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;

public class PostBidyUsingHashMAp {
	
	@Test
	public void addPro()
	{
		HashMap map = new HashMap();
		map.put("createdBy", "Champu");
		map.put("projectName", "Toss");
		map.put("status", "new");
		map.put("teamSize", 100);	
		
		 baseURI = "http://localhost";
		 port = 8084;
		 given()
		.body(map)
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
