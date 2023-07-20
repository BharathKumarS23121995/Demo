package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import baseclass.Baseclass;

public class LoginPage  {
	WebDriver driver;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='user-name']")
	private  WebElement UsernameTextfeild;
	public WebElement getUsernameTextfeild()
	
	{
		return UsernameTextfeild;
	}
	
	@FindBy(xpath = "//input[@id='password']")
	private  WebElement PasswordTextfeild;
	public WebElement getPasswordTextfeild()
	
	{
		return PasswordTextfeild;
	}
	
	
	@FindBy(xpath = "//input[@id='login-button']")
	private  WebElement LoginButton;
	public WebElement getLoginButton()
	
	{
		return LoginButton;
	}
	
	//method to enter user name and passward to login
	public void login() {
		
		UsernameTextfeild.sendKeys("standard_user");
		PasswordTextfeild.sendKeys("secret_sauce");
		LoginButton.click();
	}

}
