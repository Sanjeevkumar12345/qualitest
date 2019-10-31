package Automation.Php_Travels;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Hotel_Search extends Registration{

	static By HotelsButton=By.xpath("//a[@class='text-center hotels active']");
	static By destination=By.xpath("//div[@id='s2id_autogen1']//a[@class='select2-choice']");
	static By checkin=By.xpath("//input[@id='checkin']");
	
	public static void Search() throws Exception {
		
		//Hotel_Button
		 driver.findElement(HotelsButton).click();
		 driver.findElement(destination).click();
		 driver.findElement(destination).sendKeys("Delhi");
		 driver.findElement(destination).sendKeys(Keys.DOWN);
		 Thread.sleep(2000);
		 driver.findElement(destination).sendKeys(Keys.ENTER);
		 
		//For Check_in
			
		driver.findElement(checkin).click();
		driver.findElement(By.xpath("//div[1]//nav[1]//div[2]")).click(); //Check_In_year
		driver.findElement(By.xpath("//div[contains(text(),'Dec')]")).click();//Check_in_month
		driver.findElement(By.xpath("//div[@class='datepicker--cell datepicker--cell-day'][contains(text(),'12')]")).click();//Check_in_date
		driver.findElement(By.xpath("//div[@id='datepickers-container']//div[2]//div[1]//div[14]")).click();//check_out_date
		driver.findElement(By.xpath("//div[contains(@class,'col o2')]//button[contains(@class,'btn btn-white bootstrap-touchspin-up')][contains(text(),'+')]")).click();//adults
		driver.findElement(By.xpath("//div[contains(@class,'col 01')]//button[contains(@class,'btn btn-white bootstrap-touchspin-up')][contains(text(),'+')]")).click();//child
		//search_button
		driver.findElement(By.xpath("//div[contains(@class,'col-md-2 col-xs-12 o1')]//button[contains(@class,'btn btn-primary btn-block')][contains(text(),'Search')]")).click();
	
	     //For_Details_button
	
		 //driver.findElement(By.xpath("//li[1]//div[1]//div[1]//div[2]//div[1]//div[3]//div[1]//div[2]//form[1]//button[1]")).click();
	
	   //Book_now_button
	
	    //driver.findElement(By.xpath("//div[@id='detail-content-sticky-nav-02']//div[3]//div[1]//div[2]//div[1]//div[2]//form[1]//button[1]")).sendKeys(Keys.ENTER);
	    } 
	
	/* public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Launchbrowser();
		
     Search();

	} */
}

