package project2_frequentlyusedmethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment9 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		String pgtl = driver.getTitle();
		System.out.println("page title is : "+pgtl);
		System.out.println("page title validation is : "+pgtl.equals("vtiger"));
		
		String pgurl = driver.getCurrentUrl();
		System.out.println("page url is : "+pgurl);
		System.out.println("page url validation is : "+pgurl.equals("https://demo.vtiger.com/vtigercrm/index.php"));
		
		String pgsource = driver.getPageSource();
		System.out.println("page source code is : "+pgsource);
		System.out.println("page source code length is : "+pgsource.length());
		
		driver.findElement(By.id("username")).clear();
		 driver.findElement(By.id("username")).sendKeys("admin");
		
		 
		 driver.findElement(By.id("password")).clear();
		 driver.findElement(By.id("password")).sendKeys("Test@123");
		 
		driver.findElement(By.className("button")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,70);
        wait.until(ExpectedConditions.titleContains("vtiger"));	
		
		System.out.println("Home page title : "+driver.getTitle());
		
		
		
		
		// TODO Auto-generated method stub

	}

}
