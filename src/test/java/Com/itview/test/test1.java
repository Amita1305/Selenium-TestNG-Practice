package Com.itview.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test1 {

	public static void main(String[] args) 
	{

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver w=new ChromeDriver(options);
		w.get("http://altoromutual.com:8080/login.jsp");
		w.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/div/h1")).isEnabled();
	//	System.out.println(text);
		String attribute=w.findElement(By.xpath("//*[@id=\"uid\"]")).getAttribute("type");
		System.out.println(attribute);

	}

}
