package switching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities2.SeleniumUtility;

public class HandlingPromptPopup {

	public static void main(String[] args) {
		SeleniumUtility s1 = new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_propmt");
		//as required element is present inside the frame,so need to switch our control inside frame first
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		System.out.println("Alert text mesg is : "+driver.switchTo().alert().getText());
		//to perform another action on alert, we need to again switch our control to the alert
		driver.switchTo().alert().sendKeys("Tester");
		//to perform another action on alert, we need to  again switch our control to the alert
		driver.switchTo().alert().accept();
	//	driver.switchTo().alert().dismiss();
		
		

	}

}
