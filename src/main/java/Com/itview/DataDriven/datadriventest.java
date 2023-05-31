package Com.itview.DataDriven;

import org.testng.annotations.Test;

import org.testng.annotations.DataProvider;

public class datadriventest 
{
  @DataProvider(name="dp")
  public Object[][] dataprovideMethod() 
  {
    return new Object[][]
    {
      {"Dataone"},{ "Datatwo" }
    };
  }
    
  
    
    @Test(dataProvider = "dp")
    public void testMethod(String data) 
    {
  	  System.out.println("Data is: " +data);
    }
  
}
