package Suggestionbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selectingmultiple_checkbox {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium java drivers\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		System.out.println("Total check box on page are "+checkBoxes.size());
		
		for(WebElement w:checkBoxes)
		{
		Thread.sleep(1000);
		w.click();
	}
//for unclicking		
	for(WebElement w:checkBoxes)
	{
		Thread.sleep(1000);
		w.click();
	}
	}
	//(//ul[@role='listbox'])[1]
	}


