package Pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Orbitz_page
{
	WebDriver driver;
	
	By newtab=By.xpath("//*[@id=\"listYourProperty\"]/div");
	
	By image=By.xpath("//*[@id=\"app-layer-base\"]/div/main/div/div/div/div/div[2]/section[2]/div/div[2]/div/div[2]/div[1]/div[3]/div[4]/div/a");
	
	
	By plus=By.xpath("//*[@id=\"lodging_search_form\"]/div/div/div[3]/div/div[2]/div/div/section/div[1]/div[1]/div/div/button[2]");
	By donedone=By.xpath("//*[@id=\"traveler_selector_done_button\"]");
	By quit=By.xpath("//*[@id=\"app-layer-base\"]/div[1]/div[2]/div[1]/div[3]/div/div/section/div/div/div[1]/button");
	By logo=By.xpath("//*[@id=\"app-layer-base\"]/div[1]/div[1]/div[5]/header/div/a/img");
	
	 By sigin=By.xpath("//*[@id=\"gc-custom-header-nav-bar-acct-menu\"]/button");
	
	By createaccount=By.xpath("//*[@id=\"gc-custom-header-nav-bar-acct-menu\"]/div/div[1]/div/div/a[2]");
	
	By emailid= By.xpath("//*[@id=\"signupFormEmailInput\"]");
	By fname=By.xpath("//*[@id=\"signupFormFirstNameInput\"]");
	By lname=By.xpath("//*[@id=\"signupFormLastNameInput\"]");
	By password=By.xpath("//*[@id=\"signupFormPasswordInput\"]");
	By register=By.xpath("//*[@id=\"signupFormSubmitButton\"]");
	By continu=By.xpath("//*[@id=\"app-layer-base\"]/div/div/div/a");
	By account=By.xpath("//*[@id=\"gc-custom-header-nav-bar-acct-menu\"]/button");
	
	//By profile=By.xpath("//*[@id=\"gc-custom-header-nav-bar-acct-menu\"]/button/span/span");
	By signout=By.xpath("//*[@id=\"gc-custom-header-nav-bar-acct-menu\"]/div/div[3]/a[4]");
	

	
	By loginsignin=By.xpath("//*[@id=\"gc-custom-header-nav-bar-acct-menu\"]/div/div[1]/div/div/a[1]");
	By loginemail=By.xpath("//*[@id=\"loginFormEmailInput\"]");
	By loginpswd=By.xpath("//*[@id=\"loginFormPasswordInput\"]");
	By loginbtn=By.xpath("//*[@id=\"loginFormSubmitButton\"]");
	
	
	By place=By.xpath("//*[@id=\"lodging_search_form\"]/div/div/div[1]/div/div/div[2]/div[1]/button");
	By goingto=By.xpath("//*[@id=\"destination_form_field\"]");
	By nextmonth=By.xpath("//*[@id=\"lodging_search_form\"]/div/div/div[2]/div/div[1]/div/div/button");
	By dates=By.xpath("//*[@id=\"lodging_search_form\"]/div/div/div[2]/div/div/div/div/button");
	By month=By.xpath("//*[@id=\"lodging_search_form\"]/div/div/div[2]/div/section/div[1]/div/div[3]/div/div/div[3]/div/div[2]/table/tbody/tr[4]/td[1]/div");
	By datedone=By.xpath("//*[@id=\"lodging_search_form\"]/div/div/div[2]/div/section/footer/div/button");
	By travellers=By.xpath("//*[@id=\"lodging_search_form\"]/div/div/div[3]/div/div[1]/button");
	By child=By.xpath("//*[@id=\"lodging_search_form\"]/div/div/div[3]/div/div[2]/div/div/section/div[1]/div[2]/div[1]/div/button[2]/span/svg");
	By childage=By.xpath("//*[@id=\"age-traveler_selector_children_age_selector-0-0\"]");
	By traveldone=By.xpath("//*[@id=\"traveler_selector_done_button\"]");
	By search=By.xpath("//*[@id=\"search_button\"]");      
	//By searchresult=By.xpath("")
	
	By date1=By.xpath("//*[@id=\"lodging_search_form\"]/div/div/div[2]/div/section/div[1]/div/div[3]/div/div/div[3]/div/div[2]/table/tbody/tr[4]/td[7]/div/div[2]");
	By next=By.xpath("//*[@id=\"lodging_search_form\"]/div/div/div[2]/div/section/div[1]/div/div[3]/div/div/div[2]/button");
	By date2=By.xpath("//*[@id=\"lodging_search_form\"]/div/div/div[2]/div/section/div[1]/div/div[3]/div/div/div[3]/div/div[2]/table/tbody/tr[3]/td[3]/div");
	By done=By.xpath("//*[@id=\"lodging_search_form\"]/div/div/div[2]/div/section/footer/div/button");
	
	
	public Orbitz_page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void titleverification()
	{
		String actualtitle=driver.getTitle();
		String expecttitle="Orbitz Hotel Deals, Flights, Cheap Vacations & Rental Cars";
		if(actualtitle.equals(expecttitle))
		{
			System.out.println("Title is verified");
		}
		else
		{
			System.out.println("title is not verified");
		}
	}
	
	
	public void contentverification()
	{
		String content=driver.getPageSource();
		if(content.contains("More travel"))
		{
			System.out.println("content is verified");
		}
		else
		{
			System.out.println("content is not verified");
		}
	}
	
	
	public void linkvalidation() throws Exception
	{
		String baseurl="https://www.orbitz.com/";
		driver.get(baseurl);
		URL obj=new URL(baseurl);
		HttpURLConnection con=(HttpURLConnection)obj.openConnection();
		con.connect();
		
		if(con.getResponseCode()==200)
		{
			System.out.println("valid url: "+baseurl);
		}
		else
		{
			System.out.println("invalid url: "+baseurl);
		}
		
	}
	
	
	
	public void logo()
	{
		WebElement logos = driver.findElement(logo);
		if(logos.isDisplayed())
		{
			System.out.println("logo is present");
		}
		else
		{
			System.out.println("logo is not present");
		}
	}
	
	
	
	
	 public void screenshot() throws Exception
	{
		WebElement day = driver.findElement(logo);
		File src=day.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("./Screenshot//logos.png"));
		
		File src1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1,new File("I:\\orbitzz.png"));
	}   
	
	
	public void register() throws Exception
	{
		//Thread.sleep(2000);
		//driver.findElement(quit).click();
		//Thread.sleep(2000);
		driver.findElement(sigin).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(createaccount).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		Thread.sleep(1000);
		
		driver.findElement(emailid).sendKeys("electronix84@gmail.com");
		driver.findElement(fname).sendKeys("vishal");
		driver.findElement(lname).sendKeys("thomas");
		driver.findElement(password).sendKeys("vishal@1122");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)","");
		Thread.sleep(2000);
		driver.findElement(register).click();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(continu).click();
		
		//logout
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(account).click();
		Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(signout).click();
	}
		
		
		
		//login
		
		public void login() throws Exception
		{
			Thread.sleep(2000);
			driver.findElement(sigin).click();
			Thread.sleep(2000);
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(loginsignin).click();
		//	Thread.sleep(2000);
			
			File f=new File("I:\\project.xlsx");
			FileInputStream fi=new FileInputStream(f);
			XSSFWorkbook wb=new XSSFWorkbook(fi);
			XSSFSheet sh=wb.getSheet("Sheet1");
			System.out.println("last row number : "+sh.getLastRowNum());
			
			for(int i=1;i<=sh.getLastRowNum()-1;i++)
			{
				String username=sh.getRow(i).getCell(0).getStringCellValue();
				String password=sh.getRow(i).getCell(1).getStringCellValue();
				
				driver.findElement(loginemail).clear();
				driver.findElement(loginemail).sendKeys(username);
				Thread.sleep(2000);
				System.out.println("email : "+username);
				driver.findElement(loginpswd).clear();
				driver.findElement(loginpswd).sendKeys(password);
				Thread.sleep(2000);
				System.out.println("password : "+password);
				driver.findElement(loginbtn).click();
				Thread.sleep(2000);
			}
			System.out.println("login sucessfull...");
			
			
		}
		
		
		//booking
		
		public void booking() throws Exception
		{
			driver.findElement(quit).click();
			//driver.findElement(By.xpath("//*[@id=\"app-layer-base\"]/div[1]/div[2]/div[1]/div[3]/div/div/section/div/div/div[1]/button/svg")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(place).click();
			driver.findElement(goingto).sendKeys("paris",Keys.ENTER);
			//Thread.sleep(3000);
			driver.findElement(dates).click();
			 JavascriptExecutor jsk = (JavascriptExecutor) driver;
				jsk.executeScript("window.scrollBy(0,180)", "");
				driver.findElement(date1).click();
				//Thread.sleep(2000);
				driver.findElement(next).click();	
				//Thread.sleep(2000);
				driver.findElement(date2).click();
				//Thread.sleep(2000);
				driver.findElement(done).click();
				
				
				
				//travelers
				driver.findElement(travellers).click();
				//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				jsk.executeScript("window.scrollBy(0,70)","");
				//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				//driver.findElement(child).click();
				driver.findElement(plus).click();
				driver.findElement(donedone).click();
				driver.findElement(search).click();
				
				//drop down
				
			/*	WebElement cage = driver.findElement(childage);
				Select ages=new Select(cage);
				ages.selectByValue("5");
				driver.findElement(traveldone).click();  */
				
				
				//image to book
				
				jsk.executeScript("window.scrollBy(0,150)", "");
				Thread.sleep(3000);
				driver.findElement(image).click();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				
				

				
	}
		
		//window handling
		
		public void windowhandling() throws Exception
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			Thread.sleep(2000);
			//JavascriptExecutor jsk = (JavascriptExecutor) driver;
		    //jsk.executeScript("window.scrollBy(0, 580)", "");
			
			String currentWindow = driver.getWindowHandle();
		    System.out.println("Parent window title: " + driver.getTitle());
		    
		 //   JavascriptExecutor jsk = (JavascriptExecutor) driver;
		 //   jsk.executeScript("window.scrollBy(0, 580)", "");
		   
		    driver.findElement(newtab).click();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		    Set<String> allWindowHandles = driver.getWindowHandles();
		    
		    for (String handle : allWindowHandles) {
		        if (!handle.equalsIgnoreCase(currentWindow)) {
		            driver.switchTo().window(handle);
		            System.out.println("Switched to window with title: " + driver.getTitle());
		           // driver.findElement(image).click(); // Assuming you want to click on the image
		            // You may perform other actions here as needed
		            // Don't forget to close the child window or switch back to the parent window
		           driver.close(); // Close the child window if needed
		           driver.switchTo().window(currentWindow); // Switch back to the parent window
		         
		        }
		    }
					
		}
	


}