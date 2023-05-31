package Com.test;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class NewTest1
{    
	WebDriver w;
  
	@BeforeTest
	  public void beforeTest() 
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		w=new ChromeDriver(options);
	 }

  @Test
  public void testMethod() throws Exception
  {
	  w.get("http://altoromutual.com:8080/login.jsp");
	  Thread.sleep(2000);
	  w.findElement(By.id("uid")).sendKeys("admin");
	  w.findElement(By.id("passw")).sendKeys("admin");
	 w.findElement(By.cssSelector("input[name='btnSubmit']")).click();
		 Thread.sleep(3000); 
	  
  }
 
  @AfterTest
  public void afterTest() 
  {
	  w.quit();
 }

}
