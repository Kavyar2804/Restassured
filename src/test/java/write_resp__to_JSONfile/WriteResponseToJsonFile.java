package write_resp__to_JSONfile;

import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.IOException;

public class WriteResponseToJsonFile {
	
	@Test
	public void writeResp() throws Throwable
	{
		baseURI = "http://localhost";
		port = 8084;
		Response res = when().get("/projects");
		byte[] responseasBytearray = res.asByteArray();
		File targetfileforprojects = new File("./src/main/resources/rmgyantragetProjects.json");
		Files.write(responseasBytearray, targetfileforprojects);
	
	}

}
