package login.functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		//WebDriver is an interface
		//driver is the instance of the WebDriver
		//new is a keyword from the java
		//ChromeDriver is a class 
	System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
		
		WebDriver driver = new ChromeDriver(); //Up Casting
		//how you resize the browser in selenium?
		//driver.manage().window().maximize();// For the maximize the window.
		
		
		driver.get("https://www.zoopla.co.uk");//For get into the URL.
		driver.manage().window().fullscreen();
		//driver.quit();// For closing the browser.
		
	}
	
	
	
	
}
