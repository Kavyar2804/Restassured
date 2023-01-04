package validateResponse;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

import static io.restassured.RestAssured.*;


public class Response_body_validation {
	
	@Test
	public void bodyValTest() 
	{
	
		baseURI ="http://localhost";
		port=8084;
		String expected="TY_PROJ_1005";
		 Response res = given()
		.get("projects");
		 ResponseBody b3 = res.body();
		 System.out.println(b3);
		 ResponseBody b4 = res.getBody();
		 System.out.println(b4);
	  String b2 = res.body().prettyPrint();
	 // pretty print will print  response body
		  System.out.println(b2);
		ResponseBody b25 = res.body().prettyPeek();
	   //pretty peak will print  response body and header
		System.out.println(b25);
		 ResponseBody bd = res.getBody();
		 	System.out.println(bd);
		String body = res.getBody().asString();
		String body3 = res.getBody().toString();//--->not working
		System.out.println(body3);
		  String body2 = res.getBody().prettyPrint();
		  System.out.println(body2);
		System.out.println(body);
		Boolean flag= false;
	
		if(body.contains(expected)) {
			flag=true;
			System.out.println("found");
		}
		Assert.assertTrue(flag);
		
	}


}
