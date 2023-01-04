package crudOperationswithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get_single_project {
	
	@Test
	public void  getSingle()
	{
		RequestSpecification req = RestAssured.given();
		Response res = req.get("http://localhost:8084/projects/TY_PROJ_003"); 
		//System.out.println(res.getBody());
		System.out.println(res.getStatusLine());
		res.then().log().all();
		
		res.then().assertThat().contentType(ContentType.JSON);
		res.then().assertThat().statusCode(200);
		res.then().statusLine("HTTP/1.1 200 ");
	}
	

}
