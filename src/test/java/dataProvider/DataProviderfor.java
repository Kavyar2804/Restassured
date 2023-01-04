package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import PojoclassForPostingBody.BodyforProject;
import io.restassured.http.ContentType;

public class DataProviderfor {
	
	@Test(dataProvider= "getData")
	public void dataFromDataProvider(String createdBy, String projectName, String status ,int teamSize)
	{
		BodyforProject bo = new BodyforProject(createdBy, projectName, status, teamSize);
		given()
		.body(bo)
		.contentType(ContentType.JSON)
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		.assertThat()
		.log()
		.all()
		.statusCode(201);
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] obj = new Object[3][4];
		obj[0][0]= "PillChamp";
		obj[0][1]= "newyear023";
		obj[0][2] = "new";
		obj[0][3] = 520;
		
		obj[1][0]= "PillChamp";
		obj[1][1]= "newyear024";
		obj[1][2] = "new";
		obj[1][3] = 420;
		
		obj[2][0]= "PillChamp";
		obj[2][1]= "newyear025";
		obj[2][2] = "new";
		obj[2][3] = 320;
		return obj;
		
		
	}

}
