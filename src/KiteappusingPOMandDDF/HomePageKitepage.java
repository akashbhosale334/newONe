package KiteappusingPOMandDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePageKitepage {
	//1.
	@FindBy(xpath = "//span[@class='user-id']")private WebElement userId;
	@FindBy(xpath = "//a[@target='_self']")private WebElement logoutButton;

	//2.

	public HomePageKitepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		}
	//3.
	public void validateUserid(String Userid )
	{
		String expectedUserid = Userid;
		String actualUserid = userId.getText();
		  
		  if(actualUserid.equals(expectedUserid))
		  {
			  System.out.println("Testcase passed");
		  }
		  else 
		  {
			  
	       System.out.println("testcase is failed");
		  }
	  }	  
	
	     public void logout() throws InterruptedException 
	{
		userId.click();
		Thread.sleep(2000);
		logoutButton.click();
	}
}

