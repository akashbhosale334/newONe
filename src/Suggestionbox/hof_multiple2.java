package Suggestionbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hof_multiple2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium java drivers\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("i phone 13 pro max");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		//String ratings = driver.findElement(By.xpath("(//span[contains(text(),'Ratings')])[1]")).getText();
		String ratings = driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[6]")).getText();
		System.out.println("Rating is "+ratings);
		
		
		
	}

}
