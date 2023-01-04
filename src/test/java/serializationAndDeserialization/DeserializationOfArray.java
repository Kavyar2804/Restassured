package serializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClassforSerializationandDeserialization.EmployeeDetailswithArrayPojo;

public class DeserializationOfArray {
	
	@Test
	public void deserial() throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper obj = new ObjectMapper();
		EmployeeDetailswithArrayPojo e = obj.readValue(new File("./empdataarray.json"), EmployeeDetailswithArrayPojo.class);
		String[] m = e.getEmail();
		for(int i=0; i<m.length; i++)
		{
			System.out.println(m[i]);
		}
		int[] p = e.getPhnNo();
		for(int i=0; i<p.length; i++)
		{
			System.out.println(p[i]);
		}
	}

}
