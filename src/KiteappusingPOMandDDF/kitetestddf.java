package KiteappusingPOMandDDF;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class kitetestddf {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		FileInputStream MyFile= new FileInputStream("D:\\selenium java drivers\\\\test2.xlsx");
		 org.apache.poi.ss.usermodel.Sheet Mysheet = WorkbookFactory.create(MyFile).getSheet("Sheet2");
	 		
		  	String myUserID = Mysheet.getRow(0).getCell(0).getStringCellValue();
			String myPassword = Mysheet.getRow(0).getCell(1).getStringCellValue();
			String myPin = Mysheet.getRow(0).getCell(2).getStringCellValue();
			
		 System.setProperty("webdriver.chrome.driver", "D:\\selenium java drivers\\chromedriver_win32\\chromedriver.exe");
		   
		 ChromeOptions opt =new ChromeOptions();
		 opt.addArguments("incognito");
	     WebDriver driver= new ChromeDriver(opt);
	     
			driver.get("https://kite.zerodha.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			KIteloginpage login =new KIteloginpage(driver);
			login.Enteruserid(Mysheet.getRow(0).getCell(0).getStringCellValue());
			login.eneterpassword(myPassword);
			login.clickonloginButton();
			Thread.sleep(2000);
			
			
			Pinpagekite2 piin = new Pinpagekite2(driver);
			piin.enterpin(Mysheet.getRow(0).getCell(2).getStringCellValue());
			piin.enterpin(myPin);
            piin.clickoncontinuebutton();
            Thread.sleep(2000);
            
            HomePageKitepage home = new HomePageKitepage(driver);
            home.validateUserid(myUserID);
            home.logout();
            
            driver.close();
	}


}
