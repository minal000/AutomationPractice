package keyboardAndmouseOperator;

import java.util.concurrent.TimeUnit;

import javax.swing.plaf.basic.BasicTreeUI.SelectionModelPropertyChangeHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOpt4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//instance of action class
		Actions act = new Actions(driver);
		
		driver.findElement( By.xpath("//a[text()='Create New Account')")).click();

		WebElement userName = driver.findElement(By.name("firstname"));
		userName.sendKeys("admin");
	    //userName.sendKeys(Keys.chord(Keys.CONTROL,"a"));
	       //or
		act.doubleClick(userName).perform();   //by combining mouse and keybord operation
		userName.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		
		driver.findElement(By.name("lastname")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
		
		
		
	}

}
