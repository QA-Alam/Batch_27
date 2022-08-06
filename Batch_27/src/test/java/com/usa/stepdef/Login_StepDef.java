package com.usa.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.usa.base.SupperClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_StepDef extends SupperClass{

	
	@Given("^User able to open the any browser$")
	public void user_able_to_open_the_any_browser()  {
		
		System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
	     driver = new ChromeDriver(); 
	    
	}

	@Given("^User able to enter the https://www\\.zoopla\\.co\\.uk$")
	public void user_able_to_enter_the_https_www_zoopla_co_uk()  {
		
	    driver.get("https://www.zoopla.co.uk");
	    
	}

	@When("^User able to click on the Sign in button$")
	public void user_able_to_click_on_the_Sign_in_button()  {
	    driver.findElement(By.linkText("Sign in")).click();
	    
	}

	@When("^user able to enter the alammhommad(\\d+)@gmail\\.com$")
	public void user_able_to_enter_the_alammhommad_gmail_com(int arg1)  {
	    
	    
	}

	@When("^user able to enter the SAYEDawan(\\d+)@$")
	public void user_able_to_enter_the_SAYEDawan(int arg1)  {
	    
	    
	}

	@When("^User able to click on the login button$")
	public void user_able_to_click_on_the_login_button()  {
	    driver.findElement(By.xpath("//button[@data-testid ='signin-button']")).click();
	    
	}

	@Then("^User able to verify the user information on the screen$")
	public void user_able_to_verify_the_user_information_on_the_screen()  {
	    
	    
	}

	@When("^user able to enter the SAYEDawan@$")
	public void user_able_to_enter_the_SAYEDawan()  {
	    
	    
	}

	@When("^user able to enter the (\\d+)@$")
	public void user_able_to_enter_the(int arg1)  {
	    
	    
	}

	@Given("^User able to enter the url$")
	public void user_able_to_enter_the_url()  {
		 driver.get("https://www.zoopla.co.uk");
	    
	}

	@When("^user able to enter the user name$")
	public void user_able_to_enter_the_user_name()  {
driver.findElement(By.id("email")).sendKeys("alammhommad97@gmail.com  ");
	    
	}

	@When("^user able to enter the password$")
	public void user_able_to_enter_the_password()  {
	    driver.findElement(By.id("password")).sendKeys("SAYEDawan2008@");
	    
	}
	
	
	
	
	
	
	
	
	
}
