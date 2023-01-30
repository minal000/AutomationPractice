package assignment_usingtestng;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities2.SeleniumUtility;

public class Actitime extends SeleniumUtility{

	    @BeforeSuite
	    public void OpenBrowser() {
         
	    	setUp("chrome","https://demo.actitime.com");
	    }
	    
		@BeforeTest
		public void login() {
			
		// type username
		driver.findElement(By.id("username")).sendKeys("admin");

		// type password
		driver.findElement(By.name("pwd")).sendKeys("manager");

		// click on login
		driver.findElement(By.id("loginButton")).click();

		}
		
		@Test
		public void TaskCreation() {
			
		// click on task tab
		driver.findElement(By.id("container_tasks")).click();

		// click on add new button
		// driver.findElement(By.className("title ellipsis")).click();
		driver.findElement(By.cssSelector(".addNewContainer")).click();

		List<WebElement> options = driver.findElements(By.cssSelector(".dropdownContainer.addNewMenu>div"));
		// use size() to get count
		System.out.println("count of options : " + options.size());

		// print one by one option
		for (int i = 0; i < options.size(); i++) {
			System.out.println(options.get(i).getText());
		}
		options.get(2).click();

//		//identify select customer and click on it 
//		driver.findElement(By.cssSelector(".customerSelector.customerOrProjectSelector.selectorWithPlaceholderContainer>div>div>div:nth-of-type(1")).click();
		//
//		//identify select project and click on it 
//		driver.findElement(By.cssSelector(".projectSelector .selectedItem")).click();

		// enter task name
		driver.findElement(By.cssSelector("input[placeholder='Enter task name']")).sendKeys("testing");

		// click on set deadline
		driver.findElement(By.cssSelector(".x-btn-center")).click();

		// select next for date
		driver.findElement(By.cssSelector("Next Month (Control+Right)")).click();

		// select date
		driver.findElement(By.cssSelector(".x-date-inner>tbody>tr:nth-of-type(2)>td:nth-of-type(4)>a>em>span"));

		// work type
		// driver.findElement(By.cssSelector(""))

		}
		
		@Test
		public void Delete() {
		// click on create task
		driver.findElement(By.cssSelector(".commitButtonPlaceHolder>div")).click();

		//
	}

}
