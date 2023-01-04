package crudOperationswithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetProject {
	
	@Test
	public void getProj()
	{
		RequestSpecification req = RestAssured.given();
		Response resp = req.get("http://localhost:8084/projects");
		System.out.println(resp.getContentType());
		
		resp.then().assertThat().log().all();
	}

}
