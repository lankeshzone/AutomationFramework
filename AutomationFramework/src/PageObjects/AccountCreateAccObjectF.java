package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountCreateAccObjectF {
	
	WebElement Title(WebDriver driver)
	{
		WebElement TitleRadioButton = driver.findElement(By.id("id_gender1"));
		return TitleRadioButton;
	}

	//Without using Selenium PageFactory
	public WebElement CustomerFirstName(WebDriver driver)
	{
		WebElement CustFirstNameText = driver.findElement(By.id("customer_firstname"));
		return CustFirstNameText;
	}
	
	WebElement CustomerLastName(WebDriver driver)
	{
		WebElement CustLastNameText = driver.findElement(By.id("customer_lastname"));
		return CustLastNameText;
	}
	
	WebElement Password(WebDriver driver)
	{
		WebElement PasswordText = driver.findElement(By.id("passwd"));
		return PasswordText;
	}
	
	WebElement Address(WebDriver driver)
	{
		WebElement AddressText = driver.findElement(By.id("address1"));
		return AddressText;
	}
	
	WebElement City(WebDriver driver)
	{
		WebElement CityText = driver.findElement(By.id("city"));
		return CityText;
	}
	
	WebElement State(WebDriver driver)
	{
		WebElement StateText = driver.findElement(By.id("id_state"));
		return StateText;
	}
	
	WebElement PostalCode(WebDriver driver)
	{
		WebElement PostalCodeText = driver.findElement(By.id("postcode"));
		return PostalCodeText;
	}
	
	WebElement Country(WebDriver driver)
	{
		WebElement CountryText = driver.findElement(By.id("id_country"));
		return CountryText;
	}
	
	WebElement MobilePhone(WebDriver driver)
	{
		WebElement MobilePhoneText = driver.findElement(By.id("phone_mobile"));
		return MobilePhoneText;
	}
	
	WebElement Register(WebDriver driver)
	{
		WebElement RegisterButton = driver.findElement(By.id("submitAccount"));
		return RegisterButton;
	}
	
	
	
}
