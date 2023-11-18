package iframes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
//		JavascriptExecutor jsc=(JavascriptExecutor)driver;
//		jsc.executeScript("window.scrollTo(0,1500)");
		//WebElement element=driver.findElement(By.id("frm2"));
		//driver.switchTo().frame(2);by using index
		//driver.switchTo().frame(element);
		driver.switchTo().frame("frm2");
		Thread.sleep(2000);
		WebElement frame= driver.findElement(By.id("firstName"));
		frame.sendKeys("selenium");
		
	}
}
