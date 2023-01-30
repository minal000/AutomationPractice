package basictestng;

import org.testng.annotations.Test;

import utilities2.SeleniumUtility;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class VtigerApplicationWithBeforeAfterClass extends SeleniumUtility {
	
  WebDriver driver;
  @BeforeClass
  public void StartUp() {
	  
	  driver= setUp("chrome","https://demo.vtiger.com/vtigercrm/index.php");
  }

  @BeforeMethod
  public void login() {
	
	  driver.findElement(By.xpath("//*[text()='Sign in']"));
  }
  
  @Test(priority =2)
  public void TestVtigerHomePage() {
	  
	  String expectedTitle= " Dashboard ";
	  String actualTitle= getCurrentTitleOfApplication();
	  Assert.assertEquals(actualTitle, expectedTitle, "vtiger homepage not opened or its title got changed");
	  
  }
  
  @Test(priority=1)
  public void TestReportPage() {
	  
	  driver.findElement(By.cssSelector("ul.nav.navbar-nav>li:nth-child(3)>div>a")).click();
	  String expectedTitle = "Reports";
	  String actualTitle = getCurrentTitleOfApplication();
	  Assert.assertEquals(actualTitle, expectedTitle, "Reports page not opened or title get changed");
	  
  }
  
  @AfterMethod
  public void logout() {
	  
	  driver.findElement(By.cssSelector(".userName")).click();
	  driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
	  
	  
  }
  @AfterClass
  public void tearDown() {
	  
	  cleanUp();
  }
  
  /**
   * precodition : open browser and enter vtiger url
   *         condition2 :login
   *                TC1 : validation vtiger home page
   *         Condition2 : logout
   *         Condition2 : login
   *                TC2 : validate Report page
   *         Condition2 : logout
   * PostCodition : close the browser               
   *         TC2 : search SQL and validation search result page
   * postCodition : close the browser        
   */

}
