package project6_HandlingMultipleElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoblazeCategories {
public static void main(String[] args) {
	//set driver executable path
	System.setProperty("webdriver.chrome.driver",".//drivers\\chromedriver.exe");
	
	//create an instance of chrome browser
	WebDriver driver = new ChromeDriver();
	
	//maximize window
	driver.manage().window().maximize();
	
	//implicit wait
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	//enter url
	driver.get("https://www.demoblaze.com/");
	
		// TODO Auto-generated method stub

	}

}
