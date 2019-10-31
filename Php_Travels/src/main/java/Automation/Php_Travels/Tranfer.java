
    
package Automation.Php_Travels;


import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class Tranfer extends Launch {
    //Picup_location and Drop_lection
    static By Transfer=By.xpath("//a[contains(text(),'Transfer')]");
    static By picup_loction=By.xpath("//body[@class='with-waypoint-sticky']/div[@class='body-inner']/div[@class='main-wrapper scrollspy-action']/div[@class='slick-hero-slider-wrapper bg-light']/div[@class='hero-form-absolute']/div[@class='container']/div[@class='row gap-40 gap-lg-60 align-items-center justify-content-lg-end']/div[@class='col-12 col-lg-12 col-xl-12']/div[@class='hero-form-inner text-white']/div[@class='menu-horizontal-wrapper-02']/div[@class='tab-content']/div[@id='transfer']/div[@class='tab-inner menu-horizontal-content']/div[@class='form-search-main-01']/form/div[@class='form-inner']/div[@class='row gap-10 mb-15']/div[1]");
    static By picup_loction1=By.xpath("//*[@id=\"carlocations_chosen\"]/div/div/input");
    
    //picup_date_Xpaths
    static By pick_date=By.xpath("//input[@id='dropdate']");
    static By month_year = By.xpath("//div[3]//nav[1]//div[2]");
    static By montbin_cal = By.xpath("//div[contains(text(),'Dec')]");
    static By select_day = By.xpath("//div[@class='datepicker--cell datepicker--cell-day'][contains(text(),'26')]");
    
    //depart_time_detauls
    static By click_time=By.xpath("//*[@id=\"airDatepickerRange-flight\"]/div[2]/div/div[2]/div/a/span");
    static By ip_time = By.xpath("//div[@class='chosen-container chosen-container-single chosen-with-drop chosen-container-active']//input[@class='chosen-search-input']");
    static By res_time = By.xpath("//div[@class='hero-form-absolute']//div[3]//div[1]//div[1]//div[2]//div[1]//div[2]//div[1]//div[1]//ul[1]//li[4]");
    
    //return_date_xpath
    static By depart_date= By.xpath("//input[@id='returndate']");
    static By click_dat = By.xpath("//div[4]//nav[1]//div[2]");
    static By date_year = By.xpath("//div[@class='datepicker--months datepicker--body active']//div[@class='datepicker--cell datepicker--cell-month'][contains(text(),'Dec')]");
    static By depart_day= By.xpath("//div[4]//div[1]//div[1]//div[2]//div[29]");
    
    //return_time_xpath
    static By timeclick = By.xpath("//div[@id='transfer']//div[4]//div[1]//div[1]//div[2]//div[1]//div[2]//div[1]//a[1]//span[1]");
    static By timeinput = By.xpath("//li[contains(text(),'01:00')]");
   // static By Resulttime = By.xpath("//div[@class='col-md-2 col-xs-12']//button[@class='btn-primary btn btn-block'][contains(text(),'Search')]");
    
    //search_button
    static By search = By.xpath("(//button[contains(text(),'Search')])[4]");
    
    public static void Fillcardetails() throws InterruptedException
    {
        
    // picup_loction and drop location
    driver.findElement(Transfer).click();
    driver.findElement(picup_loction).click();
    driver.findElement(picup_loction1).sendKeys(prop.getProperty("cityname"));
    driver.findElement(picup_loction1).sendKeys(Keys.ENTER);
       
     //pick_date
     driver.findElement(pick_date).click();
     driver.findElement(month_year).click();
     Thread.sleep(1000);
     driver.findElement(montbin_cal).click();
     driver.findElement(select_day).click();
     
     //dapart time
     driver.findElement(click_time).click();
     driver.findElement(ip_time).sendKeys("30");
     driver.findElement(res_time).click();
        
    //return date
    driver.findElement(depart_date).click();
    driver.findElement(click_dat).click();
    driver.findElement(date_year).click();
    driver.findElement(depart_day).click();
        
    //return_time
    driver.findElement(timeclick).click();
    driver.findElement(timeinput).click();
  //  driver.findElement(Resulttime).click();//search
    Thread.sleep(2000);
     
     //search
     driver.findElement(search).click();
     
     
    }


/*    public static void main(String[] args) throws Exception {
         Launchbrowser();
         Fillcardetails();


    } */ 


}
 







