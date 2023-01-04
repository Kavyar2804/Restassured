package validateResponse;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Dynamic_response {
	
	@Test
	public void getAllProject()
	{
		
		baseURI="http://localhost";
		port=8084;
		String expectedId= "TY_PROJ_1005";
		Response res = when().get("/projects");
		List<String> actualpid = res.jsonPath().get("projectId");
		boolean flag = false;
		for(String aid : actualpid)
		{
			if(aid.equalsIgnoreCase(expectedId))
			{
				System.out.println("project id is found");
				flag=true;
			}
		}
		Assert.assertTrue(flag);
	}

}
