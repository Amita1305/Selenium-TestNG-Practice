package Com.itview.testcases.practice.Selenium_testing_test_practice;

import org.testng.annotations.Test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Mouse_Handle 
{
  WebDriver w;

  @BeforeTest
  public void beforeTest()
  {
	 w=new ChromeDriver();
	 w.manage().window().maximize();
  }

  @Test
  public void Mouse_Handelle_Test() throws Exception
  {
	 
	  Actions a=new Actions(w);
	  w.get("https://www.ebay.com/");
	  WebElement Electronics=w.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
	  Electronics.click();
	  
	  Thread.sleep(2000);
	  w.navigate().back();
	  
	  Thread.sleep(2000);
	  WebElement Electronics_New=w.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
	  a.moveToElement(Electronics_New).build().perform();
	  
	Thread.sleep(2000);
	  w.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[1]/a")).click();
	  Thread.sleep(2000);
	  
	  //a.doubleClick(Electronics_New).build().perform();
	  
	  //RightClick
	  WebElement Apple_Cell_Phones=w.findElement(By.xpath("//*[@id=\"s0-16-12_2-0-1[0]-0-0\"]/ul/li[2]/a"));
	  a.moveToElement(Apple_Cell_Phones).contextClick().build().perform();
	  
	 w.get("http://crossbrowsertesting.github.io/drag-and-drop.html");
	  Thread.sleep(2000);
	  
	  WebElement draggable=w.findElement(By.id("draggable"));
	  WebElement droppable=w.findElement(By.id("droppable"));
	  
	  Actions drag_drop=new Actions(w);
	  drag_drop.dragAndDrop(draggable, droppable).build().perform();
	   
  }
  
  @AfterTest
  public void afterTest() 
  {
 }

}
