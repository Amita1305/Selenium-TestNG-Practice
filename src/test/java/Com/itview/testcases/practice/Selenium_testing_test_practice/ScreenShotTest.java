package Com.itview.testcases.practice.Selenium_testing_test_practice;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ScreenShotTest 
{
	WebDriver w;
	
	@BeforeTest
	public void beforeTest()
	{
		w=new ChromeDriver();
		w.manage().window().maximize();
	}
	@Test
  public void Code_For_ScreenshotTest() throws Exception
  {
	 String projectPath=System.getProperty("user.dir");
	 System.out.println(projectPath);
	 String screenshotPath=projectPath+"\\Screenshot\\GooglePage.png";
	 w.get("https://www.google.com/");
	 TakesScreenshot ts=(TakesScreenshot) w;
	 File f=ts.getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(f,new File(screenshotPath));
	 Thread.sleep(2000);
  }
	
  @AfterTest
  public void afterTest() 
  {
	  w.quit();
  }

}
