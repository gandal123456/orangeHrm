package utility;

public class Calling 

{

	public static void main(String[] args) throws InterruptedException
	{

		
		   //browserLaunch
		     Object[] input=new Object[2];
		              input[0]="webdriver.chrome.driver";
		              input[1]= "F:\\Automation Support 2025\\chromedriver.exe";	
		     SeleniumOperations.browserLaunch(input); 
		
		  //openApp
		     Object[] input1=new Object[1];
             input1[0]="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";         
	    	SeleniumOperations.openApplication(input1);

	    	
	       //sendTextOnUi
		     Object[] input2=new Object[2];
		              input2[0]="//*[@name='username']";
		              input2[1]= "Admin";	
		     SeleniumOperations.sendText(input2); 
		     
		     //sendTextOnUi
		     Object[] input3=new Object[2];
		              input3[0]="//*[@type='password']";
		              input3[1]= "admin123";	
		     SeleniumOperations.sendText(input3); 


		     Thread.sleep(3000);
		    //click
			  Object[] input4=new Object[1];
		             input4[0]="//*[@type='submit']";         
			  SeleniumOperations.clickOnElement(input4);
		
       
			   
		 //validationOf Login
			     Object[] input5=new Object[2];
			              input5[0]="Dashboard";
			              input5[1]="//*[contains(@class,'oxd-text oxd-text--h')]";	//getText()   Dashboard
			     SeleniumOperations.validation(input5); 
             
                
  
        
        
        
        
	}

}
