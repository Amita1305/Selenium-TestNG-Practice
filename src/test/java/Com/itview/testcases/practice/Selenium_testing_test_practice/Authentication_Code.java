package Com.itview.testcases.practice.Selenium_testing_test_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication_Code 
{

	public static void main(String[] args) 
	{
		
		WebDriver w=new ChromeDriver();
		w.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");


	}

}
