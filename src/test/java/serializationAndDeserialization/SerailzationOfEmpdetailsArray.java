package serializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClassforSerializationandDeserialization.EmployeeDetailswithArrayPojo;

public class SerailzationOfEmpdetailsArray {
	
	String [] eml={"kavyar62@ymail.com","kavyar@testyantra.com"};
	int [] phn= {9916334,9148520};
	@Test
	public void serailization() throws JsonGenerationException, JsonMappingException, IOException
	{
		EmployeeDetailswithArrayPojo emp1 = new EmployeeDetailswithArrayPojo("kavya", "TYP224", eml, phn, 560072, "katraguppe");
		ObjectMapper obj1 = new ObjectMapper();
		obj1.writeValue(new File("./empdataarray.json"), emp1);
	}

}
