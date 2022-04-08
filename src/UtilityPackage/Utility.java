package UtilityPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;


public class Utility
{
	static Sheet Mysheet;
	public static String readDataFromExcel(int rowIndex, int columnIndex ) throws
	EncryptedDocumentException, IOException
	{
	FileInputStream MyFile= new FileInputStream("D:\\selenium java drivers\\test2.xlsx");
	 org.apache.poi.ss.usermodel.Sheet Mysheet = WorkbookFactory.create(MyFile).getSheet("Sheet2");
	String value =Mysheet.getRow(rowIndex).getCell(columnIndex).getStringCellValue();
	return value;
	}
	public static void takeScreenshot(WebDriver driver,int TCID) throws IOException  
	{
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	File destination =new File("D:\\selenium java drivers\\Screenshot\\myscreenshot"+TCID+"Screenshot.png");
	FileHandler.copy(source, destination);
    Reporter.log("screenshot taken for TC" +TCID,true);
}
}
