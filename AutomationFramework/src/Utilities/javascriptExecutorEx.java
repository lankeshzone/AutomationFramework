package Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class javascriptExecutorEx {

	public static void main(String[] args) 
	{
	
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.linkedin.com/login?trk=guest_homepage-basic_nav-header-signin");
		
		JavascriptExecutor js = (FirefoxDriver)driver;
		
		js.executeScript("document.getElementById('username').text()='lankesh';");
		
		
	}

}
