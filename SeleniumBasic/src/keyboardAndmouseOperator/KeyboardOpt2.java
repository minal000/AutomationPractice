package keyboardAndmouseOperator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardOpt2 {

	public static void main(String[] args) throws InterruptedException {
		//set the executable path of driver
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		//create an instance of ChromeDriver
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//enter url
		driver.get("https://demo.actitime.com/login.do");
		
		//login in actitime application using Enter key
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
		
		

	}

}
