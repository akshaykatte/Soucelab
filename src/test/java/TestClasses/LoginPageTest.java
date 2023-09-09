package TestClasses;

import org.testng.Assert;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.TestBase;
import PageClass.LoginPage;

public class LoginPageTest extends TestBase{

	LoginPage login;
	@BeforeMethod
	public void setup() throws Exception
	{
		initilization();
		login = new LoginPage();
	}
	@Test(dataProvider="loginData")
	public void verifyLoginTest(String name , String pass) throws Exception
	{
		//SoftAssert a = new SoftAssert();
		String exp = "https://www.saucedemo.com/inventory.html";
		String act = login.verifyLogin(name,pass);
		Assert.assertEquals(exp, act);
	}
	
	
	
	
	
	@DataProvider(name="loginData")
	public Object[][] dpMethod()
	{
	         Object data[][] = {{"standard_user","secret_sauce"} ,
			                   {"locked_out_user","secret_sauce"},
		                       {"problem_user","secret_sauce"},
		                       {"performance_glitch_user","secret_sauce"}
			                   };
		      return data;
	}
	
	
	
	@AfterMethod
	public void closeBrowser(ITestResult a) throws Exception 
	{
		if(ITestResult.FAILURE==a.getStatus())
		{
			UtilityClass.ScreenShot.Screenshots(a.getName());
		}
	driver.close();
	}

}
