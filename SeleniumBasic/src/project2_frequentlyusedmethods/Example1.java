package project2_frequentlyusedmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//enter the required url
		driver.get("https://www.google.com");
		
		//get page title and print in the console
		String pageTitle=driver.getTitle();
		System.out.println("page title is :"+pageTitle);
		     //or
		//System.out.println("page title is :"+driver.getTitle());
		
		System.out.println("page title validation : "+pageTitle.equals("Register"));
		
		//get current page url
		System.out.println("page url is "+driver.getCurrentUrl());
		
		//get page source code
		//System.out.println("page source code is "+driver.getPageSource());
		   //or
		String sourceCode = driver.getPageSource();
		System.out.println("page source code is "+sourceCode);
		System.out.println("Source code length : "+sourceCode.length());
		
		//close current browser instance opened by webdriver
		driver.close();
		
		// TODO Auto-generated method stub

	}

}
