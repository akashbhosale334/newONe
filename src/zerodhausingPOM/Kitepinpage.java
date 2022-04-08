package zerodhausingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kitepinpage {
	//1.declaration
@FindBy(id="pin")private WebElement pin;
@FindBy(xpath = "//button[@type='submit']")private WebElement continueButton;

//2.
public Kitepinpage(WebDriver driver) 
{
	PageFactory.initElements(driver, this);
	}

//3.
public void sendpin() 
{
	pin.sendKeys("866918");
	}
	public  void clickOnContinueButton()
	{
		continueButton.click();
	}
}

