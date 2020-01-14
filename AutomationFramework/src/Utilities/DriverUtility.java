package Utilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverUtility 
{
		public static WebDriver localdriver = null;
		
		
		
		
		public WebDriver setBrowser(String browser, String url) throws MalformedURLException
		{
			switch (browser) 
			{
				case "chrome":
					localdriver=new ChromeDriver();
				break;
				
				case "firefox":
					localdriver=new FirefoxDriver();
				break;
				
				case "IE":
					localdriver=new InternetExplorerDriver();
				break;
				
				
				default:
					DesiredCapabilities Cap = new DesiredCapabilities();
					Cap.setPlatform(Platform.WINDOWS);
					Cap.setBrowserName(browser);
					String gridURL="https://localhost:4040";
					URL url2=new URL(gridURL);
					localdriver=new RemoteWebDriver(url2,Cap);
				break;
			}
			
			localdriver.get(url);
			localdriver.manage().window().maximize();
			return localdriver;
		}
		
		public void shutBrowser(WebDriver driver)
		{
			driver.quit();
		}
		
		
}
