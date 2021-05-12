package seleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create Driver Object
		
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\Selenium_Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// locator: Id
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("Test email");
		
	
	}
}
