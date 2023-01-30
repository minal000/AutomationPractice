package datadriventesting;

import org.testng.annotations.Test;

import Utilities3.ExcelUtility;
import utilities2.SeleniumUtility;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;


public class actitimeLogin extends SeleniumUtility {
  
	String appUrl;
	String userName;
	String password;
	
  @BeforeTest
  public void getData() {
   appUrl = ExcelUtility.getCellValue(".\\src\\test\\resources\\MyExcel\\TestData2.XLSX", "Sheet1", 1, 0);
 userName =	ExcelUtility.getCellValue(".\\src\\test\\resources\\MyExcel\\TestData2.XLSX", "Sheet1", 1, 0);
	 password = ExcelUtility.getCellValue(".\\src\\test\\resources\\MyExcel\\TestData2.XLSX", "Sheet1", 1, 0);
	 
  }
  
  @Test
  public void actitimeLogin() {
	  WebDriver driver = setUp("chrome",appUrl);
	  typeInput(driver.findElement(By.id("username")),userName);
	  typeInput(driver.findElement(By.name("pwd")),password);
	  clickOnElement(driver.findElement(By.id("loginButton")));
	   if(getCurrentTitleOfApplication("actitime - Enter Time-Track").equals("actitime - Enter Time-Track")) {
		   ExcelUtility.updateExcelContent(".\\src\\test\\resources\\TestData2.XLSX", "Sheet1", 1, 3, "Passed");
		   
	   }else {
		   ExcelUtility.updateExcelContent(".\\src\\test\\resources\\TestData2.XLSX", "Sheet1", 1, 3, "Failed");
		   
	   }
	   Assert.assertEquals(getCurrentTitleOfApplication("actitime - Enter Time-Track"),"actitime - Enter Time-Track");
	   
  }



@AfterTest
  public void cleanUp() {
	cleanUp();
  }



}
