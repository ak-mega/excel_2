package PageobjectFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout 
{
  WebDriver Currentdriver;
  public Logout(WebDriver RemoteDriver)
  {
	  Currentdriver=RemoteDriver;
	  PageFactory.initElements(RemoteDriver, this);
	  
  }
  @FindBy(xpath = "//a[text()='Log out']") WebElement Logout;
  public void user_logout()
  {
	  Logout.click();
  }
  
  
}
