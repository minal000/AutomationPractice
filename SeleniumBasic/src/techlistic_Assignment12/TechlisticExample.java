package techlistic_Assignment12;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TechlisticExample {

	public static void main(String[] args) throws InterruptedException   {
		
		//set the required browser path by using System.setProperty(key,value)
		System.setProperty("webdriver.chrome.driver",".//drivers\\chromedriver.exe");
		
		//create an instance of browser class
		WebDriver driver = new ChromeDriver();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//enter the url
		driver.get("https.//www.techlistic.com/");
		
		//to maximize the window
		driver.manage().window().maximize();
		
		//set the required size of window (minimize)
		//driver.manage().window().setSize(new Dimension(450,600));
		
		//click Java
		driver.findElement(By.linkText("Java")).click();
		Thread.sleep(1500);
		
		String pgtl = driver.getTitle();
		System.out.println("page title is : "+pgtl);
		//System.out.println("page title validation : "+pgtl.equals(pgtl));
		
		driver.navigate().back();
		Thread.sleep(1500);
		
		//Click Selenium
		driver.findElement(By.className("dropbtn")).click();
		Thread.sleep(1500);
		
		String pgtl2 = driver.getTitle();
		System.out.println("page title is : "+pgtl2);
		//System.out.println("page title validation : "+pgtl2.equals(pgtl2));
		
		driver.navigate().back();
		Thread.sleep(1500);
		
		
		//click BDD
		driver.findElement(By.className("dropbtn")).click();
		Thread.sleep(1500);
		
		String pgtl3 = driver.getTitle();
		System.out.println("page title is : "+pgtl3);
		//System.out.println("page title validation : "+pgtl3.equals(pgtl3));
		
		driver.navigate().back();
		Thread.sleep(1500);
		
		//click Testing
		driver.findElement(By.className("dropbtn")).click();
		Thread.sleep(1500);
		
		String pgtl4 = driver.getTitle();
		System.out.println("page title is : "+pgtl4);
		System.out.println("page title validation is : "+pgtl4.equals(pgtl4));
		
		driver.navigate().back();
		Thread.sleep(1500);
		
		//closing browser
		driver.close();
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
