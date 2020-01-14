package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ProductDescriptionObjects {
	public WebElement QuickView(WebDriver driver)
	{
		WebElement QuickView=driver.findElement(By.linkText("http://automationpractice.com/index.php?id_product=1&controller=product"));
		return QuickView;
	}
	
	public WebElement AddToCart_Product(WebDriver driver)
	{
		WebElement AddToCart_Product=driver.findElement(By.xpath("//div/following::a[@title='Add to cart'])[1]"));
		return AddToCart_Product;
	}
	public WebElement Quantity(WebDriver driver)
	{
		WebElement Quantity=driver.findElement(By.id("quantity_wanted"));
		return Quantity;
	}		
	public WebElement PlusQuantity(WebDriver driver)
	{
		WebElement PlusQuantity=driver.findElement(By.className("btn btn-default button-plus product_quantity_up"));
		return PlusQuantity;
	}
	public WebElement MinusQuantity(WebDriver driver)
	{
		WebElement MinusQuantity=driver.findElement(By.className("btn btn-default button-minus product_quantity_down"));
		return MinusQuantity;
	}
	public WebElement Product_Size(WebDriver driver)
	{
		WebElement Product_Size=driver.findElement(By.className("form-control attribute_select no-print"));
		return Product_Size;
	}
	public WebElement WishListButton(WebDriver driver)
	{
		WebElement WishListButton=driver.findElement(By.id("wishlist_button"));
		return WishListButton;
	}
	public WebElement ViewLargerImg(WebDriver driver)
	{
		WebElement ViewLargerImg=driver.findElement(By.className("span_link no-print"));
		return ViewLargerImg;
	}
	public WebElement More(WebDriver driver)
	{
		WebElement More=driver.findElement(By.xpath("(//a[@class='button lnk_view btn btn-default'])[1]"));
		return More;
	}
	
}
