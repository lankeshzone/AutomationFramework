package Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class headlessScript 
{
    public static void main(String[] args) throws IOException
    {
        System.setProperty("webdriver.chrome.driver","ChromeDriverPath");
        
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("window-size=1200x600");
        
      //  FirefoxOptions ffopt = new FirefoxOptions();
    //    ffopt.addArguments("headless")
        
        WebDriver driver = new ChromeDriver(options);
  
        driver.get("https://www.google.co.in/");
        System.out.println("title is: " + driver.getTitle());
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("C:\\Selenium"));
        driver.quit();
    }
}