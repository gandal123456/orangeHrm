package mapping;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hookable 
{
	
	     @Before
	    public void before(Scenario scenario)
	    {
	      System.out.println("---------------------Scenario Starts-----------------------");	
	    }
	
	
	
         @After
	    public void after(Scenario scenario)
	    {
	    	System.out.println("---------------------Scenario Ends-----------------------");	
	    }
	
	
	
	
	
	

}
