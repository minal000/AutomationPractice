package conceptof_xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assig_Flipkart {

	public static void main(String[] args) {
      //set the executable path of driver
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");

		//create an instance of chromedriver
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//get the url
		driver.get("https://www.flipkart.com/samsung-mobile-store?otracker=nmenu_sub_/Electronics_0_Samsung");
		
		//locator for samsung galaxy F13 price(nightsky)		
		WebElement samF = driver.findElement(By.xpath("//div[div[div[a[text()='SAMSUNG Galaxy F13 (Nightsky Green, 64 GB)']]]/div[3]/div/div[1]"));
		System.out.println("price of samsung galaxy F13 : "+samF.getText());
				
//		//locator for samsung galaxy F13(waterfall blue)
//		WebElement s = driver.findElement(By.xpath("//div[div[a[text()='SAMSUNG Galaxy F13 (Waterfall Blue, 64 GB)']]]/div[3]"));
//		System.out.println("price of samsung galaxy F13 : "+s.getText());
		
		//close the browser
		//driver.close();
	}

}
