package cssvalidation;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeErrorMsgPositionValidation {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", ".//drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		
		//click login
		driver.findElement(By.id("loginButton")).click();
		
		//identify error mesg
		WebElement errormsg = driver.findElement(By.cssSelector(".errormsg"));
		
		//identify username input field
		WebElement userName = driver.findElement(By.id("username"));
		
		//for error mesg position validation, get error mesg and username field 
		//x and y co-ordinate
        Point errorPosition = errormsg.getLocation();
		int error_x_cord = errorPosition.getX();
		int error_y_cord = errorPosition.getY();
		System.out.println(" error position ,cordinate of x : "+error_x_cord);
		System.out.println("error position , cordinate of y : "+error_y_cord);
		
		Point usernamePosition = userName.getLocation();
		int username_x_cord = usernamePosition.getX();
		int username_y_cord = usernamePosition.getY();
		System.out.println("username position cordinate of x : "+username_x_cord);
		System.out.println("username position of cordinate of y : "+username_y_cord);
		
		System.out.println("is error mesg getting displayed above username input field : "+(error_y_cord<username_y_cord));
		
		// TODO Auto-generated method stub

	}

}
