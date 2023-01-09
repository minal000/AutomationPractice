package project6_HandlingMultipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_meshoo {

	public static void main(String[] args) {
		
		//set the required executable path of driver
		System.setProperty("webdriver.chrome.driver",".//drivers\\chromedriver.exe");
		
		//create an instance of chrome driver
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//enter the required url
		driver.get("https://www.meesho.com");
		
		//url validation
		String actualurl = driver.getCurrentUrl();
		System.out.println("url validation : "+actualurl.equals("https://www.meesho.com"));
		
		List<WebElement> list = driver.findElements(By.cssSelector("div#__next>div>div>div.S_NavBarDesktop-upvn2h-0 >div"));
	    System.out.println("list count : "+list.size());
	    
	    for(int i=0 ; i<list.size() ; i++) {
	    	System.out.println("list of products" +list.get(i).getText());
	    }
		// TODO Auto-generated method stub

	}

}
