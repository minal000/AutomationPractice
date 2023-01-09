package keyboardAndmouseOperator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOpt1 {

	public static void main(String[] args) {
		
	//set the executable path for driver
	System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
	
	//create an instance of chrome Browser
	WebDriver driver = new ChromeDriver();
	
	//maximize the window
	driver.manage().window().maximize();
	
	//implicit wait
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	//enter the url
	driver.get("https://demo.automationtesting.in/Register.html");
	
	//identify the first name inputfield
	WebElement username = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
	username.sendKeys("Minal");
	
	//create an instance of Action class by passing required browser instance to its constructor
	Actions act = new Actions(driver);
	
	//With the help of action class instance perform approprite action
	act.moveToElement(username).doubleClick().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	
	//Paste it in last name field
	WebElement lastname = driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
	act.moveToElement(lastname).doubleClick().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		

	}

}
