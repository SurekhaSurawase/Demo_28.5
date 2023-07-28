package Com.Ecommerce.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfiguration {

	Properties prop;

	public ReadConfiguration() {
		File path = new File(
				"C:\\Users\\ASUS\\eclipse-workspace\\11March_Automation_Framework\\Configuration\\Config.properties");
		prop = new Properties();

		try {
			FileInputStream file = new FileInputStream(path);
			try {
				prop.load(file);
			} catch (IOException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public String getApplicationURL() {
		String URL = prop.getProperty("BaseURL");
		return URL;
	}

	public String Useremail() {
		String Usermail = prop.getProperty("Username");
		return Usermail;
	}

	public String Password() {
		String password = prop.getProperty("Password");
		return password;
	}

	public String getChromePath() {
		String chromepath = prop.getProperty("Chromdriver");
		return chromepath;
	}
	
	public String getFirefoxpath() {
		String firefoxpath = prop.getProperty("Firefox");
		return firefoxpath;
	}
}
