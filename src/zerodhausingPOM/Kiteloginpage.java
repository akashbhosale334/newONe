package zerodhausingPOM;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kiteloginpage {
	
//1.varaiable declaration ---->webelement
	
	@FindBy(id="userid")private WebElement UserId;
	@FindBy(id="password")private WebElement Password;
    @FindBy(xpath = "//button[@type='submit']")private WebElement loginButtonElement;

    //int a; a=variable type= int
    //webdriver= driver;driver=variable type=webdriver

//2.use constructor---->public

public Kiteloginpage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	}
//3.methods which work on data members
public void sendUserId()
{
	UserId.sendKeys("DAA677");
	}
public void sendPassword()
{
	Password.sendKeys("Velocity@123");
	}
public void clickonloginbutton()
{
	loginButtonElement.click();
}
}
