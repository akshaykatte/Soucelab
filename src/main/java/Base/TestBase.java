package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver ;
	
	public void initilization()throws Exception
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//	driver.get("https://www.saucedemo.com/");
		driver.get(UtilityClass.ReadData.readProper("url"));
	}
	
	
	
	
	

}
