package seleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"F:\\Selenium_Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		//Open Drop down list for departure city and select Bengaluru as departure city
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value = 'BLR']")).click();
		
		
		// Destination city automatically loads when you select any departure city.
		// If you don't select any city in departure then destination list will be empty.
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		//Here in Xpath we are selecting 2nd element as there will be multiple occurrences of Bombay in both Departure list and Destination List and hence
		// Selenium will always select the first one.
		
		
		//Parent-Child tag to identify unique elements
		// Syntax : dirver.findElement(By.xpath(//parentTag[@id = 'parent_value'] //childTag[@id='child_value']))
		driver.get("https://spicejet.com");
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTXT'] //a[contains(text(),'Bengaluru (BLR)')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTXT'] //a[contains(text(),'Chennai (MAA)')]")).click();
	}
}
