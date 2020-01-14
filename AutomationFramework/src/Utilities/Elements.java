package Utilities;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Elements 
{

	 public static void waitForElement(WebElement element, WebDriver driver)
	 {
	
		 WebDriverWait wait = new WebDriverWait(driver, 10);
	//     wait.until(ExpectedConditions.elementToBeClickable(element));
	 }
	 
	 	
}