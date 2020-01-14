package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeObjectF 
{
	

	public WebElement WomenTabId(WebDriver driver) 
	{
		WebElement womenTabId=driver.findElement(By.linkText("http://automationpractice.com/index.php?id_category=3&controller=category"));
		return womenTabId;
	}
	public WebElement HomePage_DressesMenuDropDown (WebDriver driver)  //To Identify Dresses Menu Drop down
	{
		return(driver.findElement(By.xpath("(//a[@title='Dresses'])[2]")));
	}
	public WebElement DressesId(WebDriver driver)
	{
		WebElement DressesId=driver.findElement(By.linkText("http://automationpractice.com/index.php?id_category=8&controller=category"));
		return DressesId;
	}
	public WebElement TShirts(WebDriver driver)
	{
		WebElement TShirtsId=driver.findElement(By.linkText("http://automationpractice.com/index.php?id_category=5&controller=category"));
		return TShirtsId;
	}
	public WebElement CartInHomePage(WebDriver driver)
	{
		WebElement CartInHomePage=driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/a"));
		return CartInHomePage;
	}
	public WebElement HomeSearchTextBox (WebDriver driver)  //To Identify the Search text box in Home Page
	{
		return(driver.findElement(By.id("search_query_top")));
	}
	public WebElement SearchButtonInHome(WebDriver driver)
	{
        WebElement SearchButtonInHome=driver.findElement(By.name("submit_search"));
		return SearchButtonInHome;
	}
	public WebElement SignIn(WebDriver driver)
	{
        WebElement SignIn=driver.findElement(By.className("login"));
		return SignIn;
	}
	public WebElement ContactUs(WebDriver driver)
	{
        WebElement ContactUs=driver.findElement(By.linkText("http://automationpractice.com/index.php?controller=contact"));
		return ContactUs;
	}
	public WebElement AddToCartButtonOn_Product(WebDriver driver)
	{
        WebElement AddToCartOnProduct=driver.findElement(By.xpath("(//div/following::a[@title='Add to cart'])[1]"));
		return AddToCartOnProduct;
	}
	public WebElement ChekoutButton_In_CartDropdown(WebDriver driver)
	{
        WebElement ChekoutButton_CartDropdown=driver.findElement(By.id("button_order_cart"));
		return ChekoutButton_CartDropdown;
	}
	public WebElement Remove_ProductFromCart(WebDriver driver)
	{
        WebElement Remove_ProductFromCart=driver.findElement(By.className("ajax_cart_block_remove_link"));
		return Remove_ProductFromCart;
	}
	
	

}
