package Com.itview.testcases.practice.Selenium_testing_test_practice;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Window_tab 
{
	WebDriver w;
	
	
	 @BeforeTest
	  public void beforeTest() 
	 {
		 w=new ChromeDriver();
		 w.manage().window().maximize();
	 }

 	  @Test(priority=0,description="Test case to handle Flipkart tab")
	  public void WindowTabFlipkart() throws Exception
	  {
	  w.get("https://www.flipkart.com/home-kitchen/home-appliances/washing-machines/fully-automatic-front-load~function/pr?sid=j9e%2Cabm%2C8qx&otracker=nmenu_sub_TVs%20%26%20Appliances_0_Fully%20Automatic%20Front%20Load");
	  w.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")).click();
	  Thread.sleep(2000);
	  
	  Set<String> windowsIDs=w.getWindowHandles(); //Return number of windows opend by wlenium id
	  System.out.println(windowsIDs);
	  
	  Object[] window=windowsIDs.toArray();
	  System.out.println(window[0]);
	  System.out.println(window[1]);
	  
	  w.switchTo().window(window[0].toString());
	  System.out.println("Tab 1 title: " +w.getTitle());
	  
	  Thread.sleep(2000);
	  
	  w.switchTo().window(window[1].toString());
	  System.out.println("Tab 2 title: " +w.getTitle());
	 
	  Thread.sleep(2000);
	  
	  w.switchTo().window(window[0].toString());
	  System.out.println("Tab 1 title: " +w.getTitle());
	  
	  Thread.sleep(2000);
	  
	  w.switchTo().window(window[1].toString());
	  System.out.println("Tab 2 title: " +w.getTitle());
	 
	 
			  
  }
  
 
  @AfterTest
  public void afterTest() 
  {
	  w.quit();
  }
}
