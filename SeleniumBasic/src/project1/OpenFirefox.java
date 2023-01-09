package project1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {

	public static void main(String[] args) {
		//see the driver executable path using System.setproperty(String key,String value)
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		
		//Create an instance of required browser class
		FirefoxDriver cdriver = new FirefoxDriver() ;
		
		
		
		
		
		
		
		
		/**
		 * every time selenium will lauch new browser
		 * Browser opened by selenium won't be having
		 * 1.history
		 * 2.plugins
		 * 3.cookies
		 */
	}

}
