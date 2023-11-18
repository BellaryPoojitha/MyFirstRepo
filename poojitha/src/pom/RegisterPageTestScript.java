package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterPageTestScript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demowebshop.tricentis.com/");
		RegisterPage page=new RegisterPage(driver);
		page.getRegisterLink().click();
		page.getRadiobutton().click();
		page.getFrstname().sendKeys("poojitha");
		page.getLstname().sendKeys("bellary");
		page.getEmailTb().sendKeys("pooji@gmailcom");
		page.getPwd().sendKeys("pooji");
		page.getCnfrmpwd().sendKeys("pooji");
		page.getRegisterbutton().click();
	}
}
