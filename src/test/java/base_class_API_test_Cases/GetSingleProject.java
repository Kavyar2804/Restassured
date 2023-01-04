package base_class_API_test_Cases;

import org.testng.annotations.Test;

import genricUtility.Base_class_for_specBuilder;
import genricUtility.End_points.EndPointsLibrary;

import static io.restassured.RestAssured.*;

public class GetSingleProject extends Base_class_for_specBuilder {
	
	@Test
	public void getPro() throws Throwable
	{
		
		
		 String pid = eutil.readDatafromexcelnormal("Sheet2", 0, 0);
		 given()
		 .spec(requestspec)
		.pathParam("id", pid)
		.when()
		.get(EndPointsLibrary.getsingleproject+"{id}")
		.then()
		.assertThat()
		.log()
		.all();
		
	}

}
