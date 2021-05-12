package seleniumIntro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Selenium_Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); 
		
		// Send desired keywords to search for country
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		
		// Extract all options based on keywords entered. You need a generic path using parent-child traversing to get the list of items.
		List<WebElement> options = driver.findElements(By.cssSelector("li[class= 'ui-menu-item'] a"));
		for(WebElement option : options) {
			if(option.getText().equals("India")) {
				option.click();
				break;
			} else {
				System.out.println("Country not found for desired search");
			}
		}
		
	}

}
