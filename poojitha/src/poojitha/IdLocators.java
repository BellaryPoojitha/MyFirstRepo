package poojitha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocators {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.id("FirstName")).sendKeys("pooji1234");
		driver.findElement(By.id("LastName")).sendKeys("123poojitha");
	    driver.findElement(By.name("Email")).sendKeys("Bellarypoojitha1256mail.com");
	    driver.findElement(By.id("register-button")).click();
	    driver.findElement(By.name("Password")).sendKeys("gsudygyghj");
	    driver.findElement(By.name("ConfirmPassword")).sendKeys("jfhdsyufgsfj");
	}

}
