package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EveningDressesObjectF 
{
	public WebElement IdentifyPrintedDressImage (WebDriver driver)
	{
		return(driver.findElement(By.xpath("//img[@alt='Printed Dress']")));
	}
}
