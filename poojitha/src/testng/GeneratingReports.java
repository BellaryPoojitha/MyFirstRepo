package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GeneratingReports {
	@Test
	public void testCase() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Reporter.log("browser is launched",true);
		driver.manage().window().maximize();
		Reporter.log("window is maximized",false);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("navigation to application",false);
		driver.quit();
		Reporter.log("browser is closed",true);
	}
}
