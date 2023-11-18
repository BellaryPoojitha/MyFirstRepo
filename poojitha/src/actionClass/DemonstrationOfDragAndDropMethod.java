package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemonstrationOfDragAndDropMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demoapps.qspiders.com/dragDrop");
//		WebElement src= driver.findElement(By.xpath("//div[text()='Apple']"));
//		WebElement destination = driver.findElement(By.xpath("//div[@class='item  h-8']"));
		WebElement src= driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement destination = driver.findElement(By.xpath("(//div[@class='drop-column min-h-[200px] bg-slate-100'])[1]"));
		Actions act=new Actions(driver);
//		act.dragAndDrop(src, destination).perform();
		act.clickAndHold(src).release(destination).perform();
		
//		Thread.sleep(2000);	
//		
//		WebElement src1 = driver.findElement(By.xpath("//div[text()='Mango']"));
//		WebElement destination1 = driver.findElement(By.xpath("//div[@class='item  h-8']"));
//		act.dragAndDrop(src1, destination1).perform();
//		
//		Thread.sleep(2000);
//		
//		WebElement src2 = driver.findElement(By.xpath("//div[text()='Banana']"));
//		WebElement destination2 = driver.findElement(By.xpath("//div[@class='item  h-8']"));
//		act.dragAndDrop(src2, destination2).perform();
//		
//		Thread.sleep(2000);
//		
//		WebElement src3 = driver.findElement(By.xpath("//div[text()='Guava']"));
//		WebElement destination3 = driver.findElement(By.xpath("//div[@class='item  h-8']"));
//		act.dragAndDrop(src3, destination3).perform();

	}

}
