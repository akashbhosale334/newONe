package Suggestionbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handelling_ofmultipleelements {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium java drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
	java.util.List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		
		System.out.println("Total links in page are "+totalLinks.size());
		
		
	for(WebElement w:totalLinks)
	{
		System.out.println(w.getText());
		}
	}
	
	}


