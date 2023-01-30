package javascriptexample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities2.SeleniumUtility;

public class Example1 extends SeleniumUtility {
	
     @Test
	public void testCase1() {
    	 WebDriver driver = setUp("chrome","https://demo.vtiger.com/vtigercrm/index.php");
    	 //identify signin element using selenium
    	 WebElement element = driver.findElement(By.cssSelector(".buttonBlue"));
    	 //convert driver instance to JavaScriptExecutor Interface
    	 JavascriptExecutor js =(JavascriptExecutor)driver;
    	 //perform click operation using JavascriptExecutor
    	 js.executeScript("argument[0].click();",element );
    	 
    	 System.out.println("Element is identified here by selenium and click ");
	}

     @Test
     public void testCase2() {
    	 
    	 System.out.println("here element identified by javaScript then click");
    	 
    	 WebDriver driver = setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
    	 //convert driver instance to JavascriptExecutor interface
    	 JavascriptExecutor js = (JavascriptExecutor)driver;
    	 //Identify Signin button using Javascript and also perform  click operation
    	 js.executeScript("document.getElementsByClassName('button buttonBlue')[0].click();");
    	 
     }
}
