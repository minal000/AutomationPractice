package assignments_first_day;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities2.SeleniumUtility;

public class Flipkart_assignment {

	public static void main(String[] args) {
		SeleniumUtility s1 = new SeleniumUtility();
		 WebDriver driver = s1.setUp("chrome", "https://www.flipkart.com/");
		//to remove login popup
		 driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		 List<WebElement> mainMenu = driver.findElements(By.cssSelector("div._37M3Pb>div"));
		 System.out.println("count of Main menu : "+mainMenu.size());
		 
		 for(int i=0; i<mainMenu.size() ; i++) {
			 System.out.println(mainMenu.get(i).getText());
		 }
		 Actions act = new Actions(driver);
		 
		for (int i=0 ; i<mainMenu.size(); i++) {
			act.moveToElement(mainMenu.get(i)).perform();
		}

		for(int i=0; i<mainMenu.size() ; i++) {
			act.moveToElement(mainMenu.get(i)).perform();
			System.out.println("SubMenu from Main menu : "+mainMenu.get(i).getText());
			
		System.out.println("-------------------------------");
		}
	}

}
