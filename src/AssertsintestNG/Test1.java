package AssertsintestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium java drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		WebElement Userid = driver.findElement(By.id("userid"));
		if (Userid.isDisplayed())
		{
			Userid.sendKeys("DAA677");
			System.out.println("tc is passed");
		}
		else 
			{
			System.out.println("Element is not Displayed");
			System.out.println("Failed");
		}
		
		driver.close();
	}
	}


