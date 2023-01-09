package project6_HandlingMultipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6_facebook {

	public static void main(String[] args) {
		
		//set the executable path of required browser
		System.setProperty("webdriver.chrome.driver",".//drivers\\chromedriver.exe");
		
		//create an instance of ChromeDriver
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//enter the url
		driver.get("https://www.facebook.com");
		
		//click on creat an account
		driver.findElement(By.cssSelector()).click();
		
		WebElement droplist = driver.findElement(By.cssSelector(null));
		
		//create an instance of select class
		Select s1 = new Select(droplist);
		System.out.println("multiple or not : "+s1.isMultiple());
		
		List<WebElement> face = driver.findElements(By.cssSelector());
		System.out.println("counts of option in facebook : "+face.size());
		
		for(int i=0 ; i<face.size() ; i++) {
			System.out.println(face.get(i).getText());
		}
		
		
		// TODO Auto-generated method stub

	}

}
