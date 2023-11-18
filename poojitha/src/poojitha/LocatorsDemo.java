package poojitha;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("file:///E:/selenium%20clss/DemoPage.html");
		driver.findElement(By.id("username")).sendKeys("in selenium");
	}
}
