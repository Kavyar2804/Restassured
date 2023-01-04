package DifferentWaysToPostody;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.testng.annotations.Test;

import PojoclassForPostingBody.BodyforProject;
import io.restassured.http.ContentType;

public class PostUsingPojoClass {
	
	@Test
	public void addPro()
	{
		BodyforProject obj = new BodyforProject("Kavu", "newYear", "new", 120);	
		
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
