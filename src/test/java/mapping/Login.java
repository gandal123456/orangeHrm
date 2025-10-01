package mapping;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.SeleniumOperations;

public class Login 
{
	
	@Given("user opens {string} chrome browser with exe {string}")  
	public void user_opens_chrome_browser_with_exe(String key1, String value1)
	{
		 Object[] input=new Object[2];
         input[0]=key1;
         input[1]=value1;	
         SeleniumOperations.browserLaunch(input);   
	}

	@Given("user enter url as {string}")
	public void user_enter_url_as(String url1)
	{
		   Object[] input1=new Object[1];
           input1[0]=url1;         
	    	SeleniumOperations.openApplication(input1); 
	}

	@When("user enter {string} as username")
	public void user_enter_as_username(String uname)
	{
		 Object[] input2=new Object[2];
         input2[0]="//*[@name='username']";
         input2[1]= uname;	
SeleniumOperations.sendText(input2); 
	}

	@When("user enter {string} as password")
	public void user_enter_as_password(String pass) 
	{
		Object[] input3=new Object[2];
        input3[0]="//*[@type='password']";
        input3[1]= pass;	
SeleniumOperations.sendText(input3); 
	}

	@When("user click on  login button")
	public void user_click_on_login_button()
	{
		  Object[] input4=new Object[1];
          input4[0]="//*[@type='submit']";         
	  SeleniumOperations.clickOnElement(input4);  
	}

	@Then("Application shows user profile to user")
	public void application_shows_user_profile_to_user()
	{
	    Object[] input5=new Object[2];
        input5[0]="Dashboard";
        input5[1]="//*[contains(@class,'oxd-text oxd-text--h')]";	//getText()   Dashboard
SeleniumOperations.validation(input5); 
 
	}

	
	
	
	
	

}
