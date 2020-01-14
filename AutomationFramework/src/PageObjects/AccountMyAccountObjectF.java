package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountMyAccountObjectF {
	
	WebElement OrderHistory(WebDriver driver)
	{
		WebElement OrderHistoryButton = driver.findElement(By.linkText("http://automationpractice.com/index.php?controller=history"));
		return OrderHistoryButton;
	}

	WebElement OrderRef(WebDriver driver)
	{
		WebElement OrderRefNumber = driver.findElement(By.linkText("http://automationpractice.com/index.php?controller=order-detail"));
		return OrderRefNumber;
	}

	WebElement DownloadPDF(WebDriver driver)
	{
		WebElement DownloadPDFClick = driver.findElement(By.linkText("http://automationpractice.com/index.php?controller=pdf-invoice?id_order=85543"));
		return DownloadPDFClick;
	}

	WebElement MyAccount(WebDriver driver)
	{
		WebElement MyAccountButton = driver.findElement(By.linkText("http://automationpractice.com/index.php?controller=my-account"));
		return MyAccountButton;
	}
	
	public WebElement HomeMyAccountBreadCrumb (WebDriver driver)   //Used to identifyBreadCrumb in Home Page
	{
		return(driver.findElement(By.xpath("//span[text()='My account']")));
	}
}
