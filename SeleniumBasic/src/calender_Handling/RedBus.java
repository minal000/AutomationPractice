package calender_Handling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) {
		
		//set the executable path of driver
				System.setProperty("webdriver.chrome.driver",".//drivers\\chromedriver.exe");
				
				//create an instance of chromeDriver
				WebDriver driver = new ChromeDriver();
				
				//maximize the window
				driver.manage().window().maximize();
				
				//implicit wait
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				
				//enter the required url
				driver.get("https://www.redbus.in");
				 
				//select from pune
				driver.findElement(By.id("src")).sendKeys("Pune");
				
				//click pune
				driver.findElement(By.cssSelector(".selected")).click();
				
				//select to Goa
				driver.findElement(By.id("dest")).sendKeys("Goa");
				
				//click Goa
				driver.findElement(By.cssSelector(".selected")).click();
				
				//click on date
				driver.findElement(By.id("onward_cal")).click();
				
				//select date
				driver.findElement(By.cssSelector("table>tbody>tr:nth-child(6)>td:nth-child(3)")).click();				
		
				//click search 
				driver.findElement(By.id("search_btn")).click();
				
				//click departure time
				driver.findElement(By.cssSelector("ul.dept-time.dt-time-filter>li:nth-child(1)>label.custom-checkbox")).click();
				https://www.flipkart.com/samsung-mobile-store?otracker=nmenu_sub_/Electronics_0_Samsung
				//click bus type
				driver.findElement(By.cssSelector("ul.list-chkbox>li:nth-child(3)>input")).click();
				
				//get bus
				List<WebElement> list_bus = driver.findElements(By.cssSelector("ul.bus-items>div>li>div>div>div>div"));
				System.out.println("list of buses is : "+list_bus.size());
				for(int i=0 ; i<list_bus.size() ; i++) {
					System.out.println(list_bus.get(i).getText());
				}
				driver.close();
	}

}
