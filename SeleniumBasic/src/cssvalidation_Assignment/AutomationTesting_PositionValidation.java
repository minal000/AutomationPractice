package cssvalidation_Assignment;


import java.util.concurrent.TimeUnit;

import org.omg.Messaging.SyncScopeHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationTesting_PositionValidation {

	public static void main(String[] args) {
		//set the executable path of driver
		System.setProperty("webdriver.chrome.driver",".//drivers\\chromedriver.exe");
		
		//create an instance of ChromeDriver
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30 , TimeUnit.SECONDS);
		
		//enter the required url
		driver.get("https://demo.automationtesting.in/Register.html");
		
//		//explicit wait
//		WebDriverWait wait = new WebDriverWait(driver,30);
//		wait.until(ExpectedConditions.)
		
		//identify first name
		WebElement firstName = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
		
		//identify last name
		WebElement lastName = driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
		
//		//identify address
//		WebElement address = driver.findElement(By.cssSelector("textarea[ng-model='Adress']"));
		
		//for firstname position validation, get first name and last name field 
				//x and y co-ordinate
		Point firstPosition = firstName.getLocation();
        int first_X_cord = firstPosition.getX();
        int first_Y_cord = firstPosition.getY();
        System.out.println("First name x cord : +first_X_cord ");
	    System.out.println("First name y cord : +first_Y_cord");
	
        Point lastPosition = lastName.getLocation();	
	    int last_X_cord = lastPosition.getX();
	    int last_Y_cord = lastPosition.getY();
	    System.out.println("Last name x cord : "+last_X_cord);
	    System.out.println("Last name y cord : "+last_Y_cord);
	    
	   System.out.println("Is first name getting displayed on left of last name? : "+(first_X_cord<last_X_cord));
	   
//	   Point addressPosition = address.getLocation();
//	   int addressX_cord = addressPosition.getX();
//	   int addressY_cord = addressPosition.getY();
//	   System.out.println("X cord of Address : "+ addressX_cord);
//	   System.out.println("Y cord of Adddress : "+ addressY_cord);
//	   
//	   //to validate first name , get y cord of first name and address
//	   System.out.println("IS first name getting displayed on above the address ? : "+(first_Y_cord>addressY_cord));
	}

}
