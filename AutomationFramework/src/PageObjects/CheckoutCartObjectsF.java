package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CheckoutCartObjectsF {

	public WebElement ProcdToChkOut_button_CartSummaryPg(WebDriver driver)
	{
        WebElement ProcdToChkOut_button_CartSummaryPg=driver.findElement(By.xpath("//table/following::a[1]"));
		return ProcdToChkOut_button_CartSummaryPg;
	}

	public WebElement ContinueShopping_CartSummaryPage(WebDriver driver)
	{
        WebElement ContinueShopping_CartSummaryPage=driver.findElement(By.xpath("//table/following::a[2]"));
		return ContinueShopping_CartSummaryPage;
	}
	public WebElement Quantity_minus(WebDriver driver)
	{
        WebElement Quantity_minus=driver.findElement(By.xpath("//div/a[@title='Subtract']"));
		return Quantity_minus;
	}
	public WebElement DeleteProduct(WebDriver driver)
	{
        WebElement DeleteProduct=driver.findElement(By.xpath("(//a[contains(@title,'Delete')])[1]"));
		return DeleteProduct;
	}
}
