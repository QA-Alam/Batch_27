package com.myrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "./CucumberFeatures", // features equal to location of the
		                         // feature folder
		glue = "com.usa.stepdef", //glue equal to step definition class 
		tags = "@smoke"
		                    
		)

 //class extends from the testNG by extending  AbstractTestNGCucumberTests
public class MyRunner extends AbstractTestNGCucumberTests {

	
	
	
}
