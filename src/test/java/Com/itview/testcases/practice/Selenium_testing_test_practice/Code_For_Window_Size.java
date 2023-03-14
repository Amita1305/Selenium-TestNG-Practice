package Com.itview.testcases.practice.Selenium_testing_test_practice;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Code_For_Window_Size
{
	WebDriver w;
	
	@BeforeTest
	  public void beforeTest() 
	{
		w=new ChromeDriver();
		//w.manage().window().maximize();
		//w.manage().window().fullscreen();
		Dimension d=new Dimension(1400,1200);
		w.manage().window().setSize(d);
	}

  @Test
  public void Code_Fro_Window_Size_Test() throws Exception
  {
	  w.get("https://www.google.co.in/");
	  Thread.sleep(2000);
	 //w.manage().window().maximize();
	  //w.manage().window().fullscreen();
	  Dimension d=new Dimension(1400,1200);
		w.manage().window().setSize(d);
	
	
  }
  
  
  @AfterTest
  public void afterTest() 
  {
	//  w.quit();
  }

}
