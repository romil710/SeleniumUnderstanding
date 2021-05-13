package AssignmentTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClearTripAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");

		Select ad = new Select(driver.findElement(By.cssSelector("#Adults")));

		ad.selectByValue("4");

		Select ad1 = new Select(driver.findElement(By.cssSelector("#Childrens")));

		ad1.selectByValue("2");

		Select ad2 = new Select(driver.findElement(By.cssSelector("#Infants")));

		ad2.selectByValue("1");

		driver.findElement(By.cssSelector(".icon.ir.datePicker")).click();

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

		driver.findElement(By.cssSelector(".rArrow.blue")).click();

		driver.findElement(By.xpath("//input[@name=\"airline\"]")).sendKeys("Indigo");

		driver.findElement(By.cssSelector("#SearchBtn")).click();

		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
	}

} 
