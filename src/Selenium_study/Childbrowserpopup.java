package Selenium_study;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowserpopup {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium java drivers\\chromedriver_win32\\chromedriver.exe");
	      WebDriver driver= new ChromeDriver();
			
			
			driver.get("https://skpatro.github.io/demo/links/");
			driver.manage().window().maximize();
			Thread.sleep(3000);
//			String mainpagewindowid = driver.getWindowHandle();//will give window id in string form
//	System.out.println("Window id is "+mainpagewindowid);
	
			driver.findElement(By.name("NewWindow")).click();//opening child browser popup
			//we get multiple windows
			
			Set<String> allwindowsid = driver.getWindowHandles();
			System.out.println("All ids are "+allwindowsid);
	}

}
