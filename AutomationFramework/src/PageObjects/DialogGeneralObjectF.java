package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DialogGeneralObjectF 			//Class used for storing objects in general Dialogs
{
	public WebElement Modal_ProceedToCheckOutLink (WebDriver driver)		//Identify Proceed to checkout link
	{
		return(driver.findElement(By.className("btn btn-default button button-medium")));
	}
}
