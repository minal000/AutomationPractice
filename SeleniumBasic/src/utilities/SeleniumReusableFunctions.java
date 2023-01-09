package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class SeleniumReusableFunctions {
	
	 static WebDriver driver= null;
	 
	  public WebDriver setUp(String browserName,String appUrl) {
		
		if(browserName.equalsIgnoreCase("chrome")) {
		//set the executable path of driver
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//create an instance of chrome Browser
		 driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			//set the executable path of driver
			System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
			//create an instance of firefox Browser
			 driver = new FirefoxDriver();
		}
		//maximize the window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//enter the url
		driver.get(appUrl);
		return driver;      
		
		  }
	    
	    }


