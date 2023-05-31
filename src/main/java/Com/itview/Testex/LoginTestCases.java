package Com.itview.Testex;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class LoginTestCases 
{
	WebDriver w;
	@BeforeTest
	  public void beforeTest() 
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		w=new ChromeDriver(options);
	}

  @Test(invocationCount=4,threadPoolSize=2)
  public void LoginTestCase_TestNG_Test()
  {
	  w.get("http://altoromutual.com:8080/login.jsp");
	  w.findElement(By.id("uid")).sendKeys("admin");
	  w.findElement(By.id("passw")).sendKeys("admin");
	  w.findElement(By.name("btnSubmit")).click();
	  w.findElement(By.linkText("Sign Off")).click();
  }
  
  @AfterTest
  public void afterTest()
  {
	  w.quit();
  }

}
