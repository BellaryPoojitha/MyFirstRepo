package poojitha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageForWebShop {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("poojitha@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("1234");
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).submit();		
	}
}
