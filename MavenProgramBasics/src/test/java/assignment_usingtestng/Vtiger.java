package assignment_usingtestng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import utilities2.SeleniumUtility;

public class Vtiger extends SeleniumUtility {
	
	@BeforeSuite
	public void openBrowser() {
		
	setUp("chrome","https://demo.vtiger.com/vtigercrm/index.php");
	
	}
	
	@BeforeMethod
	public void login() {
		
	//click on sign in 
	driver.findElement(By.xpath("//*[text()='Sign in']")).click();
	
	}
	
	@Test
	public void Menu() {
		
	//click on menu
	driver.findElement(By.cssSelector("div#appnavigator>div>span")).click();
	
	//click on marketing
	driver.findElement(By.xpath("//*[text()=' MARKETING']")).click();
	
	}
	
	@Test
	public void SubMenu() {
		
	//click on campaign/lead
	//driver.findElement(By.xpath("//*[text()=' Campaigns']")).click();
	driver.findElement(By.xpath("//*[text()=' Leads']")).click();
	
	}
	@Test
	public void AddInfo() {	
		
	//Add Campaign/lead
	//driver.findElement(By.id("Campaigns_listView_basicAction_LBL_ADD_RECORD")).click();
	driver.findElement(By.id("Leads_listView_basicAction_LBL_ADD_RECORD")).click();
	
	//Add campaign Name
	//driver.findElement(By.id("Campaigns_editView_fieldName_campaignname")).sendKeys("River");
	driver.findElement(By.id("Leads_editView_fieldName_lastname")).sendKeys("mintos");
	
	//click Assigned to
	driver.findElement(By.cssSelector("span#select2-chosen-2")).click();
	
	List<WebElement> list =driver.findElements(By.cssSelector("ul.select2-result-sub>li"));
	list.get(2).click();	
	
	//click on calender
	driver.findElement(By.id("Campaigns_editView_fieldName_closingdate")).click();
	
	//click on next 
//	driver.findElement(By.cssSelector("div.datepicker-days>table>thead>tr>th.next")).click();
	driver.findElement(By.cssSelector("div.datepicker-days>table>thead>tr:nth-child(1)>th:nth-child(3)")).click();
	
	//click on required date
//	driver.findElement(By.cssSelector("div.datepicker-days>table>tbody>tr:nth-child(3)>td:nth-child(3)")).click();
	driver.findElement(By.cssSelector("div.datepicker-days>table>tbody>tr:nth-child(3)>td:nth-child(3")).click();
	
	//click on save
	driver.findElement(By.xpath("//*[text()='Save']")).click();
	
	}
	
	@Test
	public void EditInfo() {

	//click on Edit
	driver.findElement(By.id("Campaigns_detailView_basicAction_LBL_EDIT")).click();
	
	//click and type target size
	WebElement tar = driver.findElement(By.id("Campaigns_editView_fieldName_targetsize"));
	tar.clear();
	tar.sendKeys("1000");
	
	//click on save
	driver.findElement(By.xpath("//*[text()='Save']")).click();

	}
	
	@Test
	public void Deletion() {
		
	//click on more
	driver.findElement(By.xpath("//*[@class='btn btn-default dropdown-toggle']")).click();
	
	List<WebElement> l1 = driver.findElements(By.cssSelector("ul>li#Campaigns_detailView_moreAction_Delete_Campaign>a"));
	l1.get(0).click();
	//driver.switchTo().alert().accept();
	}
	
	@AfterMethod
	public void LogOut() {
		
		driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT"));
	}
	
	@AfterSuite
	public void tearDown() {
		
		driver.close();
		
	}

	
	
}
