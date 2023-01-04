package endToendscenario;

import org.testng.Assert;
import org.testng.annotations.Test;

import PojoclassForPostingBody.BodyforProject;
import genricUtility.Base_class_for_specBuilder;
import genricUtility.End_points.EndPointsLibrary;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class CreateProject extends Base_class_for_specBuilder 
{
	
	@Test
	public void project() throws Throwable
	{
	//create projcet using post()	
		BodyforProject bd = new BodyforProject("Kavya", "Project"+jutil.RandomNum(), "gone", 9);
	Response response = given()
			.spec(requestspec)
			.body(bd)
		.when()
		.post(EndPointsLibrary.createproject);
		
		
		//capture the response and reterive projectID
		
		String expdata = rutil.getJsonData(response, "projectId");
		System.out.println(expdata);
		
		//connect to database and verify the project
		
		String query = "select * from project;";
		String actdata = dutil.readDatafromDB(query, 1, expdata);
		System.out.println(actdata);
		//validate
		Assert.assertEquals(actdata, expdata);
		
	}
	

}
