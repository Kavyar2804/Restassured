package crudOperationwithBDD;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

public class Post_Multipart 
{
	
	@Test
	public void uploadimage()
	{
		File fil = new File("C:/Users/Kavya/Downloads/puppy.jpg");
		given().multiPart("File",fil,"multipart/form-data");
		RestAssured.post("https://the-internet.herokuapp.com/upload")
		.then().log().all().assertThat();
	}
	

}
