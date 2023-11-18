package javaScriptExecutorTopic;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JseLoginPageForFaceBook {

	public static void main(String[] args) throws InterruptedException {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Email");
		String data1=scan.nextLine();
		System.out.println("Enter the password");
		String data2=scan.nextLine();
		
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter the Email");
//		String data1=scan.nextLine();
//		System.out.println("Enter the password");
//		String data2=scan.nextLine();
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		
		WebElement email = driver.findElement(By.id("email"));
		System.out.println(jse.executeScript("arguments[0].value='"+data1+"'", email));
		WebElement password = driver.findElement(By.id("passContainer"));
		System.out.println(jse.executeScript("arguments[0].value='"+data2+"'", password));
		WebElement login = driver.findElement(By.name("login"));
		jse.executeScript("arguments[0].click()",login);
	}
} 
