package Automation.Php_Travels;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class Registration extends Launch{
	static By Firstname=By.xpath("//input[@placeholder='First Name']");
	static By Lastname=By.xpath("//input[@placeholder='Last Name']");
	static By Mobileno=By.xpath("//input[@placeholder='Mobile Number']");
	static By Emailid=By.xpath("//input[@placeholder='Email']");
	static By Password=By.xpath("//input[@placeholder='Password']");
	static By ConfirmPassword=By.xpath("//input[@placeholder='Confirm Password']");
    static By SignUp=By.xpath("//button[@class='signupbtn btn_full btn btn-success btn-block btn-lg']");
	

    public static void Register() {
	
	driver.findElement(Firstname).sendKeys(prop.getProperty("First_name"));
	driver.findElement(Lastname).sendKeys(prop.getProperty("Last_name"));
	driver.findElement(Mobileno).sendKeys(prop.getProperty("Mobile_no"));
	driver.findElement(Emailid).sendKeys(prop.getProperty("Email_id"));
	driver.findElement(Password).sendKeys(prop.getProperty("Password"));
	driver.findElement(ConfirmPassword).sendKeys(prop.getProperty("Confirm_Password"));
	driver.findElement(SignUp).sendKeys(Keys.ENTER);
}

	/* public static void main(String[] args) throws Exception {
		 //TODO Auto-generated method stub
		Launchbrowser();
		Signup();
        Register();

	} */
}


