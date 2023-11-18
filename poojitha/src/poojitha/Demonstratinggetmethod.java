package poojitha;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demonstratinggetmethod {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
		ChromeDriver ref=new ChromeDriver();
		ref.get("https://www.instagram.com/");

	}

}
