package Com.itview.testcases.practice.Selenium_testing_test_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_Xpath 
{

	public static void main(String[] args)throws Exception
	{
		WebDriver w=new ChromeDriver();
		w.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		w.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Admin");
		Thread.sleep(2000);
		w.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("admin123");
		Thread.sleep(2000);
		w.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		Thread.sleep(2000);
		w.quit();
		System.out.println("Admin test got successfully tested");
		
	}

}
