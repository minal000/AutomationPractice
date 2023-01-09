package cssvalidation_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTesting_cssValidation {

	public static void main(String[] args) {
		
		//set the executable path of driver
		System.setProperty("webdriver.chrome.driver",".//drivers\\chromedriver.exe");
		
		//create an instance of ChromeDriver
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//enter the required url
		driver.get("https://demo.automationtesting.in/Register.html");
		
		
		//

	}

}
