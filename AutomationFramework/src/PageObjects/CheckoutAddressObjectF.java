package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutAddressObjectF 
{
	public WebElement CheckOutPage_ProceedToCheckOut_Btn(WebDriver driver) //To Identify Proceed to checkout button in checkout address page
	{
		return(driver.findElement(By.name("processAddress")));
	}
}
