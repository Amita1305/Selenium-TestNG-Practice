package Com.itview.testcases.practice.Selenium_testing_test_practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Code_For_Alert
{
	 WebDriver w;
	 @BeforeTest
	  public void beforeTest() 
	 {
		w=new ChromeDriver();
	 }

  @Test
  public void Code_For_Alert_Test() throws Exception
  {
	  w.get("https://demo.testfire.net/login.jsp");
	  
	  w.findElement(By.name("btnSubmit")).click();
	  Thread.sleep(2000);
	  try 
	  {
		  w.switchTo().alert().accept();
	  }
	  catch(Exception e)
	  {
		  System.out.println("No Alert");
	  }
  }
  
 
  @AfterTest
  public void afterTest()
  {
	  w.quit();
  }

}
