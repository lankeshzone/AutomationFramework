package Utilities;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility 
{
	public void sleepWait(int time)
 	{
 		try
		{
			Thread.sleep(time);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	
 	}
 
 
 	public void impWait(WebDriver driver, int time)
	{
		//Implicit wait code 
 		driver.manage().timeouts().implicitlyWait(time, TimeUnit.MILLISECONDS);
	}
 	
 	
	
	public void expWait(WebDriver driver, String xPathStr)
	{
		//Explicit wait code, here once the element is found we are sending text...
		WebDriverWait wait=new WebDriverWait(driver,30);	
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xPathStr)));
	
		
		
	}
	

	public void flwait(WebDriver driver)
	{
	//Fluent Wait,
	@SuppressWarnings("deprecation")
	Wait<WebDriver> wait2 = new FluentWait<WebDriver>(driver)
			.withTimeout(20, TimeUnit.MILLISECONDS)
			.pollingEvery(5, TimeUnit.MILLISECONDS)
			.ignoring(NoSuchElementException.class);
	}
}
