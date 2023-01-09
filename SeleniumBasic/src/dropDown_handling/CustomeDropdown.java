package dropDown_handling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomeDropdown {

	public static void main(String[] args) {
		//set the executable path of the driver
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		//create an instance of ChromeDriver
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//get the url
		driver.get("https://thompsonsj.com/bootstrap-select-dropdown/");
		
		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver,20);
		WebElement dropdown = driver.findElement(By.id("bsd1-button"));
		//wait.until(ExpectedConditions.elementToBeClickable(dropdown));
		//identify dropdown list and click on it 
		dropdown.click();
		
		//identify all the option and store them into List<WebElement>
		List<WebElement> options = driver.findElements(By.cssSelector(".dropdown-menu.dropdown-menu-right.show>div>a"));
		
		//use size() to get the options count
		System.out.println("count of options : "+options.size());
		
		//use loop to print one by one 
		for(int i=1 ; i<options.size() ;i++) {
			System.out.println(options.get(i).getText());
		}
		options.get(2).click();
		
		
		
		// TODO Auto-generated method stub

	}

}
