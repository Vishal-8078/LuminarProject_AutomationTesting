package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Orbitz_page;

public class Orbitz_test
{
	WebDriver driver;
	
	@BeforeTest
	
	public void setup()
	{
		driver=new EdgeDriver();
	}
	
	@BeforeMethod
	
	public void url() 
	{
		
		driver.get("https://www.orbitz.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	
	public void test() throws Exception 
	{
		
		Orbitz_page ob=new Orbitz_page(driver);
		ob.logo();
		ob.titleverification();
		ob.contentverification();
		ob.linkvalidation();
		ob.screenshot();
		ob.register();
		ob.login();
		ob.booking();
		ob.windowhandling();
		
		
	}

}
