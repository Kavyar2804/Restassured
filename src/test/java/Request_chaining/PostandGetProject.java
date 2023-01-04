package Request_chaining;

import org.testng.annotations.Test;

import PojoclassForPostingBody.BodyforProject;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class PostandGetProject {
	
	@Test
	public void PostAndGet()
	{

		baseURI="http://localhost";
		port=8084;
		BodyforProject bd =new BodyforProject("Kavu", "projname3", "status", 90);
		Response res = given()
		.body(bd)
		.contentType(ContentType.JSON)
		.when()
		.post("addProject");
		
		
		String proid = res.jsonPath().get("projectId");
		given()
		.pathParam("pid", proid)
		.when()
		.get("projects/{pid}")
		//System.out.println(res.prettyPeek());
		//System.out.println(res.prettyPrint());
		.then()
		.log().all();
		
		when()
		.delete("projects/{pid}")
		.then().log().all();	
	}

}
