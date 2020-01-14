package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SequenceActions
{
	public static void mouseHoverAction(WebElement mainElement, String subElement, WebDriver driver)
	 {
		Actions action = new Actions(driver);
        action.moveToElement(mainElement).perform();
        
        if(subElement.equals("Accessories"))
        {
        	action.moveToElement(driver.findElement(By.linkText("Accessories")));
       	 	Log.info("Accessories link is found under Product Category");
        }
        
        if(subElement.equals("iMacs"))
        {
       	 	action.moveToElement(driver.findElement(By.linkText("iMacs")));
       	 	Log.info("iMacs link is found under Product Category");
        }
        if(subElement.equals("iPads"))
        {
       	 	action.moveToElement(driver.findElement(By.linkText("iPads")));
       	 	Log.info("iPads link is found under Product Category");
        }
        if(subElement.equals("iPhones"))
        {
       	 	action.moveToElement(driver.findElement(By.linkText("iPhones")));
       	 	Log.info("iPhones link is found under Product Category");
        }
        action.click();
        action.perform();
        Log.info("Click action is performed on the selected Product Type");
	 }
	
	
}
