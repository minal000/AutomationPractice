package project2_frequentlyusedmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://demo.actitime.com/");
		 
		 String pageTitle = driver.getTitle();
		 System.out.println("page title is : "+pageTitle);
		 System.out.println("page title length is : "+pageTitle.length());
		 
		 System.out.println("Get page url : "+driver.getCurrentUrl());
		String ur1 = driver.getCurrentUrl();
		System.out.println("url is : "+ur1.equals("https://demo.actitime.com/"));
		 
		 String sourceCode = driver.getPageSource();
	    System.out.println("source code is : "+sourceCode);
		 System.out.println("source code length is : "+sourceCode.length());
		 
		
		 driver.close();
		 
		 
		 
		// TODO Auto-generated method stub

	}

}
