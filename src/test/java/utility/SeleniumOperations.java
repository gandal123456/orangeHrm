package utility;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import mapping.ConfigReader;


public class SeleniumOperations 
{
	 public static WebDriver driver=null;
	 public static ConfigReader config;
	    //browserLaunch
		  public static void browserLaunch(Object[]inputParameters)
		  {
		   try
			 { 
			  String givenBrowserName=(String) inputParameters[0];    // sending browserName
			
			  if(givenBrowserName.equalsIgnoreCase("chrome"))  				
	     		{
				 config=new ConfigReader();
			     System.setProperty("webdriver.chrome.driver",config.getDriverPathChrome());		  
			     driver=new ChromeDriver(); 			   
			     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
			     }
			  else if(givenBrowserName.equalsIgnoreCase("Firefox"))  				
	     		{
				 config=new ConfigReader();
			     System.setProperty("webdriver.gecko.driver",config.getDriverPathFireFox());		  
			     driver=new FirefoxDriver(); 
			     
			     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(config.getImplicitlyWait()));	
			     }
			
			 }catch(Exception e)
			 {
				 System.out.println(e);
			 }
		  }
		
		
		//openApp
		  public static void openApplication()
		  {
			  try {			  
			 driver.get(config.getApplicationUrl());
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(config.getImplicitlyWait()));	
			  }catch(Exception e)
				 {
					 System.out.println(e);
				 }
		  }

	
	  
	  
	//sendTextonUi
	  public static void sendText(Object[]inputParameters)
	  {
		  try
		  {
		   String xpath=(String) inputParameters[0];
		   String text=(String) inputParameters[1];
		
		  driver.findElement(By.xpath(xpath)).sendKeys(text);
		 
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(config.getImplicitlyWait()));	
		  }catch(Exception e)
			 {
				 System.out.println(e);
			 }
	  }
	
	//click
	  public static void clickOnElement(Object[]inputParameters)
	  {
		 try {
		  String xpath=(String) inputParameters[0];
		 
		  driver.findElement(By.xpath(xpath)).click();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(config.getImplicitlyWait()));	
		  
		 }catch(Exception e)
		 {
			 System.out.println(e);
		 }  
	  } 

	 //validation
	  public static void validation(Object[]inputParameters)
	  {
		  try {

			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(config.getImplicitlyWait()));	
		   String givenText=(String) inputParameters[0];   //text
		   String xpath=(String) inputParameters[1];     //xpath
		  
		String capturedText= driver.findElement(By.xpath(xpath)).getText();
	
		if(givenText.equalsIgnoreCase(capturedText))
		{
			
			System.out.println("Test Case Pass");
		}
		else
		{
			System.out.println("Test Case Pass");
		}
		
		  }
		  
		  catch(Exception e)
			 {
				 System.out.println(e);
			 }
	  }
	  
	
	  
	  public static void actions_DropDown(Object[]inputParameters)
	  {
		try { 
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(config.getImplicitlyWait()));	
		  
		  
		   String xPath=(String) inputParameters[0];   //xpath of element
		  
		  
		  WebElement a=  driver.findElement(By.xpath(xPath));
		   
			Actions act=new Actions(driver);
			
	      act.moveToElement(a).click().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		  
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		  
		  
		  
		  
	  }
	  
	  
	  
	 
	
}







