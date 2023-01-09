package project2_frequentlyusedmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		String sourcecode = driver.getPageSource();
		System.out.println("page source code  is : "+sourcecode);
		
		System.out.println("Current url is : "+driver.getCurrentUrl());
		
		driver.close();
		
		
		// TODO Auto-generated method stub

	}

}
