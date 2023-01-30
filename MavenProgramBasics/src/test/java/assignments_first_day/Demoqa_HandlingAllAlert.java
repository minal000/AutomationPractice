package assignments_first_day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities2.SeleniumUtility;

public class Demoqa_HandlingAllAlert {

	public static void main(String[] args) throws InterruptedException {
		SeleniumUtility s1 = new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome","https://demoqa.com/alerts");
		
//		//AlertPopup
//       driver.findElement(By.id("alertButton")).click();
//       Thread.sleep(2000);
//       System.out.println("Alert mesg : "+driver.switchTo().alert().getText());
//       driver.switchTo().alert().accept();
//       
       
       driver.findElement(By.id("timerAlertButton")).click();
       System.out.println("Time alert mesg : "+driver.switchTo().alert().getText());
       driver.switchTo().alert().accept();
       
//       //ConfirmationAlert Popup
//       driver.findElement(By.id("confirmButton")).click();
//       System.out.println("Confirm alert mesg : "+driver.switchTo().alert().getText());
//       //driver.switchTo().alert().accept();
//       driver.switchTo().alert().dismiss();
//       
//       //Prompt Alert Popup
//       driver.findElement(By.id("promtButton")).click();
//       System.out.println("Prompt alert popup : "+driver.switchTo().alert().getText());
//       driver.switchTo().alert().sendKeys("JAVA");
//       driver.switchTo().alert().accept();
//       
	}

}
