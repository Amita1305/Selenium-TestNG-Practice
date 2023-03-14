package Com.itview.testcases.practice.Selenium_testing_test_practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AllAnnotations
{
	@BeforeMethod
	  public void beforeMethod() 
	{
		System.out.println("Beforemethod");
		
	  }

	  @AfterMethod
	  public void afterMethod() 
	  {
		  System.out.println("aftermethod");
	  }

	  @BeforeClass
	  public void beforeClass() 
	  {
		  System.out.println("BeforClass");
	  }

	  @AfterClass
	  public void afterClass() 
	  {
		  System.out.println("AfterClass");
	  }
	  @BeforeTest
	  public void beforeTest()
	  {
		  System.out.println("BeforeTest");
	  }
	  
  @Test
  public void f() 
  {
	  System.out.println("Test1");
  }
    
  @Test
  public void f1() 
  {
	  System.out.println("Test2");
  }
  @Test
  public void f2() 
  {
	  System.out.println("Test3");
  }

  @AfterTest
  public void afterTest()
  {
	  System.out.println("after test");
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  System.out.println("Before suit");
  }

  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println("After suit");
  }
  

}
