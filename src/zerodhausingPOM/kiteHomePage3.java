package zerodhausingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteHomePage3 {
//1.
@FindBy(xpath = "//span[@class='user-id']")private WebElement userId;
@FindBy(xpath = "//a[@target='_self']")private WebElement logoutButton;

//2.

public kiteHomePage3(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	}
//3. methods which work on data members
public String validateUserId()
{
	String actualUserId = userId.getText();
	String expectedUserId = "DAA677";
	
    if(actualUserId.equals(expectedUserId))
    {
    	System.out.println("User ID matching TC is passed");
    }
    else 
    {
		System.out.println("User Id is Not Matching tc is failed");
	}
	return expectedUserId;
    }

public void clickOnLogoutButton() throws InterruptedException 
{		
userId.click();

logoutButton.click();

}

}





