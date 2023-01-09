package amazon_Assignment11;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonExample {

	public static void main(String[] args) throws InterruptedException {
		
		//set required driver executable path using System.setProperty(key,value)
		System.setProperty("webdriver.chrome.driver",".//drivers\\chromedriver.exe");
		
		//create an instance of required browser class
		WebDriver driver = new ChromeDriver();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//enter required url
		driver.get("https://www.amazon.in");
		
		//to maximize window
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//set required window size
		//driver.manage().window().setSize(new Dimension(450,650));
		
		System.out.println("page title is : "+driver.getTitle());
		
		driver.findElement(By.linkText("Amazon Pay")).click();
		Thread.sleep(1500);
		
		System.out.println("page title is : "+driver.getTitle());
		
		driver.navigate().back();
		Thread.sleep(1500);
		
		String pgtl = driver.getTitle();
		System.out.println("page title is : "+pgtl);
		System.out.println("page title validation : "+pgtl.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
		
		
		driver.close();
		
		
		
		// TODO Auto-generated method stub

	}

}
