package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LeftFrameObjectF {
	public WebElement contactUs(WebDriver driver)
	{
		WebElement d = driver.findElement(By.className("icon-home"));
		return d;
	}
	public WebElement Women(WebDriver driver)
	{
		WebElement d = driver.findElement(By.className("sf-with-ul"));
		return d;
	}

	public WebElement sizeS(WebDriver driver)
	{
		WebElement d = driver.findElement(By.id("layered_id_attribute_group_1"));
		return d;
	}
	public WebElement sizeM(WebDriver driver)
	{
		WebElement d = driver.findElement(By.id("layered_id_attribute_group_2"));
		return d;
	}
	public WebElement sizeL(WebDriver driver)
	{
		WebElement d = driver.findElement(By.id("layered_id_attribute_group_3"));
		return d;
	}
	public WebElement coolorBeige(WebDriver driver)
	{
		WebElement d = driver.findElement(By.id("layered_id_attribute_group_7"));
		return d;
	}
	public WebElement colorWhite(WebDriver driver)
	{
		WebElement d = driver.findElement(By.xpath("layered_id_attribute_group_7" ));
		return d;
	}
	public WebElement coolorBlack(WebDriver driver)
	{
		WebElement d = driver.findElement(By.id("layered_id_attribute_group_11"));
		return d;
	}
	public WebElement coolorOrange(WebDriver driver)
	{
		WebElement d = driver.findElement(By.id("layered_id_attribute_group_13"));
		return d;
	}
	public WebElement coolorBlue(WebDriver driver)
	{
		WebElement d = driver.findElement(By.id("layered_id_attribute_group_14"));
		return d;
	}
	public WebElement coolorGreen(WebDriver driver)
	{
		WebElement d = driver.findElement(By.id("layered_id_attribute_group_15"));
		return d;
	}
	public WebElement coolorYellow(WebDriver driver)
	{
		WebElement d = driver.findElement(By.id("layered_id_attribute_group_16"));
		return d;
	}
	public WebElement coolorPink(WebDriver driver)
	{
		WebElement d = driver.findElement(By.id("layered_id_attribute_group_24"));
		return d;
	}
	public WebElement rangebarLowerlimit(WebDriver driver)
	{
		WebElement d = driver.findElement(By.xpath("(//a[@class = \"ui-slider-handle ui-state-default ui-corner-all\"])[1]"));
		return d;
	}
	public WebElement rangebarUpperlimit(WebDriver driver)
	{
		WebElement d = driver.findElement(By.xpath("(//a[@class = \"ui-slider-handle ui-state-default ui-corner-all\"])[2]"));
		return d;
	}
}
