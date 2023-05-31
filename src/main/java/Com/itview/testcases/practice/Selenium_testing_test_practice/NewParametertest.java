package Com.itview.testcases.practice.Selenium_testing_test_practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;

public class NewParametertest
{
  @Test
  @Parameters("SampleParameterName")
  public void f(String paramValue) 
  {
	System.out.println("Value of samole parameterName is: "+SampleParameterName);  
  }
   @AfterTest
  public void afterTest() {
  }

}
