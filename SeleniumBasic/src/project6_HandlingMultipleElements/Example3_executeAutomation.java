package project6_HandlingMultipleElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_executeAutomation {

	public static void main(String[] args) {
		
		//set the executable path of required web browser
		System.setProperty("webdriver.chrome.driver",".//drivers\\chromedriver.exe");
		
		//create an instance of chrome browser
		WebDriver driver = new ChromeDriver();
		
		//maximise the window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//get the required url 
		driver.get("https://demosite.executeautomation.com/Login.html");
		
		//type username
		driver.findElement(By.name("UserName")).sendKeys("execution");
		
		//type password
		driver.findElement(By.name("Password")).sendKeys("admin");
		
		//click login
		//driver.findElement(By.name("Login")).click();   //click won't work here
		driver.findElement(By.cssSelector("input[name='Login']")).click();
		
		
		
		
		
		
		
		/**
		 * Whenever  normal locator like ,id,name,linkText, tagName, className and partialLinkText
		 * won't work or not unique or not present
		 * then you have to use cssSelector.
		 */
		
		
		// TODO Auto-generated method stub

	}

}
