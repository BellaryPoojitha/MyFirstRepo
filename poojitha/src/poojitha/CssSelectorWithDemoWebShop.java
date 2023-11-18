package poojitha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorWithDemoWebShop {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("bellary");
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("pooji");
		//driver.findElement(By.cssSelector("input[id$='terms']")).sendKeys("poojitha");
		//driver.findElement(By.cssSelector("input[id^='small']")).sendKeys("bellary");
		//driver.findElement(By.cssSelector("input[id*='sea']")).sendKeys("Qspiders");
		//driver.findElement(By.cssSelector("input[name='q']")).sendKeys("134");
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("krishna");
		driver.findElement(By.name("LastName")).sendKeys("poojitha");
		driver.findElement(By.id("Email")).sendKeys("poojita@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("1128567");
        driver.findElement(By.name("ConfirmPassword")).sendKeys("Poojithabellary");
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).submit();
	}
}
