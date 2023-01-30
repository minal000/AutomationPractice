package assignments_first_day;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities2.SeleniumUtility;

public class SauceDemo {

	public static void main(String[] args) {
		SeleniumUtility s1 = new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome", "https://www.saucedemo.com/");
		
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//
//		driver.findElement(By.id("login-button")).click();
		
		WebElement user =driver.findElement(By.xpath("//div[@id='login_credentials']"));
		System.out.println(user.getText());
		
		String str = user.getText();
		String str1 =str.replace("Accepted usernames are:", "");
		
		String StrArray[] = str1.split("user");
		
		for(String i : StrArray) {
			 i= i+"user";
			 
			driver.findElement(By.id("user-name")).sendKeys(Keys.CONTROL,Keys.chord("a"),Keys.BACK_SPACE);
			driver.findElement(By.id("user-name")).sendKeys(i,Keys.TAB);
			driver.switchTo().activeElement().sendKeys("secret_sauce"); 
			driver.switchTo().activeElement().sendKeys(Keys.TAB,Keys.ENTER);
			System.out.println(i);
		}
		
	}

}
