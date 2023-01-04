package base_class_API_test_Cases;

import org.testng.annotations.Test;

import genricUtility.Base_class_for_specBuilder;
import genricUtility.End_points.EndPointsLibrary;

import static io.restassured.RestAssured.*;

public class GetAllProjects extends Base_class_for_specBuilder
{
	
	@Test
	public void getAllPro()
	{
		given()
		.spec(requestspec)
		.when()
		.get(EndPointsLibrary.getallprojects)
		.then()
		.assertThat()
		.log()
		.all()
		.statusCode(200);
	}

}
