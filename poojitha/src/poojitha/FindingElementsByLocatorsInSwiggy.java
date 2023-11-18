package poojitha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElementsByLocatorsInSwiggy {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		driver.findElement(By.id("location")).sendKeys("Banglore");
		driver.findElement(By.id("mobile")).sendKeys("767578875476");
		driver.findElement(By.id("name")).sendKeys("Poojitha");
		driver.findElement(By.id("email")).sendKeys("bellarypoojitha");
		driver.findElement(By.linkText("a-ayg")).click();
	}
}
