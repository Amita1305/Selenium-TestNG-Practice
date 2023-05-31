package Com.itview.testcases.practice.Selenium_testing_test_practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class testexample 
{
	WebDriver w;
	
	 @BeforeTest
	  public void beforeTest() 
	 {
		 ChromeOptions co=new ChromeOptions();
		  co.addArguments("--remote-allow-origins=*");
		  w=new ChromeDriver(co);
	 }

 @Test(timeOut=1000,description="Test case to verify Admin credential")
 public void LoginAdminTest() throws InterruptedException  
 {
	 //Sleep for 2 sec so that test gets fail
	  w.get("http://altoromutual.com:8080/login.jsp");
	  Thread.sleep(2000);
	  w.findElement(By.id("uid")).sendKeys("admin");
	  w.findElement(By.id("passw")).sendKeys("admin");
	  w.findElement(By.name("btnSubmit")).click();
	  w.findElement(By.linkText("Sign Off")).click();
 } 

  @AfterTest
  public void afterTest() 
  {
	  w.quit();
  }

}
