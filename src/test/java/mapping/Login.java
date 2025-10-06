package mapping;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.SeleniumOperations;



public class Login 
{


	@Given("user opens {string} chrome browser") 
	public void bLaunch1(String key1)
	{
		 Object[] input=new Object[1];
         input[0]=key1;        	
         SeleniumOperations.browserLaunch(input);
	}

	@Given("user enter url")
	public void openApp1()
	{         
	    	SeleniumOperations.openApplication(); 
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

	@Then("Application shows user profile to  user")
	public void application_shows_user_profile_to_user()
	{
	    Object[] input5=new Object[2];
        input5[0]="Dashboard";
        input5[1]="(//*[text()='Dashboard'])[2]";	//getText()   Dashboard
        SeleniumOperations.validation(input5); 
 
	}

	
	

	
	
	
	
	
	
	

}
