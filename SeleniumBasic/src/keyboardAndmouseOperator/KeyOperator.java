package keyboardAndmouseOperator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyOperator {

	public static void main(String[] args) {
		//set the executable path of driver
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		
		//create an instance of chromedriver
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//enter the url
		driver.get("https://www.flipkart.com/");
		
		//using Escape of keyboard to avoid login popup
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		

	}

}
