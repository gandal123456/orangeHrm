package utility;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumOperations 
{
  
	    public static WebDriver driver=null;	
    //browserLaunch
	  public static void browserLaunch(Object[]inputParameters)
	  {
		  String key=(String) inputParameters[0];
		  String value=(String) inputParameters[1];
		  
		  
		  System.setProperty(key,value);		  
		   driver=new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  }
	
	
	//openApp
	  public static void openApplication(Object[]inputParameters)
	  {
		  String url=(String) inputParameters[0];
		  
		 driver.get(url);
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
	  }
	
	//sendTextonUi
	  public static void sendText(Object[]inputParameters)
	  {
		   String xpath=(String) inputParameters[0];
		   String text=(String) inputParameters[1];
		
		  driver.findElement(By.xpath(xpath)).sendKeys(text);
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  
	  }
	
	//click
	  public static void clickOnElement(Object[]inputParameters)
	  {
		  String xpath=(String) inputParameters[0];
		 
		  driver.findElement(By.xpath(xpath)).click();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  
	  } 

	 //validation
	  public static void validation(Object[]inputParameters)
	  {
		  
		   String givenText=(String) inputParameters[0];   //text
		   String xpath=(String) inputParameters[1];     //xpath
		  
		String capturedText= driver.findElement(By.xpath(xpath)).getText();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  
		if(givenText.equalsIgnoreCase(capturedText))
		{
			
			System.out.println("Test Case Pass");
		}
		else
		{
			System.out.println("Test Case Fail");
		}
		  
	  }
	  
	  
	  
	  

}







