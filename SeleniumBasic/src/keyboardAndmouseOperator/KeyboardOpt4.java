package keyboardAndmouseOperator;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardOpt4 {

	public static void main(String[] args) throws InterruptedException {
		//set the executable path of driver
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
				
		//create an instance of ChromeDriver
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//get the url
		driver.get("https://www.flipkart.com/");
		
		//using Escape of keyboard to avoid login popup
		WebElement element = driver.findElement(By.xpath("body"));
		element.sendKeys(Keys.ESCAPE);
		
//		//scorlling using page down button
//		for(int i=0 ; i<10 ; i++) {
//			element.sendKeys(Keys.PAGE_DOWN);
//			Thread.sleep(1500);
//		}
		
		Thread.sleep(1500);
		//scrolling directly go to bottom page
		element.sendKeys(Keys.chord(Keys.CONTROL,Keys.END));
		
		//scrolling directly go to top page
		element.sendKeys(Keys.chord(Keys.CONTROL,Keys.HOME));

	}

}
