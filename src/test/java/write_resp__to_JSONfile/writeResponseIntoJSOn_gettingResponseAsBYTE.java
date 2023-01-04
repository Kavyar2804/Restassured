package write_resp__to_JSONfile;

import java.io.File;
import java.io.IOException;

import com.google.common.io.Files;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class writeResponseIntoJSOn_gettingResponseAsBYTE {

	public static void main(String[] args) throws Throwable {
		String jsonstring = "{\"username\" : \"admin\",\"password\" : \"password123\"}";
		RequestSpecification req = RestAssured.given();
		req.contentType(ContentType.JSON);
		req.baseUri("https://restful-booker.herokuapp.com/auth");
		req.body(jsonstring);
		Response res = req.post();
		byte[] responsebyteArray = res.asByteArray();
		File targetFileforByteArray = new File("./src/main/resources/targetFileForByte.json");
		Files.write(responsebyteArray, targetFileforByteArray);
		

	}

}
