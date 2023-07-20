package baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pageObjectModel.LoginPage;

/**
 * Hello world!
 *
 */
public class Baseclass 
{
	WebDriver driver;
	Properties prop;
    public Baseclass() {
     driver= new ChromeDriver();
    
    try {
    
    
    prop=new Properties();
    
    File propfile=new File("C:\\Users\\Dell\\Bharath\\Demo\\src\\main\\java\\config\\utility"); 
  
    FileInputStream file=new FileInputStream(propfile);
    prop.load(file);
    
   }
   catch(Exception e) {
	   e.printStackTrace();
   }
    
    }
    @BeforeMethod
    public void setUp() {
    	LoginPage login =new LoginPage();
    	driver.get(prop.getProperty("URL"));
//    	driver.get("https://www.saucedemo.com/");
    	login.login();	
    }
    
    @AfterMethod
    public void tearDown() {
    	driver.quit();
    }
}
