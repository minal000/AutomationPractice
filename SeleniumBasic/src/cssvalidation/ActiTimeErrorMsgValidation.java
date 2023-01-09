package cssvalidation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeErrorMsgValidation {

	public static void main(String[] args) {
		
		//set the executable path of driver
		System.setProperty("webdriver.chrome.driver", ".//drivers\\chromedriver.exe");
		
		//create a new instance of ChromeDriver
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// enter the required url
		driver.get("https://demo.actitime.com/login.do");
		
		//click login
		driver.findElement(By.id("loginButton")).click();
		
		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.textToBe(By.cssSelector(".errormsg"), "Username or Password is invalid. Please try again."));
		
		//identify error mesg
		WebElement errormsg = driver.findElement(By.cssSelector(".errormsg"));
		
		/**
		 * validation-
		 *          error mesg color : red
		 *          font size : 13px
		 * 
		 */
		String errorColorInRGBA = errormsg.getCssValue("color");    //color is property name
		String errorFontSize = errormsg.getCssValue("font-size");
		System.out.println("error mesg color code : "+errorColorInRGBA);
		System.out.println("error mesg font size : "+errorFontSize);
		// TODO Auto-generated method stub

	}

}
