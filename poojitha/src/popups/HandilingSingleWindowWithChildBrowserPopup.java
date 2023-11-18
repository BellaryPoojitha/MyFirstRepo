package popups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandilingSingleWindowWithChildBrowserPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> allwindowId = driver.getWindowHandles();
		String parentid = driver.getWindowHandle();
		String title="Basic Controls";
		for(String id:allwindowId) {
			driver.switchTo().window(id);
			if(driver.getTitle().contains(title)) {
				driver.manage().window().maximize();
			}
			else {
				driver.close();
			}
		}
	}

}
