package Selenium_study;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setposition {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium java drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		//driver.manage().window().maximize();
		Thread.sleep(2000);
		//to get default position 
		System.out.println(driver.manage().window().getPosition());
		
		//1.to change position create object of point class which will accept the x @ y coordinates
	Point p= new Point(45, 85);
	//2.to use setup position which will accept object of point class
	
	driver.manage().window().setPosition(p);
	System.out.println("position is "+p);
	
	
	}
}
