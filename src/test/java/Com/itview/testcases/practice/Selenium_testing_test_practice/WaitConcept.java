package Com.itview.testcases.practice.Selenium_testing_test_practice;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitConcept 
{
	public static void main(String[] args) throws Exception
	{
	WebDriver w=new ChromeDriver();
	
	//w.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	 w.get("https://in.via.com/flight-tickets");
	 w.findElement(By.id("wzrk-cancel")).click();
	 w.findElement(By.id("source")).sendKeys("Mumbai");
	// Thread.sleep(2000);
	 w.findElement(By.id("ui-id-1")).click();
	 w.findElement(By.id("destination")).sendKeys("Pune");
	 w.findElement(By.id("ui-id-2")).click();
	 w.findElement(By.xpath("//*[@id=\"depart-cal\"]/div[3]/div[2]/div[3]/div[1]")).click();
	 w.findElement(By.id("search-flight-btn")).click();
	 
	/* WebDriverWait wt=new WebDriverWait(w,Duration.ofSeconds(30));
	 wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cheap_flight_container\"]/div[2]/div/div[1]")));*/
	
	 Wait<WebDriver> fluentwt=new FluentWait<WebDriver>(w).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
	 fluentwt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cheap_flight_container\"]/div[2]/div/div[1]/div[3]/i")));
	 
	 WebElement getLowestFlightPrice=w.findElement(By.xpath("//*[@id=\"cheap_flight_container\"]/div[2]/div/div[1]"));
	 String lowestFlightPrice=getLowestFlightPrice.getText();
	 System.out.println("Cheapest Flights is:" +lowestFlightPrice);
	 
	 
	 w.quit();
	 
	 
	 
	 
	}

}
