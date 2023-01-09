package switchstatements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class Assig_AutomationTesting {

	public static void main(String[] args) {
		SeleniumUtility s1 = new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome","https://demo.automationtesting.in/Register.html");
		
		//identify firstName field
		WebElement firstName = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
		//type firstName
		firstName.sendKeys("Minal",Keys.TAB);
		//switched to lastName
		driver.switchTo().activeElement().sendKeys("Khamankar",Keys.TAB);
		//switched to address
		driver.switchTo().activeElement().sendKeys("Yavatmal",Keys.TAB);
		//swiched to email
		driver.switchTo().activeElement().sendKeys("xyz@gmail.com",Keys.TAB);
		//switched to phone
		driver.switchTo().activeElement().sendKeys("9876543210",Keys.TAB);
		//click on female radio button
		driver.findElement(By.cssSelector("input[value='FeMale']")).click();
		//click on cricket
		driver.findElement(By.cssSelector("input[value='Cricket']")).click();
		//click on language
		//driver.findElement(By.id("msdd")).click();
		//list of language
//		List<WebElement> language = driver.findElements(By.cssSelector("ul.ui-autocomplete >li"));
//         System.out.println("Size of languages present in dropdown "+language.size());
//         language.get(3).click();
//         language.get(8).click();
		
         //click skill
         driver.findElement(By.id("Skills")).click();
         driver.findElement(By.xpath("//*[text()='APIs']")).click();
         
         //click on country
         driver.findElement(By.id("countries")).click();
         driver.findElement(By.xpath("//*[text()='India']")).click();
         
         //click yearBox
         driver.findElement(By.id("yearbox")).click();
         driver.findElement(By.xpath("//*[text()='1994']")).click();
         
         //click on months
         driver.findElement(By.cssSelector("select[placeholder='Month']")).click();
         driver.findElement(By.cssSelector("select[placeholder='Month']>option:nth-child(6)")).click();
         
         //click on date
         driver.findElement(By.id("daybox")).click();
         driver.findElement(By.xpath("//*[text()='16']")).click();
         
         //click on password
         driver.findElement(By.id("firstpassword")).sendKeys("12345",Keys.TAB);
         
         //driver.switchTo().activeElement().sendKeys("12345",Keys.TAB);
         
         //confirm password
         driver.switchTo().activeElement().sendKeys("12345",Keys.ENTER);
		
	}

}
