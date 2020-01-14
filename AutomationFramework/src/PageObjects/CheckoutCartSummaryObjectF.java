package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutCartSummaryObjectF 
{
	public WebElement CheckOutPage_ProceedToCheckOut_link(WebDriver driver)  //To Identify the Proceed to checkout link in Check Out Summary Page 
	{
		return(driver.findElement(By.className("button btn btn-default standard-checkout button-medium")));
	}
}
