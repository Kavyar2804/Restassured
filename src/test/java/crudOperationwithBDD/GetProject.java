package crudOperationwithBDD;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class GetProject {
	
	@Test
	public void getPro()
	{
		baseURI = "http://localhost";
		 port = 8084;
		 when()
		 .get("/projects")
		 
		 .then()
		 .assertThat()
		 .log().all()
		 .contentType(ContentType.JSON)
		 .statusCode(200);
		 
	}

}
