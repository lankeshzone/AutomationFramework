package Utilities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridConfig  
{
	public WebDriver gridConfig() throws MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");  //Browser to be used on node
		cap.setPlatform(Platform.WINDOWS);  //OS used in node
	
		//Host URL to be picked after running the server  
	
		URL url;
		
		url = new URL("http://192.168.0.106:4444/wd/hub");
		 //Provide host URL as parameter
	
	
		//Use Remote WebDriver for working with remote machines
		WebDriver driver=new RemoteWebDriver(url,cap); //Set the driver instance for the node
		return driver;
	}
	
}
