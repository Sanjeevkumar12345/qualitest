package Automation.Php_Travels;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class Testcase_2 extends Launch {
	//log_4j

	static	Logger log=Logger.getLogger("Testcase_2");
	
	@Test
	public void Hsearch() throws Exception {
		
		PropertyConfigurator.configure("C:\\Users\\Online Test\\git\\qualitest\\Php_Travels\\src\\main\\java\\Files\\log4j.properties");
		Launch l=new Launch();
		l.Launchbrowser();
		Hotel_Search h2=new Hotel_Search();
		h2.Search();
		log.info("Hotel");
}
	
	@AfterTest
	public void close() throws Exception
	{
		driver.close();
	}
	 //@AfterTest
	//public static void sign() {
		 
		
	/*	String title=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/section/div/div[2]/div/div/div[1]/div[1]/h3/span[1]")).getText();
		log.info("title");
		Assert.assertEquals(title, "Hotels");
		
		if(title.equalsIgnoreCase("Hotels")) {
			System.out.println("Passed");
		}
		else
			System.out.println("Failed");
		} */
		
		
}

