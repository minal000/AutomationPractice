package basictestng;

import org.testng.annotations.Test;

import utilities2.SeleniumUtility;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class GoogleApplicationWithBeforeAfterTest extends SeleniumUtility{
  
	WebDriver driver;
	
  @BeforeTest
  public void startup() {
	  driver = setUp("chrome","https://www.google.com/");
	  
  }
  
  @Test(enabled=true, priority=1)
  public void testGooglePage() {
	  
	  String actualTitle = "Google";
	  String expectedTitle = getCurrentTitleOfApplication();
	  Assert.assertEquals(actualTitle, expectedTitle, "Google search page not opened or its title got changed");
  }
  
    @Test( priority=2)
    public void testSearch() {
    	
//    WebElement s =	driver.findElement(By.name("q"));
//    s.sendKeys("SQL");
//    s.click();
    getActiveElement().sendKeys("SQL",Keys.ENTER);
    Assert.assertTrue(getCurrentTitleOfApplication().contains("SQL"), "SQL search is failed");
  }
    @AfterTest
    public void tearDown() {
	  cleanUp();
  }

}
