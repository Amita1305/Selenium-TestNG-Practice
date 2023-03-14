package Com.itview.testcases.practice.Selenium_testing_test_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification 
{

	public static void main(String[] args) 
	{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriver w=new ChromeDriver(opt);
		w.get("https://www.justdial.com/Banglore/Bakeries");

	}

}
