package PageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Cart related actions
public class CartActions {
	public void CartSummaryPg_ProcdToChkOut_button(WebDriver driver,WebElement ProcdToChkOut_button_CartSummaryPg)
	{
	ProcdToChkOut_button_CartSummaryPg.click();
	return;
	}
	public void CartSummaryPage_ContinueShopping(WebDriver driver,WebElement ContinueShopping_CartSummaryPage)
	{
	ContinueShopping_CartSummaryPage.click();
	return;
	}
	public void CartSummaryPage_Subtract_QtyOf_Product(WebDriver driver,WebElement Quantity_minus)
	{
	Quantity_minus.click();
	return;
	}
	public void CartSummaryPage_Delete_Product(WebDriver driver,WebElement Delete_product)
	{
	Delete_product.click();
	return;
	}
	
}
