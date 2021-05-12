package seleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomateWebElementsOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\Selenium_Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Setting up dropdown object using webelement on UI.
		WebElement staticDropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropDown);
		
		//SelectByIndex
		dropdown.selectByIndex(1);
		String text = dropdown.getFirstSelectedOption().getText();
		System.out.println("Option selected is " +text);
		
		//Select By Visible Text
		dropdown.selectByVisibleText("AED");
		String text1 = dropdown.getFirstSelectedOption().getText();
		System.out.println("Option selected is " +text1);
		
		//Select By Web Element Value
		dropdown.selectByValue("USD");
		String text2 = dropdown.getFirstSelectedOption().getText();
		System.out.println("Option selected is " +text2);
	}

}
