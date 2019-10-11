package Automation.Php_Travels;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	public static WebDriver driver;
	public static Properties prop=new Properties();
public static void Launchbrowser() throws IOException  {
System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (2)\\chromedriver.exe");
driver= new ChromeDriver();

FileInputStream fis=new FileInputStream("D:\\eclipse-workspace\\Php_Travels\\src\\main\\java\\Files\\Base.properties");
prop.load(fis);
driver.get(prop.getProperty("url"));
driver.manage().window().maximize();
}
/*public static void main(String args[]) throws IOException
{
	Launchbrowser();
}*/

}
