package PageobjectFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver Currentdriver;          //object of webdriver
	public Login (WebDriver RemoteDriver) //constructor
	{
		Currentdriver=RemoteDriver;
	PageFactory.initElements(RemoteDriver, this);	//class and method and 2 agument
	}//pagefactory is a class provided by selenium webdriver to support page object model ,tester use @findby annotation
	@FindBy(id="username") WebElement Username;   //find and store kr liya
	@FindBy(id="password") WebElement Password;
	@FindBy(id="submit") WebElement Submit;
	public void user_name(String user)             //methods creat &yha value ayegi
	{
		Username.sendKeys(user);
	}
	public void user_pass(String pass)
	{
		Password.sendKeys(pass);
	}
	public void user_sub()
	{
		Submit.click();
	}


}
