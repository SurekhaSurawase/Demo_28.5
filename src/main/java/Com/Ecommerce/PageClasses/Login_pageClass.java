package Com.Ecommerce.PageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;

public class Login_pageClass extends Ecommerce_BaseClass{

	@FindBy(xpath = "//a[contains(text(),'Log in')]")
	public WebElement login;
	
	@FindBy(id = "Email")
	public WebElement email;
	
	@FindBy(id = "Password")
	public WebElement password;
	
	@FindBy(xpath = "//button[contains(text(),'Log in')]")
	public WebElement login_button;
	
	public Login_pageClass() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void Login() {
		login.click();
	}
	
	//sp@gmail.com
	public void Email(String emailId) {
		email.sendKeys((emailId));
	}
	
	//123456
	public void Password(String Password) {
		password.sendKeys(Password);
	}
	
	public void Login_button() {
		login_button.click();
	}	
}
