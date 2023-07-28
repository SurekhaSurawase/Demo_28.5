package Com.Ecommerce.TestCases;

import org.testng.annotations.Test;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;
import Com.Ecommerce.PageClasses.Login_pageClass;


public class TC_Login_test_class extends Ecommerce_BaseClass{
	

	@Test
	public void TC1() {
		Login_pageClass TCL = new Login_pageClass();
		TCL.Login();
		logger.info("Click on Login");
		TCL.Email(useremail);
		logger.info("Enter email id");
		TCL.Password(password);
		logger.info("Enter password");
		TCL.Login_button();
	}
}
