package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		//to handle notification popup
		options.addArguments("--disable-notifications");
		//to open browser in incognito mode
		options.addArguments("--incognito");
		//to open browser in maximized mode
		options.addArguments("start-maximized");
		//to open browser in headless mode
		//options.addArguments("--headless");
		
		WebDriver driver=new ChromeDriver(options);
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.ajio.com/");

	}

}
