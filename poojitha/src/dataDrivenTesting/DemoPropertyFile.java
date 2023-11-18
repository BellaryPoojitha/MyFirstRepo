package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoPropertyFile {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		FileInputStream fis=new FileInputStream("./testdata/data.properties");
        Properties property=new Properties();
        property.load(fis);
        
//        String value1 = property.getProperty("url");
//        //String value2 = property.getProperty("uname");
//        String value3 = property.getProperty("password");
        
//		driver.get(property.getProperty("url"));
//		driver.findElement(By.name("username")).sendKeys(property.getProperty("uname"));
//		driver.findElement(By.name("password")).sendKeys(property.getProperty("password"));
//		driver.findElement(By.xpath("//div[text()='Log in']")).click();
        driver.get(property.getProperty("url"));
        driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys(property.getProperty("uname"));
		driver.findElement(By.id("Password")).sendKeys(property.getProperty("password"));
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
}
