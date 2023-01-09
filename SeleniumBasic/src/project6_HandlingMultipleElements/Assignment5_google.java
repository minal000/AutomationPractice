package project6_HandlingMultipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5_google {

	public static void main(String[] args) {
		//set the excutable path of required browser driver
		System.setProperty("webdriver.chrome.driver", ".//drivers\\chromedriver.exe");
		
		//create an instance of ChromeDriver
		WebDriver driver = new ChromeDriver();
		
		//maximize window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//enter the url
		driver.get("https://www.google.com");
		
		
		List<WebElement> sugg = driver.findElements(By.cssSelector("div.erkvQe>div>ul>li"));
		System.out.println("count of Suggestion : "+sugg.size());
		
		for(int i=0 ; i<sugg.size() ; i++) {
			System.out.println(sugg.get(i).getText());
		}
		// TODO Auto-generated method stub

	}

}
