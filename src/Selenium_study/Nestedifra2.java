package Selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nestedifra2 {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver","D:\\selenium java drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement parent=driver.findElement(By.xpath("//body [text()='Parent frame']"));

		String Actual_text=parent.getText(); 
		String Expected_text="Parent frame"; 
		
		if(Actual_text.equals(Expected_text))
		{
		System.out.println("text matching test case passed for parentframe");
		} 
	else
	{
		System.out.println("text not matching test case failed for parentframe");
	}
		Thread.sleep(1000);

		//child frame

		WebElement childframe1=driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")); 
		driver.switchTo().frame(childframe1); // to enter in path of nested frame

WebElement childframe=driver.findElement(By.xpath("//p[text()= 'Child Iframe']"));//to find the text
		String Actual_text1=childframe.getText();
		String Expected_text1= "Child Iframe";
		
		if(Actual_text1.equals(Expected_text1))
		{

		System.out.println("text matching test case passed for childframe");
		}

		else {System.out.println("text not matching test case failed for child frame"); 
		}
		Thread.sleep(1000);
		
	}

}
