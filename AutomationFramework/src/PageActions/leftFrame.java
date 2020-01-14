package PageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class leftFrame {

	
//This will select the small size check box in the  left frame
public void selectsizeS(WebElement sizeSButton)
	
	{
		sizeSButton.click();
		return;

    }

//This will select the medium size check box in the  left frame
public void selectsizeM(WebElement sizeMButton)

{
	sizeMButton.click();
	return;

}

//This will select the large size check box in the  left frame
public void selectsizeL(WebElement sizeLButton)

{
	sizeLButton.click();
	return;

}

//This will select the beige color check box in the  left frame
public void selectColorBeige(WebElement colorBeigeButton)

{
	colorBeigeButton.click();
	return;

}

//This will select the white color check box in the  left frame
public void selectColorWhite(WebElement colorWhiteButton)

{
	colorWhiteButton.click();
	return;

}

//This will select the black color check box in the  left frame
public void selectColorBlack(WebElement colorBlackButton)

{
	colorBlackButton.click();
	return;

}

//This will select the blue color check box in the  left frame
public void selectColorBlue(WebElement colorBlueButton)

{
	colorBlueButton.click();
	return;

}

//This will select the green color check box in the  left frame
public void selectColorGreen(WebElement colorGreenButton)

{
	colorGreenButton.click();
	return;

}

//This will select the yellow color check box in the  left frame
public void selectColorYellow(WebElement colorYellowButton)

{
	colorYellowButton.click();
	return;

}

//This will select the pink color check box in the  left frame
public void selectColorPink(WebElement colorPinkButton)

{
	colorPinkButton.click();
	return;

}

//This will set the lower prize range for the items
public void setLowerRange(WebElement lowerRangeSelect, WebDriver driver, int range)

{
	Actions move = new Actions(driver);
	Action action = (Action)move.dragAndDropBy(lowerRangeSelect, range, 0).build();
	action.perform();
	return;

}

//This will set the higher prize range for the items
public void setUpperRange(WebElement upperRangeSelect,WebDriver driver, int range)

{
	Actions move = new Actions(driver);
	Action action = (Action)move.dragAndDropBy(upperRangeSelect, range, 0).build();
	action.perform();
	return;
}

//This will click on all specials  link in the left frame
public void clickAllSpecials(WebElement allSpecialsLink)

{
	allSpecialsLink.click();
	return;

}

//This will click on our stores  link in the left frame
public void clickOurStores(WebElement OurStoresLink)

{
	OurStoresLink.click();
	return;

}

}
