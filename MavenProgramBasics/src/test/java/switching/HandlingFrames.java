package switching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities2.SeleniumUtility;

public class HandlingFrames {

	public static void main(String[] args) {
		SeleniumUtility util = new SeleniumUtility();
		WebDriver driver = util.setUp("chrome", "https://jqueryui.com/");
		
		//click on droppable
		driver.findElement(By.xpath("//*[text()='Droppable']")).click();
		
		//taking control inside the frame from main page using index
		driver.switchTo().frame(0);
		
//		//taking control inside the frame frame from main page using WebElement
//		WebElement frame = driver.findElement(By.cssSelector(".demo-frame"));
//		driver.switchTo().frame(frame);
		
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		//SeleniumUtility.action.dragAndDrop(src, target).build().perform();
		 util.performDranAndDrop(src, target);  //using method inside utility
		 //coming back to main page from the  frame
		 driver.switchTo().defaultContent();
		 driver.findElement(By.cssSelector(".logo")).click();
		 
		 //util.cleanup();		 
		 
		
	}

}
