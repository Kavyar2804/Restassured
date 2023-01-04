package authentocation;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class bearer_tocken_get {

	@Test
	public void getrepo()
	{
	 baseURI = "https://api.github.com";
	 given()
	 .auth()
	 .oauth2("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")
	 .when()
	 .get("/user/repos")
	 .then()
	 .assertThat()
	 .log()
	 .all();
	 
	 
	}
}
