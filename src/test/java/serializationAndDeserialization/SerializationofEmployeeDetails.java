package serializationAndDeserialization;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClassforSerializationandDeserialization.EmployeeDetailsPojo;

public class SerializationofEmployeeDetails {
	
	@Test
	public void serializationofempdetails() throws Throwable, Throwable, Throwable
	{
			EmployeeDetailsPojo emp = new EmployeeDetailsPojo("Kavya", "TYP2244", "kavya.r@testyantra.com", 1234567890, "kathraguppe");
			ObjectMapper obj = new ObjectMapper();
			obj.writeValue(new File("./empdata.json"), emp);
			
	}

}
