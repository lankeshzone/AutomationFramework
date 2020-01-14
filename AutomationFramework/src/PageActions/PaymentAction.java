package PageActions;

import org.openqa.selenium.WebElement;

public class PaymentAction 
{
	public void ClickOnPayByWireLink(WebElement ele)
	{
		ele.click();
	}
	public void ClickOnConfirmMyOrder(WebElement ele)
	{
		ele.click();
	}
	public String VerifyIfOrderCompletionPara(WebElement ele)
	{
		return(ele.getText());
	}

}
