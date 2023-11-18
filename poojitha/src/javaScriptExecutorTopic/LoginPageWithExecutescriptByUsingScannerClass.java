package javaScriptExecutorTopic;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageWithExecutescriptByUsingScannerClass {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Email");
		String data=scan.nextLine();
		System.out.println("Enter the password");
		String pass=scan.nextLine();
		
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demowebshop.tricentis.com/login");
//		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter the Email");
//		String data=scan.nextLine();
//		System.out.println("Enter the password");
//		String pass=scan.nextLine();
//		
	    JavascriptExecutor jse=(JavascriptExecutor) driver;
	    
		WebElement element = driver.findElement(By.id("Email"));
		System.out.println(jse.executeScript("arguments[0].value='"+data+"'", element));
		WebElement password = driver.findElement(By.id("Password"));
		System.out.println(jse.executeScript("arguments[0].value='"+pass+"'", password ));
		WebElement Login = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
		jse.executeScript("arguments[0].click()",Login);
	}
}
