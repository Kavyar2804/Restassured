package genricUtility;

import java.sql.SQLException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.*;

public class Base_class_for_specBuilder {
	
	public DataBase_utility dutil = new DataBase_utility();
	public Excel_utility eutil =new Excel_utility();
	public Java_utility jutil = new Java_utility();
	public Rest_assured_library rutil = new Rest_assured_library();
	public RequestSpecification requestspec;
	public ResponseSpecification responsespec;
	
	
	@BeforeSuite
	public void requestspecBuilder() throws Throwable
	{
		dutil.connectToDB();
		System.out.println("connect to DB");
		RequestSpecBuilder builder = new RequestSpecBuilder();
		builder.setBaseUri("http://localhost");
		builder.setPort(8084);
		builder.setContentType(ContentType.JSON);
		requestspec = builder.build();
		
	}
	
	@AfterSuite
	public void responseSpecBuilder()  throws Throwable
	{
		dutil.closedataBase();
		System.out.println("close db");
		ResponseSpecBuilder builder1 = new ResponseSpecBuilder();
		builder1.expectContentType(ContentType.JSON);
		responsespec = builder1.build();
		
	}
	
	

}
