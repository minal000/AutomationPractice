package keyboardAndmouseOperator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardOpt3 {

	public static void main(String[] args) {
		//set the executable path of driver
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		//create an instance of ChromeDriver
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//enter the url
		driver.get("https://demo.automationtesting.in/Register.html");
		
		//identify first name field
		WebElement firstName = driver.findElement(By.cssSelector("input[placeholder='First Name']"));

		//type first name as admin and control+a
		firstName.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"));   //type admin and select all
		
		//in first name field use control+c
		firstName.sendKeys(Keys.chord(Keys.CONTROL,"c"));    //copy the content
		
		                  //or 
		
//		firstName.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"));
		
		//identify last name field and control+v
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
		//paste the first name into last name field in above line
		
	}

}
