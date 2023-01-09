package project6_HandlingMultipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3_gsmarena {

	public static void main(String[] args) {
		//set the path of required browser
		System.setProperty("webdriver.chrome.driver",".//drivers\\chromedriver.exe");
		
		//create an instance of chromeDriver
		WebDriver driver = new ChromeDriver();
		
		//maximize window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//enter the required url
		driver.get("https://www.gsmarena.com");
		
		//validate homepage
		String actualurl = driver.getCurrentUrl();
		System.out.println("validate home page : "+actualurl.equals("https://www.gsmarena.com"));
		
	  List<WebElement> phone = driver.findElements(By.cssSelector("#body>aside>div.brandmenu-v2.light.l-box.clearfix>ul>li"));
	  System.out.println("count of phone : "+phone.size());
	  
	  for(int i=1 ; i<phone.size() ; i++) {
		  System.out.println(phone.get(i).getText());
	  }
		// TODO Auto-generated method stub

	}

}
