package Com.itview.testcases.practice.Selenium_testing_test_practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

public class threadpoolsize 
{
	WebDriver w;
	@BeforeTest
	  public void beforeTest() 
	  {
		  w=new EdgeDriver();
	  }
  @Test(invocationCount=4,threadPoolSize=2)
  public void testmethod()
  {
	 w.get("https://randomuser.me/");
	 w.findElement(By.xpath("//*[@id=\"values_list\"]/li[1]")).click();
	 w.findElement(By.id("user_value")).click();
  }
  

  @AfterTest
  public void afterTest() {
  }

}
