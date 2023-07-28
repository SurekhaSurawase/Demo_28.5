package Com.Ecommerce.BaseClass;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

//import Com.Ecommerce.Utilities.ReadConfiguration;

public class Ecommerce_BaseClass {
	public static WebDriver driver;
	public static Logger logger;

//	ReadConfiguration RC = new ReadConfiguration();
//	public String URL = RC.getApplicationURL();
//	public String password = RC.Password();
//	public String useremail = RC.Useremail();
//	public String chromepath = RC.getChromePath();
//	public String firefoxpath = RC.getFirefoxpath();
//	
	@Parameters("Browser")
	@BeforeMethod
	public void SetUP(String Browsername) {

		if (Browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Installer\\chromedriver.exe");
			driver = new ChromeDriver();
		} 
		else if (Browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Installer\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		logger = Logger.getLogger("11March Automation Framework");
		PropertyConfigurator.configure(
				"C:\\Users\\ASUS\\eclipse-workspace\\11March_Automation_Framework\\Configuration\\log4j.properties");

		logger.info("Open browser");

		driver.manage().window().maximize();
		logger.info("maximize browser");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.get("https://demo.nopcommerce.com/");
		logger.info("Open BaseURL");
	}

	@AfterMethod
	public void TearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
