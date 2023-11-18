package javaScriptExecutorTopic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteScriptForScroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(2000);
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		//jse.executeScript("scrollBy(0,500)");
		//jse.executeScript("scrollTo(0,500)");
		jse.executeScript("scrollTo(0,document.body.scrollHeight)");
		//jse.executeScript("scrollTo(0,document.body.scrollwidth)");
	}
}
