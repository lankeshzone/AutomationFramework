package TestSuite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


@SuppressWarnings("unused")
public class excelExample {

	public static void main(String[] args) throws IOException
	{
	
		//Setup the application
		File f = new File("D:/Test/Test1.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		XSSFWorkbook WB = new XSSFWorkbook(fis);
		
		XSSFSheet ws = WB.getSheet("Dileep");
		
		String data = ws.getRow(2).getCell(2).getStringCellValue();
		System.out.print("Data from XL sheet" + data);
		
		
	}

}
