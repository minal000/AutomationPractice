package assignments_first_day;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities2.SeleniumUtility;

public class Vtiger {

	public static void main(String[] args) {
		SeleniumUtility s1 = new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome","https://demo.vtiger.com/vtigercrm/index.php");
		
		//click on sign in 
		driver.findElement(By.xpath("//*[text()='Sign in']")).click();
		
		//click on menu
		driver.findElement(By.cssSelector("div#appnavigator>div>span")).click();
		
		//click on marketing
		driver.findElement(By.xpath("//*[text()=' MARKETING']")).click();
		
	//	List<WebElement> marMenu = driver.findElements(By.cssSelector("ul>div>div#mCSB_15_container>li>a"));

	//	marMenu.get(1).click();
		
		//click on campaign
		driver.findElement(By.xpath("//*[text()=' Campaigns']")).click();
		
		//Add Campaign
		driver.findElement(By.id("Campaigns_listView_basicAction_LBL_ADD_RECORD")).click();
		
		//Add campaign Name
		driver.findElement(By.id("Campaigns_editView_fieldName_campaignname")).sendKeys("River");
		
		//click Assigned to
		driver.findElement(By.cssSelector("span#select2-chosen-2")).click();
		
		List<WebElement> list =driver.findElements(By.cssSelector("ul.select2-result-sub>li"));
		list.get(2).click();	
		
		//click on calender
		driver.findElement(By.id("Campaigns_editView_fieldName_closingdate")).click();
		
		//click on next 
//		driver.findElement(By.cssSelector("div.datepicker-days>table>thead>tr>th.next")).click();
		driver.findElement(By.cssSelector("div.datepicker-days>table>thead>tr:nth-child(1)>th:nth-child(3)")).click();
		
		//click on required date
	//	driver.findElement(By.cssSelector("div.datepicker-days>table>tbody>tr:nth-child(3)>td:nth-child(3)")).click();
		driver.findElement(By.cssSelector("div.datepicker-days>table>tbody>tr:nth-child(3)>td:nth-child(3")).click();
		
		//click on save
		driver.findElement(By.xpath("//*[text()='Save']")).click();
		
		//click on Edit
		driver.findElement(By.id("Campaigns_detailView_basicAction_LBL_EDIT")).click();
		
		//click and type target size
		WebElement tar = driver.findElement(By.id("Campaigns_editView_fieldName_targetsize"));
		tar.clear();
		tar.sendKeys("1000");
		
		//click on save
		driver.findElement(By.xpath("//*[text()='Save']")).click();

		//click on more
		driver.findElement(By.xpath("//*[@class='btn btn-default dropdown-toggle']")).click();
		
		List<WebElement> l1 = driver.findElements(By.cssSelector("ul>li#Campaigns_detailView_moreAction_Delete_Campaign>a"));
		l1.get(0).click();
		//driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//*[text()='Yes']")).click();
		
		
		
	}

}
