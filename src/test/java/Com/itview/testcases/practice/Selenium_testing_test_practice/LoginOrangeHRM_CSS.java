package Com.itview.testcases.practice.Selenium_testing_test_practice;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class LoginOrangeHRM_CSS 
{

	public static void main(String[] args) throws Exception
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver w=new ChromeDriver(options);
		w.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		w.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
		w.findElement(By.cssSelector("input[name=\"txtPassword\"]")).sendKeys("admin123");
		Thread.sleep(2000);
		w.findElement(By.cssSelector("input.button")).click();
		Thread.sleep(3000);
		System.out.println("Admin test done successfully");
		w.quit();	
	}

}
