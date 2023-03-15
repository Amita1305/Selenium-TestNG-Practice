package Com.itview.testcases.practice.Selenium_testing_test_practice;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class HardTestTest
{
	WebDriver w;
	 @BeforeTest
	  public void beforeTest() 
	 {
		 ChromeOptions co=new ChromeOptions();
		  co.addArguments("--remote-allow-origins=*");
		  w=new ChromeDriver(co);
		 
	 }

  @Test(priority=0,description="Test case to verify login page using 'Admin'user",groups="LoginModule")
  public void HardAssertTest()
  {
	  w.get("http://altoromutual.com:8080/login.jsp");
	  String loginPageTitle=w.getTitle();
	  String loginPageUrl=w.getCurrentUrl();
	  WebElement loginPageLable=w.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/div/h1"));
	  String loginPageLabel_Text=loginPageLable.getText();
	  
	  WebElement loginButton=w.findElement(By.cssSelector("input[value='Login']"));
	  Assert.assertEquals(loginPageTitle,"Altoro Mutual");
	  Assert.assertTrue(loginPageUrl.contains("login.jsp"), "URL does not contain 'login.jsp'");
	  Assert.assertTrue(loginPageLabel_Text.contains("Login"),"Label doesn't contains 'Login'");
	  Assert.assertTrue(loginButton.isDisplayed(), "Login Button is not available on the login page");
	  
	  w.findElement(By.id("uid")).sendKeys("admin");
	  w.findElement(By.id("passw")).sendKeys("admin");
	  w.findElement(By.name("btnSubmit")).click();
  }  
  
  @Test(priority=1,description="Test case to verify logout page using 'Admin'user",groups="LoginModule",dependsOnMethods="HardAssertTest")
  public void HardAssertTest_SignOut()
  {
	  String homePageTitle=w.getTitle();
	  WebElement homePageLabel=w.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/div/h1"));
	  String homePageLabel_Text=homePageLabel.getText();
	  WebElement SignOff_Object=w.findElement(By.xpath("//*[text()='Sign Off']"));
	  Assert.assertEquals(homePageTitle,"Altoro Mutual");
	  Assert.assertTrue(homePageLabel_Text.contains("Admin"), "Home Page does not contain 'Admin'");
	  Assert.assertTrue(SignOff_Object.isDisplayed(),"SignOff Object not present on Home Page'");
	  w.findElement(By.linkText("Sign Off")).click();
  }
  
  @AfterTest
  public void afterTest() 
  {
	  w.quit();
  }

}
