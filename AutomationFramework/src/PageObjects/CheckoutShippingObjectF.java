package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutShippingObjectF 
{
	public WebElement CheckOutPage_Conditions_ChkBox(WebDriver driver)  //To Identify the Conditions check box in Check Out Shipping Page
	{
		return(driver.findElement(By.id("cgv")));
	}
	public WebElement CheckOutPage_ProceedToCheckOut_Btn (WebDriver driver) //To Identify the Proceed to Check Out button in Check Out Shipping Page
	{
		return(driver.findElement(By.name("processCarrier")));
	}
}
