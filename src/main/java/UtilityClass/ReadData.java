package UtilityClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {
	
	public static String readProper(String value) throws Exception
	{
		Properties p = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\91899\\eclipse-workspace\\Maven_New_Version\\TestData\\Config.Properties");
		p.load(file);
		return p.getProperty(value);
		
		
	}
	
	public static String readExcel(int row ,int col) throws Exception
	{
		FileInputStream file = new FileInputStream("C:\\Users\\91899\\eclipse-workspace\\Maven_New_Version\\TestData\\saucedata.xlsx");
		Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");
		String value =excel.getRow(row).getCell(col).getStringCellValue();
		return value;
		
	}
	

}
