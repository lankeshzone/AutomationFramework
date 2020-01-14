package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountLoginObjectF {
	
	public WebElement RegEmailID(WebDriver driver)
	{
		WebElement RegEmailIDText = driver.findElement(By.id("email"));
		return RegEmailIDText;
	}

	public WebElement RegPassword(WebDriver driver)
	{
		WebElement RegPasswordText = driver.findElement(By.id("passwd"));
		return RegPasswordText;
	}

	public WebElement SignIn(WebDriver driver)
	{
		WebElement SignInButton = driver.findElement(By.id("SubmitLogin"));
		return SignInButton;
	}
	
	public WebElement EmailID(WebDriver driver)
	{
		WebElement EmailIDText = driver.findElement(By.id("email_create"));
		return EmailIDText;
	}

	public WebElement Submit(WebDriver driver)
	{
		WebElement SubmitButton = driver.findElement(By.name("SubmitCreate"));
		return SubmitButton;
	}

}
