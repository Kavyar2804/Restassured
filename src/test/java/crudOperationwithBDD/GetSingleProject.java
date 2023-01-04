package crudOperationwithBDD;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class GetSingleProject {
	
	@Test
	public void allpro()
	{
		baseURI = "http://localhost";
		port = 8084;
		when()
		.get("/projects/TY_PROJ_821")
		
		.then()
		.assertThat()
		.log().all()
		.statusCode(200);
	
	}

}
