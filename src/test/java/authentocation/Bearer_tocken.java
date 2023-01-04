package authentocation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;



public class Bearer_tocken {
	
	@Test
	public void bearer_tocken()
	{
		JSONObject jobj = new JSONObject();
				jobj.put("name", "Champ420");
		baseURI = "https://api.github.com";
		given()
		.body(jobj)
		.contentType(ContentType.JSON)
		.auth()
		.oauth2("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")
		.when()
		.post("/user/repos")
		.then()
		.assertThat()
		.log()
		.all();
	}

}
