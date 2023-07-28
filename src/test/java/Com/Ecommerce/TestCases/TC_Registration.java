package Com.Ecommerce.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;
import Com.Ecommerce.PageClasses.NewRegistration_pageClass;


public class TC_Registration extends Ecommerce_BaseClass {

	@Test
	public void TC1() throws InterruptedException {
		NewRegistration_pageClass tc = new NewRegistration_pageClass();

		tc.Register();
		logger.info("Click on Register tab");
		Thread.sleep(2000);
		tc.gender();
		logger.info("Select Gender");
		tc.Firstname("surekha");
		logger.info("Enter user first name");
		tc.Lastname("pawar");
		logger.info("Enter user last name");
		tc.Day();
		tc.Month();
		tc.Year();
		tc.Email("surekha9033@gmail.com");
		logger.info("Enter user email");
		tc.Company("Deloitte");
		tc.Password("123456");
		logger.info("Enter user password");
		tc.ConfirmPassword("123456");

		tc.Register_button();
		logger.info("click on submit");
		
		boolean text = driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]")).isDisplayed();
		System.out.println(text);
		String Exp_text = "Your registration completed";
		
		if(text == true) {
			System.out.println("Registration successful");
			Assert.assertTrue(true);
		}
		else {
			System.out.println("Registration unsuccessful");
			Assert.assertTrue(false);
		}		
	}
}
