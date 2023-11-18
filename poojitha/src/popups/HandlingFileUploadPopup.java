package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFileUploadPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://kitchen.applitools.com/ingredients/file-picker");
		driver.findElement(By.id("photo-upload")).sendKeys("C:\\Users\\POOJITHA\\OneDrive\\Desktop\\web3pm\\god-6308823_1920.jpg");
	}
}
