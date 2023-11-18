package poojitha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonWithWebElements {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fref%3Drhf_sign_in&prevRID=6KHWXFWKXTWXC93DNY0S&openid.assoc_handle=inflex&openid.mode=checkid_setup&desktopBrowserWeblabTreatment=C&prepopulatedLoginId=&failedSignInCount=0&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&mobileBrowserWeblabTreatment=C");
		//WebElement element=driver.findElement(By.name("customerName"));
		//element.sendKeys("poojitha");
		//System.out.println(element.getTagName());
		//System.out.println(element.getAttribute("placeholder"));
		//System.out.println(element.getCssValue("background-color"));
		//System.out.println(element.getCssValue("animation-name"));
		//System.out.println(element.getCssValue("width"));
		//Thread.sleep(1000);
		driver.get("https://www.amazon.in/");
		WebElement element1=driver.findElement(By.linkText("Best Sellers"));
		//element1.click();
		System.out.println(element1.getTagName());
		System.out.println(element1.getAttribute("class"));
		System.out.println(element1.getCssValue("text-decoration"));
		System.out.println(element1.getText());
		element1.click();
		WebElement element=driver.findElement(By.id("twotabsearchtextbox"));
		element.sendKeys("watches");
		element.clear();
		element.sendKeys("krishna frames");
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
	}
}	
	
