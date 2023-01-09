package keyboardAndmouseOperator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardOpt5 {

	public static void main(String[] args) throws InterruptedException {
		//set the executable path of driver
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		//create an instance of ChromeDriver
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//enter the url
		driver.get("https://www.flipkart.com/");
		
		//to escape login popup
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		
		Thread.sleep(1500);
		
		//to refresh
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.F5);
		
	
	}
/**
 * possible ways to refresh the browser
 * 1. driver.navigate().refresh();
 * 2. sendKeys(Keys.F5)
 * 3. by hitting same url again
 * 4. ctrl+R
 */
	
	
}
