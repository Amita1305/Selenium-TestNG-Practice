package Com.itview.testcases.practice.Selenium_testing_test_practice;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip
{

	public static void main(String[] args)
	{
		WebDriver w=new ChromeDriver();
		w.get("https://www.google.com/");
		String toolTipOfGoogleSearch=w.findElement(By.name("q")).getAttribute("title");
		System.out.println(toolTipOfGoogleSearch);
		Assert.assertEquals(toolTipOfGoogleSearch,"Search");
		w.quit();
	}

}
