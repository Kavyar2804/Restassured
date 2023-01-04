package validateResponse;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;

import static io.restassured.RestAssured.*;

public class ResponseTimeValidation {
	
	public void ValRespTime() {

		baseURI="http://localhost";
		port=8084;
		when().get("projects")
		.then()
		.assertThat().time(Matchers.lessThan(2000L), TimeUnit.MILLISECONDS);
		//body("[0].projectName", Matchers.equalTo(""));
	}

}
