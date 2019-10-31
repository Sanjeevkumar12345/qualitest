package Automation.Php_Travels;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage extends Launch{
		static By MyAccount=By.xpath("//div[@class='dropdown dropdown-login dropdown-tab']//a[@id='dropdownCurrency']");
		static By Signupbutton=By.xpath("//a[@class='dropdown-item tr']");
		static By loginbutton=By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Login')]");
		static By hotel=By.xpath("//li[@class='active text-center']//a[@class='text-center']");
		static By city_click= By.xpath("//span[contains(text(),'Search by Hotel or City Name')]");
		static By city_Text= By.xpath("//div[@id='s2id_location']//a[@class='select2-choice select2-default']");

 		public static void Signup() {
		driver.findElement(MyAccount).click();
		driver.findElement(Signupbutton).click();
	}
	
	/*public static void main(String args[])throws Exception{
		Launchbrowser();
		Signup();
		login();
	}*/
}

