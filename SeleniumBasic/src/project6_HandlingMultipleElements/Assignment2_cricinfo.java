package project6_HandlingMultipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2_cricinfo {

	public static void main(String[] args) {
		
		//set the executable path of required browser
		System.setProperty("webdriver.chrome.driver",".//drivers\\chromedriver.exe");
		
		//create an instance of chromedriver
		WebDriver driver = new ChromeDriver();
		
		//maximize window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//enter the url 
		driver.get("https://www.cricinfo.com");
		
		//url validation
		String actualurl = driver.getCurrentUrl();
		System.out.println("url validation : "+actualurl.equals("https://www.cricinfo.com"));
		
		List<WebElement> menu = driver.findElements(By.cssSelector(".ds-bg-fill-navbar>div>div>div:nth-of-type(2)>div>div.ds-popper-wrapper>a"));
		System.out.println(" count of menu : "+menu.size());
		
		for(int i=1 ; i<menu.size() ; i++) {
			
			System.out.println(menu.get(i).getText());
		}
		
		
		// TODO Auto-generated method stub

	}

}
