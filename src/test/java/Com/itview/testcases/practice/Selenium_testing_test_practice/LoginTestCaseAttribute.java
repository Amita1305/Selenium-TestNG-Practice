package Com.itview.testcases.practice.Selenium_testing_test_practice;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class LoginTestCaseAttribute 
{
	WebDriver w;
	
	 @BeforeTest
	  public void beforeTest() 
	 {
		 w=new ChromeDriver();
	  }

  @Test(priority=0, description="Test case to verify Admin credential", groups="LoginModule")
  public void LoginAdminTest() 
  {
	  w.get("http://altoromutual.com:8080/login.jsp");
	  w.findElement(By.id("uid")).sendKeys("admin");
	  w.findElement(By.id("passw")).sendKeys("admin");
	  w.findElement(By.name("btnSubmit")).click();
	  w.findElement(By.linkText("Sign Off")).click();
	  //Assert.fail();
  }
  
  @Test(priority=1, description="Test case to verify tuser credential", dependsOnMethods="LoginAdminTest",groups="LoginModule",invocationCount=3, enabled=true)
  public void LogintuserTest() 
  {
	  w.get("http://altoromutual.com:8080/login.jsp");
	  w.findElement(By.id("uid")).sendKeys("tuser");
	  w.findElement(By.id("passw")).sendKeys("tuser");
	  w.findElement(By.name("btnSubmit")).click();
	  w.findElement(By.linkText("Sign Off")).click();
	    }
  @Test(priority=2, description="Test case to verify Invalid credential", dependsOnMethods="LoginAdminTest",groups="LoginModule",enabled=true)
  public void LoginInvalidTest() 
  {
	  w.get("http://altoromutual.com:8080/login.jsp");
	  w.findElement(By.id("uid")).sendKeys("Invalid");
	  w.findElement(By.id("passw")).sendKeys("tuser");
	  w.findElement(By.name("btnSubmit")).click();
	;
  }

 
  @AfterTest
  public void afterTest() 
  {
  w.quit();
  }
  

}
