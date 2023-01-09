package conceptof_xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assig_Stock {

	public static void main(String[] args) {
		//set the executable path of driver
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		//create an instance of chrome driver
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//get the url
		driver.get("https://www.nseindia.com/");
		
		//volume of HDFC
		WebElement v = driver.findElement(By.xpath("//tr[td[a[text()='TCS']]]/td[4]"));
		System.out.println("volume of HDFC : "+v.getText());
		
		//close the browser
		driver.close();

	}

}
