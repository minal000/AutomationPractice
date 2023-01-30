package basictestng;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities2.SeleniumUtility;

public class GoogleApplicationWithBeforeAfterMethod  extends SeleniumUtility{
	WebDriver driver;
  @BeforeMethod
  public void startUp() {
	  driver= setUp("chrome", "https://www.google.com/");	  
  }
  
  @Test
  public void testGoogleLandingPage() {
	  String expectedTitle = "Google";
	  String actualTitle = getCurrentTitleOfApplication();
	  Assert.assertEquals(actualTitle, expectedTitle, "Google page opened or its title got changed");
	  
  }
  
  @Test
  public void testSearch() {
	 getActiveElement().sendKeys("SQL",Keys.ENTER);
	 Assert.assertTrue(getCurrentTitleOfApplication().contains("SQL"), "SQL is failed");
	  
  }
  
  @AfterMethod
  public void tearDown() {
	  
	  cleanUp();
  }
  
  /**
   * Precondition : open browser and enter the google url
   *             TC1: validation google page
   * Post Codition: close the browser
   * Preconditon : open browser and enter google url
   *             TC2: search SQL and validation search result page
   * post condition : closse the browser                       
   */
}
