package base_class_API_test_Cases;

import org.hamcrest.Matcher;
import org.testng.annotations.Test;

import PojoclassForPostingBody.BodyforProject;
import genricUtility.Base_class_for_specBuilder;
import genricUtility.End_points.EndPointsLibrary;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class AddProject extends Base_class_for_specBuilder {
	@Test
	public void addPro()
	{
		BodyforProject bd =  new BodyforProject("Kavya", "project"+ jutil.RandomNum(), "new", 10);
		
		given()
		.spec(requestspec)
		.body(bd)
		.when()
		.post(EndPointsLibrary.createproject)
		.then()
		//.spec(responsespec)
		.assertThat()
		.statusCode(201)
		.contentType(ContentType.JSON)
		.log()
		.all();
	
	
	}

}
