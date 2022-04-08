package Selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nestedif_frame {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium java drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demoqa.com/nestedframes");
	// switch to main page to  frame 
		Thread.sleep(1000);
		driver.switchTo().frame("frame1"); //id="frame1"; // switch to parentFrame
		Thread.sleep(2000);
	//	<body>Parent frame<iframe 
		WebElement ParentElement = driver.findElement(By.xpath("//body[text()='Parent frame']"));// find element of gettext();
		Thread.sleep(2000);
		String frametext = ParentElement.getText(); // gettext of parent frame
		Thread.sleep(2000);
		System.out.println("the frame text is "+frametext);
// switch to parent to child
		Thread.sleep(2000);
	// If there is no "ID , Name "	then find the webelement of the frame
	// First find the webelementof the Iframe
		
	//	<iframe srcdoc="<p>Child Iframe</p>"></iframe> IN DOM STRUCTURE
		WebElement ChildElementframe = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(ChildElementframe);
		Thread.sleep(5000);
// perform the action on the 		
		WebElement ChildElementoftext = driver.findElement(By.xpath("//p[text()='Child Iframe']"));
		
		String childtext = ChildElementoftext.getText();
		Thread.sleep(2000);
		System.out.println("the text in frame1 is "+childtext);
		Thread.sleep(2000);
			
	}

}
