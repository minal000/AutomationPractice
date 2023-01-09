package project6_HandlingMultipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_Google {

	public static void main(String[] args) {
		//set the executable path for driver
		System.setProperty("webdriver.chrome.driver", ".//drivers\\chromedriver.exe");
		
		//create an instance of chrome browser
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//enter url
		driver.get("https://www.google.com");
		
		//type selenium in search input field
	//	driver.findElement(By.name("q")).sendKeys("Selenium");   //directly identifying here
		
		//links present in Google search page
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Links count : "+links.size());
		
		List<WebElement> inputFields = driver.findElements(By.tagName("input"));
		System.out.println("input field count : "+inputFields.size());
		
		inputFields.get(0).sendKeys("Selenium");
		//get suggestion counts
		
		
		/**
		 * use findElements(By) -- this will help us to identify multiple element from 
		 *                         application and returns List<WebElement>
		 *                          
		 */
		// TODO Auto-generated method stub

	}

}
