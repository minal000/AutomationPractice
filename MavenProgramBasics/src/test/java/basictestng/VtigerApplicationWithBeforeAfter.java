package basictestng;

import org.testng.annotations.Test;

import utilities2.SeleniumUtility;

import org.testng.annotations.BeforeMethod;
//import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class VtigerApplicationWithBeforeAfter extends SeleniumUtility{
	
	WebDriver driver;
	
	@BeforeTest
	public void startup() {
		  driver= setUp("chrome","https://demo.vtiger.com/vtigercrm/index.php");
	  }

	@BeforeMethod
	public void login() {
		  driver.findElement(By.xpath("//*[text()='Sign in']")).click();
	  }
	
	@Test(priority=2)
    public void testVtigerHomepage() {
	  
	  String expectedTitle ="Dashboard";
	  String actualTitle = getCurrentTitleOfApplication();
      Assert.assertEquals(actualTitle, expectedTitle, "Vtiger home page not opened or its title got changed");
	  
  }
  
   @Test(priority=1)
   public void testReportPage() {
	  
	  driver.findElement(By.xpath("//a[@title='Reports']")).click();
	  String expectedTitle = "Reports";
	  String actualTitle = getCurrentTitleOfApplication();
	  Assert.assertEquals(actualTitle, expectedTitle, "Report page not opened or its title got changed");
	  
  } 
  
   @AfterMethod
   public void logout() {
	  driver.findElement(By.cssSelector(".userName ")).click();
	  driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
	  
  }

    @AfterTest
   public void tearDown() {
	  
	  cleanUp();
  }

    /**
     * Precondition: open browser and enter vtiger url
     *     Condition2 : login
     *        TC1: validate vtiger homepage
     *     Condition2 : logout
     *     Condition2 : login
     *        TC2 : validate Reports page
     *     Condition2 : logout   
     */
}
