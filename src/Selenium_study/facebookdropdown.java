package Selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookdropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium java drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		 WebElement Signupbutton = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		 Signupbutton.click();
		 Thread.sleep(3000);
		 
		 WebElement Firstname=driver.findElement(By.name("firstname"));
		 Firstname.sendKeys("Akash");
		 
		WebElement Surname=driver.findElement(By.name("lastname"));
		Surname.sendKeys("bhosale");
		
		WebElement mobandemail = driver.findElement(By.name("reg_email__"));
		mobandemail.sendKeys("Ak05@gmail.com");
		
		WebElement Password =driver.findElement(By.name("reg_passwd__"));
		Password.sendKeys("45@Akashb");
		Thread.sleep(1000);
		
		WebElement Regpass =driver.findElement(By.id("password_step_input"));
		 Regpass.sendKeys("45@Akashb");
		  Thread.sleep(1000);
		//1.identify dropdown and store it in reference variable
		WebElement datesl=driver.findElement(By.id("day"));
		WebElement monthsl=driver.findElement(By.id("month"));
		WebElement yearsl=driver.findElement(By.id("year"));
		
		//2.create an object of select class for webelement
		Select  a =new Select(datesl);
		Select a1 =new Select(monthsl);
		Select a2 =new Select(yearsl);
		Thread.sleep(2000);
		//3.by using select method from selectclass
		a.selectByIndex(4);//daydropdown
		a1.selectByVisibleText("Jul");//monthdropdown
		a2.selectByValue("1997");//yearDropdown
		Thread.sleep(2000);
        WebElement gender =driver.findElement(By.xpath("//label[text()='Male']"));
        gender.click();
	}

}
