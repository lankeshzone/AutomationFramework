package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DressesObjectF 			//Class for Dresses Module
{
	public WebElement Dresses_EveningDressesLink (WebDriver driver)			//To Identify the Evening Dresses Link
	{
		return(driver.findElement(By.xpath("//img[@alt='Printed Dress']")));
	}
}
