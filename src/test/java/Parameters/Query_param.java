package Parameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Query_param {
	
	@Test
	public void queryPara()
	{
		baseURI = "https://reqres.in";
		given()
		.pathParam("path", "api/users")
		.queryParam("page", 2)
		.when()
		.get("/{path}")
		.then().log().all();
	}

}
