package DifferentWaysToPostody;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import PojoclassForPostingBody.BodyforProject2;
import genricUtility.Excel_utility;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.IOException;

public class Posting_body_excel {
	
	@Test(dataProvider="provideData")
	public void postingBodythroughExcel(String createdBy, String projectName, String status,String teamSize)
	{
		
		BodyforProject2 bod = new BodyforProject2(createdBy, projectName, status, teamSize);
		given()
		.body(bod)
		.contentType(ContentType.JSON)
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		.assertThat()
		.log()
		.all();
		
	}
	
	@DataProvider
	public Object[][] provideData() throws EncryptedDocumentException, IOException
	{
		Excel_utility eutil = new Excel_utility();
		Object[][] val = eutil.ReadDataFromExcel("Sheet1");
		return val;
	}

}
