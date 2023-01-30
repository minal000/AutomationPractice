package assignments_first_day;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities2.SeleniumUtility;

public class Opencart_Register {

	public static void main(String[] args) throws InterruptedException {
		SeleniumUtility s1 = new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome", "https://www.opencart.com/index.php?route=account/register");
		
		//identify username
		WebElement userName = driver.findElement(By.id("input-username"));
		userName.sendKeys("ABC",Keys.TAB);
		//first name
		driver.switchTo().activeElement().sendKeys("Minal" , Keys.TAB);
		//last name 
		driver.switchTo().activeElement().sendKeys("Khamankar" , Keys.TAB);
		//email
		driver.switchTo().activeElement().sendKeys("xyz@gmail.com",Keys.TAB);
		//click country
		driver.findElement(By.id("input-country")).click();
		//list of countries
       List<WebElement> countries = driver.findElements(By.xpath("//*[@id='input-country']/option"));
       countries.get(241).click();
    		   
        //click on Password and type
        driver.findElement(By.id("input-password")).sendKeys("ABCDE",Keys.TAB);
        
        Thread.sleep(5000);
        
		//click on register
        driver.findElement(By.xpath("//*[@id='button-register']/button[1]")).click();
		
	}

}
