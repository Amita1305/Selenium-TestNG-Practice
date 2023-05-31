package Com.itview.Practice;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class testNGtest 
{
  
  @Test
  @Parameter({"val1","val2"})
  public void Sum(int a, int b) 
  {
	  int sum=a+b;
	  System.out.println("Sum= "+sum);
  }
  

  
}
