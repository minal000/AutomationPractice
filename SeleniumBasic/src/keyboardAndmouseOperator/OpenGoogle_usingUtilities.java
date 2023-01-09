package keyboardAndmouseOperator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class OpenGoogle_usingUtilities {

	public static void main(String[] args) {
		SeleniumUtility s1 = new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome","https://www.google.com");
		
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
	}

}
