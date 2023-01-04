package serializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClassforSerializationandDeserialization.EmployeeDetailsWithObject;
import pojoClassforSerializationandDeserialization.Spouse;

public class SerailizationOfObject {
	
	@Test
	public void serailizationOfObj() throws JsonGenerationException, JsonMappingException, IOException
	{
		int phn[]={123456,89766};
		Spouse sp = new Spouse ("Vrudhi", "vrudi@gmail.com", phn, "bangalore");
		
		String [] eml={"prvith@ymail.com","purvith@testyantra.com"};
		int [] phn1= {9916334,9148520};
		EmployeeDetailsWithObject emp2 = new EmployeeDetailsWithObject("Purvith", "TY4122", eml, phn1, "kathraguppe", sp);
		ObjectMapper obj = new ObjectMapper();
		obj.writeValue(new File("./empdata3.json"), emp2);
	}

}
