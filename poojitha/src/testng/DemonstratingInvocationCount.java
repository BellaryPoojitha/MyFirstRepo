package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemonstratingInvocationCount {
	
	@Test(invocationCount = 5)
	public void login()
	{
	   //System.out.println("login page");
	   System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.get("https://www.flipkart.com/");
	   driver.quit();
	}
}
