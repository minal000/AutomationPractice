package project2_frequentlyusedmethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https:.//www.amazon.in/");
		 
		String pgtl = driver.getTitle();
		System.out.println("page title is : "+pgtl);
		System.out.println("page title validation is : "+pgtl.equals(pgtl));
		
		String pgurl = driver.getCurrentUrl();
		System.out.println("page url is : "+pgurl);
		System.out.println("page url validation is : "+pgurl.equals("https:.//www.amazon.in/"));
		
		String pgsrc = driver.getPageSource();
		System.out.println("page source code is : "+pgsrc);
		System.out.println("page source code length is : "+pgsrc.length());
		
		
		// TODO Auto-generated method stub

	}

}
