package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSPPromptPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demoapps.qspiders.com/alert/prompt");
		driver.findElement(By.id("buttonAlert1")).click();
		Alert alert = driver.switchTo().alert();
//		alert.accept();
//		alert.dismiss();
		System.out.println(alert.getText());
		alert.sendKeys("yes");
//		alert.accept();
		alert.dismiss();
	}
}
