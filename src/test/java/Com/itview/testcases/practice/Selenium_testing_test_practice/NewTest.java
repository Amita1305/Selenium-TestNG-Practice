package Com.itview.testcases.practice.Selenium_testing_test_practice;

import org.testng.annotations.Test;


//import org.testng.annotations.BeforeTest;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.SkipException;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.testng.annotations.AfterTest;

//public class NewTest 
//{
	/*WebDriver w;
	  @BeforeTest
	  public void beforeTest()
	  {
		  ChromeOptions co=new ChromeOptions();
		  co.addArguments("--remote-allow-origins=*");
		  w=new ChromeDriver(co);
		  
	  }
	  

 @Test
  public void f() 
   {
	  w.get("http://altoromutual.com:8080/login.jsp");
	  String PageTitle=w.getTitle();
	  System.out.println(PageTitle);
	 // if(PageTitle=="Altoro Mutual") throw new SkipException("Skipping the test");
  }

  @AfterTest
  public void afterTest() 
  {
	w.quit();
  }
  */
	public class NewTest
	{
	   @Test(enabled=false)
	   public void testcase1(){
	      System.out.println("Testcase 1 - Not executed");
	   }
	   @Test
	   public void testcase2(){
	      System.out.println("Testcase 2 - skip exception example");
	      throw new SkipException("Skipping this exception");
	   }
	   @Test
	   public void testcase3(){
	      boolean DataAvailable=false;
	      System.out.println("Test Case3 - Conditional Skip");
	      if(!DataAvailable)
	         throw new SkipException("Skipping this exception");
	      System.out.println("Executed Successfully");
	   }
	}


