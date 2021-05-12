package seleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"F:\\Selenium_Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		// Select passenger drop-down
		driver.findElement(By.id("divpaxinfo")).click();
		// Not advised. Using to let the drop-down load before performing test
		Thread.sleep(3000L);
		
		//Perform Single Click
		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		
		
		//Perform Multiple Clicks on the adult increment counter
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000L);
		for (int i =1; i<3; i++) {
			driver.findElement(By.id("hrefIncChd")).click();
		}
	
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
