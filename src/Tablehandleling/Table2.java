package Tablehandleling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium java drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.get("https://vctcpune.com/selenium/practice.html"); Thread.sleep(2000);
		// Get the No of Columns
				 List<WebElement> CountColumns = driver.findElements(By.xpath("//table[@id='product']//tr[1]//th"));
				System.out.println("Total No Of Columns "+CountColumns.size());//SIZE 
				int TotalNoOfcolumns = CountColumns.size(); // REFERENCE VARIABLE
		// Get The No of Rows
				List<WebElement> CountRows = driver.findElements(By.xpath("//table[@id='product']//tr"));
				System.out.println("Total No OF Rows "+CountRows.size());
				int TotalNoOfRows = CountRows.size();
				
		// Outer Loop -->FOR ROWS
				
				for(int i=1; i<=TotalNoOfRows;i++)
				{
					String text;
			   // Inner loop for --> COLUMNS 
					for(int j=1; j<=TotalNoOfcolumns;j++)
					{
						if(i==1)
						{
							text=driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]//th["+j+"]")).getText();
							System.out.println(text+" ");
						}
						else
						{
							text=driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]//td["+j+"]")).getText();
							System.out.println(text+" ");
						}
					}
				}
				System.out.println();
}
}