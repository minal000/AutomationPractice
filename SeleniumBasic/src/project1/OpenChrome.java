package project1;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) {
		
		//see the driver executable path using System.setproperty(String key,String value)
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		
		//Create an instance of required browser class
		ChromeDriver cdriver = new ChromeDriver();
		
		
		
		
		
		
/**
 * every time selenium will lauch new browser
 * Browser opened by selenium won't be having
 * 1.history
 * 2.plugins
 * 3.cookies
 */
		// TODO Auto-generated method stub

	}

}
