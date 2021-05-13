package seleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAlertsHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"F:\\Selenium_Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// locator: Id
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Generate alert from UI on screen
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Romil");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='alertbtn']")).click();
		
		
		//Grab text of alert
		System.out.println(driver.switchTo().alert().getText());
		//Accept the alert
		driver.switchTo().alert().accept();
		
		// Two button alert on screen
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Romil");
		System.out.println(driver.switchTo().alert().getText());
		driver.findElement(By.cssSelector("input[id='confirmbtn']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		
	}

}
