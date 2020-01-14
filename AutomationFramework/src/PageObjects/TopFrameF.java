package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopFrameF 
{
	public WebElement contactUs(WebDriver driver)
	{
		WebElement d = driver.findElement(By.linkText("Contact us"));
		return d;
	}
	public WebElement signIn(WebDriver driver)
	{
		WebElement d = driver.findElement(By.className("login"));
		return d;
	}
	public WebElement userName(WebDriver driver)
	{
		WebElement d = driver.findElement(By.className("account"));
		return d;
}
}
