package Utilities;

public class Constant 
{
	    // URL of the application
		public static final String URL = "http://automationpractice.com/index.php";
		
		// Browser of the application
		public static final String Browser = "firefox";
		 
		//UserID and Password of the application
		public static final String Username = "test123";
	    public static final String Password ="test@123";
	    
	    //Path of the Test Data File
		public static final String Path_TestData = "D:/Test/Automation_TestData.xlsx";
		
	    //MyAccount worksheet
	    public static final String Sheet_TestData = "Sheet1";
		
		//Test Data Sheet Columns
		public static final int Col_TestCaseName = 0;	
		public static final int Col_UserName =1 ;
		public static final int Col_Password = 2;
		public static final int Col_Browser = 3;
		public static final int Col_ProductType = 4;
		public static final int Col_ProductNumber = 5;
		public static final int Col_FirstName = 6;
		public static final int Col_LastName = 7;
		public static final int Col_Address = 8;
		public static final int Col_City = 9;
		public static final int Col_Country = 10;
		public static final int Col_Phone = 11;
		public static final int Col_Email = 12;
		public static final int Col_Result = 13;
		public static final String Path_ScreenShot = "C:/Selenium/Screenshots/";

		public static String getTestCaseName(String sTestCase)throws Exception
		{
			String value = sTestCase;
			try
			{
				int posi = value.indexOf("@");
				value = value.substring(0, posi);
				posi = value.lastIndexOf(".");	
				value = value.substring(posi + 1);
				return value;
			}
			catch (Exception e)
			{
				Log.error("Class Utils | Method getTestCaseName | Exception desc : "+e.getMessage());
				throw (e);
			}
		}



}
