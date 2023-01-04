package crudOperationwithBDD;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class DeleteProject2 {
	
	@Test
	public void Delete()
	{
	baseURI = "http://localhost";
	port = 8084;
	when()
	.delete("/projects/TY_PROJ_805")
	.then()
	.assertThat()
	.log().all()
	.contentType(ContentType.JSON)
	.statusCode(204)
	.statusLine("HTTP/1.1 204 ");			
		
	}

}
