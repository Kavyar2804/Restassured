package crudOperationwithBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteProj {
	
	@Test
	public void delete()
	{
		RequestSpecification req = RestAssured.given();
		//action
		Response res = req.delete("http://localhost:8084/projects/TY_PROJ_810");
		//response
		System.out.println(res.getContentType());
		System.out.println(res.getTime());
		System.out.println(res.getSessionId());
		System.out.println(res.getCookies());
		System.out.println(res.getBody());
		System.out.println(res.getStatusCode());
		System.out.println(res.getStatusLine());
		//validate response
		res.then().log().all();
		res.then().assertThat().contentType(ContentType.JSON);
		res.then().assertThat().statusCode(204);
		
	}

}
