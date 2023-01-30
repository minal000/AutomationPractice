package assignments_first_day;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities2.SeleniumUtility;

public class Jquery {

	public static void main(String[] args) {
	SeleniumUtility s1 =  new SeleniumUtility();
	WebDriver driver = s1.setUp("chrome","https://jqueryui.com/");
	//click on sortable
	driver.findElement(By.xpath("//*[text()='Sortable']")).click();
	//taking control inside the frame from main page using index
	driver.switchTo().frame(0);
			
	List<WebElement> item = driver.findElements(By.cssSelector("ul#sortable>li"));
	System.out.println("Count of items : "+item.size());
	
	for(int i=0 ; i< item.size()-1 ; i++) {
		s1.performDragAndDrop(item.size()-1, item.get(i));
		
	}
		
	

	}


}
