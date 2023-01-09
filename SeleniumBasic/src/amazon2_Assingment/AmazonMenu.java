package amazon2_Assingment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonMenu {

	public static void main(String[] args) {
		//set the executable path of driver
		System.setProperty("webdriver.chrome.driver",".//drivers\\chromedriver.exe");
		
		//create an instance of ChromeDriver
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//enter the required the url
		driver.get("https://www.amazon.in/");
		
		//for multiple webelement
		List<WebElement> devicelist = driver.findElements(By.cssSelector("#nav-xshop>a"));
		System.out.println("count of device list on amzon : "+devicelist.size());
		
		for(int i=0 ; i<devicelist.size() ; i++) {
			
			if(!devicelist.get(i).getText().isEmpty()) {
			   System.out.println(devicelist.get(i).getText());  //it was giving the value which is present in only UI
			}else {
				System.out.println(devicelist.get(i).getAttribute("innerHTML"));
			}
			
			 
			/* get Attribute will give the value which is not showing on UI,
			 * which is present in backside
			   it is fixed to write in this way
			*/
		}
		
		
		// TODO Auto-generated method stub

	}

}
