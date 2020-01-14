package TestSuite;

//Test NG class which holds all the tests..
//Regression Test
// module / tyoe of testing / no. of automated scripts

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageActions.AccountLoginAuthAction;
import PageObjects.AccountLoginObjectF;
import PageObjects.HomeObjectF;
import Utilities.Constant;
import Utilities.DriverUtility;
import Utilities.ExcelUtils;
import Utilities.Log;
import Utilities.Screenshot;

public class test 
{
	
	String browser;
	String url;
	WebDriver driver;
	
	
	// different utilities form the framework
	DriverUtility driverUtil=new DriverUtility(); // webdriver utility
	
	
	
	ExcelUtils excel=new ExcelUtils(); // External test data file which in Excel work book
	
	Screenshot screenShot = new Screenshot(); // Screenshots used for capturing test executions
	
	//Page object for identifying the webelements
	AccountLoginObjectF accountLoginObj = new AccountLoginObjectF();
	HomeObjectF homeObject = new HomeObjectF();
	
	//PageAction for performing the actions
	AccountLoginAuthAction accountLoginAction = new AccountLoginAuthAction();
	
	
	@BeforeTest
	public void beforeTest() throws Exception, IOException
	{	
		
		
		browser=Constant.Browser;
		url=Constant.URL;
		
		driver = driverUtil.setBrowser(browser,url); // allocate the browser based on the user preferenece
			
		String path=Constant.Path_TestData; // 
		
		String sheet=Constant.Sheet_TestData;
						
		excel.setExcelFile(path,sheet); // load the test data file
	}
	
	@Test// (priority=1)
	public void test_Login() throws Exception
	{
		Log.startTestCase("test_Login");  // logging mechanism is used to log the various test case infgormation
		int row=2, col=2;
		
		driver.get(excel.getCellValue(row, col));
		
		Log.info("Browser Launched");
		
		screenShot.takeScreenshot(driver, "test_Login"); // proof for successfull execution of test
		
		Log.endTestCase("Successfully passed test_Login");
		
			
	}
	
	@Test// (priority=2)
	public void automationPractice_Login() throws Exception
	{
		driver.get(Constant.URL);
		Log.startTestCase("AUtomation Practice Login Test Case");
		
		homeObject.SignIn(driver).click();
		screenShot.takeScreenshot(driver, "automationPractice_Login");
		
		
		accountLoginAction.RegEmailIDEnter(driver, excel.getCellValue(1, 1), accountLoginObj.RegEmailID(driver));
		
		accountLoginAction.RegPasswordEnter(driver, excel.getCellValue(1, 2), accountLoginObj.RegPassword(driver));
		
		accountLoginAction.SignInClick(driver, accountLoginObj.SignIn(driver));
		Log.info("Click on Sign IN");
		screenShot.takeScreenshot(driver, "automationPractice_Login_final");
		
		Log.endTestCase("Successfully Passed");
		
		
	}
	
	@AfterTest
	public void afterTest()
	{
		driverUtil.shutBrowser(driver); // driver utility to shut the browser...
	} 
}