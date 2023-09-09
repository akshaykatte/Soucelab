package UtilityClass;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import Base.TestBase;

public class ScreenShot extends TestBase {
	
	
	
	
	public static void Screenshots(String name)throws Exception
	{
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\91899\\eclipse-workspace\\Maven_New_Version\\ScreenShots\\"+name+".jpeg");
		
		FileHandler.copy(src, dest);
		
		
	}
	

}
