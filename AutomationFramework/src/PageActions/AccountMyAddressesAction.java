package PageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//This class is for actions which will be performed to update the user address.
public class AccountMyAddressesAction {
	
	//Registered user's addresses.
	public void MyAddressesClick(WebDriver driver, WebElement MyAddressesButton)
	{
		MyAddressesButton.click();
		return;
	}
	
	//To update the address of the user. 
	public void UpdateClick(WebDriver driver, WebElement UpdateButton)
	{
		UpdateButton.click();
		return;
	}
	
	//Editing user information. This action will change according to the user input in updating the user details. 
	public void UpdateDetailsEnter(WebDriver driver,String UpdateInfo, WebElement UpdateDetailsText)
	{
		UpdateDetailsText.sendKeys(UpdateInfo);
		return;
	}
	
	//This will save the new user information.
	public void UpdateSaveClick(WebDriver driver, WebElement UpdateSaveButton)
	{
		UpdateSaveButton.click();
		return;
	}
}
