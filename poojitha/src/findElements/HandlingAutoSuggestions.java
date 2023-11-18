package findElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoSuggestions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		List<WebElement> suggestions = driver.findElements(By.xpath("//span[contains(text(),'selenium']"));
		System.out.println(suggestions.size());
		for(WebElement allsuggestions:suggestions) {
			System.out.println(allsuggestions.getText());
			System.out.println(allsuggestions.getAttribute("href"));
		}
	}
}
