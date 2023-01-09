package calender_Handling;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

	public static void main(String[] args) {
		//set the executable path of driver
		System.setProperty("webdriver.chrome.driver",".//drivers\\chromedriver.exe");
		
		//create an instance of chromeDriver
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//enter the required url
		driver.get("https://www.makemytrip.com/");
		
		//to handle offer popup
		try {
			driver.switchTo().frame(driver.findElement(By.id("webklipper-publisher-widget-container-notification-frame")));
			driver.findElement(By.cssSelector(".close")).click();
			driver.switchTo().defaultContent();
			driver.findElement(By.cssSelector("li[data-cy='account']")).click();
		}catch(NoSuchElementException e){
			System.out.println(e);
			
		}
		//identify departure date and click on it
		driver.findElement(By.cssSelector("")).click();
				
		//select date from next month
		driver.findElement(By.cssSelector("")).click();

	}

}
