package project6_HandlingMultipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_AutomationTesting {

	public static void main(String[] args) {
		//set the executable path of browser
		System.setProperty("webdriver.chrome.driver",".//drivers\\chromedriver.exe");
		
		//create an instance of chrome browser
		WebDriver driver = new ChromeDriver();
		
		//maximize window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		/**
		 * use findElements(By) -- this will help us to identify multiple element from 
		 *                         application and returns List<WebElement>
		 * Once you get a List<WebElement> use 
		 *          size() --method of java collection to get identified element count
		 *          get(index) -- to get specific element from the list                 
		 */
		//enter the url
		driver.get("https://demo.automationtesting.in/Register.html");
		
		//links present in automation page
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("links count : "+links.size());
		
		List<WebElement> inputFields = driver.findElements(By.tagName("input"));
		System.out.println("input field count : "+inputFields.size());
		
		List<WebElement> classObjects = driver.findElements(By.className("ng-pristine"));
		System.out.println("class objects count : "+classObjects.size());
		
		//in order to get specific element from the List use get(index)
		classObjects.get(1).sendKeys("XYZ");
		classObjects.get(2).sendKeys("ABC");
		classObjects.get(3).sendKeys("yavtmal");
		classObjects.get(4).sendKeys("abc@gmail.com");
		
		
		// TODO Auto-generated method stub

		
		
		/**
		 * if locator used in findElement(By) gives you multiple matching dn it won't throw any error
		 * instedd it will perform operation on the first element only
		 * 
		 * if used locator matching with multiple elements dn its recommended to usse findElements(By), which will return
		 * List<WebElement>.
		 * once you get a list, use get(index) of collection for specific element
		 */
		
		
	}

}
