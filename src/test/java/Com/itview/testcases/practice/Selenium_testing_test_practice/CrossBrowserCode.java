package Com.itview.testcases.practice.Selenium_testing_test_practice;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class CrossBrowserCode 
{
	WebDriver w;

  @Test(priority=0, description="Validate on chrome")
  public void OpenGooglePageOnChrome() throws Exception
  {
		 w=new ChromeDriver();
		 w.get("https://www.google.com/");
		 String pageTitle=w.getTitle();
		 Assert.assertEquals(pageTitle,"Google");
		 Thread.sleep(2000);
		 w.quit();
  }
	 @Test(priority=1, description="Validate on Edge")
	  public void OpenGooglePageOnEdge() throws Exception
	  {
			 w=new EdgeDriver();
			 w.get("https://www.google.com/");
			 String pageTitle=w.getTitle();
			 Assert.assertEquals(pageTitle,"Google");
			 Thread.sleep(2000);
			 w.quit();
			 
			 
	  }
 
  }
