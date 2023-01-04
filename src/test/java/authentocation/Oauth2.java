package authentocation;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class Oauth2 {

	@Test
	public void oauth_2()
	{
		Response res = given()
				.formParam("client_id", "Oauth2_Practise")
				.formParam("client_secret", "49400bbadae545ce26a408b5fec7d537")
				.formParam("grant_type", "client_credentials")
				.formParam("redirect_uri" ,"http://kavya.com" )
				.formParam("code", "authorization_code")
				
				.when() 	
				.post("http://coop.apps.symfonycasts.com/token");
		System.out.println(res);
		String token = res.jsonPath().get("access_token");
		System.out.println(token);
		
		given()
		.auth()
		.oauth2(token)
		.pathParam("USER_ID", 4164)
		
		.when()
		.post("http://coop.apps.symfonycasts.com/api/{USER_ID}/eggs-collect")
		
		.then()
		.assertThat().log().all();
		
		
	}
}
