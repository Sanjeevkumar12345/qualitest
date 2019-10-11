package Automation.Php_Travels;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Hotel_Booking extends Hotel_Search 
{
	
	//Booking_information_table
	
	static By cookies=By.xpath("//*[@id=\"cookyGotItBtn\"]");
	static By Title=By.xpath("//*[@id=\"title\"]");
	static By Firstname=By.xpath("//input[@id='first_name']");
	static By Lastname=By.xpath("//input[@id='last_name']");
	static By Emailid=By.xpath("//div[@class='col-md-6']//input[@id='email']");
	static By Country=By.xpath("//select[@id='country_code']");
	static By click=By.xpath("//*[@id=\"select2-drop\"]/ul/li/ul/li/div/span");
	static By Mobileno=By.xpath("//input[@id='phone_number']");
	
	
	//Payment_Details
	
	static By Name_on_card=By.xpath("//input[@id='cardHolderName']");
	static By Card_no=By.xpath("//input[@id='cardNumber']");
	static By Expiry_month=By.xpath("//select[@id='month']");
	static By Expiry_year=By.xpath("//select[@name='year']");
	static By Security_no=By.xpath("//input[@id='cardCVC']");
	static By Complete_Booking=By.xpath("//*[@id='completeBooking']");
	

public static void details() throws Exception{	
	
	//Booking_info
	
	driver.findElement(By.xpath("//*[@id=\"thhotels\"]/div[1]/div[2]/div[2]/a")).click();
	driver.findElement(Title).click();
	driver.findElement(Title).sendKeys(Keys.ENTER);
	driver.findElement(Firstname).sendKeys(prop.getProperty("First_name1"));
	driver.findElement(Lastname).sendKeys(prop.getProperty("Last_name1"));
	driver.findElement(Emailid).sendKeys(prop.getProperty("Email_id1"));
	
	driver.findElement(Country).click();
	driver.findElement(Country).sendKeys(prop.getProperty("Country"));
	driver.findElement(Mobileno).click();
	driver.findElement(Mobileno).sendKeys(prop.getProperty("Mobile_no1"));
	
	
	//Payment_details
	
	driver.findElement(Name_on_card).sendKeys(prop.getProperty("Name_on_Card"));
	driver.findElement(Card_no).sendKeys(prop.getProperty("Card_Number"));
	driver.findElement(Expiry_month).sendKeys(prop.getProperty("Expiration_month"));
	driver.findElement(Expiry_year).click();
	driver.findElement(Expiry_year).sendKeys(prop.getProperty("Expiration_year"));
	driver.findElement(Expiry_year).sendKeys(Keys.ENTER);
	driver.findElement(Security_no).sendKeys(prop.getProperty("Security_Code"));
	
	
	//complete_booking
	Thread.sleep(2000);
	driver.findElement(cookies).click();
	Thread.sleep(2000);
	driver.findElement(Complete_Booking).click();
	
}

public static void main(String[] args) throws Exception {
	// TODO Auto-generated method stub
	Launchbrowser();
	
 Search();
 details();

}
}