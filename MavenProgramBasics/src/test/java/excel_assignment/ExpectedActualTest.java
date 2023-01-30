package excel_assignment;

import org.testng.annotations.Test;

import Utilities3.ExcelUtility;
import utilities2.SeleniumUtility;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class ExpectedActualTest extends SeleniumUtility {
  
	String appUrl;
	String userName;
	String password;
	String expectedTitle;
	
  @BeforeTest
  public void getData() {

	  
  }

  @Test
    public void vtiger() {
	  
	  WebDriver driver = setUp("Chrome",appUrl);
	  typeInput(driver.findElement(By.id("username")),userName);
	  typeInput(driver.findElement(By.id("password")),password);
	  clickOnElement(driver.findElement(By.xpath("//*[@class='button buttonBlue']")));
	  
	  String s = driver.getTitle();
  }
  
//  @AfterTest
//  public void cleanUp() {
//  }

}
