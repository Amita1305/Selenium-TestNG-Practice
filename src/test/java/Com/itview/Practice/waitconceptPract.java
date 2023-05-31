package Com.itview.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class waitconceptPract 
{

	public static void main(String[] args)
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver w=new ChromeDriver(options);
		w.get("https://in.via.com/flight-tickets\r\n");
		w.quit();

	}

}
