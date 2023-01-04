package base_class_API_test_Cases;

import org.testng.annotations.Test;

import genricUtility.Base_class_for_specBuilder;
import genricUtility.End_points.EndPointsLibrary;

import static io.restassured.RestAssured.*;

public class DeleteProjects extends Base_class_for_specBuilder{
	@Test
	public void delPro() throws Throwable
	{
		String pid = eutil.readDatafromexcelnormal("Sheet3", 0, 0);
		System.out.println(pid);
		given().spec(requestspec)
		.pathParam("proid", pid)
		.when()
		.delete(EndPointsLibrary.deleteproject+"{proid}")
		.then()
		.assertThat()
		.log().all();
	}

}
