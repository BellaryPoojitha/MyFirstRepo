package javaScriptExecutorTopic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnteringTheDataAndClickingOnElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://demowebshop.tricentis.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement SearchStore = driver.findElement(By.id("small-searchterms"));
		WebElement SearchButton = driver.findElement(By.xpath("//input[@value='Search']"));
		js.executeScript("arguments[0].value='poojitha'", SearchStore);	
		Thread.sleep(3000);
		
		js.executeScript("arguments[0].value=''", SearchStore);
		Thread.sleep(3000);
		
		js.executeScript("arguments[0].value='BellaryPoojitha'", SearchStore);
		Thread.sleep(3000);
		
		js.executeScript("arguments[0].click()", SearchButton);
	}
}
