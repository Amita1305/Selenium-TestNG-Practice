package Com.itview.testcases.practice.Selenium_testing_test_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class SSLCert 
{

	public static void main(String[] args) 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.setAcceptInsecureCerts(true);
		WebDriver w=new ChromeDriver(co);
		w.get("https://expired.badssl.com/");
		
		String pageTitle=w.getTitle();
		Assert.assertEquals(pageTitle,"expired.badssl.com");
		System.out.println("Pass...!!!");
		

	}

}
