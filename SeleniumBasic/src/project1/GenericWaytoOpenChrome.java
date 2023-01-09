package project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericWaytoOpenChrome {

	public static void main(String[] args) {
		//see the driver executable path using System.setproperty(String key,String value)
		System.setProperty("webdriver.chrome.driver",".//drivers\\chromedriver.exe");
		
		//Create an instance of required browser class
		//example for runtime poly- Inheritance, upcasting,and overriding
		
		WebDriver driver = new ChromeDriver();
		// TODO Auto-generated method stub

	}

}
