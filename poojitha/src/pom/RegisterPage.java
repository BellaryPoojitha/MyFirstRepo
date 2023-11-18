package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText="Register")
	private WebElement RegisterLink;
	
	@FindBy(id="gender-female")
	private WebElement radiobutton;
	
	@FindBy(id="FirstName")
	private WebElement frstname;
	
	@FindBy(id="LastName")
	private WebElement lstname;
	
	@FindBy(id="Email")
	private WebElement emailTb;
	
	@FindBy(id="Password")
	private WebElement pwd;
	
	@FindBy(id="ConfirmPassword")
	private WebElement cnfrmpwd;
	
	@FindBy(id="register-button")
	private WebElement Registerbutton;

	public WebElement getRegisterLink() {
		return RegisterLink;
	}

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getFrstname() {
		return frstname;
	}

	public WebElement getLstname() {
		return lstname;
	}

	public WebElement getEmailTb() {
		return emailTb;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getCnfrmpwd() {
		return cnfrmpwd;
	}

	public WebElement getRegisterbutton() {
		return Registerbutton;
	}

}
