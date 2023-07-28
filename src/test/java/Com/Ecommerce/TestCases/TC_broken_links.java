package Com.Ecommerce.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;
import Com.Ecommerce.PageClasses.Links_pageClass;

public class TC_broken_links extends Ecommerce_BaseClass {

	@Test
	public void L2() throws IOException {
		Links_pageClass BK = new Links_pageClass(driver);
		BK.AppLinks();
	}
	
}
