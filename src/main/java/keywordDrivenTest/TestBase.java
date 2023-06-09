package keywordDrivenTest;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestBase 
{
	WebDriver w;
	public void openBrowser(String browserName)
	{
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			w=new ChromeDriver(options);
		}
			else if(browserName.equalsIgnoreCase("Edge"))
		{
				w=new EdgeDriver();
		} 
		else
		{
			System.out.println("Browser not present... Installed in your System");
		}
		w.manage().window().maximize();
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	public void closeBrowser()
	{
		w.close();
	}
	
	public void openApplicationURL(String webPage)
	{
		w.get(webPage);
		
	}
	public void inputValueEvent(WebElement we,String value)
	{
		we.clear();
		we.sendKeys(value);
	}
	
	public void clickEvent(WebElement we)
	{
		we.click();
	}
	
	public void handleDropDownList(WebElement we, String value)
	{
		Select sel=new Select(we);
		sel.selectByVisibleText(value);
	}
	
	public void handleAlertEvent()
	{
		try
		{
			w.switchTo().alert().accept();
		}
		catch(Exception e)
		{
			System.out.println("No Alert");
		}
	}
	
	public String returnPageTitleValue()
	{
		return w.getTitle();
	}
	
	public void waitForSeconds(int sec) throws Exception
	{
		Thread.sleep(sec*1000);
	}
	
	public void pageScrollDown()
	{
		JavascriptExecutor js=(JavascriptExecutor)w;
		js.executeScript("window.scrollBy(0,300)");
	}
	
	public String readDataFromPropertiesFile(String Key) throws Exception
	{
		String projectPath=System.getProperty("user.dir");
		String ConfigPath=projectPath+"\\Config\\config.txt";
		
		FileInputStream fi=new FileInputStream(ConfigPath);
		Properties p=new Properties();
		p.load(fi);
		String value=p.getProperty(Key);
		fi.close();
		return value;
	}
	
}

