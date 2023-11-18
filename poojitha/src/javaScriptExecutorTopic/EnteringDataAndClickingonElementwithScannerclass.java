package javaScriptExecutorTopic;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnteringDataAndClickingonElementwithScannerclass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the data");
		String data=scan.nextLine();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement SearchStore = driver.findElement(By.id("small-searchterms"));
		System.out.println(js.executeScript("arguments[0].value='"+data+"'", SearchStore));
		WebElement SearchButton = driver.findElement(By.xpath("//input[@value='Search']"));
		js.executeScript("arguments[0].click()", SearchButton );
	}
}
