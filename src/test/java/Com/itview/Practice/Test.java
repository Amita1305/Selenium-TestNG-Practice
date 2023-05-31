
package Com.itview.Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test 
{

	public static void main(String[] args) throws Exception
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver w=new ChromeDriver(options);
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		w.get("http://altoromutual.com:8080/login.jsp");
		/*w.findElement(By.id("uid")).sendKeys("admin");
		w.findElement(By.id("passw")).sendKeys("admin");
		w.findElement(By.cssSelector("input[name='btnSubmit']")).click();*/
		WebDriverWait wt=new WebDriverWait(w,Duration.ofSeconds(30));
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"LinkHeader2\"]")));
		w.findElement(By.linkText("PERSONAL")).click();
		
		Thread.sleep(2000);
		w.quit();
		
	}

}
