package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BottomFrameObjectF

{
	public WebElement facebookLink(WebDriver driver)
	{
		WebElement d = driver.findElement(By.className("Facebook"));
		return d;
	}
	
	
	public WebElement twitterLink(WebDriver driver)
	{
		WebElement d = driver.findElement(By.className("twitter"));
		return d;
	}
	
	
	public WebElement youtubelink(WebDriver driver)
	{
		WebElement d = driver.findElement(By.className("twitter"));
		return d;
	}
	public WebElement googlepluslink(WebDriver driver)
	{
		WebElement d = driver.findElement(By.className("google-plus"));
		return d;
	}
	public WebElement specials(WebDriver driver)
	{
		WebElement d = driver.findElement(By.xpath("(//a[@title = \"Specials\"])[2]"));
		return d;
	}
	
	public WebElement myOrders(WebDriver driver)
	{
		WebElement d = driver.findElement(By.xpath("//a[@title = \"My orders\"]"));
		return d;
	}
	public WebElement newProducts(WebDriver driver)
	{
		WebElement d = driver.findElement(By.xpath("//a[@title = \"New products\"]"));
		return d;
	}
	//a[@class= "_blank"]
	public WebElement eCommmerceSoftwarelink(WebDriver driver)
	{
		WebElement d = driver.findElement(By.xpath("//a[@class= \"_blank\"]"));
		return d;
	}
	}
