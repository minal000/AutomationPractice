package project3_locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example4_WebDriverWait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".//\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//implicit wait -- Browser instance will get time to wait for element after this
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https:/demo.actitime.com/login.do");
		
		System.out.println("Page title is : "+driver.getTitle());
		
		//type username as admin ---> 0-30 sec
		driver.findElement(By.id("username")).sendKeys("admin");
		
		//type password as manager ---> 0-30 sec
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		//click on login button 0-30 sec
		driver.findElement(By.id("loginButton")).click();
		
		//creat an instance of WebDriverWait
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleContains("actiTIME - Login"));
	
		System.out.println("Home page title is : "+driver.getTitle());
		
		//click on logoutlink , 0-30 sec
		driver.findElement(By.id("logoutLink")).click();   //it will give no such element exception, as  our automation script speed is not in sync with application
		
		driver.close();
		
		// TODO Auto-generated method stub

	}

}
