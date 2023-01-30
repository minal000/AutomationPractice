package switching;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities2.SeleniumUtility;

public class HandlingWindow {

	public static void main(String[] args) {
		SeleniumUtility s1 = new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome", "https://etrain.info/in");
		
		//get current window unique id 
		String homePageWinId = driver.getWindowHandle(); //T1
		System.out.println("Home page window Id : "+homePageWinId);
		
		//performing click operation to open Linkedin page in new tab
		driver.findElement(By.xpath("")).click();
		
		//get all windows unique IDs which are opened by selenium current instance
		Set<String> allWinIds = driver.getWindowHandles();
        System.out.println("All windows Ids : "+allWinIds);//T1,T2
        
        //Remove home window id from all window id then you will get child window id
        allWinIds.remove(homePageWinId);//T2
        System.out.println("After removing homeWinId ,all windows ID : "+allWinIds);

        //get child window id using iterator
        Iterator<String> itr = allWinIds.iterator();
		String childWinId = itr.next();
		//now you can switch your control from Main window to child Window
		driver.switchTo().window(childWinId);
				          //or
		//switch control to child window
		driver.switchTo().window(allWinIds.iterator().next());
		
		//now you are allow to identify any element from child window
		System.out.println("Linkedin page title : "+driver.getTitle());
		System.out.println("Linkedin page url : "+driver.getCurrentUrl());
		
		//close current instance of browser
		driver.close();
		//driver.quit();  //comment below code
		
		//switch back to home page window in order to perform any required operation on that
		driver.switchTo().window(homePageWinId);
		//now you are allow to identify any element from home window
		System.out.println("etrain page title : "+driver.getTitle());
		System.out.println("etrain page url : "+driver.getCurrentUrl());
		//close current instance of browser
		driver.close();
		//close all the driver instances opened by webdriver
		//driver.quit();
		
	}

}
