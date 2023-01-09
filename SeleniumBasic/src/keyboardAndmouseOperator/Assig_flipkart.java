package keyboardAndmouseOperator;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assig_flipkart {

	public static void main(String[] args) throws InterruptedException {
	//set the executable path of driver
	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe")	;
	
	//instance of required browser
	WebDriver driver = new ChromeDriver();
	
	//maximize the window
	driver.manage().window().maximize();
	
	//implicit wait
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	//enter the url
	driver.get("https://www.flipkart.com/");
	
	//identify webelement mobile and tablet
	WebElement mobile = driver.findElement(By.cssSelector("div._37M3Pb>div.eFQ30H:nth-child(2)>a>div._1mkliO>div.CXW8mj>img"));
	
	//create an instance of Actions class by passing instance of webdriver in its constructor
	Actions act = new Actions(driver);
	act.doubleClick(mobile).perform();
	
	//identify inside menu of mobile and tablets
	List<WebElement> insideMenu = driver.findElements(By.cssSelector("div._331-kn>div>div>span"));
	System.out.println(" size of inside menu : "+insideMenu.size());

	//to do hover all the inside menu of mobile and tablets
	for(int i=0 ; i<insideMenu.size() ; i++) {
		WebElement Options = insideMenu.get(i);
		act.moveToElement(Options).perform();
		Thread.sleep(1000);
	}
		
	}

}
