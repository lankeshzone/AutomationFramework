package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PrintedDressObject 				//Class is for Identifying the objects in Printed Dress page
{
	public WebElement PrintedDressPage_AddToCartButton (WebDriver driver)		//To Identify Add to cart button
	{
		return(driver.findElement(By.name("Submit")));
	}
}
