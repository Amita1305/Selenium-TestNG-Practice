package Com.itview.testcases.practice.Selenium_testing_test_practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Code_For_IFrame 
{
	WebDriver w;
	
	@BeforeTest
	  public void BeforeTest()
	{
		w=new ChromeDriver();
	 }

  @Test
  public void Code_For_IFrame_Tes() throws Exception
  {
	  w.get("https://demo.automationtesting.in/Frames.html");
	  w.switchTo().frame("singleframe");
	  w.findElement(By.xpath("/html/body/section/div/div/div/input")).clear();
	  w.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Selenium");
	  Thread.sleep(2000);
	  
  }
  
  @AfterTest
  public void afterTest()
  {
	  w.quit();
  }
  

}
