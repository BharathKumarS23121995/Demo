package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

WebDriver driver;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[text()='Swag Labs']")
	private  WebElement HomePageVerify;
	public WebElement getHomePageVerify()
	
	{
		return HomePageVerify;
	}
	
	@FindBy(xpath = "//button[@id='react-burger-menu-btn']")
		private WebElement MenuBtton;
	public WebElement getMenuBtton()
	
	{
		return MenuBtton;
	}
	@FindBy(xpath = "//a[@id='about_sidebar_link']")
	private WebElement AboutMenu;
public WebElement getAboutMenu()

{
	return AboutMenu;
}
	
	
	public String HomePageText() {
		return HomePageVerify.getText();
		
	}
	
	public void ClickOnMenu() {
		MenuBtton.click();//these menthods can be maintained in the uitilies 
	}
	
	
	
	
}
