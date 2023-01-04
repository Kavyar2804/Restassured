package genricUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DataBase_utility {
	
	Connection con =null;
	
	//connect to database
	/**
	 * This method is used to connect to database
	 * @author Kavya
	 * @throws SQLException
	 */
	
	public void connectToDB() throws SQLException
	{
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		con = DriverManager.getConnection(Ipath_constants.Db_path, Ipath_constants.Dbuser_name, Ipath_constants.Db_pwd);
	
	}
	/**
	 * This method is used read data from database
	 * @param query
	 * @param columnIndex
	 * @param expdata
	 * @return
	 * @throws Throwable
	 */
	public String readDatafromDB(String query, int columnIndex, String expdata ) throws Throwable
	{
		boolean flag =false;
		ResultSet result = con.createStatement().executeQuery(query);
		while(result.next())
		{
			if(result.getString(columnIndex).equalsIgnoreCase(expdata))
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("verified");
			return expdata;
		}
		return expdata;
	}
	/**
	 * this method is used to close database
	 * @throws Throwable
	 */
	public void closedataBase() throws Throwable
	{
		con.close();
	}

}
