package Com.itview.testcases.practice.Selenium_testing_test_practice;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrokenLinks
{

	public static void main(String[] args) throws Exception
	{
		WebDriver w=new ChromeDriver();
		w.get("https://www.google.com/");
		List<WebElement>links=w.findElements(By.tagName("a"));
		System.out.println("Number of links on the google search page: " +links.size());
		Iterator<WebElement>it=links.iterator();
		String href;
		int responseCode;
		while(it.hasNext())
		{
			href=it.next().getAttribute("href");
			try
			{
				HttpURLConnection huc=(HttpURLConnection)(new URL(href).openConnection());
				huc.setRequestMethod("HEAD");
				huc.connect();
				responseCode=huc.getResponseCode();
				if (responseCode >=400)
				{
					System.out.println("Broken Links: "+href+ "Response code: "+responseCode);
				}
			}
			catch(MalformedURLException e)
			{
			}
			
		}
		Thread.sleep(2000);
		w.quit();
	}
}
