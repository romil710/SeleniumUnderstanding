package seleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandlingCalendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"F:\\Selenium_Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// locator: Id
		driver.get("http://spicejet.com");
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
		Thread.sleep(3000);
		//Calendar current date has a different class name (-state-active) to it. You can only choose current date using this css path and class name.
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		//Validating UI element visibility
		//Click on round trip button to enable return date calendar element
		driver.findElement(By.cssSelector("input[value ='RoundTrip']")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).isEnabled(), true);
		
		// This above method has weird behavior to it and hence sometimes it may return false
		
		//Second workaround for Validating UI element visibility
		driver.findElement(By.cssSelector("input[value ='RoundTrip']")).click();
		//Observing the element for value change on enable/disable.
		// In this case style attribute opacity changes from 0.5 to 1 when enabled.
		Assert.assertEquals(driver.findElement(By.id("Div1")).getAttribute("style").contains("1") , true);
	}

}
