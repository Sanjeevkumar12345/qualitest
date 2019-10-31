package Automation.Php_Travels;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Testcase_4 extends Launch{
	static	Logger log=Logger.getLogger("Testcase_4");
	@Test
	public void Carsearch() throws Exception {
		PropertyConfigurator.configure("C:\\Users\\Online Test\\git\\qualitest\\Php_Travels\\src\\main\\java\\Files\\log4j.properties");
		Launch l=new Launch();
		l.Launchbrowser();
		Tranfer t=new Tranfer();
		t.Fillcardetails();
		log.info("Car");
	} 
	@AfterTest
	public void close() throws Exception
	{
		driver.close();
	}

	/*public static void sign() {
		 
		 
		String title=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/section/div/div[2]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/div[1]/p/a")).getText();
			log.info("Car");
			Assert.assertEquals(title, "Manchester");
			
			if(title.equalsIgnoreCase("Manchester")) {
				System.out.println("Passed");
			}
			else
				System.out.println("Failed");
			}*/
		 
		 
		 
		} 
		 
		 

		
