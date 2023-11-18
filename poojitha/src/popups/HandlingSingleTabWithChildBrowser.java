package popups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSingleTabWithChildBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(2000);
		driver.findElement(By.id("newTabBtn")).click();
		
		Set<String> allwindowsId = driver.getWindowHandles();
		String parentid = driver.getWindowHandle();
		String expectedtitle= "AlertsDemo";
		for(String id:allwindowsId) {
			driver.switchTo().window(id);
			if(driver.getTitle().contains(expectedtitle)) {
				break;
		}
		}
	}
}
