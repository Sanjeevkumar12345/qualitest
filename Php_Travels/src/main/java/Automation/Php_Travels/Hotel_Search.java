package Automation.Php_Travels;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class Hotel_Search extends Regitration{
	static By HotelsButton=By.xpath("//span[contains(text(),'Hotels')]");
 
	static By hotelfield=By.xpath("//span[contains(text(),'Search by Hotel or City Name')]");
	
	static By hotelname=By.xpath("//div[@id='s2id_location']//a[@class='select2-choice select2-default']");

	static By cookies=By.xpath("//*[@id=\"cookyGotItBtn\"]");
	static By hotelclick=By.xpath("//*[@id=\"select2-drop\"]/ul/li/ul/li/div/span");
	static By checkin=By.xpath("//div[@id='dpd1']//input[@placeholder='Check in']");
	//static By adult=By.xpath("//*[@id="htravellersInput"]");
	
	public static void Search() throws Exception {
		
		//Hotel_Button
		driver.findElement(HotelsButton).click();
		Thread.sleep(2000);
		driver.findElement(hotelfield).click();
		
		//Hotel_Search
		driver.findElement(hotelname).sendKeys(prop.getProperty("hotelname"));
		driver.findElement(hotelname).sendKeys(Keys.DOWN);	
		Thread.sleep(2000);
		driver.findElement(hotelclick).click();
		Thread.sleep(2000);
		driver.findElement(checkin).click();
		
		//Check_in
		
		while (true) {
			 
			String str = driver.findElement(By.xpath("//div[14]//div[1]//tr[1]//th[2]")).getText();
			
			if(str.equals(prop.getProperty("Checkin_Month")))
			{
				break;
			}
			else {
			     //Next
				driver.findElement(By.xpath("//div[14]//div[1]//tr[1]//th[3]")).click();
			}
		}
	
		//Select_Date
		//driver.findElement(cookies).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[14]/div[1]/table/tbody/tr[6]/td[3]")).click();
		
		//Check_out
		
		while (true) {
			
			String str1 = driver.findElement(By.xpath("/html/body/div[15]/div[1]/table/thead/tr[1]/th[2]")).getText();
			
			if(str1.equals(prop.getProperty("Checkout_Month"))) {
				
				break;
			}
			else {
				//Next
				driver.findElement(By.xpath("/html/body/div[15]/div[1]/table/thead/tr[1]/th[3]")).click();
			}
		}
		
		//Select_Date
		//driver.findElement(cookies).click();
		Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[15]/div[1]/table/tbody/tr[1]/td[6]")).click();
		 
		 //Adult_field
		 Thread.sleep(2000); 
		 driver.findElement(By.xpath("//input[@id='htravellersInput']")).click();
		 driver.findElement(By.xpath("//input[@id='hadultInput']")).sendKeys(Keys.BACK_SPACE);
		 driver.findElement(By.xpath("//input[@id='hadultInput']")).sendKeys(prop.getProperty("Adult"));
		  
		 
		 //Search_button
		 //driver.findElement(cookies).click();
		 driver.findElement(By.xpath("//button[@class='btn btn-lg btn-block btn-primary pfb0 loader']")).click();
		 
		 
		 
		 //HOTEL_BOOKING
		 
		 //Hotel_Details
		 
		// driver.findElement(cookies).click();
		 driver.findElement(By.xpath("//tr[2]//td[1]//div[3]//form[1]//button[1]")).click();
		 
		 //Hotels_Details_Page
		 //Thread.sleep(3000);
		 driver.findElement(cookies).click();
		 driver.findElement(By.xpath("//div[@class='room-cards']//div[1]//div[1]//div[1]//div[1]//div[3]//form[1]//button[1]")).click();
		 
	
	
	
	}
	
	
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Launchbrowser();
		
     Search();

	}
}

