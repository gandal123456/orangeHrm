package trial;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Demo {

	
		public static void main(String[] args) throws InterruptedException
		{
	      //BrowserLauch
			 System.setProperty("webdriver.chrome.driver", "F:\\Automation Support 2025\\chromedriver.exe");		  
			  ChromeDriver driver=new ChromeDriver();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			  
			 
		  //openApplication	  
			  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			  
	       //enter username
			  driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
			  
		   //enter password
			  driver.findElement(By.xpath("//*[@type='password']")).sendKeys("admin123");
			  
		   //click on submit
			  driver.findElement(By.xpath("//*[@type='submit']")).click();
			  
			 Thread.sleep(3000);
			 
			//click on admin
			  driver.findElement(By.xpath("(//*[@role='presentation'])[2]")).click();
			 
			//click on add user
			//  Thread.sleep(3000);
			  driver.findElement(By.xpath("(//*[@type='button'])[6]")).click();
			  
			//click on 1st dropdown and select Admin
			WebElement a=  driver.findElement(By.xpath("(//*[@class='oxd-select-text--after'])[1]"));
			   
			Actions act=new Actions(driver);
			
		          act.moveToElement(a).click().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		          
		    //click on 2st dropdown and select Enabled    
		          WebElement b=  driver.findElement(By.xpath("(//*[@class='oxd-select-text--after'])[2]"));
			
		  	          act.moveToElement(b).click().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform(); 
		    //enter password
		  	          driver.findElement(By.xpath("(//*[@type='password'])[1]")).sendKeys("Demo@123");
		          
		  	//enter name
		  	         WebElement c= driver.findElement(By.xpath("//*[@placeholder='Type for hints...']"));	   
		  	       act.moveToElement(c).click().sendKeys("ra").build().perform();
		  	       	  	      
		  	     Thread.sleep(3000);
		  	       act.sendKeys(Keys.ARROW_DOWN).build().perform();
		  	       
		  	     Thread.sleep(3000); 
		  	     act.sendKeys(Keys.ENTER).build().perform();
		       
		  	//enter username
		  	        driver.findElement(By.xpath("(//*[@class='oxd-input oxd-input--active'])[2]")).sendKeys("demo5445");
		  	          
		  	//confirm password          
		  	       driver.findElement(By.xpath("(//*[@type='password'])[2]")).sendKeys("Demo@123"); 
		  	       
		  //submit
		  	       driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		  	       System.out.println("Run All ");
		//within 2 test cases   4 times used sendKeys()	     3times used click()
	   
     	// create sendKeys() method and that applicable to all elements those want text from keyboard
		  //create click() and applicable to all elements those need to click	       
		  	       
		  	       
		}

	}



