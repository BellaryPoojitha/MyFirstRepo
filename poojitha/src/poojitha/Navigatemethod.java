package poojitha;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatemethod {

	public static void main(String[] args) throws InterruptedException, MalformedURLException 
	{
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		ChromeDriver ref=new ChromeDriver();
		ref.manage().window().maximize();
		ref.get("https://www.amazon.com");
		Thread.sleep(2000);
		URL url=new URL("https://www.flipkart.com");
		ref.navigate().to(url);
		Thread.sleep(4000);
		ref.navigate().back();
		Thread.sleep(2000);
		ref.navigate().forward();
		Thread.sleep(2000);
		ref.navigate().refresh();
		ref.quit();
	}
}
