package PageActions;

import org.openqa.selenium.WebElement;

public class HomePageActions {

	public void HomePg_ClickWomenTab(WebElement WomenTabId)
	{
		WomenTabId.click();
		return;
	}
	public void HomePg_ClickDresses(WebElement WomenTab)
	{
		WomenTab.click();
		return;
	}
	public void HomePg_ClickTShirts(WebElement TShirtsId)
	{
		TShirtsId.click();
		return;
	}
	public void HomePg_ClickCart_Tab(WebElement CartInHomePage)
	{
		CartInHomePage.click();
		return;
	}
	public void HomePg_Search_Product(WebElement SearchButtonInHome,String str)
	{
		SearchButtonInHome.sendKeys(str);
		return;
	}
	public void HomePg_ClickOnSigninBtn(WebElement SignIn)
	{
		SignIn.click();
		return;
	}
	public void HomePg_ClickOnContactUs(WebElement ContactUs)
	{
		ContactUs.click();
		return;
	}
	public void Home_ClickAddToCartButton_OnProduct(WebElement AddToCartOnProduct)
	{
		AddToCartOnProduct.click();
		return;
	}
	public void Home_ClickOnCheckoutButton(WebElement ChekoutButton_CartDropdown)
	{
		ChekoutButton_CartDropdown.click();
		return;
	}
	public void Home_Delete_ProductFromCart(WebElement Remove_ProductFromCart)
	{
		Remove_ProductFromCart.click();
		return;
	}
	
	public String VerifyIfHomePageIsDisplayed(WebElement ele)
	{
		return(ele.getText());
	}

	
	
}
