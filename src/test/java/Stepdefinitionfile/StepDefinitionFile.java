package Stepdefinitionfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageobjectFile.Login;
import PageobjectFile.Logout;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class StepDefinitionFile {
 public WebDriver driver;
 public Login lg;
 public Logout lo;
 
 
 
 @Given("user launch chrome browser")
 public void user_launch_chrome_browser() 
 {
   driver=new ChromeDriver();
   lg= new Login(driver);
   
   
 }

 @When("user open url {string}")
 public void user_open_url(String url)
 {
    driver.get(url);
 }

 @When("user enter  the username {string} and password as {string}")
 public void user_enter_the_username_and_password_as(String username, String password) 
 {
    lg.user_name(username);
    lg.user_pass(password);
 }

 @When("click on the submit button")
 public void click_on_the_submit_button()
 {
    lg.user_sub();
 }

 @Then("page title should be {string}")
 public void page_title_should_be(String Exptitle)
 {
    String Acttitle = driver.getTitle();
    Assert.assertEquals(Acttitle, Exptitle);
 }

 @When("user click on logout button")
 public void user_click_on_logout_button() 
 {
    lo=new Logout(driver);
 }

 @When("close browser")
 public void close_browser() {
     driver.close();
     driver.quit();
 }

}
