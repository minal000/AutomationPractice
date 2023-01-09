package vtiger_Assignment13;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VtigerWidget {

	public static void main(String[] args) {
		
		//set the required driver executable path 
	System.setProperty("webdriver.chrome.driver",".//drivers\\chromedriver.exe");
	
	//create an instance of required browser class
	WebDriver driver = new ChromeDriver();
	
	
	//implicit wait
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	//get the url
	driver.get("https://demo.vtiger.com/vtigercrm/index.php");
	
	//add username
	driver.findElement(By.id("username")).click();
	driver.findElement(By.id("username")).sendKeys("admin");
	
	//add password
	driver.findElement(By.id("password")).clear();
	driver.findElement(By.id("password")).sendKeys("Test@123");
	
	//login
	driver.findElement(By.className("buttonBlue")).click();
	
	WebDriverWait wait = new WebDriverWait(driver, 20);
	WebElement dropDown = driver.findElements(By.cssSelector(By.));
	
	//identify dropdown list and click on it 
	dropDown.click();
	
	//identify all the option and store them into List<WebElement>
	List<WebElement> options = driver.findElements(By.cssSelector(null));
	
	//use size to get options size
	System.out.println("count of options : "+options.size());
	
	for(int i=0 ; i<options.size() ; i++) {
		System.out.println(options.get(i).getText());
		
	}
	options.get(3).click();
	dropDown.click();
	options.get(4).click();
	dropDown.click();
	
	}

}
