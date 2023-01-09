package keyboardAndmouseOperator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assig_Orangehrm_Employee {

	public static void main(String[] args) {
		//set the executable path of Driver
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		
		//create an instance of chrome browser
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//enter the url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//type username
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		//type password
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		//click login
		driver.findElement(By.cssSelector(".oxd-button ")).click();
		
		//click on PIM
		driver.findElement(By.cssSelector("a[href='/web/index.php/pim/viewPimModule']")).click();

		//click on Add Employee
		driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
		
		//enter employee details 
		driver.findElement(By.name("firstName")).sendKeys("ABC");
		
		driver.findElement(By.name("lastName")).sendKeys("XYZ");
		
//		WebElement id = driver.findElement(By.cssSelector("div.oxd-grid-2>div>div>div:nth-child(2)>input"));
//		id.click();
//		id.clear();
	
		//clear id box
		driver.findElement(By.cssSelector("div.oxd-grid-2>div>div>div:nth-child(2)>input")).sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.BACK_SPACE);
		
		//send id
		driver.findElement(By.cssSelector("div.oxd-grid-2>div>div>div:nth-child(2)>input")).sendKeys("1621");
		
		//click on save
		//driver.findElement(By.linkText("Save")).click();
		driver.findElement(By.cssSelector("div.oxd-form-actions>button[type='submit']")).click();
		
		//again click on PIM
		driver.findElement(By.cssSelector("a[href='/web/index.php/pim/viewPimModule']")).click();
		
		//click on id
		WebElement id =driver.findElement(By.cssSelector("div.oxd-grid-item.oxd-grid-item--gutters>div>div>input"));
		id.click();
		id.sendKeys("1621");
		
		//click on search
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//click on checkbox
		driver.findElement(By.cssSelector("div.oxd-checkbox-wrapper>label>span>i")).click();
		
		//click on edit
		driver.findElement(By.cssSelector("div.oxd-table-cell-actions>button:nth-child(2)[type='button']>i")).click();
		
		//click on job
	    driver.findElement(By.xpath("//a[text()='Job']")).click();
	    
	    //Select job title
	    
		
	   //click on save
	    
	    
	    //click on PIM
		//click on delete
		//driver.findElement(By.cssSelector("div.oxd-table-cell-actions>button[type='button']>i")).click();
				
		
		
		
		
		
		
		
		
		
	}

}
