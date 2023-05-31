package Com.itview.Practice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testparameter 
{
	  
	  @Test
	  @Parameters({"val1","val2"})
	  public void Sum(int a, int b) 
	  {
		  int sum=a+b;
		  System.out.println("Sum= "+sum);
	  }
	  

	  
	}
}
}
