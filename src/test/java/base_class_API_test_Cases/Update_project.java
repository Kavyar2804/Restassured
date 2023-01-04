package base_class_API_test_Cases;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import PojoclassForPostingBody.BodyforProject;
import genricUtility.Base_class_for_specBuilder;
import genricUtility.End_points.EndPointsLibrary;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class Update_project extends Base_class_for_specBuilder{

	@Test
	public void Update_pro() throws Throwable
	{
		String pid = eutil.readDatafromexcelnormal("Sheet2", 0, 0);
	BodyforProject bd = new BodyforProject("Kavya", "project"+jutil.RandomNum(), "stat", 9);	
		given().spec(requestspec)
		.pathParam("id", pid)
		.body(bd)
		.when()
		.put(EndPointsLibrary.updateProject+"{id}")
		.then()
		.assertThat()
		.log()
		.all()
		.statusCode(200)
		.time(Matchers.lessThan(20000L), TimeUnit.MILLISECONDS);
	
	}
}
