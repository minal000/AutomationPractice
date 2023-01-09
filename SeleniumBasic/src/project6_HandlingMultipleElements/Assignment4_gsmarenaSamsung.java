package project6_HandlingMultipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4_gsmarenaSamsung {

	public static void main(String[] args) {
		//set the executable path of required browser driver
		System.setProperty("webdriver.chrome.driver", ".//drivers\\chromedriver.exe");
		
		//create an instance of ChromeDriver
		WebDriver driver = new ChromeDriver();
		
		//maximize window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//enter the url
		driver.get("https://www.gsmarena.com");
		
		//url validation
		String actualurl = driver.getCurrentUrl();
		System.out.println("url validation : "+actualurl.equals("https://www.gsmarena.com"));
		
		//click on samsung
		driver.findElement(By.cssSelector(".brandmenu-v2 >ul>li")).click();
		
		List<WebElement> phonefinder = driver.findElements(By.cssSelector(".makers>ul>li"));
		System.out.println("count of samsung phones : "+phonefinder.size());
		
		for(int i=0 ; i<phonefinder.size() ; i++) {
			System.out.println(phonefinder.get(i).getText());
		}
		// TODO Auto-generated method stub

	}

}
