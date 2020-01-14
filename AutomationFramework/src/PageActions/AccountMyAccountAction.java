package PageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//This class is for actions which will be performed to get the order details.
public class AccountMyAccountAction {
	
	//This will navigate to the order history page.
	public void OrderHistoryClick(WebDriver driver, WebElement OrderHistoryButton)
	{
		OrderHistoryButton.click();
		return;
	}
	
	//This will fetch the particular order information made by the user.
	public void OrderRefClick(WebDriver driver, WebElement OrderRefNumber)
	{
		OrderRefNumber.click();
		return;
	}
	
	//To download the order information to the local driver.
	public void DownloadPDFLink(WebDriver driver, WebElement DownloadPDFClick)
	{
		DownloadPDFClick.click();
		return;
	}
	
	//This action will navigate back the user to the My Account page.
	public void MyAccountClick(WebDriver driver, WebElement MyAccountButton)
	{
		MyAccountButton.click();
		return;
	}
	
}
