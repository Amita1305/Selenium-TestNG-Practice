package Com.itview.testcases.practice.Selenium_testing_test_practice;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class JavaScriptExecuter_test 
{
	WebDriver w;
	 @BeforeTest
	 public void beforeTest() 
	 {
		 w=new ChromeDriver();
		 w.manage().window().maximize();
	 }

	  @Test
	  public void JavaScriptExecuterTest() throws Exception
	  {
		  w.get("https://demo.automationtesting.in/Register.html");
		  JavascriptExecutor js=(JavascriptExecutor) w;
		  js.executeScript("alert('Welcome to Register Page...');");
		  Thread.sleep(2000);
		  w.switchTo().alert().accept();
		  WebElement firstName=w.findElement(By.cssSelector("input[ng-model='FirstName']"));
		  WebElement lastName=w.findElement(By.cssSelector("input[ng-model='LastName']"));
		  
		  js.executeScript("arguments[0].value=''",firstName);
		  js.executeScript("arguments[0].value='Jones'",firstName);
		  Thread.sleep(2000);
		  
		  js.executeScript("arguments[0].value=''",lastName);
		  js.executeScript("arguments[0].value='Smith'",lastName);
		  Thread.sleep(2000);
		  
		  js.executeScript("window.scrollBy(0,600)");
		  Thread.sleep(2000);
		  
		  w.findElement(By.id("msdd")).click();
		  Thread.sleep(2000);
		  
		  w.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[1]")).click();
		  
		  
		  Thread.sleep(2000);
		  
		  WebElement thai=w.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[37]/a"));
		  js.executeScript("arguments[0].scrollIntoView(true)",thai);
		  thai.click();
		  
		  Thread.sleep(2000);
		  WebElement skillsDropDown=w.findElement(By.id("Skills"));
		  Select sel=new Select(skillsDropDown);
		  sel.selectByVisibleText("Java");
		  Thread.sleep(2000);
		  
		  js.executeScript("window.scrollBy(0,-600)");
		  Thread.sleep(3000);
		  js.executeScript("history.go(0)");
	  }  
	  
				  
  @AfterTest
  public void afterTest()
  {
	  w.quit();
  }

}
