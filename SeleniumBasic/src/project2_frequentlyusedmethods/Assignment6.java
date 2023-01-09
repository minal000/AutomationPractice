package project2_frequentlyusedmethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		String pgtl = driver.getTitle();
		System.out.println("page title is : "+pgtl);
		System.out.println("page title validation is : "+pgtl.equals("Register"));
		
		String urll = driver.getCurrentUrl();
		System.out.println("page url is : "+urll);
		System.out.println("page url validation is : "+urll.equals("https://demo.automationtesting.in/Register.html"));
		
		String PS = driver.getPageSource();
		System.out.println("Page source code is : "+PS);
		System.out.println("page source length is : "+PS.length());
		
		
		
		// TODO Auto-generated method stub

	}

}
