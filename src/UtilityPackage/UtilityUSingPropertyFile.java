package UtilityPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class UtilityUSingPropertyFile {

public static void takeScreenshot(WebDriver driver,int TCID) throws IOException  
{
File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

File destination =new File("D:\\selenium java drivers\\Screenshot\\myscreenshot"+TCID+"Screenshot.png");
FileHandler.copy(source, destination);
Reporter.log("screenshot taken for TC" +TCID,true);
}

public static String getDatafromPRopertyFile(String Key) throws IOException 
{
	Properties p =new Properties();
FileInputStream file = new FileInputStream("C:\\Users\\Akshay\\eclipse-workspace\\All_variables\\MYFile.Properties");
    p.load(file);
    String value = p.getProperty(Key);
    return value;
}
}