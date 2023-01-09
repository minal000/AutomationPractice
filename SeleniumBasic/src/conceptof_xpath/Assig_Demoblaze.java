package conceptof_xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assig_Demoblaze {

	public static void main(String[] args) {
		//set the executable path for driver
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		
		//create an instance of chromedriver
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//enter the url
		driver.get("https://www.demoblaze.com/");
		
		//locator for samsung galaxy 6 price
		//WebElement samPrice = driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']//following::h5[1]"));
		//System.out.println("Price of Samsung galaxy 6 : "+samPrice.getText());
		
		WebElement samPrice = driver.findElement(By.xpath("//div[h4[a[text()='Samsung galaxy s6']]]/h5"));
		System.out.println("Price of Samsung galaxy 6 : "+samPrice.getText());
		
		//close the browser
		driver.close();
	}

}
