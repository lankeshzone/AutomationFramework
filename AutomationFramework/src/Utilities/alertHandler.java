package Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class alertHandler 
{
	
	
	public void getalertText(WebDriver driver)
	{
		
		//initializing alert to an object
		Alert alert=driver.switchTo().alert();
		
		//title of the alert message equal to driver.switchto().alert().gettext();
		alert.getText();
	}
	
	public void acceptPopUp(WebDriver driver)
	{
			
		//initializing alert to an object
		Alert alert=driver.switchTo().alert();
			
		//accept the alert
		alert.accept();
	}
		
	public void dismissPopUp(WebDriver driver)
	{
		
		//initializing alert to an object
		Alert alert=driver.switchTo().alert();
		
		//declining or cancel for alert.
		alert.dismiss();
	}
				
	public void sendTextpopUp(WebDriver driver)
	{
			//initializing alert to an object
			Alert alert=driver.switchTo().alert();
			
			//to send any Text input to alert message
			String Str="Lankesh";
			alert.sendKeys(Str);
	}

	
}
	

