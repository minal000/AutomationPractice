package project2_frequentlyusedmethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://sampleapp.tricentis.com/101/");
		
		String pgtl = driver.getTitle();
		System.out.println("page title is : "+pgtl);
		System.out.println("page title validation is : "+pgtl.equals("404 - Tricentis: The Continuous Testing Company"));
		
		String pgurl = driver.getCurrentUrl();
		System.out.println("page url is : "+pgurl);
		System.out.println("page url validation is : "+pgurl.equals("https://sampleapp.tricentis.com/101/"));
		
		String pgs = driver.getPageSource();
		System.out.println("page source code is : "+pgs);
		System.out.println("page source length is : "+pgs.length());
		
		// TODO Auto-generated method stub

	}

}
