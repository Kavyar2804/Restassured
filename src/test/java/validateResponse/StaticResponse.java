package validateResponse;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class StaticResponse {
	
	@Test
	public void getProject()
	{
		baseURI="http://localhost";
		port=8084;
		Response res = when().get("/projects");
	
		String actual = res.jsonPath().get("[1].projectName");
		Assert.assertEquals(actual, "try12");
		
		
	}

}
