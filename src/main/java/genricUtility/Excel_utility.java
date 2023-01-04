package genricUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_utility {
	/**
	 * This method is used to read data from excel by using dataprovider
	 * @param sheetname
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public  Object[][] ReadDataFromExcel(String sheetname) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fip = new FileInputStream("./src/test/resources/data.xlsx");
		Workbook book = WorkbookFactory.create(fip);
		Sheet sh = book.getSheet(sheetname);
		int lastrownum = sh.getLastRowNum()+1;
		int clnum = sh.getRow(0).getLastCellNum();
		Object[][] obj = new Object[lastrownum] [clnum];
		for(int i=0; i<lastrownum; i++)
		{
			for(int j=0; j<clnum; j++)
			{
				obj[i][j]  = sh.getRow(i).getCell(j).getStringCellValue();
			}
		}
		
		return obj;
		 
	}
	
	
	public String readDatafromexcelnormal(String sheetname, int rownum, int celnum ) throws Throwable
	{
		FileInputStream fip = new FileInputStream("./src/test/resources/data.xlsx");
		Workbook book = WorkbookFactory.create(fip);
		Sheet sh = book.getSheet(sheetname);
		Row ro = sh.getRow(rownum);
		Cell cel = ro.getCell(celnum);
		String value = cel.getStringCellValue();
		return value;
	}
	
	

}
