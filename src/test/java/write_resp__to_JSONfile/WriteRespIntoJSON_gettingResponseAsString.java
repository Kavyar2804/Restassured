package write_resp__to_JSONfile;

import java.io.File;
import java.io.IOException;

import com.google.common.io.Files;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class WriteRespIntoJSON_gettingResponseAsString {
	
	public static void main(String[] args) throws IOException {
		
		String jsonstring = "{\"username\" : \"admin\",\"password\" : \"password123\"}";
		RequestSpecification req = RestAssured.given();
		req.contentType(ContentType.JSON);
		req.baseUri("https://restful-booker.herokuapp.com/auth");
		req.body(jsonstring);
		// Getting response as a string and writing in to a file
		Response res = req.post();
		byte[] responseAsstringByte = res.asString().getBytes();	
		File targetFileForString = new File("./src/main/resources/targetFileForString.json");
		Files.write(responseAsstringByte, targetFileForString);
		
	}

}
