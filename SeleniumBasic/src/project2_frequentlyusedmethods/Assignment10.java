package project2_frequentlyusedmethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment10 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String pgtl = driver.getTitle();
		System.out.println("page title is : "+pgtl);
		//System.out.println("page title validation is : "+pgtl.equals("OrangeHRM"));
		
		String pgurl = driver.getCurrentUrl();
		System.out.println("page url is : "+pgurl);
		System.out.println("page url validation is : "+pgurl.equals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"));
		
		String pgsource = driver.getPageSource();
		System.out.println("page source code is : "+pgsource);
		System.out.println("page source code length is : "+pgsource.length());
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.tagName("button")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.titleContains("OrangeHRM"));	
		
		System.out.println("Home page title : "+driver.getTitle());
		
		
		// TODO Auto-generated method stub

	}

}
