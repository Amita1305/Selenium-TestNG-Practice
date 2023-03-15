package Com.itview.testcases.practice.Selenium_testing_test_practice;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

public class NewTest 
{
	WebDriver w;
	  @BeforeTest
	  public void beforeTest()
	  {
		  ChromeOptions co=new ChromeOptions();
		  co.addArguments("--remote-allow-origins=*");
		  w=new ChromeDriver(co);
		  
	  }
	  

  @Test
  public void f() 
  {
	  w.get("http://altoromutual.com:8080/login.jsp");
  }

  @AfterTest
  public void afterTest() {
  }

}
