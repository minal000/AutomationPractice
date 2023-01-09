package project2_frequentlyusedmethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String pt = driver.getTitle();
		System.out.println("page title is : "+pt);
		System.out.println("page title validation is : "+pt.equals("OrangeHRM"));
		
		String url = driver.getCurrentUrl();
		System.out.println("page url is : "+url);
		System.out.println("page url validation is : "+url.equals("https://opensource-demo.orangehrmlive.com/"));
		
		String PS = driver.getPageSource();
		System.out.println("Page source code is : "+PS);
		System.out.println("Page source code length is : "+PS.length());
		
		
		
		
		
;		// TODO Auto-generated method stub

	}

}
