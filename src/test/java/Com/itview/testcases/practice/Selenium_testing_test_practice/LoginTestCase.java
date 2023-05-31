package Com.itview.testcases.practice.Selenium_testing_test_practice;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginTestCase 
{
	public static void main(String[] args) throws Exception
	{
		ChromeOptions co=new ChromeOptions();
		 co.addArguments("--remote-allow-origins=*");
		 WebDriver w=new ChromeDriver(co);
		w.get("http://altoromutual.com:8080/login.jsp");
		w.findElement(By.id("uid")).sendKeys("admin");
		w.findElement(By.id("passw")).sendKeys("admin");
		w.findElement(By.name("btnSubmit")).click();
		Thread.sleep(2000);
		w.findElement(By.linkText("Sign Off")).click();
		w.quit();
		System.out.println("Admin test Cases Passed....!!!!");
	}
}
