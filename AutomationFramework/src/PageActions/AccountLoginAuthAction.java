package PageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//This class is to perform actions to authorize the user login.
public class AccountLoginAuthAction {
	
	//To validate the new email ID for user registration.
	public void EmailIDEnter(WebDriver driver,String str1, WebElement EmailIDText)
	{
		EmailIDText.sendKeys(str1);
		return;
	}
	
	//On submitting, the email ID entered by the user will be verified if the email ID is already registered or not.
	public void SubmitClick(WebDriver driver, WebElement SubmitButton)
	{
		SubmitButton.click();
		return;
	}
	
	//Already registered email ID of the user.
	public void RegEmailIDEnter(WebDriver driver,String RegEmail, WebElement RegEmailIDText)
	{
		RegEmailIDText.sendKeys(RegEmail);
		return;
	}
	
	//Password of the registered email ID of the user.
	public void RegPasswordEnter(WebDriver driver,String RegPassword, WebElement RegPasswordText)
	{
		RegPasswordText.sendKeys(RegPassword);
		return;
	}
		
	//This action will verify the user credentials after entering Email ID and Password.
	public void SignInClick(WebDriver driver, WebElement SignInButton)
	{
		if (SignInButton.isEnabled())
		{
			SignInButton.click();
		}
		else
			{
			/// Log for element not enabled
			}
		return;
	}
	
	// Top frame SignIn link
	public void ClickOnSignInLink (WebElement ele)
	{
		ele.click();
	}
	
}
