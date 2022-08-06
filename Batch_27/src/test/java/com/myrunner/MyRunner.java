package com.myrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.testng.*;

@CucumberOptions(
 	
//help with the plugin we generate  the report like JSNON, Html
	plugin= {"pretty","json:target/cucumber.json" },		
//plugin= {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" },
			
	   // format = {"pretty","json:target/cucumber.json"},
		features = "./CucumberFeatures", // features equal to location of the
		                                 // feature folder
		glue = "com.usa.stepdef", //glue equal to step definition class
// how to run the specific scenario?  
		tags = "@Regression",
		dryRun = false, 
		monochrome = true, 
		strict = false
 
//@before for cucumber as a cucumber hook but in testNG is annotation
// before all the scenario run first it will first goes to the before hook 		
		
//@after for cucumber as a cucumber hook but in testNG is annotation
		
		                    
		)

                                                  //abstract class
 //class extends from the testNG by extending  AbstractTestNGCucumberTests
public class MyRunner extends AbstractTestNGCucumberTests{
   
	
}
