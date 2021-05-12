package seleniumIntro;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create Driver Object
		
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\Selenium_Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://login.salesforce.com");
		
		//By Id
		driver.findElement(By.id("username")).sendKeys("romil tiwari");
		driver.findElement(By.id("username")).clear();
		
		//By xpath
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("romil tiwari");
		
		//By css
		driver.findElement(By.cssSelector("#Login")).click();
		
		//Printing error text from screen
		String errorText = driver.findElement(By.className("loginError")).getText();
		System.out.println(errorText);
		
//		//Customized XPath
		driver.findElement(By.xpath("//a[@id='forgot_password_link']")).click();
		
		//Customized Xpath using regular expression
		driver.findElement(By.xpath("//input[contains(@type,'email')]")).sendKeys("Hi this is again romil");
		
//		//Customized CSS
//		driver.findElement(By.cssSelector("input#id")).sendKeys("Hi this is silky");
		
//		//Customized CSS using regular expression
//		driver.findElement(By.cssSelector("input[type*='submit']")).clear();	
	}
}
