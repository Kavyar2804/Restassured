package serializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClassforSerializationandDeserialization.EmployeeDetailsWithObject;

public class DeserialzationOfObject {
	
	@Test
	public void deserial1() throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper obj = new ObjectMapper();
		EmployeeDetailsWithObject e = obj.readValue(new File("./empdata3.json"), EmployeeDetailsWithObject.class);
		System.out.println(e.getSpouse());
		System.out.println(e.getClass());
	}

}
