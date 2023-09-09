package PageClass;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase {
	@FindBy(xpath="//input[@name='user-name']") private WebElement userName ;
	@FindBy(xpath="//input[@name='password']") private WebElement password ;
	@FindBy(xpath="//input[@name='login-button']") private WebElement loginBtn ;
	
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public String verifyLogin(String name , String pass) throws Exception
	{
		
		userName.sendKeys(name);
		
		password.sendKeys(pass);
		
		loginBtn.click();
		return driver.getCurrentUrl();
	}
	
	
	
	

}
