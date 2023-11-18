package poojitha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeGetLocationGetRect {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement element=driver.findElement(By.id("newsletter-subscribe-button"));
		System.out.println("The x value is: "+element.getLocation().x);
		System.out.println("The y value is: "+element.getLocation().y);
		System.err.println("**************************************");
		System.out.println("The height is: "+element.getSize().height);
		System.out.println("The width is: "+element.getSize().width);
		System.err.println("***************************");
		System.out.println("The x value is: "+element.getRect().x);
		System.out.println("The y value is: "+element.getRect().y);
		System.out.println("The height is: "+element.getRect().height);
		System.out.println("The width is: "+element.getRect().width);
	}

}
