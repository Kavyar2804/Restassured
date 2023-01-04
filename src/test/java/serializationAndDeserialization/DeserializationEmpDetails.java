package serializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClassforSerializationandDeserialization.EmployeeDetailsPojo;

public class DeserializationEmpDetails {
	
	@Test
	
	public void deserialization() throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper obj = new ObjectMapper();
		
	 EmployeeDetailsPojo e = obj.readValue(new File("./empdata.json"), EmployeeDetailsPojo.class);
		
	System.out.println( e.getEname());
	}

}
