package Com.itview.testcases.practice.Selenium_testing_test_practice;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestCase 
{
	public static void main(String[] args) throws Exception
	{
		WebDriver w=new ChromeDriver();
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
