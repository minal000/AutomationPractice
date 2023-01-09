package project3_locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_1 {

	public static void main(String[] args) {
		//setup the required driver executable path using - System.setProperty(String Key, String value)
		System.setProperty("webdriver.chrome.driver",".//drivers\\chromedriver.exe");
		//create an instance of required browser driver class
		//example for runtime polymorphism - Inheritance, upcasting and overridding
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//enter the required url
		driver.get("https:/demo.actitime.com/login.do");
		
		System.out.println("Login page title : "+driver.getTitle());
		//type user name as admin
		driver.findElement(By.id("username")).sendKeys("admin");
				/*type password as manager*/
		driver.findElement(By.name("pwd")).sendKeys("manager");
	     /*click on login button*/
		driver.findElement(By.id("loginButton")).click();
		/*click on logout button*/
		driver.findElement(By.id("logoutLink")).click();  //it will give you NoSuchElement Exception, as our automation script speed is not in sync with application
		
		/*close browser*/
		driver.close();
		
		
		
		/**
		 * open the chrome browser
		 * enter actitime url
		 * type user name as admin
		 * type password as manager
		 * click on login button
		 */
// TODO Auto-generated method stub

}



		// TODO Auto-generated method stub

	}


