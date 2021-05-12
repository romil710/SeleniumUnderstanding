package seleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Selenium_Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://spicejet.com");
		
		//Count number of check-boxes on screen
		System.out.println("Number of checkboxes on screen : "+driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		
		//Selecting Armed Forces check-box
		//id* here means any id which has something IndArm in it should be selected. Not advisable
		driver.findElement(By.cssSelector("input[id*='IndArm']")).click();
		
		//check if check-box is selected
		Boolean status = driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected();
		if(status) {
			System.out.println("Check box is selected");
		} else {
			System.out.println("Check box is not selected");
		}
		
		
	}

}
