package PageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

//This class is to perform actions to enter the user information for new account creation.
public class AccountCreateAccAction {
	
	//To click the title/salutation of the user.
	public void TitleClick(WebDriver driver, WebElement TitleRadioButton)
	{
		TitleRadioButton.click();
		return;
	}
		//To enter the user first name.
	//Associated Action
	public void CustomerFNEnter(WebDriver driver,String str2, WebElement CustFirstNameText)
	{
		CustFirstNameText.sendKeys(str2);
		return;
	}
	
	//To enter the user last name.
	public void CustomerLNEnter(WebDriver driver,String str3, WebElement CustLastNameText)
	{
		CustLastNameText.sendKeys(str3);
		return;
	}
	
	//To enter the password for user authentication.
	public void PasswordEnter(WebDriver driver,String str4, WebElement PasswordText)
	{
		PasswordText.sendKeys(str4);
		return;
	}
	
	//This is to enter the user address.
	public void AddressEnter(WebDriver driver,String str5, WebElement AddressText)
	{
		AddressText.sendKeys(str5);
		return;
	}
	
	//To enter the city of the user.
	public void CityEnter(WebDriver driver,String str6, WebElement CityText)
	{
		CityText.sendKeys(str6);
		return;
	}
	
	//To select the residing state of the user.
	public void StateEnter(WebDriver driver,String str7, WebElement StateText)
	{
		Select dropdownState = new Select(StateText);
		dropdownState.selectByVisibleText(str7);
		//dropdownState.selectByIndex();
		return; 
	}
	
	//To enter the postal/zip code of the user address.
	public void PostalCodeEnter(WebDriver driver,String str8, WebElement PostalCodeText)
	{
		PostalCodeText.sendKeys(str8);
		return;
	}
	
	//To select the residing country of the user. It is by default "US".
	public void CountryEnter(WebDriver driver,String str9, WebElement CountryText)
	{
		Select dropdownCountry = new Select(CountryText);
		dropdownCountry.selectByVisibleText(str9);
		//dropdownCountry.selectByIndex();
		return;
	}
	
	//To enter the contact number of the user.
	public void MobilePhoneEnter(WebDriver driver,String str10, WebElement MobilePhoneText)
	{
		MobilePhoneText.sendKeys(str10);
		return;
	}
	
	//To register the user by submitting the user information.
	public void RegisterClick(WebDriver driver, WebElement RegisterButton)
	{
		RegisterButton.click();
		return;
	}
		
}
