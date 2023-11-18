package poojitha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyingLocators {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.id("FirstName")).sendKeys("Poojitha");
		driver.findElement(By.name("LastName")).sendKeys("Bellary");
		driver.findElement(By.name("Email")).sendKeys("bellarypoojitha@gamil.com");
		driver.findElement(By.id("Password")).sendKeys("poojitha");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("poojitha");
		driver.findElement(By.id("register-button")).click();	
	}
}
