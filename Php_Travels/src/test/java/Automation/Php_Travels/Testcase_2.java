package Automation.Php_Travels;

import org.testng.annotations.Test;

public class Testcase_2 {
	@Test
	public void Hsearch() throws Exception {
		Launch l=new Launch();
		l.Launchbrowser();
		Hotel_Search h1=new Hotel_Search();
		h1.Search();
		
		
	}

}
