package PageActions;

import org.openqa.selenium.WebElement;

public class ProductActions {
	
	public void Product_ClickQuickView(WebElement QuickView)
	{
		QuickView.click();
		return;
	}
	public void Product_AddToCart(WebElement AddToCart_Product)
	{
		AddToCart_Product.click();
		return;
	}
	public void Product_Enter_Quantity(WebElement Quantity,String It)
	{
		Quantity.click();
		Quantity.sendKeys(It);
		return;
	}
	public void Product_Add_Quantity(WebElement PlusQuantity)
	{
		PlusQuantity.click();
		return;
	}
	public void Product_Minus_Quantity(WebElement MinusQuantity)
	{
		MinusQuantity.click();
		return;
	}
	public void Product_AddTo_WishListButton(WebElement WishListButton)
	{
		WishListButton.click();
		return;
	}
	public void Product_Click_ViewLargerImg(WebElement ViewLargerImg)
	{
		ViewLargerImg.click();
		return;
	}
	public void Product_ClickOnMore(WebElement More)
	{
		More.click();
		return;
	}
	
	
}
