package Com.itview.testcases.practice.Selenium_testing_test_practice;

import org.testng.annotations.Test;

//import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ThreadPoolSizeEx 
{
	
	@Test
	public void test1(){
		System.out.println("Test1 Method");
        }
	
	@Test(invocationCount=5,threadPoolSize=3)
	public void invocationCount()
	{
	    long id = Thread.currentThread().getId();
	    System.out.println("ThreadPoolSize: Thread id is: " + id);
        }

   @AfterTest
  public void afterTest() {
  }

}
