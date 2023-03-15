package Com.itview.testcases.practice.Selenium_testing_test_practice;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Code_For_Count_Elements 
{
		WebDriver w;
		
	  @BeforeTest
	  public void beforeTest() 
	  {
		  w=new EdgeDriver();
	  }

  @Test
  public void Code_For_Count_Elements_Test() throws Exception
  {
	  w.get("https://demo.automationtesting.in/Register.html\n");
	  Thread.sleep(2000);
	  //Count radio buttons
	 List <WebElement> radioButton= w.findElements(By.name("radiooptions"));
	 System.out.println("Count of radio Button: " +radioButton.size());
	 // Count checkbox
	 List <WebElement> checkbox= w.findElements(By.cssSelector("input[type='checkbox']"));
	 System.out.println("Count of checkbox: " +checkbox.size());
	 //Count DropDown on Web page
	 List <WebElement> dropDown= w.findElements(By.tagName("select"));
	 System.out.println("Count of DropDown: " +dropDown.size());
	 //Count the number of links
	 List <WebElement> links= w.findElements(By.tagName("a"));
	 System.out.println("Count of links: " +links.size());
	 
	 //To print the value from dropdown list
	 WebElement MonthDropDown=w.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"));
	 Select sel=new Select(MonthDropDown);
	 System.out.println("\nValue inside month DropDown\n");
	 List <WebElement> MonthDropDown_Values=sel.getOptions();
	 for(int i=1;i<MonthDropDown_Values.size();i++)
	 {
		 System.out.println(MonthDropDown_Values.get(i).getText());
	 }
  }
	 	 @AfterTest
  public void afterTest()
  {
	  w.quit();
  }
  

}
