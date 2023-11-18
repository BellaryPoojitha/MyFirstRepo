package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		@FindBy(linkText = "Log in")
		 private WebElement loginlink;
		
		public WebElement getloginlink(){
			return loginlink;
			
	}
        @FindBy(id = "Email")
        private WebElement EmailTB;
        
		public WebElement getEmailTB() {
			return EmailTB ;
		}

    	@FindBy(id = "Password")
        private WebElement PwdTB;
		
		public WebElement getPwdTB() {
			return PwdTB;
		}

		@FindBy(xpath="//input[@value='Log in']")
        private WebElement Clickbutton;
		
		public WebElement getClickbutton() {
			return Clickbutton;
		}
}
