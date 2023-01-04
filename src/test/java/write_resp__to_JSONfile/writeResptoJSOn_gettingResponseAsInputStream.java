package write_resp__to_JSONfile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import com.google.common.io.Files;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class writeResptoJSOn_gettingResponseAsInputStream {

	public static void main(String[] args) throws Throwable {
		
		String jsonstring = "{\"username\" : \"admin\",\"password\" : \"password123\"}";
			RequestSpecification req = RestAssured.given();
			req.contentType(ContentType.JSON);
			req.baseUri("https://restful-booker.herokuapp.com/auth");
			req.body(jsonstring);
			Response res = req.post();
			InputStream responseAsInputStream = res.asInputStream();
				byte[] responseAsInputStremByte = new byte[responseAsInputStream.available()];
				responseAsInputStream.read(responseAsInputStremByte);
				File targetFileforInputStream = new File("./src/main/resources/targetfileforInputstream.json");
				Files.write(responseAsInputStremByte, targetFileforInputStream);
			
	}

}
