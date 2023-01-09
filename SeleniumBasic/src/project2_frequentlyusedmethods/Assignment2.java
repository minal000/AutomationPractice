package project2_frequentlyusedmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",".//drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		String pageTitle = driver.getTitle();
		System.out.println("page title is "+pageTitle);
		System.out.println("pageTitle validation is "+pageTitle.equals("Facebook"));
		
		driver.close();

		// TODO Auto-generated method stub

	}

}
