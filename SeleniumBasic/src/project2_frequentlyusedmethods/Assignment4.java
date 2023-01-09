package project2_frequentlyusedmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",".//drivers\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://demosite.executeautomation.com/Login.html");
		
		String pageTitle = driver.getTitle();
		System.out.println("page title is :"+pageTitle);
		System.out.println("page title length is : "+pageTitle.length());
	
		System.out.println("page url is : "+driver.getCurrentUrl());
		
		WebElement usernameInputField = driver.findElement(By.name("username"));
		usernameInputField.sendKeys("execution");
		
		WebElement passwordInputField = driver.findElement(By.name("password"));
		passwordInputField.sendKeys("admin");
		
		WebElement loginBtn = driver.findElement(By.name("Login"));
		loginBtn.click();
		
	//	WebElement logoutBtn = driver.findElement(By.id("LogOutButton"));
	//	logoutBtn.click();
		
		driver.close();
		
		
		
		
		
		
		
	
		
		
		// TODO Auto-generated method stub

	}

}
