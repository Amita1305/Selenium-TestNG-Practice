package Com.test;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest 
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
  public void b() throws Exception
  {
	  w.get("http://altoromutual.com:8080/login.jsp");
	  Thread.sleep(2000);
	  w.findElement(By.id("uid")).sendKeys("tuser");
	  w.findElement(By.id("passw")).sendKeys("tuser");
	  w.findElement(By.cssSelector("input[name='btnSubmit']")).click();
	  String pagetitle=w.getTitle();
	  WebElement personal=w.findElement(By.xpath("//*[@id=\"LinkHeader2\"]"));
	  Assert.assertEquals(pagetitle, "Altoro Mutual", "No such title");
	  Assert.assertTrue(personal.isDisplayed(),"No such title value");
	 Thread.sleep(2000); 
  }
  
  @Test
  public void a() throws Exception
  {
	  w.get("http://altoromutual.com:8080/login.jsp");
	  Thread.sleep(2000);
	  w.findElement(By.id("uid")).sendKeys("admin");
	  w.findElement(By.id("passw")).sendKeys("admin");
	  w.findElement(By.cssSelector("input[name='btnSubmit']")).click();
	 Thread.sleep(2000); 
	  
  }
 
  @AfterTest
  public void afterTest() 
  {
	  w.quit();
 }

}
