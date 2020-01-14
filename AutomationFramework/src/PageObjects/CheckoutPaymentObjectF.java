package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPaymentObjectF 
{
	public WebElement CheckOutPage_PayByBankWire_Link(WebDriver driver) //To Identify the PayByBanWire Link in Checkout Payment Page 
	{
		return(driver.findElement(By.className("bankwire")));
	}
	public WebElement CheckOut_IConfirmMyOrder_Btn(WebDriver driver) //To Identify the "I confirm" button in Checkout Payment Page 
	{
		return(driver.findElement(By.className("button btn btn-default button-medium")));
	}
	public WebElement CheckOut_OrderCompletion_Para(WebDriver driver)  //To Identify the Oder completion Paragraph in Checkout Payment Page 
	{
		return(driver.findElement(By.className("cheque-indent")));
	}
}
