package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountMyAddressesObjectF {
	
	WebElement MyAddresses(WebDriver driver)
	{
		WebElement MyAddressesButton = driver.findElement(By.linkText("http://automationpractice.com/index.php?controller=addresses"));
		return MyAddressesButton;
	}

	WebElement Update(WebDriver driver)
	{
		WebElement UpdateButton = driver.findElement(By.linkText("http://automationpractice.com/index.php?controller=address&id_address=124594"));
		return UpdateButton;
	}

	WebElement UpdateDetails(WebDriver driver)
	{
		WebElement UpdateDetailsText = driver.findElement(By.id("company"));
		return UpdateDetailsText;
	}

	WebElement UpdateSave(WebDriver driver)
	{
		WebElement UpdateSaveButton = driver.findElement(By.id("submitAddress"));
		return UpdateSaveButton;
	}


}
