package poojitha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[placeholder='Email address or phone number']")).sendKeys("guyg");
		driver.findElement(By.cssSelector("input[data-testid='royal_pass']")).sendKeys("HGJG");
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.partialLinkText("For")).click();
	}
}
