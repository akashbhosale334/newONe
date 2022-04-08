package Selenium_study;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver","D:\\selenium java drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(3000);

		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println("source");
		File destination =new File("D:\\selenium java drivers\\Screenshot\\myscreenshot.png");
         org.openqa.selenium.io.FileHandler.copy(source, destination);
         
}

}
