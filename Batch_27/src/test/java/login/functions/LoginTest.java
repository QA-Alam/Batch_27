package login.functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		/*
		
		1. WebDriver is an interface
		2. driver is the instance/reference of the WebDriver
		3. new is a keyword from the java
		4. ChromeDriver is a class 
		 
		 */
	System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
		
	//How to open the browser?
		WebDriver driver = new ChromeDriver(); //Up Casting
		
		//it is not possible interface can't create object.
		//WebDriver driver = new WebDriver(); 
		
		//how you resize the browser in selenium?
		//driver.manage().window().maximize();// For the maximize the window.
		driver.get("https://www.zoopla.co.uk");//For get into the URL.
		
		driver.manage().window().fullscreen();//For the full screen 
	/*	
  How to get the URL or what is the difference between driver.get and navigate ?
  
		driver.navigate().to(""); // hit the enter.
		driver.navigate().refresh(); // for the refresh browser
		driver.navigate().forward(); // if you want to go forward the page
		driver.navigate().back(); // to go back 
		
	*/
		
		//What is the difference between the driver.close and driver.quit
		
        driver.close();// Only the browser, not the server.(IE does support only)
        
		//driver.quit();// close the browser and the server. (IE don't support)
		
   /*What kind of challenges you face during the IE execution test cases?    
        
       1.either all of the security checked or none of them checked
       2.ZOOM should be 100 percent window size.
       3.Driver.close() need to use order to close the IE. QUIT doesn't work.
      
       */
        
	}
	
	
	
	
}
