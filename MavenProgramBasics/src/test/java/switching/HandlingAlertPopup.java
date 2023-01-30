package switching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities2.SeleniumUtility;

public class HandlingAlertPopup {

	public static void main(String[] args) {
     SeleniumUtility s1 = new SeleniumUtility();
     WebDriver driver = s1.setUp("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
     //as the required element is present inside the frame, so need to switch our control inside frame first
     driver.switchTo().frame("iframeResult");  //by using name
     //click on try it
     driver.findElement(By.xpath("//button[text()='Try it']")).click();
     //Thread.sleep(2000);   // while handling frame  not use it , as it may throw exception
     System.out.println("Alert text mesg is : "+driver.switchTo().alert().getText());
     //To perform another action on alert, we need to again switch our control to the alert
     driver.switchTo().alert().accept();

	}

}
