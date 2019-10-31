package Automation.Php_Travels;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Testcase_1 extends Launch {
	//Log_4j
	static	Logger log=Logger.getLogger("Testcase_1");
	
	@Test
	public void Reg() throws Exception {
		PropertyConfigurator.configure("C:\\Users\\Online Test\\git\\qualitest\\Php_Travels\\src\\main\\java\\Files\\log4j.properties");
		Homepage h= new Homepage();
		h.Launchbrowser();
		h.Signup();
		Registration r= new Registration();
		r.Register();
		log.info("Registration");
	}
	@AfterTest
	public void close() throws Exception
	{
		driver.close();
	}
	//public static void sign() {

	 /*System.out.println("hi");
		String title= driver.getTitle();
		log.info("title");
		Assert.assertEquals(title, "Register"); */
		
		/* String title=driver.findElement(By.xpath("//h3[@class='text-align-left'][contains(text(),'Hi, Sanju Raj')]")).getText();
		log.info("title");
		Assert.assertEquals(title, "Hi, Sanju Raj");
		
		if(title.equalsIgnoreCase("Hi, Sanju Raj")) {
			System.out.println("Passed");
		}
		else
			System.out.println("Failed");
		} */
	
}
