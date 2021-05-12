package seleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleCom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\Selenium_Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// locator: Id
		driver.get("http://google.com");
		
		//Traversing through Parent-Child Relationship
		// Google search field
		driver.findElement(By.xpath("//div[@class = 'RNNXgb']/div/div[2]/input")).sendKeys("Hi Google");
	}

}
