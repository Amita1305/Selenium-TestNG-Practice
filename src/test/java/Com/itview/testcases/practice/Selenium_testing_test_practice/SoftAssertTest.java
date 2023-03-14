package Com.itview.testcases.practice.Selenium_testing_test_practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class SoftAssertTest
{
	WebDriver w;
	SoftAssert sft;
	
	@BeforeTest
	  public void beforeTest() 
	 {
		 w=new ChromeDriver();
	 }

  @Test(priority=0,description="Test case to verify login page using 'Admin'user",groups="LoginModule")
  public void LoginAdminTest()
  {
	  sft=new SoftAssert();
	  w.get("http://altoromutual.com:8080/login.jsp");
	  String loginPageTitle=w.getTitle();
	  String loginPageUrl=w.getCurrentUrl();
	  WebElement loginPageLable=w.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/div/h1"));
	  String loginPageLabel_Text=loginPageLable.getText();
	  
	  WebElement loginButton=w.findElement(By.cssSelector("input[value='Login']"));
	  sft.assertEquals(loginPageTitle,"Altoro Mutual");
	  sft.assertTrue(loginPageUrl.contains("login.jsp"), "URL does not contain 'login.jsp'");
	  sft.assertTrue(loginPageLabel_Text.contains("Login"),"Label doesn't contains 'Login'");
	  sft.assertTrue(loginButton.isDisplayed(), "Login Button is not available on the login page");
	  
	  w.findElement(By.id("uid")).sendKeys("admin");
	  w.findElement(By.id("passw")).sendKeys("admin");
	  w.findElement(By.name("btnSubmit")).click();
	  sft.assertAll();
  }  
  
  @Test(priority=1,description="Test case to verify logout page using 'Admin'user",groups="LoginModule",dependsOnMethods="LoginAdminTest")
  public void SoftssertTest_SignOut() throws Exception
  {
	  sft=new SoftAssert();
	  Thread.sleep(2000);
	  String homePageTitle=w.getTitle();
	  WebElement homePageLabel=w.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/div/h1"));
	  String homePageLabel_Text=homePageLabel.getText();
	  
	//  WebElement SignOff_Object=w.findElement(By.xpath("//*[text()='Sign Off']"));
	  sft.assertEquals(homePageTitle,"Altoro Mutual");
	  sft.assertTrue(homePageLabel_Text.contains("Admin"), "Home Page does not contain 'Admin'");
	 
	  w.findElement(By.linkText("Sign Off")).click();
	  sft.assertAll();
  }
  
  @AfterTest
  public void afterTest() 
  {
	  w.quit();
  }

}
