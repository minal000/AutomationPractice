package project6_HandlingMultipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7_gsmarenapageiniti {

	public static void main(String[] args) {
		//Set the executable path of required web browser
		System.setProperty("webdriver.chrome.driver", ".//drivers\\chromedriver.exe");
		
		//create an instance of chromeDriver
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//enter the url
		driver.get("https://www.gsmarena.com");
		
		//validate homepage
		String actualurl = driver.getCurrentUrl();
		System.out.println("validate homepage : "+actualurl.equals("https://www.gsmarena.com"));

		//click on samsung
		driver.findElement(By.cssSelector(".brandmenu-v2 >ul>li")).click();
		
		List<WebElement> page = driver.findElements(By.cssSelector(".nav-pages>a"));
		System.out.println("count of pageination : "+page.size());
		
		for(int i=0 ; i<page.size( ) ; i++) {
			System.out.println(page.get(i).getText());
			
		}
		
		driver.findElement(By.linkText("2")).click();
		String page2url = driver.getCurrentUrl();
		System.out.println("page 2 url is : "+page2url);
		
		driver.findElement(By.linkText("3")).click();
		String page3url = driver.getCurrentUrl();
		System.out.println("page 2 url is : "+page3url);
		
		driver.findElement(By.linkText("4")).click();
		String page4url = driver.getCurrentUrl();
		System.out.println("page 4 url is : "+page4url);
		
		driver.findElement(By.linkText("5")).click();
		String page5url = driver.getCurrentUrl();
		System.out.println("page 5 url is : "+page5url);
		
		driver.findElement(By.linkText("6")).click();
		String page6url = driver.getCurrentUrl();
		System.out.println("page 6 url is : "+page6url);
		
		driver.findElement(By.linkText("7")).click();
		String page7url = driver.getCurrentUrl();
		System.out.println("page 7 url is : "+page7url);
		
		driver.findElement(By.linkText("8")).click();
		String page8url = driver.getCurrentUrl();
		System.out.println("page 8 url is : "+page8url);
		
		driver.findElement(By.linkText("9")).click();
		String page9url = driver.getCurrentUrl();
		System.out.println("page 9 url is : "+page9url);
		
		driver.findElement(By.linkText("10")).click();
		String page10url = driver.getCurrentUrl();
		System.out.println("page 10 url is : "+page10url);
		
		driver.findElement(By.linkText("11")).click();
		String page11url = driver.getCurrentUrl();
		System.out.println("page 11 url is : "+page11url);
		
		driver.findElement(By.linkText("12")).click();
		String page12url = driver.getCurrentUrl();
		System.out.println("page 12 url is : "+page12url);
		
		driver.findElement(By.linkText("13")).click();
		String page13url = driver.getCurrentUrl();
		System.out.println("page 13 url is : "+page13url);
		
		driver.findElement(By.linkText("14")).click();
		String page14url = driver.getCurrentUrl();
		System.out.println("page 14 url is : "+page14url);
		
		driver.findElement(By.linkText("15")).click();
		String page15url = driver.getCurrentUrl();
		System.out.println("page 15 url is : "+page15url);
		
		driver.findElement(By.linkText("16")).click();
		String page16url = driver.getCurrentUrl();
		System.out.println("page 16 url is : "+page16url);
		
		
		
		// TODO Auto-generated method stub

	}

}
