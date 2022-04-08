package Selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clickusin_actionclass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium java drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement checkboxopt1 = driver.findElement(By.name("checkBoxOption1"));

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",checkboxopt1);

		Thread.sleep(3000);
		//1.create object of action class which will accept driver object as an argument
		Actions act = new Actions(driver);
		//2.using action class object call the required method,then use peform method
		//1st way i.e click
		//act.click(checkboxopt1).perform();
		//2nd way
		act.moveToElement(checkboxopt1).click().build().perform();
	}

}
