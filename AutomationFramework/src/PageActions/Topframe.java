package PageActions;


import org.openqa.selenium.WebElement;

public class Topframe {

//This will click on contact us link in top frame
public void clickContactUs(WebElement contactusLinkTopFrame)
	
	{
	contactusLinkTopFrame.click();
		return;

    }

//This will click on user name link in topframe
public void accountLinkVerification(WebElement userNameLinkTopframe)

{
	if (userNameLinkTopframe.isEnabled())
		userNameLinkTopframe.click();
	
	return;

}

//This will click on sign in link in topframe
public void signin(WebElement signInLinkTopframe)

{
	signInLinkTopframe.click();
	return;

}


}
