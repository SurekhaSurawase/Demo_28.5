package Com.Ecommerce.PageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;
import net.bytebuddy.utility.RandomString;

public class NewRegistration_pageClass  extends Ecommerce_BaseClass{

	public NewRegistration_pageClass() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Register')]")
	public WebElement register;

	@FindBy(id = "gender-male")
	public WebElement male;

	@FindBy(id = "gender-female")
	public WebElement female;

	@FindBy(id = "FirstName")
	public WebElement Fname;

	@FindBy(id = "LastName")
	public WebElement Lname;

	@FindBy(xpath = "//select[@name=\"DateOfBirthDay\"]")
	public WebElement day;

	@FindBy(xpath = "//select[@name=\"DateOfBirthMonth\"]")
	public WebElement month;

	@FindBy(xpath = "//select[@name=\"DateOfBirthYear\"]")
	public WebElement year;

	@FindBy(id = "Email")
	public WebElement email;

	@FindBy(id = "Company")
	public WebElement comapny;

	@FindBy(id = "Password")
	public WebElement password;

	@FindBy(id = "ConfirmPassword")
	public WebElement confirmpassword;

	@FindBy(id = "register-button")
	public WebElement register_button;

	public void Register() {
		register.click();
	}

	public void gender() {
		female.click();
	}

	public void Firstname(String fname) {
		Fname.sendKeys(fname);
	}

	public void Lastname(String lname) {
		Lname.sendKeys(lname);
	}

	public void Day() throws InterruptedException {
		day.click();
		Thread.sleep(2000);
		Select S1 = new Select(day);
		S1.selectByVisibleText("22");
	}

	public void Month() throws InterruptedException {
		month.click();
		Thread.sleep(2000);
		Select S2 = new Select(month);
		S2.selectByVisibleText("January");
	}

	public void Year() throws InterruptedException {
		year.click();
		Thread.sleep(2000);
		Select S3 = new Select(year);
		S3.selectByVisibleText("2007");
	}

	public void Email(String mail) {
		String name = RandomString.make(3);
		email.sendKeys(name + mail);
	}

	public void Company(String company_name) {
		comapny.sendKeys(company_name);
	}

	public void Password(String Password) {
		password.sendKeys(Password);
	}

	public void ConfirmPassword(String cPassword) {
		confirmpassword.sendKeys(cPassword);
	}

	public void Register_button() {
		register_button.click();
	}
}
