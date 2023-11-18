package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestScript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demowebshop.tricentis.com/");
		LoginPage page=new LoginPage(driver);
		page.getloginlink().click();
		page.getEmailTB().sendKeys("pooji@gmail.com");
		page.getPwdTB().sendKeys("pooji");
		page.getClickbutton().click();
//		driver.findElement(By.id("Email")).sendKeys("pooji@gmail.com");
//		driver.findElement(By.id("Password")).sendKeys("pooji");
//		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
	}
}