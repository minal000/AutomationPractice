package project3_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3 {

	public static void main(String[] args) {
		//setup the required driver executable path using - System.setProperty(String Key, String value)
				System.setProperty("webdriver.chrome.driver",".//drivers\\chromedriver.exe");
				//create an instance of required browser driver class
				//example for runtime polymorphism - Inheritance, upcasting and overridding
				WebDriver driver = new ChromeDriver();
				//enter the required url
				driver.get("https:/demo.actitime.com/login.do");
				//type user name as admin
				/**
				 * identify usename input field by using findElement method of WebDriver which
				 * returns : WebElement
				 * parameter : By --> predefined class having several static methods to locate the element from application
				 *                    these method are logically know as Locators in selenium
				 *                    
				 */
				WebElement usernameInputfield = driver.findElement(By.id("username"));
				
			     /**
				 * once you identify the element perform required action on it
				 * click --> click()
				 * type ---> sendKeys("");
				 * delete existing text  --> clear(); 
				 */
				usernameInputfield.sendKeys("admin");
				
				/*identify password field*/
				WebElement passwordInputField = driver.findElement(By.name("pwd"));
				passwordInputField.sendKeys("manager");
				
				/*identify login button*/
				WebElement loginBtn = driver.findElement(By.id("loginButton"));
				/*click on login button*/
				loginBtn.click();
				
				/* identify logout button*/
				WebElement logoutBtn = driver.findElement(By.id("logoutButton"));
				logoutBtn.click();     //it will give you NoSuchElement Exception, as our automation script speed is not in sync with application
				
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

}
