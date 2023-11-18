package javaScriptExecutorTopic;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JseLoginPageForInsta {

	public static void main(String[] args) throws InterruptedException {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Email");
		String data=scan.nextLine();
		System.out.println("Enter the password");
		String pass=scan.nextLine();
		
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.instagram.com/");
		
        JavascriptExecutor jse=(JavascriptExecutor) driver;
		
		WebElement email = driver.findElement(By.name("username"));
		System.out.println(jse.executeScript("arguments[0].value='"+data+"'", email));
		WebElement password = driver.findElement(By.name("password"));
		System.out.println(jse.executeScript("arguments[0].value='"+pass+"'", password));
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		jse.executeScript("arguments[0].click()",login);
	}

}
