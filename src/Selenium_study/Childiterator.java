package Selenium_study;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childiterator {

	private static final String ChildPageId = null;

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium java drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// Click on the new window Button
		WebElement newwindowButton=driver.findElement(By.name("NewWindow"));
		newwindowButton.click();  // Opening Child Browser Popup
		Thread.sleep(2000);
		 // To handle the child browser we change the focus of selenium from main page to child browser()
		//syntax --> driver.switchTo().window("idofwindow")
       // So to handle the browser we have to find out the id of the both browser
//	  	String idofmainpage = driver.getWindowHandle();   // this for the Id of main page
//	 	System.out.println(idofmainpage);
//		
            // ID Of Main Page as well as Child Browser 
		Set<String> Allwindowid=driver.getWindowHandles();
		Thread.sleep(2000);
	     //    System.out.println(Allwindowid);
		// We Get The Set of String & We Want One At Time So We Use The " ITERATOR " Which is the Interface
		java.util.Iterator<String> it =Allwindowid.iterator();//-1 postioning         formula--it--->Minindex-1
		String MainPageId = it.next();//Position to 0th Location 
		System.out.println("Id of main page is "+MainPageId);
		String ChildPageId = it.next(); //Position to 1st Location
		System.out.println("Id of Childpage is "+ChildPageId);
		
		// Now we can switch to Child Browser  & WE can take any action on the child browser window
				driver.switchTo().window(ChildPageId);  
               Thread.sleep(2000);
				driver.manage().window().maximize();
				// Taking action on window.
				driver.findElement(By.xpath("//input[@id='the7-search']")).sendKeys("Selenium"); 
				Thread.sleep(4000);
				driver.close();         
                Thread.sleep(2000);
               //Now I have to switch the focus of selenium to main page
				driver.switchTo().window(MainPageId);                   
				Thread.sleep(3000); 
				driver.findElement(By.name("home")).click();          
				Thread.sleep(3000);
				driver.close();
	}

}
