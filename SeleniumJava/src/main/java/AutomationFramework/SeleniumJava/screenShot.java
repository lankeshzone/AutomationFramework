package AutomationFramework.SeleniumJava;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Augmenter;

public class screenShot
{

	public static void main(String[] args) throws IOException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in");
		
		screenShot(driver, "D:\\Test\\sample1.png");
		
		
	}
	
	public void rwdScreenshot(WebDriver driver, String path) throws IOException
	{
		WebDriver augmentedDriver = new Augmenter().augment(driver); 
	
		File capture = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
	
		FileUtils.copyFile(capture,new File(path));
		
	}
	
	public static void screenShot(WebDriver driver, String path) throws IOException
	{
		
		File capture = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(capture,new File(path));
		
	}
}
