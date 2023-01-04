package genricUtility;

import io.restassured.response.Response;
/**
 * consist of methods of rest assured tool
 * @author Kavya
 *
 */

public class Rest_assured_library {
	/**
	 * This method is used to return json data from the corresponding response body
	 * @param response
	 * @param path
	 * @return
	 */
	
	
	public String getJsonData(Response response, String path)
	{
		String jsondata = response.jsonPath().get(path);
		return jsondata;
	}

}
