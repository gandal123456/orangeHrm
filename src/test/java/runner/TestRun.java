package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
    features="src/test/resources/Business_Logic",
        glue="mapping",
  
        plugin={"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
       

)
public class TestRun extends AbstractTestNGCucumberTests
{

	
	
  

	
	
}