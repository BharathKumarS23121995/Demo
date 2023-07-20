package Test.Demo;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.Baseclass;
import pageObjectModel.HomePage;

public class loginTest extends Baseclass{
	
	


	@Test(priority = 1)
	public void VerifyLoginPage() {
		HomePage home=new HomePage();
//		assertEquals(home.HomePageText(), "Swag Labs");
		
	}
//	@Test(priority = 2)
	
	
}
