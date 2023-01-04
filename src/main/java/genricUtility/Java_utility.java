package genricUtility;

import java.util.Random;

public class Java_utility {
	
	public int RandomNum()
	{
		Random rnum = new Random();
		int rum = rnum.nextInt(10000);
		return rum;
	}

}
